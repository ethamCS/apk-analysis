package gj;

import org.bouncycastle.crypto.r;
/* loaded from: classes3.dex */
class n {

    /* renamed from: a */
    private final byte[] f11055a;

    /* renamed from: b */
    private final byte[] f11056b;

    /* renamed from: c */
    private final r f11057c;

    /* renamed from: d */
    private int f11058d;

    /* renamed from: e */
    private int f11059e;

    public n(byte[] bArr, byte[] bArr2, r rVar) {
        this.f11055a = bArr;
        this.f11056b = bArr2;
        this.f11057c = rVar;
    }

    public void a(byte[] bArr, boolean z10, int i10) {
        b(bArr, i10);
        if (z10) {
            this.f11059e++;
        }
    }

    public byte[] b(byte[] bArr, int i10) {
        if (bArr.length >= this.f11057c.getDigestSize()) {
            r rVar = this.f11057c;
            byte[] bArr2 = this.f11055a;
            rVar.update(bArr2, 0, bArr2.length);
            this.f11057c.update((byte) (this.f11058d >>> 24));
            this.f11057c.update((byte) (this.f11058d >>> 16));
            this.f11057c.update((byte) (this.f11058d >>> 8));
            this.f11057c.update((byte) this.f11058d);
            this.f11057c.update((byte) (this.f11059e >>> 8));
            this.f11057c.update((byte) this.f11059e);
            this.f11057c.update((byte) -1);
            r rVar2 = this.f11057c;
            byte[] bArr3 = this.f11056b;
            rVar2.update(bArr3, 0, bArr3.length);
            this.f11057c.doFinal(bArr, i10);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    public void c(int i10) {
        this.f11059e = i10;
    }

    public void d(int i10) {
        this.f11058d = i10;
    }
}
