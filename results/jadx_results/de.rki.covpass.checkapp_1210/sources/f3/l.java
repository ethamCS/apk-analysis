package f3;

import c4.q;
/* loaded from: classes.dex */
public class l<T extends q<T>> implements k<T> {

    /* renamed from: a */
    private double f9789a;

    /* renamed from: b */
    private int f9790b;

    /* renamed from: c */
    private double f9791c;

    /* renamed from: d */
    private double f9792d;

    /* renamed from: e */
    private final e3.e<T> f9793e;

    /* renamed from: j */
    protected T f9798j;

    /* renamed from: k */
    private final Class<T> f9799k;

    /* renamed from: f */
    private ja.b[] f9794f = new ja.b[0];

    /* renamed from: h */
    private final ka.b f9796h = new ka.b();

    /* renamed from: i */
    private final ka.b f9797i = new ka.b();

    /* renamed from: l */
    private final ka.b f9800l = new ka.b();

    /* renamed from: m */
    private final ka.b f9801m = new ka.b();

    /* renamed from: n */
    private final ja.b f9802n = new ja.b();

    /* renamed from: g */
    private final la.a f9795g = new la.a(1);

    public l(double d10, int i10, int i11, int i12, double d11, double d12, Class<T> cls) {
        this.f9789a = 2.0d;
        this.f9790b = 10;
        this.f9791c = 0.01d;
        this.f9792d = 2.0d;
        this.f9789a = d10;
        this.f9790b = i12;
        this.f9791c = d11;
        this.f9792d = d12;
        this.f9793e = new e3.e<>(i10, i11, cls);
        this.f9799k = cls;
    }

    private boolean c(la.a aVar) {
        double d10 = (this.f9789a * 2.0d) + 2.0d;
        int i10 = 0;
        while (i10 < aVar.f()) {
            int i11 = i10 + 1;
            if (aVar.b(i10).f(aVar.b(i11 % aVar.f())) < d10 * d10) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    private void d(ka.b bVar, ka.b bVar2) {
        double d10 = bVar2.f10622c - bVar.f10622c;
        double d11 = bVar2.f10623d - bVar.f10623d;
        double sqrt = Math.sqrt((d10 * d10) + (d11 * d11));
        double d12 = d10 / sqrt;
        double d13 = d11 / sqrt;
        ka.b bVar3 = this.f9796h;
        double d14 = bVar.f10622c;
        double d15 = this.f9789a;
        bVar3.f10622c = d14 + (d12 * d15);
        bVar3.f10623d = bVar.f10623d + (d13 * d15);
        ka.b bVar4 = this.f9797i;
        bVar4.f10622c = bVar2.f10622c - (d12 * d15);
        bVar4.f10623d = bVar2.f10623d - (d13 * d15);
    }

    @Override // f3.k
    public boolean a(la.a aVar, la.a aVar2) {
        if (aVar.f() != aVar2.f()) {
            int f10 = aVar.f();
            int f11 = aVar2.f();
            throw new IllegalArgumentException("Input and output sides do not match. " + f10 + " " + f11);
        }
        int i10 = 0;
        if (c(aVar)) {
            return false;
        }
        if (this.f9794f.length < aVar.f()) {
            this.f9794f = new ja.b[aVar.f()];
            while (true) {
                ja.b[] bVarArr = this.f9794f;
                if (i10 >= bVarArr.length) {
                    break;
                }
                bVarArr[i10] = new ja.b();
                i10++;
            }
        }
        return f(aVar, aVar2);
    }

    @Override // f3.k
    public void b(T t10) {
        this.f9798j = t10;
        this.f9793e.a(t10);
    }

    protected boolean e(ka.b bVar, ka.b bVar2, ja.b bVar3) {
        d(bVar, bVar2);
        return this.f9793e.d(this.f9796h, this.f9797i, bVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean f(la.a r14, la.a r15) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.l.f(la.a, la.a):boolean");
    }
}
