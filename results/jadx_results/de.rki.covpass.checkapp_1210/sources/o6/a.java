package o6;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: c */
    private int[] f17546c;

    /* renamed from: d */
    private int f17547d;

    public a() {
        this.f17547d = 0;
        this.f17546c = new int[1];
    }

    public a(int i10) {
        this.f17547d = i10;
        this.f17546c = p(i10);
    }

    a(int[] iArr, int i10) {
        this.f17546c = iArr;
        this.f17547d = i10;
    }

    private void g(int i10) {
        if (i10 > (this.f17546c.length << 5)) {
            int[] p10 = p(i10);
            int[] iArr = this.f17546c;
            System.arraycopy(iArr, 0, p10, 0, iArr.length);
            this.f17546c = p10;
        }
    }

    private static int[] p(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a(boolean z10) {
        g(this.f17547d + 1);
        if (z10) {
            int[] iArr = this.f17546c;
            int i10 = this.f17547d;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f17547d++;
    }

    public void c(a aVar) {
        int i10 = aVar.f17547d;
        g(this.f17547d + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.h(i11));
        }
    }

    public void d(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        g(this.f17547d + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public void e() {
        int length = this.f17546c.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f17546c[i10] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17547d == aVar.f17547d && Arrays.equals(this.f17546c, aVar.f17546c);
    }

    /* renamed from: f */
    public a clone() {
        return new a((int[]) this.f17546c.clone(), this.f17547d);
    }

    public boolean h(int i10) {
        return ((1 << (i10 & 31)) & this.f17546c[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f17547d * 31) + Arrays.hashCode(this.f17546c);
    }

    public int[] i() {
        return this.f17546c;
    }

    public int j(int i10) {
        int i11 = this.f17547d;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f17546c[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f17546c;
            if (i12 == iArr.length) {
                return this.f17547d;
            }
            i13 = iArr[i12];
        }
        return Math.min((i12 << 5) + Integer.numberOfTrailingZeros(i13), this.f17547d);
    }

    public int k(int i10) {
        int i11 = this.f17547d;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.f17546c[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f17546c;
            if (i12 == iArr.length) {
                return this.f17547d;
            }
            i13 = ~iArr[i12];
        }
        return Math.min((i12 << 5) + Integer.numberOfTrailingZeros(i13), this.f17547d);
    }

    public int l() {
        return this.f17547d;
    }

    public int m() {
        return (this.f17547d + 7) / 8;
    }

    public boolean o(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f17547d) {
            throw new IllegalArgumentException();
        }
        if (i11 == i10) {
            return true;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = 31;
            int i17 = i15 > i13 ? 0 : i10 & 31;
            if (i15 >= i14) {
                i16 = 31 & i12;
            }
            int i18 = (2 << i16) - (1 << i17);
            int i19 = this.f17546c[i15] & i18;
            if (!z10) {
                i18 = 0;
            }
            if (i19 != i18) {
                return false;
            }
            i15++;
        }
        return true;
    }

    public void q() {
        int[] iArr = new int[this.f17546c.length];
        int i10 = (this.f17547d - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = this.f17546c[i12];
            long j11 = ((j10 & 1431655765) << 1) | ((j10 >> 1) & 1431655765);
            long j12 = ((j11 & 858993459) << 2) | ((j11 >> 2) & 858993459);
            long j13 = ((j12 & 252645135) << 4) | ((j12 >> 4) & 252645135);
            long j14 = ((j13 & 16711935) << 8) | ((j13 >> 8) & 16711935);
            iArr[i10 - i12] = (int) (((j14 & 65535) << 16) | ((j14 >> 16) & 65535));
        }
        int i13 = this.f17547d;
        int i14 = i11 << 5;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i11 - 1] = i16;
        }
        this.f17546c = iArr;
    }

    public void t(int i10) {
        int[] iArr = this.f17546c;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public String toString() {
        int i10 = this.f17547d;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f17547d; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(h(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public void v(int i10, int i11) {
        this.f17546c[i10 / 32] = i11;
    }

    public void w(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (h(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void x(a aVar) {
        if (this.f17547d == aVar.f17547d) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f17546c;
                if (i10 >= iArr.length) {
                    return;
                }
                iArr[i10] = iArr[i10] ^ aVar.f17546c[i10];
                i10++;
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }
}
