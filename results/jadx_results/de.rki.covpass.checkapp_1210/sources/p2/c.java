package p2;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    int f18736a;

    /* renamed from: b */
    int f18737b;

    /* renamed from: c */
    int f18738c;

    /* renamed from: d */
    int f18739d;

    /* renamed from: e */
    int[] f18740e;

    /* renamed from: f */
    int[] f18741f;

    public c(int i10, int i11) {
        int i12 = 1;
        if (i10 < 1 || i10 > 16) {
            throw new IllegalArgumentException("Degree must be more than 1 and less than or equal to 16");
        }
        this.f18738c = i10;
        this.f18739d = i11;
        this.f18736a = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f18736a |= 1 << i13;
        }
        int i14 = this.f18736a + 1;
        this.f18737b = i14;
        this.f18741f = new int[i14];
        this.f18740e = new int[i14 * 2];
        for (int i15 = 0; i15 < this.f18736a; i15++) {
            this.f18740e[i15] = i12;
            this.f18741f[i12] = i15;
            i12 = b.a(i12, 2, i11, this.f18737b);
        }
        for (int i16 = 0; i16 < this.f18737b; i16++) {
            int[] iArr = this.f18740e;
            iArr[this.f18736a + i16] = iArr[i16];
        }
    }

    public int a(int i10, int i11) {
        if (i11 != 0) {
            if (i10 == 0) {
                return 0;
            }
            int[] iArr = this.f18740e;
            int[] iArr2 = this.f18741f;
            return iArr[(iArr2[i10] + this.f18736a) - iArr2[i11]];
        }
        throw new ArithmeticException("Divide by zero");
    }

    public int b(int i10) {
        return this.f18740e[this.f18736a - this.f18741f[i10]];
    }

    public int c(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f18740e;
        int[] iArr2 = this.f18741f;
        return iArr[iArr2[i10] + iArr2[i11]];
    }

    public void d(ok.i iVar, ok.i iVar2, int i10, ok.i iVar3) {
        iVar3.f(Math.max(iVar.f18614b, iVar2.f18614b));
        int max = Math.max(0, iVar2.f18614b - iVar.f18614b);
        int max2 = Math.max(0, iVar.f18614b - iVar2.f18614b);
        int i11 = iVar3.f18614b;
        for (int i12 = 0; i12 < max2; i12++) {
            iVar3.f18613a[i12] = iVar.f18613a[i12];
        }
        for (int i13 = 0; i13 < max; i13++) {
            iVar3.f18613a[i13] = (byte) c(iVar2.f18613a[i13] & 255, i10);
        }
        for (int max3 = Math.max(max, max2); max3 < i11; max3++) {
            iVar3.f18613a[max3] = (byte) ((iVar.f18613a[max3 - max] & 255) ^ c(iVar2.f18613a[max3 - max2] & 255, i10));
        }
    }

    public int e(ok.i iVar, int i10) {
        int i11 = iVar.f18613a[0] & 255;
        for (int i12 = 1; i12 < iVar.f18614b; i12++) {
            i11 = c(i11, i10) ^ (iVar.f18613a[i12] & 255);
        }
        return i11;
    }

    public int f(int i10, ok.i iVar, int i11) {
        for (int i12 = 0; i12 < iVar.f18614b; i12++) {
            i10 = c(i10, i11) ^ (iVar.f18613a[i12] & 255);
        }
        return i10;
    }

    public int g(ok.i iVar, int i10) {
        byte[] bArr = iVar.f18613a;
        int i11 = iVar.f18614b;
        int i12 = bArr[i11 - 1] & 255;
        for (int i13 = i11 - 2; i13 >= 0; i13--) {
            i12 = c(i12, i10) ^ (iVar.f18613a[i13] & 255);
        }
        return i12;
    }

    public void h(ok.i iVar, ok.i iVar2, ok.i iVar3) {
        iVar3.f((iVar.f18614b + iVar2.f18614b) - 1);
        iVar3.j();
        for (int i10 = 0; i10 < iVar2.f18614b; i10++) {
            int i11 = iVar2.f18613a[i10] & 255;
            for (int i12 = 0; i12 < iVar.f18614b; i12++) {
                byte[] bArr = iVar3.f18613a;
                int i13 = i12 + i10;
                bArr[i13] = (byte) (((byte) c(iVar.f18613a[i12] & 255, i11)) ^ bArr[i13]);
            }
        }
    }

    public void i(ok.i iVar, ok.i iVar2, ok.i iVar3) {
        int i10;
        iVar3.f((iVar.f18614b + iVar2.f18614b) - 1);
        iVar3.j();
        for (int i11 = 0; i11 < iVar2.f18614b; i11++) {
            int i12 = iVar2.f18613a[i11] & 255;
            int i13 = 0;
            while (true) {
                if (i13 < iVar.f18614b) {
                    byte[] bArr = iVar3.f18613a;
                    int i14 = i13 + i11;
                    bArr[i14] = (byte) (((byte) c(iVar.f18613a[(i10 - i13) - 1] & 255, i12)) ^ bArr[i14]);
                    i13++;
                }
            }
        }
    }

    public int j(int i10, int i11) {
        return this.f18740e[(this.f18741f[i10] * i11) % this.f18736a];
    }
}
