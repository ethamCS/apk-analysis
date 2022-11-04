package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinObjectSingletonDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", BuildConfig.FLAVOR, "Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;", "Lcom/fasterxml/jackson/databind/deser/ResolvableDeserializer;", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", "Ltb/e0;", "resolve", "Lcom/fasterxml/jackson/databind/BeanProperty;", "property", "createContextual", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "deserialize", "singletonInstance", "Ljava/lang/Object;", "defaultDeserializer", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "<init>", "(Ljava/lang/Object;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class KotlinObjectSingletonDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer, ResolvableDeserializer {
    private final JsonDeserializer<?> defaultDeserializer;
    private final Object singletonInstance;

    public KotlinObjectSingletonDeserializer(Object obj, JsonDeserializer<?> jsonDeserializer) {
        t.e(obj, "singletonInstance");
        t.e(jsonDeserializer, "defaultDeserializer");
        this.singletonInstance = obj;
        this.defaultDeserializer = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer<?> jsonDeserializer = this.defaultDeserializer;
        if (jsonDeserializer instanceof ContextualDeserializer) {
            JsonDeserializer<?> createContextual = ((ContextualDeserializer) jsonDeserializer).createContextual(deserializationContext, beanProperty);
            t.d(createContextual, "defaultDeserializer.crea…ontextual(ctxt, property)");
            return KotlinObjectSingletonDeserializerKt.asSingletonDeserializer(createContextual, this.singletonInstance);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        t.e(jsonParser, "p");
        t.e(deserializationContext, "ctxt");
        this.defaultDeserializer.deserialize(jsonParser, deserializationContext);
        return this.singletonInstance;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) {
        JsonDeserializer<?> jsonDeserializer = this.defaultDeserializer;
        if (jsonDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) jsonDeserializer).resolve(deserializationContext);
        }
    }
}
