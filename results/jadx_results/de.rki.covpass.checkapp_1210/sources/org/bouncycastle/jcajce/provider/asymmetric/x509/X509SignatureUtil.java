package org.bouncycastle.jcajce.provider.asymmetric.x509;

import bk.f;
import gg.d0;
import gg.g;
import gg.r;
import gg.r1;
import gg.v;
import ih.o;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import mg.a;
import ni.d;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import tg.c;
import yg.b;
import zg.q;
import zg.x;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class X509SignatureUtil {
    private static final Map<v, String> algNames;
    private static final r derNull = r1.f10880d;

    static {
        HashMap hashMap = new HashMap();
        algNames = hashMap;
        hashMap.put(a.f16668d, "Ed25519");
        hashMap.put(a.f16669e, "Ed448");
        hashMap.put(b.f26295j, "SHA1withDSA");
        hashMap.put(o.B0, "SHA1withDSA");
    }

    X509SignatureUtil() {
    }

    private static String findAlgName(v vVar) {
        String lookupAlg;
        String lookupAlg2;
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider == null || (lookupAlg2 = lookupAlg(provider, vVar)) == null) {
            Provider[] providers = Security.getProviders();
            for (int i10 = 0; i10 != providers.length; i10++) {
                if (provider != providers[i10] && (lookupAlg = lookupAlg(providers[i10], vVar)) != null) {
                    return lookupAlg;
                }
            }
            return vVar.H();
        }
        return lookupAlg2;
    }

    private static String getDigestAlgName(v vVar) {
        String a10 = d.a(vVar);
        int indexOf = a10.indexOf(45);
        if (indexOf <= 0 || a10.startsWith("SHA3")) {
            return a10;
        }
        return a10.substring(0, indexOf) + a10.substring(indexOf + 1);
    }

    public static String getSignatureName(hh.b bVar) {
        g o10 = bVar.o();
        if (o10 != null && !derNull.r(o10)) {
            if (bVar.l().s(q.f26812i1)) {
                x m10 = x.m(o10);
                return getDigestAlgName(m10.l().l()) + "withRSAandMGF1";
            } else if (bVar.l().s(o.R)) {
                d0 F = d0.F(o10);
                return getDigestAlgName((v) F.G(0)) + "withECDSA";
            }
        }
        String str = algNames.get(bVar.l());
        return str != null ? str : findAlgName(bVar.l());
    }

    public static boolean isCompositeAlgorithm(hh.b bVar) {
        return c.N.s(bVar.l());
    }

    private static String lookupAlg(Provider provider, v vVar) {
        String property = provider.getProperty("Alg.Alias.Signature." + vVar);
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID." + vVar);
        if (property2 == null) {
            return null;
        }
        return property2;
    }

    public static void prettyPrintSignature(byte[] bArr, StringBuffer stringBuffer, String str) {
        int length = bArr.length;
        stringBuffer.append("            Signature: ");
        if (length <= 20) {
            stringBuffer.append(f.f(bArr));
            stringBuffer.append(str);
            return;
        }
        stringBuffer.append(f.g(bArr, 0, 20));
        stringBuffer.append(str);
        int i10 = 20;
        while (i10 < bArr.length) {
            int length2 = bArr.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i10 < length2 ? f.g(bArr, i10, 20) : f.g(bArr, i10, bArr.length - i10));
            stringBuffer.append(str);
            i10 += 20;
        }
    }

    public static void setSignatureParameters(Signature signature, g gVar) {
        if (gVar == null || derNull.r(gVar)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(gVar.b().getEncoded());
            if (!signature.getAlgorithm().endsWith("MGF1")) {
                return;
            }
            try {
                signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
            } catch (GeneralSecurityException e10) {
                throw new SignatureException("Exception extracting parameters: " + e10.getMessage());
            }
        } catch (IOException e11) {
            throw new SignatureException("IOException decoding parameters: " + e11.getMessage());
        }
    }
}
