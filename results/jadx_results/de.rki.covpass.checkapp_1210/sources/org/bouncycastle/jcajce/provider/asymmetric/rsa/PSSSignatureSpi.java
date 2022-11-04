package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import di.o;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import ni.c;
import org.bouncycastle.crypto.a;
import org.bouncycastle.crypto.j;
import org.bouncycastle.crypto.r;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import qh.n0;
import zg.q;
import zh.g1;
import zh.n1;
/* loaded from: classes3.dex */
public class PSSSignatureSpi extends SignatureSpi {
    private r contentDigest;
    private AlgorithmParameters engineParams;
    private final c helper;
    private boolean isInitState;
    private boolean isRaw;
    private n1 key;
    private r mgfDigest;
    private PSSParameterSpec originalSpec;
    private PSSParameterSpec paramSpec;
    private o pss;
    private SecureRandom random;
    private int saltLength;
    private a signer;
    private byte trailer;

    /* loaded from: classes3.dex */
    public class NullPssDigest implements r {
        private r baseDigest;
        private ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        private boolean oddTime = true;

        public NullPssDigest(r rVar) {
            PSSSignatureSpi.this = r1;
            this.baseDigest = rVar;
        }

        @Override // org.bouncycastle.crypto.r
        public int doFinal(byte[] bArr, int i10) {
            byte[] byteArray = this.bOut.toByteArray();
            if (this.oddTime) {
                System.arraycopy(byteArray, 0, bArr, i10, byteArray.length);
            } else {
                this.baseDigest.update(byteArray, 0, byteArray.length);
                this.baseDigest.doFinal(bArr, i10);
            }
            reset();
            this.oddTime = !this.oddTime;
            return byteArray.length;
        }

        @Override // org.bouncycastle.crypto.r
        public String getAlgorithmName() {
            return "NULL";
        }

        public int getByteLength() {
            return 0;
        }

        @Override // org.bouncycastle.crypto.r
        public int getDigestSize() {
            return this.baseDigest.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.r
        public void reset() {
            this.bOut.reset();
            this.baseDigest.reset();
        }

        @Override // org.bouncycastle.crypto.r
        public void update(byte b10) {
            this.bOut.write(b10);
        }

        @Override // org.bouncycastle.crypto.r
        public void update(byte[] bArr, int i10, int i11) {
            this.bOut.write(bArr, i10, i11);
        }
    }

    /* loaded from: classes3.dex */
    public static class PSSwithRSA extends PSSSignatureSpi {
        public PSSwithRSA() {
            super(new n0(), null);
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA1withRSA extends PSSSignatureSpi {
        public SHA1withRSA() {
            super(new n0(), PSSParameterSpec.DEFAULT);
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA1withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA1withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA1", "SHAKE128", null, 20, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA1withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA1withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA1", "SHAKE256", null, 20, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA224withRSA extends PSSSignatureSpi {
        public SHA224withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA224withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA-224", "SHAKE128", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA224withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA-224", "SHAKE256", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA256withRSA extends PSSSignatureSpi {
        public SHA256withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA256withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA-256", "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA256withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA-256", "SHAKE256", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA384withRSA extends PSSSignatureSpi {
        public SHA384withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA384withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA384withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA-384", "SHAKE128", null, 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA384withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA384withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA-384", "SHAKE256", null, 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_224withRSA extends PSSSignatureSpi {
        public SHA3_224withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA3-224", "SHAKE128", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_224withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA3-224", "SHAKE256", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_256withRSA extends PSSSignatureSpi {
        public SHA3_256withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA3-256", "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_256withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA3-256", "SHAKE256", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_384withRSA extends PSSSignatureSpi {
        public SHA3_384withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_384withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA3-384", "SHAKE128", null, 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_384withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_384withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA3-384", "SHAKE256", null, 48, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_512withRSA extends PSSSignatureSpi {
        public SHA3_512withRSA() {
            super(new n0(), new PSSParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_512withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA3-512", "SHAKE128", null, 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_512withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA3_512withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA3-512", "SHAKE256", null, 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_224withRSA extends PSSSignatureSpi {
        public SHA512_224withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-512(224)", "MGF1", new MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_224withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA-512(224)", "SHAKE128", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_224withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512_224withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA-512(224)", "SHAKE256", null, 28, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_256withRSA extends PSSSignatureSpi {
        public SHA512_256withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-512(256)", "MGF1", new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_256withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA-512(256)", "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_256withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512_256withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA-512(256)", "SHAKE256", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512withRSA extends PSSSignatureSpi {
        public SHA512withRSA() {
            super(new n0(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512withRSAandSHAKE128 extends PSSSignatureSpi {
        public SHA512withRSAandSHAKE128() {
            super(new n0(), new PSSParameterSpec("SHA-512", "SHAKE128", null, 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512withRSAandSHAKE256 extends PSSSignatureSpi {
        public SHA512withRSAandSHAKE256() {
            super(new n0(), new PSSParameterSpec("SHA-512", "SHAKE256", null, 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHAKE128WithRSAPSS extends PSSSignatureSpi {
        public SHAKE128WithRSAPSS() {
            super(new n0(), new PSSParameterSpec("SHAKE128", "SHAKE128", null, 32, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHAKE256WithRSAPSS extends PSSSignatureSpi {
        public SHAKE256WithRSAPSS() {
            super(new n0(), new PSSParameterSpec("SHAKE256", "SHAKE256", null, 64, 1));
        }
    }

    /* loaded from: classes3.dex */
    public static class nonePSS extends PSSSignatureSpi {
        public nonePSS() {
            super(new n0(), null, true);
        }
    }

    protected PSSSignatureSpi(a aVar, PSSParameterSpec pSSParameterSpec) {
        this(aVar, pSSParameterSpec, false);
    }

    protected PSSSignatureSpi(a aVar, PSSParameterSpec pSSParameterSpec, boolean z10) {
        this.helper = new ni.a();
        this.isInitState = true;
        this.signer = aVar;
        this.originalSpec = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.paramSpec = PSSParameterSpec.DEFAULT;
        } else {
            this.paramSpec = pSSParameterSpec;
        }
        this.mgfDigest = DigestFactory.getDigest("MGF1".equals(this.paramSpec.getMGFAlgorithm()) ? this.paramSpec.getDigestAlgorithm() : this.paramSpec.getMGFAlgorithm());
        this.saltLength = this.paramSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        this.isRaw = z10;
        setupContentDigest();
    }

    private byte getTrailer(int i10) {
        if (i10 == 1) {
            return (byte) -68;
        }
        throw new IllegalArgumentException("unknown trailer field");
    }

    private void setupContentDigest() {
        this.contentDigest = this.isRaw ? new NullPssDigest(this.mgfDigest) : DigestFactory.getDigest(this.paramSpec.getDigestAlgorithm());
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        PSSParameterSpec pSSParameterSpec;
        if (this.engineParams == null && (pSSParameterSpec = this.paramSpec) != null) {
            if (pSSParameterSpec.getDigestAlgorithm().equals(this.paramSpec.getMGFAlgorithm()) && this.paramSpec.getMGFParameters() == null) {
                return null;
            }
            try {
                AlgorithmParameters f10 = this.helper.f("PSS");
                this.engineParams = f10;
                f10.init(this.paramSpec);
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        if (privateKey instanceof RSAPrivateKey) {
            this.key = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
            o oVar = new o(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
            this.pss = oVar;
            SecureRandom secureRandom = this.random;
            if (secureRandom != null) {
                oVar.init(true, new g1(this.key, secureRandom));
            } else {
                oVar.init(true, this.key);
            }
            this.isInitState = true;
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        if (publicKey instanceof RSAPublicKey) {
            this.key = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
            o oVar = new o(this.signer, this.contentDigest, this.mgfDigest, this.saltLength, this.trailer);
            this.pss = oVar;
            oVar.init(false, this.key);
            this.isInitState = true;
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        String str;
        o oVar;
        boolean z10;
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.originalSpec) == null) {
            return;
        }
        if (!this.isInitState) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
        }
        PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
        PSSParameterSpec pSSParameterSpec2 = this.originalSpec;
        if (pSSParameterSpec2 != null && !DigestFactory.isSameDigest(pSSParameterSpec2.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
            throw new InvalidAlgorithmParameterException("parameter must be using " + this.originalSpec.getDigestAlgorithm());
        }
        if (pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") || pSSParameterSpec.getMGFAlgorithm().equals(q.f26806g1.H())) {
            if (!(pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown MGF parameters");
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            if (!DigestFactory.isSameDigest(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                throw new InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
            }
            str = mGF1ParameterSpec.getDigestAlgorithm();
        } else if (!pSSParameterSpec.getMGFAlgorithm().equals("SHAKE128") && !pSSParameterSpec.getMGFAlgorithm().equals("SHAKE256")) {
            throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
        } else {
            str = pSSParameterSpec.getMGFAlgorithm();
        }
        r digest = DigestFactory.getDigest(str);
        if (digest == null) {
            throw new InvalidAlgorithmParameterException("no match on MGF algorithm: " + pSSParameterSpec.getMGFAlgorithm());
        }
        this.engineParams = null;
        this.paramSpec = pSSParameterSpec;
        this.mgfDigest = digest;
        this.saltLength = pSSParameterSpec.getSaltLength();
        this.trailer = getTrailer(this.paramSpec.getTrailerField());
        setupContentDigest();
        if (this.key == null) {
            return;
        }
        this.pss = new o(this.signer, this.contentDigest, digest, this.saltLength, this.trailer);
        if (this.key.a()) {
            oVar = this.pss;
            z10 = true;
        } else {
            oVar = this.pss;
            z10 = false;
        }
        oVar.init(z10, this.key);
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        this.isInitState = true;
        try {
            return this.pss.b();
        } catch (j e10) {
            throw new SignatureException(e10.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b10) {
        this.pss.update(b10);
        this.isInitState = false;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i10, int i11) {
        this.pss.update(bArr, i10, i11);
        this.isInitState = false;
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        this.isInitState = true;
        return this.pss.a(bArr);
    }
}
