package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.Year;
/* loaded from: classes.dex */
public class YearKeyDeserializer extends Jsr310KeyDeserializer {
    public static final YearKeyDeserializer INSTANCE = new YearKeyDeserializer();

    protected YearKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public Year deserialize(String str, DeserializationContext deserializationContext) {
        Object _handleDateTimeException;
        try {
            return Year.of(Integer.parseInt(str));
        } catch (DateTimeException e10) {
            _handleDateTimeException = _handleDateTimeException(deserializationContext, Year.class, e10, str);
            return (Year) _handleDateTimeException;
        } catch (NumberFormatException e11) {
            _handleDateTimeException = _handleDateTimeException(deserializationContext, Year.class, new DateTimeException("Number format exception", e11), str);
            return (Year) _handleDateTimeException;
        }
    }
}
