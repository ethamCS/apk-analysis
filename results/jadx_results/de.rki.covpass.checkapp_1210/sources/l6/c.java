package l6;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private static final int[] f15836a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(o6.a aVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int l10 = aVar.l() / i10;
        for (int i12 = 0; i12 < l10; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= aVar.h((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    private static void b(o6.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bVar.o(i14, i13);
                    bVar.o(i14, i15);
                    bVar.o(i13, i14);
                    bVar.o(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bVar.o(i16, i16);
        int i17 = i16 + 1;
        bVar.o(i17, i16);
        bVar.o(i16, i17);
        int i18 = i10 + i11;
        bVar.o(i18, i16);
        bVar.o(i18, i17);
        bVar.o(i18, i18 - 1);
    }

    private static void c(o6.b bVar, boolean z10, int i10, o6.a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.h(i12)) {
                    bVar.o(i13, i11 - 5);
                }
                if (aVar.h(i12 + 7)) {
                    bVar.o(i11 + 5, i13);
                }
                if (aVar.h(20 - i12)) {
                    bVar.o(i13, i11 + 5);
                }
                if (aVar.h(27 - i12)) {
                    bVar.o(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.h(i12)) {
                bVar.o(i14, i11 - 7);
            }
            if (aVar.h(i12 + 10)) {
                bVar.o(i11 + 7, i14);
            }
            if (aVar.h(29 - i12)) {
                bVar.o(i14, i11 + 7);
            }
            if (aVar.h(39 - i12)) {
                bVar.o(i11 - 7, i14);
            }
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a d(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        o6.a aVar;
        int i15;
        int i16;
        o6.a a10 = new d(bArr).a();
        int i17 = 11;
        int l10 = ((a10.l() * i10) / 100) + 11;
        int l11 = a10.l() + l10;
        int i18 = 32;
        int i19 = 0;
        int i20 = 1;
        if (i11 == 0) {
            o6.a aVar2 = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 <= 32) {
                boolean z11 = i21 <= 3 ? i20 : i19;
                int i23 = z11 ? i21 + 1 : i21;
                int i24 = i(i23, z11);
                if (l11 <= i24) {
                    if (aVar2 == null || i22 != f15836a[i23]) {
                        int i25 = f15836a[i23];
                        i22 = i25;
                        aVar2 = h(a10, i25);
                    }
                    int i26 = i24 - (i24 % i22);
                    if ((!z11 || aVar2.l() <= (i22 << 6)) && aVar2.l() + l10 <= i26) {
                        aVar = aVar2;
                        i12 = i22;
                        z10 = z11 ? 1 : 0;
                        i13 = i23;
                        i14 = i24;
                    }
                }
                i21++;
                i20 = i20;
                i19 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z10 = i11 < 0;
        i13 = Math.abs(i11);
        if (z10) {
            i18 = 4;
        }
        if (i13 > i18) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
        }
        i14 = i(i13, z10);
        i12 = f15836a[i13];
        int i27 = i14 - (i14 % i12);
        aVar = h(a10, i12);
        if (aVar.l() + l10 > i27) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z10 && aVar.l() > (i12 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        o6.a e10 = e(aVar, i14, i12);
        int l12 = aVar.l() / i12;
        o6.a f10 = f(z10, i13, l12);
        if (!z10) {
            i17 = 14;
        }
        int i28 = i17 + (i13 << 2);
        int[] iArr = new int[i28];
        int i29 = 2;
        if (z10) {
            for (int i30 = i19; i30 < i28; i30++) {
                iArr[i30] = i30;
            }
            i15 = i28;
        } else {
            int i31 = i28 / 2;
            i15 = i28 + 1 + (((i31 - 1) / 15) * 2);
            int i32 = i15 / 2;
            for (int i33 = i19; i33 < i31; i33++) {
                iArr[(i31 - i33) - i20] = (i32 - i16) - 1;
                iArr[i31 + i33] = (i33 / 15) + i33 + i32 + i20;
            }
        }
        o6.b bVar = new o6.b(i15);
        int i34 = i19;
        int i35 = i34;
        while (i34 < i13) {
            int i36 = ((i13 - i34) << i29) + (z10 ? 9 : 12);
            int i37 = i19;
            while (i37 < i36) {
                int i38 = i37 << 1;
                while (i19 < i29) {
                    if (e10.h(i35 + i38 + i19)) {
                        int i39 = i34 << 1;
                        bVar.o(iArr[i39 + i19], iArr[i39 + i37]);
                    }
                    if (e10.h((i36 << 1) + i35 + i38 + i19)) {
                        int i40 = i34 << 1;
                        bVar.o(iArr[i40 + i37], iArr[((i28 - 1) - i40) - i19]);
                    }
                    if (e10.h((i36 << 2) + i35 + i38 + i19)) {
                        int i41 = (i28 - 1) - (i34 << 1);
                        bVar.o(iArr[i41 - i19], iArr[i41 - i37]);
                    }
                    if (e10.h((i36 * 6) + i35 + i38 + i19)) {
                        int i42 = i34 << 1;
                        bVar.o(iArr[((i28 - 1) - i42) - i37], iArr[i42 + i19]);
                    }
                    i19++;
                    i29 = 2;
                }
                i37++;
                i19 = 0;
                i29 = 2;
            }
            i35 += i36 << 3;
            i34++;
            i19 = 0;
            i29 = 2;
        }
        c(bVar, z10, i15, f10);
        int i43 = i15 / 2;
        if (z10) {
            b(bVar, i43, 5);
        } else {
            b(bVar, i43, 7);
            int i44 = 0;
            int i45 = 0;
            while (i45 < (i28 / 2) - 1) {
                for (int i46 = i43 & 1; i46 < i15; i46 += 2) {
                    int i47 = i43 - i44;
                    bVar.o(i47, i46);
                    int i48 = i43 + i44;
                    bVar.o(i48, i46);
                    bVar.o(i46, i47);
                    bVar.o(i46, i48);
                }
                i45 += 15;
                i44 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.c(z10);
        aVar3.f(i15);
        aVar3.d(i13);
        aVar3.b(l12);
        aVar3.e(bVar);
        return aVar3;
    }

    private static o6.a e(o6.a aVar, int i10, int i11) {
        q6.d dVar = new q6.d(g(i11));
        int i12 = i10 / i11;
        int[] a10 = a(aVar, i11, i12);
        dVar.b(a10, i12 - (aVar.l() / i11));
        o6.a aVar2 = new o6.a();
        aVar2.d(0, i10 % i11);
        for (int i13 : a10) {
            aVar2.d(i13, i11);
        }
        return aVar2;
    }

    static o6.a f(boolean z10, int i10, int i11) {
        int i12;
        o6.a aVar = new o6.a();
        int i13 = i10 - 1;
        if (z10) {
            aVar.d(i13, 2);
            aVar.d(i11 - 1, 6);
            i12 = 28;
        } else {
            aVar.d(i13, 5);
            aVar.d(i11 - 1, 11);
            i12 = 40;
        }
        return e(aVar, i12, 4);
    }

    private static q6.a g(int i10) {
        if (i10 != 4) {
            if (i10 == 6) {
                return q6.a.f19675j;
            }
            if (i10 == 8) {
                return q6.a.f19679n;
            }
            if (i10 == 10) {
                return q6.a.f19674i;
            }
            if (i10 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
            }
            return q6.a.f19673h;
        }
        return q6.a.f19676k;
    }

    static o6.a h(o6.a aVar, int i10) {
        o6.a aVar2 = new o6.a();
        int l10 = aVar.l();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < l10) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= l10 || aVar.h(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 != i11) {
                if (i16 == 0) {
                    i16 = i13 | 1;
                } else {
                    aVar2.d(i13, i10);
                    i12 += i10;
                }
            }
            aVar2.d(i16, i10);
            i12--;
            i12 += i10;
        }
        return aVar2;
    }

    private static int i(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }
}
