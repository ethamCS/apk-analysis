package org.bouncycastle.jcajce.provider.asymmetric.ies;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.e;
import gg.h;
import gg.j0;
import gg.q;
import gg.t1;
import gg.w;
import gg.x1;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Enumeration;
import java.util.Objects;
import ri.p;
/* loaded from: classes3.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    p currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            h hVar = new h();
            if (this.currentSpec.b() != null) {
                hVar.a(new a2(false, 0, new t1(this.currentSpec.b())));
            }
            if (this.currentSpec.c() != null) {
                hVar.a(new a2(false, 1, new t1(this.currentSpec.c())));
            }
            hVar.a(new q(this.currentSpec.d()));
            if (this.currentSpec.e() != null) {
                h hVar2 = new h();
                hVar2.a(new q(this.currentSpec.a()));
                hVar2.a(new t1(this.currentSpec.e()));
                hVar.a(new x1(hVar2));
            }
            hVar.a(this.currentSpec.f() ? e.f10801x : e.f10800q);
            return new x1(hVar).k("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding IESParameters");
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
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        Objects.requireNonNull(cls, "argument to getParameterSpec must not be null");
        return localEngineGetParameterSpec(cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof p) {
            this.currentSpec = (p) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        try {
            d0 d0Var = (d0) a0.u(bArr);
            if (d0Var.size() > 5) {
                throw new IOException("sequence too big");
            }
            Enumeration H = d0Var.H();
            BigInteger bigInteger = null;
            boolean z10 = false;
            BigInteger bigInteger2 = null;
            byte[] bArr2 = null;
            byte[] bArr3 = null;
            byte[] bArr4 = null;
            while (H.hasMoreElements()) {
                Object nextElement = H.nextElement();
                if (nextElement instanceof j0) {
                    j0 N = j0.N(nextElement);
                    if (N.Q() == 0) {
                        bArr2 = w.D(N, false).F();
                    } else if (N.Q() == 1) {
                        bArr3 = w.D(N, false).F();
                    }
                } else if (nextElement instanceof q) {
                    bigInteger2 = q.E(nextElement).G();
                } else if (nextElement instanceof d0) {
                    d0 F = d0.F(nextElement);
                    BigInteger G = q.E(F.G(0)).G();
                    bArr4 = w.E(F.G(1)).F();
                    bigInteger = G;
                } else if (nextElement instanceof e) {
                    z10 = e.E(nextElement).G();
                }
            }
            this.currentSpec = bigInteger != null ? new p(bArr2, bArr3, bigInteger2.intValue(), bigInteger.intValue(), bArr4, z10) : new p(bArr2, bArr3, bigInteger2.intValue(), -1, null, z10);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException("Not a valid IES Parameter encoding.");
        } catch (ClassCastException unused2) {
            throw new IOException("Not a valid IES Parameter encoding.");
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
        return "IES Parameters";
    }

    protected boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
        if (cls == p.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }
}
