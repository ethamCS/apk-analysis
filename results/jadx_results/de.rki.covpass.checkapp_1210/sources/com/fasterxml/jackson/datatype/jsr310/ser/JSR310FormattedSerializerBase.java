package com.fasterxml.jackson.datatype.jsr310.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarTimeZone;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class JSR310FormattedSerializerBase<T> extends JSR310SerializerBase<T> implements ContextualSerializer {
    protected final DateTimeFormatter _formatter;
    protected final JsonFormat.Shape _shape;
    protected final Boolean _useNanoseconds;
    protected final Boolean _useTimestamp;

    public JSR310FormattedSerializerBase(JSR310FormattedSerializerBase<?> jSR310FormattedSerializerBase, Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        this(jSR310FormattedSerializerBase, bool, null, dateTimeFormatter, shape);
    }

    public JSR310FormattedSerializerBase(JSR310FormattedSerializerBase<?> jSR310FormattedSerializerBase, Boolean bool, Boolean bool2, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape) {
        super(jSR310FormattedSerializerBase.handledType());
        this._useTimestamp = bool;
        this._useNanoseconds = bool2;
        this._formatter = dateTimeFormatter;
        this._shape = shape;
    }

    public JSR310FormattedSerializerBase(Class<T> cls) {
        this(cls, null);
    }

    public JSR310FormattedSerializerBase(Class<T> cls, DateTimeFormatter dateTimeFormatter) {
        super(cls);
        this._useTimestamp = null;
        this._useNanoseconds = null;
        this._shape = null;
        this._formatter = dateTimeFormatter;
    }

    protected DateTimeFormatter _useDateTimeFormatter(SerializerProvider serializerProvider, JsonFormat.Value value) {
        ZoneId a10;
        String pattern = value.getPattern();
        Locale locale = value.hasLocale() ? value.getLocale() : serializerProvider.getLocale();
        DateTimeFormatter ofPattern = locale == null ? DateTimeFormatter.ofPattern(pattern) : DateTimeFormatter.ofPattern(pattern, locale);
        if (value.hasTimeZone()) {
            a10 = DesugarTimeZone.a(value.getTimeZone());
            return ofPattern.withZone(a10);
        }
        return ofPattern;
    }

    public boolean _useTimestampExplicitOnly(SerializerProvider serializerProvider) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides != null) {
            JsonFormat.Shape shape = findFormatOverrides.getShape();
            Boolean bool = (shape == JsonFormat.Shape.ARRAY || shape.isNumeric()) ? Boolean.TRUE : shape == JsonFormat.Shape.STRING ? Boolean.FALSE : null;
            DateTimeFormatter dateTimeFormatter = this._formatter;
            if (findFormatOverrides.hasPattern()) {
                dateTimeFormatter = _useDateTimeFormatter(serializerProvider, findFormatOverrides);
            }
            JSR310FormattedSerializerBase<?> withFormat = (shape == this._shape && bool == this._useTimestamp && dateTimeFormatter == this._formatter) ? this : withFormat(bool, dateTimeFormatter, shape);
            Boolean feature = findFormatOverrides.getFeature(JsonFormat.Feature.WRITE_DATES_WITH_ZONE_ID);
            Boolean feature2 = findFormatOverrides.getFeature(JsonFormat.Feature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS);
            return (feature == null && feature2 == null) ? withFormat : withFormat.withFeatures(feature, feature2);
        }
        return this;
    }

    protected SerializationFeature getTimestampsFeature() {
        return SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
    }

    public boolean useNanoseconds(SerializerProvider serializerProvider) {
        Boolean bool = this._useNanoseconds;
        if (bool != null) {
            return bool.booleanValue();
        }
        JsonFormat.Shape shape = this._shape;
        if (shape != null) {
            if (shape == JsonFormat.Shape.NUMBER_INT) {
                return false;
            }
            if (shape == JsonFormat.Shape.NUMBER_FLOAT) {
                return true;
            }
        }
        return serializerProvider != null && serializerProvider.isEnabled(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS);
    }

    public boolean useTimestamp(SerializerProvider serializerProvider) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        JsonFormat.Shape shape = this._shape;
        if (shape != null) {
            if (shape == JsonFormat.Shape.STRING) {
                return false;
            }
            if (shape == JsonFormat.Shape.NUMBER_INT) {
                return true;
            }
        }
        return this._formatter == null && serializerProvider != null && serializerProvider.isEnabled(getTimestampsFeature());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected JSR310FormattedSerializerBase<?> withFeatures(Boolean bool, Boolean bool2) {
        return this;
    }

    protected abstract JSR310FormattedSerializerBase<?> withFormat(Boolean bool, DateTimeFormatter dateTimeFormatter, JsonFormat.Shape shape);
}
