package zh;
/* loaded from: classes3.dex */
public class b1 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private byte[] f26909c;

    public b1(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public b1(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f26909c = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public byte[] a() {
        return this.f26909c;
    }
}
