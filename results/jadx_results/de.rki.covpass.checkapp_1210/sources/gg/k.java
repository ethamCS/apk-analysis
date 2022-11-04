package gg;
/* loaded from: classes3.dex */
public abstract class k extends a0 {
    static final o0 U3 = new a(k.class, 8);

    /* renamed from: c */
    v f10843c;

    /* renamed from: d */
    q f10844d;

    /* renamed from: q */
    a0 f10845q;

    /* renamed from: x */
    int f10846x;

    /* renamed from: y */
    a0 f10847y;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 c(d0 d0Var) {
            return d0Var.K();
        }
    }

    public k(d0 d0Var) {
        int i10 = 0;
        a0 M = M(d0Var, 0);
        if (M instanceof v) {
            this.f10843c = (v) M;
            M = M(d0Var, 1);
            i10 = 1;
        }
        if (M instanceof q) {
            this.f10844d = (q) M;
            i10++;
            M = M(d0Var, i10);
        }
        if (!(M instanceof j0)) {
            this.f10845q = M;
            i10++;
            M = M(d0Var, i10);
        }
        if (d0Var.size() == i10 + 1) {
            if (!(M instanceof j0)) {
                throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
            }
            j0 j0Var = (j0) M;
            this.f10846x = D(j0Var.Q());
            this.f10847y = K(j0Var);
            return;
        }
        throw new IllegalArgumentException("input sequence too large");
    }

    public k(v vVar, q qVar, a0 a0Var, int i10, a0 a0Var2) {
        this.f10843c = vVar;
        this.f10844d = qVar;
        this.f10845q = a0Var;
        this.f10846x = D(i10);
        this.f10847y = E(i10, a0Var2);
    }

    private static int D(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("invalid encoding value: " + i10);
        }
        return i10;
    }

    private static a0 E(int i10, a0 a0Var) {
        o0 o0Var;
        if (i10 == 1) {
            o0Var = w.f10908d;
        } else if (i10 != 2) {
            return a0Var;
        } else {
            o0Var = c.f10788d;
        }
        return o0Var.a(a0Var);
    }

    private static a0 K(j0 j0Var) {
        int P = j0Var.P();
        int Q = j0Var.Q();
        if (128 != P) {
            throw new IllegalArgumentException("invalid tag: " + q0.a(P, Q));
        } else if (Q == 0) {
            return j0Var.K().b();
        } else {
            if (Q == 1) {
                return w.D(j0Var, false);
            }
            if (Q == 2) {
                return c.E(j0Var, false);
            }
            throw new IllegalArgumentException("invalid tag: " + q0.a(P, Q));
        }
    }

    private static a0 M(d0 d0Var, int i10) {
        if (d0Var.size() > i10) {
            return d0Var.G(i10).b();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    abstract d0 C();

    public a0 F() {
        return this.f10845q;
    }

    public v G() {
        return this.f10843c;
    }

    public int H() {
        return this.f10846x;
    }

    public a0 J() {
        return this.f10847y;
    }

    public q L() {
        return this.f10844d;
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return (((ak.k.b(this.f10843c) ^ ak.k.b(this.f10844d)) ^ ak.k.b(this.f10845q)) ^ this.f10846x) ^ this.f10847y.hashCode();
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (this == a0Var) {
            return true;
        }
        if (!(a0Var instanceof k)) {
            return false;
        }
        k kVar = (k) a0Var;
        return ak.k.a(this.f10843c, kVar.f10843c) && ak.k.a(this.f10844d, kVar.f10844d) && ak.k.a(this.f10845q, kVar.f10845q) && this.f10846x == kVar.f10846x && this.f10847y.s(kVar.f10847y);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.s(z10, 40);
        C().m(yVar, false);
    }

    @Override // gg.a0
    public boolean n() {
        return true;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return C().q(z10);
    }

    @Override // gg.a0
    public a0 w() {
        return new l1(this.f10843c, this.f10844d, this.f10845q, this.f10846x, this.f10847y);
    }

    @Override // gg.a0
    public a0 z() {
        return new i2(this.f10843c, this.f10844d, this.f10845q, this.f10846x, this.f10847y);
    }
}
