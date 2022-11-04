package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class LocalDateKeyDeserializer extends Jsr310KeyDeserializer {
    public static final LocalDateKeyDeserializer INSTANCE = new LocalDateKeyDeserializer();

    private LocalDateKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public LocalDate deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return LocalDate.parse(str, DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (DateTimeException e10) {
            return (LocalDate) _handleDateTimeException(deserializationContext, LocalDate.class, e10, str);
        }
    }
}
