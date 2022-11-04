package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import x4.a;
/* loaded from: classes.dex */
public class InstantKeyDeserializer extends Jsr310KeyDeserializer {
    public static final InstantKeyDeserializer INSTANCE = new InstantKeyDeserializer();

    private InstantKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public Instant deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return (Instant) DateTimeFormatter.ISO_INSTANT.parse(str, a.f25388a);
        } catch (DateTimeException e10) {
            return (Instant) _handleDateTimeException(deserializationContext, Instant.class, e10, str);
        }
    }
}
