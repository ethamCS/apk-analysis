package o6;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final byte[] f17552a;

    /* renamed from: b */
    private int f17553b;

    /* renamed from: c */
    private int f17554c;

    public c(byte[] bArr) {
        this.f17552a = bArr;
    }

    public int a() {
        return ((this.f17552a.length - this.f17553b) * 8) - this.f17554c;
    }

    public int b() {
        return this.f17554c;
    }

    public int c() {
        return this.f17553b;
    }

    public int d(int i10) {
        if (i10 <= 0 || i10 > 32 || i10 > a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f17554c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int min = Math.min(i10, i13);
            int i14 = i13 - min;
            byte[] bArr = this.f17552a;
            int i15 = this.f17553b;
            int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
            i10 -= min;
            int i17 = this.f17554c + min;
            this.f17554c = i17;
            if (i17 == 8) {
                this.f17554c = 0;
                this.f17553b = i15 + 1;
            }
            i12 = i16;
        }
        if (i10 <= 0) {
            return i12;
        }
        while (i10 >= 8) {
            int i18 = i12 << 8;
            byte[] bArr2 = this.f17552a;
            int i19 = this.f17553b;
            i12 = (bArr2[i19] & 255) | i18;
            this.f17553b = i19 + 1;
            i10 -= 8;
        }
        if (i10 <= 0) {
            return i12;
        }
        int i20 = 8 - i10;
        int i21 = (i12 << i10) | ((((255 >> i20) << i20) & this.f17552a[this.f17553b]) >> i20);
        this.f17554c += i10;
        return i21;
    }
}
