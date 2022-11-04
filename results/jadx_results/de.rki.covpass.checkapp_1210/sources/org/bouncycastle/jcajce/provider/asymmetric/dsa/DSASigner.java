package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import di.a;
import di.c;
import di.l;
import di.s;
import hh.z0;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.n;
import org.bouncycastle.crypto.r;
import zg.q;
import zh.b;
import zh.g1;
/* loaded from: classes3.dex */
public class DSASigner extends SignatureSpi implements q, z0 {
    private r digest;
    private a encoding = s.f9152a;
    private SecureRandom random;
    private n signer;

    /* loaded from: classes3.dex */
    public static class detDSA extends DSASigner {
        public detDSA() {
            super(ei.a.b(), new c(new l(ei.a.b())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSA224 extends DSASigner {
        public detDSA224() {
            super(ei.a.c(), new c(new l(ei.a.c())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSA256 extends DSASigner {
        public detDSA256() {
            super(ei.a.d(), new c(new l(ei.a.d())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSA384 extends DSASigner {
        public detDSA384() {
            super(ei.a.e(), new c(new l(ei.a.e())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSA512 extends DSASigner {
        public detDSA512() {
            super(ei.a.j(), new c(new l(ei.a.j())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSASha3_224 extends DSASigner {
        public detDSASha3_224() {
            super(ei.a.f(), new c(new l(ei.a.f())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSASha3_256 extends DSASigner {
        public detDSASha3_256() {
            super(ei.a.g(), new c(new l(ei.a.g())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSASha3_384 extends DSASigner {
        public detDSASha3_384() {
            super(ei.a.h(), new c(new l(ei.a.h())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSASha3_512 extends DSASigner {
        public detDSASha3_512() {
            super(ei.a.i(), new c(new l(ei.a.i())));
        }
    }

    /* loaded from: classes3.dex */
    public static class dsa224 extends DSASigner {
        public dsa224() {
            super(ei.a.c(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsa256 extends DSASigner {
        public dsa256() {
            super(ei.a.d(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsa384 extends DSASigner {
        public dsa384() {
            super(ei.a.e(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsa512 extends DSASigner {
        public dsa512() {
            super(ei.a.j(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsaRMD160 extends DSASigner {
        public dsaRMD160() {
            super(new nh.s(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsaSha3_224 extends DSASigner {
        public dsaSha3_224() {
            super(ei.a.f(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsaSha3_256 extends DSASigner {
        public dsaSha3_256() {
            super(ei.a.g(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsaSha3_384 extends DSASigner {
        public dsaSha3_384() {
            super(ei.a.h(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsaSha3_512 extends DSASigner {
        public dsaSha3_512() {
            super(ei.a.i(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static class noneDSA extends DSASigner {
        public noneDSA() {
            super(new nh.q(), new c());
        }
    }

    /* loaded from: classes3.dex */
    public static class stdDSA extends DSASigner {
        public stdDSA() {
            super(ei.a.b(), new c());
        }
    }

    protected DSASigner(r rVar, n nVar) {
        this.digest = rVar;
        this.signer = nVar;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        i generatePrivateKeyParameter = DSAUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new g1(generatePrivateKeyParameter, secureRandom);
        }
        this.digest.reset();
        this.signer.init(true, generatePrivateKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        b generatePublicKeyParameter = DSAUtil.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            BigInteger[] a10 = this.signer.a(bArr);
            return this.encoding.b(this.signer.getOrder(), a10[0], a10[1]);
        } catch (Exception e10) {
            throw new SignatureException(e10.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b10) {
        this.digest.update(b10);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i10, int i11) {
        this.digest.update(bArr, i10, i11);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            BigInteger[] a10 = this.encoding.a(this.signer.getOrder(), bArr);
            return this.signer.b(bArr2, a10[0], a10[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
