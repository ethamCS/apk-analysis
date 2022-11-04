package p3;

import c4.q;
import p2.x;
import q3.f;
/* loaded from: classes.dex */
public class b {
    public static <T extends q<T>> g2.a<T> a(a aVar, Class<T> cls) {
        if (aVar == null) {
            aVar = new a();
        }
        aVar.b();
        g2.a<T> aVar2 = new g2.a<>(f.q(aVar.f18880c, cls), new x(u3.f.a(aVar.f18881d, cls)), aVar.f18884y, aVar.U3, false, cls);
        aVar2.c().c(aVar.f18883x);
        aVar2.a().f18838b = aVar.V3;
        return aVar2;
    }
}
