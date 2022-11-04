package gd;

import java.util.Map;
/* loaded from: classes.dex */
public final class d0<T> implements c0<T> {

    /* renamed from: a */
    private final Map<wd.c, T> f10684a;

    /* renamed from: b */
    private final ne.f f10685b;

    /* renamed from: c */
    private final ne.h<wd.c, T> f10686c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<wd.c, T> {

        /* renamed from: c */
        final /* synthetic */ d0<T> f10687c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0<T> d0Var) {
            super(1);
            this.f10687c = d0Var;
        }

        /* renamed from: b */
        public final T invoke(wd.c cVar) {
            hc.t.d(cVar, "it");
            return (T) wd.e.a(cVar, this.f10687c.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(Map<wd.c, ? extends T> map) {
        hc.t.e(map, "states");
        this.f10684a = map;
        ne.f fVar = new ne.f("Java nullability annotation states");
        this.f10685b = fVar;
        ne.h<wd.c, T> i10 = fVar.i(new a(this));
        hc.t.d(i10, "storageManager.createMem…cificFqname(states)\n    }");
        this.f10686c = i10;
    }

    @Override // gd.c0
    public T a(wd.c cVar) {
        hc.t.e(cVar, "fqName");
        return this.f10686c.invoke(cVar);
    }

    public final Map<wd.c, T> b() {
        return this.f10684a;
    }
}
