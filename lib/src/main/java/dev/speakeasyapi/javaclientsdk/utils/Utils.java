package dev.speakeasyapi.javaclientsdk.utils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.NameValuePair;

import com.fasterxml.jackson.core.JsonProcessingException;

public final class Utils {

    public static String generateURL(String baseURL, String path)
            throws IllegalArgumentException, IllegalAccessException {
        return generateURL(baseURL, path, null);
    }

    public static String generateURL(String baseURL, String path, Object params)
            throws IllegalArgumentException, IllegalAccessException {
        if (baseURL != null && baseURL.endsWith("/")) {
            baseURL = baseURL.split("/")[0];
        }

        Map<String, String> pathParams = new HashMap<>();

        if (params != null) {
            Field[] fields = params.getClass().getDeclaredFields();

            for (Field field : fields) {
                PathParamsMetadata pathParamsMetadata = PathParamsMetadata.parse(field);
                if (pathParamsMetadata == null) {
                    continue;
                }

                switch (pathParamsMetadata.style) {
                    case "simple":
                        switch (Types.getType(field.getType())) {
                            case ARRAY:
                                Object[] array = (Object[]) field.get(params);
                                if (array.length == 0) {
                                    continue;
                                }

                                pathParams.put(pathParamsMetadata.name,
                                        String.join(",",
                                                Arrays.asList(array).stream().map(v -> String.valueOf(v)).toList()));
                                break;
                            case MAP:
                                Map<?, ?> map = (Map<?, ?>) field.get(params);
                                if (map.size() == 0) {
                                    continue;
                                }

                                pathParams.put(pathParamsMetadata.name,
                                        String.join(",", map.entrySet().stream().map(e -> {
                                            if (pathParamsMetadata.explode) {
                                                return String.format("%s=%s", String.valueOf(e.getKey()),
                                                        String.valueOf(e.getValue()));
                                            } else {
                                                return String.format("%s,%s", String.valueOf(e.getKey()),
                                                        String.valueOf(e.getValue()));
                                            }
                                        }).toList()));
                            case PRIMITIVE:
                                pathParams.put(pathParamsMetadata.name, String.valueOf(field.get(params)));
                                break;
                            case OBJECT:
                                Object value = field.get(params);

                                if (value == null) {
                                    continue;
                                }

                                List<String> values = new ArrayList<String>();

                                Field[] valueFields = params.getClass().getDeclaredFields();
                                for (Field valueField : valueFields) {
                                    PathParamsMetadata valuePathParamsMetadata = PathParamsMetadata.parse(valueField);
                                    if (valuePathParamsMetadata == null) {
                                        continue;
                                    }

                                    if (pathParamsMetadata.explode) {
                                        values.add(String.format("%s=%s", valuePathParamsMetadata.name,
                                                String.valueOf(valueField.get(value))));
                                    } else {
                                        values.add(String.format("%s,%s", valuePathParamsMetadata.name,
                                                String.valueOf(valueField.get(value))));
                                    }
                                }

                                pathParams.put(pathParamsMetadata.name, String.join(",", values));
                                break;
                        }
                }
            }
        }

        return baseURL + replaceParameters(path, pathParams);
    }

    public static boolean matchContentType(String contentType, String pattern) {
        if (contentType == null || contentType.isBlank()) {
            return false;
        }

        if (contentType.equals(pattern) || pattern.equals("*") || pattern.equals("*/*")) {
            return true;
        }

        String[] contentTypeParts = contentType.split(";");
        if (contentTypeParts.length == 0) {
            return false;
        }
        String mediaType = contentTypeParts[0];

        if (mediaType.equals(pattern)) {
            return true;
        }

        String[] mediaTypeParts = mediaType.split("/");
        if (mediaTypeParts.length == 2) {
            if (String.format("%s/*", mediaTypeParts[0]).equals(pattern)
                    || String.format("*/%s", mediaTypeParts[1]).equals(pattern)) {
                return true;
            }
        }

        return false;
    }

    public static SerializedBody serializeRequestBody(Object request) throws NoSuchFieldException,
            IllegalArgumentException, IllegalAccessException, UnsupportedOperationException, IOException {
        return RequestBody.serialize(request);
    }

    public static List<NameValuePair> getQueryParams(Object params)
            throws JsonProcessingException, IllegalAccessException {
        return QueryParameters.parseQueryParams(params);
    }

    public static HTTPClient configureSecurityClient(HTTPClient client, Object security) throws Exception {
        return Security.createClient(client, security);
    }

    public static String replaceParameters(String url, Map<String, String> params) {
        StringBuilder sb = new StringBuilder();

        Pattern p = Pattern.compile("({.*?})");
        Matcher m = p.matcher(url);

        while (m.find()) {
            String match = m.group(1);
            String key = match.substring(1, match.length() - 1);
            String value = params.get(key);
            if (value != null) {
                m.appendReplacement(sb, value);
            }
        }
        m.appendTail(sb);

        return sb.toString();
    }

    private Utils() {
    }
}