package ni;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
/* loaded from: classes3.dex */
public class e implements c {

    /* renamed from: a */
    protected final Provider f17327a;

    public e(Provider provider) {
        this.f17327a = provider;
    }

    @Override // ni.c
    public SecureRandom a(String str) {
        return SecureRandom.getInstance(str, this.f17327a);
    }

    @Override // ni.c
    public Mac b(String str) {
        return Mac.getInstance(str, this.f17327a);
    }

    @Override // ni.c
    public MessageDigest c(String str) {
        return MessageDigest.getInstance(str, this.f17327a);
    }

    @Override // ni.c
    public Signature createSignature(String str) {
        return Signature.getInstance(str, this.f17327a);
    }

    @Override // ni.c
    public CertificateFactory d(String str) {
        return CertificateFactory.getInstance(str, this.f17327a);
    }

    @Override // ni.c
    public Cipher e(String str) {
        return Cipher.getInstance(str, this.f17327a);
    }

    @Override // ni.c
    public AlgorithmParameters f(String str) {
        return AlgorithmParameters.getInstance(str, this.f17327a);
    }

    @Override // ni.c
    public SecretKeyFactory g(String str) {
        return SecretKeyFactory.getInstance(str, this.f17327a);
    }

    @Override // ni.c
    public KeyFactory h(String str) {
        return KeyFactory.getInstance(str, this.f17327a);
    }
}
