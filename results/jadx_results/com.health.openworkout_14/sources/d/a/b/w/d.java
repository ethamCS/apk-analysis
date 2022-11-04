package d.a.b.w;

import d.a.b.t;
import d.a.b.u;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class d implements u, Cloneable {

    /* renamed from: h */
    public static final d f3768h = new d();

    /* renamed from: e */
    private boolean f3772e;

    /* renamed from: b */
    private double f3769b = -1.0d;

    /* renamed from: c */
    private int f3770c = 136;

    /* renamed from: d */
    private boolean f3771d = true;

    /* renamed from: f */
    private List<d.a.b.a> f3773f = Collections.emptyList();

    /* renamed from: g */
    private List<d.a.b.a> f3774g = Collections.emptyList();

    /* loaded from: classes.dex */
    class a extends t<T> {

        /* renamed from: a */
        private t<T> f3775a;

        /* renamed from: b */
        final /* synthetic */ boolean f3776b;

        /* renamed from: c */
        final /* synthetic */ boolean f3777c;

        /* renamed from: d */
        final /* synthetic */ d.a.b.e f3778d;

        /* renamed from: e */
        final /* synthetic */ d.a.b.x.a f3779e;

        a(boolean z, boolean z2, d.a.b.e eVar, d.a.b.x.a aVar) {
            d.this = r1;
            this.f3776b = z;
            this.f3777c = z2;
            this.f3778d = eVar;
            this.f3779e = aVar;
        }

        private t<T> e() {
            t<T> tVar = this.f3775a;
            if (tVar != 0) {
                return tVar;
            }
            t<T> m = this.f3778d.m(d.this, this.f3779e);
            this.f3775a = m;
            return m;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // d.a.b.t
        public T b(d.a.b.y.a aVar) {
            if (this.f3776b) {
                aVar.G0();
                return null;
            }
            return e().b(aVar);
        }

        @Override // d.a.b.t
        public void d(d.a.b.y.c cVar, T t) {
            if (this.f3777c) {
                cVar.m0();
            } else {
                e().d(cVar, t);
            }
        }
    }

    private boolean f(Class<?> cls) {
        if (this.f3769b == -1.0d || o((d.a.b.v.d) cls.getAnnotation(d.a.b.v.d.class), (d.a.b.v.e) cls.getAnnotation(d.a.b.v.e.class))) {
            return (!this.f3771d && j(cls)) || i(cls);
        }
        return true;
    }

    private boolean g(Class<?> cls, boolean z) {
        for (d.a.b.a aVar : z ? this.f3773f : this.f3774g) {
            if (aVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean j(Class<?> cls) {
        return cls.isMemberClass() && !l(cls);
    }

    private boolean l(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean m(d.a.b.v.d dVar) {
        return dVar == null || dVar.value() <= this.f3769b;
    }

    private boolean n(d.a.b.v.e eVar) {
        return eVar == null || eVar.value() > this.f3769b;
    }

    private boolean o(d.a.b.v.d dVar, d.a.b.v.e eVar) {
        return m(dVar) && n(eVar);
    }

    @Override // d.a.b.u
    public <T> t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
        Class<? super T> c2 = aVar.c();
        boolean f2 = f(c2);
        boolean z = f2 || g(c2, true);
        boolean z2 = f2 || g(c2, false);
        if (z || z2) {
            return new a(z2, z, eVar, aVar);
        }
        return null;
    }

    /* renamed from: d */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean e(Class<?> cls, boolean z) {
        return f(cls) || g(cls, z);
    }

    public boolean h(Field field, boolean z) {
        d.a.b.v.a aVar;
        if ((this.f3770c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f3769b != -1.0d && !o((d.a.b.v.d) field.getAnnotation(d.a.b.v.d.class), (d.a.b.v.e) field.getAnnotation(d.a.b.v.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f3772e && ((aVar = (d.a.b.v.a) field.getAnnotation(d.a.b.v.a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f3771d && j(field.getType())) || i(field.getType())) {
            return true;
        }
        List<d.a.b.a> list = z ? this.f3773f : this.f3774g;
        if (list.isEmpty()) {
            return false;
        }
        d.a.b.b bVar = new d.a.b.b(field);
        for (d.a.b.a aVar2 : list) {
            if (aVar2.b(bVar)) {
                return true;
            }
        }
        return false;
    }
}
