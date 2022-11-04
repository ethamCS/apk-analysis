package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public abstract class o1<T, B> {
    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    public abstract void d(B b10, int i10, i iVar);

    public abstract void e(B b10, int i10, long j10);

    public abstract B f(Object obj);

    public abstract T g(Object obj);

    public abstract int h(T t10);

    public abstract int i(T t10);

    public abstract void j(Object obj);

    public abstract T k(T t10, T t11);

    final void l(B b10, g1 g1Var) {
        while (g1Var.u() != Integer.MAX_VALUE && m(b10, g1Var)) {
        }
    }

    public final boolean m(B b10, g1 g1Var) {
        int e10 = g1Var.e();
        int a10 = u1.a(e10);
        int b11 = u1.b(e10);
        if (b11 == 0) {
            e(b10, a10, g1Var.L());
            return true;
        } else if (b11 == 1) {
            b(b10, a10, g1Var.h());
            return true;
        } else if (b11 == 2) {
            d(b10, a10, g1Var.z());
            return true;
        } else if (b11 != 3) {
            if (b11 == 4) {
                return false;
            }
            if (b11 != 5) {
                throw c0.f();
            }
            a(b10, a10, g1Var.r());
            return true;
        } else {
            B n10 = n();
            int c10 = u1.c(a10, 4);
            l(n10, g1Var);
            if (c10 != g1Var.e()) {
                throw c0.b();
            }
            c(b10, a10, r(n10));
            return true;
        }
    }

    public abstract B n();

    public abstract void o(Object obj, B b10);

    public abstract void p(Object obj, T t10);

    public abstract boolean q(g1 g1Var);

    abstract T r(B b10);

    public abstract void s(T t10, v1 v1Var);

    public abstract void t(T t10, v1 v1Var);
}
