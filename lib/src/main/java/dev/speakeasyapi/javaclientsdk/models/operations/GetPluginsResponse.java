package dev.speakeasyapi.javaclientsdk.models.operations;

import java.time.OffsetDateTime;

public class GetPluginsResponse {
    public String contentType;
    public GetPluginsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetPluginsResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    public dev.speakeasyapi.javaclientsdk.models.shared.Plugin[] plugins;
    public GetPluginsResponse withPlugins(dev.speakeasyapi.javaclientsdk.models.shared.Plugin[] plugins) {
        this.plugins = plugins;
        return this;
    }
    public Long statusCode;
    public GetPluginsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
