package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import y4.a;
import y4.b;
import y4.c;
/* loaded from: classes.dex */
public class InstantSerializer extends InstantSerializerBase<Instant> {
    public static final InstantSerializer INSTANCE = new InstantSerializer();

    protected InstantSerializer() {
        super(Instant.class, c.f25798a, b.f25797a, a.f25796a, null);
    }

    protected InstantSerializer(InstantSerializer instantSerializer, Boolean bool, DateTimeFormatter dateTimeFormatter) {
        this(instantSerializer, bool, null, dateTimeFormatter);
    }

    protected InstantSerializer(InstantSerializer instantSerializer, Boolean bool, Boolean bool2, DateTimeFormatter dateTimeFormatter) {
        super(instantSerializer, bool, bool2, dateTimeFormatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected JSR310FormattedSerializerBase<?> withFeatures(Boolean bool, Boolean bool2) {
        return new InstantSerializer(this, this._useTimestamp, bool2, this._formatter);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase
    protected JSR310FormattedSerializerBase<Instant> withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        return new InstantSerializer(this, bool, dateTimeFormatter);
    }
}
