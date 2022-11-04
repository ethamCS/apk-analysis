package org.bouncycastle.jcajce.provider.symmetric;

import ak.q;
import gg.a0;
import gg.d0;
import gg.v;
import gg.w;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.spec.IvParameterSpec;
import lg.a;
import lg.c;
import mi.i;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.h;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.conscrypt.PSKKeyManager;
import qh.n;
import qh.u;
import vh.m;
/* loaded from: classes3.dex */
public final class GOST28147 {
    private static Map<v, String> oidMappings = new HashMap();
    private static Map<String, v> nameMappings = new HashMap();

    /* loaded from: classes3.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        byte[] iv = new byte[8];
        byte[] sBox = u.h("E-A");

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            if (this.random == null) {
                this.random = l.b();
            }
            this.random.nextBytes(this.iv);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("GOST28147");
                createParametersInstance.init(new i(this.sBox, this.iv));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            if (algorithmParameterSpec instanceof i) {
                this.sBox = ((i) algorithmParameterSpec).c();
                return;
            }
            throw new InvalidAlgorithmParameterException("parameter spec not supported");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams extends BaseAlgParams {
        private byte[] iv;
        private v sBox = a.f16024h;

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (!(algorithmParameterSpec instanceof i)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            } else {
                this.iv = ((i) algorithmParameterSpec).a();
                try {
                    this.sBox = BaseAlgParams.getSBoxOID(((i) algorithmParameterSpec).c());
                } catch (IllegalArgumentException e10) {
                    throw new InvalidParameterSpecException(e10.getMessage());
                }
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "GOST 28147 IV Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls == i.class || cls == AlgorithmParameterSpec.class) {
                return new i(this.sBox, this.iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        protected byte[] localGetEncoded() {
            return new c(this.iv, this.sBox).getEncoded();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        protected void localInit(byte[] bArr) {
            a0 u10 = a0.u(bArr);
            if (u10 instanceof w) {
                this.iv = w.E(u10).F();
            } else if (!(u10 instanceof d0)) {
                throw new IOException("Unable to recognize parameters");
            } else {
                c n10 = c.n(u10);
                this.sBox = n10.l();
                this.iv = n10.m();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class BaseAlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private v sBox = a.f16024h;

        protected static v getSBoxOID(String str) {
            v vVar = str != null ? (v) GOST28147.nameMappings.get(q.k(str)) : null;
            if (vVar != null) {
                return vVar;
            }
            throw new IllegalArgumentException("Unknown SBOX name: " + str);
        }

        protected static v getSBoxOID(byte[] bArr) {
            return getSBoxOID(u.i(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return localGetEncoded();
            }
            throw new IOException("Unknown parameter format: " + str);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (!(algorithmParameterSpec instanceof i)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            } else {
                this.iv = ((i) algorithmParameterSpec).a();
                try {
                    this.sBox = getSBoxOID(((i) algorithmParameterSpec).c());
                } catch (IllegalArgumentException e10) {
                    throw new InvalidParameterSpecException(e10.getMessage());
                }
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final void engineInit(byte[] bArr) {
            engineInit(bArr, "ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final void engineInit(byte[] bArr, String str) {
            Objects.requireNonNull(bArr, "Encoded parameters cannot be null");
            if (!isASN1FormatString(str)) {
                throw new IOException("Unknown parameter format: " + str);
            }
            try {
                localInit(bArr);
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new IOException("Parameter parsing failed: " + e11.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls == i.class || cls == AlgorithmParameterSpec.class) {
                return new i(this.sBox, this.iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        protected byte[] localGetEncoded() {
            return new c(this.iv, this.sBox).getEncoded();
        }

        abstract void localInit(byte[] bArr);
    }

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new vh.c(new u()), 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class CryptoProWrap extends BaseWrapCipher {
        public CryptoProWrap() {
            super(new n());
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new u());
        }
    }

    /* loaded from: classes3.dex */
    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new f(new m(new u())), 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class GostWrap extends BaseWrapCipher {
        public GostWrap() {
            super(new qh.v());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }

        public KeyGen(int i10) {
            super("GOST28147", i10, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mac extends BaseMac {
        public Mac() {
            super(new uh.f());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST28147.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.GOST28147", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cipher.");
            v vVar = a.f16022f;
            sb3.append(vVar);
            configurableProvider.addAlgorithm(sb3.toString(), str + "$GCFB");
            configurableProvider.addAlgorithm("KeyGenerator.GOST28147", str + "$KeyGen");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + vVar, "GOST28147");
            configurableProvider.addAlgorithm("AlgorithmParameters.GOST28147", str + "$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GOST28147", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + vVar, "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + vVar, "GOST28147");
            configurableProvider.addAlgorithm("Cipher." + a.f16021e, str + "$CryptoProWrap");
            configurableProvider.addAlgorithm("Cipher." + a.f16020d, str + "$GostWrap");
            configurableProvider.addAlgorithm("Mac.GOST28147MAC", str + "$Mac");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    static {
        oidMappings.put(a.f16023g, "E-TEST");
        Map<v, String> map = oidMappings;
        v vVar = a.f16024h;
        map.put(vVar, "E-A");
        Map<v, String> map2 = oidMappings;
        v vVar2 = a.f16025i;
        map2.put(vVar2, "E-B");
        Map<v, String> map3 = oidMappings;
        v vVar3 = a.f16026j;
        map3.put(vVar3, "E-C");
        Map<v, String> map4 = oidMappings;
        v vVar4 = a.f16027k;
        map4.put(vVar4, "E-D");
        Map<v, String> map5 = oidMappings;
        v vVar5 = ah.a.f539t;
        map5.put(vVar5, "PARAM-Z");
        nameMappings.put("E-A", vVar);
        nameMappings.put("E-B", vVar2);
        nameMappings.put("E-C", vVar3);
        nameMappings.put("E-D", vVar4);
        nameMappings.put("PARAM-Z", vVar5);
    }

    private GOST28147() {
    }
}
