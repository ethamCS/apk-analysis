package c3;

import c4.a0;
import c4.b0;
import c4.i;
import c4.n;
import c4.u;
import c4.v;
import c4.w;
import c4.x;
import d3.h;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    public static int f6216a = 160000;

    public static void a(int i10, int i11, int i12, int i13, int i14, int i15, c4.e eVar, c4.e eVar2) {
        d3.a.a(i10, i11, i12, i13, i14, i15, eVar, eVar2);
    }

    public static void b(c4.e eVar, int i10, int i11) {
        d3.a.b(eVar, i10, i11);
    }

    public static void c(c4.a aVar, int i10, u uVar) {
        if (j(aVar)) {
            h.g(aVar, i10, uVar);
        } else {
            d3.a.c(aVar, i10, uVar);
        }
    }

    public static void d(c4.b bVar, int i10, v vVar) {
        if (j(bVar)) {
            h.h(bVar, i10, vVar);
        } else {
            d3.a.d(bVar, i10, vVar);
        }
    }

    public static void e(c4.d dVar, int i10, w wVar) {
        if (j(dVar)) {
            h.i(dVar, i10, wVar);
        } else {
            d3.a.e(dVar, i10, wVar);
        }
    }

    public static void f(c4.e eVar, int i10, x xVar) {
        if (j(eVar)) {
            h.j(eVar, i10, xVar);
        } else {
            d3.a.f(eVar, i10, xVar);
        }
    }

    public static void g(c4.h hVar, int i10, a0 a0Var) {
        if (j(hVar)) {
            h.k(hVar, i10, a0Var);
        } else {
            d3.a.g(hVar, i10, a0Var);
        }
    }

    public static void h(i iVar, int i10, b0 b0Var) {
        if (j(iVar)) {
            h.l(iVar, i10, b0Var);
        } else {
            d3.a.h(iVar, i10, b0Var);
        }
    }

    public static boolean i(int i10) {
        return j3.a.k() && i10 >= f6216a;
    }

    public static boolean j(n nVar) {
        return i(nVar.f6220q * nVar.f6221x);
    }
}
