package .models.operations;



public class UpsertPluginResponse {
    public String contentType;
    public UpsertPluginResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public UpsertPluginResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public .models.shared.Plugin plugin;
    public UpsertPluginResponse withPlugin(.models.shared.Plugin plugin) {
        this.plugin = plugin;
        return this;
    }
    
    public Integer statusCode;
    public UpsertPluginResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
