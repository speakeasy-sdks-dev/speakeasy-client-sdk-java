/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
/**
 * AccessToken - An AccessToken is a token that can be used to authenticate with the Speakeasy API.
 */

public class AccessToken {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("claims")
    private Claims claims;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flags")
    private Optional<? extends java.util.List<FeatureFlag>> featureFlags;

    @JsonProperty("user")
    private AccessTokenUser user;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workspaces")
    private Optional<? extends java.util.List<Workspaces>> workspaces;

    @JsonCreator
    public AccessToken(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("claims") Claims claims,
            @JsonProperty("feature_flags") Optional<? extends java.util.List<FeatureFlag>> featureFlags,
            @JsonProperty("user") AccessTokenUser user,
            @JsonProperty("workspaces") Optional<? extends java.util.List<Workspaces>> workspaces) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(claims, "claims");
        Utils.checkNotNull(featureFlags, "featureFlags");
        Utils.checkNotNull(user, "user");
        Utils.checkNotNull(workspaces, "workspaces");
        this.accessToken = accessToken;
        this.claims = claims;
        this.featureFlags = featureFlags;
        this.user = user;
        this.workspaces = workspaces;
    }
    
    public AccessToken(
            String accessToken,
            Claims claims,
            AccessTokenUser user) {
        this(accessToken, claims, Optional.empty(), user, Optional.empty());
    }

    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public Claims claims() {
        return claims;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<FeatureFlag>> featureFlags() {
        return (Optional<java.util.List<FeatureFlag>>) featureFlags;
    }

    @JsonIgnore
    public AccessTokenUser user() {
        return user;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<Workspaces>> workspaces() {
        return (Optional<java.util.List<Workspaces>>) workspaces;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccessToken withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    public AccessToken withClaims(Claims claims) {
        Utils.checkNotNull(claims, "claims");
        this.claims = claims;
        return this;
    }

    public AccessToken withFeatureFlags(java.util.List<FeatureFlag> featureFlags) {
        Utils.checkNotNull(featureFlags, "featureFlags");
        this.featureFlags = Optional.ofNullable(featureFlags);
        return this;
    }

    public AccessToken withFeatureFlags(Optional<? extends java.util.List<FeatureFlag>> featureFlags) {
        Utils.checkNotNull(featureFlags, "featureFlags");
        this.featureFlags = featureFlags;
        return this;
    }

    public AccessToken withUser(AccessTokenUser user) {
        Utils.checkNotNull(user, "user");
        this.user = user;
        return this;
    }

    public AccessToken withWorkspaces(java.util.List<Workspaces> workspaces) {
        Utils.checkNotNull(workspaces, "workspaces");
        this.workspaces = Optional.ofNullable(workspaces);
        return this;
    }

    public AccessToken withWorkspaces(Optional<? extends java.util.List<Workspaces>> workspaces) {
        Utils.checkNotNull(workspaces, "workspaces");
        this.workspaces = workspaces;
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
        AccessToken other = (AccessToken) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.claims, other.claims) &&
            java.util.Objects.deepEquals(this.featureFlags, other.featureFlags) &&
            java.util.Objects.deepEquals(this.user, other.user) &&
            java.util.Objects.deepEquals(this.workspaces, other.workspaces);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            claims,
            featureFlags,
            user,
            workspaces);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccessToken.class,
                "accessToken", accessToken,
                "claims", claims,
                "featureFlags", featureFlags,
                "user", user,
                "workspaces", workspaces);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private Claims claims;
 
        private Optional<? extends java.util.List<FeatureFlag>> featureFlags = Optional.empty();
 
        private AccessTokenUser user;
 
        private Optional<? extends java.util.List<Workspaces>> workspaces = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        public Builder claims(Claims claims) {
            Utils.checkNotNull(claims, "claims");
            this.claims = claims;
            return this;
        }

        public Builder featureFlags(java.util.List<FeatureFlag> featureFlags) {
            Utils.checkNotNull(featureFlags, "featureFlags");
            this.featureFlags = Optional.ofNullable(featureFlags);
            return this;
        }

        public Builder featureFlags(Optional<? extends java.util.List<FeatureFlag>> featureFlags) {
            Utils.checkNotNull(featureFlags, "featureFlags");
            this.featureFlags = featureFlags;
            return this;
        }

        public Builder user(AccessTokenUser user) {
            Utils.checkNotNull(user, "user");
            this.user = user;
            return this;
        }

        public Builder workspaces(java.util.List<Workspaces> workspaces) {
            Utils.checkNotNull(workspaces, "workspaces");
            this.workspaces = Optional.ofNullable(workspaces);
            return this;
        }

        public Builder workspaces(Optional<? extends java.util.List<Workspaces>> workspaces) {
            Utils.checkNotNull(workspaces, "workspaces");
            this.workspaces = workspaces;
            return this;
        }
        
        public AccessToken build() {
            return new AccessToken(
                accessToken,
                claims,
                featureFlags,
                user,
                workspaces);
        }
    }
}

