package jj;
/* loaded from: classes3.dex */
public final class b extends zh.b {

    /* renamed from: d */
    private int f14447d;

    /* renamed from: q */
    private byte[] f14448q;

    public b(int i10, byte[] bArr) {
        super(false);
        if (bArr.length == c.c(i10)) {
            this.f14447d = i10;
            this.f14448q = ak.a.h(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] b() {
        return ak.a.h(this.f14448q);
    }

    public int c() {
        return this.f14447d;
    }
}
