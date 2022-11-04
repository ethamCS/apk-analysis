package org.bouncycastle.jcajce.provider.asymmetric.util;

import ak.a;
import ak.q;
import gg.v;
import hh.n0;
import ih.d;
import ih.g;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import ri.c;
import ri.e;
import ti.i;
import ti.k;
import zg.s;
import zh.b;
import zh.c0;
import zh.d0;
import zh.e0;
import zh.y;
/* loaded from: classes3.dex */
public class ECUtil {
    public static int[] convertMidTerms(int[] iArr) {
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else if (iArr.length != 3) {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        } else {
            if (iArr[0] < iArr[1] && iArr[0] < iArr[2]) {
                iArr2[0] = iArr[0];
                if (iArr[1] < iArr[2]) {
                    iArr2[1] = iArr[1];
                    iArr2[2] = iArr[2];
                } else {
                    iArr2[1] = iArr[2];
                    iArr2[2] = iArr[1];
                }
            } else if (iArr[1] < iArr[2]) {
                iArr2[0] = iArr[1];
                if (iArr[0] < iArr[2]) {
                    iArr2[1] = iArr[0];
                    iArr2[2] = iArr[2];
                } else {
                    iArr2[1] = iArr[2];
                    iArr2[2] = iArr[0];
                }
            } else {
                iArr2[0] = iArr[2];
                if (iArr[0] < iArr[1]) {
                    iArr2[1] = iArr[0];
                    iArr2[2] = iArr[1];
                } else {
                    iArr2[1] = iArr[1];
                    iArr2[2] = iArr[0];
                }
            }
        }
        return iArr2;
    }

    public static String generateKeyFingerprint(i iVar, e eVar) {
        ti.e a10 = eVar.a();
        return a10 != null ? new ak.e(a.r(iVar.l(false), a10.n().e(), a10.o().e(), eVar.b().l(false))).toString() : new ak.e(iVar.l(false)).toString();
    }

    public static b generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof qi.b) {
            qi.b bVar = (qi.b) privateKey;
            e parameters = bVar.getParameters();
            if (parameters == null) {
                parameters = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            }
            if (!(bVar.getParameters() instanceof c)) {
                return new d0(bVar.getD(), new y(parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()));
            }
            return new d0(bVar.getD(), new c0(d.f(((c) bVar.getParameters()).f()), parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()));
        } else if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            e convertSpec = EC5Util.convertSpec(eCPrivateKey.getParams());
            return new d0(eCPrivateKey.getS(), new y(convertSpec.a(), convertSpec.b(), convertSpec.d(), convertSpec.c(), convertSpec.e()));
        } else {
            try {
                byte[] encoded = privateKey.getEncoded();
                if (encoded == null) {
                    throw new InvalidKeyException("no encoding for EC private key");
                }
                PrivateKey privateKey2 = BouncyCastleProvider.getPrivateKey(s.m(encoded));
                if (!(privateKey2 instanceof ECPrivateKey)) {
                    throw new InvalidKeyException("can't identify EC private key.");
                }
                return generatePrivateKeyParameter(privateKey2);
            } catch (Exception e10) {
                throw new InvalidKeyException("cannot identify EC private key: " + e10.toString());
            }
        }
    }

    public static b generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof qi.c) {
            qi.c cVar = (qi.c) publicKey;
            e parameters = cVar.getParameters();
            return new e0(cVar.getQ(), new y(parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()));
        } else if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            e convertSpec = EC5Util.convertSpec(eCPublicKey.getParams());
            return new e0(EC5Util.convertPoint(eCPublicKey.getParams(), eCPublicKey.getW()), new y(convertSpec.a(), convertSpec.b(), convertSpec.d(), convertSpec.c(), convertSpec.e()));
        } else {
            try {
                byte[] encoded = publicKey.getEncoded();
                if (encoded == null) {
                    throw new InvalidKeyException("no encoding for EC public key");
                }
                PublicKey publicKey2 = BouncyCastleProvider.getPublicKey(n0.n(encoded));
                if (!(publicKey2 instanceof ECPublicKey)) {
                    throw new InvalidKeyException("cannot identify EC public key.");
                }
                return generatePublicKeyParameter(publicKey2);
            } catch (Exception e10) {
                throw new InvalidKeyException("cannot identify EC public key: " + e10.toString());
            }
        }
    }

    public static String getCurveName(v vVar) {
        return d.d(vVar);
    }

    public static y getDomainParameters(ProviderConfiguration providerConfiguration, g gVar) {
        y yVar;
        if (gVar.o()) {
            v K = v.K(gVar.m());
            ih.i namedCurveByOid = getNamedCurveByOid(K);
            if (namedCurveByOid == null) {
                namedCurveByOid = (ih.i) providerConfiguration.getAdditionalECParameters().get(K);
            }
            return new c0(K, namedCurveByOid);
        }
        if (gVar.n()) {
            e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            yVar = new y(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c(), ecImplicitlyCa.e());
        } else {
            ih.i o10 = ih.i.o(gVar.m());
            yVar = new y(o10.l(), o10.m(), o10.q(), o10.n(), o10.r());
        }
        return yVar;
    }

    public static y getDomainParameters(ProviderConfiguration providerConfiguration, e eVar) {
        if (eVar instanceof c) {
            c cVar = (c) eVar;
            return new c0(getNamedCurveOid(cVar.f()), cVar.a(), cVar.b(), cVar.d(), cVar.c(), cVar.e());
        } else if (eVar != null) {
            return new y(eVar.a(), eVar.b(), eVar.d(), eVar.c(), eVar.e());
        } else {
            e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new y(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c(), ecImplicitlyCa.e());
        }
    }

    public static String getNameFrom(final AlgorithmParameterSpec algorithmParameterSpec) {
        return (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    return algorithmParameterSpec.getClass().getMethod("getName", new Class[0]).invoke(algorithmParameterSpec, new Object[0]);
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static ih.i getNamedCurveByName(String str) {
        ih.i i10 = oh.a.i(str);
        return i10 == null ? d.b(str) : i10;
    }

    public static ih.i getNamedCurveByOid(v vVar) {
        ih.i j10 = oh.a.j(vVar);
        return j10 == null ? d.c(vVar) : j10;
    }

    public static v getNamedCurveOid(String str) {
        if (str == null || str.length() < 1) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        v oid = getOID(str);
        return oid != null ? oid : d.f(str);
    }

    public static v getNamedCurveOid(e eVar) {
        Enumeration e10 = d.e();
        while (e10.hasMoreElements()) {
            String str = (String) e10.nextElement();
            ih.i b10 = d.b(str);
            if (b10.q().equals(eVar.d()) && b10.n().equals(eVar.c()) && b10.l().l(eVar.a()) && b10.m().e(eVar.b())) {
                return d.f(str);
            }
        }
        return null;
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

    public static int getOrderBitLength(ProviderConfiguration providerConfiguration, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger == null) {
            e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return ecImplicitlyCa == null ? bigInteger2.bitLength() : ecImplicitlyCa.d().bitLength();
        }
        return bigInteger.bitLength();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        i A = new k().a(eVar.b(), bigInteger).A();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(A, eVar));
        stringBuffer.append("]");
        stringBuffer.append(d10);
        stringBuffer.append("            X: ");
        stringBuffer.append(A.f().t().toString(16));
        stringBuffer.append(d10);
        stringBuffer.append("            Y: ");
        stringBuffer.append(A.g().t().toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, i iVar, e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(iVar, eVar));
        stringBuffer.append("]");
        stringBuffer.append(d10);
        stringBuffer.append("            X: ");
        stringBuffer.append(iVar.f().t().toString(16));
        stringBuffer.append(d10);
        stringBuffer.append("            Y: ");
        stringBuffer.append(iVar.g().t().toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
