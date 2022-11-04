package u7;

import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class l implements Comparable<l> {
    private static final f U3;
    private static final f V3 = f.Z(2147483647L);
    private static final f W3;

    /* renamed from: c */
    private int f23245c;

    /* renamed from: d */
    private a f23246d;

    /* renamed from: q */
    private f f23247q;

    /* renamed from: x */
    private int f23248x;

    /* renamed from: y */
    private boolean f23249y;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private int[] f23250a;

        /* renamed from: b */
        private int f23251b;

        a(int i10) {
            if (i10 >= 0) {
                int[] iArr = new int[4];
                this.f23250a = iArr;
                this.f23251b = i10 == 0 ? 0 : 1;
                iArr[0] = i10;
                return;
            }
            throw new IllegalArgumentException("val(" + i10 + ") is less than 0 ");
        }

        static a e(f fVar) {
            a aVar = new a(0);
            if (fVar.I1() < 0) {
                throw new IllegalArgumentException("bigintVal's sign(" + fVar.I1() + ") is less than 0 ");
            }
            byte[] r12 = fVar.r1(true);
            int length = r12.length;
            int max = Math.max(4, (length / 4) + 1);
            if (max > aVar.f23250a.length) {
                aVar.f23250a = new int[max];
            }
            aVar.f23251b = max;
            for (int i10 = 0; i10 < length; i10 += 4) {
                int i11 = r12[i10] & 255;
                int i12 = i10 + 1;
                if (i12 < length) {
                    i11 |= (r12[i12] & 255) << 8;
                }
                int i13 = i10 + 2;
                if (i13 < length) {
                    i11 |= (r12[i13] & 255) << 16;
                }
                int i14 = i10 + 3;
                if (i14 < length) {
                    i11 |= (r12[i14] & 255) << 24;
                }
                aVar.f23250a[i10 >> 2] = i11;
            }
            while (true) {
                int i15 = aVar.f23251b;
                if (i15 == 0 || aVar.f23250a[i15 - 1] != 0) {
                    break;
                }
                aVar.f23251b = i15 - 1;
            }
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0045 A[LOOP:0: B:11:0x001c->B:25:0x0045, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0044 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        u7.l.a a(int r9) {
            /*
                r8 = this;
                if (r9 < 0) goto L75
                if (r9 == 0) goto L63
                int r0 = r8.f23251b
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L1a
                int[] r0 = r8.f23250a
                int r0 = r0.length
                if (r0 != 0) goto L14
                r0 = 4
                int[] r0 = new int[r0]
                r8.f23250a = r0
            L14:
                int[] r0 = r8.f23250a
                r0[r2] = r2
                r8.f23251b = r1
            L1a:
                r0 = r2
                r3 = r0
            L1c:
                int r4 = r8.f23251b
                if (r0 >= r4) goto L49
                int[] r4 = r8.f23250a
                r5 = r4[r0]
                int r6 = r5 + r9
                int r6 = r6 + r3
                int r3 = r6 >> 31
                int r7 = r5 >> 31
                if (r3 != r7) goto L36
                r3 = 2147483647(0x7fffffff, float:NaN)
                r7 = r6 & r3
                r3 = r3 & r5
                if (r7 >= r3) goto L38
                goto L3f
            L36:
                if (r3 == 0) goto L3f
            L38:
                if (r6 != r5) goto L3d
                if (r9 == 0) goto L3d
                goto L3f
            L3d:
                r3 = r2
                goto L40
            L3f:
                r3 = r1
            L40:
                r4[r0] = r6
                if (r3 != 0) goto L45
                return r8
            L45:
                int r0 = r0 + 1
                r9 = r2
                goto L1c
            L49:
                if (r3 == 0) goto L63
                int[] r9 = r8.f23250a
                int r0 = r9.length
                if (r4 < r0) goto L5a
                int r4 = r4 + 20
                int[] r0 = new int[r4]
                int r4 = r9.length
                java.lang.System.arraycopy(r9, r2, r0, r2, r4)
                r8.f23250a = r0
            L5a:
                int[] r9 = r8.f23250a
                int r0 = r8.f23251b
                r9[r0] = r3
                int r0 = r0 + r1
                r8.f23251b = r0
            L63:
                int r9 = r8.f23251b
                if (r9 == 0) goto L74
                int[] r0 = r8.f23250a
                int r1 = r9 + (-1)
                r0 = r0[r1]
                if (r0 != 0) goto L74
                int r9 = r9 + (-1)
                r8.f23251b = r9
                goto L63
            L74:
                return r8
            L75:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "augend("
                r1.append(r2)
                r1.append(r9)
                java.lang.String r9 = ") is less than 0 "
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u7.l.a.a(int):u7.l$a");
        }

        boolean b() {
            int i10 = this.f23251b;
            return i10 == 0 || (i10 == 1 && (this.f23250a[0] >> 31) == 0);
        }

        int c(int i10) {
            int i11;
            if (i10 < 0 || (i11 = this.f23251b) > 1) {
                return 1;
            }
            if (i11 == 0) {
                return i10 == 0 ? 0 : -1;
            }
            int[] iArr = this.f23250a;
            if (iArr[0] == i10) {
                return 0;
            }
            if ((iArr[0] >> 31) == (i10 >> 31)) {
                if ((iArr[0] & Integer.MAX_VALUE) >= (i10 & Integer.MAX_VALUE)) {
                    return 1;
                }
            } else if ((iArr[0] >> 31) != 0) {
                return 1;
            }
            return -1;
        }

        a d() {
            a aVar = new a(0);
            int i10 = this.f23251b;
            if (i10 > aVar.f23250a.length) {
                aVar.f23250a = new int[i10];
            }
            System.arraycopy(this.f23250a, 0, aVar.f23250a, 0, i10);
            aVar.f23251b = this.f23251b;
            return aVar;
        }

        int[] f(int i10) {
            int[] iArr = new int[i10];
            System.arraycopy(this.f23250a, 0, iArr, 0, Math.min(i10, this.f23251b));
            return iArr;
        }

        a g(a aVar) {
            int i10 = this.f23251b;
            int i11 = aVar.f23251b;
            if (i10 <= i11) {
                i10 = i11;
            }
            int[] iArr = this.f23250a;
            if (iArr.length < i10) {
                int[] iArr2 = new int[i10 + 20];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                this.f23250a = iArr2;
            }
            int i12 = this.f23251b;
            int i13 = aVar.f23251b;
            if (i12 >= i13) {
                i12 = i13;
            }
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int[] iArr3 = this.f23250a;
                int i16 = iArr3[i15];
                int[] iArr4 = aVar.f23250a;
                int i17 = (i16 - iArr4[i15]) - i14;
                int i18 = i16 >> 31;
                if (i18 != (i17 >> 31) ? i18 != 0 : (i16 & Integer.MAX_VALUE) >= (Integer.MAX_VALUE & i17)) {
                    if (i16 != i17 || iArr4[i15] == 0) {
                        i14 = 0;
                        iArr3[i15] = i17;
                    }
                }
                i14 = 1;
                iArr3[i15] = i17;
            }
            if (i14 != 0) {
                while (i12 < this.f23251b) {
                    int[] iArr5 = this.f23250a;
                    int i19 = iArr5[i12];
                    int i20 = i12 >= aVar.f23251b ? 0 : aVar.f23250a[i12];
                    int i21 = (i19 - i20) - i14;
                    int i22 = i19 >> 31;
                    if (i22 != (i21 >> 31) ? i22 != 0 : (i19 & Integer.MAX_VALUE) >= (i21 & Integer.MAX_VALUE)) {
                        if (i19 != i21 || i20 == 0) {
                            i14 = 0;
                            iArr5[i12] = i21;
                            i12++;
                        }
                    }
                    i14 = 1;
                    iArr5[i12] = i21;
                    i12++;
                }
            }
            while (true) {
                int i23 = this.f23251b;
                if (i23 == 0 || this.f23250a[i23 - 1] != 0) {
                    break;
                }
                this.f23251b = i23 - 1;
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        u7.l.a h(int r9) {
            /*
                r8 = this;
                if (r9 < 0) goto L78
                if (r9 == 0) goto L77
                int r0 = r8.f23251b
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L1a
                int[] r0 = r8.f23250a
                int r0 = r0.length
                if (r0 != 0) goto L14
                r0 = 4
                int[] r0 = new int[r0]
                r8.f23250a = r0
            L14:
                int[] r0 = r8.f23250a
                r0[r1] = r1
                r8.f23251b = r2
            L1a:
                int[] r0 = r8.f23250a
                r3 = r0[r1]
                int r4 = r3 - r9
                int r5 = r3 >> 31
                int r6 = r4 >> 31
                r7 = 2147483647(0x7fffffff, float:NaN)
                if (r5 != r6) goto L30
                r5 = r3 & r7
                r6 = r4 & r7
                if (r5 >= r6) goto L32
                goto L39
            L30:
                if (r5 == 0) goto L39
            L32:
                if (r3 != r4) goto L37
                if (r9 == 0) goto L37
                goto L39
            L37:
                r9 = r1
                goto L3a
            L39:
                r9 = r2
            L3a:
                r0[r1] = r4
                if (r9 == 0) goto L66
                r0 = r2
            L3f:
                int r3 = r8.f23251b
                if (r0 >= r3) goto L66
                int[] r3 = r8.f23250a
                r4 = r3[r0]
                int r4 = r4 - r9
                r9 = r3[r0]
                int r9 = r9 >> 31
                int r5 = r4 >> 31
                if (r9 != r5) goto L58
                r9 = r3[r0]
                r9 = r9 & r7
                r5 = r4 & r7
                if (r9 >= r5) goto L60
                goto L5e
            L58:
                r9 = r3[r0]
                int r9 = r9 >> 31
                if (r9 != 0) goto L60
            L5e:
                r9 = r2
                goto L61
            L60:
                r9 = r1
            L61:
                r3[r0] = r4
                int r0 = r0 + 1
                goto L3f
            L66:
                int r9 = r8.f23251b
                if (r9 == 0) goto L77
                int[] r0 = r8.f23250a
                int r1 = r9 + (-1)
                r0 = r0[r1]
                if (r0 != 0) goto L77
                int r9 = r9 + (-1)
                r8.f23251b = r9
                goto L66
            L77:
                return r8
            L78:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "other("
                r1.append(r2)
                r1.append(r9)
                java.lang.String r9 = ") is less than 0 "
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u7.l.a.h(int):u7.l$a");
        }

        f i() {
            int i10 = this.f23251b;
            if (i10 == 1) {
                int[] iArr = this.f23250a;
                if ((iArr[0] >> 31) == 0) {
                    return f.Z(iArr[0]);
                }
            }
            if (i10 == 2) {
                int[] iArr2 = this.f23250a;
                if ((iArr2[1] >> 31) == 0) {
                    return f.Z((iArr2[0] & 4294967295L) | (iArr2[1] << 32));
                }
            }
            return f.a0(this.f23250a, i10);
        }

        int j() {
            if (this.f23251b == 0) {
                return 0;
            }
            return this.f23250a[0];
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
            return -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[LOOP:0: B:7:0x000c->B:17:0x002d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x002c A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int k(u7.l.a r8) {
            /*
                r7 = this;
                int r0 = r7.f23251b
                int r1 = r8.f23251b
                r2 = 1
                r3 = -1
                if (r0 == r1) goto Lc
                if (r0 >= r1) goto Lb
                r2 = r3
            Lb:
                return r2
            Lc:
                int r1 = r0 + (-1)
                if (r0 == 0) goto L2f
                int[] r0 = r7.f23250a
                r0 = r0[r1]
                int[] r4 = r8.f23250a
                r4 = r4[r1]
                int r5 = r0 >> 31
                int r6 = r4 >> 31
                if (r5 != r6) goto L27
                r5 = 2147483647(0x7fffffff, float:NaN)
                r6 = r0 & r5
                r5 = r5 & r4
                if (r6 >= r5) goto L2a
                goto L29
            L27:
                if (r5 != 0) goto L2a
            L29:
                return r3
            L2a:
                if (r0 == r4) goto L2d
                return r2
            L2d:
                r0 = r1
                goto Lc
            L2f:
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: u7.l.a.k(u7.l$a):int");
        }

        final boolean l() {
            return this.f23251b == 0 || (this.f23250a[0] & 1) == 0;
        }

        final int m() {
            return this.f23251b == 0 ? 0 : 1;
        }
    }

    static {
        f Z = f.Z(-2147483648L);
        U3 = Z;
        W3 = Z.L0();
    }

    public l(int i10) {
        this.f23245c = i10;
    }

    public static l o(l lVar) {
        l lVar2 = new l(lVar.f23245c);
        lVar2.f23248x = lVar.f23248x;
        lVar2.f23247q = lVar.f23247q;
        a aVar = lVar.f23246d;
        lVar2.f23246d = (aVar == null || lVar.f23248x != 1) ? null : aVar.d();
        lVar2.f23249y = true;
        return lVar2;
    }

    public static l q(f fVar) {
        if (fVar.B()) {
            return new l(fVar.t1());
        }
        if (fVar.I1() <= 0 || fVar.p0() >= 2048) {
            l lVar = new l(0);
            lVar.f23248x = 2;
            lVar.f23247q = fVar;
            return lVar;
        }
        l lVar2 = new l(0);
        lVar2.f23248x = 1;
        lVar2.f23246d = a.e(fVar);
        return lVar2;
    }

    public static l r(long j10) {
        return (j10 < -2147483648L || j10 > 2147483647L) ? q(f.Z(j10)) : new l((int) j10);
    }

    public static int[] s(f fVar, int i10) {
        return a.e(fVar).f(i10);
    }

    public static String v(int i10) {
        char[] cArr;
        if (i10 == 0) {
            return "0";
        }
        if (i10 == Integer.MIN_VALUE) {
            return "-2147483648";
        }
        boolean z10 = i10 < 0;
        if (z10) {
            i10 = -i10;
        }
        if (i10 < 100000) {
            int i11 = 5;
            if (z10) {
                cArr = new char[6];
            } else {
                cArr = new char[5];
                i11 = 4;
            }
            while (i10 > 9) {
                int i12 = (((i10 >> 1) * 52429) >> 18) & 16383;
                cArr[i11] = "0123456789ABCDEF".charAt(i10 - (i12 * 10));
                i10 = i12;
                i11--;
            }
            if (i10 != 0) {
                cArr[i11] = "0123456789ABCDEF".charAt(i10);
                i11--;
            }
            if (z10) {
                cArr[i11] = '-';
            } else {
                i11++;
            }
            return new String(cArr, i11, cArr.length - i11);
        }
        char[] cArr2 = new char[12];
        int i13 = 11;
        while (i10 >= 163840) {
            int i14 = i10 / 10;
            cArr2[i13] = "0123456789ABCDEF".charAt(i10 - (i14 * 10));
            i10 = i14;
            i13--;
        }
        while (i10 > 9) {
            int i15 = (((i10 >> 1) * 52429) >> 18) & 16383;
            cArr2[i13] = "0123456789ABCDEF".charAt(i10 - (i15 * 10));
            i10 = i15;
            i13--;
        }
        if (i10 != 0) {
            cArr2[i13] = "0123456789ABCDEF".charAt(i10);
            i13--;
        }
        if (z10) {
            cArr2[i13] = '-';
        } else {
            i13++;
        }
        return new String(cArr2, i13, 12 - i13);
    }

    public static String w(long j10) {
        if (j10 == Long.MIN_VALUE) {
            return "-9223372036854775808";
        }
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return "0";
        }
        boolean z10 = i10 < 0;
        int i11 = (int) j10;
        if (i11 == j10) {
            return v(i11);
        }
        char[] cArr = new char[24];
        int i12 = 23;
        if (z10) {
            j10 = -j10;
        }
        while (j10 >= 163840) {
            long j11 = j10 / 10;
            cArr[i12] = "0123456789ABCDEF".charAt((int) (j10 - (10 * j11)));
            i12--;
            j10 = j11;
        }
        while (j10 > 9) {
            long j12 = (((j10 >> 1) * 52429) >> 18) & 16383;
            cArr[i12] = "0123456789ABCDEF".charAt((int) (j10 - (j12 * 10)));
            i12--;
            j10 = j12;
        }
        if (j10 != 0) {
            cArr[i12] = "0123456789ABCDEF".charAt((int) j10);
            i12--;
        }
        if (z10) {
            cArr[i12] = '-';
        } else {
            i12++;
        }
        return new String(cArr, i12, 24 - i12);
    }

    public f A(f fVar) {
        int i10 = this.f23248x;
        if (i10 != 0) {
            if (i10 == 1) {
                return fVar.b1(this.f23246d.i());
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            return fVar.b1(this.f23247q);
        }
        return fVar.a1(this.f23245c);
    }

    public l B(l lVar) {
        f fVar;
        f Y;
        f Y2;
        int i10;
        int i11 = this.f23248x;
        if (i11 != 0) {
            if (i11 == 1) {
                if (lVar.f23248x == 1 && this.f23246d.k(lVar.f23246d) >= 0 && lVar.f23246d.c(0) >= 0) {
                    this.f23246d.g(lVar.f23246d);
                } else if (lVar.f23248x != 0 || (i10 = lVar.f23245c) < 0 || this.f23246d.c(i10) < 0) {
                    this.f23248x = 2;
                    fVar = this.f23246d.i();
                    this.f23247q = fVar;
                } else {
                    this.f23246d.h(lVar.f23245c);
                }
                return this;
            } else if (i11 != 2) {
                throw new IllegalStateException();
            }
        } else if (lVar.f23248x == 0) {
            int i12 = lVar.f23245c;
            if ((i12 >= 0 || Integer.MAX_VALUE + i12 >= this.f23245c) && (i12 <= 0 || Integer.MIN_VALUE + i12 <= this.f23245c)) {
                this.f23245c -= i12;
                return this;
            }
            this.f23248x = 2;
            Y = f.Y(this.f23245c);
            this.f23247q = Y;
            Y2 = f.Y(i12);
            this.f23247q = Y.n1(Y2);
            return this;
        } else {
            this.f23248x = 2;
            fVar = f.Y(this.f23245c);
            this.f23247q = fVar;
        }
        Y2 = lVar.F();
        Y = this.f23247q;
        this.f23247q = Y.n1(Y2);
        return this;
    }

    public l C(f fVar) {
        if (this.f23248x == 2) {
            this.f23247q = this.f23247q.n1(fVar);
            return this;
        }
        int I1 = fVar.I1();
        return I1 == 0 ? this : (I1 >= 0 || fVar.compareTo(U3) <= 0) ? (I1 <= 0 || fVar.compareTo(V3) > 0) ? d(fVar.L0()) : D(fVar.s1()) : g(-fVar.s1());
    }

    public l D(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            return d(W3);
        }
        if (this.f23248x != 0) {
            return g(-i10);
        }
        if ((i10 >= 0 || Integer.MAX_VALUE + i10 >= this.f23245c) && (i10 <= 0 || Integer.MIN_VALUE + i10 <= this.f23245c)) {
            this.f23245c -= i10;
        } else {
            this.f23248x = 2;
            f Y = f.Y(this.f23245c);
            this.f23247q = Y;
            this.f23247q = Y.n1(f.Y(i10));
        }
        return this;
    }

    public l E(long j10) {
        return (j10 < -2147483648L || j10 > 2147483647L) ? C(f.Z(j10)) : D((int) j10);
    }

    public f F() {
        int i10 = this.f23248x;
        if (i10 != 0) {
            if (i10 == 1) {
                return this.f23246d.i();
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            return this.f23247q;
        }
        return f.Y(this.f23245c);
    }

    public int G() {
        int i10 = this.f23248x;
        if (i10 != 0) {
            if (i10 == 1) {
                return this.f23246d.j();
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            return this.f23247q.s1();
        }
        return this.f23245c;
    }

    public int H(f fVar) {
        int i10 = this.f23248x;
        if (i10 != 0) {
            if (i10 == 1) {
                return F().compareTo(fVar);
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            return this.f23247q.compareTo(fVar);
        }
        return -fVar.C1(this.f23245c);
    }

    /* renamed from: I */
    public int compareTo(l lVar) {
        switch ((this.f23248x << 2) | lVar.f23248x) {
            case 0:
                int i10 = lVar.f23245c;
                int i11 = this.f23245c;
                if (i11 == i10) {
                    return 0;
                }
                return i11 < i10 ? -1 : 1;
            case 1:
                return -lVar.f23246d.c(this.f23245c);
            case 2:
                return -lVar.f23247q.C1(this.f23245c);
            case 3:
            case 7:
            default:
                throw new IllegalStateException();
            case 4:
                return this.f23246d.c(lVar.f23245c);
            case 5:
                return this.f23246d.k(lVar.f23246d);
            case 6:
                return F().compareTo(lVar.f23247q);
            case 8:
            case 9:
            case 10:
                return this.f23247q.compareTo(lVar.F());
        }
    }

    public final boolean J() {
        int i10 = this.f23248x;
        if (i10 == 0) {
            return (this.f23245c & 1) == 0;
        } else if (i10 == 1) {
            return this.f23246d.l();
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            return this.f23247q.F1();
        }
    }

    public final boolean K() {
        int i10 = this.f23248x;
        if (i10 == 0) {
            return this.f23245c == 0;
        } else if (i10 == 1) {
            return this.f23246d.m() == 0;
        } else if (i10 != 2) {
            throw new IllegalStateException();
        } else {
            return this.f23247q.H1();
        }
    }

    public final int L() {
        int i10 = this.f23248x;
        if (i10 == 0) {
            int i11 = this.f23245c;
            if (i11 == 0) {
                return 0;
            }
            return i11 < 0 ? -1 : 1;
        } else if (i10 == 1) {
            return this.f23246d.m();
        } else {
            if (i10 == 2) {
                return this.f23247q.I1();
            }
            return 0;
        }
    }

    public l a() {
        if (!this.f23249y) {
            if (this.f23248x != 0) {
                return L() < 0 ? x() : this;
            }
            int i10 = this.f23245c;
            if (i10 == Integer.MIN_VALUE) {
                return x();
            }
            this.f23245c = Math.abs(i10);
            return this;
        }
        throw new IllegalStateException();
    }

    public l b(l lVar) {
        f fVar;
        f Y;
        f Z;
        int i10;
        int i11 = this.f23248x;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
            } else if (lVar.f23248x == 0 && (i10 = lVar.f23245c) >= 0) {
                this.f23246d.a(i10);
                return this;
            } else {
                this.f23248x = 2;
                fVar = this.f23246d.i();
                this.f23247q = fVar;
            }
        } else if (lVar.f23248x == 0) {
            int i12 = this.f23245c;
            if ((i12 >= 0 || lVar.f23245c >= Integer.MIN_VALUE - i12) && (i12 <= 0 || lVar.f23245c <= Integer.MAX_VALUE - i12)) {
                this.f23245c = i12 + lVar.f23245c;
            } else if (lVar.f23245c >= 0) {
                this.f23248x = 1;
                a aVar = new a(i12);
                this.f23246d = aVar;
                aVar.a(lVar.f23245c);
            } else {
                this.f23248x = 2;
                Y = f.Y(i12);
                this.f23247q = Y;
                Z = f.Z(lVar.f23245c);
                this.f23247q = Y.d(Z);
            }
            return this;
        } else {
            this.f23248x = 2;
            fVar = f.Y(this.f23245c);
            this.f23247q = fVar;
        }
        Z = lVar.F();
        Y = this.f23247q;
        this.f23247q = Y.d(Z);
        return this;
    }

    public l d(f fVar) {
        f fVar2;
        int i10 = this.f23248x;
        if (i10 == 0) {
            return fVar.B() ? g(fVar.s1()) : b(q(fVar));
        }
        if (i10 == 1) {
            this.f23248x = 2;
            fVar2 = this.f23246d.i();
            this.f23247q = fVar2;
        } else if (i10 != 2) {
            throw new IllegalStateException();
        } else {
            fVar2 = this.f23247q;
        }
        this.f23247q = fVar2.d(fVar);
        return this;
    }

    public l g(int i10) {
        f Y;
        f Y2;
        int i11 = this.f23248x;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
            } else if (i10 >= 0) {
                this.f23246d.a(i10);
                return this;
            } else {
                this.f23248x = 2;
                this.f23247q = this.f23246d.i();
            }
            Y2 = f.Y(i10);
            Y = this.f23247q;
            this.f23247q = Y.d(Y2);
            return this;
        }
        int i12 = this.f23245c;
        if ((i12 >= 0 || i10 >= Integer.MIN_VALUE - i12) && (i12 <= 0 || i10 <= Integer.MAX_VALUE - i12)) {
            this.f23245c = i12 + i10;
        } else if (i10 >= 0) {
            this.f23248x = 1;
            a aVar = new a(i12);
            this.f23246d = aVar;
            aVar.a(i10);
        } else {
            this.f23248x = 2;
            Y = f.Y(i12);
            this.f23247q = Y;
            Y2 = f.Y(i10);
            this.f23247q = Y.d(Y2);
        }
        return this;
    }

    public l h(long j10) {
        return (j10 < -2147483648L || j10 > 2147483647L) ? d(f.Z(j10)) : g((int) j10);
    }

    public boolean j() {
        int i10 = this.f23248x;
        if (i10 != 0) {
            if (i10 == 1) {
                return this.f23246d.b();
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            return this.f23247q.B();
        }
        return true;
    }

    public int l(int i10) {
        f i11;
        int i12 = this.f23248x;
        if (i12 == 0) {
            int i13 = this.f23245c;
            if (i10 == i13) {
                return 0;
            }
            return i13 < i10 ? -1 : 1;
        }
        if (i12 == 1) {
            i11 = this.f23246d.i();
        } else if (i12 != 2) {
            throw new IllegalStateException();
        } else {
            i11 = this.f23247q;
        }
        return i11.compareTo(f.Y(i10));
    }

    public l m() {
        l lVar = new l(this.f23245c);
        lVar.f23248x = this.f23248x;
        lVar.f23247q = this.f23247q;
        a aVar = this.f23246d;
        lVar.f23246d = (aVar == null || this.f23248x != 1) ? null : aVar.d();
        return lVar;
    }

    public l p() {
        if (this.f23248x == 0) {
            int i10 = this.f23245c;
            if (i10 != Integer.MIN_VALUE) {
                this.f23245c = i10 - 1;
            } else {
                this.f23248x = 1;
                a e10 = a.e(U3);
                this.f23246d = e10;
                e10.h(1);
            }
            return this;
        }
        return D(1);
    }

    public l t() {
        if (this.f23248x == 0) {
            int i10 = this.f23245c;
            if (i10 != Integer.MAX_VALUE) {
                this.f23245c = i10 + 1;
            } else {
                this.f23248x = 1;
                this.f23246d = a.e(W3);
            }
            return this;
        }
        return g(1);
    }

    public String toString() {
        int i10 = this.f23248x;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? BuildConfig.FLAVOR : this.f23247q.toString() : this.f23246d.i().toString() : v(this.f23245c);
    }

    public l x() {
        f fVar;
        int i10 = this.f23248x;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f23248x = 2;
                fVar = this.f23246d.i();
                this.f23247q = fVar;
            } else if (i10 != 2) {
                throw new IllegalStateException();
            } else {
                fVar = this.f23247q;
            }
            this.f23247q = fVar.L0();
        } else {
            int i11 = this.f23245c;
            if (i11 == Integer.MIN_VALUE) {
                this.f23248x = 1;
                this.f23246d = a.e(W3);
            } else {
                this.f23245c = -i11;
            }
        }
        return this;
    }

    public l y(int i10) {
        f fVar;
        if (i10 != 0) {
            int i11 = this.f23248x;
            if (i11 != 0) {
                if (i11 == 1) {
                    fVar = this.f23246d.i();
                    this.f23247q = fVar;
                } else if (i11 != 2) {
                    throw new IllegalStateException();
                } else {
                    fVar = this.f23247q;
                }
                f T0 = fVar.T0(f.Z(i10));
                this.f23247q = T0;
                this.f23245c = T0.s1();
                this.f23248x = 0;
            } else {
                this.f23245c %= i10;
            }
            return this;
        }
        throw new ArithmeticException();
    }

    public l z(int i10) {
        this.f23245c = i10;
        this.f23248x = 0;
        return this;
    }
}
