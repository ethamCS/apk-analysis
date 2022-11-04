package zj;
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a */
    private b f27097a;

    /* renamed from: b */
    private i f27098b;

    /* renamed from: c */
    protected i[] f27099c;

    /* renamed from: d */
    protected i[] f27100d;

    public k(b bVar, i iVar) {
        this.f27097a = bVar;
        this.f27098b = iVar;
        b();
        a();
    }

    private void a() {
        int f10;
        int g10 = this.f27098b.g();
        i[] iVarArr = new i[g10];
        int i10 = g10 - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            iVarArr[i11] = new i(this.f27099c[i11]);
        }
        this.f27100d = new i[g10];
        while (i10 >= 0) {
            this.f27100d[i10] = new i(this.f27097a, i10);
            i10--;
        }
        for (int i12 = 0; i12 < g10; i12++) {
            if (iVarArr[i12].f(i12) == 0) {
                int i13 = i12 + 1;
                boolean z10 = false;
                while (i13 < g10) {
                    if (iVarArr[i13].f(i12) != 0) {
                        d(iVarArr, i12, i13);
                        d(this.f27100d, i12, i13);
                        i13 = g10;
                        z10 = true;
                    }
                    i13++;
                }
                if (!z10) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int f11 = this.f27097a.f(iVarArr[i12].f(i12));
            iVarArr[i12].m(f11);
            this.f27100d[i12].m(f11);
            for (int i14 = 0; i14 < g10; i14++) {
                if (i14 != i12 && (f10 = iVarArr[i14].f(i12)) != 0) {
                    i n10 = iVarArr[i12].n(f10);
                    i n11 = this.f27100d[i12].n(f10);
                    iVarArr[i14].b(n10);
                    this.f27100d[i14].b(n11);
                }
            }
        }
    }

    private void b() {
        int i10;
        int g10 = this.f27098b.g();
        this.f27099c = new i[g10];
        int i11 = 0;
        while (true) {
            i10 = g10 >> 1;
            if (i11 < i10) {
                int i12 = i11 << 1;
                int[] iArr = new int[i12 + 1];
                iArr[i12] = 1;
                this.f27099c[i11] = new i(this.f27097a, iArr);
                i11++;
            }
        }
        while (i10 < g10) {
            int i13 = i10 << 1;
            int[] iArr2 = new int[i13 + 1];
            iArr2[i13] = 1;
            this.f27099c[i10] = new i(this.f27097a, iArr2).k(this.f27098b);
            i10++;
        }
    }

    private static void d(i[] iVarArr, int i10, int i11) {
        i iVar = iVarArr[i10];
        iVarArr[i10] = iVarArr[i11];
        iVarArr[i11] = iVar;
    }

    public i[] c() {
        return this.f27100d;
    }
}
