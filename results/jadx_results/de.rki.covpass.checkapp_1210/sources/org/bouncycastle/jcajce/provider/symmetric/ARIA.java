package org.bouncycastle.jcajce.provider.symmetric;

import gg.v;
import gi.a;
import gi.c;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.h;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;
import qh.d;
import qh.k0;
import sh.y;
import vh.e;
import vh.n;
/* loaded from: classes3.dex */
public final class ARIA {

    /* loaded from: classes3.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = l.b();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("ARIA");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for ARIA parameter generation.");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "ARIA IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private a ccmParams;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return this.ccmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = a.m(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else if (algorithmParameterSpec instanceof mi.a) {
                mi.a aVar = (mi.a) algorithmParameterSpec;
                this.ccmParams = new a(aVar.c(), aVar.b() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.ccmParams = a.m(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) {
            if (isASN1FormatString(str)) {
                this.ccmParams = a.m(bArr);
                return;
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "CCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExists() ? GcmSpecUtil.extractGcmSpec(this.ccmParams.b()) : new mi.a(this.ccmParams.n(), this.ccmParams.l() * 8);
            } else if (cls == mi.a.class) {
                return new mi.a(this.ccmParams.n(), this.ccmParams.l() * 8);
            } else {
                if (cls == IvParameterSpec.class) {
                    return new IvParameterSpec(this.ccmParams.n());
                }
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamsGCM extends BaseAlgorithmParameters {
        private c gcmParams;

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return this.gcmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else if (algorithmParameterSpec instanceof mi.a) {
                mi.a aVar = (mi.a) algorithmParameterSpec;
                this.gcmParams = new c(aVar.c(), aVar.b() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.gcmParams = c.m(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) {
            if (isASN1FormatString(str)) {
                this.gcmParams = c.m(bArr);
                return;
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "GCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExists() ? GcmSpecUtil.extractGcmSpec(this.gcmParams.b()) : new mi.a(this.gcmParams.n(), this.gcmParams.l() * 8);
            } else if (cls == mi.a.class) {
                return new mi.a(this.gcmParams.n(), this.gcmParams.l() * 8);
            } else {
                if (cls == IvParameterSpec.class) {
                    return new IvParameterSpec(this.gcmParams.n());
                }
                throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new vh.c(new d()), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((vh.a) new vh.d(new d()), false, 12);
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new f(new e(new d(), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.ARIA.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.e get() {
                    return new d();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new n(new d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new uh.e(new n(new d())));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("ARIA", null);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }

        public KeyGen(int i10) {
            super("ARIA", i10, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = ARIA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.ARIA", sb2.toString());
            v vVar = vg.a.f24131h;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", vVar, "ARIA");
            v vVar2 = vg.a.f24136m;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", vVar2, "ARIA");
            v vVar3 = vg.a.f24141r;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", vVar3, "ARIA");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIA", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", vVar, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", vVar2, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", vVar3, "ARIA");
            v vVar4 = vg.a.f24133j;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", vVar4, "ARIA");
            v vVar5 = vg.a.f24138o;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", vVar5, "ARIA");
            v vVar6 = vg.a.f24143t;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", vVar6, "ARIA");
            v vVar7 = vg.a.f24132i;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", vVar7, "ARIA");
            v vVar8 = vg.a.f24137n;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", vVar8, "ARIA");
            v vVar9 = vg.a.f24142s;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", vVar9, "ARIA");
            configurableProvider.addAlgorithm("Cipher.ARIA", str + "$ECB");
            v vVar10 = vg.a.f24130g;
            configurableProvider.addAlgorithm("Cipher", vVar10, str + "$ECB");
            v vVar11 = vg.a.f24135l;
            configurableProvider.addAlgorithm("Cipher", vVar11, str + "$ECB");
            v vVar12 = vg.a.f24140q;
            configurableProvider.addAlgorithm("Cipher", vVar12, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", vVar, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", vVar2, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", vVar3, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", vVar7, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", vVar8, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", vVar9, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", vVar4, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", vVar5, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", vVar6, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher.ARIARFC3211WRAP", str + "$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAP", str + "$Wrap");
            v vVar13 = vg.a.H;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar13, "ARIAWRAP");
            v vVar14 = vg.a.I;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar14, "ARIAWRAP");
            v vVar15 = vg.a.J;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar15, "ARIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARIAKW", "ARIAWRAP");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAPPAD", str + "$WrapPad");
            v vVar16 = vg.a.K;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar16, "ARIAWRAPPAD");
            v vVar17 = vg.a.L;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar17, "ARIAWRAPPAD");
            v vVar18 = vg.a.M;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar18, "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD");
            configurableProvider.addAlgorithm("KeyGenerator.ARIA", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", vVar13, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar14, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", vVar15, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar16, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar17, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", vVar18, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar10, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar11, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", vVar12, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar2, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", vVar3, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar7, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar8, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", vVar9, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar4, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar5, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", vVar6, str + "$KeyGen256");
            v vVar19 = vg.a.E;
            configurableProvider.addAlgorithm("KeyGenerator", vVar19, str + "$KeyGen128");
            v vVar20 = vg.a.F;
            configurableProvider.addAlgorithm("KeyGenerator", vVar20, str + "$KeyGen192");
            v vVar21 = vg.a.G;
            configurableProvider.addAlgorithm("KeyGenerator", vVar21, str + "$KeyGen256");
            v vVar22 = vg.a.B;
            configurableProvider.addAlgorithm("KeyGenerator", vVar22, str + "$KeyGen128");
            v vVar23 = vg.a.C;
            configurableProvider.addAlgorithm("KeyGenerator", vVar23, str + "$KeyGen192");
            v vVar24 = vg.a.D;
            configurableProvider.addAlgorithm("KeyGenerator", vVar24, str + "$KeyGen256");
            configurableProvider.addAlgorithm("SecretKeyFactory.ARIA", str + "$KeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", vVar, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", vVar2, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", vVar3, "ARIA");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIACCM", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + vVar19, "ARIACCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + vVar20, "ARIACCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + vVar21, "ARIACCM");
            configurableProvider.addAlgorithm("Cipher.ARIACCM", str + "$CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar19, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar20, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar21, "CCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIAGCM", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + vVar22, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + vVar23, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + vVar24, "ARIAGCM");
            configurableProvider.addAlgorithm("Cipher.ARIAGCM", str + "$GCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar22, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar23, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", vVar24, "ARIAGCM");
            addGMacAlgorithm(configurableProvider, "ARIA", str + "$GMAC", str + "$KeyGen");
            addPoly1305Algorithm(configurableProvider, "ARIA", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new vh.v(new d(), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new uh.l(new d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-ARIA", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new y());
        }
    }

    /* loaded from: classes3.dex */
    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new k0(new d()), 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new qh.e());
        }
    }

    /* loaded from: classes3.dex */
    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new qh.f());
        }
    }

    private ARIA() {
    }
}
