package dev.speakeasyapi.javaclientsdk.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Metadata {
    protected static Object parse(String name, Object metadata, Field field)
            throws IllegalArgumentException, IllegalAccessException {
        SpeakeasyMetadata md = field.getAnnotation(SpeakeasyMetadata.class);
        if (md == null) {
            return null;
        }

        if (md.value() == null || md.value().isBlank()) {
            return null;
        }

        String[] parts = md.value().split(":");
        if (parts.length != 2) {
            return null;
        }

        if (!parts[0].equals(name)) {
            return null;
        }

        Map<String, String> values = new HashMap<>();

        String[] pairs = parts[1].split(",");
        for (String pair : pairs) {
            String[] keyVal = pair.split("=");
            String key = keyVal[0];

            String val = "";
            if (keyVal.length > 1) {
                val = keyVal[1];
            }

            values.put(key, val);
        }

        Field[] fields = metadata.getClass().getFields();

        for (Field f : fields) {
            f.setAccessible(true);
            if (values.containsKey(f.getName())) {
                String val = values.get(f.getName());

                if (f.getType().equals(boolean.class) || f.getType().equals(Boolean.class)) {
                    f.set(metadata, val.equals("true") || val.isBlank());
                } else {
                    f.set(metadata, val);
                }
            }
        }

        return metadata;
    }
}
