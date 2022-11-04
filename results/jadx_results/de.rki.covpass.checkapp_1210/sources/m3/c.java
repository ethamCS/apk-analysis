package m3;

import c4.a0;
import c4.b0;
import c4.c0;
import c4.d0;
import c4.e0;
import c4.f0;
import c4.n;
import c4.p;
import c4.q;
import c4.r;
import c4.t;
import c4.u;
import c4.v;
import c4.z;
/* loaded from: classes.dex */
public class c {
    public static <T extends q<T>> T a(r rVar, T t10) {
        p c10 = rVar.h().c();
        if (c10 == p.U8) {
            return a.o((e0) rVar, (c4.l) t10);
        }
        if (c10 == p.S8) {
            return a.k((c0) rVar, (c4.j) t10);
        }
        if (c10 == p.U16) {
            return a.m((d0) rVar, (c4.k) t10);
        }
        if (c10 == p.S16) {
            return a.e((z) rVar, (c4.g) t10);
        }
        if (c10 == p.S32) {
            return a.g((a0) rVar, (c4.h) t10);
        }
        if (c10 == p.S64) {
            return a.i((b0) rVar, (c4.i) t10);
        }
        if (c10 == p.F32) {
            return a.a((u) rVar, (c4.a) t10);
        }
        if (c10 == p.F64) {
            return a.c((v) rVar, (c4.b) t10);
        }
        throw new IllegalArgumentException("Unknown image type: " + c10);
    }

    public static <T extends q<T>> T b(f0<T> f0Var, T t10) {
        Class<T> I = f0Var.I();
        if (I == c4.l.class) {
            return a.p(f0Var, (c4.l) t10);
        }
        if (I == c4.j.class) {
            return a.l(f0Var, (c4.j) t10);
        }
        if (I == c4.k.class) {
            return a.n(f0Var, (c4.k) t10);
        }
        if (I == c4.g.class) {
            return a.f(f0Var, (c4.g) t10);
        }
        if (I == c4.h.class) {
            return a.h(f0Var, (c4.h) t10);
        }
        if (I == c4.i.class) {
            return a.j(f0Var, (c4.i) t10);
        }
        if (I == c4.a.class) {
            return a.b(f0Var, (c4.a) t10);
        }
        if (I == c4.b.class) {
            return a.d(f0Var, (c4.b) t10);
        }
        String simpleName = I.getSimpleName();
        throw new IllegalArgumentException("Unknown image type: " + simpleName);
    }

    public static void c(n nVar, n nVar2) {
        q qVar;
        q d10;
        t h10 = nVar.h();
        t h11 = nVar2.h();
        String str = "convert";
        int i10 = 0;
        if (nVar instanceof q) {
            q qVar2 = (q) nVar;
            if (!(nVar2 instanceof q)) {
                if (nVar2 instanceof f0) {
                    f0 f0Var = (f0) nVar2;
                    while (i10 < f0Var.M()) {
                        c(nVar, f0Var.B(i10));
                        i10++;
                    }
                    return;
                } else if (!(nVar2 instanceof r)) {
                    return;
                } else {
                    r rVar = (r) nVar2;
                    while (i10 < rVar.N()) {
                        c3.a.a(qVar2, i10, rVar);
                        i10++;
                    }
                    return;
                }
            } else if (nVar.getClass() != nVar2.getClass()) {
                try {
                    a.class.getMethod(str, nVar.getClass(), nVar2.getClass()).invoke(null, nVar, nVar2);
                    return;
                } catch (Exception unused) {
                    throw new IllegalArgumentException("Unknown conversion. " + nVar.getClass().getSimpleName() + " to " + nVar2.getClass().getSimpleName());
                }
            }
        } else {
            boolean z10 = nVar instanceof r;
            if (!z10 || !(nVar2 instanceof r)) {
                boolean z11 = nVar instanceof f0;
                if (z11 && (nVar2 instanceof q)) {
                    f0 f0Var2 = (f0) nVar;
                    qVar = (q) nVar2;
                    if (f0Var2.h().c() == qVar.M()) {
                        b(f0Var2, qVar);
                        return;
                    } else {
                        d10 = i.d(f0Var2.h().c(), nVar2.f6220q, nVar2.f6221x);
                        b(f0Var2, d10);
                    }
                } else if (z11 && (nVar2 instanceof r)) {
                    if (h10.c() != h11.c()) {
                        str = str + h10.c() + h11.c();
                    }
                    try {
                        a.class.getMethod(str, nVar.getClass(), nVar2.getClass()).invoke(null, nVar, nVar2);
                        return;
                    } catch (Exception unused2) {
                        throw new IllegalArgumentException("Unknown conversion. " + nVar.getClass().getSimpleName() + " to " + nVar2.getClass().getSimpleName());
                    }
                } else if (z11 && (nVar2 instanceof f0)) {
                    f0 f0Var3 = (f0) nVar;
                    f0 f0Var4 = (f0) nVar2;
                    if (f0Var3.I() == f0Var4.I()) {
                        f0Var4.y(f0Var3);
                        return;
                    }
                    while (i10 < f0Var3.M()) {
                        c(f0Var3.B(i10), f0Var4.B(i10));
                        i10++;
                    }
                    return;
                } else if (z10 && (nVar2 instanceof f0)) {
                    if (h10.c() != h11.c()) {
                        str = str + h10.c() + h11.c();
                    }
                    try {
                        a.class.getMethod(str, nVar.getClass(), nVar2.getClass()).invoke(null, nVar, nVar2);
                        return;
                    } catch (Exception unused3) {
                        throw new IllegalArgumentException("Unknown conversion. " + nVar.getClass().getSimpleName() + " to " + nVar2.getClass().getSimpleName());
                    }
                } else if (!z10 || !(nVar2 instanceof q)) {
                    throw new IllegalArgumentException("Don't know how to convert between input types. " + nVar.getClass().getSimpleName() + " " + nVar2.getClass().getSimpleName());
                } else {
                    r rVar2 = (r) nVar;
                    qVar = (q) nVar2;
                    if (rVar2.h().c() == qVar.M()) {
                        a(rVar2, qVar);
                        return;
                    } else {
                        d10 = i.d(rVar2.h().c(), nVar2.f6220q, nVar2.f6221x);
                        a(rVar2, d10);
                    }
                }
                c(d10, qVar);
                return;
            } else if (nVar.getClass() != nVar2.getClass()) {
                try {
                    a.class.getMethod(str, nVar.getClass(), nVar2.getClass()).invoke(null, nVar, nVar2);
                    return;
                } catch (Exception unused4) {
                    throw new IllegalArgumentException("Unknown conversion. " + nVar.getClass().getSimpleName() + " to " + nVar2.getClass().getSimpleName());
                }
            }
        }
        nVar2.y(nVar);
    }
}
