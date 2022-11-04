package j9;

import d9.l;
import de.rki.covpass.sdk.rules.remote.valuesets.CovPassValueSetIdentifierRemote;
import de.rki.covpass.sdk.rules.remote.valuesets.CovPassValueSetRemote;
import gc.p;
import hc.v;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.t;
import ub.u;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0013\u0010\f\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lj9/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lj9/f;", "valueSets", "Ltb/e0;", "e", "(Ljava/util/List;Lxb/d;)Ljava/lang/Object;", "d", "(Lxb/d;)Ljava/lang/Object;", "Ls9/a;", "c", "b", "allCovpassValueSets", "Ljava/util/List;", "getAllCovpassValueSets", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "Ld9/l;", "remoteDataSource", "Ls9/f;", "localDataSource", "Lv9/e;", "rulesUpdateRepository", "<init>", "(Ld9/l;Ls9/f;Lv9/e;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final l f14223a;

    /* renamed from: b */
    private final s9.f f14224b;

    /* renamed from: c */
    private final v9.e f14225c;

    /* renamed from: d */
    private List<s9.a> f14226d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.CovPassValueSetsRepository$1", f = "CovPassValueSetsRepository.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements p<q0, xb.d<? super e0>, Object> {
        int U3;

        /* renamed from: y */
        Object f14227y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            g gVar;
            c10 = yb.d.c();
            int i10 = this.U3;
            if (i10 == 0) {
                t.b(obj);
                g gVar2 = g.this;
                this.f14227y = gVar2;
                this.U3 = 1;
                Object c11 = gVar2.c(this);
                if (c11 == c10) {
                    return c10;
                }
                gVar = gVar2;
                obj = c11;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                gVar = (g) this.f14227y;
                t.b(obj);
            }
            gVar.f((List) obj);
            return e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new a(dVar);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.rules.CovPassValueSetsRepository", f = "CovPassValueSetsRepository.kt", l = {132, 134, 142, 148, 152, 153}, m = "loadValueSets")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        Object U3;
        Object V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f14228x;

        /* renamed from: y */
        Object f14229y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return g.this.d(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls9/a;", "it", BuildConfig.FLAVOR, "b", "(Ls9/a;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.l<s9.a, String> {

        /* renamed from: c */
        public static final c f14230c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(s9.a aVar) {
            hc.t.e(aVar, "it");
            return aVar.d();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lde/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetIdentifierRemote;", "identifier", "Lj9/f;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.sdk.rules.CovPassValueSetsRepository$loadValueSets$newValueSets$1", f = "CovPassValueSetsRepository.kt", l = {143}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends zb.l implements p<CovPassValueSetIdentifierRemote, xb.d<? super f>, Object> {
        /* synthetic */ Object U3;

        /* renamed from: y */
        int f14231y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(xb.d<? super d> dVar) {
            super(2, dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            CovPassValueSetIdentifierRemote covPassValueSetIdentifierRemote;
            c10 = yb.d.c();
            int i10 = this.f14231y;
            if (i10 == 0) {
                t.b(obj);
                CovPassValueSetIdentifierRemote covPassValueSetIdentifierRemote2 = (CovPassValueSetIdentifierRemote) this.U3;
                l lVar = g.this.f14223a;
                String a10 = covPassValueSetIdentifierRemote2.a();
                this.U3 = covPassValueSetIdentifierRemote2;
                this.f14231y = 1;
                Object a11 = lVar.a(a10, this);
                if (a11 == c10) {
                    return c10;
                }
                covPassValueSetIdentifierRemote = covPassValueSetIdentifierRemote2;
                obj = a11;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                covPassValueSetIdentifierRemote = (CovPassValueSetIdentifierRemote) this.U3;
                t.b(obj);
            }
            return u9.a.a((CovPassValueSetRemote) obj, covPassValueSetIdentifierRemote.a());
        }

        /* renamed from: d0 */
        public final Object u(CovPassValueSetIdentifierRemote covPassValueSetIdentifierRemote, xb.d<? super f> dVar) {
            return ((d) j(covPassValueSetIdentifierRemote, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.U3 = obj;
            return dVar2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lde/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetIdentifierRemote;", "it", BuildConfig.FLAVOR, "b", "(Lde/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetIdentifierRemote;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends v implements gc.l<CovPassValueSetIdentifierRemote, String> {

        /* renamed from: c */
        public static final e f14232c = new e();

        e() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(CovPassValueSetIdentifierRemote covPassValueSetIdentifierRemote) {
            hc.t.e(covPassValueSetIdentifierRemote, "it");
            return covPassValueSetIdentifierRemote.b();
        }
    }

    public g(l lVar, s9.f fVar, v9.e eVar) {
        List<s9.a> h10;
        hc.t.e(lVar, "remoteDataSource");
        hc.t.e(fVar, "localDataSource");
        hc.t.e(eVar, "rulesUpdateRepository");
        this.f14223a = lVar;
        this.f14224b = fVar;
        this.f14225c = eVar;
        h10 = u.h();
        this.f14226d = h10;
        k.b(null, new a(null), 1, null);
    }

    public final Object b(xb.d<? super e0> dVar) {
        Object c10;
        Object b10 = this.f14224b.b(dVar);
        c10 = yb.d.c();
        return b10 == c10 ? b10 : e0.f22152a;
    }

    public final Object c(xb.d<? super List<s9.a>> dVar) {
        return this.f14224b.c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(xb.d<? super tb.e0> r14) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.g.d(xb.d):java.lang.Object");
    }

    public final Object e(List<f> list, xb.d<? super e0> dVar) {
        List h10;
        Object c10;
        s9.f fVar = this.f14224b;
        h10 = u.h();
        Object d10 = fVar.d(h10, list, dVar);
        c10 = yb.d.c();
        return d10 == c10 ? d10 : e0.f22152a;
    }

    public final void f(List<s9.a> list) {
        hc.t.e(list, "<set-?>");
        this.f14226d = list;
    }
}
