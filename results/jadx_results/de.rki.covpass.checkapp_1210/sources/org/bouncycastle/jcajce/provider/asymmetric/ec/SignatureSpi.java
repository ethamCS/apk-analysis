package org.bouncycastle.jcajce.provider.asymmetric.ec;

import di.e;
import di.h;
import di.l;
import di.p;
import di.s;
import ei.a;
import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import nh.c0;
import nh.q;
import org.bouncycastle.crypto.n;
import org.bouncycastle.crypto.r;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSABase;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.conscrypt.PSKKeyManager;
import zh.b;
import zh.g1;
/* loaded from: classes3.dex */
public class SignatureSpi extends DSABase {

    /* loaded from: classes3.dex */
    public static class ecCVCDSA extends SignatureSpi {
        public ecCVCDSA() {
            super(a.b(), new e(), p.f9141a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA224 extends SignatureSpi {
        public ecCVCDSA224() {
            super(a.c(), new e(), p.f9141a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA256 extends SignatureSpi {
        public ecCVCDSA256() {
            super(a.d(), new e(), p.f9141a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA384 extends SignatureSpi {
        public ecCVCDSA384() {
            super(a.e(), new e(), p.f9141a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA3_224 extends SignatureSpi {
        public ecCVCDSA3_224() {
            super(a.f(), new e(), p.f9141a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA3_256 extends SignatureSpi {
        public ecCVCDSA3_256() {
            super(a.g(), new e(), p.f9141a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA3_384 extends SignatureSpi {
        public ecCVCDSA3_384() {
            super(a.h(), new e(), p.f9141a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA3_512 extends SignatureSpi {
        public ecCVCDSA3_512() {
            super(a.i(), new e(), p.f9141a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecCVCDSA512 extends SignatureSpi {
        public ecCVCDSA512() {
            super(a.j(), new e(), p.f9141a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSA extends SignatureSpi {
        public ecDSA() {
            super(a.b(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSA224 extends SignatureSpi {
        public ecDSA224() {
            super(a.c(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSA256 extends SignatureSpi {
        public ecDSA256() {
            super(a.d(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSA384 extends SignatureSpi {
        public ecDSA384() {
            super(a.e(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSA512 extends SignatureSpi {
        public ecDSA512() {
            super(a.j(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSARipeMD160 extends SignatureSpi {
        public ecDSARipeMD160() {
            super(new nh.s(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSASha3_224 extends SignatureSpi {
        public ecDSASha3_224() {
            super(a.f(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSASha3_256 extends SignatureSpi {
        public ecDSASha3_256() {
            super(a.g(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSASha3_384 extends SignatureSpi {
        public ecDSASha3_384() {
            super(a.h(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSASha3_512 extends SignatureSpi {
        public ecDSASha3_512() {
            super(a.i(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSAShake128 extends SignatureSpi {
        public ecDSAShake128() {
            super(new c0(128), new e(new l(new c0(128))), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSAShake256 extends SignatureSpi {
        public ecDSAShake256() {
            super(new c0((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES), new e(new l(new c0((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES))), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDSAnone extends SignatureSpi {
        public ecDSAnone() {
            super(new q(), new e(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSA extends SignatureSpi {
        public ecDetDSA() {
            super(a.b(), new e(new l(a.b())), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSA224 extends SignatureSpi {
        public ecDetDSA224() {
            super(a.c(), new e(new l(a.c())), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSA256 extends SignatureSpi {
        public ecDetDSA256() {
            super(a.d(), new e(new l(a.d())), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSA384 extends SignatureSpi {
        public ecDetDSA384() {
            super(a.e(), new e(new l(a.e())), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSA512 extends SignatureSpi {
        public ecDetDSA512() {
            super(a.j(), new e(new l(a.j())), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSASha3_224 extends SignatureSpi {
        public ecDetDSASha3_224() {
            super(a.f(), new e(new l(a.f())), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSASha3_256 extends SignatureSpi {
        public ecDetDSASha3_256() {
            super(a.g(), new e(new l(a.g())), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSASha3_384 extends SignatureSpi {
        public ecDetDSASha3_384() {
            super(a.h(), new e(new l(a.h())), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecDetDSASha3_512 extends SignatureSpi {
        public ecDetDSASha3_512() {
            super(a.i(), new e(new l(a.i())), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecNR extends SignatureSpi {
        public ecNR() {
            super(a.b(), new h(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecNR224 extends SignatureSpi {
        public ecNR224() {
            super(a.c(), new h(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecNR256 extends SignatureSpi {
        public ecNR256() {
            super(a.d(), new h(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecNR384 extends SignatureSpi {
        public ecNR384() {
            super(a.e(), new h(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecNR512 extends SignatureSpi {
        public ecNR512() {
            super(a.j(), new h(), s.f9152a);
        }
    }

    /* loaded from: classes3.dex */
    public static class ecPlainDSARP160 extends SignatureSpi {
        public ecPlainDSARP160() {
            super(new nh.s(), new e(), p.f9141a);
        }
    }

    SignatureSpi(r rVar, n nVar, di.a aVar) {
        super(rVar, nVar, aVar);
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        b generatePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        this.digest.reset();
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            this.signer.init(true, new g1(generatePrivateKeyParameter, secureRandom));
        } else {
            this.signer.init(true, generatePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        b generatePublicKeyParameter = ECUtils.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, generatePublicKeyParameter);
    }
}
