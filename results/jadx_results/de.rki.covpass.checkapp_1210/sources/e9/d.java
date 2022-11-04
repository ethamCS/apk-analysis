package e9;

import gg.q;
import gg.x1;
import hc.t;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.r;
import tb.x;
import ub.c0;
import ub.m;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0018\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t*\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"Ljava/security/PublicKey;", "key", BuildConfig.FLAVOR, "data", "signature", BuildConfig.FLAVOR, "algorithm", "Ltb/e0;", "b", "Ltb/r;", "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {
    private static final r<byte[], byte[]> a(byte[] bArr) {
        List Z;
        byte[] B0;
        List w9;
        byte[] B02;
        Z = m.Z(bArr, bArr.length / 2);
        B0 = c0.B0(Z);
        w9 = m.w(bArr, bArr.length / 2);
        B02 = c0.B0(w9);
        return x.a(B0, B02);
    }

    public static final void b(PublicKey publicKey, byte[] bArr, byte[] bArr2, String str) {
        boolean u10;
        t.e(publicKey, "key");
        t.e(bArr, "data");
        t.e(bArr2, "signature");
        t.e(str, "algorithm");
        u10 = bf.x.u(str, "withECDSA", false, 2, null);
        if (u10) {
            r<byte[], byte[]> a10 = a(bArr2);
            bArr2 = new x1(new q[]{new q(new BigInteger(1, a10.b())), new q(new BigInteger(1, a10.c()))}).getEncoded();
        }
        Signature signature = Signature.getInstance(str);
        signature.initVerify(publicKey);
        signature.update(bArr);
        if (signature.verify(bArr2)) {
            return;
        }
        throw new SignatureException();
    }
}
