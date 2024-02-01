/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class GetApisRequest {

    /**
     * Metadata to filter Apis on
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    private Optional<? extends java.util.Map<String, java.util.List<String>>> metadata;

    /**
     * Configuration for filter operations
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=op")
    private Optional<? extends QueryParamOp> op;

    public GetApisRequest(
            Optional<? extends java.util.Map<String, java.util.List<String>>> metadata,
            Optional<? extends QueryParamOp> op) {
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(op, "op");
        this.metadata = metadata;
        this.op = op;
    }

    /**
     * Metadata to filter Apis on
     */
    public Optional<? extends java.util.Map<String, java.util.List<String>>> metadata() {
        return metadata;
    }

    /**
     * Configuration for filter operations
     */
    public Optional<? extends QueryParamOp> op() {
        return op;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Metadata to filter Apis on
     */
    public GetApisRequest withMetadata(java.util.Map<String, java.util.List<String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }
    
    /**
     * Metadata to filter Apis on
     */
    public GetApisRequest withMetadata(Optional<? extends java.util.Map<String, java.util.List<String>>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Configuration for filter operations
     */
    public GetApisRequest withOp(QueryParamOp op) {
        Utils.checkNotNull(op, "op");
        this.op = Optional.ofNullable(op);
        return this;
    }
    
    /**
     * Configuration for filter operations
     */
    public GetApisRequest withOp(Optional<? extends QueryParamOp> op) {
        Utils.checkNotNull(op, "op");
        this.op = op;
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
        GetApisRequest other = (GetApisRequest) o;
        return 
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.op, other.op);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            metadata,
            op);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetApisRequest.class,
                "metadata", metadata,
                "op", op);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, java.util.List<String>>> metadata = Optional.empty();
 
        private Optional<? extends QueryParamOp> op = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Metadata to filter Apis on
         */
        public Builder metadata(java.util.Map<String, java.util.List<String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }
        
        /**
         * Metadata to filter Apis on
         */
        public Builder metadata(Optional<? extends java.util.Map<String, java.util.List<String>>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * Configuration for filter operations
         */
        public Builder op(QueryParamOp op) {
            Utils.checkNotNull(op, "op");
            this.op = Optional.ofNullable(op);
            return this;
        }
        
        /**
         * Configuration for filter operations
         */
        public Builder op(Optional<? extends QueryParamOp> op) {
            Utils.checkNotNull(op, "op");
            this.op = op;
            return this;
        }        
        
        public GetApisRequest build() {
            return new GetApisRequest(
                metadata,
                op);
        }
    }
}

