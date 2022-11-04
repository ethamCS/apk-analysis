package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class OffsetDateTimeKeyDeserializer extends Jsr310KeyDeserializer {
    public static final OffsetDateTimeKeyDeserializer INSTANCE = new OffsetDateTimeKeyDeserializer();

    private OffsetDateTimeKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public OffsetDateTime deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return OffsetDateTime.parse(str, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        } catch (DateTimeException e10) {
            return (OffsetDateTime) _handleDateTimeException(deserializationContext, OffsetDateTime.class, e10, str);
        }
    }
}
