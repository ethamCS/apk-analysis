package pb;

import hc.t;
import kotlin.Metadata;
import ob.b0;
import ob.c0;
import ob.h0;
import ob.i0;
import ob.k0;
import ob.l0;
import ob.r;
import ob.u;
import ob.z;
import org.conscrypt.BuildConfig;
import tb.i;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0007\u001a\u0016\u0010\t\u001a\u0004\u0018\u00010\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0007\u001a\u0014\u0010\r\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0007\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0007*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u001e\u0010\u0012\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u0016\u0010\u0013\u001a\u00020\u0007*\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\n\u001a\u00020\u0007H\u0007\u001a\u0014\u0010\u0015\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\u0016"}, d2 = {"Lob/u;", "Lob/r;", "builder", BuildConfig.FLAVOR, "k", "Lob/z;", "minSize", "Lpb/a;", "f", "g", "current", "Ltb/e0;", "c", "d", "h", "e", "Lob/h0;", "capacity", "i", "j", "a", "b", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public static final byte[] f19029a = new byte[0];

    public static final void a(h0 h0Var, a aVar) {
        t.e(h0Var, "<this>");
        t.e(aVar, "current");
        if (h0Var instanceof ob.c) {
            ((ob.c) h0Var).e();
        } else {
            b(h0Var, aVar);
        }
    }

    private static final void b(h0 h0Var, a aVar) {
        i0.c(h0Var, aVar, 0, 2, null);
        aVar.c1(a.Companion.c());
    }

    public static final void c(z zVar, a aVar) {
        t.e(zVar, "<this>");
        t.e(aVar, "current");
        if (aVar == zVar) {
            return;
        }
        if (!(zVar instanceof ob.a)) {
            d(zVar, aVar);
            return;
        }
        if (!(aVar.s() > aVar.p())) {
            ((ob.a) zVar).B(aVar);
            return;
        }
        ob.a aVar2 = (ob.a) zVar;
        if (aVar.i() - aVar.j() < 8) {
            aVar2.e0(aVar);
        } else {
            aVar2.q1(aVar.p());
        }
    }

    private static final void d(z zVar, a aVar) {
        b0.a(zVar, (aVar.i() - (aVar.j() - aVar.s())) - (aVar.s() - aVar.p()));
        aVar.c1(a.Companion.c());
    }

    private static final a e(z zVar, a aVar) {
        b0.a(zVar, (aVar.i() - (aVar.j() - aVar.s())) - (aVar.s() - aVar.p()));
        aVar.W();
        if (zVar.a1() || c0.b(zVar, aVar, 0, 0, 0, 14, null) <= 0) {
            aVar.c1(a.Companion.c());
            return null;
        }
        return aVar;
    }

    public static final a f(z zVar, int i10) {
        t.e(zVar, "<this>");
        if (zVar instanceof ob.a) {
            return ((ob.a) zVar).h1(i10);
        }
        if (!(zVar instanceof a)) {
            return g(zVar, i10);
        }
        ob.e eVar = (ob.e) zVar;
        if (!(eVar.s() > eVar.p())) {
            return null;
        }
        return (a) zVar;
    }

    private static final a g(z zVar, int i10) {
        if (zVar.a1()) {
            return null;
        }
        a c02 = a.Companion.c().c0();
        int Z = (int) zVar.Z(c02.n(), c02.s(), 0L, i10, c02.j() - c02.s());
        c02.b(Z);
        if (Z >= i10) {
            return c02;
        }
        l0.a(i10);
        throw new i();
    }

    public static final a h(z zVar, a aVar) {
        t.e(zVar, "<this>");
        t.e(aVar, "current");
        if (aVar != zVar) {
            return zVar instanceof ob.a ? ((ob.a) zVar).M(aVar) : e(zVar, aVar);
        }
        ob.e eVar = (ob.e) zVar;
        if (!(eVar.s() > eVar.p())) {
            return null;
        }
        return (a) zVar;
    }

    public static final a i(h0 h0Var, int i10, a aVar) {
        t.e(h0Var, "<this>");
        if (h0Var instanceof ob.c) {
            if (aVar != null) {
                ((ob.c) h0Var).e();
            }
            return ((ob.c) h0Var).w0(i10);
        }
        return j(h0Var, aVar);
    }

    private static final a j(h0 h0Var, a aVar) {
        if (aVar != null) {
            i0.c(h0Var, aVar, 0, 2, null);
            aVar.W();
            return aVar;
        }
        return a.Companion.c().c0();
    }

    public static final int k(u uVar, r rVar) {
        t.e(uVar, "<this>");
        t.e(rVar, "builder");
        int r12 = rVar.r1();
        a e12 = rVar.e1();
        if (e12 == null) {
            return 0;
        }
        if (r12 > k0.b() || e12.M0() != null || !uVar.v1(e12)) {
            uVar.e(e12);
            return r12;
        }
        rVar.b();
        return r12;
    }
}
