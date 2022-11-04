package c.b.b.w;

import c.b.b.t;
import c.b.b.u;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class d implements u, Cloneable {
    public static final d g = new d();

    /* renamed from: d */
    private boolean f487d;

    /* renamed from: a */
    private double f484a = -1.0d;

    /* renamed from: b */
    private int f485b = 136;

    /* renamed from: c */
    private boolean f486c = true;

    /* renamed from: e */
    private List<c.b.b.a> f488e = Collections.emptyList();
    private List<c.b.b.a> f = Collections.emptyList();

    /* loaded from: classes.dex */
    class a extends t<T> {

        /* renamed from: a */
        private t<T> f489a;

        /* renamed from: b */
        final /* synthetic */ boolean f490b;

        /* renamed from: c */
        final /* synthetic */ boolean f491c;

        /* renamed from: d */
        final /* synthetic */ c.b.b.e f492d;

        /* renamed from: e */
        final /* synthetic */ c.b.b.x.a f493e;

        a(boolean z, boolean z2, c.b.b.e eVar, c.b.b.x.a aVar) {
            d.this = r1;
            this.f490b = z;
            this.f491c = z2;
            this.f492d = eVar;
            this.f493e = aVar;
        }

        private t<T> e() {
            t<T> tVar = this.f489a;
            if (tVar != 0) {
                return tVar;
            }
            t<T> l = this.f492d.l(d.this, this.f493e);
            this.f489a = l;
            return l;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // c.b.b.t
        public T b(c.b.b.y.a aVar) {
            if (this.f490b) {
                aVar.H();
                return null;
            }
            return e().b(aVar);
        }

        @Override // c.b.b.t
        public void d(c.b.b.y.c cVar, T t) {
            if (this.f491c) {
                cVar.m();
            } else {
                e().d(cVar, t);
            }
        }
    }

    private boolean d(Class<?> cls) {
        if (this.f484a == -1.0d || l((c.b.b.v.d) cls.getAnnotation(c.b.b.v.d.class), (c.b.b.v.e) cls.getAnnotation(c.b.b.v.e.class))) {
            return (!this.f486c && h(cls)) || g(cls);
        }
        return true;
    }

    private boolean e(Class<?> cls, boolean z) {
        for (c.b.b.a aVar : z ? this.f488e : this.f) {
            if (aVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean g(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean h(Class<?> cls) {
        return cls.isMemberClass() && !i(cls);
    }

    private boolean i(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean j(c.b.b.v.d dVar) {
        return dVar == null || dVar.value() <= this.f484a;
    }

    private boolean k(c.b.b.v.e eVar) {
        return eVar == null || eVar.value() > this.f484a;
    }

    private boolean l(c.b.b.v.d dVar, c.b.b.v.e eVar) {
        return j(dVar) && k(eVar);
    }

    @Override // c.b.b.u
    public <T> t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
        Class<? super T> c2 = aVar.c();
        boolean d2 = d(c2);
        boolean z = d2 || e(c2, true);
        boolean z2 = d2 || e(c2, false);
        if (z || z2) {
            return new a(z2, z, eVar, aVar);
        }
        return null;
    }

    /* renamed from: b */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean c(Class<?> cls, boolean z) {
        return d(cls) || e(cls, z);
    }

    public boolean f(Field field, boolean z) {
        c.b.b.v.a aVar;
        if ((this.f485b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f484a != -1.0d && !l((c.b.b.v.d) field.getAnnotation(c.b.b.v.d.class), (c.b.b.v.e) field.getAnnotation(c.b.b.v.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f487d && ((aVar = (c.b.b.v.a) field.getAnnotation(c.b.b.v.a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f486c && h(field.getType())) || g(field.getType())) {
            return true;
        }
        List<c.b.b.a> list = z ? this.f488e : this.f;
        if (list.isEmpty()) {
            return false;
        }
        c.b.b.b bVar = new c.b.b.b(field);
        for (c.b.b.a aVar2 : list) {
            if (aVar2.b(bVar)) {
                return true;
            }
        }
        return false;
    }
}
