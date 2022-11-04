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
public interface c {
    SecureRandom a(String str);

    Mac b(String str);

    MessageDigest c(String str);

    Signature createSignature(String str);

    CertificateFactory d(String str);

    Cipher e(String str);

    AlgorithmParameters f(String str);

    SecretKeyFactory g(String str);

    KeyFactory h(String str);
}
