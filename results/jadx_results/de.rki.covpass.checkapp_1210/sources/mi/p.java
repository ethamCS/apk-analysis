package mi;

import java.security.spec.EncodedKeySpec;
/* loaded from: classes3.dex */
public class p extends EncodedKeySpec {
    public p(byte[] bArr) {
        super(bArr);
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "RAW";
    }
}
