package com.fasterxml.jackson.datatype.jsr310.ser.key;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.datatype.jsr310.DecimalUtils;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
/* loaded from: classes.dex */
public class ZonedDateTimeKeySerializer extends JsonSerializer<ZonedDateTime> {
    public static final ZonedDateTimeKeySerializer INSTANCE = new ZonedDateTimeKeySerializer();

    private ZonedDateTimeKeySerializer() {
    }

    private static boolean useNanos(SerializerProvider serializerProvider) {
        return serializerProvider.isEnabled(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS);
    }

    private static boolean useTimestamps(SerializerProvider serializerProvider) {
        return serializerProvider.isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);
    }

    public void serialize(ZonedDateTime zonedDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        DateTimeFormatter dateTimeFormatter;
        String bigDecimal;
        if (serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_WITH_ZONE_ID)) {
            dateTimeFormatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
        } else if (useTimestamps(serializerProvider)) {
            bigDecimal = useNanos(serializerProvider) ? DecimalUtils.toBigDecimal(zonedDateTime.toEpochSecond(), zonedDateTime.getNano()).toString() : String.valueOf(zonedDateTime.toInstant().toEpochMilli());
            jsonGenerator.writeFieldName(bigDecimal);
        } else {
            dateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        }
        bigDecimal = dateTimeFormatter.format(zonedDateTime);
        jsonGenerator.writeFieldName(bigDecimal);
    }
}
