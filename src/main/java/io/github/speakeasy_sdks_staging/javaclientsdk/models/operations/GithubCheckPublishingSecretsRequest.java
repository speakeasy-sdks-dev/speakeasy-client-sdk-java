/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GithubCheckPublishingSecretsRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=generate_gen_lock_id")
    private String generateGenLockId;

    @JsonCreator
    public GithubCheckPublishingSecretsRequest(
            String generateGenLockId) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        this.generateGenLockId = generateGenLockId;
    }

    @JsonIgnore
    public String generateGenLockId() {
        return generateGenLockId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GithubCheckPublishingSecretsRequest withGenerateGenLockId(String generateGenLockId) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        this.generateGenLockId = generateGenLockId;
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
        GithubCheckPublishingSecretsRequest other = (GithubCheckPublishingSecretsRequest) o;
        return 
            Objects.deepEquals(this.generateGenLockId, other.generateGenLockId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            generateGenLockId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GithubCheckPublishingSecretsRequest.class,
                "generateGenLockId", generateGenLockId);
    }
    
    public final static class Builder {
 
        private String generateGenLockId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder generateGenLockId(String generateGenLockId) {
            Utils.checkNotNull(generateGenLockId, "generateGenLockId");
            this.generateGenLockId = generateGenLockId;
            return this;
        }
        
        public GithubCheckPublishingSecretsRequest build() {
            return new GithubCheckPublishingSecretsRequest(
                generateGenLockId);
        }
    }
}
