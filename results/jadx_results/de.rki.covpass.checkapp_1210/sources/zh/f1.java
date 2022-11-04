package zh;
/* loaded from: classes3.dex */
public class f1 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private byte[] f26923c;

    /* renamed from: d */
    private org.bouncycastle.crypto.i f26924d;

    public f1(org.bouncycastle.crypto.i iVar, byte[] bArr) {
        this(iVar, bArr, 0, bArr.length);
    }

    public f1(org.bouncycastle.crypto.i iVar, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f26923c = bArr2;
        this.f26924d = iVar;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public byte[] a() {
        return this.f26923c;
    }

    public org.bouncycastle.crypto.i b() {
        return this.f26924d;
    }
}
