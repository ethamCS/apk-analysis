package ek;

import gg.d0;
import hh.u;
import hh.v;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public class q implements h {

    /* renamed from: c */
    private hh.f f9718c;

    /* renamed from: d */
    private Date f9719d;

    /* renamed from: q */
    private Date f9720q;

    q(hh.f fVar) {
        this.f9718c = fVar;
        try {
            this.f9720q = fVar.l().l().m().G();
            this.f9719d = fVar.l().l().n().G();
        } catch (ParseException unused) {
            throw new IOException("invalid data structure in certificate!");
        }
    }

    public q(InputStream inputStream) {
        this(f(inputStream));
    }

    public q(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    private Set a(boolean z10) {
        v n10 = this.f9718c.l().n();
        if (n10 != null) {
            HashSet hashSet = new HashSet();
            Enumeration o10 = n10.o();
            while (o10.hasMoreElements()) {
                gg.v vVar = (gg.v) o10.nextElement();
                if (n10.l(vVar).r() == z10) {
                    hashSet.add(vVar.H());
                }
            }
            return hashSet;
        }
        return null;
    }

    private static hh.f f(InputStream inputStream) {
        try {
            return hh.f.m(new gg.p(inputStream).s());
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IOException("exception decoding certificate structure: " + e11.toString());
        }
    }

    @Override // ek.h
    public a b() {
        return new a((d0) this.f9718c.l().o().b());
    }

    @Override // ek.h
    public f[] c(String str) {
        d0 m10 = this.f9718c.l().m();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 != m10.size(); i10++) {
            f fVar = new f(m10.G(i10));
            if (fVar.l().equals(str)) {
                arrayList.add(fVar);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    @Override // ek.h
    public void checkValidity(Date date) {
        if (date.after(getNotAfter())) {
            throw new CertificateExpiredException("certificate expired on " + getNotAfter());
        } else if (!date.before(d())) {
        } else {
            throw new CertificateNotYetValidException("certificate not valid till " + d());
        }
    }

    public Date d() {
        return this.f9719d;
    }

    @Override // ek.h
    public b e() {
        return new b(this.f9718c.l().r());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        try {
            return ak.a.c(getEncoded(), ((h) obj).getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return a(true);
    }

    @Override // ek.h
    public byte[] getEncoded() {
        return this.f9718c.getEncoded();
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        u l10;
        v n10 = this.f9718c.l().n();
        if (n10 == null || (l10 = n10.l(new gg.v(str))) == null) {
            return null;
        }
        try {
            return l10.n().k("DER");
        } catch (Exception e10) {
            throw new RuntimeException("error encoding " + e10.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return a(false);
    }

    @Override // ek.h
    public Date getNotAfter() {
        return this.f9720q;
    }

    @Override // ek.h
    public BigInteger getSerialNumber() {
        return this.f9718c.l().s().G();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        try {
            return ak.a.F(getEncoded());
        } catch (IOException unused) {
            return 0;
        }
    }
}
