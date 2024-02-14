/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.utils;

import java.lang.reflect.Field;

class HeaderMetadata {

    String style = "simple";
    boolean explode;
    String name;

    private HeaderMetadata() {
    }

    // headerParam:style=simple,explode=false,name=apiID
    static HeaderMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        return Metadata.parse("header", new HeaderMetadata(), field);
    }
}
