package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.ResolverStyle;
import j$.util.DesugarTimeZone;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class JSR310DateTimeDeserializerBase<T> extends JSR310DeserializerBase<T> implements ContextualDeserializer {
    protected final DateTimeFormatter _formatter;
    protected final JsonFormat.Shape _shape;

    public JSR310DateTimeDeserializerBase(JSR310DateTimeDeserializerBase<T> jSR310DateTimeDeserializerBase, JsonFormat.Shape shape) {
        super(jSR310DateTimeDeserializerBase);
        this._formatter = jSR310DateTimeDeserializerBase._formatter;
        this._shape = shape;
    }

    public JSR310DateTimeDeserializerBase(JSR310DateTimeDeserializerBase<T> jSR310DateTimeDeserializerBase, DateTimeFormatter dateTimeFormatter) {
        super(jSR310DateTimeDeserializerBase);
        this._formatter = dateTimeFormatter;
        this._shape = jSR310DateTimeDeserializerBase._shape;
    }

    public JSR310DateTimeDeserializerBase(JSR310DateTimeDeserializerBase<T> jSR310DateTimeDeserializerBase, Boolean bool) {
        super(jSR310DateTimeDeserializerBase, bool);
        this._formatter = jSR310DateTimeDeserializerBase._formatter;
        this._shape = jSR310DateTimeDeserializerBase._shape;
    }

    public JSR310DateTimeDeserializerBase(Class<T> cls, DateTimeFormatter dateTimeFormatter) {
        super(cls);
        this._formatter = dateTimeFormatter;
        this._shape = null;
    }

    public JSR310DateTimeDeserializerBase(Class<T> cls, DateTimeFormatter dateTimeFormatter, Boolean bool) {
        super(cls, bool);
        this._formatter = dateTimeFormatter;
        this._shape = null;
    }

    private boolean acceptCaseInsensitiveValues(DeserializationContext deserializationContext, JsonFormat.Value value) {
        Boolean feature = value.getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_VALUES);
        if (feature == null) {
            feature = Boolean.valueOf(deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES));
        }
        return feature.booleanValue();
    }

    public void _throwNoNumericTimestampNeedTimeZone(JsonParser jsonParser, DeserializationContext deserializationContext) {
        deserializationContext.reportInputMismatch(handledType(), "raw timestamp (%d) not allowed for `%s`: need additional information such as an offset or time-zone (see class Javadocs)", jsonParser.getNumberValue(), handledType().getName());
    }

    public JSR310DateTimeDeserializerBase<?> _withFormatOverrides(DeserializationContext deserializationContext, BeanProperty beanProperty, JsonFormat.Value value) {
        ZoneId a10;
        Boolean lenient;
        JSR310DateTimeDeserializerBase<T> withLeniency = (!value.hasLenient() || (lenient = value.getLenient()) == null) ? this : withLeniency(lenient);
        JSR310DateTimeDeserializerBase jSR310DateTimeDeserializerBase = withLeniency;
        if (value.hasPattern()) {
            String pattern = value.getPattern();
            Locale locale = value.hasLocale() ? value.getLocale() : deserializationContext.getLocale();
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            if (acceptCaseInsensitiveValues(deserializationContext, value)) {
                dateTimeFormatterBuilder.parseCaseInsensitive();
            }
            dateTimeFormatterBuilder.appendPattern(pattern);
            DateTimeFormatter formatter = locale == null ? dateTimeFormatterBuilder.toFormatter() : dateTimeFormatterBuilder.toFormatter(locale);
            if (!withLeniency.isLenient()) {
                formatter = formatter.withResolverStyle(ResolverStyle.STRICT);
            }
            if (value.hasTimeZone()) {
                a10 = DesugarTimeZone.a(value.getTimeZone());
                formatter = formatter.withZone(a10);
            }
            jSR310DateTimeDeserializerBase = withLeniency.withDateFormat(formatter);
        }
        JsonFormat.Shape shape = value.getShape();
        return (shape == null || shape == this._shape) ? jSR310DateTimeDeserializerBase : jSR310DateTimeDeserializerBase.withShape(shape);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        return findFormatOverrides == null ? this : _withFormatOverrides(deserializationContext, beanProperty, findFormatOverrides);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DeserializerBase, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DeserializerBase, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ LogicalType logicalType() {
        return super.logicalType();
    }

    protected abstract JSR310DateTimeDeserializerBase<T> withDateFormat(DateTimeFormatter dateTimeFormatter);

    protected abstract JSR310DateTimeDeserializerBase<T> withLeniency(Boolean bool);

    protected abstract JSR310DateTimeDeserializerBase<T> withShape(JsonFormat.Shape shape);
}
