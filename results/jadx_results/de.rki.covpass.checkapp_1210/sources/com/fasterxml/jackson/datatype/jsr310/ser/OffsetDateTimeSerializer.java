package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import y4.d;
import y4.e;
import y4.f;
/* loaded from: classes.dex */
public class OffsetDateTimeSerializer extends InstantSerializerBase<OffsetDateTime> {
    public static final OffsetDateTimeSerializer INSTANCE = new OffsetDateTimeSerializer();

    protected OffsetDateTimeSerializer() {
        super(OffsetDateTime.class, f.f25801a, e.f25800a, d.f25799a, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    protected OffsetDateTimeSerializer(OffsetDateTimeSerializer offsetDateTimeSerializer, Boolean bool, DateTimeFormatter dateTimeFormatter) {
        this(offsetDateTimeSerializer, bool, null, dateTimeFormatter);
    }

    protected OffsetDateTimeSerializer(OffsetDateTimeSerializer offsetDateTimeSerializer, Boolean bool, Boolean bool2, DateTimeFormatter dateTimeFormatter) {
        super(offsetDateTimeSerializer, bool, bool2, dateTimeFormatter);
    }

    public static /* synthetic */ long lambda$new$0(OffsetDateTime offsetDateTime) {
        return offsetDateTime.toInstant().toEpochMilli();
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected JSR310FormattedSerializerBase<?> withFeatures(Boolean bool, Boolean bool2) {
        return new OffsetDateTimeSerializer(this, this._useTimestamp, bool2, this._formatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected JSR310FormattedSerializerBase<?> withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        return new OffsetDateTimeSerializer(this, bool, dateTimeFormatter);
    }
}
