package org.bouncycastle.jcajce.provider.asymmetric.ec;

import ak.g;
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
import java.util.Hashtable;
import org.bouncycastle.crypto.b;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.PSKKeyManager;
import ri.d;
import ri.e;
import sh.l;
import zh.a0;
import zh.d0;
import zh.e0;
import zh.y;
/* loaded from: classes3.dex */
public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* loaded from: classes3.dex */
    public static class EC extends KeyPairGeneratorSpi {
        private static Hashtable ecParameters;
        String algorithm;
        ProviderConfiguration configuration;
        Object ecParams;
        l engine;
        boolean initialised;
        a0 param;
        SecureRandom random;
        int strength;

        static {
            Hashtable hashtable = new Hashtable();
            ecParameters = hashtable;
            hashtable.put(g.e(192), new ECGenParameterSpec("prime192v1"));
            ecParameters.put(g.e(239), new ECGenParameterSpec("prime239v1"));
            ecParameters.put(g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES), new ECGenParameterSpec("prime256v1"));
            ecParameters.put(g.e(224), new ECGenParameterSpec("P-224"));
            ecParameters.put(g.e(384), new ECGenParameterSpec("P-384"));
            ecParameters.put(g.e(521), new ECGenParameterSpec("P-521"));
        }

        public EC() {
            super("EC");
            this.engine = new l();
            this.ecParams = null;
            this.strength = 239;
            this.random = org.bouncycastle.crypto.l.b();
            this.initialised = false;
            this.algorithm = "EC";
            this.configuration = BouncyCastleProvider.CONFIGURATION;
        }

        public EC(String str, ProviderConfiguration providerConfiguration) {
            super(str);
            this.engine = new l();
            this.ecParams = null;
            this.strength = 239;
            this.random = org.bouncycastle.crypto.l.b();
            this.initialised = false;
            this.algorithm = str;
            this.configuration = providerConfiguration;
        }

        protected a0 createKeyGenParamsBC(e eVar, SecureRandom secureRandom) {
            return new a0(new y(eVar.a(), eVar.b(), eVar.d(), eVar.c()), secureRandom);
        }

        protected a0 createKeyGenParamsJCE(i iVar, SecureRandom secureRandom) {
            return new a0(new y(iVar.l(), iVar.m(), iVar.q(), iVar.n()), secureRandom);
        }

        protected a0 createKeyGenParamsJCE(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            i domainParametersFromName;
            if (!(eCParameterSpec instanceof d) || (domainParametersFromName = ECUtils.getDomainParametersFromName(((d) eCParameterSpec).c(), this.configuration)) == null) {
                ti.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                return new a0(new y(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
            }
            return createKeyGenParamsJCE(domainParametersFromName, secureRandom);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            if (!this.initialised) {
                initialize(this.strength, new SecureRandom());
            }
            b a10 = this.engine.a();
            e0 e0Var = (e0) a10.b();
            d0 d0Var = (d0) a10.a();
            Object obj = this.ecParams;
            if (obj instanceof e) {
                e eVar = (e) obj;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(this.algorithm, e0Var, eVar, this.configuration);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.algorithm, d0Var, bCECPublicKey, eVar, this.configuration));
            } else if (obj == null) {
                return new KeyPair(new BCECPublicKey(this.algorithm, e0Var, this.configuration), new BCECPrivateKey(this.algorithm, d0Var, this.configuration));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.algorithm, e0Var, eCParameterSpec, this.configuration);
                return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.algorithm, d0Var, bCECPublicKey2, eCParameterSpec, this.configuration));
            }
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i10, SecureRandom secureRandom) {
            this.strength = i10;
            this.random = secureRandom;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) ecParameters.get(g.e(i10));
            if (eCGenParameterSpec != null) {
                try {
                    initialize(eCGenParameterSpec, secureRandom);
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
            e eVar;
            String a10;
            if (algorithmParameterSpec == null) {
                eVar = this.configuration.getEcImplicitlyCa();
                if (eVar == null) {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
                this.ecParams = null;
            } else if (!(algorithmParameterSpec instanceof e)) {
                if (algorithmParameterSpec instanceof ECParameterSpec) {
                    this.ecParams = algorithmParameterSpec;
                    a0Var = createKeyGenParamsJCE((ECParameterSpec) algorithmParameterSpec, secureRandom);
                    this.param = a0Var;
                    this.engine.c(this.param);
                    this.initialised = true;
                }
                if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                    a10 = ((ECGenParameterSpec) algorithmParameterSpec).getName();
                } else if (!(algorithmParameterSpec instanceof ri.b)) {
                    String nameFrom = ECUtil.getNameFrom(algorithmParameterSpec);
                    if (nameFrom != null) {
                        initializeNamedCurve(nameFrom, secureRandom);
                        this.engine.c(this.param);
                        this.initialised = true;
                    }
                    throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
                } else {
                    a10 = ((ri.b) algorithmParameterSpec).a();
                }
                initializeNamedCurve(a10, secureRandom);
                this.engine.c(this.param);
                this.initialised = true;
            } else {
                this.ecParams = algorithmParameterSpec;
                eVar = (e) algorithmParameterSpec;
            }
            a0Var = createKeyGenParamsBC(eVar, secureRandom);
            this.param = a0Var;
            this.engine.c(this.param);
            this.initialised = true;
        }

        protected void initializeNamedCurve(String str, SecureRandom secureRandom) {
            i domainParametersFromName = ECUtils.getDomainParametersFromName(str, this.configuration);
            if (domainParametersFromName != null) {
                this.ecParams = new d(str, domainParametersFromName.l(), domainParametersFromName.m(), domainParametersFromName.q(), domainParametersFromName.n(), null);
                this.param = createKeyGenParamsJCE(domainParametersFromName, secureRandom);
                return;
            }
            throw new InvalidAlgorithmParameterException("unknown curve name: " + str);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECDH extends EC {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECDHC extends EC {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECDSA extends EC {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECMQV extends EC {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }
}
