package org.bouncycastle.jcajce.provider.asymmetric.util;

import aj.f;
import gg.d0;
import gg.v;
import ih.d;
import ih.g;
import ih.i;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import lg.b;
import oh.a;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import ti.c;
import ti.e;
import zh.y;
/* loaded from: classes3.dex */
public class EC5Util {
    private static Map customCurves = new HashMap();

    static {
        Enumeration l10 = a.l();
        while (l10.hasMoreElements()) {
            String str = (String) l10.nextElement();
            i b10 = d.b(str);
            if (b10 != null) {
                customCurves.put(b10.l(), a.i(str).l());
            }
        }
        e l11 = a.i("Curve25519").l();
        customCurves.put(new e.f(l11.s().c(), l11.n().t(), l11.o().t(), l11.w(), l11.p()), l11);
    }

    public static EllipticCurve convertCurve(e eVar, byte[] bArr) {
        return new EllipticCurve(convertField(eVar.s()), eVar.n().t(), eVar.o().t(), null);
    }

    public static e convertCurve(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a10 = ellipticCurve.getA();
        BigInteger b10 = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            e.f fVar = new e.f(((ECFieldFp) field).getP(), a10, b10);
            return customCurves.containsKey(fVar) ? (e) customCurves.get(fVar) : fVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m10 = eCFieldF2m.getM();
        int[] convertMidTerms = ECUtil.convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new e.C0394e(m10, convertMidTerms[0], convertMidTerms[1], convertMidTerms[2], a10, b10);
    }

    public static ECField convertField(aj.a aVar) {
        if (c.o(aVar)) {
            return new ECFieldFp(aVar.c());
        }
        aj.e a10 = ((f) aVar).a();
        int[] a11 = a10.a();
        return new ECFieldF2m(a10.b(), ak.a.S(ak.a.x(a11, 1, a11.length - 1)));
    }

    public static ECPoint convertPoint(ti.i iVar) {
        ti.i A = iVar.A();
        return new ECPoint(A.f().t(), A.g().t());
    }

    public static ti.i convertPoint(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return convertPoint(convertCurve(eCParameterSpec.getCurve()), eCPoint);
    }

    public static ti.i convertPoint(e eVar, ECPoint eCPoint) {
        return eVar.g(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ECParameterSpec convertSpec(EllipticCurve ellipticCurve, ri.e eVar) {
        ECPoint convertPoint = convertPoint(eVar.b());
        return eVar instanceof ri.c ? new ri.d(((ri.c) eVar).f(), ellipticCurve, convertPoint, eVar.d(), eVar.c()) : new ECParameterSpec(ellipticCurve, convertPoint, eVar.d(), eVar.c().intValue());
    }

    public static ri.e convertSpec(ECParameterSpec eCParameterSpec) {
        e convertCurve = convertCurve(eCParameterSpec.getCurve());
        ti.i convertPoint = convertPoint(convertCurve, eCParameterSpec.getGenerator());
        BigInteger order = eCParameterSpec.getOrder();
        BigInteger valueOf = BigInteger.valueOf(eCParameterSpec.getCofactor());
        byte[] seed = eCParameterSpec.getCurve().getSeed();
        return eCParameterSpec instanceof ri.d ? new ri.c(((ri.d) eCParameterSpec).c(), convertCurve, convertPoint, order, valueOf, seed) : new ri.e(convertCurve, convertPoint, order, valueOf, seed);
    }

    public static ECParameterSpec convertToSpec(g gVar, e eVar) {
        ECParameterSpec eCParameterSpec;
        if (gVar.o()) {
            v vVar = (v) gVar.m();
            i namedCurveByOid = ECUtil.getNamedCurveByOid(vVar);
            if (namedCurveByOid == null) {
                Map additionalECParameters = BouncyCastleProvider.CONFIGURATION.getAdditionalECParameters();
                if (!additionalECParameters.isEmpty()) {
                    namedCurveByOid = (i) additionalECParameters.get(vVar);
                }
            }
            return new ri.d(ECUtil.getCurveName(vVar), convertCurve(eVar, namedCurveByOid.r()), convertPoint(namedCurveByOid.m()), namedCurveByOid.q(), namedCurveByOid.n());
        } else if (gVar.n()) {
            return null;
        } else {
            d0 F = d0.F(gVar.m());
            if (F.size() > 3) {
                i o10 = i.o(F);
                EllipticCurve convertCurve = convertCurve(eVar, o10.r());
                eCParameterSpec = o10.n() != null ? new ECParameterSpec(convertCurve, convertPoint(o10.m()), o10.q(), o10.n().intValue()) : new ECParameterSpec(convertCurve, convertPoint(o10.m()), o10.q(), 1);
            } else {
                lg.f n10 = lg.f.n(F);
                ri.c a10 = oi.a.a(b.g(n10.o()));
                eCParameterSpec = new ri.d(b.g(n10.o()), convertCurve(a10.a(), a10.e()), convertPoint(a10.b()), a10.d(), a10.c());
            }
            return eCParameterSpec;
        }
    }

    public static ECParameterSpec convertToSpec(i iVar) {
        return new ECParameterSpec(convertCurve(iVar.l(), null), convertPoint(iVar.m()), iVar.q(), iVar.n().intValue());
    }

    public static ECParameterSpec convertToSpec(y yVar) {
        return new ECParameterSpec(convertCurve(yVar.a(), null), convertPoint(yVar.b()), yVar.e(), yVar.c().intValue());
    }

    public static e getCurve(ProviderConfiguration providerConfiguration, g gVar) {
        Set acceptableNamedCurves = providerConfiguration.getAcceptableNamedCurves();
        if (!gVar.o()) {
            if (gVar.n()) {
                return providerConfiguration.getEcImplicitlyCa().a();
            }
            d0 F = d0.F(gVar.m());
            if (!acceptableNamedCurves.isEmpty()) {
                throw new IllegalStateException("encoded parameters not acceptable");
            }
            return (F.size() > 3 ? i.o(F) : b.f(v.K(F.G(0)))).l();
        }
        v K = v.K(gVar.m());
        if (!acceptableNamedCurves.isEmpty() && !acceptableNamedCurves.contains(K)) {
            throw new IllegalStateException("named curve not acceptable");
        }
        i namedCurveByOid = ECUtil.getNamedCurveByOid(K);
        if (namedCurveByOid == null) {
            namedCurveByOid = (i) providerConfiguration.getAdditionalECParameters().get(K);
        }
        return namedCurveByOid.l();
    }

    public static y getDomainParameters(ProviderConfiguration providerConfiguration, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec == null) {
            ri.e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new y(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c(), ecImplicitlyCa.e());
        }
        return ECUtil.getDomainParameters(providerConfiguration, convertSpec(eCParameterSpec));
    }
}
