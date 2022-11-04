package gg;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class i extends a0 {

    /* renamed from: q */
    static final o0 f10830q = new a(i.class, 10);

    /* renamed from: x */
    private static final i[] f10831x = new i[12];

    /* renamed from: c */
    private final byte[] f10832c;

    /* renamed from: d */
    private final int f10833d;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return i.C(t1Var.F(), false);
        }
    }

    public i(int i10) {
        if (i10 >= 0) {
            this.f10832c = BigInteger.valueOf(i10).toByteArray();
            this.f10833d = 0;
            return;
        }
        throw new IllegalArgumentException("enumerated must be non-negative");
    }

    i(byte[] bArr, boolean z10) {
        if (!q.N(bArr)) {
            if ((bArr[0] & 128) != 0) {
                throw new IllegalArgumentException("enumerated must be non-negative");
            }
            this.f10832c = z10 ? ak.a.h(bArr) : bArr;
            this.f10833d = q.Q(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    public static i C(byte[] bArr, boolean z10) {
        if (bArr.length > 1) {
            return new i(bArr, z10);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i10 = bArr[0] & 255;
        i[] iVarArr = f10831x;
        if (i10 >= iVarArr.length) {
            return new i(bArr, z10);
        }
        i iVar = iVarArr[i10];
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(bArr, z10);
        iVarArr[i10] = iVar2;
        return iVar2;
    }

    public static i D(j0 j0Var, boolean z10) {
        return (i) f10830q.e(j0Var, z10);
    }

    public static i E(Object obj) {
        if (obj == null || (obj instanceof i)) {
            return (i) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (i) f10830q.b((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    public BigInteger F() {
        return new BigInteger(this.f10832c);
    }

    public int G() {
        byte[] bArr = this.f10832c;
        int length = bArr.length;
        int i10 = this.f10833d;
        if (length - i10 <= 4) {
            return q.L(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Enumerated out of int range");
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return ak.a.F(this.f10832c);
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (!(a0Var instanceof i)) {
            return false;
        }
        return ak.a.c(this.f10832c, ((i) a0Var).f10832c);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.o(z10, 10, this.f10832c);
    }

    @Override // gg.a0
    public boolean n() {
        return false;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, this.f10832c.length);
    }
}
