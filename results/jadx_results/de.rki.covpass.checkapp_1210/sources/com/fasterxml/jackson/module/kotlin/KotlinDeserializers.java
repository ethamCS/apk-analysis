package com.fasterxml.jackson.module.kotlin;

import af.h;
import bf.k;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.Deserializers;
import hc.t;
import kotlin.Metadata;
import tb.a0;
import tb.c0;
import tb.y;
import tb.z;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinDeserializers;", "Lcom/fasterxml/jackson/databind/deser/Deserializers$Base;", "()V", "findBeanDeserializer", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "type", "Lcom/fasterxml/jackson/databind/JavaType;", "config", "Lcom/fasterxml/jackson/databind/DeserializationConfig;", "beanDesc", "Lcom/fasterxml/jackson/databind/BeanDescription;", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinDeserializers extends Deserializers.Base {
    @Override // com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        t.e(javaType, "type");
        if (!javaType.isInterface() || !t.a(javaType.getRawClass(), h.class)) {
            if (t.a(javaType.getRawClass(), k.class)) {
                return RegexDeserializer.INSTANCE;
            }
            if (t.a(javaType.getRawClass(), y.class)) {
                return UByteDeserializer.INSTANCE;
            }
            if (t.a(javaType.getRawClass(), c0.class)) {
                return UShortDeserializer.INSTANCE;
            }
            if (t.a(javaType.getRawClass(), z.class)) {
                return UIntDeserializer.INSTANCE;
            }
            if (!t.a(javaType.getRawClass(), a0.class)) {
                return null;
            }
            return ULongDeserializer.INSTANCE;
        }
        return SequenceDeserializer.INSTANCE;
    }
}
