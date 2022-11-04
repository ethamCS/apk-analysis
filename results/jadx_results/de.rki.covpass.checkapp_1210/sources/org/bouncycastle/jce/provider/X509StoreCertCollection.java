package org.bouncycastle.jce.provider;

import ak.c;
import ak.n;
import ek.m;
import ek.o;
import java.util.Collection;
/* loaded from: classes3.dex */
public class X509StoreCertCollection extends o {
    private c _store;

    @Override // ek.o
    public Collection engineGetMatches(n nVar) {
        return this._store.getMatches(nVar);
    }

    @Override // ek.o
    public void engineInit(ek.n nVar) {
        if (nVar instanceof m) {
            this._store = new c(((m) nVar).a());
            return;
        }
        throw new IllegalArgumentException(nVar.toString());
    }
}
