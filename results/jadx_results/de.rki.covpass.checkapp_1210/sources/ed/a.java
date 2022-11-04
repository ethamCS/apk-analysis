package ed;

import ae.d;
import fd.b;
import fd.c;
import hc.t;
import wd.f;
import xc.e;
import xc.l0;
/* loaded from: classes.dex */
public final class a {
    public static final void a(c cVar, b bVar, e eVar, f fVar) {
        fd.a b10;
        t.e(cVar, "<this>");
        t.e(bVar, "from");
        t.e(eVar, "scopeOwner");
        t.e(fVar, "name");
        if (cVar == c.a.f10155a || (b10 = bVar.b()) == null) {
            return;
        }
        fd.e position = cVar.a() ? b10.getPosition() : fd.e.Companion.a();
        String a10 = b10.a();
        String b11 = d.m(eVar).b();
        t.d(b11, "getFqName(scopeOwner).asString()");
        fd.f fVar2 = fd.f.CLASSIFIER;
        String b12 = fVar.b();
        t.d(b12, "name.asString()");
        cVar.b(a10, position, b11, fVar2, b12);
    }

    public static final void b(c cVar, b bVar, l0 l0Var, f fVar) {
        t.e(cVar, "<this>");
        t.e(bVar, "from");
        t.e(l0Var, "scopeOwner");
        t.e(fVar, "name");
        String b10 = l0Var.d().b();
        t.d(b10, "scopeOwner.fqName.asString()");
        String b11 = fVar.b();
        t.d(b11, "name.asString()");
        c(cVar, bVar, b10, b11);
    }

    public static final void c(c cVar, b bVar, String str, String str2) {
        fd.a b10;
        t.e(cVar, "<this>");
        t.e(bVar, "from");
        t.e(str, "packageFqName");
        t.e(str2, "name");
        if (cVar == c.a.f10155a || (b10 = bVar.b()) == null) {
            return;
        }
        cVar.b(b10.a(), cVar.a() ? b10.getPosition() : fd.e.Companion.a(), str, fd.f.PACKAGE, str2);
    }
}
