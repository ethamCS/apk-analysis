package ad;

import ad.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import ub.y0;
import xc.h0;
import xc.q0;
/* loaded from: classes.dex */
public final class x extends j implements xc.h0 {
    private final Map<xc.g0<?>, Object> U3;
    private final a0 V3;
    private v W3;
    private xc.m0 X3;
    private boolean Y3;
    private final ne.g<wd.c, q0> Z3;

    /* renamed from: a4 */
    private final Lazy f410a4;

    /* renamed from: q */
    private final ne.n f411q;

    /* renamed from: x */
    private final uc.h f412x;

    /* renamed from: y */
    private final wd.f f413y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<i> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            x.this = r1;
        }

        /* renamed from: b */
        public final i invoke() {
            int s10;
            v vVar = x.this.W3;
            x xVar = x.this;
            if (vVar == null) {
                throw new AssertionError("Dependencies of module " + xVar.Y0() + " were not set before querying module content");
            }
            List<x> b10 = vVar.b();
            x.this.X0();
            b10.contains(x.this);
            for (x xVar2 : b10) {
                xVar2.c1();
            }
            s10 = ub.v.s(b10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (x xVar3 : b10) {
                xc.m0 m0Var = xVar3.X3;
                hc.t.b(m0Var);
                arrayList.add(m0Var);
            }
            return new i(arrayList, "CompositeProvider@ModuleDescriptor for " + x.this.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<wd.c, q0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(1);
            x.this = r1;
        }

        /* renamed from: b */
        public final q0 invoke(wd.c cVar) {
            hc.t.e(cVar, "fqName");
            a0 a0Var = x.this.V3;
            x xVar = x.this;
            return a0Var.a(xVar, cVar, xVar.f411q);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(wd.f fVar, ne.n nVar, uc.h hVar, xd.a aVar) {
        this(fVar, nVar, hVar, aVar, null, null, 48, null);
        hc.t.e(fVar, "moduleName");
        hc.t.e(nVar, "storageManager");
        hc.t.e(hVar, "builtIns");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(wd.f fVar, ne.n nVar, uc.h hVar, xd.a aVar, Map<xc.g0<?>, ? extends Object> map, wd.f fVar2) {
        super(yc.g.Companion.b(), fVar);
        Lazy a10;
        hc.t.e(fVar, "moduleName");
        hc.t.e(nVar, "storageManager");
        hc.t.e(hVar, "builtIns");
        hc.t.e(map, "capabilities");
        this.f411q = nVar;
        this.f412x = hVar;
        this.f413y = fVar2;
        if (!fVar.l()) {
            throw new IllegalArgumentException("Module name must be special: " + fVar);
        }
        this.U3 = map;
        a0 a0Var = (a0) o0(a0.Companion.a());
        this.V3 = a0Var == null ? a0.b.f256a : a0Var;
        this.Y3 = true;
        this.Z3 = nVar.b(new b());
        a10 = tb.m.a(new a());
        this.f410a4 = a10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ x(wd.f r10, ne.n r11, uc.h r12, xd.a r13, java.util.Map r14, wd.f r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r16 & 16
            if (r0 == 0) goto L12
            java.util.Map r0 = ub.n0.h()
            r7 = r0
            goto L13
        L12:
            r7 = r14
        L13:
            r0 = r16 & 32
            if (r0 == 0) goto L19
            r8 = r1
            goto L1a
        L19:
            r8 = r15
        L1a:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.x.<init>(wd.f, ne.n, uc.h, xd.a, java.util.Map, wd.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String Y0() {
        String fVar = getName().toString();
        hc.t.d(fVar, "name.toString()");
        return fVar;
    }

    private final i a1() {
        return (i) this.f410a4.getValue();
    }

    public final boolean c1() {
        return this.X3 != null;
    }

    @Override // xc.h0
    public q0 F(wd.c cVar) {
        hc.t.e(cVar, "fqName");
        X0();
        return this.Z3.invoke(cVar);
    }

    @Override // xc.h0
    public boolean O(xc.h0 h0Var) {
        boolean N;
        hc.t.e(h0Var, "targetModule");
        if (hc.t.a(this, h0Var)) {
            return true;
        }
        v vVar = this.W3;
        hc.t.b(vVar);
        N = ub.c0.N(vVar.a(), h0Var);
        return N || i0().contains(h0Var) || h0Var.i0().contains(this);
    }

    public void X0() {
        if (!d1()) {
            xc.b0.a(this);
        }
    }

    public final xc.m0 Z0() {
        X0();
        return a1();
    }

    @Override // xc.m, xc.n, xc.y, xc.l
    public xc.m b() {
        return h0.a.b(this);
    }

    public final void b1(xc.m0 m0Var) {
        hc.t.e(m0Var, "providerForModuleContent");
        c1();
        this.X3 = m0Var;
    }

    public boolean d1() {
        return this.Y3;
    }

    public final void e1(v vVar) {
        hc.t.e(vVar, "dependencies");
        this.W3 = vVar;
    }

    public final void f1(List<x> list) {
        Set<x> b10;
        hc.t.e(list, "descriptors");
        b10 = y0.b();
        g1(list, b10);
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        return (R) h0.a.a(this, oVar, d10);
    }

    public final void g1(List<x> list, Set<x> set) {
        List h10;
        Set b10;
        hc.t.e(list, "descriptors");
        hc.t.e(set, "friends");
        h10 = ub.u.h();
        b10 = y0.b();
        e1(new w(list, set, h10, b10));
    }

    public final void h1(x... xVarArr) {
        List<x> i02;
        hc.t.e(xVarArr, "descriptors");
        i02 = ub.m.i0(xVarArr);
        f1(i02);
    }

    @Override // xc.h0
    public List<xc.h0> i0() {
        v vVar = this.W3;
        if (vVar != null) {
            return vVar.c();
        }
        throw new AssertionError("Dependencies of module " + Y0() + " were not set");
    }

    @Override // xc.h0
    public <T> T o0(xc.g0<T> g0Var) {
        hc.t.e(g0Var, "capability");
        T t10 = (T) this.U3.get(g0Var);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // xc.h0
    public Collection<wd.c> t(wd.c cVar, gc.l<? super wd.f, Boolean> lVar) {
        hc.t.e(cVar, "fqName");
        hc.t.e(lVar, "nameFilter");
        X0();
        return Z0().t(cVar, lVar);
    }

    @Override // xc.h0
    public uc.h x() {
        return this.f412x;
    }
}
