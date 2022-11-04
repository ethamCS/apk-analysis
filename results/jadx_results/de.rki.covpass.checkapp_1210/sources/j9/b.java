package j9;

import d9.i;
import de.rki.covpass.sdk.rules.remote.rules.domestic.CovPassDomesticRuleIdentifierRemote;
import de.rki.covpass.sdk.rules.remote.rules.eu.CovPassRuleRemote;
import dgca.verifier.app.engine.data.RuleCertificateType;
import dgca.verifier.app.engine.data.Type;
import gc.l;
import gc.p;
import hc.t;
import hc.v;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005J9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lj9/b;", "Lj9/e;", BuildConfig.FLAVOR, "Lq9/b;", "d", "(Lxb/d;)Ljava/lang/Object;", "Lj9/d;", "rules", "Ltb/e0;", "f", "(Ljava/util/List;Lxb/d;)Ljava/lang/Object;", "e", BuildConfig.FLAVOR, "countryIsoCode", "j$/time/ZonedDateTime", "validationClock", "Ldgca/verifier/app/engine/data/Type;", "type", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "ruleCertificateType", "a", "(Ljava/lang/String;Lj$/time/ZonedDateTime;Ldgca/verifier/app/engine/data/Type;Ldgca/verifier/app/engine/data/RuleCertificateType;Lxb/d;)Ljava/lang/Object;", "c", "Ld9/i;", "remoteDataSource", "Lq9/i;", "localDataSource", "Lv9/e;", "rulesUpdateRepository", "<init>", "(Ld9/i;Lq9/i;Lv9/e;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a */
    private final i f14188a;

    /* renamed from: b */
    private final q9.i f14189b;

    /* renamed from: c */
    private final v9.e f14190c;

    @zb.f(c = "de.rki.covpass.sdk.rules.CovPassDomesticRulesRepository", f = "CovPassDomesticRulesRepository.kt", l = {35, 37, 45, 50, 54}, m = "loadRules")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        Object U3;
        Object V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f14191x;

        /* renamed from: y */
        Object f14192y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return b.this.e(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq9/b;", "it", BuildConfig.FLAVOR, "b", "(Lq9/b;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: j9.b$b */
    /* loaded from: classes.dex */
    public static final class C0204b extends v implements l<q9.b, String> {

        /* renamed from: c */
        public static final C0204b f14193c = new C0204b();

        C0204b() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(q9.b bVar) {
            t.e(bVar, "it");
            return bVar.f();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lde/rki/covpass/sdk/rules/remote/rules/domestic/CovPassDomesticRuleIdentifierRemote;", "identifier", "Lj9/d;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.CovPassDomesticRulesRepository$loadRules$newRules$1", f = "CovPassDomesticRulesRepository.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends zb.l implements p<CovPassDomesticRuleIdentifierRemote, xb.d<? super j9.d>, Object> {
        /* synthetic */ Object U3;

        /* renamed from: y */
        int f14194y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(2, dVar);
            b.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            CovPassDomesticRuleIdentifierRemote covPassDomesticRuleIdentifierRemote;
            c10 = yb.d.c();
            int i10 = this.f14194y;
            if (i10 == 0) {
                tb.t.b(obj);
                CovPassDomesticRuleIdentifierRemote covPassDomesticRuleIdentifierRemote2 = (CovPassDomesticRuleIdentifierRemote) this.U3;
                i iVar = b.this.f14188a;
                String a10 = covPassDomesticRuleIdentifierRemote2.a();
                this.U3 = covPassDomesticRuleIdentifierRemote2;
                this.f14194y = 1;
                Object a11 = iVar.a(a10, this);
                if (a11 == c10) {
                    return c10;
                }
                covPassDomesticRuleIdentifierRemote = covPassDomesticRuleIdentifierRemote2;
                obj = a11;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                covPassDomesticRuleIdentifierRemote = (CovPassDomesticRuleIdentifierRemote) this.U3;
                tb.t.b(obj);
            }
            return t9.a.a((CovPassRuleRemote) obj, covPassDomesticRuleIdentifierRemote.a());
        }

        /* renamed from: d0 */
        public final Object u(CovPassDomesticRuleIdentifierRemote covPassDomesticRuleIdentifierRemote, xb.d<? super j9.d> dVar) {
            return ((c) j(covPassDomesticRuleIdentifierRemote, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.U3 = obj;
            return cVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lde/rki/covpass/sdk/rules/remote/rules/domestic/CovPassDomesticRuleIdentifierRemote;", "it", BuildConfig.FLAVOR, "b", "(Lde/rki/covpass/sdk/rules/remote/rules/domestic/CovPassDomesticRuleIdentifierRemote;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends v implements l<CovPassDomesticRuleIdentifierRemote, String> {

        /* renamed from: c */
        public static final d f14195c = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(CovPassDomesticRuleIdentifierRemote covPassDomesticRuleIdentifierRemote) {
            t.e(covPassDomesticRuleIdentifierRemote, "it");
            return covPassDomesticRuleIdentifierRemote.b();
        }
    }

    public b(i iVar, q9.i iVar2, v9.e eVar) {
        t.e(iVar, "remoteDataSource");
        t.e(iVar2, "localDataSource");
        t.e(eVar, "rulesUpdateRepository");
        this.f14188a = iVar;
        this.f14189b = iVar2;
        this.f14190c = eVar;
    }

    @Override // j9.e
    public Object a(String str, ZonedDateTime zonedDateTime, Type type, RuleCertificateType ruleCertificateType, xb.d<? super List<j9.d>> dVar) {
        return this.f14189b.d(str, zonedDateTime, type, ruleCertificateType, dVar);
    }

    public final Object c(xb.d<? super e0> dVar) {
        Object c10;
        Object b10 = this.f14189b.b(dVar);
        c10 = yb.d.c();
        return b10 == c10 ? b10 : e0.f22152a;
    }

    public final Object d(xb.d<? super List<q9.b>> dVar) {
        return this.f14189b.c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(xb.d<? super tb.e0> r19) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.b.e(xb.d):java.lang.Object");
    }

    public final Object f(List<j9.d> list, xb.d<? super e0> dVar) {
        List h10;
        Object c10;
        q9.i iVar = this.f14189b;
        h10 = u.h();
        Object e10 = iVar.e(h10, list, dVar);
        c10 = yb.d.c();
        return e10 == c10 ? e10 : e0.f22152a;
    }
}
