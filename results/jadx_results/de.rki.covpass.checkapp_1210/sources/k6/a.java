package k6;

import h6.m;
import h6.s;
import o6.b;
import o6.i;
import q6.c;
import q6.e;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g */
    private static final int[] f14626g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final b f14627a;

    /* renamed from: b */
    private boolean f14628b;

    /* renamed from: c */
    private int f14629c;

    /* renamed from: d */
    private int f14630d;

    /* renamed from: e */
    private int f14631e;

    /* renamed from: f */
    private int f14632f;

    /* renamed from: k6.a$a */
    /* loaded from: classes.dex */
    public static final class C0212a {

        /* renamed from: a */
        private final int f14633a;

        /* renamed from: b */
        private final int f14634b;

        C0212a(int i10, int i11) {
            this.f14633a = i10;
            this.f14634b = i11;
        }

        int a() {
            return this.f14633a;
        }

        int b() {
            return this.f14634b;
        }

        s c() {
            return new s(this.f14633a, this.f14634b);
        }

        public String toString() {
            return "<" + this.f14633a + ' ' + this.f14634b + '>';
        }
    }

    public a(b bVar) {
        this.f14627a = bVar;
    }

    private static float b(s sVar, s sVar2) {
        return p6.a.a(sVar.c(), sVar.d(), sVar2.c(), sVar2.d());
    }

    private static float c(C0212a c0212a, C0212a c0212a2) {
        return p6.a.b(c0212a.a(), c0212a.b(), c0212a2.a(), c0212a2.b());
    }

    private static s[] d(s[] sVarArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float c10 = sVarArr[0].c() - sVarArr[2].c();
        float d10 = sVarArr[0].d() - sVarArr[2].d();
        float c11 = (sVarArr[0].c() + sVarArr[2].c()) / 2.0f;
        float d11 = (sVarArr[0].d() + sVarArr[2].d()) / 2.0f;
        float f11 = c10 * f10;
        float f12 = d10 * f10;
        s sVar = new s(c11 + f11, d11 + f12);
        s sVar2 = new s(c11 - f11, d11 - f12);
        float c12 = sVarArr[1].c() - sVarArr[3].c();
        float d12 = sVarArr[1].d() - sVarArr[3].d();
        float c13 = (sVarArr[1].c() + sVarArr[3].c()) / 2.0f;
        float d13 = (sVarArr[1].d() + sVarArr[3].d()) / 2.0f;
        float f13 = c12 * f10;
        float f14 = f10 * d12;
        return new s[]{sVar, new s(c13 + f13, d13 + f14), sVar2, new s(c13 - f13, d13 - f14)};
    }

    private void e(s[] sVarArr) {
        int i10;
        long j10;
        long j11;
        if (!o(sVarArr[0]) || !o(sVarArr[1]) || !o(sVarArr[2]) || !o(sVarArr[3])) {
            throw m.b();
        }
        int i11 = this.f14631e * 2;
        int[] iArr = {r(sVarArr[0], sVarArr[1], i11), r(sVarArr[1], sVarArr[2], i11), r(sVarArr[2], sVarArr[3], i11), r(sVarArr[3], sVarArr[0], i11)};
        this.f14632f = m(iArr, i11);
        long j12 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = iArr[(this.f14632f + i12) % 4];
            if (this.f14628b) {
                j11 = j12 << 7;
                j10 = (i13 >> 1) & 127;
            } else {
                j11 = j12 << 10;
                j10 = ((i13 >> 2) & 992) + ((i13 >> 1) & 31);
            }
            j12 = j11 + j10;
        }
        int h10 = h(j12, this.f14628b);
        if (this.f14628b) {
            this.f14629c = (h10 >> 6) + 1;
            i10 = h10 & 63;
        } else {
            this.f14629c = (h10 >> 11) + 1;
            i10 = h10 & 2047;
        }
        this.f14630d = i10 + 1;
    }

    private s[] f(C0212a c0212a) {
        this.f14631e = 1;
        C0212a c0212a2 = c0212a;
        C0212a c0212a3 = c0212a2;
        C0212a c0212a4 = c0212a3;
        boolean z10 = true;
        while (this.f14631e < 9) {
            C0212a j10 = j(c0212a, z10, 1, -1);
            C0212a j11 = j(c0212a2, z10, 1, 1);
            C0212a j12 = j(c0212a3, z10, -1, 1);
            C0212a j13 = j(c0212a4, z10, -1, -1);
            if (this.f14631e > 2) {
                double c10 = (c(j13, j10) * this.f14631e) / (c(c0212a4, c0212a) * (this.f14631e + 2));
                if (c10 < 0.75d || c10 > 1.25d || !p(j10, j11, j12, j13)) {
                    break;
                }
            }
            z10 = !z10;
            this.f14631e++;
            c0212a4 = j13;
            c0212a = j10;
            c0212a2 = j11;
            c0212a3 = j12;
        }
        int i10 = this.f14631e;
        if (i10 == 5 || i10 == 7) {
            this.f14628b = i10 == 5;
            s[] sVarArr = {new s(c0212a.a() + 0.5f, c0212a.b() - 0.5f), new s(c0212a2.a() + 0.5f, c0212a2.b() + 0.5f), new s(c0212a3.a() - 0.5f, c0212a3.b() + 0.5f), new s(c0212a4.a() - 0.5f, c0212a4.b() - 0.5f)};
            int i11 = this.f14631e;
            return d(sVarArr, (i11 * 2) - 3, i11 * 2);
        }
        throw m.b();
    }

    private int g(C0212a c0212a, C0212a c0212a2) {
        float c10 = c(c0212a, c0212a2);
        float a10 = (c0212a2.a() - c0212a.a()) / c10;
        float b10 = (c0212a2.b() - c0212a.b()) / c10;
        float a11 = c0212a.a();
        float b11 = c0212a.b();
        boolean f10 = this.f14627a.f(c0212a.a(), c0212a.b());
        int ceil = (int) Math.ceil(c10);
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < ceil; i11++) {
            a11 += a10;
            b11 += b10;
            if (this.f14627a.f(p6.a.c(a11), p6.a.c(b11)) != f10) {
                i10++;
            }
        }
        float f11 = i10 / c10;
        if (f11 <= 0.1f || f11 >= 0.9f) {
            if (f11 <= 0.1f) {
                z10 = true;
            }
            return z10 == f10 ? 1 : -1;
        }
        return 0;
    }

    private static int h(long j10, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new c(q6.a.f19676k).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (e unused) {
            throw m.b();
        }
    }

    private int i() {
        if (this.f14628b) {
            return (this.f14629c * 4) + 11;
        }
        int i10 = this.f14629c;
        return i10 <= 4 ? (i10 * 4) + 15 : (i10 * 4) + ((((i10 - 4) / 8) + 1) * 2) + 15;
    }

    private C0212a j(C0212a c0212a, boolean z10, int i10, int i11) {
        int a10 = c0212a.a() + i10;
        int b10 = c0212a.b();
        while (true) {
            b10 += i11;
            if (!n(a10, b10) || this.f14627a.f(a10, b10) != z10) {
                break;
            }
            a10 += i10;
        }
        int i12 = a10 - i10;
        int i13 = b10 - i11;
        while (n(i12, i13) && this.f14627a.f(i12, i13) == z10) {
            i12 += i10;
        }
        int i14 = i12 - i10;
        while (n(i14, i13) && this.f14627a.f(i14, i13) == z10) {
            i13 += i11;
        }
        return new C0212a(i14, i13 - i11);
    }

    private C0212a k() {
        s sVar;
        s sVar2;
        s sVar3;
        s sVar4;
        s sVar5;
        s sVar6;
        s sVar7;
        s sVar8;
        try {
            s[] c10 = new p6.b(this.f14627a).c();
            sVar3 = c10[0];
            sVar2 = c10[1];
            sVar = c10[2];
            sVar4 = c10[3];
        } catch (m unused) {
            int l10 = this.f14627a.l() / 2;
            int i10 = this.f14627a.i() / 2;
            int i11 = l10 + 7;
            int i12 = i10 - 7;
            s c11 = j(new C0212a(i11, i12), false, 1, -1).c();
            int i13 = i10 + 7;
            s c12 = j(new C0212a(i11, i13), false, 1, 1).c();
            int i14 = l10 - 7;
            s c13 = j(new C0212a(i14, i13), false, -1, 1).c();
            sVar4 = j(new C0212a(i14, i12), false, -1, -1).c();
            sVar = c13;
            sVar3 = c11;
            sVar2 = c12;
        }
        int c14 = p6.a.c((((sVar3.c() + sVar4.c()) + sVar2.c()) + sVar.c()) / 4.0f);
        int c15 = p6.a.c((((sVar3.d() + sVar4.d()) + sVar2.d()) + sVar.d()) / 4.0f);
        try {
            s[] c16 = new p6.b(this.f14627a, 15, c14, c15).c();
            sVar6 = c16[0];
            sVar5 = c16[1];
            sVar7 = c16[2];
            sVar8 = c16[3];
        } catch (m unused2) {
            int i15 = c14 + 7;
            int i16 = c15 - 7;
            sVar6 = j(new C0212a(i15, i16), false, 1, -1).c();
            int i17 = c15 + 7;
            sVar5 = j(new C0212a(i15, i17), false, 1, 1).c();
            int i18 = c14 - 7;
            sVar7 = j(new C0212a(i18, i17), false, -1, 1).c();
            sVar8 = j(new C0212a(i18, i16), false, -1, -1).c();
        }
        return new C0212a(p6.a.c((((sVar6.c() + sVar8.c()) + sVar5.c()) + sVar7.c()) / 4.0f), p6.a.c((((sVar6.d() + sVar8.d()) + sVar5.d()) + sVar7.d()) / 4.0f));
    }

    private s[] l(s[] sVarArr) {
        return d(sVarArr, this.f14631e * 2, i());
    }

    private static int m(int[] iArr, int i10) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f14626g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw m.b();
    }

    private boolean n(int i10, int i11) {
        return i10 >= 0 && i10 < this.f14627a.l() && i11 > 0 && i11 < this.f14627a.i();
    }

    private boolean o(s sVar) {
        return n(p6.a.c(sVar.c()), p6.a.c(sVar.d()));
    }

    private boolean p(C0212a c0212a, C0212a c0212a2, C0212a c0212a3, C0212a c0212a4) {
        C0212a c0212a5 = new C0212a(c0212a.a() - 3, c0212a.b() + 3);
        C0212a c0212a6 = new C0212a(c0212a2.a() - 3, c0212a2.b() - 3);
        C0212a c0212a7 = new C0212a(c0212a3.a() + 3, c0212a3.b() - 3);
        C0212a c0212a8 = new C0212a(c0212a4.a() + 3, c0212a4.b() + 3);
        int g10 = g(c0212a8, c0212a5);
        return g10 != 0 && g(c0212a5, c0212a6) == g10 && g(c0212a6, c0212a7) == g10 && g(c0212a7, c0212a8) == g10;
    }

    private b q(b bVar, s sVar, s sVar2, s sVar3, s sVar4) {
        i b10 = i.b();
        int i10 = i();
        float f10 = i10 / 2.0f;
        int i11 = this.f14631e;
        float f11 = f10 - i11;
        float f12 = f10 + i11;
        return b10.c(bVar, i10, i10, f11, f11, f12, f11, f12, f12, f11, f12, sVar.c(), sVar.d(), sVar2.c(), sVar2.d(), sVar3.c(), sVar3.d(), sVar4.c(), sVar4.d());
    }

    private int r(s sVar, s sVar2, int i10) {
        float b10 = b(sVar, sVar2);
        float f10 = b10 / i10;
        float c10 = sVar.c();
        float d10 = sVar.d();
        float c11 = ((sVar2.c() - sVar.c()) * f10) / b10;
        float d11 = (f10 * (sVar2.d() - sVar.d())) / b10;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = i12;
            if (this.f14627a.f(p6.a.c((f11 * c11) + c10), p6.a.c((f11 * d11) + d10))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public i6.a a(boolean z10) {
        s[] f10 = f(k());
        if (z10) {
            s sVar = f10[0];
            f10[0] = f10[2];
            f10[2] = sVar;
        }
        e(f10);
        b bVar = this.f14627a;
        int i10 = this.f14632f;
        return new i6.a(q(bVar, f10[i10 % 4], f10[(i10 + 1) % 4], f10[(i10 + 2) % 4], f10[(i10 + 3) % 4]), l(f10), this.f14628b, this.f14630d, this.f14629c);
    }
}
