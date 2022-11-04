package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import xb.g;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a(\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u0011H\u0080\u0010\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/q0;", "Lxb/g;", "context", "d", "addedContext", "e", BuildConfig.FLAVOR, "c", "originalContext", "appendContext", "isNewCoroutine", "a", "Lxb/d;", BuildConfig.FLAVOR, "oldValue", "Lkotlinx/coroutines/d3;", "g", "Lzb/e;", "f", BuildConfig.FLAVOR, "b", "(Lxb/g;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class k0 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxb/g;", "result", "Lxb/g$b;", "element", "b", "(Lxb/g;Lxb/g$b;)Lxb/g;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.p<xb.g, g.b, xb.g> {

        /* renamed from: c */
        public static final a f15475c = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final xb.g u(xb.g gVar, g.b bVar) {
            return bVar instanceof i0 ? gVar.B(((i0) bVar).W()) : gVar.B(bVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxb/g;", "result", "Lxb/g$b;", "element", "b", "(Lxb/g;Lxb/g$b;)Lxb/g;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.p<xb.g, g.b, xb.g> {

        /* renamed from: c */
        final /* synthetic */ hc.j0<xb.g> f15476c;

        /* renamed from: d */
        final /* synthetic */ boolean f15477d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(hc.j0<xb.g> j0Var, boolean z10) {
            super(2);
            this.f15476c = j0Var;
            this.f15477d = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, xb.g] */
        /* renamed from: b */
        public final xb.g u(xb.g gVar, g.b bVar) {
            if (!(bVar instanceof i0)) {
                return gVar.B(bVar);
            }
            g.b i10 = this.f15476c.f11764c.i(bVar.getKey());
            if (i10 != null) {
                hc.j0<xb.g> j0Var = this.f15476c;
                j0Var.f11764c = j0Var.f11764c.s(bVar.getKey());
                return gVar.B(((i0) bVar).f1(i10));
            }
            i0 i0Var = (i0) bVar;
            if (this.f15477d) {
                i0Var = i0Var.W();
            }
            return gVar.B(i0Var);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "result", "Lxb/g$b;", "it", "b", "(ZLxb/g$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class c extends hc.v implements gc.p<Boolean, g.b, Boolean> {

        /* renamed from: c */
        public static final c f15478c = new c();

        c() {
            super(2);
        }

        public final Boolean b(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof i0));
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ Boolean u(Boolean bool, g.b bVar) {
            return b(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final xb.g a(xb.g gVar, xb.g gVar2, boolean z10) {
        boolean c10 = c(gVar);
        boolean c11 = c(gVar2);
        if (c10 || c11) {
            hc.j0 j0Var = new hc.j0();
            j0Var.f11764c = gVar2;
            xb.h hVar = xb.h.f25516c;
            xb.g gVar3 = (xb.g) gVar.f(hVar, new b(j0Var, z10));
            if (c11) {
                j0Var.f11764c = ((xb.g) j0Var.f11764c).f(hVar, a.f15475c);
            }
            return gVar3.B((xb.g) j0Var.f11764c);
        }
        return gVar.B(gVar2);
    }

    public static final String b(xb.g gVar) {
        return null;
    }

    private static final boolean c(xb.g gVar) {
        return ((Boolean) gVar.f(Boolean.FALSE, c.f15478c)).booleanValue();
    }

    public static final xb.g d(q0 q0Var, xb.g gVar) {
        xb.g a10 = a(q0Var.h(), gVar, true);
        return (a10 == g1.a() || a10.i(xb.e.X0) != null) ? a10 : a10.B(g1.a());
    }

    public static final xb.g e(xb.g gVar, xb.g gVar2) {
        return !c(gVar2) ? gVar.B(gVar2) : a(gVar, gVar2, false);
    }

    public static final d3<?> f(zb.e eVar) {
        while (!(eVar instanceof c1) && (eVar = eVar.x()) != null) {
            if (eVar instanceof d3) {
                return (d3) eVar;
            }
        }
        return null;
    }

    public static final d3<?> g(xb.d<?> dVar, xb.g gVar, Object obj) {
        if (!(dVar instanceof zb.e)) {
            return null;
        }
        if (!(gVar.i(e3.f15336c) != null)) {
            return null;
        }
        d3<?> f10 = f((zb.e) dVar);
        if (f10 != null) {
            f10.n1(gVar, obj);
        }
        return f10;
    }
}
