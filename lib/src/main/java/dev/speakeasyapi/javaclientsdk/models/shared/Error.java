package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error
 * The `Status` type defines a logical error model
**/
public class Error {
    @JsonProperty("message")
    public String message;
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }
    @JsonProperty("status_code")
    public Integer statusCode;
    public Error withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
