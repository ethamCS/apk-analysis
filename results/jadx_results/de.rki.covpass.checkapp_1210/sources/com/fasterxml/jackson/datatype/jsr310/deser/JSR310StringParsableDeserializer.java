package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import j$.time.DateTimeException;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
/* loaded from: classes.dex */
public class JSR310StringParsableDeserializer extends JSR310DeserializerBase<Object> implements ContextualDeserializer {
    public static final JsonDeserializer<Period> PERIOD = createDeserializer(Period.class, 1);
    public static final JsonDeserializer<ZoneId> ZONE_ID = createDeserializer(ZoneId.class, 2);
    public static final JsonDeserializer<ZoneOffset> ZONE_OFFSET = createDeserializer(ZoneOffset.class, 3);
    protected final int _typeSelector;

    protected JSR310StringParsableDeserializer(JSR310StringParsableDeserializer jSR310StringParsableDeserializer, Boolean bool) {
        super(jSR310StringParsableDeserializer, bool);
        this._typeSelector = jSR310StringParsableDeserializer._typeSelector;
    }

    protected JSR310StringParsableDeserializer(Class<?> cls, int i10) {
        super(cls);
        this._typeSelector = i10;
    }

    protected static <T> JsonDeserializer<T> createDeserializer(Class<T> cls, int i10) {
        return new JSR310StringParsableDeserializer((Class<?>) cls, i10);
    }

    protected Object _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            CoercionAction findCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.EmptyString);
            if (findCoercionAction == CoercionAction.Fail) {
                deserializationContext.reportInputMismatch(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", _coercedTypeDesc());
            }
            if (!isLenient()) {
                return _failForNotLenient(jsonParser, deserializationContext, JsonToken.VALUE_STRING);
            }
            if (findCoercionAction != CoercionAction.AsEmpty) {
                return null;
            }
            return getEmptyValue(deserializationContext);
        }
        try {
            int i10 = this._typeSelector;
            if (i10 == 1) {
                return Period.parse(trim);
            }
            if (i10 == 2) {
                return ZoneId.of(trim);
            }
            if (i10 == 3) {
                return ZoneOffset.of(trim);
            }
            VersionUtil.throwInternal();
            return null;
        } catch (DateTimeException e10) {
            return _handleDateTimeException(deserializationContext, e10, trim);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        Boolean lenient;
        JsonFormat.Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        return (findFormatOverrides == null || !findFormatOverrides.hasLenient() || (lenient = findFormatOverrides.getLenient()) == null) ? this : withLeniency(lenient);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String extractScalarFromObject;
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonParser.hasToken(jsonToken)) {
            extractScalarFromObject = jsonParser.getText();
        } else if (!jsonParser.isExpectedStartObjectToken()) {
            if (jsonParser.hasToken(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                return jsonParser.getEmbeddedObject();
            }
            if (!jsonParser.isExpectedStartArrayToken()) {
                throw deserializationContext.wrongTokenException(jsonParser, handledType(), jsonToken, (String) null);
            }
            return _deserializeFromArray(jsonParser, deserializationContext);
        } else {
            extractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, handledType());
        }
        return _fromString(jsonParser, deserializationContext, extractScalarFromObject);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DeserializerBase, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        return (currentToken == null || !currentToken.isScalarValue()) ? typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext) : deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.datatype.jsr310.deser.JSR310DeserializerBase, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ LogicalType logicalType() {
        return super.logicalType();
    }

    protected JSR310StringParsableDeserializer withLeniency(Boolean bool) {
        return this._isLenient == (Boolean.FALSE.equals(bool) ^ true) ? this : new JSR310StringParsableDeserializer(this, bool);
    }
}
