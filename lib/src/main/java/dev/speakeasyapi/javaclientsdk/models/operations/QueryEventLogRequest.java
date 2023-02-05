package dev.speakeasyapi.javaclientsdk.models.operations;



public class QueryEventLogRequest {
    public QueryEventLogQueryParams queryParams;
    public QueryEventLogRequest withQueryParams(QueryEventLogQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
