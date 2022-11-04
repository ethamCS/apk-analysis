package com.fasterxml.jackson.module.kotlin;

import af.h;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.Serializers;
import hc.t;
import kotlin.Metadata;
import tb.a0;
import tb.c0;
import tb.y;
import tb.z;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinSerializers;", "Lcom/fasterxml/jackson/databind/ser/Serializers$Base;", "()V", "findSerializer", "Lcom/fasterxml/jackson/databind/JsonSerializer;", "config", "Lcom/fasterxml/jackson/databind/SerializationConfig;", "type", "Lcom/fasterxml/jackson/databind/JavaType;", "beanDesc", "Lcom/fasterxml/jackson/databind/BeanDescription;", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinSerializers extends Serializers.Base {
    @Override // com.fasterxml.jackson.databind.ser.Serializers.Base, com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        t.e(javaType, "type");
        if (h.class.isAssignableFrom(javaType.getRawClass())) {
            return SequenceSerializer.INSTANCE;
        }
        if (y.class.isAssignableFrom(javaType.getRawClass())) {
            return UByteSerializer.INSTANCE;
        }
        if (c0.class.isAssignableFrom(javaType.getRawClass())) {
            return UShortSerializer.INSTANCE;
        }
        if (z.class.isAssignableFrom(javaType.getRawClass())) {
            return UIntSerializer.INSTANCE;
        }
        if (a0.class.isAssignableFrom(javaType.getRawClass())) {
            return ULongSerializer.INSTANCE;
        }
        Class<?> rawClass = javaType.getRawClass();
        t.d(rawClass, "type.rawClass");
        if (!ExtensionsKt.isUnboxableValueClass(rawClass)) {
            return null;
        }
        return ValueClassUnboxSerializer.INSTANCE;
    }
}
