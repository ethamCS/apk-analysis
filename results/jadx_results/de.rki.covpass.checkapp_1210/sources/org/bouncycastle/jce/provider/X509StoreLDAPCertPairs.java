package org.bouncycastle.jce.provider;

import ak.n;
import ek.j;
import ek.o;
import gk.a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import oi.d;
/* loaded from: classes3.dex */
public class X509StoreLDAPCertPairs extends o {
    private a helper;

    @Override // ek.o
    public Collection engineGetMatches(n nVar) {
        if (!(nVar instanceof j)) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.helper.t((j) nVar));
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
