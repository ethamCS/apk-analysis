package e9;

import hc.t;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\n"}, d2 = {"Ljavax/crypto/SecretKey;", BuildConfig.FLAVOR, "mode", BuildConfig.FLAVOR, "iv", "tagLength", "Ljavax/crypto/Cipher;", "a", "key", "c", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    private static final Cipher a(SecretKey secretKey, int i10, byte[] bArr, int i11) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i10, secretKey, new GCMParameterSpec(i11, bArr));
        t.d(cipher, "getInstance(\"AES/GCM/NoP…pec(tagLength, iv))\n    }");
        return cipher;
    }

    static /* synthetic */ Cipher b(SecretKey secretKey, int i10, byte[] bArr, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 128;
        }
        return a(secretKey, i10, bArr, i11);
    }

    public static final byte[] c(byte[] bArr, SecretKey secretKey, byte[] bArr2) {
        t.e(bArr, "<this>");
        t.e(secretKey, "key");
        t.e(bArr2, "iv");
        byte[] doFinal = b(secretKey, 1, bArr2, 0, 4, null).doFinal(bArr);
        t.d(doFinal, "key.aesGcmCipher(Cipher.…T_MODE, iv).doFinal(this)");
        return doFinal;
    }
}
