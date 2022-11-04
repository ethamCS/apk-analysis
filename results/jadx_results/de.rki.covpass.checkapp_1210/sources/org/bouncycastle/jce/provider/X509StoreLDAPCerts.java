package org.bouncycastle.jce.provider;

import ak.n;
import ek.j;
import ek.k;
import ek.l;
import ek.o;
import gk.a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import oi.d;
/* loaded from: classes3.dex */
public class X509StoreLDAPCerts extends o {
    private a helper;

    private Collection getCertificatesFromCrossCertificatePairs(k kVar) {
        HashSet hashSet = new HashSet();
        j jVar = new j();
        jVar.d(kVar);
        jVar.e(new k());
        HashSet<l> hashSet2 = new HashSet(this.helper.t(jVar));
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (l lVar : hashSet2) {
            if (lVar.a() != null) {
                hashSet3.add(lVar.a());
            }
            if (lVar.b() != null) {
                hashSet4.add(lVar.b());
            }
        }
        hashSet.addAll(hashSet3);
        hashSet.addAll(hashSet4);
        return hashSet;
    }

    @Override // ek.o
    public Collection engineGetMatches(n nVar) {
        Collection x10;
        if (!(nVar instanceof k)) {
            return Collections.EMPTY_SET;
        }
        k kVar = (k) nVar;
        HashSet hashSet = new HashSet();
        if (kVar.getBasicConstraints() <= 0) {
            if (kVar.getBasicConstraints() == -2) {
                x10 = this.helper.x(kVar);
                hashSet.addAll(x10);
                return hashSet;
            }
            hashSet.addAll(this.helper.x(kVar));
        }
        hashSet.addAll(this.helper.q(kVar));
        x10 = getCertificatesFromCrossCertificatePairs(kVar);
        hashSet.addAll(x10);
        return hashSet;
    }

    @Override // ek.o
    public void engineInit(ek.n nVar) {
        if (nVar instanceof d) {
            this.helper = new a((d) nVar);
            return;
        }
        throw new IllegalArgumentException("Initialization parameters must be an instance of " + d.class.getName() + ".");
    }
}
