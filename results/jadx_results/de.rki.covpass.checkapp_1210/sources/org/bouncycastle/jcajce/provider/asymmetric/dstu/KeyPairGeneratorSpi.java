package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import dh.c;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import mi.f;
import org.bouncycastle.crypto.b;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import ri.d;
import ri.e;
import sh.k;
import sh.l;
import ti.i;
import zh.a0;
import zh.d0;
import zh.e0;
import zh.v;
import zh.y;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    a0 param;
    Object ecParams = null;
    l engine = new k();
    String algorithm = "DSTU4145";
    SecureRandom random = null;
    boolean initialised = false;

    public KeyPairGeneratorSpi() {
        super("DSTU4145");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.initialised) {
            b a10 = this.engine.a();
            e0 e0Var = (e0) a10.b();
            d0 d0Var = (d0) a10.a();
            Object obj = this.ecParams;
            if (obj instanceof e) {
                e eVar = (e) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey = new BCDSTU4145PublicKey(this.algorithm, e0Var, eVar);
                return new KeyPair(bCDSTU4145PublicKey, new BCDSTU4145PrivateKey(this.algorithm, d0Var, bCDSTU4145PublicKey, eVar));
            } else if (obj == null) {
                return new KeyPair(new BCDSTU4145PublicKey(this.algorithm, e0Var), new BCDSTU4145PrivateKey(this.algorithm, d0Var));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new BCDSTU4145PublicKey(this.algorithm, e0Var, eCParameterSpec);
                return new KeyPair(bCDSTU4145PublicKey2, new BCDSTU4145PrivateKey(this.algorithm, d0Var, bCDSTU4145PublicKey2, eCParameterSpec));
            }
        }
        throw new IllegalStateException("DSTU Key Pair Generator not initialised");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
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
        if (!(algorithmParameterSpec instanceof e)) {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                this.ecParams = algorithmParameterSpec;
                ti.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                i convertPoint = EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator());
                if (eCParameterSpec instanceof f) {
                    this.param = new a0(new v(new y(convertCurve, convertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), ((f) eCParameterSpec).a()), secureRandom);
                } else {
                    this.param = new a0(new y(convertCurve, convertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
                }
                this.engine.c(this.param);
            } else {
                boolean z10 = algorithmParameterSpec instanceof ECGenParameterSpec;
                if (!z10 && !(algorithmParameterSpec instanceof ri.b)) {
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
                String name = z10 ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((ri.b) algorithmParameterSpec).a();
                y a10 = c.a(new gg.v(name));
                if (a10 == null) {
                    throw new InvalidAlgorithmParameterException("unknown curve name: " + name);
                }
                d dVar = new d(name, a10.a(), a10.b(), a10.e(), a10.c(), a10.f());
                this.ecParams = dVar;
                d dVar2 = dVar;
                ti.e convertCurve2 = EC5Util.convertCurve(dVar2.getCurve());
                a0 a0Var2 = new a0(new y(convertCurve2, EC5Util.convertPoint(convertCurve2, dVar2.getGenerator()), dVar2.getOrder(), BigInteger.valueOf(dVar2.getCofactor())), secureRandom);
                this.param = a0Var2;
                this.engine.c(a0Var2);
            }
            this.initialised = true;
        }
        e eVar = (e) algorithmParameterSpec;
        this.ecParams = algorithmParameterSpec;
        a0Var = new a0(new y(eVar.a(), eVar.b(), eVar.d(), eVar.c()), secureRandom);
        this.param = a0Var;
        this.engine.c(a0Var);
        this.initialised = true;
    }
}
