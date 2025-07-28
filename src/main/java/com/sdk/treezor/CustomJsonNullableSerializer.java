package com.sdk.treezor;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.openapitools.jackson.nullable.JsonNullable;

import java.io.IOException;

public class CustomJsonNullableSerializer extends JsonSerializer<JsonNullable<?>> {
    @Override
    public void serialize(JsonNullable<?> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value.isPresent()) {
            Object content = value.get();
            if (content == null) {
                gen.writeNull();
            } else {
                gen.writeObject(content);
            }
        } else {
            gen.writeNull(); // or gen.writeOmittedField() to omit the field
        }
    }
}