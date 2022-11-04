package gg;

import java.util.Objects;
/* loaded from: classes3.dex */
public abstract class o extends a0 implements g0 {

    /* renamed from: d */
    static final o0 f10866d = new a(o.class, 22);

    /* renamed from: c */
    final byte[] f10867c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return o.C(t1Var.F());
        }
    }

    public o(String str, boolean z10) {
        Objects.requireNonNull(str, "'string' cannot be null");
        if (!z10 || F(str)) {
            this.f10867c = ak.q.f(str);
            return;
        }
        throw new IllegalArgumentException("'string' contains illegal characters");
    }

    public o(byte[] bArr, boolean z10) {
        this.f10867c = z10 ? ak.a.h(bArr) : bArr;
    }

    public static o C(byte[] bArr) {
        return new q1(bArr, false);
    }

    public static o D(j0 j0Var, boolean z10) {
        return (o) f10866d.e(j0Var, z10);
    }

    public static o E(Object obj) {
        if (obj == null || (obj instanceof o)) {
            return (o) obj;
        }
        if (obj instanceof g) {
            a0 b10 = ((g) obj).b();
            if (b10 instanceof o) {
                return (o) b10;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (o) f10866d.b((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    public static boolean F(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // gg.g0
    public final String c() {
        return ak.q.b(this.f10867c);
    }

    @Override // gg.a0, gg.t
    public final int hashCode() {
        return ak.a.F(this.f10867c);
    }

    @Override // gg.a0
    public final boolean l(a0 a0Var) {
        if (!(a0Var instanceof o)) {
            return false;
        }
        return ak.a.c(this.f10867c, ((o) a0Var).f10867c);
    }

    @Override // gg.a0
    public final void m(y yVar, boolean z10) {
        yVar.o(z10, 22, this.f10867c);
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public final int q(boolean z10) {
        return y.g(z10, this.f10867c.length);
    }

    public String toString() {
        return c();
    }
}
