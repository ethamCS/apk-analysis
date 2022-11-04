package com.fasterxml.jackson.datatype.jsr310.deser.key;

import com.fasterxml.jackson.databind.DeserializationContext;
import j$.time.DateTimeException;
import j$.time.MonthDay;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
/* loaded from: classes.dex */
public class MonthDayKeyDeserializer extends Jsr310KeyDeserializer {
    public static final MonthDayKeyDeserializer INSTANCE = new MonthDayKeyDeserializer();
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().appendLiteral("--").appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).toFormatter();

    private MonthDayKeyDeserializer() {
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer
    public MonthDay deserialize(String str, DeserializationContext deserializationContext) {
        try {
            return MonthDay.parse(str, PARSER);
        } catch (DateTimeException e10) {
            return (MonthDay) _handleDateTimeException(deserializationContext, MonthDay.class, e10, str);
        }
    }
}
