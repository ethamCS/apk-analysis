package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.Duration;
/* loaded from: classes.dex */
public class DurationKeyDeserializer extends Jsr310KeyDeserializer {
    public static final DurationKeyDeserializer INSTANCE = new DurationKeyDeserializer();

    private DurationKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public Duration deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return Duration.parse(str);
        } catch (DateTimeException e10) {
            return (Duration) _handleDateTimeException(deserializationContext, Duration.class, e10, str);
        }
    }
}
