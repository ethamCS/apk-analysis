package h7;
/* loaded from: classes.dex */
final class a {

    /* renamed from: a */
    private final o6.b f11375a;

    /* renamed from: b */
    private j f11376b;

    /* renamed from: c */
    private g f11377c;

    /* renamed from: d */
    private boolean f11378d;

    public a(o6.b bVar) {
        int i10 = bVar.i();
        if (i10 < 21 || (i10 & 3) != 1) {
            throw h6.h.b();
        }
        this.f11375a = bVar;
    }

    private int a(int i10, int i11, int i12) {
        return this.f11378d ? this.f11375a.f(i11, i10) : this.f11375a.f(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public void b() {
        int i10 = 0;
        while (i10 < this.f11375a.l()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f11375a.i(); i12++) {
                if (this.f11375a.f(i10, i12) != this.f11375a.f(i12, i10)) {
                    this.f11375a.e(i12, i10);
                    this.f11375a.e(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    public byte[] c() {
        g d10 = d();
        j e10 = e();
        c cVar = c.values()[d10.c()];
        int i10 = this.f11375a.i();
        cVar.g(this.f11375a, i10);
        o6.b a10 = e10.a();
        byte[] bArr = new byte[e10.h()];
        int i11 = i10 - 1;
        boolean z10 = true;
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 > 0) {
            if (i12 == 6) {
                i12--;
            }
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = z10 ? i11 - i16 : i16;
                for (int i18 = 0; i18 < 2; i18++) {
                    int i19 = i12 - i18;
                    if (!a10.f(i19, i17)) {
                        i14++;
                        i15 <<= 1;
                        if (this.f11375a.f(i19, i17)) {
                            i15 |= 1;
                        }
                        if (i14 == 8) {
                            bArr[i13] = (byte) i15;
                            i13++;
                            i14 = 0;
                            i15 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i12 -= 2;
        }
        if (i13 == e10.h()) {
            return bArr;
        }
        throw h6.h.b();
    }

    public g d() {
        g gVar = this.f11377c;
        if (gVar != null) {
            return gVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = a(i12, 8, i11);
        }
        int a10 = a(8, 7, a(8, 8, a(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            a10 = a(8, i13, a10);
        }
        int i14 = this.f11375a.i();
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = a(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = a(i17, 8, i10);
        }
        g a11 = g.a(a10, i10);
        this.f11377c = a11;
        if (a11 == null) {
            throw h6.h.b();
        }
        return a11;
    }

    public j e() {
        j jVar = this.f11376b;
        if (jVar != null) {
            return jVar;
        }
        int i10 = this.f11375a.i();
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return j.i(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = a(i16, i15, i14);
            }
        }
        j c10 = j.c(i14);
        if (c10 != null && c10.e() == i10) {
            this.f11376b = c10;
            return c10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = a(i17, i18, i13);
            }
        }
        j c11 = j.c(i13);
        if (c11 == null || c11.e() != i10) {
            throw h6.h.b();
        }
        this.f11376b = c11;
        return c11;
    }

    public void f() {
        if (this.f11377c == null) {
            return;
        }
        c.values()[this.f11377c.c()].g(this.f11375a, this.f11375a.i());
    }

    public void g(boolean z10) {
        this.f11376b = null;
        this.f11377c = null;
        this.f11378d = z10;
    }
}
