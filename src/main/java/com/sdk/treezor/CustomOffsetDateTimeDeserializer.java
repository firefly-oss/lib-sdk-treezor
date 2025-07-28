package com.sdk.treezor;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class CustomOffsetDateTimeDeserializer extends JsonDeserializer<OffsetDateTime> {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public OffsetDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String dateString = p.getText();

        // Handle the special case of '0000-00-00 00:00:00'
        if (dateString.equals("0000-00-00 00:00:00")) {
            return null; // Return null for invalid date
        }

        try {
            // Parse the date string without timezone information
            LocalDateTime localDateTime = LocalDateTime.parse(dateString, formatter);
            // Convert to OffsetDateTime with UTC timezone
            return OffsetDateTime.of(localDateTime, ZoneOffset.UTC);
        } catch (Exception e) {
            // If the custom format fails, try the default deserialization
            return OffsetDateTime.parse(dateString);
        }
    }
}
