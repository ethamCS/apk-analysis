package m3;

import c4.e0;
import c4.p;
import c4.q;
import c4.r;
import c4.t;
import c4.w;
import c4.x;
import c4.z;
/* loaded from: classes.dex */
public class i {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Class<?> cls) {
        return cls == c4.e.class ? c4.l.class : cls == c4.d.class ? c4.g.class : cls == x.class ? e0.class : cls == w.class ? z.class : cls;
    }

    public static ll.d b(t<?> tVar) {
        boolean p10 = tVar.c().p();
        int j10 = tVar.c().j();
        return p10 ? j10 < 64 ? new ll.d(g.f16265a) : new ll.d(h.f16266a) : j10 < 64 ? new ll.d(e.f16263a) : new ll.d(f.f16264a);
    }

    public static <T extends r<T>> T c(Class<T> cls, int i10, int i11, int i12) {
        return (T) r.I((Class) a(cls), i10, i11, i12);
    }

    public static <T extends q> T d(p pVar, int i10, int i11) {
        return (T) e(t.g(t.b.GRAY, pVar), i10, i11);
    }

    public static <T extends q<T>> T e(Class<T> cls, int i10, int i11) {
        return (T) q.I((Class) a(cls), i10, i11);
    }
}
