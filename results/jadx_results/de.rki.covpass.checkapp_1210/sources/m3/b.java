package m3;

import c4.q;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public static abstract class a<T extends q<T>> implements m3.d {

        /* renamed from: a */
        protected T f16262a;

        protected a(T t10) {
            this.f16262a = t10;
        }

        @Override // m3.d
        public int a() {
            return this.f16262a.g();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m3.d
        public void c(q qVar) {
            this.f16262a = qVar;
        }

        @Override // m3.d
        public int d() {
            return this.f16262a.p();
        }
    }

    /* renamed from: m3.b$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0244b<T extends q<T>> extends a<T> {
        protected AbstractC0244b(T t10) {
            super(t10);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a<c4.a> {
        public c(c4.a aVar) {
            super(aVar);
        }

        @Override // m3.d
        public double b(int i10, int i11) {
            return ((c4.a) this.f16262a).l(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a<c4.b> {
        public d(c4.b bVar) {
            super(bVar);
        }

        @Override // m3.d
        public double b(int i10, int i11) {
            T t10 = this.f16262a;
            return ((c4.b) t10).V3[((c4.b) t10).i(i10, i11)];
        }
    }

    /* loaded from: classes.dex */
    public static class e extends AbstractC0244b<c4.i> {
        public e(c4.i iVar) {
            super(iVar);
        }

        @Override // m3.d
        public double b(int i10, int i11) {
            return ((c4.i) this.f16262a).d0(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends AbstractC0244b<c4.g> {
        public f(c4.g gVar) {
            super(gVar);
        }

        @Override // m3.d
        public double b(int i10, int i11) {
            return ((c4.g) this.f16262a).d0(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends AbstractC0244b<c4.h> {
        public g(c4.h hVar) {
            super(hVar);
        }

        @Override // m3.d
        public double b(int i10, int i11) {
            return ((c4.h) this.f16262a).d0(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends AbstractC0244b<c4.j> {
        public h(c4.j jVar) {
            super(jVar);
        }

        @Override // m3.d
        public double b(int i10, int i11) {
            return ((c4.j) this.f16262a).d0(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends AbstractC0244b<c4.k> {
        public i(c4.k kVar) {
            super(kVar);
        }

        @Override // m3.d
        public double b(int i10, int i11) {
            return ((c4.k) this.f16262a).d0(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends AbstractC0244b<c4.l> {
        public j(c4.l lVar) {
            super(lVar);
        }

        @Override // m3.d
        public double b(int i10, int i11) {
            return ((c4.l) this.f16262a).d0(i10, i11);
        }
    }

    public static m3.d a(Class cls) {
        if (cls == c4.l.class) {
            return new j(null);
        }
        if (cls == c4.j.class) {
            return new h(null);
        }
        if (cls == c4.k.class) {
            return new i(null);
        }
        if (cls == c4.g.class) {
            return new f(null);
        }
        if (cls == c4.h.class) {
            return new g(null);
        }
        if (cls == c4.i.class) {
            return new e(null);
        }
        if (cls == c4.a.class) {
            return new c(null);
        }
        if (cls == c4.b.class) {
            return new d(null);
        }
        throw new IllegalArgumentException("Unknown image type: " + cls);
    }
}
