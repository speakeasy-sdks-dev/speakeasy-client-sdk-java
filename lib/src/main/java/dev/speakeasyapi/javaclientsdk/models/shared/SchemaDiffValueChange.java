/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SchemaDiffValueChange {
    /**
     * Represents the previous value of the element.
     */
    @JsonProperty("From")
    public String from;

    public SchemaDiffValueChange withFrom(String from) {
        this.from = from;
        return this;
    }
    
    /**
     * Represents the current value of the element.
     */
    @JsonProperty("To")
    public String to;

    public SchemaDiffValueChange withTo(String to) {
        this.to = to;
        return this;
    }
    
    public SchemaDiffValueChange(@JsonProperty("From") String from, @JsonProperty("To") String to) {
        this.from = from;
        this.to = to;
  }
}
