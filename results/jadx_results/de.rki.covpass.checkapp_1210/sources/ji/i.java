package ji;

import javax.crypto.SecretKey;
import org.bouncycastle.crypto.b0;
/* loaded from: classes3.dex */
public class i implements SecretKey {

    /* renamed from: c */
    private final char[] f14396c;

    /* renamed from: d */
    private final boolean f14397d;

    public i(char[] cArr, boolean z10) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.f14396c = cArr2;
        this.f14397d = z10;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return (!this.f14397d || this.f14396c.length != 0) ? b0.PKCS12PasswordToBytes(this.f14396c) : new byte[2];
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS12";
    }

    public char[] getPassword() {
        return this.f14396c;
    }
}
