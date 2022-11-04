package gg;
/* loaded from: classes3.dex */
public abstract class n0 extends a0 implements g0 {

    /* renamed from: d */
    static final o0 f10862d = new a(n0.class, 28);

    /* renamed from: q */
    private static final char[] f10863q = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c */
    final byte[] f10864c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return n0.C(t1Var.F());
        }
    }

    public n0(byte[] bArr, boolean z10) {
        this.f10864c = z10 ? ak.a.h(bArr) : bArr;
    }

    public static n0 C(byte[] bArr) {
        return new c2(bArr, false);
    }

    private static void D(StringBuffer stringBuffer, int i10) {
        char[] cArr = f10863q;
        stringBuffer.append(cArr[(i10 >>> 4) & 15]);
        stringBuffer.append(cArr[i10 & 15]);
    }

    private static void E(StringBuffer stringBuffer, int i10) {
        if (i10 < 128) {
            D(stringBuffer, i10);
            return;
        }
        byte[] bArr = new byte[5];
        int i11 = 5;
        do {
            i11--;
            bArr[i11] = (byte) i10;
            i10 >>>= 8;
        } while (i10 != 0);
        int i12 = 5 - i11;
        int i13 = i11 - 1;
        bArr[i13] = (byte) (i12 | 128);
        while (true) {
            int i14 = i13 + 1;
            D(stringBuffer, bArr[i13]);
            if (i14 >= 5) {
                return;
            }
            i13 = i14;
        }
    }

    @Override // gg.g0
    public final String c() {
        int length = this.f10864c.length;
        StringBuffer stringBuffer = new StringBuffer(((y.f(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        E(stringBuffer, length);
        for (int i10 = 0; i10 < length; i10++) {
            D(stringBuffer, this.f10864c[i10]);
        }
        return stringBuffer.toString();
    }

    @Override // gg.a0, gg.t
    public final int hashCode() {
        return ak.a.F(this.f10864c);
    }

    @Override // gg.a0
    public final boolean l(a0 a0Var) {
        if (!(a0Var instanceof n0)) {
            return false;
        }
        return ak.a.c(this.f10864c, ((n0) a0Var).f10864c);
    }

    @Override // gg.a0
    public final void m(y yVar, boolean z10) {
        yVar.o(z10, 28, this.f10864c);
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public final int q(boolean z10) {
        return y.g(z10, this.f10864c.length);
    }

    public String toString() {
        return c();
    }
}
