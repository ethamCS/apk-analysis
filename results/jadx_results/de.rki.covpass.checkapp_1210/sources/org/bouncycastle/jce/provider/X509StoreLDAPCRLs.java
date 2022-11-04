package org.bouncycastle.jce.provider;

import ak.n;
import ek.i;
import ek.o;
import gk.a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import oi.d;
/* loaded from: classes3.dex */
public class X509StoreLDAPCRLs extends o {
    private a helper;

    @Override // ek.o
    public Collection engineGetMatches(n nVar) {
        Collection collection;
        if (!(nVar instanceof i)) {
            return Collections.EMPTY_SET;
        }
        i iVar = (i) nVar;
        HashSet hashSet = new HashSet();
        if (iVar.e()) {
            collection = this.helper.u(iVar);
        } else {
            hashSet.addAll(this.helper.u(iVar));
            hashSet.addAll(this.helper.l(iVar));
            hashSet.addAll(this.helper.n(iVar));
            hashSet.addAll(this.helper.p(iVar));
            collection = this.helper.s(iVar);
        }
        hashSet.addAll(collection);
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
