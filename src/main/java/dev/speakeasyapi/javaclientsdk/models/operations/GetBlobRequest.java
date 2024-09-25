/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetBlobRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=digest")
    private String digest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=namespace_name")
    private String namespaceName;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organization_slug")
    private String organizationSlug;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspace_slug")
    private String workspaceSlug;

    @JsonCreator
    public GetBlobRequest(
            String digest,
            String namespaceName,
            String organizationSlug,
            String workspaceSlug) {
        Utils.checkNotNull(digest, "digest");
        Utils.checkNotNull(namespaceName, "namespaceName");
        Utils.checkNotNull(organizationSlug, "organizationSlug");
        Utils.checkNotNull(workspaceSlug, "workspaceSlug");
        this.digest = digest;
        this.namespaceName = namespaceName;
        this.organizationSlug = organizationSlug;
        this.workspaceSlug = workspaceSlug;
    }

    @JsonIgnore
    public String digest() {
        return digest;
    }

    @JsonIgnore
    public String namespaceName() {
        return namespaceName;
    }

    @JsonIgnore
    public String organizationSlug() {
        return organizationSlug;
    }

    @JsonIgnore
    public String workspaceSlug() {
        return workspaceSlug;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetBlobRequest withDigest(String digest) {
        Utils.checkNotNull(digest, "digest");
        this.digest = digest;
        return this;
    }

    public GetBlobRequest withNamespaceName(String namespaceName) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        this.namespaceName = namespaceName;
        return this;
    }

    public GetBlobRequest withOrganizationSlug(String organizationSlug) {
        Utils.checkNotNull(organizationSlug, "organizationSlug");
        this.organizationSlug = organizationSlug;
        return this;
    }

    public GetBlobRequest withWorkspaceSlug(String workspaceSlug) {
        Utils.checkNotNull(workspaceSlug, "workspaceSlug");
        this.workspaceSlug = workspaceSlug;
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
        GetBlobRequest other = (GetBlobRequest) o;
        return 
            Objects.deepEquals(this.digest, other.digest) &&
            Objects.deepEquals(this.namespaceName, other.namespaceName) &&
            Objects.deepEquals(this.organizationSlug, other.organizationSlug) &&
            Objects.deepEquals(this.workspaceSlug, other.workspaceSlug);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            digest,
            namespaceName,
            organizationSlug,
            workspaceSlug);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBlobRequest.class,
                "digest", digest,
                "namespaceName", namespaceName,
                "organizationSlug", organizationSlug,
                "workspaceSlug", workspaceSlug);
    }
    
    public final static class Builder {
 
        private String digest;
 
        private String namespaceName;
 
        private String organizationSlug;
 
        private String workspaceSlug;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder digest(String digest) {
            Utils.checkNotNull(digest, "digest");
            this.digest = digest;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            Utils.checkNotNull(namespaceName, "namespaceName");
            this.namespaceName = namespaceName;
            return this;
        }

        public Builder organizationSlug(String organizationSlug) {
            Utils.checkNotNull(organizationSlug, "organizationSlug");
            this.organizationSlug = organizationSlug;
            return this;
        }

        public Builder workspaceSlug(String workspaceSlug) {
            Utils.checkNotNull(workspaceSlug, "workspaceSlug");
            this.workspaceSlug = workspaceSlug;
            return this;
        }
        
        public GetBlobRequest build() {
            return new GetBlobRequest(
                digest,
                namespaceName,
                organizationSlug,
                workspaceSlug);
        }
    }
}
