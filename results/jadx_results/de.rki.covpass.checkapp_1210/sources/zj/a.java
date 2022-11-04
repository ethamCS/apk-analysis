package zj;

import java.lang.reflect.Array;
/* loaded from: classes3.dex */
public class a extends g {

    /* renamed from: c */
    private int[][] f27080c;

    /* renamed from: d */
    private int f27081d;

    public a(int i10, int[][] iArr) {
        if (iArr[0].length == ((i10 + 31) >> 5)) {
            this.f27092b = i10;
            this.f27091a = iArr.length;
            this.f27081d = iArr[0].length;
            int i11 = i10 & 31;
            int i12 = i11 == 0 ? -1 : (1 << i11) - 1;
            for (int i13 = 0; i13 < this.f27091a; i13++) {
                int[] iArr2 = iArr[i13];
                int i14 = this.f27081d - 1;
                iArr2[i14] = iArr2[i14] & i12;
            }
            this.f27080c = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    public a(a aVar) {
        this.f27092b = aVar.a();
        this.f27091a = aVar.b();
        this.f27081d = aVar.f27081d;
        this.f27080c = new int[aVar.f27080c.length];
        int i10 = 0;
        while (true) {
            int[][] iArr = this.f27080c;
            if (i10 < iArr.length) {
                iArr[i10] = d.a(aVar.f27080c[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public a(byte[] bArr) {
        if (bArr.length >= 9) {
            this.f27091a = f.e(bArr, 0);
            int e10 = f.e(bArr, 4);
            this.f27092b = e10;
            int i10 = this.f27091a;
            int i11 = ((e10 + 7) >>> 3) * i10;
            if (i10 > 0) {
                int i12 = 8;
                if (i11 == bArr.length - 8) {
                    int i13 = (e10 + 31) >>> 5;
                    this.f27081d = i13;
                    this.f27080c = (int[][]) Array.newInstance(int.class, i10, i13);
                    int i14 = this.f27092b;
                    int i15 = i14 >> 5;
                    int i16 = i14 & 31;
                    for (int i17 = 0; i17 < this.f27091a; i17++) {
                        int i18 = 0;
                        while (i18 < i15) {
                            this.f27080c[i17][i18] = f.e(bArr, i12);
                            i18++;
                            i12 += 4;
                        }
                        int i19 = 0;
                        while (i19 < i16) {
                            int[] iArr = this.f27080c[i17];
                            iArr[i15] = ((bArr[i12] & 255) << i19) ^ iArr[i15];
                            i19 += 8;
                            i12++;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    public byte[] c() {
        int i10 = this.f27091a;
        int i11 = 8;
        byte[] bArr = new byte[(((this.f27092b + 7) >>> 3) * i10) + 8];
        f.a(i10, bArr, 0);
        f.a(this.f27092b, bArr, 4);
        int i12 = this.f27092b;
        int i13 = i12 >>> 5;
        int i14 = i12 & 31;
        for (int i15 = 0; i15 < this.f27091a; i15++) {
            int i16 = 0;
            while (i16 < i13) {
                f.a(this.f27080c[i15][i16], bArr, i11);
                i16++;
                i11 += 4;
            }
            int i17 = 0;
            while (i17 < i14) {
                bArr[i11] = (byte) ((this.f27080c[i15][i13] >>> i17) & 255);
                i17 += 8;
                i11++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f27091a != aVar.f27091a || this.f27092b != aVar.f27092b || this.f27081d != aVar.f27081d) {
            return false;
        }
        for (int i10 = 0; i10 < this.f27091a; i10++) {
            if (!d.b(this.f27080c[i10], aVar.f27080c[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = (((this.f27091a * 31) + this.f27092b) * 31) + this.f27081d;
        for (int i11 = 0; i11 < this.f27091a; i11++) {
            i10 = (i10 * 31) + ak.a.I(this.f27080c[i11]);
        }
        return i10;
    }

    public String toString() {
        int i10 = this.f27092b & 31;
        int i11 = this.f27081d;
        if (i10 != 0) {
            i11--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < this.f27091a; i12++) {
            stringBuffer.append(i12 + ": ");
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.f27080c[i12][i13];
                for (int i15 = 0; i15 < 32; i15++) {
                    if (((i14 >>> i15) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i16 = this.f27080c[i12][this.f27081d - 1];
            for (int i17 = 0; i17 < i10; i17++) {
                if (((i16 >>> i17) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}
