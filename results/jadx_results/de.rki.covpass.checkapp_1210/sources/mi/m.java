package mi;

import java.security.spec.EncodedKeySpec;
/* loaded from: classes3.dex */
public class m extends EncodedKeySpec {

    /* renamed from: c */
    private final String f16714c;

    public m(byte[] bArr) {
        super(bArr);
        String str;
        if (bArr[0] == 48) {
            str = "ASN.1";
        } else if (bArr[0] != 111) {
            throw new IllegalArgumentException("unknown byte encoding");
        } else {
            str = "OpenSSH";
        }
        this.f16714c = str;
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.f16714c;
    }
}
