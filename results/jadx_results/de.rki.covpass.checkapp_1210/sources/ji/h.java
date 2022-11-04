package ji;

import javax.crypto.SecretKey;
/* loaded from: classes3.dex */
public class h implements SecretKey {

    /* renamed from: c */
    private final char[] f14394c;

    /* renamed from: d */
    private final org.bouncycastle.crypto.g f14395d;

    public h(char[] cArr, org.bouncycastle.crypto.g gVar) {
        this.f14394c = ak.a.j(cArr);
        this.f14395d = gVar;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f14395d.b(this.f14394c);
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.f14395d.getType();
    }
}
