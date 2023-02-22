package io.github.openapi_sdks.javaclientsdk.models.operations;



public class GetPluginsResponse {
    public String contentType;
    public GetPluginsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public GetPluginsResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Plugin[] plugins;
    public GetPluginsResponse withPlugins(io.github.openapi_sdks.javaclientsdk.models.shared.Plugin[] plugins) {
        this.plugins = plugins;
        return this;
    }
    
    public Integer statusCode;
    public GetPluginsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
