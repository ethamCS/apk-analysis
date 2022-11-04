package u3;

import c4.q;
import f3.g;
import f3.j;
import f3.k;
import f3.l;
/* loaded from: classes.dex */
public class f {
    public static <T extends q<T>> f3.d<T> a(a aVar, Class<T> cls) {
        if (aVar == null) {
            aVar = new a();
        }
        aVar.b();
        k kVar = null;
        j jVar = aVar.f23116q ? new j() : null;
        c cVar = aVar.f23118y;
        if (cVar != null) {
            kVar = c(cVar, cls);
        }
        return new f3.d<>(b(aVar.f23114c, cls), jVar, kVar, aVar.f23115d, aVar.f23117x);
    }

    public static <T extends q<T>> g<T> b(b bVar, Class<T> cls) {
        bVar.b();
        k2.d a10 = e.a(bVar.f23121q);
        h2.c a11 = q3.e.a();
        a11.i(bVar.f23120d);
        return new g<>(a10, bVar.U3, bVar.V3, bVar.f23119c, bVar.f23122x, bVar.f23123y, a11, cls);
    }

    public static <T extends q<T>> k<T> c(c cVar, Class<T> cls) {
        return new l(cVar.f23124c, cVar.f23125d, cVar.f23126q, cVar.f23127x, cVar.f23128y, cVar.U3, cls);
    }
}
