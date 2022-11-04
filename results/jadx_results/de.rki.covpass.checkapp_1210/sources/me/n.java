package me;

import hc.t;
import java.util.List;
/* loaded from: classes3.dex */
public final class n extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ne.n nVar, gc.a<? extends List<? extends yc.c>> aVar) {
        super(nVar, aVar);
        t.e(nVar, "storageManager");
        t.e(aVar, "compute");
    }

    @Override // me.a, yc.g
    public boolean isEmpty() {
        return false;
    }
}
