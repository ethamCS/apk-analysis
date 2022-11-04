package gg;
/* loaded from: classes3.dex */
public class v0 extends c {

    /* renamed from: x */
    private final int f10904x;

    /* renamed from: y */
    private final c[] f10905y;

    public v0(byte[] bArr, int i10) {
        this(bArr, i10, 1000);
    }

    public v0(byte[] bArr, int i10, int i11) {
        super(bArr, i10);
        this.f10905y = null;
        this.f10904x = i11;
    }

    public v0(c[] cVarArr) {
        this(cVarArr, 1000);
    }

    public v0(c[] cVarArr, int i10) {
        super(J(cVarArr), false);
        this.f10905y = cVarArr;
        this.f10904x = i10;
    }

    public static byte[] J(c[] cVarArr) {
        int length = cVarArr.length;
        if (length != 0) {
            if (length == 1) {
                return cVarArr[0].f10790c;
            }
            int i10 = length - 1;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                byte[] bArr = cVarArr[i12].f10790c;
                if (bArr[0] != 0) {
                    throw new IllegalArgumentException("only the last nested bitstring can have padding");
                }
                i11 += bArr.length - 1;
            }
            byte[] bArr2 = cVarArr[i10].f10790c;
            byte b10 = bArr2[0];
            byte[] bArr3 = new byte[i11 + bArr2.length];
            bArr3[0] = b10;
            int i13 = 1;
            for (c cVar : cVarArr) {
                byte[] bArr4 = cVar.f10790c;
                int length2 = bArr4.length - 1;
                System.arraycopy(bArr4, 1, bArr3, i13, length2);
                i13 += length2;
            }
            return bArr3;
        }
        return new byte[]{0};
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        if (!n()) {
            byte[] bArr = this.f10790c;
            g2.K(yVar, z10, bArr, 0, bArr.length);
            return;
        }
        yVar.s(z10, 35);
        yVar.i(128);
        c[] cVarArr = this.f10905y;
        if (cVarArr != null) {
            yVar.x(cVarArr);
        } else {
            byte[] bArr2 = this.f10790c;
            if (bArr2.length >= 2) {
                byte b10 = bArr2[0];
                int length = bArr2.length;
                int i10 = length - 1;
                int i11 = this.f10904x - 1;
                while (i10 > i11) {
                    g2.J(yVar, true, (byte) 0, this.f10790c, length - i10, i11);
                    i10 -= i11;
                }
                g2.J(yVar, true, b10, this.f10790c, length - i10, i10);
            }
        }
        yVar.i(0);
        yVar.i(0);
    }

    @Override // gg.a0
    public boolean n() {
        return this.f10905y != null || this.f10790c.length > this.f10904x;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        if (!n()) {
            return g2.L(z10, this.f10790c.length);
        }
        int i10 = z10 ? 4 : 3;
        if (this.f10905y == null) {
            byte[] bArr = this.f10790c;
            if (bArr.length < 2) {
                return i10;
            }
            int i11 = this.f10904x;
            int length = (bArr.length - 2) / (i11 - 1);
            return i10 + (g2.L(true, i11) * length) + g2.L(true, this.f10790c.length - (length * (this.f10904x - 1)));
        }
        int i12 = 0;
        while (true) {
            c[] cVarArr = this.f10905y;
            if (i12 >= cVarArr.length) {
                return i10;
            }
            i10 += cVarArr[i12].q(true);
            i12++;
        }
    }
}
