package f9;

import android.app.Application;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dgca.verifier.app.engine.AffectedFieldsDataRetriever;
import dgca.verifier.app.engine.CertLogicEngine;
import dgca.verifier.app.engine.DefaultAffectedFieldsDataRetriever;
import dgca.verifier.app.engine.DefaultCertLogicEngine;
import dgca.verifier.app.engine.DefaultJsonLogicValidator;
import dgca.verifier.app.engine.JsonLogicValidator;
import hc.t;
import hc.v;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.m;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lf9/a;", BuildConfig.FLAVOR, "Lcom/fasterxml/jackson/databind/ObjectMapper;", "objectMapper$delegate", "Lkotlin/Lazy;", "i", "()Lcom/fasterxml/jackson/databind/ObjectMapper;", "objectMapper", BuildConfig.FLAVOR, "jsonSchema$delegate", "h", "()Ljava/lang/String;", "jsonSchema", "Ldgca/verifier/app/engine/AffectedFieldsDataRetriever;", "affectedFieldsDataRetriever$delegate", "e", "()Ldgca/verifier/app/engine/AffectedFieldsDataRetriever;", "affectedFieldsDataRetriever", "Ldgca/verifier/app/engine/JsonLogicValidator;", "jsonLogicValidator$delegate", "g", "()Ldgca/verifier/app/engine/JsonLogicValidator;", "jsonLogicValidator", "Ldgca/verifier/app/engine/CertLogicEngine;", "certLogicEngine$delegate", "f", "()Ldgca/verifier/app/engine/CertLogicEngine;", "certLogicEngine", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final Application f9954a;

    /* renamed from: b */
    private final Lazy f9955b;

    /* renamed from: c */
    private final Lazy f9956c;

    /* renamed from: d */
    private final Lazy f9957d;

    /* renamed from: e */
    private final Lazy f9958e;

    /* renamed from: f */
    private final Lazy f9959f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldgca/verifier/app/engine/DefaultAffectedFieldsDataRetriever;", "b", "()Ldgca/verifier/app/engine/DefaultAffectedFieldsDataRetriever;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: f9.a$a */
    /* loaded from: classes.dex */
    public static final class C0149a extends v implements gc.a<DefaultAffectedFieldsDataRetriever> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0149a() {
            super(0);
            a.this = r1;
        }

        /* renamed from: b */
        public final DefaultAffectedFieldsDataRetriever invoke() {
            JsonNode readTree = a.this.i().readTree(a.this.h());
            t.d(readTree, "objectMapper.readTree(jsonSchema)");
            return new DefaultAffectedFieldsDataRetriever(readTree, a.this.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldgca/verifier/app/engine/DefaultCertLogicEngine;", "b", "()Ldgca/verifier/app/engine/DefaultCertLogicEngine;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<DefaultCertLogicEngine> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            a.this = r1;
        }

        /* renamed from: b */
        public final DefaultCertLogicEngine invoke() {
            return new DefaultCertLogicEngine(a.this.e(), a.this.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldgca/verifier/app/engine/DefaultJsonLogicValidator;", "b", "()Ldgca/verifier/app/engine/DefaultJsonLogicValidator;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<DefaultJsonLogicValidator> {

        /* renamed from: c */
        public static final c f9962c = new c();

        c() {
            super(0);
        }

        /* renamed from: b */
        public final DefaultJsonLogicValidator invoke() {
            return new DefaultJsonLogicValidator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            a.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            return z9.a.a(a.this.f9954a, "covpass-sdk/json-schema-v1.json");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/fasterxml/jackson/databind/ObjectMapper;", "b", "()Lcom/fasterxml/jackson/databind/ObjectMapper;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends v implements gc.a<ObjectMapper> {

        /* renamed from: c */
        public static final e f9964c = new e();

        e() {
            super(0);
        }

        /* renamed from: b */
        public final ObjectMapper invoke() {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.findAndRegisterModules();
            return objectMapper;
        }
    }

    public a(Application application) {
        Lazy a10;
        Lazy a11;
        Lazy a12;
        Lazy a13;
        Lazy a14;
        t.e(application, "application");
        this.f9954a = application;
        a10 = m.a(e.f9964c);
        this.f9955b = a10;
        a11 = m.a(new d());
        this.f9956c = a11;
        a12 = m.a(c.f9962c);
        this.f9957d = a12;
        a13 = m.a(new C0149a());
        this.f9958e = a13;
        a14 = m.a(new b());
        this.f9959f = a14;
    }

    public final AffectedFieldsDataRetriever e() {
        return (AffectedFieldsDataRetriever) this.f9958e.getValue();
    }

    public final String h() {
        return (String) this.f9956c.getValue();
    }

    public final ObjectMapper i() {
        return (ObjectMapper) this.f9955b.getValue();
    }

    public final CertLogicEngine f() {
        return (CertLogicEngine) this.f9959f.getValue();
    }

    public final JsonLogicValidator g() {
        return (JsonLogicValidator) this.f9957d.getValue();
    }
}
