package g.z.a;

import d.a.b.e;
import d.a.b.t;
import e.b0;
import e.h0;
import g.h;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
final class b<T> implements h<T, h0> {

    /* renamed from: c */
    private static final b0 f4652c = b0.b("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f4653d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final e f4654a;

    /* renamed from: b */
    private final t<T> f4655b;

    public b(e eVar, t<T> tVar) {
        this.f4654a = eVar;
        this.f4655b = tVar;
    }

    /* renamed from: b */
    public h0 a(T t) {
        f.c cVar = new f.c();
        d.a.b.y.c p = this.f4654a.p(new OutputStreamWriter(cVar.m0(), f4653d));
        this.f4655b.d(p, t);
        p.close();
        return h0.c(f4652c, cVar.p0());
    }
}
