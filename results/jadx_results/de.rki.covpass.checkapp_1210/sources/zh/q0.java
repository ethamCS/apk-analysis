package zh;
/* loaded from: classes3.dex */
public final class q0 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private final b1 f26984c;

    /* renamed from: d */
    private final int f26985d;

    /* renamed from: q */
    private final byte[] f26986q;

    /* renamed from: x */
    private final boolean f26987x;

    public q0(b1 b1Var, int i10, byte[] bArr, boolean z10) {
        this.f26984c = b1Var;
        this.f26985d = i10;
        this.f26986q = ak.a.h(bArr);
        this.f26987x = z10;
    }

    public b1 a() {
        return this.f26984c;
    }

    public int b() {
        return this.f26985d;
    }

    public byte[] c() {
        return ak.a.h(this.f26986q);
    }

    public boolean d() {
        return this.f26987x;
    }
}
