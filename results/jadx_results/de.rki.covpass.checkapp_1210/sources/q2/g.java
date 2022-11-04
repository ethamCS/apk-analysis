package q2;

import c4.n;
import c4.q;
import d4.a;
import q2.g;
/* loaded from: classes.dex */
public class g<T extends c4.q<T>, S extends c4.n<S>> implements h2.h<T> {

    /* renamed from: a */
    c4.t<T> f19514a;

    /* renamed from: b */
    protected S f19515b;

    /* renamed from: c */
    protected x3.b f19516c;

    /* renamed from: d */
    protected int f19517d;

    /* renamed from: e */
    protected int f19518e;

    /* renamed from: f */
    protected boolean f19519f;

    /* renamed from: g */
    protected a<T, S> f19520g;

    /* renamed from: h */
    protected d4.a<a<T, S>> f19521h;

    /* loaded from: classes.dex */
    public interface a<T extends c4.q<T>, S extends c4.n<S>> {
        a<T, S> a();

        void b(int i10, int i11, boolean z10);

        void c(int i10, int i11, int i12, int i13, int i14, T t10, S s10);

        void d(int i10, int i11, T t10, S s10, c4.l lVar);

        S e();
    }

    public g(final a<T, S> aVar, x3.b bVar, boolean z10, Class<T> cls) {
        this.f19516c = bVar;
        this.f19514a = c4.t.n(cls);
        this.f19519f = z10;
        this.f19515b = aVar.e();
        this.f19520g = aVar;
        this.f19521h = new d4.a<>(new a.AbstractC0119a() { // from class: q2.f
            @Override // d4.a.AbstractC0119a
            public final Object a() {
                g.a a10;
                a10 = g.a.this.a();
                return a10;
            }
        });
    }

    protected void c(T t10, c4.l lVar) {
        for (int i10 = 0; i10 < this.f19515b.f6221x; i10++) {
            int i11 = 0;
            while (true) {
                S s10 = this.f19515b;
                if (i11 < s10.f6220q) {
                    this.f19520g.d(i11, i10, t10, s10, lVar);
                    i11++;
                }
            }
        }
    }

    protected void d(T t10, int i10, int i11) {
        this.f19520g.b(this.f19517d, this.f19518e, this.f19519f);
        int h10 = this.f19515b.h().h();
        int i12 = 0;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = i12;
            int i15 = 0;
            while (i15 < i10) {
                this.f19520g.c(i15, i13, this.f19517d, this.f19518e, i14, t10, this.f19515b);
                i15 += this.f19517d;
                i14 += h10;
            }
            int i16 = t10.f6220q;
            if (i10 != i16) {
                this.f19520g.c(i10, i13, i16 - i10, this.f19518e, i14, t10, this.f19515b);
                i14 += h10;
            }
            i12 = i14;
            i13 += this.f19518e;
        }
        int i17 = t10.f6221x;
        if (i11 != i17) {
            int i18 = i17 - i11;
            int i19 = 0;
            int i20 = i12;
            while (i19 < i10) {
                this.f19520g.c(i19, i11, this.f19517d, i18, i20, t10, this.f19515b);
                i19 += this.f19517d;
                i20 += h10;
            }
            int i21 = t10.f6220q;
            if (i10 == i21) {
                return;
            }
            this.f19520g.c(i10, i11, i21 - i10, i18, i20, t10, this.f19515b);
        }
    }

    /* renamed from: f */
    public void a(T t10, c4.l lVar) {
        lVar.U(t10.f6220q, t10.f6221x);
        g(t10.f6220q, t10.f6221x, this.f19516c.e(Math.min(t10.f6220q, t10.f6221x)));
        this.f19515b.U(t10.f6220q / this.f19517d, t10.f6221x / this.f19518e);
        int i10 = t10.f6220q;
        int i11 = this.f19517d;
        if (i10 % i11 != 0) {
            i10 = (i10 - i11) - (i10 % i11);
        }
        int i12 = t10.f6221x;
        int i13 = this.f19518e;
        if (i12 % i13 != 0) {
            i12 = (i12 - i13) - (i12 % i13);
        }
        d(t10, i10, i12);
        c(t10, lVar);
    }

    void g(int i10, int i11, int i12) {
        if (i11 >= i12) {
            i11 /= i11 / i12;
        }
        this.f19518e = i11;
        if (i10 >= i12) {
            i10 /= i10 / i12;
        }
        this.f19517d = i10;
    }

    @Override // h2.h
    public c4.t<T> getInputType() {
        return this.f19514a;
    }
}
