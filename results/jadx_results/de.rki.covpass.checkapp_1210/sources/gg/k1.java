package gg;
/* loaded from: classes3.dex */
public class k1 extends c {
    public k1(g gVar) {
        super(gVar.b().k("DER"), 0);
    }

    public k1(byte[] bArr) {
        this(bArr, 0);
    }

    public k1(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public k1(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }

    public static k1 J(c cVar) {
        return (k1) cVar.w();
    }

    static k1 K(w wVar) {
        return new k1(wVar.F(), true);
    }

    public static k1 L(j0 j0Var, boolean z10) {
        a0 O = j0Var.O();
        return (z10 || (O instanceof k1)) ? M(O) : K(w.E(O));
    }

    public static k1 M(Object obj) {
        if (obj == null || (obj instanceof k1)) {
            return (k1) obj;
        }
        if (obj instanceof c) {
            return J((c) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return J((c) a0.u((byte[]) obj));
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        byte[] bArr = this.f10790c;
        int length = bArr.length - 1;
        byte b10 = bArr[length];
        byte b11 = (byte) ((255 << (bArr[0] & 255)) & bArr[length]);
        if (b10 == b11) {
            yVar.o(z10, 3, bArr);
        } else {
            yVar.q(z10, 3, bArr, 0, length, b11);
        }
    }

    @Override // gg.a0
    public boolean n() {
        return false;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, this.f10790c.length);
    }

    @Override // gg.c, gg.a0
    public a0 w() {
        return this;
    }

    @Override // gg.c, gg.a0
    public a0 z() {
        return this;
    }
}
