package gg;

import java.io.IOException;
import java.util.Objects;
/* loaded from: classes3.dex */
public abstract class j0 extends a0 implements t2 {

    /* renamed from: c */
    final int f10837c;

    /* renamed from: d */
    final int f10838d;

    /* renamed from: q */
    final int f10839q;

    /* renamed from: x */
    final g f10840x;

    public j0(int i10, int i11, int i12, g gVar) {
        Objects.requireNonNull(gVar, "'obj' cannot be null");
        if (i11 == 0 || (i11 & 192) != i11) {
            throw new IllegalArgumentException("invalid tag class: " + i11);
        }
        this.f10837c = gVar instanceof f ? 1 : i10;
        this.f10838d = i11;
        this.f10839q = i12;
        this.f10840x = gVar;
    }

    protected j0(boolean z10, int i10, int i11, g gVar) {
        this(z10 ? 1 : 2, i10, i11, gVar);
    }

    public j0(boolean z10, int i10, g gVar) {
        this(z10, 128, i10, gVar);
    }

    private static j0 C(a0 a0Var) {
        if (a0Var instanceof j0) {
            return (j0) a0Var;
        }
        throw new IllegalStateException("unexpected object: " + a0Var.getClass().getName());
    }

    public static a0 D(int i10, int i11, h hVar) {
        boolean z10 = true;
        if (hVar.f() != 1) {
            z10 = false;
        }
        p2 p2Var = z10 ? new p2(3, i10, i11, hVar.d(0)) : new p2(4, i10, i11, j2.a(hVar));
        return i10 != 64 ? p2Var : new f2(p2Var);
    }

    public static a0 E(int i10, int i11, h hVar) {
        boolean z10 = true;
        if (hVar.f() != 1) {
            z10 = false;
        }
        e1 e1Var = z10 ? new e1(3, i10, i11, hVar.d(0)) : new e1(4, i10, i11, x0.a(hVar));
        return i10 != 64 ? e1Var : new t0(e1Var);
    }

    public static a0 F(int i10, int i11, byte[] bArr) {
        p2 p2Var = new p2(4, i10, i11, new t1(bArr));
        return i10 != 64 ? p2Var : new f2(p2Var);
    }

    public static j0 M(j0 j0Var, boolean z10) {
        if (128 == j0Var.P()) {
            if (!z10) {
                throw new IllegalArgumentException("this method not valid for implicitly tagged tagged objects");
            }
            return j0Var.L();
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public static j0 N(Object obj) {
        if (obj == null || (obj instanceof j0)) {
            return (j0) obj;
        }
        if (obj instanceof g) {
            a0 b10 = ((g) obj).b();
            if (b10 instanceof j0) {
                return (j0) b10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return C(a0.u((byte[]) obj));
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public t G() {
        g gVar = this.f10840x;
        return gVar instanceof t ? (t) gVar : gVar.b();
    }

    public a0 H(boolean z10, int i10) {
        o0 a10 = p0.a(i10);
        if (a10 != null) {
            return J(z10, a10);
        }
        throw new IllegalArgumentException("unsupported UNIVERSAL tag number: " + i10);
    }

    public a0 J(boolean z10, o0 o0Var) {
        if (z10) {
            if (!S()) {
                throw new IllegalStateException("object explicit - implicit expected.");
            }
            return o0Var.a(this.f10840x.b());
        } else if (1 == this.f10837c) {
            throw new IllegalStateException("object explicit - implicit expected.");
        } else {
            a0 b10 = this.f10840x.b();
            int i10 = this.f10837c;
            return i10 != 3 ? i10 != 4 ? o0Var.a(b10) : b10 instanceof d0 ? o0Var.c((d0) b10) : o0Var.d((t1) b10) : o0Var.c(U(b10));
        }
    }

    public t K() {
        if (S()) {
            g gVar = this.f10840x;
            return gVar instanceof t ? (t) gVar : gVar.b();
        }
        throw new IllegalStateException("object implicit - explicit expected.");
    }

    public j0 L() {
        if (S()) {
            return C(this.f10840x.b());
        }
        throw new IllegalStateException("object implicit - explicit expected.");
    }

    public a0 O() {
        if (128 == P()) {
            return this.f10840x.b();
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public int P() {
        return this.f10838d;
    }

    public int Q() {
        return this.f10839q;
    }

    public boolean R(int i10) {
        return this.f10838d == 128 && this.f10839q == i10;
    }

    public boolean S() {
        int i10 = this.f10837c;
        return i10 == 1 || i10 == 3;
    }

    public boolean T() {
        int i10 = this.f10837c;
        return i10 == 3 || i10 == 4;
    }

    abstract d0 U(a0 a0Var);

    @Override // gg.t2
    public final a0 e() {
        return this;
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return (((this.f10838d * 7919) ^ this.f10839q) ^ (S() ? 15 : 240)) ^ this.f10840x.b().hashCode();
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (a0Var instanceof a) {
            return a0Var.s(this);
        }
        if (!(a0Var instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) a0Var;
        if (this.f10839q != j0Var.f10839q || this.f10838d != j0Var.f10838d) {
            return false;
        }
        if (this.f10837c != j0Var.f10837c && S() != j0Var.S()) {
            return false;
        }
        a0 b10 = this.f10840x.b();
        a0 b11 = j0Var.f10840x.b();
        if (b10 == b11) {
            return true;
        }
        if (S()) {
            return b10.l(b11);
        }
        try {
            return ak.a.c(getEncoded(), j0Var.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    public String toString() {
        return q0.a(this.f10838d, this.f10839q) + this.f10840x;
    }

    @Override // gg.a0
    public a0 w() {
        return new a2(this.f10837c, this.f10838d, this.f10839q, this.f10840x);
    }

    @Override // gg.a0
    public a0 z() {
        return new p2(this.f10837c, this.f10838d, this.f10839q, this.f10840x);
    }
}
