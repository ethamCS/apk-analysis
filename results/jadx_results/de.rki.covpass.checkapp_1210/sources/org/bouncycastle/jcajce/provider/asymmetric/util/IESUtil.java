package org.bouncycastle.jcajce.provider.asymmetric.util;

import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.f;
import org.conscrypt.PSKKeyManager;
import ri.p;
/* loaded from: classes3.dex */
public class IESUtil {
    public static p guessParameterSpec(f fVar, byte[] bArr) {
        if (fVar == null) {
            return new p(null, null, 128);
        }
        e d10 = fVar.d();
        return (d10.getAlgorithmName().equals("DES") || d10.getAlgorithmName().equals("RC2") || d10.getAlgorithmName().equals("RC5-32") || d10.getAlgorithmName().equals("RC5-64")) ? new p(null, null, 64, 64, bArr) : d10.getAlgorithmName().equals("SKIPJACK") ? new p(null, null, 80, 80, bArr) : d10.getAlgorithmName().equals("GOST28147") ? new p(null, null, PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr) : new p(null, null, 128, 128, bArr);
    }
}
