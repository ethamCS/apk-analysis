package x3;

import java.util.List;
import ok.k;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    final int f25384a;

    /* renamed from: b */
    final ok.b<int[]> f25385b;

    /* renamed from: c */
    final ok.b<a> f25386c;

    /* renamed from: d */
    int f25387d;

    public g() {
        this(2000);
    }

    public g(int i10) {
        this.f25386c = new ok.b<>(f.f25383a);
        if (i10 >= 2) {
            this.f25384a = i10 + (i10 % 2);
            ok.b<int[]> bVar = new ok.b<>(int[].class, new k() { // from class: x3.e
                @Override // ok.k
                public final Object a() {
                    int[] e10;
                    e10 = g.this.e();
                    return e10;
                }
            });
            this.f25385b = bVar;
            bVar.i();
            return;
        }
        throw new IllegalArgumentException("Block length must be more than 2");
    }

    public /* synthetic */ int[] e() {
        return new int[this.f25384a];
    }

    public void b(int i10, int i11) {
        int[] iArr;
        if (this.f25386c.f18623d == 0) {
            d();
        }
        a e10 = this.f25386c.e();
        int i12 = e10.f25380a + (e10.f25381b * 2);
        int i13 = e10.f25373c + (i12 / this.f25384a);
        ok.b<int[]> bVar = this.f25385b;
        if (i13 == bVar.f18623d) {
            this.f25387d = 0;
            iArr = bVar.i();
        } else {
            iArr = bVar.c(i13);
        }
        int[] iArr2 = iArr;
        this.f25387d += 2;
        int i14 = i12 % this.f25384a;
        iArr2[i14] = i10;
        iArr2[i14 + 1] = i11;
        e10.f25381b++;
    }

    public void c(int i10, ok.b<ka.c> bVar) {
        bVar.r();
        a c10 = this.f25386c.c(i10);
        for (int i11 = 0; i11 < c10.f25381b; i11++) {
            int i12 = c10.f25380a + (i11 * 2);
            int i13 = c10.f25373c;
            int i14 = this.f25384a;
            int i15 = i12 % i14;
            int[] c11 = this.f25385b.c(i13 + (i12 / i14));
            bVar.i().e(c11[i15], c11[i15 + 1]);
        }
    }

    public void d() {
        if (this.f25387d >= this.f25384a) {
            this.f25387d = 0;
            this.f25385b.i();
        }
        a i10 = this.f25386c.i();
        i10.f25373c = this.f25385b.f18623d - 1;
        i10.f25380a = this.f25387d;
        i10.f25381b = 0;
    }

    public void f() {
        a e10 = this.f25386c.e();
        while (true) {
            ok.b<int[]> bVar = this.f25385b;
            if (bVar.f18623d - 1 == e10.f25373c) {
                this.f25387d = e10.f25380a;
                this.f25386c.n();
                return;
            }
            bVar.n();
        }
    }

    public void g() {
        this.f25387d = 0;
        this.f25385b.r();
        this.f25385b.i();
        this.f25386c.r();
    }

    public int h() {
        return this.f25386c.f18623d;
    }

    public int i() {
        ok.b<a> bVar = this.f25386c;
        if (bVar.f18623d == 0) {
            return 0;
        }
        return bVar.e().f25381b;
    }

    public void j(int i10, List<ka.c> list) {
        a c10 = this.f25386c.c(i10);
        if (c10.f25381b == list.size()) {
            for (int i11 = 0; i11 < c10.f25381b; i11++) {
                int i12 = c10.f25380a + (i11 * 2);
                int i13 = c10.f25373c;
                int i14 = this.f25384a;
                int i15 = i13 + (i12 / i14);
                int i16 = i12 % i14;
                ka.c cVar = list.get(i11);
                int[] c11 = this.f25385b.c(i15);
                c11[i16] = cVar.f14865c;
                c11[i16 + 1] = cVar.f14866d;
            }
            return;
        }
        throw new IllegalArgumentException("points and set don't have the same length");
    }
}
