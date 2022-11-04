package ni;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
/* loaded from: classes3.dex */
public class b implements c {
    @Override // ni.c
    public SecureRandom a(String str) {
        return SecureRandom.getInstance(str);
    }

    @Override // ni.c
    public Mac b(String str) {
        return Mac.getInstance(str);
    }

    @Override // ni.c
    public MessageDigest c(String str) {
        return MessageDigest.getInstance(str);
    }

    @Override // ni.c
    public Signature createSignature(String str) {
        return Signature.getInstance(str);
    }

    @Override // ni.c
    public CertificateFactory d(String str) {
        return CertificateFactory.getInstance(str);
    }

    @Override // ni.c
    public Cipher e(String str) {
        return Cipher.getInstance(str);
    }

    @Override // ni.c
    public AlgorithmParameters f(String str) {
        return AlgorithmParameters.getInstance(str);
    }

    @Override // ni.c
    public SecretKeyFactory g(String str) {
        return SecretKeyFactory.getInstance(str);
    }

    @Override // ni.c
    public KeyFactory h(String str) {
        return KeyFactory.getInstance(str);
    }
}
