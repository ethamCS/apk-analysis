package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import mg.a;
import mi.g;
import mi.v;
import org.bouncycastle.crypto.c;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import ri.b;
import sh.b0;
import sh.c0;
import sh.m;
import sh.n;
import zh.f0;
import zh.i0;
import zh.r1;
import zh.u1;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int Ed25519 = 1;
    private static final int Ed448 = 2;
    private static final int EdDSA = -1;
    private static final int X25519 = 3;
    private static final int X448 = 4;
    private static final int XDH = -2;
    private final int algorithmDeclared;
    private int algorithmInitialized;
    private c generator;
    private SecureRandom secureRandom;

    /* loaded from: classes3.dex */
    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(KeyPairGeneratorSpi.EdDSA);
        }
    }

    /* loaded from: classes3.dex */
    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3);
        }
    }

    /* loaded from: classes3.dex */
    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(4);
        }
    }

    /* loaded from: classes3.dex */
    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(KeyPairGeneratorSpi.XDH);
        }
    }

    KeyPairGeneratorSpi(int i10) {
        this.algorithmDeclared = i10;
        if (getAlgorithmFamily(i10) != i10) {
            this.algorithmInitialized = i10;
        }
    }

    private static int getAlgorithmFamily(int i10) {
        return (i10 == 1 || i10 == 2) ? EdDSA : (i10 == 3 || i10 == 4) ? XDH : i10;
    }

    private static int getAlgorithmForName(String str) {
        if (str.equalsIgnoreCase("X25519") || str.equals(a.f16666b.H())) {
            return 3;
        }
        if (str.equalsIgnoreCase("Ed25519") || str.equals(a.f16668d.H())) {
            return 1;
        }
        if (str.equalsIgnoreCase("X448") || str.equals(a.f16667c.H())) {
            return 4;
        }
        if (str.equalsIgnoreCase("Ed448") || str.equals(a.f16669e.H())) {
            return 2;
        }
        throw new InvalidAlgorithmParameterException("invalid parameterSpec name: " + str);
    }

    private int getAlgorithmForStrength(int i10) {
        if (i10 == 255 || i10 == 256) {
            int i11 = this.algorithmDeclared;
            if (i11 != XDH) {
                if (i11 == EdDSA || i11 == 1) {
                    return 1;
                }
                if (i11 != 3) {
                    throw new InvalidParameterException("key size not configurable");
                }
            }
            return 3;
        } else if (i10 != 448) {
            throw new InvalidParameterException("unknown key size");
        } else {
            int i12 = this.algorithmDeclared;
            if (i12 != XDH) {
                if (i12 == EdDSA || i12 == 2) {
                    return 2;
                }
                if (i12 != 4) {
                    throw new InvalidParameterException("key size not configurable");
                }
            }
            return 4;
        }
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof ECGenParameterSpec ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : algorithmParameterSpec instanceof b ? ((b) algorithmParameterSpec).a() : algorithmParameterSpec instanceof g ? ((g) algorithmParameterSpec).a() : algorithmParameterSpec instanceof v ? ((v) algorithmParameterSpec).a() : ECUtil.getNameFrom(algorithmParameterSpec);
    }

    private c setupGenerator() {
        if (this.secureRandom == null) {
            this.secureRandom = l.b();
        }
        int i10 = this.algorithmInitialized;
        if (i10 == 1) {
            m mVar = new m();
            mVar.b(new f0(this.secureRandom));
            return mVar;
        } else if (i10 == 2) {
            n nVar = new n();
            nVar.b(new i0(this.secureRandom));
            return nVar;
        } else if (i10 == 3) {
            b0 b0Var = new b0();
            b0Var.b(new r1(this.secureRandom));
            return b0Var;
        } else if (i10 != 4) {
            throw new IllegalStateException("generator not correctly initialized");
        } else {
            c0 c0Var = new c0();
            c0Var.b(new u1(this.secureRandom));
            return c0Var;
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.algorithmInitialized != 0) {
            if (this.generator == null) {
                this.generator = setupGenerator();
            }
            org.bouncycastle.crypto.b a10 = this.generator.a();
            int i10 = this.algorithmInitialized;
            if (i10 == 1 || i10 == 2) {
                return new KeyPair(new BCEdDSAPublicKey(a10.b()), new BCEdDSAPrivateKey(a10.a()));
            }
            if (i10 != 3 && i10 != 4) {
                throw new IllegalStateException("generator not correctly initialized");
            }
            return new KeyPair(new BCXDHPublicKey(a10.b()), new BCXDHPrivateKey(a10.a()));
        }
        throw new IllegalStateException("generator not correctly initialized");
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        this.algorithmInitialized = getAlgorithmForStrength(i10);
        this.secureRandom = secureRandom;
        this.generator = null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
        }
        int algorithmForName = getAlgorithmForName(nameFromParams);
        int i10 = this.algorithmDeclared;
        if (i10 != algorithmForName && i10 != getAlgorithmFamily(algorithmForName)) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        }
        this.algorithmInitialized = algorithmForName;
        this.secureRandom = secureRandom;
        this.generator = null;
    }
}
