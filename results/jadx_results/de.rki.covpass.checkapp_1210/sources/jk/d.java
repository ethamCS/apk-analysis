package jk;

import java.util.List;
import java.util.Objects;
/* loaded from: classes3.dex */
public class d<P> implements c<P> {

    /* renamed from: a */
    private final int f14450a;

    /* renamed from: b */
    private final double[] f14451b;

    /* renamed from: c */
    private final double[] f14452c;

    /* renamed from: d */
    private double[] f14453d;

    /* renamed from: e */
    private int[] f14454e;

    /* renamed from: f */
    a f14455f;

    /* renamed from: g */
    g<P> f14456g;

    /* renamed from: h */
    int f14457h;

    /* renamed from: i */
    P f14458i;

    /* renamed from: j */
    int f14459j;

    public d(g<P> gVar) {
        this(gVar, new b());
    }

    public d(g<P> gVar, a aVar) {
        this.f14453d = new double[1];
        this.f14454e = new int[1];
        this.f14456g = gVar;
        this.f14455f = aVar;
        int length = gVar.length();
        this.f14450a = length;
        this.f14451b = new double[length];
        this.f14452c = new double[length];
        aVar.a(length);
    }

    private void f(List<P> list) {
        int size = list.size();
        for (int i10 = 0; i10 < this.f14450a; i10++) {
            this.f14451b[i10] = 0.0d;
            this.f14452c[i10] = 0.0d;
        }
        for (int i11 = 0; i11 < size; i11++) {
            P p10 = list.get(i11);
            for (int i12 = 0; i12 < this.f14450a; i12++) {
                double[] dArr = this.f14451b;
                dArr[i12] = dArr[i12] + this.f14456g.b(p10, i12);
            }
        }
        for (int i13 = 0; i13 < this.f14450a; i13++) {
            double[] dArr2 = this.f14451b;
            dArr2[i13] = dArr2[i13] / size;
        }
        for (int i14 = 0; i14 < size; i14++) {
            P p11 = list.get(i14);
            for (int i15 = 0; i15 < this.f14450a; i15++) {
                double b10 = this.f14451b[i15] - this.f14456g.b(p11, i15);
                double[] dArr3 = this.f14452c;
                dArr3[i15] = dArr3[i15] + (b10 * b10);
            }
        }
    }

    private void g(List<P> list, int i10, int i11) {
        int size = list.size();
        if (this.f14453d.length < size) {
            this.f14453d = new double[size];
            this.f14454e = new int[size];
        }
        for (int i12 = 0; i12 < size; i12++) {
            this.f14453d[i12] = this.f14456g.b(list.get(i12), i10);
        }
        mk.a.a(this.f14453d, i11, size, this.f14454e);
    }

    @Override // jk.c
    public int a() {
        return this.f14459j;
    }

    @Override // jk.c
    public void b(List<P> list, ok.g gVar, List<P> list2, ok.g gVar2, List<P> list3, ok.g gVar3) {
        f(list);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14450a; i11++) {
            if (Double.isNaN(this.f14452c[i11])) {
                throw new RuntimeException("Variance is NaN.  Bad input is the cause. mean[i]=" + this.f14451b[i11] + " i=" + i11 + " points.size=" + list.size());
            }
        }
        this.f14457h = this.f14455f.b(this.f14452c);
        int size = list.size() / 2;
        g(list, this.f14457h, size);
        this.f14458i = list.get(this.f14454e[size]);
        if (gVar != null) {
            Objects.requireNonNull(gVar2);
            Objects.requireNonNull(gVar3);
            gVar2.h();
            gVar3.h();
            while (i10 < size) {
                int i12 = this.f14454e[i10];
                list2.add(list.get(i12));
                gVar2.a(gVar.d(i12));
                i10++;
            }
            for (int i13 = size + 1; i13 < list.size(); i13++) {
                int i14 = this.f14454e[i13];
                list3.add(list.get(i14));
                gVar3.a(gVar.d(i14));
            }
            this.f14459j = gVar.d(this.f14454e[size]);
            return;
        }
        while (i10 < size) {
            list2.add(list.get(this.f14454e[i10]));
            i10++;
        }
        while (true) {
            size++;
            if (size >= list.size()) {
                return;
            }
            list3.add(list.get(this.f14454e[size]));
        }
    }

    @Override // jk.c
    public int c() {
        return this.f14450a;
    }

    @Override // jk.c
    public int d() {
        return this.f14457h;
    }

    @Override // jk.c
    public P e() {
        return this.f14458i;
    }
}
