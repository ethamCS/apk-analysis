package org.bouncycastle.jce.provider;

import gg.d0;
import gg.g;
import gg.r;
import gg.r1;
import gg.v;
import ih.o;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import lg.a;
import yg.b;
import zg.q;
import zg.x;
/* loaded from: classes3.dex */
public class X509SignatureUtil {
    private static final r derNull = r1.f10880d;

    X509SignatureUtil() {
    }

    private static String getDigestAlgName(v vVar) {
        return q.H1.s(vVar) ? "MD5" : b.f26294i.s(vVar) ? "SHA1" : ug.b.f23641f.s(vVar) ? "SHA224" : ug.b.f23635c.s(vVar) ? "SHA256" : ug.b.f23637d.s(vVar) ? "SHA384" : ug.b.f23639e.s(vVar) ? "SHA512" : ch.b.f6574c.s(vVar) ? "RIPEMD128" : ch.b.f6573b.s(vVar) ? "RIPEMD160" : ch.b.f6575d.s(vVar) ? "RIPEMD256" : a.f16018b.s(vVar) ? "GOST3411" : vVar.H();
    }

    public static String getSignatureName(hh.b bVar) {
        g o10 = bVar.o();
        if (o10 != null && !derNull.r(o10)) {
            if (bVar.l().s(q.f26812i1)) {
                x m10 = x.m(o10);
                return getDigestAlgName(m10.l().l()) + "withRSAandMGF1";
            } else if (bVar.l().s(o.R)) {
                d0 F = d0.F(o10);
                return getDigestAlgName(v.K(F.G(0))) + "withECDSA";
            }
        }
        return bVar.l().H();
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
