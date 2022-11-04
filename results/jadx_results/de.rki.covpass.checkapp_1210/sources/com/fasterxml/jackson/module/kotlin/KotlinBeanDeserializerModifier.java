package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinBeanDeserializerModifier;", "Lcom/fasterxml/jackson/databind/deser/BeanDeserializerModifier;", "()V", "modifyDeserializer", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", BuildConfig.FLAVOR, "config", "Lcom/fasterxml/jackson/databind/DeserializationConfig;", "beanDesc", "Lcom/fasterxml/jackson/databind/BeanDescription;", "deserializer", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinBeanDeserializerModifier extends BeanDeserializerModifier {
    public static final KotlinBeanDeserializerModifier INSTANCE = new KotlinBeanDeserializerModifier();

    private KotlinBeanDeserializerModifier() {
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerModifier
    public JsonDeserializer<? extends Object> modifyDeserializer(DeserializationConfig deserializationConfig, BeanDescription beanDescription, JsonDeserializer<?> jsonDeserializer) {
        Object objectSingletonInstance;
        t.e(deserializationConfig, "config");
        t.e(beanDescription, "beanDesc");
        t.e(jsonDeserializer, "deserializer");
        JsonDeserializer modifyDeserializer = super.modifyDeserializer(deserializationConfig, beanDescription, jsonDeserializer);
        Class<?> beanClass = beanDescription.getBeanClass();
        t.d(beanClass, "beanDesc.beanClass");
        objectSingletonInstance = KotlinBeanDeserializerModifierKt.objectSingletonInstance(beanClass);
        if (objectSingletonInstance != null) {
            t.d(modifyDeserializer, "modifiedFromParent");
            return new KotlinObjectSingletonDeserializer(objectSingletonInstance, modifyDeserializer);
        }
        t.d(modifyDeserializer, "{\n            modifiedFromParent\n        }");
        return modifyDeserializer;
    }
}
