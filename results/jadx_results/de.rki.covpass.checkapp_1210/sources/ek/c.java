package ek;

import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public class c extends d {
    private int Z3 = 5;

    /* renamed from: a4 */
    private Set f9694a4 = Collections.EMPTY_SET;

    public c(Set set, ak.n nVar) {
        super(set);
        k(nVar);
    }

    @Override // ek.d, java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public Object clone() {
        try {
            c cVar = new c(getTrustAnchors(), g());
            cVar.j(this);
            return cVar;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    @Override // ek.d
    public void j(PKIXParameters pKIXParameters) {
        super.j(pKIXParameters);
        if (pKIXParameters instanceof c) {
            c cVar = (c) pKIXParameters;
            this.Z3 = cVar.Z3;
            this.f9694a4 = new HashSet(cVar.f9694a4);
        }
        if (pKIXParameters instanceof PKIXBuilderParameters) {
            this.Z3 = ((PKIXBuilderParameters) pKIXParameters).getMaxPathLength();
        }
    }

    public Set l() {
        return Collections.unmodifiableSet(this.f9694a4);
    }

    public int m() {
        return this.Z3;
    }
}
