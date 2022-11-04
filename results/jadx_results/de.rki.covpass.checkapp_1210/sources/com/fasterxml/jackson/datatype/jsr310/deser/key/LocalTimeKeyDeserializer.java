package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class LocalTimeKeyDeserializer extends Jsr310KeyDeserializer {
    public static final LocalTimeKeyDeserializer INSTANCE = new LocalTimeKeyDeserializer();

    private LocalTimeKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public LocalTime deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return LocalTime.parse(str, DateTimeFormatter.ISO_LOCAL_TIME);
        } catch (DateTimeException e10) {
            return (LocalTime) _handleDateTimeException(deserializationContext, LocalTime.class, e10, str);
        }
    }
}
