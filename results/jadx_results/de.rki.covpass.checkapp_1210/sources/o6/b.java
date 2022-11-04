package o6;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements Cloneable {

    /* renamed from: c */
    private final int f17548c;

    /* renamed from: d */
    private final int f17549d;

    /* renamed from: q */
    private final int f17550q;

    /* renamed from: x */
    private final int[] f17551x;

    public b(int i10) {
        this(i10, i10);
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f17548c = i10;
        this.f17549d = i11;
        int i12 = (i10 + 31) / 32;
        this.f17550q = i12;
        this.f17551x = new int[i12 * i11];
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f17548c = i10;
        this.f17549d = i11;
        this.f17550q = i12;
        this.f17551x = iArr;
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f17549d * (this.f17548c + 1));
        for (int i10 = 0; i10 < this.f17549d; i10++) {
            for (int i11 = 0; i11 < this.f17548c; i11++) {
                sb2.append(f(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void c() {
        int length = this.f17551x.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f17551x[i10] = 0;
        }
    }

    /* renamed from: d */
    public b clone() {
        return new b(this.f17548c, this.f17549d, this.f17550q, (int[]) this.f17551x.clone());
    }

    public void e(int i10, int i11) {
        int i12 = (i11 * this.f17550q) + (i10 / 32);
        int[] iArr = this.f17551x;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17548c == bVar.f17548c && this.f17549d == bVar.f17549d && this.f17550q == bVar.f17550q && Arrays.equals(this.f17551x, bVar.f17551x);
    }

    public boolean f(int i10, int i11) {
        return ((this.f17551x[(i11 * this.f17550q) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int[] g() {
        int length = this.f17551x.length - 1;
        while (length >= 0 && this.f17551x[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f17550q;
        int i11 = length / i10;
        int i12 = (length % i10) << 5;
        int i13 = 31;
        while ((this.f17551x[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public int[] h() {
        int i10 = this.f17548c;
        int i11 = this.f17549d;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.f17549d; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f17550q;
                if (i15 < i16) {
                    int i17 = this.f17551x[(i16 * i14) + i15];
                    if (i17 != 0) {
                        if (i14 < i11) {
                            i11 = i14;
                        }
                        if (i14 > i13) {
                            i13 = i14;
                        }
                        int i18 = i15 << 5;
                        if (i18 < i10) {
                            int i19 = 0;
                            while ((i17 << (31 - i19)) == 0) {
                                i19++;
                            }
                            int i20 = i19 + i18;
                            if (i20 < i10) {
                                i10 = i20;
                            }
                        }
                        if (i18 + 31 > i12) {
                            int i21 = 31;
                            while ((i17 >>> i21) == 0) {
                                i21--;
                            }
                            int i22 = i18 + i21;
                            if (i22 > i12) {
                                i12 = i22;
                            }
                        }
                    }
                    i15++;
                }
            }
        }
        if (i12 < i10 || i13 < i11) {
            return null;
        }
        return new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
    }

    public int hashCode() {
        int i10 = this.f17548c;
        return (((((((i10 * 31) + i10) * 31) + this.f17549d) * 31) + this.f17550q) * 31) + Arrays.hashCode(this.f17551x);
    }

    public int i() {
        return this.f17549d;
    }

    public a j(int i10, a aVar) {
        if (aVar == null || aVar.l() < this.f17548c) {
            aVar = new a(this.f17548c);
        } else {
            aVar.e();
        }
        int i11 = i10 * this.f17550q;
        for (int i12 = 0; i12 < this.f17550q; i12++) {
            aVar.v(i12 << 5, this.f17551x[i11 + i12]);
        }
        return aVar;
    }

    public int[] k() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.f17551x;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f17550q;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) << 5;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    public int l() {
        return this.f17548c;
    }

    public void m() {
        a aVar = new a(this.f17548c);
        a aVar2 = new a(this.f17548c);
        int i10 = (this.f17549d + 1) / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            aVar = j(i11, aVar);
            int i12 = (this.f17549d - 1) - i11;
            aVar2 = j(i12, aVar2);
            aVar.q();
            aVar2.q();
            q(i11, aVar2);
            q(i12, aVar);
        }
    }

    public void o(int i10, int i11) {
        int i12 = (i11 * this.f17550q) + (i10 / 32);
        int[] iArr = this.f17551x;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void p(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f17549d || i14 > this.f17548c) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f17550q * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f17551x;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public void q(int i10, a aVar) {
        int[] i11 = aVar.i();
        int[] iArr = this.f17551x;
        int i12 = this.f17550q;
        System.arraycopy(i11, 0, iArr, i10 * i12, i12);
    }

    public String t(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return t("X ", "  ");
    }
}
