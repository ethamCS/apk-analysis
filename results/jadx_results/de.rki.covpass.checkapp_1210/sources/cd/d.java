package cd;

import bf.x;
import dd.w;
import gd.o;
import hc.t;
import java.util.Set;
import nd.u;
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a */
    private final ClassLoader f6433a;

    public d(ClassLoader classLoader) {
        t.e(classLoader, "classLoader");
        this.f6433a = classLoader;
    }

    @Override // gd.o
    public u a(wd.c cVar, boolean z10) {
        t.e(cVar, "fqName");
        return new w(cVar);
    }

    @Override // gd.o
    public Set<String> b(wd.c cVar) {
        t.e(cVar, "packageFqName");
        return null;
    }

    @Override // gd.o
    public nd.g c(o.b bVar) {
        String D;
        t.e(bVar, "request");
        wd.b a10 = bVar.a();
        wd.c h10 = a10.h();
        t.d(h10, "classId.packageFqName");
        String b10 = a10.i().b();
        t.d(b10, "classId.relativeClassName.asString()");
        D = x.D(b10, '.', '$', false, 4, null);
        if (!h10.d()) {
            D = h10.b() + '.' + D;
        }
        Class<?> a11 = e.a(this.f6433a, D);
        if (a11 != null) {
            return new dd.l(a11);
        }
        return null;
    }
}
