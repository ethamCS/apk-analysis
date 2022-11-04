package zh;
/* loaded from: classes3.dex */
public class a implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private byte[] f26900c;

    /* renamed from: d */
    private byte[] f26901d;

    /* renamed from: q */
    private b1 f26902q;

    /* renamed from: x */
    private int f26903x;

    public a(b1 b1Var, int i10, byte[] bArr) {
        this(b1Var, i10, bArr, null);
    }

    public a(b1 b1Var, int i10, byte[] bArr, byte[] bArr2) {
        this.f26902q = b1Var;
        this.f26901d = ak.a.h(bArr);
        this.f26903x = i10;
        this.f26900c = ak.a.h(bArr2);
    }

    public byte[] a() {
        return ak.a.h(this.f26900c);
    }

    public b1 b() {
        return this.f26902q;
    }

    public int c() {
        return this.f26903x;
    }

    public byte[] d() {
        return ak.a.h(this.f26901d);
    }
}
