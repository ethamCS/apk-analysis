package org.bouncycastle.jcajce.provider.asymmetric.edec;

import ak.a;
import androidx.constraintlayout.widget.i;
import bk.f;
import ei.c;
import gg.a0;
import gg.d0;
import gg.v;
import gg.w;
import hh.n0;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import mi.m;
import mi.n;
import mi.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import zg.s;
import zh.b;
import zh.g0;
import zh.h0;
import zh.k0;
import zh.t1;
import zh.w1;
/* loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    private static final byte Ed25519_type = 112;
    private static final byte Ed448_type = 113;
    private static final byte x25519_type = 110;
    private static final byte x448_type = 111;
    String algorithm;
    private final boolean isXdh;
    private final int specificBase;
    static final byte[] x448Prefix = f.a("3042300506032b656f033900");
    static final byte[] x25519Prefix = f.a("302a300506032b656e032100");
    static final byte[] Ed448Prefix = f.a("3043300506032b6571033a00");
    static final byte[] Ed25519Prefix = f.a("302a300506032b6570032100");

    /* loaded from: classes3.dex */
    public static class Ed25519 extends KeyFactorySpi {
        public Ed25519() {
            super("Ed25519", false, 112);
        }
    }

    /* loaded from: classes3.dex */
    public static class Ed448 extends KeyFactorySpi {
        public Ed448() {
            super("Ed448", false, 113);
        }
    }

    /* loaded from: classes3.dex */
    public static class EdDSA extends KeyFactorySpi {
        public EdDSA() {
            super("EdDSA", false, 0);
        }
    }

    /* loaded from: classes3.dex */
    public static class X25519 extends KeyFactorySpi {
        public X25519() {
            super("X25519", true, i.E2);
        }
    }

    /* loaded from: classes3.dex */
    public static class X448 extends KeyFactorySpi {
        public X448() {
            super("X448", true, 111);
        }
    }

    /* loaded from: classes3.dex */
    public static class XDH extends KeyFactorySpi {
        public XDH() {
            super("XDH", true, 0);
        }
    }

    public KeyFactorySpi(String str, boolean z10, int i10) {
        this.algorithm = str;
        this.isXdh = z10;
        this.specificBase = i10;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof m) {
            b c10 = ei.b.c(((m) keySpec).getEncoded());
            if (!(c10 instanceof g0)) {
                throw new IllegalStateException("openssh private key not Ed25519 private key");
            }
            return new BCEdDSAPrivateKey((g0) c10);
        }
        return super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
            int i10 = this.specificBase;
            if (i10 == 0 || i10 == encoded[8]) {
                if (encoded[9] == 5 && encoded[10] == 0) {
                    n0 n10 = n0.n(encoded);
                    try {
                        encoded = new n0(new hh.b(n10.l().l()), n10.o().D()).k("DER");
                    } catch (IOException e10) {
                        throw new InvalidKeySpecException("attempt to reconstruct key failed: " + e10.getMessage());
                    }
                }
                switch (encoded[8]) {
                    case i.E2 /* 110 */:
                        return new BCXDHPublicKey(x25519Prefix, encoded);
                    case 111:
                        return new BCXDHPublicKey(x448Prefix, encoded);
                    case 112:
                        return new BCEdDSAPublicKey(Ed25519Prefix, encoded);
                    case 113:
                        return new BCEdDSAPublicKey(Ed448Prefix, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else if (keySpec instanceof p) {
            byte[] encoded2 = ((p) keySpec).getEncoded();
            switch (this.specificBase) {
                case i.E2 /* 110 */:
                    return new BCXDHPublicKey(new t1(encoded2));
                case 111:
                    return new BCXDHPublicKey(new w1(encoded2));
                case 112:
                    return new BCEdDSAPublicKey(new h0(encoded2));
                case 113:
                    return new BCEdDSAPublicKey(new k0(encoded2));
                default:
                    throw new InvalidKeySpecException("factory not a specific type, cannot recognise raw encoding");
            }
        } else if (keySpec instanceof n) {
            b c10 = c.c(((n) keySpec).getEncoded());
            if (!(c10 instanceof h0)) {
                throw new IllegalStateException("openssh public key not Ed25519 public key");
            }
            return new BCEdDSAPublicKey(new byte[0], ((h0) c10).getEncoded());
        }
        return super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(m.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new m(ei.b.b(new g0(w.E(a0.u(w.E(d0.F(key.getEncoded()).G(2)).F())).F())));
            } catch (IOException e10) {
                throw new InvalidKeySpecException(e10.getMessage(), e10.getCause());
            }
        } else if (!cls.isAssignableFrom(n.class) || !(key instanceof BCEdDSAPublicKey)) {
            if (cls.isAssignableFrom(p.class)) {
                if (key instanceof ki.c) {
                    return new p(((ki.c) key).getUEncoding());
                }
                if (key instanceof ki.b) {
                    return new p(((ki.b) key).getPointEncoding());
                }
            }
            return super.engineGetKeySpec(key, cls);
        } else {
            try {
                byte[] encoded = key.getEncoded();
                byte[] bArr = Ed25519Prefix;
                if (!a.b(bArr, 0, bArr.length, encoded, 0, encoded.length - 32)) {
                    throw new InvalidKeySpecException("Invalid Ed25519 public key encoding");
                }
                return new n(c.a(new h0(encoded, bArr.length)));
            } catch (IOException e11) {
                throw new InvalidKeySpecException(e11.getMessage(), e11.getCause());
            }
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(s sVar) {
        v l10 = sVar.o().l();
        if (this.isXdh) {
            int i10 = this.specificBase;
            if ((i10 == 0 || i10 == 111) && l10.s(mg.a.f16667c)) {
                return new BCXDHPrivateKey(sVar);
            }
            int i11 = this.specificBase;
            if ((i11 == 0 || i11 == 110) && l10.s(mg.a.f16666b)) {
                return new BCXDHPrivateKey(sVar);
            }
        } else {
            v vVar = mg.a.f16669e;
            if (l10.s(vVar) || l10.s(mg.a.f16668d)) {
                int i12 = this.specificBase;
                if ((i12 == 0 || i12 == 113) && l10.s(vVar)) {
                    return new BCEdDSAPrivateKey(sVar);
                }
                int i13 = this.specificBase;
                if ((i13 == 0 || i13 == 112) && l10.s(mg.a.f16668d)) {
                    return new BCEdDSAPrivateKey(sVar);
                }
            }
        }
        throw new IOException("algorithm identifier " + l10 + " in key not recognized");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(n0 n0Var) {
        v l10 = n0Var.l().l();
        if (this.isXdh) {
            int i10 = this.specificBase;
            if ((i10 == 0 || i10 == 111) && l10.s(mg.a.f16667c)) {
                return new BCXDHPublicKey(n0Var);
            }
            int i11 = this.specificBase;
            if ((i11 == 0 || i11 == 110) && l10.s(mg.a.f16666b)) {
                return new BCXDHPublicKey(n0Var);
            }
        } else {
            v vVar = mg.a.f16669e;
            if (l10.s(vVar) || l10.s(mg.a.f16668d)) {
                int i12 = this.specificBase;
                if ((i12 == 0 || i12 == 113) && l10.s(vVar)) {
                    return new BCEdDSAPublicKey(n0Var);
                }
                int i13 = this.specificBase;
                if ((i13 == 0 || i13 == 112) && l10.s(mg.a.f16668d)) {
                    return new BCEdDSAPublicKey(n0Var);
                }
            }
        }
        throw new IOException("algorithm identifier " + l10 + " in key not recognized");
    }
}
