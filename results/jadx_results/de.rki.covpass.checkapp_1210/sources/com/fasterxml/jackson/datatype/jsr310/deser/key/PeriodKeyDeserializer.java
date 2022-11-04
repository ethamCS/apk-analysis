package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.Period;
/* loaded from: classes.dex */
public class PeriodKeyDeserializer extends Jsr310KeyDeserializer {
    public static final PeriodKeyDeserializer INSTANCE = new PeriodKeyDeserializer();

    private PeriodKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public Period deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return Period.parse(str);
        } catch (DateTimeException e10) {
            return (Period) _handleDateTimeException(deserializationContext, Period.class, e10, str);
        }
    }
}
