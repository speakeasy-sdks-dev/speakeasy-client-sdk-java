/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ValueChange {

    /**
     * Represents the previous value of the element.
     */
    @JsonProperty("From")
    private String from;

    /**
     * Represents the current value of the element.
     */
    @JsonProperty("To")
    private String to;

    @JsonCreator
    public ValueChange(
            @JsonProperty("From") String from,
            @JsonProperty("To") String to) {
        Utils.checkNotNull(from, "from");
        Utils.checkNotNull(to, "to");
        this.from = from;
        this.to = to;
    }

    /**
     * Represents the previous value of the element.
     */
    @JsonIgnore
    public String from() {
        return from;
    }

    /**
     * Represents the current value of the element.
     */
    @JsonIgnore
    public String to() {
        return to;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Represents the previous value of the element.
     */
    public ValueChange withFrom(String from) {
        Utils.checkNotNull(from, "from");
        this.from = from;
        return this;
    }

    /**
     * Represents the current value of the element.
     */
    public ValueChange withTo(String to) {
        Utils.checkNotNull(to, "to");
        this.to = to;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueChange other = (ValueChange) o;
        return 
            java.util.Objects.deepEquals(this.from, other.from) &&
            java.util.Objects.deepEquals(this.to, other.to);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            from,
            to);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ValueChange.class,
                "from", from,
                "to", to);
    }
    
    public final static class Builder {
 
        private String from;
 
        private String to;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Represents the previous value of the element.
         */
        public Builder from(String from) {
            Utils.checkNotNull(from, "from");
            this.from = from;
            return this;
        }

        /**
         * Represents the current value of the element.
         */
        public Builder to(String to) {
            Utils.checkNotNull(to, "to");
            this.to = to;
            return this;
        }
        
        public ValueChange build() {
            return new ValueChange(
                from,
                to);
        }
    }
}

