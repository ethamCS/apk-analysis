package org.bouncycastle.jcajce.provider.asymmetric.x509;

import ak.q;
import eh.a;
import fh.c;
import gg.i;
import gg.p;
import gg.v;
import hh.m;
import hh.o0;
import hh.u;
import hh.w;
import hh.x;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class X509CRLEntryObject extends X509CRLEntry {

    /* renamed from: c */
    private o0.b f18686c;
    private c certificateIssuer;
    private volatile int hashValue;
    private volatile boolean hashValueSet;

    protected X509CRLEntryObject(o0.b bVar) {
        this.f18686c = bVar;
        this.certificateIssuer = null;
    }

    public X509CRLEntryObject(o0.b bVar, boolean z10, c cVar) {
        this.f18686c = bVar;
        this.certificateIssuer = loadCertificateIssuer(z10, cVar);
    }

    private u getExtension(v vVar) {
        hh.v l10 = this.f18686c.l();
        if (l10 != null) {
            return l10.l(vVar);
        }
        return null;
    }

    private Set getExtensionOIDs(boolean z10) {
        hh.v l10 = this.f18686c.l();
        if (l10 != null) {
            HashSet hashSet = new HashSet();
            Enumeration o10 = l10.o();
            while (o10.hasMoreElements()) {
                v vVar = (v) o10.nextElement();
                if (z10 == l10.l(vVar).r()) {
                    hashSet.add(vVar.H());
                }
            }
            return hashSet;
        }
        return null;
    }

    private c loadCertificateIssuer(boolean z10, c cVar) {
        if (!z10) {
            return null;
        }
        u extension = getExtension(u.f12050f4);
        if (extension == null) {
            return cVar;
        }
        try {
            w[] o10 = x.n(extension.q()).o();
            for (int i10 = 0; i10 < o10.length; i10++) {
                if (o10[i10].q() == 4) {
                    return c.n(o10[i10].o());
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509CRLEntryObject)) {
            return super.equals(this);
        }
        X509CRLEntryObject x509CRLEntryObject = (X509CRLEntryObject) obj;
        if (this.hashValueSet && x509CRLEntryObject.hashValueSet && this.hashValue != x509CRLEntryObject.hashValue) {
            return false;
        }
        return this.f18686c.equals(x509CRLEntryObject.f18686c);
    }

    @Override // java.security.cert.X509CRLEntry
    public X500Principal getCertificateIssuer() {
        if (this.certificateIssuer == null) {
            return null;
        }
        try {
            return new X500Principal(this.certificateIssuer.getEncoded());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() {
        try {
            return this.f18686c.k("DER");
        } catch (IOException e10) {
            throw new CRLException(e10.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        u extension = getExtension(new v(str));
        if (extension != null) {
            try {
                return extension.n().getEncoded();
            } catch (Exception e10) {
                throw new IllegalStateException("Exception encoding: " + e10.toString());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return this.f18686c.n().l();
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.f18686c.o().G();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.f18686c.l() != null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.X509CRLEntry
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = super.hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        Object n10;
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        stringBuffer.append("      userCertificate: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(d10);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(d10);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(d10);
        hh.v l10 = this.f18686c.l();
        if (l10 != null) {
            Enumeration o10 = l10.o();
            if (o10.hasMoreElements()) {
                String str = "   crlEntryExtensions:";
                loop0: while (true) {
                    stringBuffer.append(str);
                    while (true) {
                        stringBuffer.append(d10);
                        while (o10.hasMoreElements()) {
                            v vVar = (v) o10.nextElement();
                            u l11 = l10.l(vVar);
                            if (l11.n() != null) {
                                p pVar = new p(l11.n().F());
                                stringBuffer.append("                       critical(");
                                stringBuffer.append(l11.r());
                                stringBuffer.append(") ");
                                try {
                                    if (vVar.s(u.f12045a4)) {
                                        n10 = m.l(i.E(pVar.s()));
                                    } else if (vVar.s(u.f12050f4)) {
                                        stringBuffer.append("Certificate issuer: ");
                                        n10 = x.n(pVar.s());
                                    } else {
                                        stringBuffer.append(vVar.H());
                                        stringBuffer.append(" value = ");
                                        stringBuffer.append(a.c(pVar.s()));
                                        stringBuffer.append(d10);
                                    }
                                    stringBuffer.append(n10);
                                    stringBuffer.append(d10);
                                } catch (Exception unused) {
                                    stringBuffer.append(vVar.H());
                                    stringBuffer.append(" value = ");
                                    str = "*****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
