/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.io.InputStream;

/**
 * Filters - Filters are used to query requests.
 */

public class Filters {

    /**
     * A list of filters to apply to the query.
     */
    @JsonProperty("filters")
    private java.util.List<Filter> filters;

    /**
     * The maximum number of results to return.
     */
    @JsonProperty("limit")
    private long limit;

    /**
     * The offset to start the query from.
     */
    @JsonProperty("offset")
    private long offset;

    /**
     * The operator to use when combining filters.
     */
    @JsonProperty("operator")
    private String operator;

    public Filters(
            @JsonProperty("filters") java.util.List<Filter> filters,
            @JsonProperty("limit") long limit,
            @JsonProperty("offset") long offset,
            @JsonProperty("operator") String operator) {
        Utils.checkNotNull(filters, "filters");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(operator, "operator");
        this.filters = filters;
        this.limit = limit;
        this.offset = offset;
        this.operator = operator;
    }

    /**
     * A list of filters to apply to the query.
     */
    public java.util.List<Filter> filters() {
        return filters;
    }

    /**
     * The maximum number of results to return.
     */
    public long limit() {
        return limit;
    }

    /**
     * The offset to start the query from.
     */
    public long offset() {
        return offset;
    }

    /**
     * The operator to use when combining filters.
     */
    public String operator() {
        return operator;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A list of filters to apply to the query.
     */
    public Filters withFilters(java.util.List<Filter> filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = filters;
        return this;
    }

    /**
     * The maximum number of results to return.
     */
    public Filters withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * The offset to start the query from.
     */
    public Filters withOffset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    /**
     * The operator to use when combining filters.
     */
    public Filters withOperator(String operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
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
        Filters other = (Filters) o;
        return 
            java.util.Objects.deepEquals(this.filters, other.filters) &&
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.offset, other.offset) &&
            java.util.Objects.deepEquals(this.operator, other.operator);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            filters,
            limit,
            offset,
            operator);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Filters.class,
                "filters", filters,
                "limit", limit,
                "offset", offset,
                "operator", operator);
    }
    
    public final static class Builder {
 
        private java.util.List<Filter> filters;
 
        private Long limit;
 
        private Long offset;
 
        private String operator;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A list of filters to apply to the query.
         */
        public Builder filters(java.util.List<Filter> filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = filters;
            return this;
        }

        /**
         * The maximum number of results to return.
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * The offset to start the query from.
         */
        public Builder offset(long offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        /**
         * The operator to use when combining filters.
         */
        public Builder operator(String operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }        
        
        public Filters build() {
            return new Filters(
                filters,
                limit,
                offset,
                operator);
        }
    }
}

