package vk;

import fl.f;
import rk.n;
/* loaded from: classes3.dex */
public class b implements fl.b<n> {

    /* renamed from: a */
    f<n> f24397a = al.a.a(500, 100);

    /* renamed from: b */
    fl.b<n> f24398b = new a();

    /* renamed from: c */
    n f24399c = new n(1, 1);

    /* renamed from: d */
    int f24400d;

    /* renamed from: e */
    int f24401e;

    /* renamed from: f */
    int f24402f;

    @Override // fl.b
    public void j(double[] dArr, double[] dArr2) {
        dArr[0] = this.f24399c.b(0);
        for (int i10 = 1; i10 < this.f24401e; i10++) {
            dArr[i10] = this.f24399c.l(i10, i10);
            int i11 = i10 - 1;
            dArr2[i11] = this.f24399c.l(i11, i10);
        }
    }

    /* renamed from: l */
    public boolean d(n nVar) {
        if (!this.f24397a.d(nVar)) {
            return false;
        }
        int i10 = nVar.f21297d;
        this.f24400d = i10;
        int i11 = nVar.f21298q;
        this.f24401e = i11;
        int min = Math.min(i10, i11);
        this.f24402f = min;
        this.f24399c.e(min, this.f24401e, false);
        this.f24397a.e(this.f24399c, true);
        n nVar2 = new n(this.f24402f, this.f24401e);
        tk.b.i(this.f24399c, this.f24397a.a(null), nVar2);
        this.f24399c.g(nVar2);
        return this.f24398b.d(this.f24399c);
    }

    /* renamed from: m */
    public n c(n nVar, boolean z10, boolean z11) {
        n r10 = a.r(nVar, false, z11, this.f24400d, this.f24401e, this.f24402f);
        if (z11) {
            tk.b.h(this.f24397a.k(null, true), this.f24398b.c(null, false, true), r10);
        } else {
            n k10 = this.f24397a.k(r10, false);
            n c10 = this.f24398b.c(null, false, true);
            n c11 = tk.b.c(k10, 0, k10.f21297d, 0, this.f24402f);
            n nVar2 = new n(c11.f21297d, c10.f21298q);
            tk.b.h(c11, c10, nVar2);
            tk.b.g(nVar2, k10, 0, 0);
        }
        if (z10) {
            tk.b.m(r10);
        }
        return r10;
    }

    /* renamed from: n */
    public n g(n nVar, boolean z10, boolean z11) {
        return this.f24398b.g(nVar, z10, z11);
    }
}
