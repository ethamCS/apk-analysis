package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import hc.t;
import kotlin.Metadata;
import tb.c0;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/UShortSerializer;", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "Ltb/c0;", "value", "Lcom/fasterxml/jackson/core/JsonGenerator;", "gen", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "provider", "Ltb/e0;", "serialize-_TFR7lA", "(SLcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V", "serialize", "<init>", "()V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class UShortSerializer extends StdSerializer<c0> {
    public static final UShortSerializer INSTANCE = new UShortSerializer();

    private UShortSerializer() {
        super(c0.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        m7serialize_TFR7lA(((c0) obj).j(), jsonGenerator, serializerProvider);
    }

    /* renamed from: serialize-_TFR7lA */
    public void m7serialize_TFR7lA(short s10, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        t.e(jsonGenerator, "gen");
        t.e(serializerProvider, "provider");
        jsonGenerator.writeNumber(s10 & 65535);
    }
}