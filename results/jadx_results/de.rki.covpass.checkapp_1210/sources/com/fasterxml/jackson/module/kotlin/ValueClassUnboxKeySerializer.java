package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import hc.t;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueClassUnboxKeySerializer;", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", BuildConfig.FLAVOR, "value", "Lcom/fasterxml/jackson/core/JsonGenerator;", "gen", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "provider", "Ltb/e0;", "serialize", "<init>", "()V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ValueClassUnboxKeySerializer extends StdSerializer<Object> {
    public static final ValueClassUnboxKeySerializer INSTANCE = new ValueClassUnboxKeySerializer();

    private ValueClassUnboxKeySerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        t.e(obj, "value");
        t.e(jsonGenerator, "gen");
        t.e(serializerProvider, "provider");
        Method method = obj.getClass().getMethod("unbox-impl", new Class[0]);
        Object invoke = method.invoke(obj, new Object[0]);
        if (invoke == null) {
            serializerProvider.findNullKeySerializer(serializerProvider.getTypeFactory().constructType(method.getGenericReturnType()), null).serialize(null, jsonGenerator, serializerProvider);
        } else {
            serializerProvider.findKeySerializer(invoke.getClass(), (BeanProperty) null).serialize(invoke, jsonGenerator, serializerProvider);
        }
    }
}
