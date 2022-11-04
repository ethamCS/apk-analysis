package ek;

import gg.d0;
import hh.w;
import hh.x;
import hh.z;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
/* loaded from: classes3.dex */
public class a implements CertSelector, ak.n {

    /* renamed from: c */
    final z f9692c;

    public a(d0 d0Var) {
        this.f9692c = z.n(d0Var);
    }

    private Object[] f(w[] wVarArr) {
        ArrayList arrayList = new ArrayList(wVarArr.length);
        for (int i10 = 0; i10 != wVarArr.length; i10++) {
            if (wVarArr[i10].q() == 4) {
                try {
                    arrayList.add(new X500Principal(wVarArr[i10].o().b().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private Principal[] h(x xVar) {
        Object[] f10 = f(xVar.o());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 != f10.length; i10++) {
            if (f10[i10] instanceof Principal) {
                arrayList.add(f10[i10]);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    private boolean j(oi.e eVar, x xVar) {
        w[] o10 = xVar.o();
        for (int i10 = 0; i10 != o10.length; i10++) {
            w wVar = o10[i10];
            if (wVar.q() == 4) {
                try {
                    if (new oi.e(wVar.o().b().getEncoded()).equals(eVar)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public String a() {
        if (this.f9692c.o() != null) {
            return this.f9692c.o().l().l().H();
        }
        return null;
    }

    public int c() {
        if (this.f9692c.o() != null) {
            return this.f9692c.o().m().G();
        }
        return -1;
    }

    @Override // java.security.cert.CertSelector, ak.n
    public Object clone() {
        return new a((d0) this.f9692c.b());
    }

    public Principal[] d() {
        if (this.f9692c.m() != null) {
            return h(this.f9692c.m());
        }
        return null;
    }

    public Principal[] e() {
        if (this.f9692c.l() != null) {
            return h(this.f9692c.l().n());
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return this.f9692c.equals(((a) obj).f9692c);
        }
        return false;
    }

    public byte[] g() {
        if (this.f9692c.o() != null) {
            return this.f9692c.o().q().D();
        }
        return null;
    }

    public int hashCode() {
        return this.f9692c.hashCode();
    }

    public BigInteger i() {
        if (this.f9692c.l() != null) {
            return this.f9692c.l().o().G();
        }
        return null;
    }

    @Override // java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (this.f9692c.l() != null) {
            return this.f9692c.l().o().J(x509Certificate.getSerialNumber()) && j(oi.c.a(x509Certificate), this.f9692c.l().n());
        } else if (this.f9692c.m() != null && j(oi.c.b(x509Certificate), this.f9692c.m())) {
            return true;
        } else {
            if (this.f9692c.o() != null) {
                MessageDigest messageDigest = MessageDigest.getInstance(a(), BouncyCastleProvider.PROVIDER_NAME);
                int c10 = c();
                if (c10 == 0) {
                    messageDigest.update(certificate.getPublicKey().getEncoded());
                } else if (c10 == 1) {
                    messageDigest.update(certificate.getEncoded());
                }
                ak.a.c(messageDigest.digest(), g());
            }
            return false;
        }
    }

    @Override // ak.n
    public boolean z(Object obj) {
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        return match((Certificate) obj);
    }
}
