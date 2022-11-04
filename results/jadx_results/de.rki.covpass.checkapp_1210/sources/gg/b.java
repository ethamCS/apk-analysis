package gg;

import java.util.Objects;
/* loaded from: classes3.dex */
public abstract class b extends a0 implements g0 {

    /* renamed from: d */
    static final o0 f10783d = new a(b.class, 30);

    /* renamed from: c */
    final char[] f10784c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return b.C(t1Var.F());
        }
    }

    public b(String str) {
        Objects.requireNonNull(str, "'string' cannot be null");
        this.f10784c = str.toCharArray();
    }

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "'string' cannot be null");
        int length = bArr.length;
        if ((length & 1) == 0) {
            int i10 = length / 2;
            char[] cArr = new char[i10];
            for (int i11 = 0; i11 != i10; i11++) {
                int i12 = i11 * 2;
                cArr[i11] = (char) ((bArr[i12 + 1] & 255) | (bArr[i12] << 8));
            }
            this.f10784c = cArr;
            return;
        }
        throw new IllegalArgumentException("malformed BMPString encoding encountered");
    }

    public b(char[] cArr) {
        Objects.requireNonNull(cArr, "'string' cannot be null");
        this.f10784c = cArr;
    }

    static b C(byte[] bArr) {
        return new j1(bArr);
    }

    public static b D(char[] cArr) {
        return new j1(cArr);
    }

    @Override // gg.g0
    public final String c() {
        return new String(this.f10784c);
    }

    @Override // gg.a0, gg.t
    public final int hashCode() {
        return ak.a.H(this.f10784c);
    }

    @Override // gg.a0
    public final boolean l(a0 a0Var) {
        if (!(a0Var instanceof b)) {
            return false;
        }
        return ak.a.d(this.f10784c, ((b) a0Var).f10784c);
    }

    @Override // gg.a0
    public final void m(y yVar, boolean z10) {
        int length = this.f10784c.length;
        yVar.s(z10, 30);
        yVar.k(length * 2);
        byte[] bArr = new byte[8];
        int i10 = length & (-4);
        int i11 = 0;
        while (i11 < i10) {
            char[] cArr = this.f10784c;
            char c10 = cArr[i11];
            char c11 = cArr[i11 + 1];
            char c12 = cArr[i11 + 2];
            char c13 = cArr[i11 + 3];
            i11 += 4;
            bArr[0] = (byte) (c10 >> '\b');
            bArr[1] = (byte) c10;
            bArr[2] = (byte) (c11 >> '\b');
            bArr[3] = (byte) c11;
            bArr[4] = (byte) (c12 >> '\b');
            bArr[5] = (byte) c12;
            bArr[6] = (byte) (c13 >> '\b');
            bArr[7] = (byte) c13;
            yVar.j(bArr, 0, 8);
        }
        if (i11 < length) {
            int i12 = 0;
            do {
                char c14 = this.f10784c[i11];
                i11++;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (c14 >> '\b');
                i12 = i13 + 1;
                bArr[i13] = (byte) c14;
            } while (i11 < length);
            yVar.j(bArr, 0, i12);
        }
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public final int q(boolean z10) {
        return y.g(z10, this.f10784c.length * 2);
    }

    public String toString() {
        return c();
    }
}
