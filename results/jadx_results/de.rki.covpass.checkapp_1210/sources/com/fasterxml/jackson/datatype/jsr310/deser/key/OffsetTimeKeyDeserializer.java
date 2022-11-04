package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.OffsetTime;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class OffsetTimeKeyDeserializer extends Jsr310KeyDeserializer {
    public static final OffsetTimeKeyDeserializer INSTANCE = new OffsetTimeKeyDeserializer();

    private OffsetTimeKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public OffsetTime deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return OffsetTime.parse(str, DateTimeFormatter.ISO_OFFSET_TIME);
        } catch (DateTimeException e10) {
            return (OffsetTime) _handleDateTimeException(deserializationContext, OffsetTime.class, e10, str);
        }
    }
}
