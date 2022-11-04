package gd;

import ae.e;
import ae.j;
import java.util.Iterator;
import java.util.List;
import xc.f1;
import xc.j1;
import xc.x0;
import xc.y;
import xc.z0;
/* loaded from: classes.dex */
public final class l implements ae.e {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10733a;

        static {
            int[] iArr = new int[j.i.a.values().length];
            iArr[j.i.a.OVERRIDABLE.ordinal()] = 1;
            f10733a = iArr;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends hc.v implements gc.l<j1, oe.e0> {

        /* renamed from: c */
        public static final b f10734c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final oe.e0 invoke(j1 j1Var) {
            return j1Var.getType();
        }
    }

    @Override // ae.e
    public e.b a(xc.a aVar, xc.a aVar2, xc.e eVar) {
        List<f1> p10;
        af.h M;
        af.h z10;
        af.h C;
        List l10;
        af.h B;
        boolean z11;
        xc.a c10;
        List<f1> p11;
        List<f1> h10;
        boolean z12;
        hc.t.e(aVar, "superDescriptor");
        hc.t.e(aVar2, "subDescriptor");
        if (aVar2 instanceof id.e) {
            id.e eVar2 = (id.e) aVar2;
            hc.t.d(eVar2.p(), "subDescriptor.typeParameters");
            if (!(!p10.isEmpty())) {
                j.i w9 = ae.j.w(aVar, aVar2);
                if ((w9 != null ? w9.c() : null) != null) {
                    return e.b.UNKNOWN;
                }
                List<j1> o10 = eVar2.o();
                hc.t.d(o10, "subDescriptor.valueParameters");
                M = ub.c0.M(o10);
                z10 = af.p.z(M, b.f10734c);
                oe.e0 e10 = eVar2.e();
                hc.t.b(e10);
                C = af.p.C(z10, e10);
                x0 U = eVar2.U();
                l10 = ub.u.l(U != null ? U.getType() : null);
                B = af.p.B(C, l10);
                Iterator it = B.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        break;
                    }
                    oe.e0 e0Var = (oe.e0) it.next();
                    if (!(!e0Var.U0().isEmpty()) || (e0Var.Z0() instanceof ld.f)) {
                        z12 = false;
                        continue;
                    } else {
                        z12 = true;
                        continue;
                    }
                    if (z12) {
                        z11 = true;
                        break;
                    }
                }
                if (!z11 && (c10 = aVar.c(new ld.e(null, 1, null).c())) != null) {
                    if (c10 instanceof z0) {
                        z0 z0Var = (z0) c10;
                        hc.t.d(z0Var.p(), "erasedSuper.typeParameters");
                        if (!p11.isEmpty()) {
                            y.a<? extends z0> y10 = z0Var.y();
                            h10 = ub.u.h();
                            c10 = y10.h(h10).b();
                            hc.t.b(c10);
                        }
                    }
                    j.i.a c11 = ae.j.f444f.F(c10, aVar2, false).c();
                    hc.t.d(c11, "DEFAULT.isOverridableByW…Descriptor, false).result");
                    return a.f10733a[c11.ordinal()] == 1 ? e.b.OVERRIDABLE : e.b.UNKNOWN;
                }
                return e.b.UNKNOWN;
            }
        }
        return e.b.UNKNOWN;
    }

    @Override // ae.e
    public e.a b() {
        return e.a.SUCCESS_ONLY;
    }
}
