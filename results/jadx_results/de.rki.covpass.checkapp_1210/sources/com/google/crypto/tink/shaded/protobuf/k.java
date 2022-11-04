package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l0;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class k implements g1 {

    /* renamed from: a */
    private final j f7912a;

    /* renamed from: b */
    private int f7913b;

    /* renamed from: c */
    private int f7914c;

    /* renamed from: d */
    private int f7915d = 0;

    private k(j jVar) {
        j jVar2 = (j) b0.b(jVar, "input");
        this.f7912a = jVar2;
        jVar2.f7894d = this;
    }

    public static k Q(j jVar) {
        k kVar = jVar.f7894d;
        return kVar != null ? kVar : new k(jVar);
    }

    private <T> T R(h1<T> h1Var, q qVar) {
        int i10 = this.f7914c;
        this.f7914c = u1.c(u1.a(this.f7913b), 4);
        try {
            T a10 = h1Var.a();
            h1Var.e(a10, this, qVar);
            h1Var.f(a10);
            if (this.f7913b == this.f7914c) {
                return a10;
            }
            throw c0.i();
        } finally {
            this.f7914c = i10;
        }
    }

    private <T> T S(h1<T> h1Var, q qVar) {
        j jVar;
        int A = this.f7912a.A();
        j jVar2 = this.f7912a;
        if (jVar2.f7891a < jVar2.f7892b) {
            int j10 = jVar2.j(A);
            T a10 = h1Var.a();
            this.f7912a.f7891a++;
            h1Var.e(a10, this, qVar);
            h1Var.f(a10);
            this.f7912a.a(0);
            jVar.f7891a--;
            this.f7912a.i(j10);
            return a10;
        }
        throw c0.j();
    }

    private void U(int i10) {
        if (this.f7912a.d() == i10) {
            return;
        }
        throw c0.n();
    }

    private void V(int i10) {
        if (u1.b(this.f7913b) == i10) {
            return;
        }
        throw c0.f();
    }

    private void W(int i10) {
        if ((i10 & 3) == 0) {
            return;
        }
        throw c0.i();
    }

    private void X(int i10) {
        if ((i10 & 7) == 0) {
            return;
        }
        throw c0.i();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void A(List<Float> list) {
        int z10;
        int z11;
        if (!(list instanceof x)) {
            int b10 = u1.b(this.f7913b);
            if (b10 == 2) {
                int A = this.f7912a.A();
                W(A);
                int d10 = this.f7912a.d() + A;
                do {
                    list.add(Float.valueOf(this.f7912a.q()));
                } while (this.f7912a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw c0.f();
            } else {
                do {
                    list.add(Float.valueOf(this.f7912a.q()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            }
        }
        x xVar = (x) list;
        int b11 = u1.b(this.f7913b);
        if (b11 == 2) {
            int A2 = this.f7912a.A();
            W(A2);
            int d11 = this.f7912a.d() + A2;
            do {
                xVar.d(this.f7912a.q());
            } while (this.f7912a.d() < d11);
        } else if (b11 != 5) {
            throw c0.f();
        } else {
            do {
                xVar.d(this.f7912a.q());
                if (this.f7912a.e()) {
                    return;
                }
                z11 = this.f7912a.z();
            } while (z11 == this.f7913b);
            this.f7915d = z11;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int B() {
        V(0);
        return this.f7912a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int C() {
        V(0);
        return this.f7912a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean D() {
        int i10;
        if (this.f7912a.e() || (i10 = this.f7913b) == this.f7914c) {
            return false;
        }
        return this.f7912a.C(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int E() {
        V(5);
        return this.f7912a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void F(List<i> list) {
        int z10;
        if (u1.b(this.f7913b) == 2) {
            do {
                list.add(z());
                if (this.f7912a.e()) {
                    return;
                }
                z10 = this.f7912a.z();
            } while (z10 == this.f7913b);
            this.f7915d = z10;
            return;
        }
        throw c0.f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <K, V> void G(Map<K, V> map, l0.a<K, V> aVar, q qVar) {
        V(2);
        this.f7912a.j(this.f7912a.A());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void H(List<Double> list) {
        int z10;
        int z11;
        if (!(list instanceof n)) {
            int b10 = u1.b(this.f7913b);
            if (b10 == 1) {
                do {
                    list.add(Double.valueOf(this.f7912a.m()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                int A = this.f7912a.A();
                X(A);
                int d10 = this.f7912a.d() + A;
                do {
                    list.add(Double.valueOf(this.f7912a.m()));
                } while (this.f7912a.d() < d10);
                return;
            }
        }
        n nVar = (n) list;
        int b11 = u1.b(this.f7913b);
        if (b11 == 1) {
            do {
                nVar.d(this.f7912a.m());
                if (this.f7912a.e()) {
                    return;
                }
                z11 = this.f7912a.z();
            } while (z11 == this.f7913b);
            this.f7915d = z11;
        } else if (b11 != 2) {
            throw c0.f();
        } else {
            int A2 = this.f7912a.A();
            X(A2);
            int d11 = this.f7912a.d() + A2;
            do {
                nVar.d(this.f7912a.m());
            } while (this.f7912a.d() < d11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void I(List<Long> list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b10 = u1.b(this.f7913b);
            if (b10 == 0) {
                do {
                    j0Var.e(this.f7912a.s());
                    if (this.f7912a.e()) {
                        return;
                    }
                    z11 = this.f7912a.z();
                } while (z11 == this.f7913b);
                this.f7915d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    j0Var.e(this.f7912a.s());
                } while (this.f7912a.d() < i10);
            }
        } else {
            int b11 = u1.b(this.f7913b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7912a.s()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    list.add(Long.valueOf(this.f7912a.s()));
                } while (this.f7912a.d() < i10);
            }
        }
        U(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void J(List<Long> list) {
        int z10;
        int z11;
        if (!(list instanceof j0)) {
            int b10 = u1.b(this.f7913b);
            if (b10 == 1) {
                do {
                    list.add(Long.valueOf(this.f7912a.u()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                int A = this.f7912a.A();
                X(A);
                int d10 = this.f7912a.d() + A;
                do {
                    list.add(Long.valueOf(this.f7912a.u()));
                } while (this.f7912a.d() < d10);
                return;
            }
        }
        j0 j0Var = (j0) list;
        int b11 = u1.b(this.f7913b);
        if (b11 == 1) {
            do {
                j0Var.e(this.f7912a.u());
                if (this.f7912a.e()) {
                    return;
                }
                z11 = this.f7912a.z();
            } while (z11 == this.f7913b);
            this.f7915d = z11;
        } else if (b11 != 2) {
            throw c0.f();
        } else {
            int A2 = this.f7912a.A();
            X(A2);
            int d11 = this.f7912a.d() + A2;
            do {
                j0Var.e(this.f7912a.u());
            } while (this.f7912a.d() < d11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> void K(List<T> list, h1<T> h1Var, q qVar) {
        int z10;
        if (u1.b(this.f7913b) == 3) {
            int i10 = this.f7913b;
            do {
                list.add(R(h1Var, qVar));
                if (this.f7912a.e() || this.f7915d != 0) {
                    return;
                }
                z10 = this.f7912a.z();
            } while (z10 == i10);
            this.f7915d = z10;
            return;
        }
        throw c0.f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public long L() {
        V(0);
        return this.f7912a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public String M() {
        V(2);
        return this.f7912a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void N(List<Long> list) {
        int z10;
        int z11;
        if (!(list instanceof j0)) {
            int b10 = u1.b(this.f7913b);
            if (b10 == 1) {
                do {
                    list.add(Long.valueOf(this.f7912a.p()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                int A = this.f7912a.A();
                X(A);
                int d10 = this.f7912a.d() + A;
                do {
                    list.add(Long.valueOf(this.f7912a.p()));
                } while (this.f7912a.d() < d10);
                return;
            }
        }
        j0 j0Var = (j0) list;
        int b11 = u1.b(this.f7913b);
        if (b11 == 1) {
            do {
                j0Var.e(this.f7912a.p());
                if (this.f7912a.e()) {
                    return;
                }
                z11 = this.f7912a.z();
            } while (z11 == this.f7913b);
            this.f7915d = z11;
        } else if (b11 != 2) {
            throw c0.f();
        } else {
            int A2 = this.f7912a.A();
            X(A2);
            int d11 = this.f7912a.d() + A2;
            do {
                j0Var.e(this.f7912a.p());
            } while (this.f7912a.d() < d11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void O(List<Integer> list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b10 = u1.b(this.f7913b);
            if (b10 == 0) {
                do {
                    a0Var.d(this.f7912a.r());
                    if (this.f7912a.e()) {
                        return;
                    }
                    z11 = this.f7912a.z();
                } while (z11 == this.f7913b);
                this.f7915d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    a0Var.d(this.f7912a.r());
                } while (this.f7912a.d() < i10);
            }
        } else {
            int b11 = u1.b(this.f7913b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7912a.r()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    list.add(Integer.valueOf(this.f7912a.r()));
                } while (this.f7912a.d() < i10);
            }
        }
        U(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void P(List<Integer> list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b10 = u1.b(this.f7913b);
            if (b10 == 0) {
                do {
                    a0Var.d(this.f7912a.n());
                    if (this.f7912a.e()) {
                        return;
                    }
                    z11 = this.f7912a.z();
                } while (z11 == this.f7913b);
                this.f7915d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    a0Var.d(this.f7912a.n());
                } while (this.f7912a.d() < i10);
            }
        } else {
            int b11 = u1.b(this.f7913b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7912a.n()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    list.add(Integer.valueOf(this.f7912a.n()));
                } while (this.f7912a.d() < i10);
            }
        }
        U(i10);
    }

    public void T(List<String> list, boolean z10) {
        int z11;
        int z12;
        if (u1.b(this.f7913b) == 2) {
            if (!(list instanceof h0) || z10) {
                do {
                    list.add(z10 ? M() : p());
                    if (this.f7912a.e()) {
                        return;
                    }
                    z11 = this.f7912a.z();
                } while (z11 == this.f7913b);
                this.f7915d = z11;
                return;
            }
            h0 h0Var = (h0) list;
            do {
                h0Var.y(z());
                if (this.f7912a.e()) {
                    return;
                }
                z12 = this.f7912a.z();
            } while (z12 == this.f7913b);
            this.f7915d = z12;
            return;
        }
        throw c0.f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> T a(h1<T> h1Var, q qVar) {
        V(3);
        return (T) R(h1Var, qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void b(List<Integer> list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b10 = u1.b(this.f7913b);
            if (b10 == 0) {
                do {
                    a0Var.d(this.f7912a.v());
                    if (this.f7912a.e()) {
                        return;
                    }
                    z11 = this.f7912a.z();
                } while (z11 == this.f7913b);
                this.f7915d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    a0Var.d(this.f7912a.v());
                } while (this.f7912a.d() < i10);
            }
        } else {
            int b11 = u1.b(this.f7913b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7912a.v()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    list.add(Integer.valueOf(this.f7912a.v()));
                } while (this.f7912a.d() < i10);
            }
        }
        U(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int c() {
        V(0);
        return this.f7912a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> T d(h1<T> h1Var, q qVar) {
        V(2);
        return (T) S(h1Var, qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int e() {
        return this.f7913b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public long f() {
        V(0);
        return this.f7912a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void g(List<Integer> list) {
        int z10;
        int z11;
        if (!(list instanceof a0)) {
            int b10 = u1.b(this.f7913b);
            if (b10 == 2) {
                int A = this.f7912a.A();
                W(A);
                int d10 = this.f7912a.d() + A;
                do {
                    list.add(Integer.valueOf(this.f7912a.o()));
                } while (this.f7912a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw c0.f();
            } else {
                do {
                    list.add(Integer.valueOf(this.f7912a.o()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            }
        }
        a0 a0Var = (a0) list;
        int b11 = u1.b(this.f7913b);
        if (b11 == 2) {
            int A2 = this.f7912a.A();
            W(A2);
            int d11 = this.f7912a.d() + A2;
            do {
                a0Var.d(this.f7912a.o());
            } while (this.f7912a.d() < d11);
        } else if (b11 != 5) {
            throw c0.f();
        } else {
            do {
                a0Var.d(this.f7912a.o());
                if (this.f7912a.e()) {
                    return;
                }
                z11 = this.f7912a.z();
            } while (z11 == this.f7913b);
            this.f7915d = z11;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public long h() {
        V(1);
        return this.f7912a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void i(List<Integer> list) {
        int z10;
        int z11;
        if (!(list instanceof a0)) {
            int b10 = u1.b(this.f7913b);
            if (b10 == 2) {
                int A = this.f7912a.A();
                W(A);
                int d10 = this.f7912a.d() + A;
                do {
                    list.add(Integer.valueOf(this.f7912a.t()));
                } while (this.f7912a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw c0.f();
            } else {
                do {
                    list.add(Integer.valueOf(this.f7912a.t()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            }
        }
        a0 a0Var = (a0) list;
        int b11 = u1.b(this.f7913b);
        if (b11 == 2) {
            int A2 = this.f7912a.A();
            W(A2);
            int d11 = this.f7912a.d() + A2;
            do {
                a0Var.d(this.f7912a.t());
            } while (this.f7912a.d() < d11);
        } else if (b11 != 5) {
            throw c0.f();
        } else {
            do {
                a0Var.d(this.f7912a.t());
                if (this.f7912a.e()) {
                    return;
                }
                z11 = this.f7912a.z();
            } while (z11 == this.f7913b);
            this.f7915d = z11;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int j() {
        V(0);
        return this.f7912a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void k(List<Long> list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b10 = u1.b(this.f7913b);
            if (b10 == 0) {
                do {
                    j0Var.e(this.f7912a.w());
                    if (this.f7912a.e()) {
                        return;
                    }
                    z11 = this.f7912a.z();
                } while (z11 == this.f7913b);
                this.f7915d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    j0Var.e(this.f7912a.w());
                } while (this.f7912a.d() < i10);
            }
        } else {
            int b11 = u1.b(this.f7913b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7912a.w()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    list.add(Long.valueOf(this.f7912a.w()));
                } while (this.f7912a.d() < i10);
            }
        }
        U(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public long l() {
        V(0);
        return this.f7912a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void m(List<Integer> list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b10 = u1.b(this.f7913b);
            if (b10 == 0) {
                do {
                    a0Var.d(this.f7912a.A());
                    if (this.f7912a.e()) {
                        return;
                    }
                    z11 = this.f7912a.z();
                } while (z11 == this.f7913b);
                this.f7915d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    a0Var.d(this.f7912a.A());
                } while (this.f7912a.d() < i10);
            }
        } else {
            int b11 = u1.b(this.f7913b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7912a.A()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    list.add(Integer.valueOf(this.f7912a.A()));
                } while (this.f7912a.d() < i10);
            }
        }
        U(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> T n(Class<T> cls, q qVar) {
        V(3);
        return (T) R(d1.a().d(cls), qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void o(List<Boolean> list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof g) {
            g gVar = (g) list;
            int b10 = u1.b(this.f7913b);
            if (b10 == 0) {
                do {
                    gVar.e(this.f7912a.k());
                    if (this.f7912a.e()) {
                        return;
                    }
                    z11 = this.f7912a.z();
                } while (z11 == this.f7913b);
                this.f7915d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    gVar.e(this.f7912a.k());
                } while (this.f7912a.d() < i10);
            }
        } else {
            int b11 = u1.b(this.f7913b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f7912a.k()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    list.add(Boolean.valueOf(this.f7912a.k()));
                } while (this.f7912a.d() < i10);
            }
        }
        U(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public String p() {
        V(2);
        return this.f7912a.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> void q(List<T> list, h1<T> h1Var, q qVar) {
        int z10;
        if (u1.b(this.f7913b) == 2) {
            int i10 = this.f7913b;
            do {
                list.add(S(h1Var, qVar));
                if (this.f7912a.e() || this.f7915d != 0) {
                    return;
                }
                z10 = this.f7912a.z();
            } while (z10 == i10);
            this.f7915d = z10;
            return;
        }
        throw c0.f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int r() {
        V(5);
        return this.f7912a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public double readDouble() {
        V(1);
        return this.f7912a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public float readFloat() {
        V(5);
        return this.f7912a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> T s(Class<T> cls, q qVar) {
        V(2);
        return (T) S(d1.a().d(cls), qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean t() {
        V(0);
        return this.f7912a.k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int u() {
        int i10 = this.f7915d;
        if (i10 != 0) {
            this.f7913b = i10;
            this.f7915d = 0;
        } else {
            this.f7913b = this.f7912a.z();
        }
        int i11 = this.f7913b;
        if (i11 == 0 || i11 == this.f7914c) {
            return Integer.MAX_VALUE;
        }
        return u1.a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void v(List<String> list) {
        T(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public long w() {
        V(1);
        return this.f7912a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void x(List<Long> list) {
        int i10;
        int z10;
        int z11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b10 = u1.b(this.f7913b);
            if (b10 == 0) {
                do {
                    j0Var.e(this.f7912a.B());
                    if (this.f7912a.e()) {
                        return;
                    }
                    z11 = this.f7912a.z();
                } while (z11 == this.f7913b);
                this.f7915d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    j0Var.e(this.f7912a.B());
                } while (this.f7912a.d() < i10);
            }
        } else {
            int b11 = u1.b(this.f7913b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7912a.B()));
                    if (this.f7912a.e()) {
                        return;
                    }
                    z10 = this.f7912a.z();
                } while (z10 == this.f7913b);
                this.f7915d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.f();
            } else {
                i10 = this.f7912a.d() + this.f7912a.A();
                do {
                    list.add(Long.valueOf(this.f7912a.B()));
                } while (this.f7912a.d() < i10);
            }
        }
        U(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void y(List<String> list) {
        T(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public i z() {
        V(2);
        return this.f7912a.l();
    }
}
