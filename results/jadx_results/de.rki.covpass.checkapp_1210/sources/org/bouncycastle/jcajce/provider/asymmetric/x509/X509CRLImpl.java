package org.bouncycastle.jcajce.provider.asymmetric.x509;

import ak.a;
import ak.q;
import gg.a0;
import gg.d0;
import gg.g;
import gg.k1;
import gg.p;
import gg.w;
import hh.b;
import hh.b0;
import hh.k;
import hh.l;
import hh.n;
import hh.o;
import hh.o0;
import hh.u;
import hh.u0;
import hh.v;
import hh.x;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import ji.e;
import ni.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class X509CRLImpl extends X509CRL {
    protected c bcHelper;

    /* renamed from: c */
    protected o f18687c;
    protected boolean isIndirect;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    public X509CRLImpl(c cVar, o oVar, String str, byte[] bArr, boolean z10) {
        this.bcHelper = cVar;
        this.f18687c = oVar;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
        this.isIndirect = z10;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, g gVar, byte[] bArr) {
        if (gVar != null) {
            X509SignatureUtil.setSignatureParameters(signature, gVar);
        }
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(li.c.a(signature), 512);
            this.f18687c.s().i(bufferedOutputStream, "DER");
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e10) {
            throw new CRLException(e10.toString());
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) {
        SignatureException e10;
        SignatureException e11;
        if (this.f18687c.r().equals(this.f18687c.s().r())) {
            int i10 = 0;
            if ((publicKey instanceof e) && X509SignatureUtil.isCompositeAlgorithm(this.f18687c.r())) {
                List<PublicKey> b10 = ((e) publicKey).b();
                d0 F = d0.F(this.f18687c.r().o());
                d0 F2 = d0.F(k1.M(this.f18687c.q()).D());
                boolean z10 = false;
                while (i10 != b10.size()) {
                    if (b10.get(i10) != null) {
                        b n10 = b.n(F.G(i10));
                        try {
                            checkSignature(b10.get(i10), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(n10)), n10.o(), k1.M(F2.G(i10)).D());
                            e11 = null;
                            z10 = true;
                        } catch (SignatureException e12) {
                            e11 = e12;
                        }
                        if (e11 != null) {
                            throw e11;
                        }
                    }
                    i10++;
                }
                if (!z10) {
                    throw new InvalidKeyException("no matching key found");
                }
                return;
            } else if (!X509SignatureUtil.isCompositeAlgorithm(this.f18687c.r())) {
                Signature createSignature = signatureCreator.createSignature(getSigAlgName());
                byte[] bArr = this.sigAlgParams;
                if (bArr == null) {
                    checkSignature(publicKey, createSignature, null, getSignature());
                    return;
                }
                try {
                    checkSignature(publicKey, createSignature, a0.u(bArr), getSignature());
                    return;
                } catch (IOException e13) {
                    throw new SignatureException("cannot decode signature parameters: " + e13.getMessage());
                }
            } else {
                d0 F3 = d0.F(this.f18687c.r().o());
                d0 F4 = d0.F(k1.M(this.f18687c.q()).D());
                boolean z11 = false;
                while (i10 != F4.size()) {
                    b n11 = b.n(F3.G(i10));
                    try {
                        checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(n11)), n11.o(), k1.M(F4.G(i10)).D());
                        e10 = null;
                        z11 = true;
                    } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                        e10 = null;
                    } catch (SignatureException e14) {
                        e10 = e14;
                    }
                    if (e10 != null) {
                        throw e10;
                    }
                    i10++;
                }
                if (!z11) {
                    throw new InvalidKeyException("no matching key found");
                }
                return;
            }
        }
        throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
    }

    private Set getExtensionOIDs(boolean z10) {
        v l10;
        if (getVersion() != 2 || (l10 = this.f18687c.s().l()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration o10 = l10.o();
        while (o10.hasMoreElements()) {
            gg.v vVar = (gg.v) o10.nextElement();
            if (z10 == l10.l(vVar).r()) {
                hashSet.add(vVar.H());
            }
        }
        return hashSet;
    }

    public static byte[] getExtensionOctets(o oVar, String str) {
        w extensionValue = getExtensionValue(oVar, str);
        if (extensionValue != null) {
            return extensionValue.F();
        }
        return null;
    }

    protected static w getExtensionValue(o oVar, String str) {
        u l10;
        v l11 = oVar.s().l();
        if (l11 == null || (l10 = l11.l(new gg.v(str))) == null) {
            return null;
        }
        return l10.n();
    }

    private Set loadCRLEntries() {
        u l10;
        HashSet hashSet = new HashSet();
        Enumeration o10 = this.f18687c.o();
        fh.c cVar = null;
        while (o10.hasMoreElements()) {
            o0.b bVar = (o0.b) o10.nextElement();
            hashSet.add(new X509CRLEntryObject(bVar, this.isIndirect, cVar));
            if (this.isIndirect && bVar.q() && (l10 = bVar.l().l(u.f12050f4)) != null) {
                cVar = fh.c.n(x.n(l10.q()).o()[0].o());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        w extensionValue = getExtensionValue(this.f18687c, str);
        if (extensionValue != null) {
            try {
                return extensionValue.getEncoded();
            } catch (Exception e10) {
                throw new IllegalStateException("error parsing " + e10.toString());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new oi.e(fh.c.n(this.f18687c.m().b()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f18687c.m().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        u0 n10 = this.f18687c.n();
        if (n10 == null) {
            return null;
        }
        return n10.l();
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        u l10;
        Enumeration o10 = this.f18687c.o();
        fh.c cVar = null;
        while (o10.hasMoreElements()) {
            o0.b bVar = (o0.b) o10.nextElement();
            if (bVar.o().J(bigInteger)) {
                return new X509CRLEntryObject(bVar, this.isIndirect, cVar);
            }
            if (this.isIndirect && bVar.q() && (l10 = bVar.l().l(u.f12050f4)) != null) {
                cVar = fh.c.n(x.n(l10.q()).o()[0].o());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        Set loadCRLEntries = loadCRLEntries();
        if (!loadCRLEntries.isEmpty()) {
            return Collections.unmodifiableSet(loadCRLEntries);
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.f18687c.r().l().H();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        return a.h(this.sigAlgParams);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.f18687c.q().G();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() {
        try {
            return this.f18687c.s().k("DER");
        } catch (IOException e10) {
            throw new CRLException(e10.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.f18687c.u().l();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.f18687c.w();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(u.f12049e4.H());
        criticalExtensionOIDs.remove(u.f12048d4.H());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        fh.c o10;
        u l10;
        if (certificate.getType().equals("X.509")) {
            Enumeration o11 = this.f18687c.o();
            fh.c m10 = this.f18687c.m();
            if (o11.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (o11.hasMoreElements()) {
                    o0.b m11 = o0.b.m(o11.nextElement());
                    if (this.isIndirect && m11.q() && (l10 = m11.l().l(u.f12050f4)) != null) {
                        m10 = fh.c.n(x.n(l10.q()).o()[0].o());
                    }
                    if (m11.o().J(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            o10 = fh.c.n(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                o10 = n.n(certificate.getEncoded()).o();
                            } catch (CertificateEncodingException e10) {
                                throw new IllegalArgumentException("Cannot process certificate: " + e10.getMessage());
                            }
                        }
                        return m10.equals(o10);
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0143 -> B:7:0x0075). Please submit an issue!!! */
    @Override // java.security.cert.CRL
    public String toString() {
        String str;
        String c10;
        Object m10;
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(d10);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(d10);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(d10);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(d10);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(d10);
        X509SignatureUtil.prettyPrintSignature(getSignature(), stringBuffer, d10);
        v l10 = this.f18687c.s().l();
        if (l10 != null) {
            Enumeration o10 = l10.o();
            if (o10.hasMoreElements()) {
                str = "           Extensions: ";
                stringBuffer.append(str);
                stringBuffer.append(d10);
            }
            while (o10.hasMoreElements()) {
                gg.v vVar = (gg.v) o10.nextElement();
                u l11 = l10.l(vVar);
                if (l11.n() != null) {
                    p pVar = new p(l11.n().F());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(l11.r());
                    stringBuffer.append(") ");
                    try {
                    } catch (Exception unused) {
                        stringBuffer.append(vVar.H());
                        stringBuffer.append(" value = ");
                        str = "*****";
                    }
                    if (vVar.s(u.Z3)) {
                        m10 = new l(gg.q.E(pVar.s()).F());
                    } else {
                        if (vVar.s(u.f12048d4)) {
                            c10 = "Base CRL: " + new l(gg.q.E(pVar.s()).F());
                        } else if (vVar.s(u.f12049e4)) {
                            m10 = b0.o(pVar.s());
                        } else if (vVar.s(u.f12052h4)) {
                            m10 = k.m(pVar.s());
                        } else if (vVar.s(u.f12058n4)) {
                            m10 = k.m(pVar.s());
                        } else {
                            stringBuffer.append(vVar.H());
                            stringBuffer.append(" value = ");
                            c10 = eh.a.c(pVar.s());
                        }
                        stringBuffer.append(c10);
                        stringBuffer.append(d10);
                    }
                    stringBuffer.append(m10);
                    stringBuffer.append(d10);
                } else {
                    stringBuffer.append(d10);
                }
            }
        }
        Set<Object> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object obj : revokedCertificates) {
                stringBuffer.append(obj);
                stringBuffer.append(d10);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) {
                try {
                    return X509CRLImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final String str) {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str2) {
                String str3 = str;
                return str3 != null ? Signature.getInstance(str2, str3) : Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final Provider provider) {
        try {
            doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) {
                    return provider != null ? Signature.getInstance(X509CRLImpl.this.getSigAlgName(), provider) : Signature.getInstance(X509CRLImpl.this.getSigAlgName());
                }
            });
        } catch (NoSuchProviderException e10) {
            throw new NoSuchAlgorithmException("provider issue: " + e10.getMessage());
        }
    }
}
