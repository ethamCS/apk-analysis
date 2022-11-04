package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class LocalDateTimeKeyDeserializer extends Jsr310KeyDeserializer {
    public static final LocalDateTimeKeyDeserializer INSTANCE = new LocalDateTimeKeyDeserializer();

    private LocalDateTimeKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public LocalDateTime deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return LocalDateTime.parse(str, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        } catch (DateTimeException e10) {
            return (LocalDateTime) _handleDateTimeException(deserializationContext, LocalDateTime.class, e10, str);
        }
    }
}
