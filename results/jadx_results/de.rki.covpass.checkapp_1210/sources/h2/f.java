package h2;

import c4.l;
import c4.n;
import c4.q;
import c4.t;
/* loaded from: classes.dex */
public abstract class f<T extends q<T>> implements h<T> {

    /* renamed from: a */
    t<T> f11175a;

    /* renamed from: b */
    double f11176b;

    /* renamed from: c */
    boolean f11177c;

    /* renamed from: d */
    double f11178d;

    /* renamed from: e */
    double f11179e;

    /* loaded from: classes.dex */
    public static class a<T extends q<T>> extends f<T> {
        public a(double d10, double d11, double d12, boolean z10, t<T> tVar) {
            super(d10, d11, d12, z10, tVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h2.h
        public /* bridge */ /* synthetic */ void a(n nVar, l lVar) {
            super.c((q) nVar, lVar);
        }

        @Override // h2.f
        double b(T t10) {
            return q2.d.a(t10, this.f11178d, this.f11179e);
        }
    }

    /* loaded from: classes.dex */
    public static class b<T extends q<T>> extends f<T> {
        public b(double d10, double d11, double d12, boolean z10, t<T> tVar) {
            super(d10, d11, d12, z10, tVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h2.h
        public /* bridge */ /* synthetic */ void a(n nVar, l lVar) {
            super.c((q) nVar, lVar);
        }

        @Override // h2.f
        double b(T t10) {
            return q2.d.c(t10, this.f11178d, this.f11179e);
        }
    }

    /* loaded from: classes.dex */
    public static class c<T extends q<T>> extends f<T> {
        public c(double d10, double d11, double d12, boolean z10, t<T> tVar) {
            super(d10, d11, d12, z10, tVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h2.h
        public /* bridge */ /* synthetic */ void a(n nVar, l lVar) {
            super.c((q) nVar, lVar);
        }

        @Override // h2.f
        double b(T t10) {
            return q2.d.e(t10, this.f11178d, this.f11179e);
        }
    }

    /* loaded from: classes.dex */
    public static class d<T extends q<T>> extends f<T> {
        public d(double d10, double d11, double d12, boolean z10, t<T> tVar) {
            super(d10, d11, d12, z10, tVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h2.h
        public /* bridge */ /* synthetic */ void a(n nVar, l lVar) {
            super.c((q) nVar, lVar);
        }

        @Override // h2.f
        double b(T t10) {
            return q2.d.g(t10, this.f11178d, this.f11179e);
        }
    }

    protected f(double d10, double d11, double d12, boolean z10, t<T> tVar) {
        this.f11178d = d10;
        this.f11179e = d11;
        this.f11177c = z10;
        this.f11176b = d12;
        this.f11175a = tVar;
    }

    abstract double b(T t10);

    public void c(T t10, l lVar) {
        double d10 = 0.0d;
        if (this.f11177c) {
            d10 = this.f11176b;
        } else {
            double d11 = this.f11176b;
            if (d11 > 0.0d) {
                d10 = 1.0d / d11;
            }
        }
        q2.d.k(t10, lVar, b(t10) * d10, this.f11177c);
    }

    @Override // h2.h
    public t<T> getInputType() {
        return this.f11175a;
    }
}
