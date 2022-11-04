package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import ih.i;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import lg.b;
import mi.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import ri.d;
import ri.e;
import sh.l;
import zh.a0;
import zh.c0;
import zh.d0;
import zh.e0;
import zh.y;
import zh.z;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    a0 param;
    Object ecParams = null;
    l engine = new l();
    String algorithm = "ECGOST3410-2012";
    int strength = 239;
    SecureRandom random = null;
    boolean initialised = false;

    public KeyPairGeneratorSpi() {
        super("ECGOST3410-2012");
    }

    private void init(k kVar, SecureRandom secureRandom) {
        i f10 = b.f(kVar.e());
        if (f10 == null) {
            throw new InvalidAlgorithmParameterException("unknown curve: " + kVar.e());
        }
        this.ecParams = new d(b.g(kVar.e()), f10.l(), f10.m(), f10.q(), f10.n(), f10.r());
        a0 a0Var = new a0(new z(new c0(kVar.e(), f10), kVar.e(), kVar.b(), kVar.c()), secureRandom);
        this.param = a0Var;
        this.engine.c(a0Var);
        this.initialised = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.initialised) {
            org.bouncycastle.crypto.b a10 = this.engine.a();
            e0 e0Var = (e0) a10.b();
            d0 d0Var = (d0) a10.a();
            Object obj = this.ecParams;
            if (obj instanceof e) {
                e eVar = (e) obj;
                BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = new BCECGOST3410_2012PublicKey(this.algorithm, e0Var, eVar);
                return new KeyPair(bCECGOST3410_2012PublicKey, new BCECGOST3410_2012PrivateKey(this.algorithm, d0Var, bCECGOST3410_2012PublicKey, eVar));
            } else if (obj == null) {
                return new KeyPair(new BCECGOST3410_2012PublicKey(this.algorithm, e0Var), new BCECGOST3410_2012PrivateKey(this.algorithm, d0Var));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey2 = new BCECGOST3410_2012PublicKey(this.algorithm, e0Var, eCParameterSpec);
                return new KeyPair(bCECGOST3410_2012PublicKey2, new BCECGOST3410_2012PrivateKey(this.algorithm, d0Var, bCECGOST3410_2012PublicKey2, eCParameterSpec));
            }
        }
        throw new IllegalStateException("EC Key Pair Generator not initialised");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        this.strength = i10;
        this.random = secureRandom;
        Object obj = this.ecParams;
        if (obj != null) {
            try {
                initialize((ECGenParameterSpec) obj, secureRandom);
                return;
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key size not configurable.");
            }
        }
        throw new InvalidParameterException("unknown key size.");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        a0 a0Var;
        if (algorithmParameterSpec instanceof k) {
            init((k) algorithmParameterSpec, secureRandom);
            return;
        }
        if (!(algorithmParameterSpec instanceof e)) {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                this.ecParams = algorithmParameterSpec;
                ti.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                a0 a0Var2 = new a0(new y(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
                this.param = a0Var2;
                this.engine.c(a0Var2);
                this.initialised = true;
            }
            boolean z10 = algorithmParameterSpec instanceof ECGenParameterSpec;
            if (z10 || (algorithmParameterSpec instanceof ri.b)) {
                init(new k(z10 ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((ri.b) algorithmParameterSpec).a()), secureRandom);
                return;
            }
            if (algorithmParameterSpec == null) {
                ProviderConfiguration providerConfiguration = BouncyCastleProvider.CONFIGURATION;
                if (providerConfiguration.getEcImplicitlyCa() != null) {
                    e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
                    this.ecParams = algorithmParameterSpec;
                    a0Var = new a0(new y(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c()), secureRandom);
                }
            }
            if (algorithmParameterSpec == null && BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() == null) {
                throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
            }
            throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: " + algorithmParameterSpec.getClass().getName());
        }
        e eVar = (e) algorithmParameterSpec;
        this.ecParams = algorithmParameterSpec;
        a0Var = new a0(new y(eVar.a(), eVar.b(), eVar.d(), eVar.c()), secureRandom);
        this.param = a0Var;
        this.engine.c(a0Var);
        this.initialised = true;
    }
}
