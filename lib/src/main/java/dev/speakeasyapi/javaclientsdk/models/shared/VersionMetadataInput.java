package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VersionMetadataInput
 * A set of keys and associated values, attached to a particular version of an Api.
**/
public class VersionMetadataInput {
    @JsonProperty("meta_key")
    public String metaKey;

    @JsonProperty("meta_value")
    public String metaValue;
}