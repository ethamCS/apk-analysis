package ek;

import hh.u;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
/* loaded from: classes3.dex */
public class i extends X509CRLSelector implements ak.n {
    private h U3;

    /* renamed from: c */
    private boolean f9706c = false;

    /* renamed from: d */
    private boolean f9707d = false;

    /* renamed from: q */
    private BigInteger f9708q = null;

    /* renamed from: x */
    private byte[] f9709x = null;

    /* renamed from: y */
    private boolean f9710y = false;

    public static i c(X509CRLSelector x509CRLSelector) {
        if (x509CRLSelector != null) {
            i iVar = new i();
            iVar.setCertificateChecking(x509CRLSelector.getCertificateChecking());
            iVar.setDateAndTime(x509CRLSelector.getDateAndTime());
            try {
                iVar.setIssuerNames(x509CRLSelector.getIssuerNames());
                iVar.setIssuers(x509CRLSelector.getIssuers());
                iVar.setMaxCRLNumber(x509CRLSelector.getMaxCRL());
                iVar.setMinCRLNumber(x509CRLSelector.getMinCRL());
                return iVar;
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        throw new IllegalArgumentException("cannot create from null selector");
    }

    public h a() {
        return this.U3;
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector, ak.n
    public Object clone() {
        i c10 = c(this);
        c10.f9706c = this.f9706c;
        c10.f9707d = this.f9707d;
        c10.f9708q = this.f9708q;
        c10.U3 = this.U3;
        c10.f9710y = this.f9710y;
        c10.f9709x = ak.a.h(this.f9709x);
        return c10;
    }

    public boolean d() {
        return this.f9707d;
    }

    public boolean e() {
        return this.f9706c;
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
    public boolean match(CRL crl) {
        return z(crl);
    }

    @Override // ak.n
    public boolean z(Object obj) {
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        X509CRL x509crl = (X509CRL) obj;
        gg.q qVar = null;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(u.f12048d4.H());
            if (extensionValue != null) {
                qVar = gg.q.E(fk.a.a(extensionValue));
            }
            if (e() && qVar == null) {
                return false;
            }
            if (d() && qVar != null) {
                return false;
            }
            if (qVar != null && this.f9708q != null && qVar.F().compareTo(this.f9708q) == 1) {
                return false;
            }
            if (this.f9710y) {
                byte[] extensionValue2 = x509crl.getExtensionValue(u.f12049e4.H());
                byte[] bArr = this.f9709x;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!ak.a.c(extensionValue2, bArr)) {
                    return false;
                }
            }
            return super.match(x509crl);
        } catch (Exception unused) {
            return false;
        }
    }
}
