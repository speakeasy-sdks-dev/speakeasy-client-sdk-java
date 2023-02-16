package .models.operations;



public class GetPluginsResponse {
    public String contentType;
    public GetPluginsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public .models.shared.Error error;
    public GetPluginsResponse withError(.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public .models.shared.Plugin[] plugins;
    public GetPluginsResponse withPlugins(.models.shared.Plugin[] plugins) {
        this.plugins = plugins;
        return this;
    }
    
    public Integer statusCode;
    public GetPluginsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
