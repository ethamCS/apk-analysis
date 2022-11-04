package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.ZoneOffset;
/* loaded from: classes.dex */
public class ZoneOffsetKeyDeserializer extends Jsr310KeyDeserializer {
    public static final ZoneOffsetKeyDeserializer INSTANCE = new ZoneOffsetKeyDeserializer();

    private ZoneOffsetKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public ZoneOffset deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return ZoneOffset.of(str);
        } catch (DateTimeException e10) {
            return (ZoneOffset) _handleDateTimeException(deserializationContext, ZoneOffset.class, e10, str);
        }
    }
}
