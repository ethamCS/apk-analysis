package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import qi.i;
import qi.j;
import ri.n;
import zh.b;
import zh.t0;
import zh.u0;
import zh.v0;
/* loaded from: classes3.dex */
public class GOST3410Util {
    public static b generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof i) {
            i iVar = (i) privateKey;
            n a10 = iVar.getParameters().a();
            return new u0(iVar.getX(), new t0(a10.b(), a10.c(), a10.a()));
        }
        throw new InvalidKeyException("can't identify GOST3410 private key.");
    }

    public static b generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof j) {
            j jVar = (j) publicKey;
            n a10 = jVar.getParameters().a();
            return new v0(jVar.getY(), new t0(a10.b(), a10.c(), a10.a()));
        }
        throw new InvalidKeyException("can't identify GOST3410 public key: " + publicKey.getClass().getName());
    }
}
