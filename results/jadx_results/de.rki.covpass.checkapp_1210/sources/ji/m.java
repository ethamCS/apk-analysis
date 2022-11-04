package ji;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;
/* loaded from: classes3.dex */
public class m<T extends CRL> implements ak.n<T> {
    private final boolean U3;

    /* renamed from: c */
    private final CRLSelector f14400c;

    /* renamed from: d */
    private final boolean f14401d;

    /* renamed from: q */
    private final boolean f14402q;

    /* renamed from: x */
    private final BigInteger f14403x;

    /* renamed from: y */
    private final byte[] f14404y;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final CRLSelector f14405a;

        /* renamed from: b */
        private boolean f14406b = false;

        /* renamed from: c */
        private boolean f14407c = false;

        /* renamed from: d */
        private BigInteger f14408d = null;

        /* renamed from: e */
        private byte[] f14409e = null;

        /* renamed from: f */
        private boolean f14410f = false;

        public b(CRLSelector cRLSelector) {
            this.f14405a = (CRLSelector) cRLSelector.clone();
        }

        public m<? extends CRL> g() {
            return new m<>(this);
        }

        public b h(boolean z10) {
            this.f14407c = z10;
            return this;
        }

        public void i(byte[] bArr) {
            this.f14409e = ak.a.h(bArr);
        }

        public void j(boolean z10) {
            this.f14410f = z10;
        }

        public void k(BigInteger bigInteger) {
            this.f14408d = bigInteger;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends X509CRLSelector {

        /* renamed from: c */
        private final m f14411c;

        c(m mVar) {
            this.f14411c = mVar;
            if (mVar.f14400c instanceof X509CRLSelector) {
                X509CRLSelector x509CRLSelector = (X509CRLSelector) mVar.f14400c;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }

        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
        public boolean match(CRL crl) {
            m mVar = this.f14411c;
            return mVar == null ? crl != null : mVar.z(crl);
        }
    }

    private m(b bVar) {
        this.f14400c = bVar.f14405a;
        this.f14401d = bVar.f14406b;
        this.f14402q = bVar.f14407c;
        this.f14403x = bVar.f14408d;
        this.f14404y = bVar.f14409e;
        this.U3 = bVar.f14410f;
    }

    public static Collection<? extends CRL> c(m mVar, CertStore certStore) {
        return certStore.getCRLs(new c(mVar));
    }

    @Override // ak.n
    public Object clone() {
        return this;
    }

    public X509Certificate d() {
        CRLSelector cRLSelector = this.f14400c;
        if (cRLSelector instanceof X509CRLSelector) {
            return ((X509CRLSelector) cRLSelector).getCertificateChecking();
        }
        return null;
    }

    public boolean e() {
        return this.f14402q;
    }

    public boolean f() {
        return this.f14401d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (ak.a.c(r0, r1) == false) goto L32;
     */
    /* renamed from: match */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z(java.security.cert.CRL r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.security.cert.X509CRL
            if (r0 != 0) goto Lb
        L4:
            java.security.cert.CRLSelector r0 = r4.f14400c
            boolean r5 = r0.match(r5)
            return r5
        Lb:
            r0 = r5
            java.security.cert.X509CRL r0 = (java.security.cert.X509CRL) r0
            r1 = 0
            r2 = 0
            gg.v r3 = hh.u.f12048d4     // Catch: java.lang.Exception -> L69
            java.lang.String r3 = r3.H()     // Catch: java.lang.Exception -> L69
            byte[] r3 = r0.getExtensionValue(r3)     // Catch: java.lang.Exception -> L69
            if (r3 == 0) goto L28
            gg.w r1 = gg.w.E(r3)     // Catch: java.lang.Exception -> L69
            byte[] r1 = r1.F()     // Catch: java.lang.Exception -> L69
            gg.q r1 = gg.q.E(r1)     // Catch: java.lang.Exception -> L69
        L28:
            boolean r3 = r4.f()
            if (r3 == 0) goto L31
            if (r1 != 0) goto L31
            return r2
        L31:
            boolean r3 = r4.e()
            if (r3 == 0) goto L3a
            if (r1 == 0) goto L3a
            return r2
        L3a:
            if (r1 == 0) goto L4e
            java.math.BigInteger r3 = r4.f14403x
            if (r3 == 0) goto L4e
            java.math.BigInteger r1 = r1.F()
            java.math.BigInteger r3 = r4.f14403x
            int r1 = r1.compareTo(r3)
            r3 = 1
            if (r1 != r3) goto L4e
            return r2
        L4e:
            boolean r1 = r4.U3
            if (r1 == 0) goto L4
            gg.v r1 = hh.u.f12049e4
            java.lang.String r1 = r1.H()
            byte[] r0 = r0.getExtensionValue(r1)
            byte[] r1 = r4.f14404y
            if (r1 != 0) goto L63
            if (r0 == 0) goto L4
            return r2
        L63:
            boolean r0 = ak.a.c(r0, r1)
            if (r0 != 0) goto L4
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ji.m.z(java.security.cert.CRL):boolean");
    }
}
