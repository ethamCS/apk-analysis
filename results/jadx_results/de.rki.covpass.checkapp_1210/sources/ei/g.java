package ei;

import ak.q;
import java.math.BigInteger;
/* loaded from: classes3.dex */
class g {

    /* renamed from: a */
    private final byte[] f9677a;

    /* renamed from: b */
    private int f9678b = 0;

    public g(byte[] bArr) {
        this.f9677a = bArr;
    }

    public g(byte[] bArr, byte[] bArr2) {
        this.f9677a = bArr2;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.f9678b += bArr.length;
    }

    public boolean a() {
        return this.f9678b < this.f9677a.length;
    }

    public BigInteger b() {
        int g10 = g();
        int i10 = this.f9678b;
        int i11 = i10 + g10;
        byte[] bArr = this.f9677a;
        if (i11 <= bArr.length) {
            int i12 = g10 + i10;
            this.f9678b = i12;
            return new BigInteger(1, ak.a.w(bArr, i10, i12));
        }
        throw new IllegalArgumentException("not enough data for big num");
    }

    public byte[] c() {
        int g10 = g();
        if (g10 == 0) {
            return new byte[0];
        }
        int i10 = this.f9678b;
        byte[] bArr = this.f9677a;
        if (i10 > bArr.length - g10) {
            throw new IllegalArgumentException("not enough data for block");
        }
        int i11 = g10 + i10;
        this.f9678b = i11;
        return ak.a.w(bArr, i10, i11);
    }

    public byte[] d() {
        return e(8);
    }

    public byte[] e(int i10) {
        int i11;
        int g10 = g();
        if (g10 == 0) {
            return new byte[0];
        }
        int i12 = this.f9678b;
        byte[] bArr = this.f9677a;
        if (i12 > bArr.length - g10) {
            throw new IllegalArgumentException("not enough data for block");
        }
        if (g10 % i10 != 0) {
            throw new IllegalArgumentException("missing padding");
        }
        int i13 = i12 + g10;
        this.f9678b = i13;
        if (g10 > 0 && (i11 = bArr[i13 - 1] & 255) > 0 && i11 < i10) {
            i13 -= i11;
            int i14 = 1;
            int i15 = i13;
            while (i14 <= i11) {
                if (i14 != (this.f9677a[i15] & 255)) {
                    throw new IllegalArgumentException("incorrect padding");
                }
                i14++;
                i15++;
            }
        }
        return ak.a.w(this.f9677a, i12, i13);
    }

    public String f() {
        return q.b(c());
    }

    public int g() {
        int i10 = this.f9678b;
        byte[] bArr = this.f9677a;
        if (i10 <= bArr.length - 4) {
            int i11 = i10 + 1;
            this.f9678b = i11;
            int i12 = i11 + 1;
            this.f9678b = i12;
            int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
            int i14 = i12 + 1;
            this.f9678b = i14;
            int i15 = i13 | ((bArr[i12] & 255) << 8);
            this.f9678b = i14 + 1;
            return i15 | (bArr[i14] & 255);
        }
        throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
    }

    public void h() {
        int g10 = g();
        int i10 = this.f9678b;
        if (i10 <= this.f9677a.length - g10) {
            this.f9678b = i10 + g10;
            return;
        }
        throw new IllegalArgumentException("not enough data for block");
    }
}
