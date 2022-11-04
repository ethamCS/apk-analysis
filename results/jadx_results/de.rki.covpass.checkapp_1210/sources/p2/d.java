package p2;

import java.util.Arrays;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    public byte[] f18742a = new byte[1];

    /* renamed from: b */
    public int f18743b;

    public int a() {
        int i10 = this.f18743b;
        int i11 = i10 % 8;
        int i12 = i10 / 8;
        return i11 == 0 ? i12 : i12 + 1;
    }

    public int b(int i10) {
        int i11 = i10 / 8;
        int i12 = i10 % 8;
        return (this.f18742a[i11] & (1 << i12)) >> i12;
    }

    public int c(int i10, int i11, boolean z10) {
        int i12;
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Length can't exceed 32");
        }
        if (i10 + i11 > this.f18743b) {
            throw new IllegalArgumentException("Attempting to read past the end. length=" + i11 + " remaining=" + (this.f18743b - i10));
        }
        int i13 = 0;
        if (z10) {
            i12 = 0;
            while (i13 < i11) {
                i12 |= b(i10 + i13) << ((i11 - i13) - 1);
                i13++;
            }
        } else {
            i12 = 0;
            while (i13 < i11) {
                i12 |= b(i10 + i13) << i13;
                i13++;
            }
        }
        return i12;
    }

    public void d(int i10) {
        this.f18743b = i10;
        int a10 = a();
        if (this.f18742a.length < a10) {
            this.f18742a = new byte[a10];
        }
    }

    public void e(int i10, int i11) {
        int i12 = i10 / 8;
        byte[] bArr = this.f18742a;
        bArr[i12] = (byte) (((byte) ((1 << (i10 % 8)) & ((-i11) ^ bArr[i12]))) ^ bArr[i12]);
    }

    public void f() {
        Arrays.fill(this.f18742a, 0, a(), (byte) 0);
    }
}
