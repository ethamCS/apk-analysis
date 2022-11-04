package org.bouncycastle.jce.provider;

import ak.q;
import bk.f;
import eh.a;
import fh.c;
import gg.p;
import gg.w;
import hh.b0;
import hh.k;
import hh.l;
import hh.n;
import hh.o;
import hh.o0;
import hh.u;
import hh.v;
import hh.x;
import java.io.IOException;
import java.math.BigInteger;
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
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import oi.e;
/* loaded from: classes3.dex */
public class X509CRLObject extends X509CRL {

    /* renamed from: c */
    private o f18701c;
    private int hashCodeValue;
    private boolean isHashCodeSet = false;
    private boolean isIndirect;
    private String sigAlgName;
    private byte[] sigAlgParams;

    public X509CRLObject(o oVar) {
        this.f18701c = oVar;
        try {
            this.sigAlgName = X509SignatureUtil.getSignatureName(oVar.r());
            if (oVar.r().o() != null) {
                this.sigAlgParams = oVar.r().o().b().k("DER");
            } else {
                this.sigAlgParams = null;
            }
            this.isIndirect = isIndirectCRL(this);
        } catch (Exception e10) {
            throw new CRLException("CRL contents invalid: " + e10);
        }
    }

    private void doVerify(PublicKey publicKey, Signature signature) {
        if (this.f18701c.r().equals(this.f18701c.s().r())) {
            signature.initVerify(publicKey);
            signature.update(getTBSCertList());
            if (!signature.verify(getSignature())) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
            return;
        }
        throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
    }

    private Set getExtensionOIDs(boolean z10) {
        v l10;
        if (getVersion() != 2 || (l10 = this.f18701c.s().l()) == null) {
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

    public static boolean isIndirectCRL(X509CRL x509crl) {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(u.f12049e4.H());
            if (extensionValue != null) {
                if (b0.o(w.E(extensionValue).F()).r()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e10);
        }
    }

    private Set loadCRLEntries() {
        u l10;
        HashSet hashSet = new HashSet();
        Enumeration o10 = this.f18701c.o();
        c cVar = null;
        while (o10.hasMoreElements()) {
            o0.b bVar = (o0.b) o10.nextElement();
            hashSet.add(new X509CRLEntryObject(bVar, this.isIndirect, cVar));
            if (this.isIndirect && bVar.q() && (l10 = bVar.l().l(u.f12050f4)) != null) {
                cVar = c.n(x.n(l10.q()).o()[0].o());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof X509CRLObject)) {
            return super.equals(obj);
        }
        X509CRLObject x509CRLObject = (X509CRLObject) obj;
        if (this.isHashCodeSet && x509CRLObject.isHashCodeSet && x509CRLObject.hashCodeValue != this.hashCodeValue) {
            return false;
        }
        return this.f18701c.equals(x509CRLObject.f18701c);
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() {
        try {
            return this.f18701c.k("DER");
        } catch (IOException e10) {
            throw new CRLException(e10.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        u l10;
        v l11 = this.f18701c.s().l();
        if (l11 == null || (l10 = l11.l(new gg.v(str))) == null) {
            return null;
        }
        try {
            return l10.n().getEncoded();
        } catch (Exception e10) {
            throw new IllegalStateException("error parsing " + e10.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new e(c.n(this.f18701c.m().b()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f18701c.m().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        if (this.f18701c.n() != null) {
            return this.f18701c.n().l();
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        u l10;
        Enumeration o10 = this.f18701c.o();
        c cVar = null;
        while (o10.hasMoreElements()) {
            o0.b bVar = (o0.b) o10.nextElement();
            if (bVar.o().J(bigInteger)) {
                return new X509CRLEntryObject(bVar, this.isIndirect, cVar);
            }
            if (this.isIndirect && bVar.q() && (l10 = bVar.l().l(u.f12050f4)) != null) {
                cVar = c.n(x.n(l10.q()).o()[0].o());
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
        return this.f18701c.r().l().H();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        byte[] bArr = this.sigAlgParams;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.f18701c.q().G();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() {
        try {
            return this.f18701c.s().k("DER");
        } catch (IOException e10) {
            throw new CRLException(e10.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.f18701c.u().l();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.f18701c.w();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
        criticalExtensionOIDs.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.isHashCodeSet) {
            this.isHashCodeSet = true;
            this.hashCodeValue = super.hashCode();
        }
        return this.hashCodeValue;
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        c o10;
        u l10;
        if (certificate.getType().equals("X.509")) {
            Enumeration o11 = this.f18701c.o();
            c m10 = this.f18701c.m();
            if (o11 != null) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (o11.hasMoreElements()) {
                    o0.b m11 = o0.b.m(o11.nextElement());
                    if (this.isIndirect && m11.q() && (l10 = m11.l().l(u.f12050f4)) != null) {
                        m10 = c.n(x.n(l10.q()).o()[0].o());
                    }
                    if (m11.o().J(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            o10 = c.n(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                o10 = n.n(certificate.getEncoded()).o();
                            } catch (CertificateEncodingException unused) {
                                throw new RuntimeException("Cannot process certificate");
                            }
                        }
                        return m10.equals(o10);
                    }
                }
            }
            return false;
        }
        throw new RuntimeException("X.509 CRL used with non X.509 Cert");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0182 -> B:15:0x00b4). Please submit an issue!!! */
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
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(f.e(signature, 0, 20)));
        stringBuffer.append(d10);
        int i10 = 20;
        while (i10 < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i10 < length ? new String(f.e(signature, i10, 20)) : new String(f.e(signature, i10, signature.length - i10)));
            stringBuffer.append(d10);
            i10 += 20;
        }
        v l10 = this.f18701c.s().l();
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
                            c10 = a.c(pVar.s());
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
        Signature signature;
        try {
            signature = Signature.getInstance(getSigAlgName(), BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        doVerify(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) {
        doVerify(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, Provider provider) {
        doVerify(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }
}
