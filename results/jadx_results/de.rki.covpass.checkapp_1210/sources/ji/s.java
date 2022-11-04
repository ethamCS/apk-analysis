package ji;

import hh.w;
import java.security.cert.CertPathParameters;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ji.q;
/* loaded from: classes3.dex */
public class s implements CertPathParameters {
    private final Map<w, p> U3;
    private final List<l> V3;
    private final Map<w, l> W3;
    private final boolean X3;
    private final boolean Y3;
    private final int Z3;

    /* renamed from: a4 */
    private final Set<TrustAnchor> f14427a4;

    /* renamed from: c */
    private final PKIXParameters f14428c;

    /* renamed from: d */
    private final q f14429d;

    /* renamed from: q */
    private final Date f14430q;

    /* renamed from: x */
    private final Date f14431x;

    /* renamed from: y */
    private final List<p> f14432y;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final PKIXParameters f14433a;

        /* renamed from: b */
        private final Date f14434b;

        /* renamed from: c */
        private final Date f14435c;

        /* renamed from: d */
        private q f14436d;

        /* renamed from: e */
        private List<p> f14437e;

        /* renamed from: f */
        private Map<w, p> f14438f;

        /* renamed from: g */
        private List<l> f14439g;

        /* renamed from: h */
        private Map<w, l> f14440h;

        /* renamed from: i */
        private boolean f14441i;

        /* renamed from: j */
        private int f14442j;

        /* renamed from: k */
        private boolean f14443k;

        /* renamed from: l */
        private Set<TrustAnchor> f14444l;

        public b(PKIXParameters pKIXParameters) {
            this.f14437e = new ArrayList();
            this.f14438f = new HashMap();
            this.f14439g = new ArrayList();
            this.f14440h = new HashMap();
            this.f14442j = 0;
            this.f14443k = false;
            this.f14433a = (PKIXParameters) pKIXParameters.clone();
            CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
            if (targetCertConstraints != null) {
                this.f14436d = new q.b(targetCertConstraints).a();
            }
            Date date = pKIXParameters.getDate();
            this.f14434b = date;
            this.f14435c = date == null ? new Date() : date;
            this.f14441i = pKIXParameters.isRevocationEnabled();
            this.f14444l = pKIXParameters.getTrustAnchors();
        }

        public b(s sVar) {
            this.f14437e = new ArrayList();
            this.f14438f = new HashMap();
            this.f14439g = new ArrayList();
            this.f14440h = new HashMap();
            this.f14442j = 0;
            this.f14443k = false;
            this.f14433a = sVar.f14428c;
            this.f14434b = sVar.f14430q;
            this.f14435c = sVar.f14431x;
            this.f14436d = sVar.f14429d;
            this.f14437e = new ArrayList(sVar.f14432y);
            this.f14438f = new HashMap(sVar.U3);
            this.f14439g = new ArrayList(sVar.V3);
            this.f14440h = new HashMap(sVar.W3);
            this.f14443k = sVar.Y3;
            this.f14442j = sVar.Z3;
            this.f14441i = sVar.F();
            this.f14444l = sVar.y();
        }

        public b m(l lVar) {
            this.f14439g.add(lVar);
            return this;
        }

        public b n(p pVar) {
            this.f14437e.add(pVar);
            return this;
        }

        public s o() {
            return new s(this);
        }

        public void p(boolean z10) {
            this.f14441i = z10;
        }

        public b q(q qVar) {
            this.f14436d = qVar;
            return this;
        }

        public b r(TrustAnchor trustAnchor) {
            this.f14444l = Collections.singleton(trustAnchor);
            return this;
        }

        public b s(boolean z10) {
            this.f14443k = z10;
            return this;
        }

        public b t(int i10) {
            this.f14442j = i10;
            return this;
        }
    }

    private s(b bVar) {
        this.f14428c = bVar.f14433a;
        this.f14430q = bVar.f14434b;
        this.f14431x = bVar.f14435c;
        this.f14432y = Collections.unmodifiableList(bVar.f14437e);
        this.U3 = Collections.unmodifiableMap(new HashMap(bVar.f14438f));
        this.V3 = Collections.unmodifiableList(bVar.f14439g);
        this.W3 = Collections.unmodifiableMap(new HashMap(bVar.f14440h));
        this.f14429d = bVar.f14436d;
        this.X3 = bVar.f14441i;
        this.Y3 = bVar.f14443k;
        this.Z3 = bVar.f14442j;
        this.f14427a4 = Collections.unmodifiableSet(bVar.f14444l);
    }

    public Date A() {
        if (this.f14430q == null) {
            return null;
        }
        return new Date(this.f14430q.getTime());
    }

    public int B() {
        return this.Z3;
    }

    public boolean C() {
        return this.f14428c.isAnyPolicyInhibited();
    }

    public boolean D() {
        return this.f14428c.isExplicitPolicyRequired();
    }

    public boolean E() {
        return this.f14428c.isPolicyMappingInhibited();
    }

    public boolean F() {
        return this.X3;
    }

    public boolean H() {
        return this.Y3;
    }

    @Override // java.security.cert.CertPathParameters
    public Object clone() {
        return this;
    }

    public List<l> l() {
        return this.V3;
    }

    public List m() {
        return this.f14428c.getCertPathCheckers();
    }

    public List<CertStore> o() {
        return this.f14428c.getCertStores();
    }

    public List<p> p() {
        return this.f14432y;
    }

    public Set q() {
        return this.f14428c.getInitialPolicies();
    }

    public Map<w, l> t() {
        return this.W3;
    }

    public Map<w, p> v() {
        return this.U3;
    }

    public String w() {
        return this.f14428c.getSigProvider();
    }

    public q x() {
        return this.f14429d;
    }

    public Set y() {
        return this.f14427a4;
    }
}
