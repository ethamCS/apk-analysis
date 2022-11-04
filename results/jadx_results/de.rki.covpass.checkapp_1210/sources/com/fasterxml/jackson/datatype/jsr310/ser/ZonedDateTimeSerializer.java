package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import y4.g;
import y4.h;
import y4.i;
/* loaded from: classes.dex */
public class ZonedDateTimeSerializer extends InstantSerializerBase<ZonedDateTime> {
    public static final ZonedDateTimeSerializer INSTANCE = new ZonedDateTimeSerializer();
    protected final Boolean _writeZoneId;

    protected ZonedDateTimeSerializer() {
        this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    protected ZonedDateTimeSerializer(ZonedDateTimeSerializer zonedDateTimeSerializer, Boolean bool, DateTimeFormatter dateTimeFormatter, Boolean bool2) {
        this(zonedDateTimeSerializer, bool, null, dateTimeFormatter, bool2);
    }

    protected ZonedDateTimeSerializer(ZonedDateTimeSerializer zonedDateTimeSerializer, Boolean bool, Boolean bool2, DateTimeFormatter dateTimeFormatter, Boolean bool3) {
        super(zonedDateTimeSerializer, bool, bool2, dateTimeFormatter);
        this._writeZoneId = bool3;
    }

    public ZonedDateTimeSerializer(DateTimeFormatter dateTimeFormatter) {
        super(ZonedDateTime.class, h.f25803a, i.f25804a, g.f25802a, dateTimeFormatter);
        this._writeZoneId = null;
    }

    public static /* synthetic */ long lambda$new$0(ZonedDateTime zonedDateTime) {
        return zonedDateTime.toInstant().toEpochMilli();
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.InstantSerializerBase, com.fasterxml.jackson.datatype.jsr310.ser.JSR310SerializerBase
    public JsonToken serializationShape(SerializerProvider serializerProvider) {
        return (useTimestamp(serializerProvider) || !shouldWriteWithZoneId(serializerProvider)) ? super.serializationShape(serializerProvider) : JsonToken.VALUE_STRING;
    }

    public void serialize(ZonedDateTime zonedDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (useTimestamp(serializerProvider) || !shouldWriteWithZoneId(serializerProvider)) {
            super.serialize((ZonedDateTimeSerializer) zonedDateTime, jsonGenerator, serializerProvider);
        } else {
            jsonGenerator.writeString(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(zonedDateTime));
        }
    }

    public boolean shouldWriteWithZoneId(SerializerProvider serializerProvider) {
        Boolean bool = this._writeZoneId;
        return bool != null ? bool.booleanValue() : serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_WITH_ZONE_ID);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected JSR310FormattedSerializerBase<?> withFeatures(Boolean bool, Boolean bool2) {
        return new ZonedDateTimeSerializer(this, this._useTimestamp, bool2, this._formatter, bool);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected JSR310FormattedSerializerBase<?> withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        return new ZonedDateTimeSerializer(this, bool, dateTimeFormatter, this._writeZoneId);
    }
}
