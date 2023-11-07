/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

/**
 * QueryParamOp - Configuration for filter operations
 */

public class QueryParamOp {
    /**
     * Whether to AND or OR the filters
     */
    @SpeakeasyMetadata("queryParam:name=and")
    public Boolean and;

    public QueryParamOp withAnd(Boolean and) {
        this.and = and;
        return this;
    }
    
    public QueryParamOp(@JsonProperty("and") Boolean and) {
        this.and = and;
  }
}