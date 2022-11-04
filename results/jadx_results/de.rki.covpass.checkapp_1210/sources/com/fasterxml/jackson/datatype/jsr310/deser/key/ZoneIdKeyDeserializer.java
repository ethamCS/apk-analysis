package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.ZoneId;
/* loaded from: classes.dex */
public class ZoneIdKeyDeserializer extends Jsr310KeyDeserializer {
    public static final ZoneIdKeyDeserializer INSTANCE = new ZoneIdKeyDeserializer();

    private ZoneIdKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    protected Object deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return ZoneId.of(str);
        } catch (DateTimeException e10) {
            return _handleDateTimeException(deserializationContext, ZoneId.class, e10, str);
        }
    }
}
