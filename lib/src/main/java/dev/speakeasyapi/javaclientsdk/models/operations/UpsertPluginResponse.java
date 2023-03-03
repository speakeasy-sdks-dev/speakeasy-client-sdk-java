package dev.speakeasyapi.javaclientsdk.models.operations;

import java.net.http.HttpResponse;

public class UpsertPluginResponse {
    public String contentType;
    public UpsertPluginResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public UpsertPluginResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Plugin plugin;
    public UpsertPluginResponse withPlugin(dev.speakeasyapi.javaclientsdk.models.shared.Plugin plugin) {
        this.plugin = plugin;
        return this;
    }
    
    public Integer statusCode;
    public UpsertPluginResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public UpsertPluginResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
