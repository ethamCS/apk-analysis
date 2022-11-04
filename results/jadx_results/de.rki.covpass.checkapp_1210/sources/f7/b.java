package f7;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a */
    private final byte[] f9863a;

    /* renamed from: b */
    private int f9864b = 0;

    public b(int i10) {
        this.f9863a = new byte[i10];
    }

    private void c(int i10, boolean z10) {
        this.f9863a[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f9864b;
            this.f9864b = i12 + 1;
            c(i12, z10);
        }
    }

    public byte[] b(int i10) {
        int length = this.f9863a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f9863a[i11 / i10];
        }
        return bArr;
    }
}
