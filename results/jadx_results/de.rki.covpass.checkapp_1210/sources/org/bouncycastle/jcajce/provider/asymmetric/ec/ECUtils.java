package org.bouncycastle.jcajce.provider.asymmetric.ec;

import gg.r;
import gg.r1;
import gg.v;
import ih.g;
import ih.i;
import ih.k;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import ri.d;
import ti.e;
import zh.b;
/* loaded from: classes3.dex */
public class ECUtils {
    ECUtils() {
    }

    public static b generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    public static i getDomainParametersFromGenSpec(ECGenParameterSpec eCGenParameterSpec, ProviderConfiguration providerConfiguration) {
        return getDomainParametersFromName(eCGenParameterSpec.getName(), providerConfiguration);
    }

    public static g getDomainParametersFromName(ECParameterSpec eCParameterSpec, boolean z10) {
        if (!(eCParameterSpec instanceof d)) {
            if (eCParameterSpec == null) {
                return new g((r) r1.f10880d);
            }
            e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new g(new i(convertCurve, new k(EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), z10), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        d dVar = (d) eCParameterSpec;
        v namedCurveOid = ECUtil.getNamedCurveOid(dVar.c());
        if (namedCurveOid == null) {
            namedCurveOid = new v(dVar.c());
        }
        return new g(namedCurveOid);
    }

    public static i getDomainParametersFromName(String str, ProviderConfiguration providerConfiguration) {
        if (str == null || str.length() < 1) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        v oid = getOID(str);
        if (oid == null) {
            return ECUtil.getNamedCurveByName(str);
        }
        i namedCurveByOid = ECUtil.getNamedCurveByOid(oid);
        return (namedCurveByOid != null || providerConfiguration == null) ? namedCurveByOid : (i) providerConfiguration.getAdditionalECParameters().get(oid);
    }

    private static v getOID(String str) {
        char charAt = str.charAt(0);
        if (charAt < '0' || charAt > '2') {
            return null;
        }
        try {
            return new v(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
