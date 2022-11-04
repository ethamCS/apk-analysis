package g.z.a;

import d.a.b.e;
import e.h0;
import e.j0;
import g.h;
import g.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
/* loaded from: classes.dex */
public final class a extends h.a {

    /* renamed from: a */
    private final e f4651a;

    private a(e eVar) {
        this.f4651a = eVar;
    }

    public static a f() {
        return g(new e());
    }

    public static a g(e eVar) {
        Objects.requireNonNull(eVar, "gson == null");
        return new a(eVar);
    }

    @Override // g.h.a
    public h<?, h0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, u uVar) {
        return new b(this.f4651a, this.f4651a.k(d.a.b.x.a.b(type)));
    }

    @Override // g.h.a
    public h<j0, ?> d(Type type, Annotation[] annotationArr, u uVar) {
        return new c(this.f4651a, this.f4651a.k(d.a.b.x.a.b(type)));
    }
}
