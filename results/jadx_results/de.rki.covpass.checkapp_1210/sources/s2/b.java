package s2;

import c4.k;
import c4.l;
import ok.g;
import t2.c;
import t2.e;
import z3.d;
/* loaded from: classes.dex */
public class b {
    public static c4.a a(c4.a aVar, c4.a aVar2, double d10, int i10, double d11, int i11, c4.a aVar3) {
        c4.a aVar4;
        c4.a aVar5;
        z3.b bVar;
        c4.a aVar6 = (c4.a) l2.a.b(aVar, aVar2);
        c4.a aVar7 = (c4.a) l2.a.b(aVar, aVar3);
        if (!a.a(aVar, aVar6, d10, i10, d11, i11, aVar7)) {
            z3.b bVar2 = (z3.b) r3.b.b(z3.b.class, d10, i10);
            if (d10 == d11 && i10 == i11) {
                aVar5 = aVar;
                aVar4 = aVar7;
                bVar = bVar2;
            } else {
                bVar = (z3.b) r3.b.b(z3.b.class, d11, i11);
                aVar5 = aVar;
                aVar4 = aVar7;
            }
            e.a(bVar2, aVar5, aVar4);
            e.d(bVar, aVar4, aVar6);
            return aVar6;
        }
        return aVar6;
    }

    public static c4.a b(c4.a aVar, c4.a aVar2, double d10, int i10, c4.a aVar3) {
        return a(aVar, aVar2, d10, i10, d10, i10, aVar3);
    }

    public static k c(k kVar, k kVar2, double d10, int i10, double d11, int i11, k kVar3) {
        k kVar4;
        k kVar5;
        d dVar;
        k kVar6 = (k) l2.a.b(kVar, kVar2);
        k kVar7 = (k) l2.a.b(kVar, kVar3);
        if (!a.a(kVar, kVar6, d10, i10, d11, i11, kVar7)) {
            d dVar2 = (d) r3.b.b(d.class, d10, i10);
            if (d10 == d11 && i10 == i11) {
                kVar5 = kVar;
                kVar4 = kVar7;
                dVar = dVar2;
            } else {
                dVar = (d) r3.b.b(d.class, d11, i11);
                kVar5 = kVar;
                kVar4 = kVar7;
            }
            e.b(dVar2, kVar5, kVar4);
            e.e(dVar, kVar4, kVar6);
            return kVar6;
        }
        return kVar6;
    }

    public static k d(k kVar, k kVar2, double d10, int i10, k kVar3) {
        return c(kVar, kVar2, d10, i10, d10, i10, kVar3);
    }

    public static l e(l lVar, l lVar2, double d10, int i10, double d11, int i11, l lVar3) {
        l lVar4;
        l lVar5;
        d dVar;
        l lVar6 = (l) l2.a.b(lVar, lVar2);
        l lVar7 = (l) l2.a.b(lVar, lVar3);
        if (!a.a(lVar, lVar6, d10, i10, d11, i11, lVar7)) {
            d dVar2 = (d) r3.b.b(d.class, d10, i10);
            if (d10 == d11 && i10 == i11) {
                lVar5 = lVar;
                lVar4 = lVar7;
                dVar = dVar2;
            } else {
                dVar = (d) r3.b.b(d.class, d11, i11);
                lVar5 = lVar;
                lVar4 = lVar7;
            }
            e.c(dVar2, lVar5, lVar4);
            e.f(dVar, lVar4, lVar6);
            return lVar6;
        }
        return lVar6;
    }

    public static l f(l lVar, l lVar2, double d10, int i10, l lVar3) {
        return e(lVar, lVar2, d10, i10, d10, i10, lVar3);
    }

    public static c4.a g(c4.a aVar, c4.a aVar2, int i10, int i11, c4.a aVar3, ll.d<ok.e> dVar) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Radius must be > 0");
        }
        c4.a aVar4 = (c4.a) l2.a.b(aVar, aVar2);
        c4.a aVar5 = (c4.a) l2.a.b(aVar, aVar3);
        if (a.b(aVar, aVar4, i10, i11, aVar5)) {
            return aVar4;
        }
        c.a(aVar, aVar5, i10, (i10 * 2) + 1);
        c.d(aVar5, aVar4, i11, (i11 * 2) + 1, dVar);
        return aVar4;
    }

    public static c4.a h(c4.a aVar, c4.a aVar2, int i10, c4.a aVar3, ll.d<ok.e> dVar) {
        return g(aVar, aVar2, i10, i10, aVar3, dVar);
    }

    public static k i(k kVar, k kVar2, int i10, int i11, k kVar3, ll.d<g> dVar) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Radius must be > 0");
        }
        k kVar4 = (k) l2.a.b(kVar, kVar2);
        k kVar5 = (k) l2.a.b(kVar, kVar3);
        if (a.b(kVar, kVar4, i10, i11, kVar5)) {
            return kVar4;
        }
        c.b(kVar, kVar5, i10, (i10 * 2) + 1);
        c.e(kVar5, kVar4, i11, (i11 * 2) + 1, dVar);
        return kVar4;
    }

    public static k j(k kVar, k kVar2, int i10, k kVar3, ll.d<g> dVar) {
        return i(kVar, kVar2, i10, i10, kVar3, dVar);
    }

    public static l k(l lVar, l lVar2, int i10, int i11, l lVar3, ll.d<g> dVar) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Radius must be > 0");
        }
        l lVar4 = (l) l2.a.b(lVar, lVar2);
        l lVar5 = (l) l2.a.b(lVar, lVar3);
        if (a.b(lVar, lVar4, i10, i11, lVar5)) {
            return lVar4;
        }
        c.c(lVar, lVar5, i10, (i10 * 2) + 1);
        c.f(lVar5, lVar4, i11, (i11 * 2) + 1, dVar);
        return lVar4;
    }

    public static l l(l lVar, l lVar2, int i10, l lVar3, ll.d<g> dVar) {
        return k(lVar, lVar2, i10, i10, lVar3, dVar);
    }
}
