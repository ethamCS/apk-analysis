package s6;

import h6.h;
/* loaded from: classes.dex */
final class a {

    /* renamed from: a */
    private final o6.b f21473a;

    /* renamed from: b */
    private final o6.b f21474b;

    /* renamed from: c */
    private final e f21475c;

    public a(o6.b bVar) {
        int i10 = bVar.i();
        if (i10 < 8 || i10 > 144 || (i10 & 1) != 0) {
            throw h.b();
        }
        this.f21475c = j(bVar);
        o6.b a10 = a(bVar);
        this.f21473a = a10;
        this.f21474b = new o6.b(a10.l(), a10.i());
    }

    private o6.b a(o6.b bVar) {
        int f10 = this.f21475c.f();
        int e10 = this.f21475c.e();
        if (bVar.i() == f10) {
            int c10 = this.f21475c.c();
            int b10 = this.f21475c.b();
            int i10 = f10 / c10;
            int i11 = e10 / b10;
            o6.b bVar2 = new o6.b(i11 * b10, i10 * c10);
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 * c10;
                for (int i14 = 0; i14 < i11; i14++) {
                    int i15 = i14 * b10;
                    for (int i16 = 0; i16 < c10; i16++) {
                        int i17 = ((c10 + 2) * i12) + 1 + i16;
                        int i18 = i13 + i16;
                        for (int i19 = 0; i19 < b10; i19++) {
                            if (bVar.f(((b10 + 2) * i14) + 1 + i19, i17)) {
                                bVar2.o(i15 + i19, i18);
                            }
                        }
                    }
                }
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    private int d(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (h(i12, 0, i10, i11) ? 1 : 0) << 1;
        if (h(i12, 1, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i12, 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i11 - 1;
        if (h(0, i17, i10, i11)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (h(1, i17, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(2, i17, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        return h(3, i17, i10, i11) ? i20 | 1 : i20;
    }

    private int e(int i10, int i11) {
        int i12 = (h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i11 - 4, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i11 - 3, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        int i18 = i11 - 1;
        if (h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        return h(1, i18, i10, i11) ? i19 | 1 : i19;
    }

    private int f(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (h(i12, 0, i10, i11) ? 1 : 0) << 1;
        int i14 = i11 - 1;
        if (h(i12, i14, i10, i11)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i11 - 3;
        if (h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i11 - 2;
        if (h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (h(0, i14, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (h(1, i16, i10, i11)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(1, i18, i10, i11)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return h(1, i14, i10, i11) ? i22 | 1 : i22;
    }

    private int g(int i10, int i11) {
        int i12 = (h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i11 - 1;
        if (h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (h(1, i16, i10, i11)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (h(2, i16, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        return h(3, i16, i10, i11) ? i19 | 1 : i19;
    }

    private boolean h(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            i10 += i12;
            i11 += 4 - ((i12 + 4) & 7);
        }
        if (i11 < 0) {
            i11 += i13;
            i10 += 4 - ((i13 + 4) & 7);
        }
        this.f21474b.o(i11, i10);
        return this.f21473a.f(i11, i10);
    }

    private int i(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (h(i14, i15, i12, i13) ? 1 : 0) << 1;
        int i17 = i11 - 1;
        if (h(i14, i17, i12, i13)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i10 - 1;
        if (h(i19, i15, i12, i13)) {
            i18 |= 1;
        }
        int i20 = i18 << 1;
        if (h(i19, i17, i12, i13)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(i19, i11, i12, i13)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (h(i10, i15, i12, i13)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (h(i10, i17, i12, i13)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        return h(i10, i11, i12, i13) ? i24 | 1 : i24;
    }

    private static e j(o6.b bVar) {
        return e.h(bVar.i(), bVar.l());
    }

    public e b() {
        return this.f21475c;
    }

    public byte[] c() {
        byte[] bArr = new byte[this.f21475c.g()];
        int i10 = this.f21473a.i();
        int l10 = this.f21473a.l();
        int i11 = 0;
        int i12 = 4;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            if (i12 == i10 && i11 == 0 && !z10) {
                bArr[i13] = (byte) d(i10, l10);
                i12 -= 2;
                i11 += 2;
                i13++;
                z10 = true;
            } else {
                int i14 = i10 - 2;
                if (i12 == i14 && i11 == 0 && (l10 & 3) != 0 && !z11) {
                    bArr[i13] = (byte) e(i10, l10);
                    i12 -= 2;
                    i11 += 2;
                    i13++;
                    z11 = true;
                } else if (i12 == i10 + 4 && i11 == 2 && (l10 & 7) == 0 && !z12) {
                    bArr[i13] = (byte) f(i10, l10);
                    i12 -= 2;
                    i11 += 2;
                    i13++;
                    z12 = true;
                } else if (i12 == i14 && i11 == 0 && (l10 & 7) == 4 && !z13) {
                    bArr[i13] = (byte) g(i10, l10);
                    i12 -= 2;
                    i11 += 2;
                    i13++;
                    z13 = true;
                } else {
                    do {
                        if (i12 < i10 && i11 >= 0 && !this.f21474b.f(i11, i12)) {
                            bArr[i13] = (byte) i(i12, i11, i10, l10);
                            i13++;
                        }
                        i12 -= 2;
                        i11 += 2;
                        if (i12 < 0) {
                            break;
                        }
                    } while (i11 < l10);
                    int i15 = i12 + 1;
                    int i16 = i11 + 3;
                    do {
                        if (i15 >= 0 && i16 < l10 && !this.f21474b.f(i16, i15)) {
                            bArr[i13] = (byte) i(i15, i16, i10, l10);
                            i13++;
                        }
                        i15 += 2;
                        i16 -= 2;
                        if (i15 >= i10) {
                            break;
                        }
                    } while (i16 >= 0);
                    i12 = i15 + 3;
                    i11 = i16 + 1;
                }
            }
            if (i12 >= i10 && i11 >= l10) {
                break;
            }
        }
        if (i13 == this.f21475c.g()) {
            return bArr;
        }
        throw h.b();
    }
}
