package gg;

import java.io.IOException;
/* loaded from: classes3.dex */
public class e extends a0 {

    /* renamed from: d */
    static final o0 f10799d = new a(e.class, 1);

    /* renamed from: q */
    public static final e f10800q = new e((byte) 0);

    /* renamed from: x */
    public static final e f10801x = new e((byte) -1);

    /* renamed from: c */
    private final byte f10802c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return e.C(t1Var.F());
        }
    }

    private e(byte b10) {
        this.f10802c = b10;
    }

    public static e C(byte[] bArr) {
        if (bArr.length == 1) {
            byte b10 = bArr[0];
            return b10 != -1 ? b10 != 0 ? new e(b10) : f10800q : f10801x;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    public static e D(j0 j0Var, boolean z10) {
        return (e) f10799d.e(j0Var, z10);
    }

    public static e E(Object obj) {
        if (obj == null || (obj instanceof e)) {
            return (e) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (e) f10799d.b((byte[]) obj);
        } catch (IOException e10) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e10.getMessage());
        }
    }

    public static e F(boolean z10) {
        return z10 ? f10801x : f10800q;
    }

    public boolean G() {
        return this.f10802c != 0;
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return G() ? 1 : 0;
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        return (a0Var instanceof e) && G() == ((e) a0Var).G();
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.m(z10, 1, this.f10802c);
    }

    @Override // gg.a0
    public boolean n() {
        return false;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, 1);
    }

    public String toString() {
        return G() ? "TRUE" : "FALSE";
    }

    @Override // gg.a0
    public a0 w() {
        return G() ? f10801x : f10800q;
    }
}
