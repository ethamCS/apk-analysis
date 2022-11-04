package zh;
/* loaded from: classes3.dex */
public class x0 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private byte[] f27023c;

    /* renamed from: d */
    private byte[] f27024d;

    /* renamed from: q */
    private int f27025q;

    public x0(byte[] bArr, byte[] bArr2, int i10) {
        this.f27023c = ak.a.h(bArr);
        this.f27024d = ak.a.h(bArr2);
        this.f27025q = i10;
    }

    public byte[] a() {
        return ak.a.h(this.f27023c);
    }

    public byte[] b() {
        return ak.a.h(this.f27024d);
    }

    public int c() {
        return this.f27025q;
    }
}
