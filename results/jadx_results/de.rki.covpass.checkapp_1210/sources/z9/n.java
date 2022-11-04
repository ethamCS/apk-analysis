package z9;

import bf.x;
import hc.t;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.r;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u0015"}, d2 = {"Lz9/n;", BuildConfig.FLAVOR, "Ljava/security/KeyPair;", "c", "Ljava/security/PrivateKey;", "senderPrivateKey", "Ljava/security/PublicKey;", "receiverPubKey", BuildConfig.FLAVOR, "d", "sharedSecret", "senderPubBytes", "Ltb/r;", "Ljavax/crypto/SecretKey;", "a", BuildConfig.FLAVOR, "code", "b", "publicKey", "<init>", "(Ljava/security/PublicKey;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    private final PublicKey f26558a;

    public n(PublicKey publicKey) {
        t.e(publicKey, "publicKey");
        this.f26558a = publicKey;
    }

    private final r<SecretKey, byte[]> a(byte[] bArr, byte[] bArr2) {
        byte[] n10;
        byte[] n11;
        byte[] W;
        byte[] W2;
        n10 = ub.l.n(bArr, new byte[]{0, 0, 0, 1});
        n11 = ub.l.n(n10, bArr2);
        byte[] b10 = h.b(n11);
        W = ub.m.W(b10, new nc.g(0, 15));
        SecretKeySpec secretKeySpec = new SecretKeySpec(W, "AES");
        W2 = ub.m.W(b10, new nc.g(16, 31));
        return new r<>(secretKeySpec, W2);
    }

    private final KeyPair c() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("ECDH");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        t.d(generateKeyPair, "getInstance(\"ECDH\").run …nerateKeyPair()\n        }");
        return generateKeyPair;
    }

    private final byte[] d(PrivateKey privateKey, PublicKey publicKey) {
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(privateKey);
        keyAgreement.doPhase(publicKey, true);
        byte[] generateSecret = keyAgreement.generateSecret();
        t.d(generateSecret, "getInstance(\"ECDH\").run …enerateSecret()\n        }");
        return generateSecret;
    }

    public final byte[] b(String str) {
        List a02;
        byte[] B0;
        byte[] s10;
        byte[] n10;
        t.e(str, "code");
        KeyPair c10 = c();
        byte[] encoded = c10.getPublic().getEncoded();
        t.d(encoded, "senderKeyPair.public.encoded");
        a02 = ub.m.a0(encoded, 65);
        B0 = c0.B0(a02);
        PrivateKey privateKey = c10.getPrivate();
        t.d(privateKey, "senderKeyPair.private");
        r<SecretKey, byte[]> a10 = a(d(privateKey, this.f26558a), B0);
        s10 = x.s(str);
        n10 = ub.l.n(B0, e9.a.c(s10, a10.b(), a10.c()));
        return n10;
    }
}
