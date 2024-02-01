/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.utils;

import java.lang.reflect.Field;

class RequestMetadata {

    String mediaType = "application/octet-stream";

    private RequestMetadata() {
    }

    // request:mediaType=multipart/form-data
    static RequestMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        return Metadata.parse("request", new RequestMetadata(), field);
    }
}
