package jj;
/* loaded from: classes3.dex */
public final class a extends zh.b {

    /* renamed from: d */
    private int f14445d;

    /* renamed from: q */
    private byte[] f14446q;

    public a(int i10, byte[] bArr) {
        super(true);
        if (bArr.length == c.b(i10)) {
            this.f14445d = i10;
            this.f14446q = ak.a.h(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] b() {
        return ak.a.h(this.f14446q);
    }

    public int c() {
        return this.f14445d;
    }
}
