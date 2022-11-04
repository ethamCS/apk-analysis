package ek;

import hh.v0;
import hh.w;
import hh.x;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes3.dex */
public class b implements CertSelector, ak.n {

    /* renamed from: c */
    final gg.g f9693c;

    public b(hh.c cVar) {
        this.f9693c = cVar.m();
    }

    private Object[] a() {
        gg.g gVar = this.f9693c;
        w[] o10 = (gVar instanceof v0 ? ((v0) gVar).o() : (x) gVar).o();
        ArrayList arrayList = new ArrayList(o10.length);
        for (int i10 = 0; i10 != o10.length; i10++) {
            if (o10[i10].q() == 4) {
                try {
                    arrayList.add(new X500Principal(o10[i10].o().b().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private boolean d(X500Principal x500Principal, x xVar) {
        w[] o10 = xVar.o();
        for (int i10 = 0; i10 != o10.length; i10++) {
            w wVar = o10[i10];
            if (wVar.q() == 4) {
                try {
                    if (new X500Principal(wVar.o().b().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public Principal[] c() {
        Object[] a10 = a();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 != a10.length; i10++) {
            if (a10[i10] instanceof Principal) {
                arrayList.add(a10[i10]);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    @Override // java.security.cert.CertSelector, ak.n
    public Object clone() {
        return new b(hh.c.l(this.f9693c));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f9693c.equals(((b) obj).f9693c);
        }
        return false;
    }

    public int hashCode() {
        return this.f9693c.hashCode();
    }

    @Override // java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        gg.g gVar = this.f9693c;
        if (gVar instanceof v0) {
            v0 v0Var = (v0) gVar;
            if (v0Var.l() != null) {
                return v0Var.l().o().J(x509Certificate.getSerialNumber()) && d(x509Certificate.getIssuerX500Principal(), v0Var.l().n());
            }
            if (d(x509Certificate.getSubjectX500Principal(), v0Var.o())) {
                return true;
            }
        } else {
            if (d(x509Certificate.getSubjectX500Principal(), (x) gVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // ak.n
    public boolean z(Object obj) {
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        return match((Certificate) obj);
    }
}
