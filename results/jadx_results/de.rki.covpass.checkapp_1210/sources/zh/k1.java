package zh;
/* loaded from: classes3.dex */
public class k1 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private byte[] f26952c;

    /* renamed from: d */
    private int f26953d;

    public k1(byte[] bArr, int i10) {
        if (bArr.length <= 255) {
            byte[] bArr2 = new byte[bArr.length];
            this.f26952c = bArr2;
            this.f26953d = i10;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("RC5 key length can be no greater than 255");
    }

    public byte[] a() {
        return this.f26952c;
    }

    public int b() {
        return this.f26953d;
    }
}
