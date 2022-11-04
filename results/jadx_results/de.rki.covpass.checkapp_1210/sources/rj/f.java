package rj;

import gg.a0;
import hh.n0;
import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import zg.s;
/* loaded from: classes3.dex */
public class f extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            s m10 = s.m(a0.u(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!fj.e.f10265m.s(m10.o().l())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                fj.c n10 = fj.c.n(m10.u());
                return new c(new hj.f(n10.q(), n10.o(), n10.l(), n10.m(), n10.r(), n10.s(), n10.u()));
            } catch (IOException unused) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        } catch (IOException e10) {
            throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e10);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            n0 n10 = n0.n(a0.u(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!fj.e.f10265m.s(n10.l().l())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                fj.d m10 = fj.d.m(n10.q());
                return new d(new hj.g(m10.n(), m10.o(), m10.l()));
            } catch (IOException e10) {
                throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e10.getMessage());
            }
        } catch (IOException e11) {
            throw new InvalidKeySpecException(e11.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(s sVar) {
        fj.c n10 = fj.c.n(sVar.u().b());
        return new c(new hj.f(n10.q(), n10.o(), n10.l(), n10.m(), n10.r(), n10.s(), n10.u()));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(n0 n0Var) {
        fj.d m10 = fj.d.m(n0Var.q());
        return new d(new hj.g(m10.n(), m10.o(), m10.l()));
    }
}
