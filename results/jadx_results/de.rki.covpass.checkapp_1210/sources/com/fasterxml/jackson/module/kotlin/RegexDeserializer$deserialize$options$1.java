package com.fasterxml.jackson.module.kotlin;

import bf.m;
import com.fasterxml.jackson.databind.JsonNode;
import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/fasterxml/jackson/databind/JsonNode;", "kotlin.jvm.PlatformType", "it", "Lbf/m;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class RegexDeserializer$deserialize$options$1 extends v implements l<JsonNode, m> {
    public static final RegexDeserializer$deserialize$options$1 INSTANCE = new RegexDeserializer$deserialize$options$1();

    RegexDeserializer$deserialize$options$1() {
        super(1);
    }

    public final m invoke(JsonNode jsonNode) {
        String asText = jsonNode.asText();
        t.d(asText, "it.asText()");
        return m.valueOf(asText);
    }
}
