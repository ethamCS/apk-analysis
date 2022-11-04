package mi;

import java.security.spec.EncodedKeySpec;
/* loaded from: classes3.dex */
public class n extends EncodedKeySpec {

    /* renamed from: d */
    private static final String[] f16715d = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};

    /* renamed from: c */
    private final String f16716c;

    public n(byte[] bArr) {
        super(bArr);
        int i10 = 0;
        int i11 = (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i11 < bArr.length) {
            String b10 = ak.q.b(ak.a.w(bArr, 4, i11));
            this.f16716c = b10;
            if (b10.startsWith("ecdsa")) {
                return;
            }
            while (true) {
                String[] strArr = f16715d;
                if (i10 >= strArr.length) {
                    throw new IllegalArgumentException("unrecognised public key type " + this.f16716c);
                } else if (strArr[i10].equals(this.f16716c)) {
                    return;
                } else {
                    i10++;
                }
            }
        } else {
            throw new IllegalArgumentException("invalid public key blob: type field longer than blob");
        }
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "OpenSSH";
    }
}
