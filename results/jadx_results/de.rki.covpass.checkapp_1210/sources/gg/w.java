package gg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* loaded from: classes3.dex */
public abstract class w extends a0 implements x {

    /* renamed from: d */
    static final o0 f10908d = new a(w.class, 4);

    /* renamed from: q */
    static final byte[] f10909q = new byte[0];

    /* renamed from: c */
    byte[] f10910c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 c(d0 d0Var) {
            return d0Var.L();
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return t1Var;
        }
    }

    public w(byte[] bArr) {
        Objects.requireNonNull(bArr, "'string' cannot be null");
        this.f10910c = bArr;
    }

    public static w C(byte[] bArr) {
        return new t1(bArr);
    }

    public static w D(j0 j0Var, boolean z10) {
        return (w) f10908d.e(j0Var, z10);
    }

    public static w E(Object obj) {
        if (obj == null || (obj instanceof w)) {
            return (w) obj;
        }
        if (obj instanceof g) {
            a0 b10 = ((g) obj).b();
            if (b10 instanceof w) {
                return (w) b10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (w) f10908d.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public byte[] F() {
        return this.f10910c;
    }

    @Override // gg.x
    public InputStream a() {
        return new ByteArrayInputStream(this.f10910c);
    }

    @Override // gg.t2
    public a0 e() {
        return b();
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return ak.a.F(F());
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (!(a0Var instanceof w)) {
            return false;
        }
        return ak.a.c(this.f10910c, ((w) a0Var).f10910c);
    }

    public String toString() {
        return "#" + ak.q.b(bk.f.d(this.f10910c));
    }

    @Override // gg.a0
    public a0 w() {
        return new t1(this.f10910c);
    }

    @Override // gg.a0
    public a0 z() {
        return new t1(this.f10910c);
    }
}
