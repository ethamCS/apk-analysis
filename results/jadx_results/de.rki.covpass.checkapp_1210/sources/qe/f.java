package qe;

import hc.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ub.u;
import ub.x0;
import ub.y0;
import xc.m;
import xc.u0;
import xc.z0;
/* loaded from: classes3.dex */
public class f implements he.h {

    /* renamed from: a */
    private final g f19824a;

    /* renamed from: b */
    private final String f19825b;

    public f(g gVar, String... strArr) {
        t.e(gVar, "kind");
        t.e(strArr, "formatParams");
        this.f19824a = gVar;
        String g10 = gVar.g();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(g10, Arrays.copyOf(copyOf, copyOf.length));
        t.d(format, "format(this, *args)");
        this.f19825b = format;
    }

    @Override // he.h
    public Set<wd.f> c() {
        Set<wd.f> b10;
        b10 = y0.b();
        return b10;
    }

    @Override // he.h
    public Set<wd.f> d() {
        Set<wd.f> b10;
        b10 = y0.b();
        return b10;
    }

    @Override // he.k
    public Collection<m> e(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        List h10;
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        h10 = u.h();
        return h10;
    }

    @Override // he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        String format = String.format(b.ERROR_CLASS.g(), Arrays.copyOf(new Object[]{fVar}, 1));
        t.d(format, "format(this, *args)");
        wd.f o10 = wd.f.o(format);
        t.d(o10, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new a(o10);
    }

    @Override // he.h
    public Set<wd.f> g() {
        Set<wd.f> b10;
        b10 = y0.b();
        return b10;
    }

    /* renamed from: h */
    public Set<z0> b(wd.f fVar, fd.b bVar) {
        Set<z0> a10;
        t.e(fVar, "name");
        t.e(bVar, "location");
        a10 = x0.a(new c(k.f19894a.h()));
        return a10;
    }

    /* renamed from: i */
    public Set<u0> a(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return k.f19894a.j();
    }

    public final String j() {
        return this.f19825b;
    }

    public String toString() {
        return "ErrorScope{" + this.f19825b + '}';
    }
}
