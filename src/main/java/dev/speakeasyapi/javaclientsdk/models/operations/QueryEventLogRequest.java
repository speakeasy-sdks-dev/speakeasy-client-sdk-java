/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.Filters;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class QueryEventLogRequest {

    /**
     * The filter to apply to the query.
     */
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    private Optional<? extends Filters> filters;

    @JsonCreator
    public QueryEventLogRequest(
            Optional<? extends Filters> filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = filters;
    }
    
    public QueryEventLogRequest() {
        this(Optional.empty());
    }

    /**
     * The filter to apply to the query.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Filters> filters() {
        return (Optional<Filters>) filters;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The filter to apply to the query.
     */
    public QueryEventLogRequest withFilters(Filters filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = Optional.ofNullable(filters);
        return this;
    }

    /**
     * The filter to apply to the query.
     */
    public QueryEventLogRequest withFilters(Optional<? extends Filters> filters) {
        Utils.checkNotNull(filters, "filters");
        this.filters = filters;
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
        QueryEventLogRequest other = (QueryEventLogRequest) o;
        return 
            Objects.deepEquals(this.filters, other.filters);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            filters);
    }
    
    @Override
    public String toString() {
        return Utils.toString(QueryEventLogRequest.class,
                "filters", filters);
    }
    
    public final static class Builder {
 
        private Optional<? extends Filters> filters = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The filter to apply to the query.
         */
        public Builder filters(Filters filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = Optional.ofNullable(filters);
            return this;
        }

        /**
         * The filter to apply to the query.
         */
        public Builder filters(Optional<? extends Filters> filters) {
            Utils.checkNotNull(filters, "filters");
            this.filters = filters;
            return this;
        }
        
        public QueryEventLogRequest build() {
            return new QueryEventLogRequest(
                filters);
        }
    }
}
