package ek;

import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes3.dex */
public class d extends PKIXParameters {

    /* renamed from: d */
    private ak.n f9696d;

    /* renamed from: q */
    private boolean f9697q;
    private int X3 = 0;
    private boolean Y3 = false;

    /* renamed from: c */
    private List f9695c = new ArrayList();

    /* renamed from: x */
    private List f9698x = new ArrayList();

    /* renamed from: y */
    private Set f9699y = new HashSet();
    private Set U3 = new HashSet();
    private Set V3 = new HashSet();
    private Set W3 = new HashSet();

    public d(Set set) {
        super(set);
    }

    public List a() {
        return Collections.unmodifiableList(this.f9698x);
    }

    public Set c() {
        return Collections.unmodifiableSet(this.W3);
    }

    @Override // java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public Object clone() {
        try {
            d dVar = new d(getTrustAnchors());
            dVar.j(this);
            return dVar;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    public Set d() {
        return Collections.unmodifiableSet(this.U3);
    }

    public Set e() {
        return Collections.unmodifiableSet(this.V3);
    }

    public List f() {
        return Collections.unmodifiableList(new ArrayList(this.f9695c));
    }

    public ak.n g() {
        ak.n nVar = this.f9696d;
        if (nVar != null) {
            return (ak.n) nVar.clone();
        }
        return null;
    }

    public int h() {
        return this.X3;
    }

    public boolean i() {
        return this.Y3;
    }

    public void j(PKIXParameters pKIXParameters) {
        setDate(pKIXParameters.getDate());
        setCertPathCheckers(pKIXParameters.getCertPathCheckers());
        setCertStores(pKIXParameters.getCertStores());
        setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
        setRevocationEnabled(pKIXParameters.isRevocationEnabled());
        setInitialPolicies(pKIXParameters.getInitialPolicies());
        setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
        setSigProvider(pKIXParameters.getSigProvider());
        setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            setTrustAnchors(pKIXParameters.getTrustAnchors());
            if (!(pKIXParameters instanceof d)) {
                return;
            }
            d dVar = (d) pKIXParameters;
            this.X3 = dVar.X3;
            this.Y3 = dVar.Y3;
            this.f9697q = dVar.f9697q;
            ak.n nVar = dVar.f9696d;
            this.f9696d = nVar == null ? null : (ak.n) nVar.clone();
            this.f9695c = new ArrayList(dVar.f9695c);
            this.f9698x = new ArrayList(dVar.f9698x);
            this.f9699y = new HashSet(dVar.f9699y);
            this.V3 = new HashSet(dVar.V3);
            this.U3 = new HashSet(dVar.U3);
            this.W3 = new HashSet(dVar.W3);
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    public void k(ak.n nVar) {
        this.f9696d = nVar != null ? (ak.n) nVar.clone() : null;
    }

    @Override // java.security.cert.PKIXParameters
    public void setCertStores(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                addCertStore((CertStore) it.next());
            }
        }
    }

    @Override // java.security.cert.PKIXParameters
    public void setTargetCertConstraints(CertSelector certSelector) {
        super.setTargetCertConstraints(certSelector);
        this.f9696d = certSelector != null ? k.a((X509CertSelector) certSelector) : null;
    }
}
