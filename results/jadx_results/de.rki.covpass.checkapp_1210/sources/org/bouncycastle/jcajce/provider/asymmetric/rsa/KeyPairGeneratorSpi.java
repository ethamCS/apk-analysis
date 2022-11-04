package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import gg.r1;
import hh.b;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import sh.z;
import zg.q;
import zh.m1;
import zh.n1;
import zh.o1;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static final b PKCS_ALGID = new b(q.Z0, r1.f10880d);
    private static final b PSS_ALGID = new b(q.f26812i1);
    static final BigInteger defaultPublicExponent = BigInteger.valueOf(65537);
    b algId;
    z engine;
    m1 param;

    /* loaded from: classes3.dex */
    public static class PSS extends KeyPairGeneratorSpi {
        public PSS() {
            super("RSASSA-PSS", KeyPairGeneratorSpi.PSS_ALGID);
        }
    }

    public KeyPairGeneratorSpi() {
        this("RSA", PKCS_ALGID);
    }

    public KeyPairGeneratorSpi(String str, b bVar) {
        super(str);
        this.algId = bVar;
        this.engine = new z();
        m1 m1Var = new m1(defaultPublicExponent, l.b(), 2048, PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.param = m1Var;
        this.engine.d(m1Var);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        org.bouncycastle.crypto.b a10 = this.engine.a();
        return new KeyPair(new BCRSAPublicKey(this.algId, (n1) a10.b()), new BCRSAPrivateCrtKey(this.algId, (o1) a10.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        m1 m1Var = new m1(defaultPublicExponent, secureRandom, i10, PrimeCertaintyCalculator.getDefaultCertainty(i10));
        this.param = m1Var;
        this.engine.d(m1Var);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec instanceof RSAKeyGenParameterSpec) {
            RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
            m1 m1Var = new m1(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), PrimeCertaintyCalculator.getDefaultCertainty(2048));
            this.param = m1Var;
            this.engine.d(m1Var);
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
    }
}
