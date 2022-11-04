package zh;
/* loaded from: classes3.dex */
public class i1 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private byte[] f26942c;

    /* renamed from: d */
    private org.bouncycastle.crypto.i f26943d;

    public i1(org.bouncycastle.crypto.i iVar, byte[] bArr) {
        this(iVar, bArr, 0, bArr.length);
    }

    public i1(org.bouncycastle.crypto.i iVar, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f26942c = bArr2;
        this.f26943d = iVar;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public org.bouncycastle.crypto.i a() {
        return this.f26943d;
    }

    public byte[] b() {
        return this.f26942c;
    }
}
