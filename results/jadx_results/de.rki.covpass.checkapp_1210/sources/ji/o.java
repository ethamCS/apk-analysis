package ji;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.Date;
/* loaded from: classes3.dex */
public class o {

    /* renamed from: a */
    private final s f14412a;

    /* renamed from: b */
    private final Date f14413b;

    /* renamed from: c */
    private final CertPath f14414c;

    /* renamed from: d */
    private final int f14415d;

    /* renamed from: e */
    private final X509Certificate f14416e;

    /* renamed from: f */
    private final PublicKey f14417f;

    public o(s sVar, Date date, CertPath certPath, int i10, X509Certificate x509Certificate, PublicKey publicKey) {
        this.f14412a = sVar;
        this.f14413b = date;
        this.f14414c = certPath;
        this.f14415d = i10;
        this.f14416e = x509Certificate;
        this.f14417f = publicKey;
    }

    public CertPath a() {
        return this.f14414c;
    }

    public int b() {
        return this.f14415d;
    }

    public s c() {
        return this.f14412a;
    }

    public X509Certificate d() {
        return this.f14416e;
    }

    public Date e() {
        return new Date(this.f14413b.getTime());
    }

    public PublicKey f() {
        return this.f14417f;
    }
}
