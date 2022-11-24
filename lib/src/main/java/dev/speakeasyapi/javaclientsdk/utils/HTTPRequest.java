package dev.speakeasyapi.javaclientsdk.utils;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public class HTTPRequest {
    private String baseURL;
    private String method;
    private SerializedBody body;

    private List<NameValuePair> queryParams = new ArrayList<NameValuePair>();
    private Map<String, List<String>> headers = new HashMap<String, List<String>>();

    public void setMethod(String method) {
        this.method = method;
    }

    public void setURL(String url) {
        this.baseURL = url;
    }

    public void setBody(SerializedBody body) {
        this.body = body;
    }

    public void addHeader(String key, String value) {
        List<String> headerValues = this.headers.get(key);
        if (headerValues == null) {
            headerValues = new ArrayList<String>();
        }

        headerValues.add(value);
        this.headers.put(key, headerValues);
    }

    public void addQueryParam(NameValuePair param) {
        this.queryParams.add(param);
    }

    public HttpRequest build() {
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder();

        BodyPublisher bodyPublisher = null;
        if (this.body != null) {
            bodyPublisher = this.body.body;
            requestBuilder.header("Content-Type", this.body.contentType);
        }

        requestBuilder.method(this.method, bodyPublisher);
        requestBuilder.uri(resolveURL());

        for (Map.Entry<String, List<String>> entry : this.headers.entrySet()) {
            for (String value : entry.getValue()) {
                requestBuilder.header(entry.getKey(), value);
            }
        }

        return requestBuilder.build();
    }

    private URI resolveURL() {
        String url = this.baseURL + "?" + URLEncodedUtils.format(this.queryParams, StandardCharsets.UTF_8);
        return URI.create(url);
    }
}