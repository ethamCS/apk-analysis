package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import qi.e;
import qi.f;
import zh.b;
import zh.n0;
import zh.o0;
import zh.p0;
/* loaded from: classes3.dex */
public class ElGamalUtil {
    public static b generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof e) {
            e eVar = (e) privateKey;
            return new o0(eVar.getX(), new n0(eVar.getParameters().b(), eVar.getParameters().a()));
        } else if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("can't identify private key for El Gamal.");
        } else {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            return new o0(dHPrivateKey.getX(), new n0(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
        }
    }

    public static b generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof f) {
            f fVar = (f) publicKey;
            return new p0(fVar.getY(), new n0(fVar.getParameters().b(), fVar.getParameters().a()));
        } else if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("can't identify public key for El Gamal.");
        } else {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            return new p0(dHPublicKey.getY(), new n0(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
        }
    }
}
