package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializerProvider;
/* loaded from: classes.dex */
public final class WritableObjectId {
    public final ObjectIdGenerator<?> generator;

    /* renamed from: id */
    public Object f6798id;
    protected boolean idWritten = false;

    public WritableObjectId(ObjectIdGenerator<?> objectIdGenerator) {
        this.generator = objectIdGenerator;
    }

    public Object generateId(Object obj) {
        if (this.f6798id == null) {
            this.f6798id = this.generator.generateId(obj);
        }
        return this.f6798id;
    }

    public void writeAsField(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) {
        this.idWritten = true;
        if (jsonGenerator.canWriteObjectId()) {
            Object obj = this.f6798id;
            jsonGenerator.writeObjectId(obj == null ? null : String.valueOf(obj));
            return;
        }
        SerializableString serializableString = objectIdWriter.propertyName;
        if (serializableString == null) {
            return;
        }
        jsonGenerator.writeFieldName(serializableString);
        objectIdWriter.serializer.serialize(this.f6798id, jsonGenerator, serializerProvider);
    }

    public boolean writeAsId(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) {
        if (this.f6798id != null) {
            if (!this.idWritten && !objectIdWriter.alwaysAsId) {
                return false;
            }
            if (jsonGenerator.canWriteObjectId()) {
                jsonGenerator.writeObjectRef(String.valueOf(this.f6798id));
                return true;
            }
            objectIdWriter.serializer.serialize(this.f6798id, jsonGenerator, serializerProvider);
            return true;
        }
        return false;
    }
}
