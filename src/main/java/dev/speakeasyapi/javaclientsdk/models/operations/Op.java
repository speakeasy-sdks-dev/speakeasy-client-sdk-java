/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Op - Configuration for filter operations
 */

public class Op {

    /**
     * Whether to AND or OR the filters
     */
    @SpeakeasyMetadata("queryParam:name=and")
    private boolean and;

    @JsonCreator
    public Op(
            boolean and) {
        Utils.checkNotNull(and, "and");
        this.and = and;
    }

    /**
     * Whether to AND or OR the filters
     */
    @JsonIgnore
    public boolean and() {
        return and;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether to AND or OR the filters
     */
    public Op withAnd(boolean and) {
        Utils.checkNotNull(and, "and");
        this.and = and;
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
        Op other = (Op) o;
        return 
            Objects.deepEquals(this.and, other.and);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            and);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Op.class,
                "and", and);
    }
    
    public final static class Builder {
 
        private Boolean and;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether to AND or OR the filters
         */
        public Builder and(boolean and) {
            Utils.checkNotNull(and, "and");
            this.and = and;
            return this;
        }
        
        public Op build() {
            return new Op(
                and);
        }
    }
}
