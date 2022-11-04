package dgca.verifier.app.engine;

import ba.a;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import hc.t;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Ldgca/verifier/app/engine/DefaultJsonLogicValidator;", "Ldgca/verifier/app/engine/JsonLogicValidator;", "Lcom/fasterxml/jackson/databind/JsonNode;", "rule", "data", org.conscrypt.BuildConfig.FLAVOR, "a", "<init>", "()V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DefaultJsonLogicValidator implements JsonLogicValidator {
    @Override // dgca.verifier.app.engine.JsonLogicValidator
    public boolean a(JsonNode jsonNode, JsonNode jsonNode2) {
        t.e(jsonNode, "rule");
        t.e(jsonNode2, "data");
        JsonNode a10 = a.a(jsonNode, jsonNode2);
        t.c(a10, "null cannot be cast to non-null type com.fasterxml.jackson.databind.node.BooleanNode");
        return ((BooleanNode) a10).asBoolean();
    }
}
