package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class ZonedDateTimeKeyDeserializer extends Jsr310KeyDeserializer {
    public static final ZonedDateTimeKeyDeserializer INSTANCE = new ZonedDateTimeKeyDeserializer();

    private ZonedDateTimeKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public ZonedDateTime deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return ZonedDateTime.parse(str, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        } catch (DateTimeException e10) {
            return (ZonedDateTime) _handleDateTimeException(deserializationContext, ZonedDateTime.class, e10, str);
        }
    }
}
