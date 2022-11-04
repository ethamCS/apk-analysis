package h6;
/* loaded from: classes.dex */
public final class n extends j {

    /* renamed from: c */
    private final byte[] f11353c;

    /* renamed from: d */
    private final int f11354d;

    /* renamed from: e */
    private final int f11355e;

    /* renamed from: f */
    private final int f11356f;

    /* renamed from: g */
    private final int f11357g;

    public n(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f11353c = bArr;
        this.f11354d = i10;
        this.f11355e = i11;
        this.f11356f = i12;
        this.f11357g = i13;
        if (!z10) {
            return;
        }
        h(i14, i15);
    }

    private void h(int i10, int i11) {
        byte[] bArr = this.f11353c;
        int i12 = (this.f11357g * this.f11354d) + this.f11356f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                byte b10 = bArr[i16];
                bArr[i16] = bArr[i15];
                bArr[i15] = b10;
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f11354d;
        }
    }

    @Override // h6.j
    public byte[] b() {
        int d10 = d();
        int a10 = a();
        int i10 = this.f11354d;
        if (d10 == i10 && a10 == this.f11355e) {
            return this.f11353c;
        }
        int i11 = d10 * a10;
        byte[] bArr = new byte[i11];
        int i12 = (this.f11357g * i10) + this.f11356f;
        if (d10 == i10) {
            System.arraycopy(this.f11353c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < a10; i13++) {
            System.arraycopy(this.f11353c, i12, bArr, i13 * d10, d10);
            i12 += this.f11354d;
        }
        return bArr;
    }

    @Override // h6.j
    public byte[] c(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i10)));
        }
        int d10 = d();
        if (bArr == null || bArr.length < d10) {
            bArr = new byte[d10];
        }
        System.arraycopy(this.f11353c, ((i10 + this.f11357g) * this.f11354d) + this.f11356f, bArr, 0, d10);
        return bArr;
    }
}
