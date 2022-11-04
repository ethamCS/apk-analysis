package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.datatype.jsr310.DecimalUtils;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.Temporal;
import j$.util.DesugarTimeZone;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
/* loaded from: classes.dex */
public abstract class InstantSerializerBase<T extends Temporal> extends JSR310FormattedSerializerBase<T> {
    private final DateTimeFormatter defaultFormat;
    private final ToLongFunction<T> getEpochMillis;
    private final ToLongFunction<T> getEpochSeconds;
    private final ToIntFunction<T> getNanoseconds;

    public InstantSerializerBase(InstantSerializerBase<T> instantSerializerBase, Boolean bool, Boolean bool2, DateTimeFormatter dateTimeFormatter) {
        super(instantSerializerBase, bool, bool2, dateTimeFormatter, null);
        this.defaultFormat = instantSerializerBase.defaultFormat;
        this.getEpochMillis = instantSerializerBase.getEpochMillis;
        this.getEpochSeconds = instantSerializerBase.getEpochSeconds;
        this.getNanoseconds = instantSerializerBase.getNanoseconds;
    }

    public InstantSerializerBase(Class<T> cls, ToLongFunction<T> toLongFunction, ToLongFunction<T> toLongFunction2, ToIntFunction<T> toIntFunction, DateTimeFormatter dateTimeFormatter) {
        super(cls, null);
        this.defaultFormat = dateTimeFormatter;
        this.getEpochMillis = toLongFunction;
        this.getEpochSeconds = toLongFunction2;
        this.getNanoseconds = toIntFunction;
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase, com.fasterxml.jackson.databind.ser.ContextualSerializer
    public /* bridge */ /* synthetic */ JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        return super.createContextual(serializerProvider, beanProperty);
    }

    protected String formatValue(T t10, SerializerProvider serializerProvider) {
        ZoneId a10;
        DateTimeFormatter dateTimeFormatter = this._formatter;
        if (dateTimeFormatter == null) {
            dateTimeFormatter = this.defaultFormat;
        }
        if (dateTimeFormatter != null) {
            if (dateTimeFormatter.getZone() == null && serializerProvider.getConfig().hasExplicitTimeZone() && serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_WITH_CONTEXT_TIME_ZONE)) {
                a10 = DesugarTimeZone.a(serializerProvider.getTimeZone());
                dateTimeFormatter = dateTimeFormatter.withZone(a10);
            }
            return dateTimeFormatter.format(t10);
        }
        return t10.toString();
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.ser.JSR310SerializerBase
    public JsonToken serializationShape(SerializerProvider serializerProvider) {
        return useTimestamp(serializerProvider) ? useNanoseconds(serializerProvider) ? JsonToken.VALUE_NUMBER_FLOAT : JsonToken.VALUE_NUMBER_INT : JsonToken.VALUE_STRING;
    }

    public void serialize(T t10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (!useTimestamp(serializerProvider)) {
            jsonGenerator.writeString(formatValue(t10, serializerProvider));
        } else if (useNanoseconds(serializerProvider)) {
            jsonGenerator.writeNumber(DecimalUtils.toBigDecimal(this.getEpochSeconds.applyAsLong(t10), this.getNanoseconds.applyAsInt(t10)));
        } else {
            jsonGenerator.writeNumber(this.getEpochMillis.applyAsLong(t10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serialize((InstantSerializerBase<T>) ((Temporal) obj), jsonGenerator, serializerProvider);
    }
}
