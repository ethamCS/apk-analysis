package cd;

import hc.t;
import java.io.InputStream;
import pd.o;
/* loaded from: classes.dex */
public final class g implements o {

    /* renamed from: a */
    private final ClassLoader f6437a;

    /* renamed from: b */
    private final le.d f6438b = new le.d();

    public g(ClassLoader classLoader) {
        t.e(classLoader, "classLoader");
        this.f6437a = classLoader;
    }

    private final o.a d(String str) {
        f a10;
        Class<?> a11 = e.a(this.f6437a, str);
        if (a11 == null || (a10 = f.f6434c.a(a11)) == null) {
            return null;
        }
        return new o.a.b(a10, null, 2, null);
    }

    @Override // pd.o
    public o.a a(nd.g gVar) {
        String b10;
        t.e(gVar, "javaClass");
        wd.c d10 = gVar.d();
        if (d10 == null || (b10 = d10.b()) == null) {
            return null;
        }
        return d(b10);
    }

    @Override // pd.o
    public o.a b(wd.b bVar) {
        String b10;
        t.e(bVar, "classId");
        b10 = h.b(bVar);
        return d(b10);
    }

    @Override // ke.u
    public InputStream c(wd.c cVar) {
        t.e(cVar, "packageFqName");
        if (!cVar.i(uc.k.f23457q)) {
            return null;
        }
        return this.f6438b.a(le.a.f15958n.n(cVar));
    }
}
