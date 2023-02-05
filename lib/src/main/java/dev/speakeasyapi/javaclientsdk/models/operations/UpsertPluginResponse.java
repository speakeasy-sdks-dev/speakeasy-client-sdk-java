package dev.speakeasyapi.javaclientsdk.models.operations;



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
    public Long statusCode;
    public UpsertPluginResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
