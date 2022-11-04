package zj;

import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a */
    private int f27082a;

    /* renamed from: b */
    private int f27083b;

    public b(byte[] bArr) {
        this.f27082a = 0;
        if (bArr.length == 4) {
            int d10 = f.d(bArr);
            this.f27083b = d10;
            if (!j.c(d10)) {
                throw new IllegalArgumentException("byte array is not an encoded finite field");
            }
            this.f27082a = j.a(this.f27083b);
            return;
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    private static String i(int i10) {
        if (i10 == 0) {
            return "0";
        }
        String str = ((byte) (i10 & 1)) == 1 ? "1" : BuildConfig.FLAVOR;
        int i11 = i10 >>> 1;
        int i12 = 1;
        while (i11 != 0) {
            if (((byte) (i11 & 1)) == 1) {
                str = str + "+x^" + i12;
            }
            i11 >>>= 1;
            i12++;
        }
        return str;
    }

    public int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public String b(int i10) {
        String str;
        StringBuilder sb2;
        String str2 = BuildConfig.FLAVOR;
        for (int i11 = 0; i11 < this.f27082a; i11++) {
            if ((((byte) i10) & 1) == 0) {
                sb2 = new StringBuilder();
                str = "0";
            } else {
                sb2 = new StringBuilder();
                str = "1";
            }
            sb2.append(str);
            sb2.append(str2);
            str2 = sb2.toString();
            i10 >>>= 1;
        }
        return str2;
    }

    public int c(int i10, int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i11 < 0) {
            i10 = f(i10);
            i11 = -i11;
        }
        int i12 = 1;
        while (i11 != 0) {
            if ((i11 & 1) == 1) {
                i12 = h(i12, i10);
            }
            i10 = h(i10, i10);
            i11 >>>= 1;
        }
        return i12;
    }

    public int d() {
        return this.f27082a;
    }

    public byte[] e() {
        return f.c(this.f27083b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            if (this.f27082a == bVar.f27082a && this.f27083b == bVar.f27083b) {
                return true;
            }
        }
        return false;
    }

    public int f(int i10) {
        return c(i10, (1 << this.f27082a) - 2);
    }

    public boolean g(int i10) {
        int i11 = this.f27082a;
        return i11 == 31 ? i10 >= 0 : i10 >= 0 && i10 < (1 << i11);
    }

    public int h(int i10, int i11) {
        return j.d(i10, i11, this.f27083b);
    }

    public int hashCode() {
        return this.f27083b;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.f27082a + ") = GF(2)[X]/<" + i(this.f27083b) + "> ";
    }
}
