package dgca.verifier.app.engine;

import com.fasterxml.jackson.databind.JsonNode;
import dgca.verifier.app.engine.data.CertificateType;
import dgca.verifier.app.engine.data.Rule;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Ldgca/verifier/app/engine/AffectedFieldsDataRetriever;", org.conscrypt.BuildConfig.FLAVOR, "Ldgca/verifier/app/engine/data/Rule;", "rule", "Lcom/fasterxml/jackson/databind/JsonNode;", "dataJsonNode", "Ldgca/verifier/app/engine/data/CertificateType;", "certificateType", org.conscrypt.BuildConfig.FLAVOR, "a", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface AffectedFieldsDataRetriever {
    String a(Rule rule, JsonNode jsonNode, CertificateType certificateType);
}
