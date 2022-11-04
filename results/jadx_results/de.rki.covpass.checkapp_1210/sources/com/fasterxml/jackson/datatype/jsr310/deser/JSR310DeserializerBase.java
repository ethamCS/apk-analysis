package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import j$.time.DateTimeException;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class JSR310DeserializerBase<T> extends StdScalarDeserializer<T> {
    protected final boolean _isLenient;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fasterxml.jackson.datatype.jsr310.deser.JSR310DeserializerBase$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.TryConvert.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.AsNull.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public JSR310DeserializerBase(JSR310DeserializerBase<T> jSR310DeserializerBase) {
        super(jSR310DeserializerBase);
        this._isLenient = jSR310DeserializerBase._isLenient;
    }

    public JSR310DeserializerBase(JSR310DeserializerBase<T> jSR310DeserializerBase, Boolean bool) {
        super(jSR310DeserializerBase);
        this._isLenient = !Boolean.FALSE.equals(bool);
    }

    public JSR310DeserializerBase(Class<T> cls) {
        super((Class<?>) cls);
        this._isLenient = true;
    }

    public JSR310DeserializerBase(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._isLenient = !Boolean.FALSE.equals(bool);
    }

    public T _failForNotLenient(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) {
        return (T) deserializationContext.handleUnexpectedToken(handledType(), jsonToken, jsonParser, "Cannot deserialize instance of %s out of %s token: not allowed because 'strict' mode set for property or type (enable 'lenient' handling to allow)", ClassUtil.nameOf(handledType()), jsonParser.currentToken());
    }

    public T _fromEmptyString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        if (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[_checkFromStringCoercion(deserializationContext, str).ordinal()] != 1) {
            if (this._isLenient) {
                return null;
            }
            return _failForNotLenient(jsonParser, deserializationContext, JsonToken.VALUE_STRING);
        }
        return (T) getEmptyValue(deserializationContext);
    }

    public <R> R _handleDateTimeException(DeserializationContext deserializationContext, DateTimeException dateTimeException, String str) {
        try {
            return (R) deserializationContext.handleWeirdStringValue(handledType(), str, "Failed to deserialize %s: (%s) %s", handledType().getName(), dateTimeException.getClass().getName(), dateTimeException.getMessage());
        } catch (JsonMappingException e10) {
            e10.initCause(dateTimeException);
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() == null) {
                e11.initCause(dateTimeException);
            }
            throw JsonMappingException.fromUnexpectedIOE(e11);
        }
    }

    public <R> R _handleUnexpectedToken(DeserializationContext deserializationContext, JsonParser jsonParser, String str, Object... objArr) {
        try {
            return (R) deserializationContext.handleUnexpectedToken(handledType(), jsonParser.getCurrentToken(), jsonParser, str, objArr);
        } catch (JsonMappingException e10) {
            throw e10;
        } catch (IOException e11) {
            throw JsonMappingException.fromUnexpectedIOE(e11);
        }
    }

    public <R> R _handleUnexpectedToken(DeserializationContext deserializationContext, JsonParser jsonParser, JsonToken... jsonTokenArr) {
        return (R) _handleUnexpectedToken(deserializationContext, jsonParser, "Unexpected token (%s), expected one of %s for %s value", jsonParser.currentToken(), Arrays.asList(jsonTokenArr), handledType().getName());
    }

    public boolean _isValidTimestampString(String str) {
        if (_isIntNumber(str)) {
            if (NumberInput.inLongRange(str, str.charAt(0) == '-')) {
                return true;
            }
        }
        return false;
    }

    public <BOGUS> BOGUS _reportWrongToken(DeserializationContext deserializationContext, JsonToken jsonToken, String str) {
        deserializationContext.reportWrongTokenException(this, jsonToken, "Expected %s for '%s' of %s value", jsonToken.name(), str, handledType().getName());
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public boolean isLenient() {
        return this._isLenient;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.DateTime;
    }
}
