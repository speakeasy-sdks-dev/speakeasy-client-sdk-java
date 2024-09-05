/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * OpenapiDiffBumpType - Bump type of the lock file (calculated semver delta, or a custom change (manual release))
 */
public enum OpenapiDiffBumpType {
    MAJOR("major"),
    MINOR("minor"),
    PATCH("patch"),
    NONE("none");

    @JsonValue
    private final String value;

    private OpenapiDiffBumpType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
