package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
/* loaded from: classes.dex */
public abstract class DeserializationProblemHandler {
    public static final Object NOT_HANDLED = new Object();

    public Object handleInstantiationProblem(DeserializationContext deserializationContext, Class<?> cls, Object obj, Throwable th2) {
        return NOT_HANDLED;
    }

    @Deprecated
    public Object handleMissingInstantiator(DeserializationContext deserializationContext, Class<?> cls, JsonParser jsonParser, String str) {
        return NOT_HANDLED;
    }

    public Object handleMissingInstantiator(DeserializationContext deserializationContext, Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str) {
        return handleMissingInstantiator(deserializationContext, cls, jsonParser, str);
    }

    public JavaType handleMissingTypeId(DeserializationContext deserializationContext, JavaType javaType, TypeIdResolver typeIdResolver, String str) {
        return null;
    }

    public Object handleUnexpectedToken(DeserializationContext deserializationContext, JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str) {
        return handleUnexpectedToken(deserializationContext, javaType.getRawClass(), jsonToken, jsonParser, str);
    }

    @Deprecated
    public Object handleUnexpectedToken(DeserializationContext deserializationContext, Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str) {
        return NOT_HANDLED;
    }

    public boolean handleUnknownProperty(DeserializationContext deserializationContext, JsonParser jsonParser, JsonDeserializer<?> jsonDeserializer, Object obj, String str) {
        return false;
    }

    public JavaType handleUnknownTypeId(DeserializationContext deserializationContext, JavaType javaType, String str, TypeIdResolver typeIdResolver, String str2) {
        return null;
    }

    public Object handleWeirdKey(DeserializationContext deserializationContext, Class<?> cls, String str, String str2) {
        return NOT_HANDLED;
    }

    public Object handleWeirdNativeValue(DeserializationContext deserializationContext, JavaType javaType, Object obj, JsonParser jsonParser) {
        return NOT_HANDLED;
    }

    public Object handleWeirdNumberValue(DeserializationContext deserializationContext, Class<?> cls, Number number, String str) {
        return NOT_HANDLED;
    }

    public Object handleWeirdStringValue(DeserializationContext deserializationContext, Class<?> cls, String str, String str2) {
        return NOT_HANDLED;
    }
}
