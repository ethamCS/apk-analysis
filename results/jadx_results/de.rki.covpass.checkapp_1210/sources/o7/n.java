package o7;

import android.graphics.Rect;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a */
    private byte[] f17636a;

    /* renamed from: b */
    private int f17637b;

    /* renamed from: c */
    private int f17638c;

    public n(byte[] bArr, int i10, int i11) {
        this.f17636a = bArr;
        this.f17637b = i10;
        this.f17638c = i11;
    }

    public static byte[] e(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i12; i14++) {
            bArr2[i13] = bArr[i14];
            i13--;
        }
        return bArr2;
    }

    public static byte[] f(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = i11 - 1; i15 >= 0; i15--) {
                bArr2[i13] = bArr[(i15 * i10) + i14];
                i13--;
            }
        }
        return bArr2;
    }

    public static byte[] g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i10 * i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            for (int i14 = i11 - 1; i14 >= 0; i14--) {
                bArr2[i12] = bArr[(i14 * i10) + i13];
                i12++;
            }
        }
        return bArr2;
    }

    public n a(Rect rect, int i10) {
        int width = rect.width() / i10;
        int height = rect.height() / i10;
        int i11 = rect.top;
        byte[] bArr = new byte[width * height];
        if (i10 == 1) {
            int i12 = (i11 * this.f17637b) + rect.left;
            for (int i13 = 0; i13 < height; i13++) {
                System.arraycopy(this.f17636a, i12, bArr, i13 * width, width);
                i12 += this.f17637b;
            }
        } else {
            int i14 = (i11 * this.f17637b) + rect.left;
            for (int i15 = 0; i15 < height; i15++) {
                int i16 = i15 * width;
                int i17 = i14;
                for (int i18 = 0; i18 < width; i18++) {
                    bArr[i16] = this.f17636a[i17];
                    i17 += i10;
                    i16++;
                }
                i14 += this.f17637b * i10;
            }
        }
        return new n(bArr, width, height);
    }

    public byte[] b() {
        return this.f17636a;
    }

    public int c() {
        return this.f17638c;
    }

    public int d() {
        return this.f17637b;
    }

    public n h(int i10) {
        return i10 != 90 ? i10 != 180 ? i10 != 270 ? this : new n(f(this.f17636a, this.f17637b, this.f17638c), this.f17638c, this.f17637b) : new n(e(this.f17636a, this.f17637b, this.f17638c), this.f17637b, this.f17638c) : new n(g(this.f17636a, this.f17637b, this.f17638c), this.f17638c, this.f17637b);
    }
}
