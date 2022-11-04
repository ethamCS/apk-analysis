package org.bouncycastle.jcajce.provider.asymmetric.ec;

import di.r;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import mi.q;
import nh.x;
import ni.a;
import ni.c;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.j;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import zh.e1;
import zh.g1;
/* loaded from: classes3.dex */
public class GMSignatureSpi extends java.security.SignatureSpi {
    private AlgorithmParameters engineParams;
    private final c helper = new a();
    private q paramSpec;
    private final r signer;

    /* loaded from: classes3.dex */
    public static class sha256WithSM2 extends GMSignatureSpi {
        public sha256WithSM2() {
            super(new r(new x()));
        }
    }

    /* loaded from: classes3.dex */
    public static class sm3WithSM2 extends GMSignatureSpi {
        public sm3WithSM2() {
            super(new r());
        }
    }

    GMSignatureSpi(r rVar) {
        this.signer = rVar;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
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
        i generatePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new g1(generatePrivateKeyParameter, secureRandom);
        }
        q qVar = this.paramSpec;
        if (qVar != null) {
            this.signer.init(true, new e1(generatePrivateKeyParameter, qVar.a()));
        } else {
            this.signer.init(true, generatePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        i generatePublicKeyParameter = ECUtils.generatePublicKeyParameter(publicKey);
        q qVar = this.paramSpec;
        if (qVar != null) {
            generatePublicKeyParameter = new e1(generatePublicKeyParameter, qVar.a());
        }
        this.signer.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof q) {
            this.paramSpec = (q) algorithmParameterSpec;
            return;
        }
        throw new InvalidAlgorithmParameterException("only SM2ParameterSpec supported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        try {
            return this.signer.b();
        } catch (j e10) {
            throw new SignatureException("unable to create signature: " + e10.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b10) {
        this.signer.update(b10);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i10, int i11) {
        this.signer.update(bArr, i10, i11);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        return this.signer.a(bArr);
    }
}
