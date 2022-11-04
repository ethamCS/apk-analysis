package wh;
/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a */
    private long[] f25085a;

    @Override // wh.b
    public void a(byte[] bArr) {
        this.f25085a = d.d(bArr);
    }

    @Override // wh.b
    public void b(long j10, byte[] bArr) {
        long[] l10 = d.l();
        if (j10 <= 0) {
            d.b(l10, bArr);
        }
        long[] jArr = new long[2];
        d.f(this.f25085a, jArr);
        do {
            if ((1 & j10) != 0) {
                d.j(l10, jArr);
            }
            d.m(jArr, jArr);
            j10 >>>= 1;
        } while (j10 > 0);
        d.b(l10, bArr);
    }
}
