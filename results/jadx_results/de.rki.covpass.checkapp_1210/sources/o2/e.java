package o2;

import jk.g;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    public la.a f17352a;

    /* renamed from: b */
    public ok.d f17353b;

    /* renamed from: e */
    public double f17356e;

    /* renamed from: f */
    public double f17357f;

    /* renamed from: g */
    public int f17358g;

    /* renamed from: c */
    public ka.b f17354c = new ka.b();

    /* renamed from: d */
    public double[] f17355d = new double[4];

    /* renamed from: h */
    public o2.a[] f17359h = new o2.a[4];

    /* loaded from: classes.dex */
    public static class a implements g<e> {
        /* renamed from: c */
        public double a(e eVar, e eVar2) {
            return eVar.f17354c.f(eVar2.f17354c);
        }

        /* renamed from: d */
        public double b(e eVar, int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return eVar.f17354c.f10623d;
                }
                throw new IllegalArgumentException("Out of bounds. " + i10);
            }
            return eVar.f17354c.f10622c;
        }

        @Override // jk.g
        public int length() {
            return 2;
        }
    }

    public int a(e eVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            o2.a[] aVarArr = this.f17359h;
            if (aVarArr[i10] != null && aVarArr[i10].b(eVar)) {
                return i10;
            }
        }
        return -1;
    }

    public void b() {
        this.f17352a = null;
        this.f17353b = null;
        this.f17354c.i(-1.0d, -1.0d);
        this.f17356e = 0.0d;
        this.f17357f = Double.MAX_VALUE;
        this.f17358g = -2;
        int i10 = 0;
        while (true) {
            o2.a[] aVarArr = this.f17359h;
            if (i10 < aVarArr.length) {
                aVarArr[i10] = null;
                this.f17355d[i10] = 0.0d;
                i10++;
            } else {
                return;
            }
        }
    }
}
