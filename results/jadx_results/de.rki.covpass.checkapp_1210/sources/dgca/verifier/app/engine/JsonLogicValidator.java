package dgca.verifier.app.engine;

import com.fasterxml.jackson.databind.JsonNode;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Ldgca/verifier/app/engine/JsonLogicValidator;", org.conscrypt.BuildConfig.FLAVOR, "Lcom/fasterxml/jackson/databind/JsonNode;", "rule", "data", org.conscrypt.BuildConfig.FLAVOR, "a", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface JsonLogicValidator {
    boolean a(JsonNode jsonNode, JsonNode jsonNode2);
}
