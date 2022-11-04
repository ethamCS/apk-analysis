package dgca.verifier.app.engine;

import bf.y;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dgca.verifier.app.engine.data.CertificateType;
import dgca.verifier.app.engine.data.ExternalParameter;
import dgca.verifier.app.engine.data.Rule;
import hc.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tb.w;
import ub.u;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J<\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J8\u0010\u0014\u001a\u00020\u0013*\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0002J \u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u0004H\u0002J<\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!¨\u0006&"}, d2 = {"Ldgca/verifier/app/engine/DefaultCertLogicEngine;", "Ldgca/verifier/app/engine/CertLogicEngine;", "Ldgca/verifier/app/engine/data/ExternalParameter;", "externalParameter", org.conscrypt.BuildConfig.FLAVOR, "payload", "Lcom/fasterxml/jackson/databind/node/ObjectNode;", "d", "Ldgca/verifier/app/engine/data/Rule;", "rule", "dataJsonNode", "Ltb/w;", org.conscrypt.BuildConfig.FLAVOR, "hcertVersion", "Ldgca/verifier/app/engine/data/CertificateType;", "certificateType", "Ldgca/verifier/app/engine/ValidationResult;", "b", "version", org.conscrypt.BuildConfig.FLAVOR, "c", "e", "hcertVersionString", org.conscrypt.BuildConfig.FLAVOR, "rules", "a", "Ldgca/verifier/app/engine/AffectedFieldsDataRetriever;", "Ldgca/verifier/app/engine/AffectedFieldsDataRetriever;", "affectedFieldsDataRetriever", "Ldgca/verifier/app/engine/JsonLogicValidator;", "Ldgca/verifier/app/engine/JsonLogicValidator;", "jsonLogicValidator", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "objectMapper", "<init>", "(Ldgca/verifier/app/engine/AffectedFieldsDataRetriever;Ldgca/verifier/app/engine/JsonLogicValidator;)V", "Companion", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DefaultCertLogicEngine implements CertLogicEngine {
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    private static final w<Integer, Integer, Integer> f8949d = new w<>(1, 0, 0);

    /* renamed from: a */
    private final AffectedFieldsDataRetriever f8950a;

    /* renamed from: b */
    private final JsonLogicValidator f8951b;

    /* renamed from: c */
    private final ObjectMapper f8952c;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Ldgca/verifier/app/engine/DefaultCertLogicEngine$Companion;", org.conscrypt.BuildConfig.FLAVOR, org.conscrypt.BuildConfig.FLAVOR, "CERTLOGIC_KEY", "Ljava/lang/String;", "Ltb/w;", org.conscrypt.BuildConfig.FLAVOR, "CERTLOGIC_VERSION", "Ltb/w;", "EXTERNAL_KEY", "PAYLOAD_KEY", "<init>", "()V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultCertLogicEngine(AffectedFieldsDataRetriever affectedFieldsDataRetriever, JsonLogicValidator jsonLogicValidator) {
        t.e(affectedFieldsDataRetriever, "affectedFieldsDataRetriever");
        t.e(jsonLogicValidator, "jsonLogicValidator");
        this.f8950a = affectedFieldsDataRetriever;
        this.f8951b = jsonLogicValidator;
        ObjectMapper objectMapper = new ObjectMapper();
        this.f8952c = objectMapper;
        objectMapper.findAndRegisterModules();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final dgca.verifier.app.engine.ValidationResult b(dgca.verifier.app.engine.data.Rule r6, com.fasterxml.jackson.databind.node.ObjectNode r7, tb.w<java.lang.Integer, java.lang.Integer, java.lang.Integer> r8, dgca.verifier.app.engine.data.CertificateType r9) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getEngineVersion()
            tb.w r0 = r5.e(r0)
            java.lang.String r1 = r6.getSchemaVersion()
            tb.w r1 = r5.e(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = r6.getEngine()
            java.lang.String r4 = "CERTLOGIC"
            boolean r3 = hc.t.a(r3, r4)
            r4 = 1
            if (r3 == 0) goto L4e
            if (r0 == 0) goto L4e
            tb.w<java.lang.Integer, java.lang.Integer, java.lang.Integer> r3 = dgca.verifier.app.engine.DefaultCertLogicEngine.f8949d
            boolean r0 = r5.c(r3, r0)
            if (r0 == 0) goto L4e
            if (r8 == 0) goto L4e
            if (r1 == 0) goto L4e
            java.lang.Object r0 = r8.f()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r3 = r1.f()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r0 != r3) goto L4e
            boolean r8 = r5.c(r8, r1)
            if (r8 == 0) goto L4e
            r8 = r4
            goto L4f
        L4e:
            r8 = 0
        L4f:
            if (r8 == 0) goto L6f
            dgca.verifier.app.engine.JsonLogicValidator r8 = r5.f8951b     // Catch: java.lang.Exception -> L6b
            com.fasterxml.jackson.databind.JsonNode r0 = r6.getLogic()     // Catch: java.lang.Exception -> L6b
            boolean r8 = r8.a(r0, r7)     // Catch: java.lang.Exception -> L6b
            if (r8 != r4) goto L60
            dgca.verifier.app.engine.Result r8 = dgca.verifier.app.engine.Result.PASSED     // Catch: java.lang.Exception -> L6b
            goto L71
        L60:
            if (r8 != 0) goto L65
            dgca.verifier.app.engine.Result r8 = dgca.verifier.app.engine.Result.FAIL     // Catch: java.lang.Exception -> L6b
            goto L71
        L65:
            tb.p r8 = new tb.p     // Catch: java.lang.Exception -> L6b
            r8.<init>()     // Catch: java.lang.Exception -> L6b
            throw r8     // Catch: java.lang.Exception -> L6b
        L6b:
            r8 = move-exception
            r2.add(r8)
        L6f:
            dgca.verifier.app.engine.Result r8 = dgca.verifier.app.engine.Result.OPEN
        L71:
            dgca.verifier.app.engine.AffectedFieldsDataRetriever r0 = r5.f8950a
            java.lang.String r7 = r0.a(r6, r7, r9)
            dgca.verifier.app.engine.ValidationResult r9 = new dgca.verifier.app.engine.ValidationResult
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L80
            r2 = 0
        L80:
            r9.<init>(r6, r8, r7, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dgca.verifier.app.engine.DefaultCertLogicEngine.b(dgca.verifier.app.engine.data.Rule, com.fasterxml.jackson.databind.node.ObjectNode, tb.w, dgca.verifier.app.engine.data.CertificateType):dgca.verifier.app.engine.ValidationResult");
    }

    private final boolean c(w<Integer, Integer, Integer> wVar, w<Integer, Integer, Integer> wVar2) {
        return wVar.f().intValue() > wVar2.f().intValue() || (wVar.f().intValue() == wVar2.f().intValue() && (wVar.g().intValue() > wVar2.g().intValue() || (wVar.g().intValue() == wVar2.g().intValue() && wVar.h().intValue() >= wVar2.h().intValue())));
    }

    private final ObjectNode d(ExternalParameter externalParameter, String str) {
        ObjectNode createObjectNode = this.f8952c.createObjectNode();
        ObjectMapper objectMapper = this.f8952c;
        String writeValueAsString = objectMapper.writeValueAsString(externalParameter);
        t.d(writeValueAsString, "objectMapper.writeValueAsString(externalParameter)");
        createObjectNode.set("external", (JsonNode) objectMapper.readValue(writeValueAsString, new TypeReference<JsonNode>() { // from class: dgca.verifier.app.engine.DefaultCertLogicEngine$prepareData$lambda-0$$inlined$readValue$1
        }));
        createObjectNode.set("payload", (JsonNode) this.f8952c.readValue(str, new TypeReference<JsonNode>() { // from class: dgca.verifier.app.engine.DefaultCertLogicEngine$prepareData$lambda-0$$inlined$readValue$2
        }));
        t.d(createObjectNode, "objectMapper.createObjec…(payload)\n        )\n    }");
        return createObjectNode;
    }

    private final w<Integer, Integer, Integer> e(String str) {
        List x02;
        try {
            x02 = y.x0(str, new char[]{'.'}, false, 0, 6, null);
            return new w<>(Integer.valueOf(Integer.parseInt((String) x02.get(0))), Integer.valueOf(Integer.parseInt((String) x02.get(1))), Integer.valueOf(Integer.parseInt((String) x02.get(2))));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // dgca.verifier.app.engine.CertLogicEngine
    public List<ValidationResult> a(CertificateType certificateType, String str, List<Rule> list, ExternalParameter externalParameter, String str2) {
        int s10;
        List<ValidationResult> h10;
        t.e(certificateType, "certificateType");
        t.e(str, "hcertVersionString");
        t.e(list, "rules");
        t.e(externalParameter, "externalParameter");
        t.e(str2, "payload");
        if (list.isEmpty()) {
            h10 = u.h();
            return h10;
        }
        ObjectNode d10 = d(externalParameter, str2);
        w<Integer, Integer, Integer> e10 = e(str);
        s10 = v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Rule rule : list) {
            arrayList.add(b(rule, d10, e10, certificateType));
        }
        return arrayList;
    }
}
