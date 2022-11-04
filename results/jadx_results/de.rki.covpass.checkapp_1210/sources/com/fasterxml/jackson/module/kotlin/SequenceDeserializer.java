package com.fasterxml.jackson.module.kotlin;

import af.h;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import hc.t;
import java.util.List;
import kotlin.Metadata;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/SequenceDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Laf/h;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", "deserialize", "<init>", "()V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class SequenceDeserializer extends StdDeserializer<h<?>> {
    public static final SequenceDeserializer INSTANCE = new SequenceDeserializer();

    private SequenceDeserializer() {
        super(h.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public h<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        h<?> M;
        t.e(jsonParser, "p");
        t.e(deserializationContext, "ctxt");
        Object readValue = deserializationContext.readValue(jsonParser, List.class);
        t.d(readValue, "ctxt.readValue(p, List::class.java)");
        M = c0.M((Iterable) readValue);
        return M;
    }
}
