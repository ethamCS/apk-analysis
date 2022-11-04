package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;
/* loaded from: classes.dex */
public class WritableTypeId {
    public String asProperty;
    public Object forValue;
    public Class<?> forValueType;

    /* renamed from: id */
    public Object f6797id;
    public Inclusion include;
    public JsonToken valueShape;
    public boolean wrapperWritten;

    /* loaded from: classes.dex */
    public enum Inclusion {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean requiresObjectContext() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public WritableTypeId(Object obj, JsonToken jsonToken) {
        this(obj, jsonToken, null);
    }

    public WritableTypeId(Object obj, JsonToken jsonToken, Object obj2) {
        this.forValue = obj;
        this.f6797id = obj2;
        this.valueShape = jsonToken;
    }
}
