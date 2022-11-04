package ad;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import oe.l1;
import xc.a1;
import xc.b;
import xc.f1;
import xc.j1;
import xc.x0;
/* loaded from: classes.dex */
public class f extends p implements xc.d {

    /* renamed from: t4 */
    protected final boolean f306t4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xc.e eVar, xc.l lVar, yc.g gVar, boolean z10, b.a aVar, a1 a1Var) {
        super(eVar, lVar, gVar, wd.h.f24819i, aVar, a1Var);
        if (eVar == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (aVar == null) {
            e0(2);
        }
        if (a1Var == null) {
            e0(3);
        }
        this.f306t4 = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void e0(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.f.e0(int):void");
    }

    private List<x0> t1() {
        xc.e b10 = b();
        if (!b10.O0().isEmpty()) {
            List<x0> O0 = b10.O0();
            if (O0 == null) {
                e0(15);
            }
            return O0;
        }
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            e0(16);
        }
        return emptyList;
    }

    public static f w1(xc.e eVar, yc.g gVar, boolean z10, a1 a1Var) {
        if (eVar == null) {
            e0(4);
        }
        if (gVar == null) {
            e0(5);
        }
        if (a1Var == null) {
            e0(6);
        }
        return new f(eVar, null, gVar, z10, b.a.DECLARATION, a1Var);
    }

    public f A1(List<j1> list, xc.u uVar, List<f1> list2) {
        if (list == null) {
            e0(10);
        }
        if (uVar == null) {
            e0(11);
        }
        if (list2 == null) {
            e0(12);
        }
        super.a1(null, u1(), t1(), list2, list, null, xc.e0.FINAL, uVar);
        return this;
    }

    @Override // xc.l
    public boolean S() {
        return this.f306t4;
    }

    @Override // xc.l
    public xc.e T() {
        xc.e b10 = b();
        if (b10 == null) {
            e0(18);
        }
        return b10;
    }

    @Override // ad.p, ad.k, ad.j, xc.m, xc.h
    /* renamed from: a */
    public xc.d z0() {
        xc.d dVar = (xc.d) super.z0();
        if (dVar == null) {
            e0(19);
        }
        return dVar;
    }

    @Override // ad.p, xc.y, xc.c1
    public xc.d c(l1 l1Var) {
        if (l1Var == null) {
            e0(20);
        }
        return (xc.d) super.c(l1Var);
    }

    @Override // ad.p, xc.y, xc.b, xc.a
    public Collection<? extends xc.y> f() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            e0(21);
        }
        return emptySet;
    }

    @Override // ad.p, xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        return oVar.b(this, d10);
    }

    @Override // ad.p, xc.b
    public void t0(Collection<? extends xc.b> collection) {
        if (collection == null) {
            e0(22);
        }
    }

    public x0 u1() {
        xc.e b10 = b();
        if (b10.m0()) {
            xc.m b11 = b10.b();
            if (!(b11 instanceof xc.e)) {
                return null;
            }
            return ((xc.e) b11).S0();
        }
        return null;
    }

    /* renamed from: v1 */
    public xc.d n0(xc.m mVar, xc.e0 e0Var, xc.u uVar, b.a aVar, boolean z10) {
        xc.d dVar = (xc.d) super.n0(mVar, e0Var, uVar, aVar, z10);
        if (dVar == null) {
            e0(27);
        }
        return dVar;
    }

    /* renamed from: x1 */
    public f U0(xc.m mVar, xc.y yVar, b.a aVar, wd.f fVar, yc.g gVar, a1 a1Var) {
        if (mVar == null) {
            e0(23);
        }
        if (aVar == null) {
            e0(24);
        }
        if (gVar == null) {
            e0(25);
        }
        if (a1Var == null) {
            e0(26);
        }
        b.a aVar2 = b.a.DECLARATION;
        if (aVar == aVar2 || aVar == b.a.SYNTHESIZED) {
            return new f((xc.e) mVar, this, gVar, this.f306t4, aVar2, a1Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    /* renamed from: y1 */
    public xc.e b() {
        xc.e eVar = (xc.e) super.b();
        if (eVar == null) {
            e0(17);
        }
        return eVar;
    }

    public f z1(List<j1> list, xc.u uVar) {
        if (list == null) {
            e0(13);
        }
        if (uVar == null) {
            e0(14);
        }
        A1(list, uVar, b().A());
        return this;
    }
}
