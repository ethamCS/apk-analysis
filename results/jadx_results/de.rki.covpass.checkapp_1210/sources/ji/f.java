package ji;

import javax.crypto.SecretKey;
/* loaded from: classes3.dex */
public class f implements SecretKey {

    /* renamed from: c */
    private final char[] f14390c;

    /* renamed from: d */
    private final org.bouncycastle.crypto.g f14391d;

    public f(char[] cArr, org.bouncycastle.crypto.g gVar) {
        char[] cArr2 = new char[cArr.length];
        this.f14390c = cArr2;
        this.f14391d = gVar;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f14391d.b(this.f14390c);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.f14391d.getType();
    }

    public char[] getPassword() {
        return this.f14390c;
    }
}
