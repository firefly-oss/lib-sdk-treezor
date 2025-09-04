/*
 * Copyright 2025 Firefly Software Solutions Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


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