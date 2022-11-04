package org.bouncycastle.jcajce.provider.asymmetric.ec;

import gg.r;
import gg.r1;
import gg.v;
import ih.g;
import ih.i;
import ih.k;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import ri.d;
import ri.e;
/* loaded from: classes3.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private String curveName;
    private ECParameterSpec ecParameterSpec;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        g gVar;
        if (!isASN1FormatString(str)) {
            throw new IOException("Unknown parameters format in AlgorithmParameters object: " + str);
        }
        ECParameterSpec eCParameterSpec = this.ecParameterSpec;
        if (eCParameterSpec == null) {
            gVar = new g((r) r1.f10880d);
        } else {
            String str2 = this.curveName;
            if (str2 != null) {
                gVar = new g(ECUtil.getNamedCurveOid(str2));
            } else {
                e convertSpec = EC5Util.convertSpec(eCParameterSpec);
                gVar = new g(new i(convertSpec.a(), new k(convertSpec.b(), false), convertSpec.d(), convertSpec.c(), convertSpec.e()));
            }
        }
        return gVar.getEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.ecParameterSpec;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            String str = this.curveName;
            if (str != null) {
                v namedCurveOid = ECUtil.getNamedCurveOid(str);
                return namedCurveOid != null ? new ECGenParameterSpec(namedCurveOid.H()) : new ECGenParameterSpec(this.curveName);
            }
            v namedCurveOid2 = ECUtil.getNamedCurveOid(EC5Util.convertSpec(this.ecParameterSpec));
            if (namedCurveOid2 != null) {
                return new ECGenParameterSpec(namedCurveOid2.H());
            }
        }
        throw new InvalidParameterSpecException("EC AlgorithmParameters cannot convert to " + cls.getName());
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                this.curveName = algorithmParameterSpec instanceof d ? ((d) algorithmParameterSpec).c() : null;
                this.ecParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
        }
        ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
        i domainParametersFromGenSpec = ECUtils.getDomainParametersFromGenSpec(eCGenParameterSpec, BouncyCastleProvider.CONFIGURATION);
        if (domainParametersFromGenSpec != null) {
            this.curveName = eCGenParameterSpec.getName();
            ECParameterSpec convertToSpec = EC5Util.convertToSpec(domainParametersFromGenSpec);
            this.ecParameterSpec = new d(this.curveName, convertToSpec.getCurve(), convertToSpec.getGenerator(), convertToSpec.getOrder(), BigInteger.valueOf(convertToSpec.getCofactor()));
            return;
        }
        throw new InvalidParameterSpecException("EC curve name not recognized: " + eCGenParameterSpec.getName());
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        engineInit(bArr, "ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (!isASN1FormatString(str)) {
            throw new IOException("Unknown encoded parameters format in AlgorithmParameters object: " + str);
        }
        g l10 = g.l(bArr);
        ti.e curve = EC5Util.getCurve(BouncyCastleProvider.CONFIGURATION, l10);
        if (l10.o()) {
            v K = v.K(l10.m());
            String d10 = ih.d.d(K);
            this.curveName = d10;
            if (d10 == null) {
                this.curveName = K.H();
            }
        }
        this.ecParameterSpec = EC5Util.convertToSpec(l10, curve);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "EC Parameters";
    }

    protected boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }
}
