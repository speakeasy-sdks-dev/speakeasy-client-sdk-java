package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error
 * The `Status` type defines a logical error model
**/
public class Error {
    @JsonProperty("message")
    public String message;

    @JsonProperty("status_code")
    public Integer statusCode;
}