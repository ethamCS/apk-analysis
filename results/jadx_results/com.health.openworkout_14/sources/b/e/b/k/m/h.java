package b.e.b.k.m;

import b.e.b.k.d;
import b.e.b.k.e;
import b.e.b.k.m.b;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private static b.a f2310a = new b.a();

    private static boolean a(b.e.b.k.e eVar) {
        e.b y = eVar.y();
        e.b O = eVar.O();
        b.e.b.k.f fVar = eVar.I() != null ? (b.e.b.k.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.O();
            e.b bVar2 = e.b.FIXED;
        }
        e.b bVar3 = e.b.FIXED;
        boolean z = y == bVar3 || y == e.b.WRAP_CONTENT || (y == e.b.MATCH_CONSTRAINT && eVar.n == 0 && eVar.U == 0.0f && eVar.V(0)) || eVar.e0();
        boolean z2 = O == bVar3 || O == e.b.WRAP_CONTENT || (O == e.b.MATCH_CONSTRAINT && eVar.o == 0 && eVar.U == 0.0f && eVar.V(1)) || eVar.f0();
        if (eVar.U <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    private static void b(b.e.b.k.e eVar, b.AbstractC0041b abstractC0041b, boolean z) {
        b.e.b.k.d dVar;
        b.e.b.k.d dVar2;
        b.e.b.k.d dVar3;
        b.e.b.k.d dVar4;
        b.e.b.k.d dVar5;
        if (!(eVar instanceof b.e.b.k.f) && eVar.d0() && a(eVar)) {
            b.e.b.k.f.A1(eVar, abstractC0041b, new b.a(), b.a.k);
        }
        b.e.b.k.d m = eVar.m(d.b.LEFT);
        b.e.b.k.d m2 = eVar.m(d.b.RIGHT);
        int d2 = m.d();
        int d3 = m2.d();
        if (m.c() != null && m.m()) {
            Iterator<b.e.b.k.d> it = m.c().iterator();
            while (it.hasNext()) {
                b.e.b.k.d next = it.next();
                b.e.b.k.e eVar2 = next.f2246d;
                boolean a2 = a(eVar2);
                if (eVar2.d0() && a2) {
                    b.e.b.k.f.A1(eVar2, abstractC0041b, new b.a(), b.a.k);
                }
                e.b y = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (y != bVar || a2) {
                    if (!eVar2.d0()) {
                        b.e.b.k.d dVar6 = eVar2.F;
                        if (next == dVar6 && eVar2.H.f2248f == null) {
                            int e2 = dVar6.e() + d2;
                            eVar2.p0(e2, eVar2.R() + e2);
                        } else {
                            b.e.b.k.d dVar7 = eVar2.H;
                            if (next == dVar7 && dVar6.f2248f == null) {
                                int e3 = d2 - dVar7.e();
                                eVar2.p0(e3 - eVar2.R(), e3);
                            } else if (next == dVar6 && (dVar3 = dVar7.f2248f) != null && dVar3.m() && !eVar2.Z()) {
                                d(abstractC0041b, eVar2, z);
                            }
                        }
                        b(eVar2, abstractC0041b, z);
                    }
                } else if (eVar2.y() == bVar && eVar2.r >= 0 && eVar2.q >= 0 && (eVar2.Q() == 8 || (eVar2.n == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.Z() && !eVar2.c0()) {
                        if (((next == eVar2.F && (dVar5 = eVar2.H.f2248f) != null && dVar5.m()) || (next == eVar2.H && (dVar4 = eVar2.F.f2248f) != null && dVar4.m())) && !eVar2.Z()) {
                            e(eVar, abstractC0041b, eVar2, z);
                        }
                    }
                }
            }
        }
        if (!(eVar instanceof b.e.b.k.g) && m2.c() != null && m2.m()) {
            Iterator<b.e.b.k.d> it2 = m2.c().iterator();
            while (it2.hasNext()) {
                b.e.b.k.d next2 = it2.next();
                b.e.b.k.e eVar3 = next2.f2246d;
                boolean a3 = a(eVar3);
                if (eVar3.d0() && a3) {
                    b.e.b.k.f.A1(eVar3, abstractC0041b, new b.a(), b.a.k);
                }
                boolean z2 = (next2 == eVar3.F && (dVar2 = eVar3.H.f2248f) != null && dVar2.m()) || (next2 == eVar3.H && (dVar = eVar3.F.f2248f) != null && dVar.m());
                e.b y2 = eVar3.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (y2 != bVar2 || a3) {
                    if (!eVar3.d0()) {
                        b.e.b.k.d dVar8 = eVar3.F;
                        if (next2 == dVar8 && eVar3.H.f2248f == null) {
                            int e4 = dVar8.e() + d3;
                            eVar3.p0(e4, eVar3.R() + e4);
                        } else {
                            b.e.b.k.d dVar9 = eVar3.H;
                            if (next2 == dVar9 && dVar8.f2248f == null) {
                                int e5 = d3 - dVar9.e();
                                eVar3.p0(e5 - eVar3.R(), e5);
                            } else if (z2 && !eVar3.Z()) {
                                d(abstractC0041b, eVar3, z);
                            }
                        }
                        b(eVar3, abstractC0041b, z);
                    }
                } else if (eVar3.y() == bVar2 && eVar3.r >= 0 && eVar3.q >= 0 && (eVar3.Q() == 8 || (eVar3.n == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.Z() && !eVar3.c0() && z2 && !eVar3.Z()) {
                        e(eVar, abstractC0041b, eVar3, z);
                    }
                }
            }
        }
    }

    private static void c(b.e.b.k.a aVar, b.AbstractC0041b abstractC0041b, int i, boolean z) {
        if (aVar.c1()) {
            if (i == 0) {
                b(aVar, abstractC0041b, z);
            } else {
                i(aVar, abstractC0041b);
            }
        }
    }

    private static void d(b.AbstractC0041b abstractC0041b, b.e.b.k.e eVar, boolean z) {
        float w = eVar.w();
        int d2 = eVar.F.f2248f.d();
        int d3 = eVar.H.f2248f.d();
        int e2 = eVar.F.e() + d2;
        int e3 = d3 - eVar.H.e();
        if (d2 == d3) {
            w = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int R = eVar.R();
        int i = (d3 - d2) - R;
        if (d2 > d3) {
            i = (d2 - d3) - R;
        }
        int i2 = ((int) ((w * i) + 0.5f)) + d2;
        int i3 = i2 + R;
        if (d2 > d3) {
            i3 = i2 - R;
        }
        eVar.p0(i2, i3);
        b(eVar, abstractC0041b, z);
    }

    private static void e(b.e.b.k.e eVar, b.AbstractC0041b abstractC0041b, b.e.b.k.e eVar2, boolean z) {
        float w = eVar2.w();
        int d2 = eVar2.F.f2248f.d() + eVar2.F.e();
        int d3 = eVar2.H.f2248f.d() - eVar2.H.e();
        if (d3 >= d2) {
            int R = eVar2.R();
            if (eVar2.Q() != 8) {
                int i = eVar2.n;
                if (i == 2) {
                    if (!(eVar instanceof b.e.b.k.f)) {
                        eVar = eVar.I();
                    }
                    R = (int) (eVar2.w() * 0.5f * eVar.R());
                } else if (i == 0) {
                    R = d3 - d2;
                }
                R = Math.max(eVar2.q, R);
                int i2 = eVar2.r;
                if (i2 > 0) {
                    R = Math.min(i2, R);
                }
            }
            int i3 = d2 + ((int) ((w * ((d3 - d2) - R)) + 0.5f));
            eVar2.p0(i3, R + i3);
            b(eVar2, abstractC0041b, z);
        }
    }

    private static void f(b.AbstractC0041b abstractC0041b, b.e.b.k.e eVar) {
        float M = eVar.M();
        int d2 = eVar.G.f2248f.d();
        int d3 = eVar.I.f2248f.d();
        int e2 = eVar.G.e() + d2;
        int e3 = d3 - eVar.I.e();
        if (d2 == d3) {
            M = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int v = eVar.v();
        int i = (d3 - d2) - v;
        if (d2 > d3) {
            i = (d2 - d3) - v;
        }
        int i2 = (int) ((M * i) + 0.5f);
        int i3 = d2 + i2;
        int i4 = i3 + v;
        if (d2 > d3) {
            i3 = d2 - i2;
            i4 = i3 - v;
        }
        eVar.s0(i3, i4);
        i(eVar, abstractC0041b);
    }

    private static void g(b.e.b.k.e eVar, b.AbstractC0041b abstractC0041b, b.e.b.k.e eVar2) {
        float M = eVar2.M();
        int d2 = eVar2.G.f2248f.d() + eVar2.G.e();
        int d3 = eVar2.I.f2248f.d() - eVar2.I.e();
        if (d3 >= d2) {
            int v = eVar2.v();
            if (eVar2.Q() != 8) {
                int i = eVar2.o;
                if (i == 2) {
                    if (!(eVar instanceof b.e.b.k.f)) {
                        eVar = eVar.I();
                    }
                    v = (int) (M * 0.5f * eVar.v());
                } else if (i == 0) {
                    v = d3 - d2;
                }
                v = Math.max(eVar2.t, v);
                int i2 = eVar2.u;
                if (i2 > 0) {
                    v = Math.min(i2, v);
                }
            }
            int i3 = d2 + ((int) ((M * ((d3 - d2) - v)) + 0.5f));
            eVar2.s0(i3, v + i3);
            i(eVar2, abstractC0041b);
        }
    }

    public static void h(b.e.b.k.f fVar, b.AbstractC0041b abstractC0041b) {
        int e1;
        int e12;
        e.b y = fVar.y();
        e.b O = fVar.O();
        fVar.i0();
        ArrayList<b.e.b.k.e> a1 = fVar.a1();
        int size = a1.size();
        for (int i = 0; i < size; i++) {
            a1.get(i).i0();
        }
        boolean x1 = fVar.x1();
        if (y == e.b.FIXED) {
            fVar.p0(0, fVar.R());
        } else {
            fVar.q0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            b.e.b.k.e eVar = a1.get(i2);
            if (eVar instanceof b.e.b.k.g) {
                b.e.b.k.g gVar = (b.e.b.k.g) eVar;
                if (gVar.b1() == 1) {
                    if (gVar.c1() != -1) {
                        e12 = gVar.c1();
                    } else if (gVar.d1() == -1 || !fVar.e0()) {
                        if (fVar.e0()) {
                            e12 = (int) ((gVar.e1() * fVar.R()) + 0.5f);
                        }
                        z = true;
                    } else {
                        e12 = fVar.R() - gVar.d1();
                    }
                    gVar.f1(e12);
                    z = true;
                }
            } else if ((eVar instanceof b.e.b.k.a) && ((b.e.b.k.a) eVar).g1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                b.e.b.k.e eVar2 = a1.get(i3);
                if (eVar2 instanceof b.e.b.k.g) {
                    b.e.b.k.g gVar2 = (b.e.b.k.g) eVar2;
                    if (gVar2.b1() == 1) {
                        b(gVar2, abstractC0041b, x1);
                    }
                }
            }
        }
        b(fVar, abstractC0041b, x1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                b.e.b.k.e eVar3 = a1.get(i4);
                if (eVar3 instanceof b.e.b.k.a) {
                    b.e.b.k.a aVar = (b.e.b.k.a) eVar3;
                    if (aVar.g1() == 0) {
                        c(aVar, abstractC0041b, 0, x1);
                    }
                }
            }
        }
        if (O == e.b.FIXED) {
            fVar.s0(0, fVar.v());
        } else {
            fVar.r0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            b.e.b.k.e eVar4 = a1.get(i5);
            if (eVar4 instanceof b.e.b.k.g) {
                b.e.b.k.g gVar3 = (b.e.b.k.g) eVar4;
                if (gVar3.b1() == 0) {
                    if (gVar3.c1() != -1) {
                        e1 = gVar3.c1();
                    } else if (gVar3.d1() == -1 || !fVar.f0()) {
                        if (fVar.f0()) {
                            e1 = (int) ((gVar3.e1() * fVar.v()) + 0.5f);
                        }
                        z3 = true;
                    } else {
                        e1 = fVar.v() - gVar3.d1();
                    }
                    gVar3.f1(e1);
                    z3 = true;
                }
            } else if ((eVar4 instanceof b.e.b.k.a) && ((b.e.b.k.a) eVar4).g1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                b.e.b.k.e eVar5 = a1.get(i6);
                if (eVar5 instanceof b.e.b.k.g) {
                    b.e.b.k.g gVar4 = (b.e.b.k.g) eVar5;
                    if (gVar4.b1() == 0) {
                        i(gVar4, abstractC0041b);
                    }
                }
            }
        }
        i(fVar, abstractC0041b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                b.e.b.k.e eVar6 = a1.get(i7);
                if (eVar6 instanceof b.e.b.k.a) {
                    b.e.b.k.a aVar2 = (b.e.b.k.a) eVar6;
                    if (aVar2.g1() == 1) {
                        c(aVar2, abstractC0041b, 1, x1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            b.e.b.k.e eVar7 = a1.get(i8);
            if (eVar7.d0() && a(eVar7)) {
                b.e.b.k.f.A1(eVar7, abstractC0041b, f2310a, b.a.k);
                b(eVar7, abstractC0041b, x1);
                i(eVar7, abstractC0041b);
            }
        }
    }

    private static void i(b.e.b.k.e eVar, b.AbstractC0041b abstractC0041b) {
        b.e.b.k.d dVar;
        b.e.b.k.d dVar2;
        b.e.b.k.d dVar3;
        b.e.b.k.d dVar4;
        b.e.b.k.d dVar5;
        if (!(eVar instanceof b.e.b.k.f) && eVar.d0() && a(eVar)) {
            b.e.b.k.f.A1(eVar, abstractC0041b, new b.a(), b.a.k);
        }
        b.e.b.k.d m = eVar.m(d.b.TOP);
        b.e.b.k.d m2 = eVar.m(d.b.BOTTOM);
        int d2 = m.d();
        int d3 = m2.d();
        if (m.c() != null && m.m()) {
            Iterator<b.e.b.k.d> it = m.c().iterator();
            while (it.hasNext()) {
                b.e.b.k.d next = it.next();
                b.e.b.k.e eVar2 = next.f2246d;
                boolean a2 = a(eVar2);
                if (eVar2.d0() && a2) {
                    b.e.b.k.f.A1(eVar2, abstractC0041b, new b.a(), b.a.k);
                }
                e.b O = eVar2.O();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (O != bVar || a2) {
                    if (!eVar2.d0()) {
                        b.e.b.k.d dVar6 = eVar2.G;
                        if (next == dVar6 && eVar2.I.f2248f == null) {
                            int e2 = dVar6.e() + d2;
                            eVar2.s0(e2, eVar2.v() + e2);
                        } else {
                            b.e.b.k.d dVar7 = eVar2.I;
                            if (next == dVar7 && dVar7.f2248f == null) {
                                int e3 = d2 - dVar7.e();
                                eVar2.s0(e3 - eVar2.v(), e3);
                            } else if (next == dVar6 && (dVar3 = dVar7.f2248f) != null && dVar3.m()) {
                                f(abstractC0041b, eVar2);
                            }
                        }
                        i(eVar2, abstractC0041b);
                    }
                } else if (eVar2.O() == bVar && eVar2.u >= 0 && eVar2.t >= 0 && (eVar2.Q() == 8 || (eVar2.o == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.b0() && !eVar2.c0()) {
                        if (((next == eVar2.G && (dVar5 = eVar2.I.f2248f) != null && dVar5.m()) || (next == eVar2.I && (dVar4 = eVar2.G.f2248f) != null && dVar4.m())) && !eVar2.b0()) {
                            g(eVar, abstractC0041b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof b.e.b.k.g) {
            return;
        }
        if (m2.c() != null && m2.m()) {
            Iterator<b.e.b.k.d> it2 = m2.c().iterator();
            while (it2.hasNext()) {
                b.e.b.k.d next2 = it2.next();
                b.e.b.k.e eVar3 = next2.f2246d;
                boolean a3 = a(eVar3);
                if (eVar3.d0() && a3) {
                    b.e.b.k.f.A1(eVar3, abstractC0041b, new b.a(), b.a.k);
                }
                boolean z = (next2 == eVar3.G && (dVar2 = eVar3.I.f2248f) != null && dVar2.m()) || (next2 == eVar3.I && (dVar = eVar3.G.f2248f) != null && dVar.m());
                e.b O2 = eVar3.O();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (O2 != bVar2 || a3) {
                    if (!eVar3.d0()) {
                        b.e.b.k.d dVar8 = eVar3.G;
                        if (next2 == dVar8 && eVar3.I.f2248f == null) {
                            int e4 = dVar8.e() + d3;
                            eVar3.s0(e4, eVar3.v() + e4);
                        } else {
                            b.e.b.k.d dVar9 = eVar3.I;
                            if (next2 == dVar9 && dVar8.f2248f == null) {
                                int e5 = d3 - dVar9.e();
                                eVar3.s0(e5 - eVar3.v(), e5);
                            } else if (z && !eVar3.b0()) {
                                f(abstractC0041b, eVar3);
                            }
                        }
                        i(eVar3, abstractC0041b);
                    }
                } else if (eVar3.O() == bVar2 && eVar3.u >= 0 && eVar3.t >= 0 && (eVar3.Q() == 8 || (eVar3.o == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.b0() && !eVar3.c0() && z && !eVar3.b0()) {
                        g(eVar, abstractC0041b, eVar3);
                    }
                }
            }
        }
        b.e.b.k.d m3 = eVar.m(d.b.BASELINE);
        if (m3.c() == null || !m3.m()) {
            return;
        }
        int d4 = m3.d();
        Iterator<b.e.b.k.d> it3 = m3.c().iterator();
        while (it3.hasNext()) {
            b.e.b.k.d next3 = it3.next();
            b.e.b.k.e eVar4 = next3.f2246d;
            boolean a4 = a(eVar4);
            if (eVar4.d0() && a4) {
                b.e.b.k.f.A1(eVar4, abstractC0041b, new b.a(), b.a.k);
            }
            if (eVar4.O() != e.b.MATCH_CONSTRAINT || a4) {
                if (!eVar4.d0() && next3 == eVar4.J) {
                    eVar4.o0(d4);
                    i(eVar4, abstractC0041b);
                }
            }
        }
    }
}
