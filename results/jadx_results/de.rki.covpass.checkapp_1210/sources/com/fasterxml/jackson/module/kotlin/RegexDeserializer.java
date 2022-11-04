package com.fasterxml.jackson.module.kotlin;

import af.h;
import af.n;
import af.p;
import bf.k;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import hc.t;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/RegexDeserializer;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lbf/k;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", "deserialize", "<init>", "()V", "jackson-module-kotlin"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class RegexDeserializer extends StdDeserializer<k> {
    public static final RegexDeserializer INSTANCE = new RegexDeserializer();

    private RegexDeserializer() {
        super(k.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public k deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Set set;
        h c10;
        h z10;
        t.e(jsonParser, "p");
        t.e(deserializationContext, "ctxt");
        JsonNode readTree = deserializationContext.readTree(jsonParser);
        if (readTree.isTextual()) {
            String asText = readTree.asText();
            t.d(asText, "node.asText()");
            return new k(asText);
        } else if (!readTree.isObject()) {
            throw new IllegalStateException(t.l("Expected a string or an object to deserialize a Regex, but type was ", readTree.getNodeType()));
        } else {
            String asText2 = readTree.get("pattern").asText();
            if (readTree.has("options")) {
                JsonNode jsonNode = readTree.get("options");
                if (!jsonNode.isArray()) {
                    throw new IllegalStateException(t.l("Expected an array of strings for RegexOptions, but type was ", readTree.getNodeType()));
                }
                Iterator<JsonNode> elements = jsonNode.elements();
                t.d(elements, "optionsNode.elements()");
                c10 = n.c(elements);
                z10 = p.z(c10, RegexDeserializer$deserialize$options$1.INSTANCE);
                set = p.H(z10);
            } else {
                set = y0.b();
            }
            t.d(asText2, "pattern");
            return new k(asText2, set);
        }
    }
}
