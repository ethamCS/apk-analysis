package yk;

import fl.h;
import pk.d;
import rk.n;
/* loaded from: classes3.dex */
public class b implements h<n> {

    /* renamed from: a */
    protected int f26317a;

    /* renamed from: b */
    protected int f26318b;

    /* renamed from: c */
    protected int f26319c;

    /* renamed from: d */
    protected int f26320d;

    /* renamed from: e */
    protected boolean f26321e;

    /* renamed from: f */
    protected fl.b<n> f26322f;

    /* renamed from: h */
    double[] f26324h;

    /* renamed from: i */
    double[] f26325i;

    /* renamed from: j */
    private n f26326j;

    /* renamed from: k */
    private n f26327k;

    /* renamed from: l */
    private double[] f26328l;

    /* renamed from: m */
    private int f26329m;

    /* renamed from: n */
    protected boolean f26330n;

    /* renamed from: o */
    protected boolean f26331o;

    /* renamed from: p */
    protected boolean f26332p;

    /* renamed from: q */
    protected boolean f26333q;

    /* renamed from: r */
    protected boolean f26334r;

    /* renamed from: s */
    protected boolean f26335s;

    /* renamed from: g */
    protected zk.a f26323g = new zk.a();

    /* renamed from: t */
    private n f26336t = new n(1, 1);

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f26330n = z10;
        this.f26333q = z11;
        this.f26334r = z12;
        this.f26321e = z13;
    }

    private boolean l(n nVar) {
        if (this.f26335s) {
            this.f26336t.e(nVar.f21298q, nVar.f21297d, false);
            s(this.f26336t, nVar);
        } else {
            this.f26336t.e(nVar.f21297d, nVar.f21298q, false);
            this.f26336t.g(nVar);
        }
        return !this.f26322f.d(this.f26336t);
    }

    private boolean m() {
        zk.a aVar;
        this.f26322f.j(this.f26324h, this.f26325i);
        this.f26323g.B(this.f26319c, this.f26320d, this.f26324h, this.f26325i);
        if (this.f26331o) {
            this.f26326j = this.f26322f.c(this.f26326j, true, this.f26330n);
        }
        if (this.f26332p) {
            this.f26327k = this.f26322f.g(this.f26327k, true, this.f26330n);
        }
        this.f26323g.A(false);
        n nVar = null;
        if (this.f26331o) {
            this.f26323g.D(this.f26326j);
        } else {
            this.f26323g.D(null);
        }
        if (this.f26332p) {
            aVar = this.f26323g;
            nVar = this.f26327k;
        } else {
            aVar = this.f26323g;
        }
        aVar.E(nVar);
        return !this.f26323g.s();
    }

    private void q() {
        this.f26329m = this.f26323g.h();
        this.f26328l = this.f26323g.j();
        for (int i10 = 0; i10 < this.f26329m; i10++) {
            double i11 = this.f26323g.i(i10);
            if (i11 < 0.0d) {
                this.f26328l[i10] = 0.0d - i11;
                if (this.f26331o) {
                    int i12 = this.f26326j.f21298q;
                    int i13 = i10 * i12;
                    int i14 = i12 + i13;
                    while (i13 < i14) {
                        n nVar = this.f26326j;
                        nVar.f(i13, 0.0d - nVar.b(i13));
                        i13++;
                    }
                }
            } else {
                this.f26328l[i10] = i11;
            }
        }
    }

    private boolean r(n nVar) {
        int i10 = nVar.f21298q;
        int i11 = nVar.f21297d;
        boolean z10 = i10 > i11;
        this.f26335s = z10;
        if (z10) {
            this.f26331o = this.f26334r;
            this.f26332p = this.f26333q;
            this.f26319c = i10;
            this.f26320d = i11;
        } else {
            this.f26331o = this.f26333q;
            this.f26332p = this.f26334r;
            this.f26319c = i11;
            this.f26320d = i10;
        }
        this.f26317a = i11;
        this.f26318b = i10;
        if (i11 == 0 || i10 == 0) {
            return false;
        }
        double[] dArr = this.f26324h;
        if (dArr == null || dArr.length < this.f26320d) {
            int i12 = this.f26320d;
            this.f26324h = new double[i12];
            this.f26325i = new double[i12 - 1];
        }
        n();
        return true;
    }

    private void t() {
        if (this.f26335s) {
            n nVar = this.f26327k;
            this.f26327k = this.f26326j;
            this.f26326j = nVar;
        }
    }

    @Override // fl.c
    public boolean b() {
        return false;
    }

    @Override // fl.g
    public int f() {
        return this.f26329m;
    }

    @Override // fl.h
    public double[] h() {
        return this.f26328l;
    }

    protected void n() {
        fl.b<n> bVar;
        if (!this.f26321e || this.f26317a <= this.f26318b * 2 || this.f26331o) {
            fl.b<n> bVar2 = this.f26322f;
            if (bVar2 != null && (bVar2 instanceof vk.a)) {
                return;
            }
            bVar = new vk.a();
        } else {
            fl.b<n> bVar3 = this.f26322f;
            if (bVar3 != null && (bVar3 instanceof vk.b)) {
                return;
            }
            bVar = new vk.b();
        }
        this.f26322f = bVar;
    }

    /* renamed from: o */
    public boolean d(n nVar) {
        if (r(nVar) && !l(nVar) && !m()) {
            q();
            t();
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public n i(n nVar, boolean z10) {
        if (this.f26334r) {
            if (z10) {
                if (nVar == null) {
                    return this.f26327k;
                }
                nVar.g(this.f26327k);
                return nVar;
            }
            n nVar2 = this.f26327k;
            n n10 = d.n(nVar, nVar2.f21298q, nVar2.f21297d);
            s(n10, this.f26327k);
            return n10;
        }
        throw new IllegalArgumentException("As requested V was not computed.");
    }

    protected void s(n nVar, n nVar2) {
        tk.b.l(nVar2, nVar);
    }
}
