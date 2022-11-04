package yc;

import hc.t;
/* loaded from: classes.dex */
public final class i {
    public static final g a(g gVar, g gVar2) {
        t.e(gVar, "first");
        t.e(gVar2, "second");
        return gVar.isEmpty() ? gVar2 : gVar2.isEmpty() ? gVar : new k(gVar, gVar2);
    }
}
