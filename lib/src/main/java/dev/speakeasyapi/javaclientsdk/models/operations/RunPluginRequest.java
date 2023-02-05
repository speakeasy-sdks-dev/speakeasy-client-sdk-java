package dev.speakeasyapi.javaclientsdk.models.operations;



public class RunPluginRequest {
    public RunPluginPathParams pathParams;
    public RunPluginRequest withPathParams(RunPluginPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public RunPluginQueryParams queryParams;
    public RunPluginRequest withQueryParams(RunPluginQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
