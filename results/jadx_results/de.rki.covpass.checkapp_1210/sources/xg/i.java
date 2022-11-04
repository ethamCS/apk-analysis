package xg;

import gg.a0;
import gg.a2;
import gg.j0;
import gg.t;
import gg.t1;
import gg.w;
/* loaded from: classes3.dex */
public class i extends t implements gg.f {

    /* renamed from: c */
    private gg.g f25634c;

    public i(fh.c cVar) {
        this.f25634c = cVar;
    }

    public i(w wVar) {
        this.f25634c = wVar;
    }

    public static i l(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj instanceof t1) {
            return new i((t1) obj);
        }
        if (!(obj instanceof j0)) {
            return new i(fh.c.n(obj));
        }
        j0 j0Var = (j0) obj;
        return j0Var.Q() == 1 ? new i(fh.c.m(j0Var, true)) : new i(w.D(j0Var, true));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.g gVar = this.f25634c;
        return gVar instanceof w ? new a2(true, 2, gVar) : new a2(true, 1, gVar);
    }

    public byte[] m() {
        gg.g gVar = this.f25634c;
        if (gVar instanceof w) {
            return ((w) gVar).F();
        }
        return null;
    }

    public fh.c n() {
        gg.g gVar = this.f25634c;
        if (gVar instanceof w) {
            return null;
        }
        return fh.c.n(gVar);
    }
}
