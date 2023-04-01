/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GenerateOpenApiSpecDiff - OK
 */
public class GenerateOpenApiSpecDiff {
    @JsonProperty("current_schema")
    public String currentSchema;
    public GenerateOpenApiSpecDiff withCurrentSchema(String currentSchema) {
        this.currentSchema = currentSchema;
        return this;
    }
    
    @JsonProperty("new_schema")
    public String newSchema;
    public GenerateOpenApiSpecDiff withNewSchema(String newSchema) {
        this.newSchema = newSchema;
        return this;
    }
    
}
