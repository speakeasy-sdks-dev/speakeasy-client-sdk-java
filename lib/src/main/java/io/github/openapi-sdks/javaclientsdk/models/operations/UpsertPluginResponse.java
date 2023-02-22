package io.github.openapi-sdks.javaclientsdk.models.operations;



public class UpsertPluginResponse {
    public String contentType;
    public UpsertPluginResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi-sdks.javaclientsdk.models.shared.Error error;
    public UpsertPluginResponse withError(io.github.openapi-sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public io.github.openapi-sdks.javaclientsdk.models.shared.Plugin plugin;
    public UpsertPluginResponse withPlugin(io.github.openapi-sdks.javaclientsdk.models.shared.Plugin plugin) {
        this.plugin = plugin;
        return this;
    }
    
    public Integer statusCode;
    public UpsertPluginResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
