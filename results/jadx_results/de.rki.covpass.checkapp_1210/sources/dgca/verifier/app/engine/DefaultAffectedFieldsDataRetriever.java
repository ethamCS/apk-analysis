package dgca.verifier.app.engine;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import hc.t;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Ldgca/verifier/app/engine/DefaultAffectedFieldsDataRetriever;", "Ldgca/verifier/app/engine/AffectedFieldsDataRetriever;", "Ldgca/verifier/app/engine/data/Rule;", "rule", "Lcom/fasterxml/jackson/databind/JsonNode;", "dataJsonNode", "Ldgca/verifier/app/engine/data/CertificateType;", "certificateType", org.conscrypt.BuildConfig.FLAVOR, "a", "Lcom/fasterxml/jackson/databind/JsonNode;", "schemaJsonNode", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "b", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "objectMapper", "<init>", "(Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DefaultAffectedFieldsDataRetriever implements AffectedFieldsDataRetriever {

    /* renamed from: a */
    private final JsonNode f8946a;

    /* renamed from: b */
    private final ObjectMapper f8947b;

    public DefaultAffectedFieldsDataRetriever(JsonNode jsonNode, ObjectMapper objectMapper) {
        t.e(jsonNode, "schemaJsonNode");
        t.e(objectMapper, "objectMapper");
        this.f8946a = jsonNode;
        this.f8947b = objectMapper;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:4|(5:36|5|6|32|7)|(8:10|34|12|13|(2:15|(3:17|(1:40)(3:(2:21|(2:23|(2:26|39)(1:41)))|24|(0)(0))|27))|18|(0)(0)|27)|9|34|12|13|(0)|18|(0)(0)|27) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1 A[SYNTHETIC] */
    @Override // dgca.verifier.app.engine.AffectedFieldsDataRetriever
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(dgca.verifier.app.engine.data.Rule r20, com.fasterxml.jackson.databind.JsonNode r21, dgca.verifier.app.engine.data.CertificateType r22) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dgca.verifier.app.engine.DefaultAffectedFieldsDataRetriever.a(dgca.verifier.app.engine.data.Rule, com.fasterxml.jackson.databind.JsonNode, dgca.verifier.app.engine.data.CertificateType):java.lang.String");
    }
}
