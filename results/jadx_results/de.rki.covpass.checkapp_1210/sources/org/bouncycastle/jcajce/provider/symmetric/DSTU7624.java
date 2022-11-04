package org.bouncycastle.jcajce.provider.symmetric;

import gg.v;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.h;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;
import qh.r;
import uh.i;
import vh.c;
import vh.e;
import vh.s;
import vh.t;
/* loaded from: classes3.dex */
public class DSTU7624 {

    /* loaded from: classes3.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        private final int ivLength;

        public AlgParamGen(int i10) {
            this.ivLength = i10 / 8;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.ivLength];
            if (this.random == null) {
                this.random = l.b();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("DSTU7624");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSTU7624 parameter generation.");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamGen128 extends AlgParamGen {
        public AlgParamGen128() {
            super(128);
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamGen256 extends AlgParamGen {
        public AlgParamGen256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamGen512 extends AlgParamGen {
        public AlgParamGen512() {
            super(512);
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "DSTU7624 IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(new c(new r(128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(new c(new r(PSKKeyManager.MAX_KEY_LENGTH_BYTES)), (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC512 extends BaseBlockCipher {
        public CBC512() {
            super(new c(new r(512)), 512);
        }
    }

    /* loaded from: classes3.dex */
    public static class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(new vh.r(new r(128)));
        }
    }

    /* loaded from: classes3.dex */
    public static class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(new vh.r(new r(PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    /* loaded from: classes3.dex */
    public static class CCM512 extends BaseBlockCipher {
        public CCM512() {
            super(new vh.r(new r(512)));
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(new f(new e(new r(128), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(new f(new e(new r(PSKKeyManager.MAX_KEY_LENGTH_BYTES), PSKKeyManager.MAX_KEY_LENGTH_BYTES)), (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB512 extends BaseBlockCipher {
        public CFB512() {
            super(new f(new e(new r(512), 512)), 512);
        }
    }

    /* loaded from: classes3.dex */
    public static class CTR128 extends BaseBlockCipher {
        public CTR128() {
            super(new f(new s(new r(128))), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CTR256 extends BaseBlockCipher {
        public CTR256() {
            super(new f(new s(new r(PSKKeyManager.MAX_KEY_LENGTH_BYTES))), (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class CTR512 extends BaseBlockCipher {
        public CTR512() {
            super(new f(new s(new r(512))), 512);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.DSTU7624.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.e get() {
                    return new r(128);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(new r(128));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(new r(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB512 extends BaseBlockCipher {
        public ECB512() {
            super(new r(512));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB_128 extends BaseBlockCipher {
        public ECB_128() {
            super(new r(128));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new r(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new r(512));
        }
    }

    /* loaded from: classes3.dex */
    public static class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(new t(new r(128)));
        }
    }

    /* loaded from: classes3.dex */
    public static class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(new t(new r(PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    /* loaded from: classes3.dex */
    public static class GCM512 extends BaseBlockCipher {
        public GCM512() {
            super(new t(new r(512)));
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new i(new t(new r(128)), 128));
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC128 extends BaseMac {
        public GMAC128() {
            super(new i(new t(new r(128)), 128));
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC256 extends BaseMac {
        public GMAC256() {
            super(new i(new t(new r(PSKKeyManager.MAX_KEY_LENGTH_BYTES)), PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC512 extends BaseMac {
        public GMAC512() {
            super(new i(new t(new r(512)), 512));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }

        public KeyGen(int i10) {
            super("DSTU7624", i10, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen512 extends KeyGen {
        public KeyGen512() {
            super(512);
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = DSTU7624.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.DSTU7624", sb2.toString());
            v vVar = dh.f.f9079v;
            configurableProvider.addAlgorithm("AlgorithmParameters", vVar, str + "$AlgParams");
            v vVar2 = dh.f.f9080w;
            configurableProvider.addAlgorithm("AlgorithmParameters", vVar2, str + "$AlgParams");
            v vVar3 = dh.f.f9081x;
            configurableProvider.addAlgorithm("AlgorithmParameters", vVar3, str + "$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DSTU7624", str + "$AlgParamGen128");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", vVar, str + "$AlgParamGen128");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", vVar2, str + "$AlgParamGen256");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", vVar3, str + "$AlgParamGen512");
            configurableProvider.addAlgorithm("Cipher.DSTU7624", str + "$ECB_128");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-128", str + "$ECB_128");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-256", str + "$ECB_256");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-512", str + "$ECB_512");
            v vVar4 = dh.f.f9067j;
            configurableProvider.addAlgorithm("Cipher", vVar4, str + "$ECB128");
            v vVar5 = dh.f.f9068k;
            configurableProvider.addAlgorithm("Cipher", vVar5, str + "$ECB256");
            v vVar6 = dh.f.f9069l;
            configurableProvider.addAlgorithm("Cipher", vVar6, str + "$ECB512");
            configurableProvider.addAlgorithm("Cipher", vVar, str + "$CBC128");
            configurableProvider.addAlgorithm("Cipher", vVar2, str + "$CBC256");
            configurableProvider.addAlgorithm("Cipher", vVar3, str + "$CBC512");
            v vVar7 = dh.f.f9082y;
            configurableProvider.addAlgorithm("Cipher", vVar7, str + "$OFB128");
            v vVar8 = dh.f.f9083z;
            configurableProvider.addAlgorithm("Cipher", vVar8, str + "$OFB256");
            v vVar9 = dh.f.A;
            configurableProvider.addAlgorithm("Cipher", vVar9, str + "$OFB512");
            v vVar10 = dh.f.f9073p;
            configurableProvider.addAlgorithm("Cipher", vVar10, str + "$CFB128");
            v vVar11 = dh.f.f9074q;
            configurableProvider.addAlgorithm("Cipher", vVar11, str + "$CFB256");
            v vVar12 = dh.f.f9075r;
            configurableProvider.addAlgorithm("Cipher", vVar12, str + "$CFB512");
            v vVar13 = dh.f.f9070m;
            configurableProvider.addAlgorithm("Cipher", vVar13, str + "$CTR128");
            v vVar14 = dh.f.f9071n;
            configurableProvider.addAlgorithm("Cipher", vVar14, str + "$CTR256");
            v vVar15 = dh.f.f9072o;
            configurableProvider.addAlgorithm("Cipher", vVar15, str + "$CTR512");
            v vVar16 = dh.f.E;
            configurableProvider.addAlgorithm("Cipher", vVar16, str + "$CCM128");
            v vVar17 = dh.f.F;
            configurableProvider.addAlgorithm("Cipher", vVar17, str + "$CCM256");
            v vVar18 = dh.f.G;
            configurableProvider.addAlgorithm("Cipher", vVar18, str + "$CCM512");
            configurableProvider.addAlgorithm("Cipher.DSTU7624KW", str + "$Wrap");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-128KW", str + "$Wrap128");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.Cipher.");
            v vVar19 = dh.f.K;
            sb3.append(vVar19.H());
            configurableProvider.addAlgorithm(sb3.toString(), "DSTU7624-128KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-256KW", str + "$Wrap256");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Alg.Alias.Cipher.");
            v vVar20 = dh.f.L;
            sb4.append(vVar20.H());
            configurableProvider.addAlgorithm(sb4.toString(), "DSTU7624-256KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-512KW", str + "$Wrap512");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Alg.Alias.Cipher.");
            v vVar21 = dh.f.M;
            sb5.append(vVar21.H());
            configurableProvider.addAlgorithm(sb5.toString(), "DSTU7624-512KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW");
            configurableProvider.addAlgorithm("Mac.DSTU7624GMAC", str + "$GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-128GMAC", str + "$GMAC128");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Alg.Alias.Mac.");
            v vVar22 = dh.f.B;
            sb6.append(vVar22.H());
            configurableProvider.addAlgorithm(sb6.toString(), "DSTU7624-128GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-256GMAC", str + "$GMAC256");
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.Mac.");
            v vVar23 = dh.f.C;
            sb7.append(vVar23.H());
            configurableProvider.addAlgorithm(sb7.toString(), "DSTU7624-256GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-512GMAC", str + "$GMAC512");
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Alg.Alias.Mac.");
            v vVar24 = dh.f.D;
            sb8.append(vVar24.H());
            configurableProvider.addAlgorithm(sb8.toString(), "DSTU7624-512GMAC");
            configurableProvider.addAlgorithm("KeyGenerator.DSTU7624", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", vVar19, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar20, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar21, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", vVar4, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar5, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar6, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", vVar, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar2, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar3, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", vVar7, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar8, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar9, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", vVar10, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar11, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar12, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", vVar13, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar14, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar15, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", vVar16, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar17, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar18, str + "$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", vVar22, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", vVar23, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", vVar24, str + "$KeyGen512");
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(new f(new vh.v(new r(128), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(new f(new vh.v(new r(PSKKeyManager.MAX_KEY_LENGTH_BYTES), PSKKeyManager.MAX_KEY_LENGTH_BYTES)), (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB512 extends BaseBlockCipher {
        public OFB512() {
            super(new f(new vh.v(new r(512), 512)), 512);
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new qh.s(128));
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new qh.s(128));
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new qh.s(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap512 extends BaseWrapCipher {
        public Wrap512() {
            super(new qh.s(512));
        }
    }

    private DSTU7624() {
    }
}
