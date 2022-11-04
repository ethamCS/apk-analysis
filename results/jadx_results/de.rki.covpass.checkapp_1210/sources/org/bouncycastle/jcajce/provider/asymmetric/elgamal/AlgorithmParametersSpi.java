package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import gg.a0;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import ri.i;
import yg.a;
/* loaded from: classes3.dex */
public class AlgorithmParametersSpi extends BaseAlgorithmParameters {
    i currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new a(this.currentSpec.b(), this.currentSpec.a()).k("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding ElGamalParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        boolean z10 = algorithmParameterSpec instanceof i;
        if (z10 || (algorithmParameterSpec instanceof DHParameterSpec)) {
            if (z10) {
                this.currentSpec = (i) algorithmParameterSpec;
                return;
            }
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.currentSpec = new i(dHParameterSpec.getP(), dHParameterSpec.getG());
            return;
        }
        throw new InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        try {
            a m10 = a.m(a0.u(bArr));
            this.currentSpec = new i(m10.n(), m10.l());
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        } catch (ClassCastException unused2) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
            return;
        }
        throw new IOException("Unknown parameter format " + str);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "ElGamal Parameters";
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
        if (cls == i.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        if (cls != DHParameterSpec.class) {
            throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
        }
        return new DHParameterSpec(this.currentSpec.b(), this.currentSpec.a());
    }
}
