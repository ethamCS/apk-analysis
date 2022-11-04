package u7;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* renamed from: c */
    private final boolean f23225c;

    /* renamed from: d */
    private final int f23226d;

    /* renamed from: q */
    private final short[] f23227q;

    /* renamed from: x */
    static final int[] f23223x = {36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 36, 36, 36, 36, 36, 36, 36, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 36, 36, 36, 36, 36, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 36, 36, 36, 36};

    /* renamed from: y */
    static final int[] f23224y = {1073741823, 715827881, 536870911, 429496728, 357913940, 306783377, 268435455, 238609293, 214748363, 195225785, 178956969, 165191048, 153391688, 143165575, 134217727, 126322566, 119304646, 113025454, 107374181, 102261125, 97612892, 93368853, 89478484, 85899344, 82595523, 79536430, 76695843, 74051159, 71582787, 69273665, 67108863, 65075261, 63161282, 61356674, 59652322};
    private static final f U3 = new f(1, new short[]{1}, false);
    private static final f V3 = new f(1, new short[]{10}, false);
    private static final f W3 = new f(0, new short[]{0}, false);
    private static final f[] X3 = Q(-24, 128);
    static final int[] Y3 = {0, 0, 1600, 1010, 800, 690, 619, 570, 534, 505, 482, 463, 447, 433, 421, 410, 400, 392, 384, 377, 371, 365, 359, 354, 349, 345, 341, 337, 333, 330, 327, 323, 320, 318, 315, 312, 310, 308};
    private static int[] Z3 = {0, 0, 128, 80, 64, 55, 49, 45, 42, 40, 38, 37, 35, 34, 33, 32, 32, 31, 30, 30, 29, 29, 28, 28, 27, 27, 27, 26, 26, 26, 26, 25, 25, 25, 25, 24, 24};

    public f(int i10, short[] sArr, boolean z10) {
        this.f23226d = i10;
        this.f23227q = sArr;
        this.f23225c = z10;
    }

    private int A() {
        int i10 = this.f23226d;
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        short s10 = this.f23227q[i11];
        int i12 = i11 << 1;
        return s10 == 0 ? i12 : (s10 >> 8) == 0 ? i12 + 1 : i12 + 2;
    }

    private static int A0(short[] sArr, int i10, short[] sArr2, int i11, int i12, short[] sArr3, int i13, int i14) {
        int i15;
        int i16 = 0;
        if (i12 == 0) {
            i15 = 0;
            while (i16 < i14) {
                int i17 = (sArr2[i11 + i16] & 65535) - i15;
                sArr[i10 + i16] = (short) i17;
                i15 = (i17 >> 31) & 1;
                i16++;
            }
        } else {
            int i18 = 0;
            while (i16 < i14) {
                int i19 = ((sArr3[i13 + i16] & 65535) * i12) + i18;
                int i20 = (sArr2[i11 + i16] & 65535) - (i19 & 65535);
                sArr[i10 + i16] = (short) i20;
                i18 = ((i19 >> 16) + ((i20 >> 31) & 1)) & 65535;
                i16++;
            }
            i15 = i18;
        }
        int i21 = (sArr2[i11 + i14] & 65535) - i15;
        sArr[i10 + i14] = (short) i21;
        return (i21 >> 31) & 1;
    }

    private static void A1(short[] sArr, int i10, int i11) {
        I(sArr, i10, i11, (short) 1);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i10 + i12;
            sArr[i13] = (short) (~sArr[i13]);
        }
    }

    private static int B1(short[] sArr, int i10, int i11, short[] sArr2, int i12, int i13) {
        if (i11 == 0) {
            return i13 == 0 ? 0 : -1;
        } else if (i13 == 0) {
            return 1;
        } else {
            if (i11 != i13) {
                return i11 > i13 ? 1 : -1;
            } else if (i11 == 1 && sArr[i10] == sArr2[i12]) {
                return 0;
            } else {
                int i14 = (i10 + i11) - 1;
                int i15 = (i12 + i11) - 1;
                while (true) {
                    int i16 = i11 - 1;
                    if (i11 == 0) {
                        return 0;
                    }
                    int i17 = sArr[i14] & 65535;
                    int i18 = 65535 & sArr2[i15];
                    if (i17 > i18) {
                        return 1;
                    }
                    if (i17 < i18) {
                        return -1;
                    }
                    i14--;
                    i15--;
                    i11 = i16;
                }
            }
        }
    }

    private static void D(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12, int i13, short[] sArr4, int i14, int i15) {
        int i16;
        int i17;
        short[] sArr5;
        short[] sArr6 = sArr2;
        int i18 = i11;
        int i19 = i13;
        int i20 = i15;
        Arrays.fill(sArr, i10, i10 + i20, (short) 0);
        int i21 = 0;
        int i22 = 0;
        while (i21 < i19) {
            int i23 = i19 - i21;
            if (i23 > i20) {
                X0(sArr2, i11, sArr2, i18 + i20 + i20, sArr3, i12 + i21, sArr4, i14, i15);
                int i24 = i20 + i20;
                i16 = i21;
                int i25 = i18;
                short[] sArr7 = sArr6;
                h(sArr2, i11, sArr2, i11, i24, sArr, i10 + i22, i15);
                System.arraycopy(sArr7, i25, sArr, i10 + i16, i24);
                i22 += i15;
                sArr5 = sArr7;
                i17 = i25;
            } else {
                i16 = i21;
                m(sArr2, i11, sArr2, i18 + i23 + i15, sArr3, i12 + i16, i23, sArr4, i14, i15);
                int i26 = i23 + i15;
                i17 = i18;
                sArr5 = sArr6;
                h(sArr2, i11, sArr2, i11, i26, sArr, i10 + i22, i15);
                System.arraycopy(sArr5, i17, sArr, i10 + i16, i26);
            }
            i21 = i16 + i15;
            i19 = i13;
            i20 = i15;
            sArr6 = sArr5;
            i18 = i17;
        }
    }

    private static f D0(short[] sArr, int i10, int i11, int i12) {
        if (i11 >= i10) {
            return Y(0);
        }
        int min = Math.min(i12, i10 - i11);
        while (min != 0 && sArr[(i11 + min) - 1] == 0) {
            min--;
        }
        if (min == 0) {
            return Y(0);
        }
        short[] sArr2 = new short[min];
        System.arraycopy(sArr, i11, sArr2, 0, min);
        return new f(min, sArr2, false);
    }

    static short[] E(short[] sArr, int i10) {
        if (i10 > sArr.length) {
            short[] sArr2 = new short[i10];
            System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
            return sArr2;
        }
        return sArr;
    }

    public static f E0(f fVar, f fVar2) {
        Objects.requireNonNull(fVar, "first");
        Objects.requireNonNull(fVar2, "second");
        return fVar.compareTo(fVar2) > 0 ? fVar : fVar2;
    }

    private static int F(short[] sArr, int i10, short[] sArr2, int i11, int i12) {
        while (true) {
            int i13 = i12 - 1;
            if (i12 != 0) {
                int i14 = sArr[i10 + i13] & 65535;
                int i15 = 65535 & sArr2[i11 + i13];
                if (i14 > i15) {
                    return 1;
                }
                if (i14 < i15) {
                    return -1;
                }
                i12 = i13;
            } else {
                return 0;
            }
        }
    }

    private static f F0(f fVar, f fVar2) {
        return E0(q(fVar), q(fVar2));
    }

    private static int G(short[] sArr, int i10, short[] sArr2, int i11, int i12) {
        if (sArr[(i10 + i12) - 1] != 0) {
            return 1;
        }
        int i13 = i12 - 1;
        while (true) {
            int i14 = i13 - 1;
            if (i13 == 0) {
                return 0;
            }
            int i15 = sArr[i10 + i14] & 65535;
            int i16 = 65535 & sArr2[i11 + i14];
            if (i15 > i16) {
                return 1;
            }
            if (i15 < i16) {
                return -1;
            }
            i13 = i14;
        }
    }

    public static f G0(f fVar, f fVar2) {
        Objects.requireNonNull(fVar, "first");
        Objects.requireNonNull(fVar2, "second");
        return fVar.compareTo(fVar2) < 0 ? fVar : fVar2;
    }

    public static int H(short[] sArr) {
        int length = sArr.length;
        while (length != 0 && sArr[length - 1] == 0) {
            length--;
        }
        return length;
    }

    private static f H0(f fVar, f fVar2) {
        return G0(q(fVar), q(fVar2));
    }

    private static int I(short[] sArr, int i10, int i11, short s10) {
        short s11 = sArr[i10];
        sArr[i10] = (short) (s11 - s10);
        if ((sArr[i10] & 65535) <= (s11 & 65535)) {
            return 0;
        }
        for (int i12 = 1; i12 < i11; i12++) {
            int i13 = i10 + i12;
            short s12 = sArr[i13];
            sArr[i13] = (short) (sArr[i13] - 1);
            if (s12 != 0) {
                return 0;
            }
        }
        return 1;
    }

    private int M0(f fVar) {
        int i10 = this.f23226d;
        int i11 = fVar.f23226d;
        return i10 == i11 ? F(this.f23227q, 0, fVar.f23227q, 0, i10) : i10 > i11 ? 1 : -1;
    }

    private static short N(int i10, short s10, boolean z10) {
        int i11 = s10 & 65535;
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            int i14 = i12 >> 31;
            i12 = (i12 << 1) | ((i10 >> 31) & 1);
            i10 <<= 1;
            int i15 = i14 | i12;
            if ((i15 >> 31) != 0 || i15 >= i11) {
                i12 -= i11;
                i10++;
            }
        }
        return (short) (z10 ? i12 & 65535 : i10 & 65535);
    }

    private static void O(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12, int i13, short[] sArr4, int i14, short[] sArr5, int i15, short[] sArr6) {
        int t02;
        int i16 = i12 + i13;
        if (B1(sArr2, i11 + i13, i13, sArr3, i16, i13) < 0) {
            Q0(sArr2, i11, sArr3, i16, sArr4, i14, sArr5, i15, i13);
            System.arraycopy(sArr5, i15, sArr6, i13 * 4, i13);
            int i17 = i13 * 5;
            Arrays.fill(sArr6, i17, i17 + i13, (short) 0);
        } else {
            for (int i18 = 0; i18 < i13; i18++) {
                sArr4[i14 + i18] = -1;
            }
            int i19 = i14 + i13;
            Arrays.fill(sArr4, i19, i19 + i13, (short) 0);
            int i20 = i13 * 4;
            System.arraycopy(sArr2, i11, sArr6, i20, i13 * 2);
            int i21 = i13 * 5;
            o1(sArr6, i21, sArr6, i21, sArr3, i16, i13);
            t0(sArr6, i21, i13, (short) g(sArr6, i20, sArr6, i20, sArr3, i16, i13));
        }
        int i22 = i13 * 2;
        m(sArr6, 0, sArr6, i22, sArr4, i14, i13, sArr3, i12, i13);
        int i23 = i13 * 3;
        System.arraycopy(sArr, i10, sArr6, i23, i13);
        Arrays.fill(sArr6, i22, i22 + i13, (short) 0);
        if (o1(sArr6, i23, sArr6, i23, sArr6, 0, i23) == 0) {
            System.arraycopy(sArr6, i23, sArr5, i15, i22);
        }
        do {
            t02 = t0(sArr6, i13 * 5, i13, (short) g(sArr6, i23, sArr6, i23, sArr3, i12, i22));
            I(sArr4, i14, i22, (short) 1);
        } while (t02 == 0);
        System.arraycopy(sArr6, i23, sArr5, i15, i22);
    }

    private static short P(int i10, short s10) {
        return (short) ((i10 >> 31) == 0 ? i10 / (s10 & 65535) : (int) ((i10 & 4294967295L) / (s10 & 65535)));
    }

    private static void P0(short[] sArr, int i10, int i11, short[] sArr2, int i12, int i13, short[] sArr3, int i14, short[] sArr4, int i15) {
        int i16;
        int i17;
        int min;
        int i18 = 201;
        while (i18 < i13) {
            i18 <<= 1;
        }
        short[] sArr5 = new short[i18];
        int i19 = i18 - i13;
        System.arraycopy(sArr2, i12, sArr5, i19, i13);
        int i20 = i11 + i19;
        int i21 = i13 - 1;
        if ((sArr2[i21] & 32768) == 0) {
            short s10 = sArr2[i21];
            int i22 = 0;
            for (int i23 = s10; (i23 & 32768) == 0; i23 <<= 1) {
                i22++;
            }
            int i24 = 0;
            for (int i25 = sArr[i11 - 1]; (i25 & 32768) == 0; i25 <<= 1) {
                i24++;
            }
            i17 = i24 < i22 ? 1 : 0;
            e1(sArr5, (0 + i18) - i13, i13, i22);
            i16 = i22;
        } else {
            i17 = 0;
            i16 = 0;
        }
        int i26 = ((i20 + i17) + (i18 - 1)) / i18;
        short[] sArr6 = new short[i26 * i18];
        int i27 = i19 + 0;
        System.arraycopy(sArr, i10, sArr6, i27, i11);
        e1(sArr6, i27, i11 + i17, i16);
        short[] sArr7 = new short[i18 * 5];
        int i28 = i26 - 1;
        while (i28 >= 0) {
            int i29 = i28 * i18;
            System.arraycopy(sArr6, 0 + i29, sArr7, i18, i18);
            int i30 = i18 * 3;
            int i31 = i18 << 1;
            Arrays.fill(sArr7, i30, i30 + i31, (short) 0);
            short[] sArr8 = sArr6;
            int i32 = i16;
            int i33 = i19;
            short[] sArr9 = sArr5;
            Q0(sArr7, i18, sArr5, 0, sArr7, i30, sArr7, 0, i18);
            if (sArr3 != null && (min = Math.min(i18, sArr3.length - i29)) > 0) {
                System.arraycopy(sArr7, i30, sArr3, i14 + i29, min);
            }
            System.arraycopy(sArr7, 0, sArr7, i31, i18);
            i28--;
            sArr5 = sArr9;
            sArr6 = sArr8;
            i16 = i32;
            i19 = i33;
        }
        int i34 = i16;
        int i35 = i19;
        if (sArr4 != null) {
            System.arraycopy(sArr7, i35, sArr4, i15, i13);
            g1(sArr4, i15, i13, i34);
        }
    }

    private static f[] Q(int i10, int i11) {
        f[] fVarArr = new f[(i11 - i10) + 1];
        for (int i12 = i10; i12 <= i11; i12++) {
            if (i12 == 0) {
                fVarArr[i12 - i10] = W3;
            } else if (i12 == 1) {
                fVarArr[i12 - i10] = U3;
            } else if (i12 == 10) {
                fVarArr[i12 - i10] = V3;
            } else {
                boolean z10 = false;
                short[] sArr = {(short) Math.abs(i12)};
                int i13 = i12 - i10;
                if (i12 < 0) {
                    z10 = true;
                }
                fVarArr[i13] = new f(1, sArr, z10);
            }
        }
        return fVarArr;
    }

    private static void Q0(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12, short[] sArr4, int i13, int i14) {
        if (i14 < 201 || (i14 & 1) == 1) {
            f0(sArr, i10, i14 * 2, sArr2, i11, i14, sArr3, i12, sArr4, i13);
            return;
        }
        int i15 = i14 >> 1;
        short[] sArr5 = new short[i15 * 10];
        Arrays.fill(sArr3, i12, (i14 * 2) + i12, (short) 0);
        Arrays.fill(sArr4, i13, i13 + i14, (short) 0);
        int i16 = i15 * 6;
        int i17 = i15 * 8;
        O(sArr, i10 + i15, sArr, i10 + i14, sArr2, i11, i15, sArr5, i16, sArr5, i17, sArr5);
        O(sArr, i10, sArr5, i17, sArr2, i11, i15, sArr3, i12, sArr4, i13, sArr5);
        System.arraycopy(sArr5, i16, sArr3, i12 + i15, i15);
    }

    private static void R(short[] sArr, short[] sArr2, int i10, short s10) {
        if (s10 == 2) {
            U(sArr, 0, sArr2, 0, i10);
        } else if (s10 != 10) {
            S(sArr, 0, sArr2, 0, i10, s10);
        } else {
            T(sArr, 0, sArr2, 0, i10);
        }
    }

    private static void R0(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12, int i13) {
        if (i13 <= 10) {
            if (i13 == 2) {
                w(sArr, i10, sArr3, i12);
            } else if (i13 == 4) {
                x(sArr, i10, sArr3, i12);
            } else if (i13 != 8) {
                Z0(sArr, i10, sArr3, i12, i13);
            } else {
                y(sArr, i10, sArr3, i12);
            }
        } else if (i13 >= 400) {
            z1(sArr, i10, sArr3, i12, i13, sArr3, i12, i13);
        } else if (i13 >= 100) {
            y1(sArr, i10, sArr3, i12, i13, sArr3, i12, i13);
        } else if ((i13 & 1) != 0) {
            X0(sArr, i10, sArr2, i11, sArr3, i12, sArr3, i12, i13);
        } else {
            int i14 = i13 >> 1;
            int i15 = i11 + i13;
            R0(sArr, i10, sArr2, i15, sArr3, i12, i14);
            int i16 = i10 + i13;
            int i17 = i12 + i14;
            R0(sArr, i16, sArr2, i15, sArr3, i17, i14);
            X0(sArr2, i11, sArr2, i15, sArr3, i12, sArr3, i17, i14);
            int i18 = i10 + i14;
            t0(sArr, i16 + i14, i14, (short) (g(sArr, i18, sArr, i18, sArr2, i11, i13) + g(sArr, i18, sArr, i18, sArr2, i11, i13)));
        }
    }

    private static short S(short[] sArr, int i10, short[] sArr2, int i11, int i12, short s10) {
        int i13;
        int i14;
        int i15 = s10 & 65535;
        int i16 = (i11 + i12) - 1;
        int i17 = (i10 + i12) - 1;
        int i18 = 0;
        if (i15 < 32768) {
            i13 = 0;
            while (i18 < i12) {
                int i19 = (i13 << 16) | (sArr2[i16] & 65535);
                int i20 = i19 / i15;
                sArr[i17] = (short) i20;
                i13 = i19 - (i20 * i15);
                i16--;
                i17--;
                i18++;
            }
        } else {
            int i21 = 0;
            while (i18 < i12) {
                int i22 = (i21 << 16) | (sArr2[i16] & 65535);
                if ((i22 >> 31) == 0) {
                    i14 = i22 / i15;
                    sArr[i17] = (short) i14;
                } else {
                    i14 = P(i22, s10) & 65535;
                    sArr[i17] = (short) i14;
                }
                i21 = i22 - (i14 * i15);
                i16--;
                i17--;
                i18++;
            }
            i13 = i21;
        }
        return (short) i13;
    }

    private static short T(short[] sArr, int i10, short[] sArr2, int i11, int i12) {
        int i13 = (i11 + i12) - 1;
        int i14 = (i10 + i12) - 1;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i15 << 16) | (sArr2[i13] & 65535);
            int i18 = i17 >= 81920 ? i17 / 10 : ((52429 * i17) >> 19) & 8191;
            sArr[i14] = (short) i18;
            i15 = i17 - (i18 * 10);
            i13--;
            i14--;
        }
        return (short) i15;
    }

    private static short U(short[] sArr, int i10, short[] sArr2, int i11, int i12) {
        int i13 = (i11 + i12) - 1;
        int i14 = (i10 + i12) - 1;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i15 << 16) | (sArr2[i13] & 65535);
            sArr[i14] = (short) (i17 >> 1);
            i15 = i17 & 1;
            i13--;
            i14--;
        }
        return (short) i15;
    }

    private static short U0(int i10, short s10) {
        return (i10 >> 31) == 0 ? (short) ((i10 % (s10 & 65535)) & 65535) : N(i10, s10, true);
    }

    private static short V(short[] sArr, int i10, short s10) {
        short s11 = 0;
        while (true) {
            int i11 = i10 - 1;
            if (i10 > 0) {
                s11 = U0((sArr[i11] & 65535) | (s11 << 16), s10);
                i10 = i11;
            } else {
                return s11;
            }
        }
    }

    private static void V0(char[] cArr, int i10, int i11) {
        int i12 = i11 >> 1;
        int i13 = (i11 + i10) - 1;
        int i14 = 0;
        while (i14 < i12) {
            int i15 = i10 + i14;
            char c10 = cArr[i15];
            cArr[i15] = cArr[i13];
            cArr[i13] = c10;
            i14++;
            i13--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        if ((r11[(r12 + r13) - 1] & 128) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
        if ((r11[r12] & 128) != 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u7.f W(byte[] r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.f.W(byte[], int, int, boolean):u7.f");
    }

    private static void W0(f[] fVarArr, f fVar) {
        if (fVarArr[0].compareTo(fVarArr[1]) > 0) {
            f fVar2 = fVarArr[0];
            f fVar3 = fVarArr[1];
            f[] K = fVar2.K(fVar3);
            if (q(K[1]).compareTo(fVar) <= 0) {
                K[0] = K[0].l1(1);
                if (K[0].I1() < 0) {
                    throw new IllegalStateException();
                }
                K[1] = K[1].d(fVar3);
            }
            fVarArr[3] = fVarArr[3].d(fVarArr[2].K0(K[0]));
            fVarArr[5] = fVarArr[5].d(fVarArr[4].K0(K[0]));
            fVarArr[0] = K[1];
            return;
        }
        f fVar4 = fVarArr[1];
        f fVar5 = fVarArr[0];
        f[] K2 = fVar4.K(fVar5);
        if (q(K2[1]).compareTo(fVar) <= 0) {
            K2[0] = K2[0].l1(1);
            if (K2[0].I1() < 0) {
                throw new IllegalStateException();
            }
            K2[1] = K2[1].d(fVar5);
        }
        fVarArr[2] = fVarArr[2].d(fVarArr[3].K0(K2[0]));
        fVarArr[4] = fVarArr[4].d(fVarArr[5].K0(K2[0]));
        fVarArr[1] = K2[1];
    }

    public static f X(byte[] bArr, boolean z10) {
        Objects.requireNonNull(bArr, "bytes");
        return W(bArr, 0, bArr.length, z10);
    }

    private static void X0(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12, short[] sArr4, int i13, int i14) {
        int i15;
        if (i14 <= 10) {
            if (i14 == 2) {
                s(sArr, i10, sArr3, i12, sArr4, i13);
            } else if (i14 == 4) {
                t(sArr, i10, sArr3, i12, sArr4, i13);
            } else if (i14 != 8) {
                Y0(sArr, i10, sArr3, i12, i14, sArr4, i13, i14);
            } else {
                v(sArr, i10, sArr3, i12, sArr4, i13);
            }
        } else if (i14 >= 400) {
            z1(sArr, i10, sArr3, i12, i14, sArr4, i13, i14);
        } else if (i14 >= 100) {
            y1(sArr, i10, sArr3, i12, i14, sArr4, i13, i14);
        } else {
            int i16 = i14;
            while (i16 != 0 && sArr3[(i12 + i16) - 1] == 0) {
                i16--;
            }
            int i17 = i14;
            while (i17 != 0 && sArr4[(i13 + i17) - 1] == 0) {
                i17--;
            }
            int i18 = 0;
            if (i16 == 0 || i17 == 0) {
                Arrays.fill(sArr, i10, (i14 << 1) + i10, (short) 0);
            } else if ((i14 & 1) == 0) {
                int i19 = i14 >> 1;
                if (i16 <= i19 && i17 <= i19) {
                    int i20 = i10 + i14;
                    Arrays.fill(sArr, i20, i20 + i14, (short) 0);
                    if (i19 == 8) {
                        v(sArr, i10, sArr3, i12, sArr4, i13);
                        return;
                    } else {
                        X0(sArr, i10, sArr2, i11, sArr3, i12, sArr4, i13, i19);
                        return;
                    }
                }
                int i21 = i10 + i14;
                int i22 = i21 + i19;
                int i23 = i10 + i19;
                int i24 = i11 + i14;
                int i25 = i12 + i19;
                int i26 = F(sArr3, i12, sArr3, i25, i19) > 0 ? 0 : i19;
                int i27 = i26;
                o1(sArr, i10, sArr3, i12 + i26, sArr3, i12 + (i19 ^ i26), i19);
                int i28 = i13 + i19;
                if (F(sArr4, i13, sArr4, i28, i19) <= 0) {
                    i18 = i19;
                }
                o1(sArr, i23, sArr4, i13 + i18, sArr4, i13 + (i19 ^ i18), i19);
                int i29 = i18;
                X0(sArr, i21, sArr2, i24, sArr3, i25, sArr4, i28, i19);
                X0(sArr2, i11, sArr2, i24, sArr, i10, sArr, i23, i19);
                X0(sArr, i10, sArr2, i24, sArr3, i12, sArr4, i13, i19);
                int g10 = g(sArr, i21, sArr, i21, sArr, i23, i19);
                int g11 = g10 + g(sArr, i23, sArr, i21, sArr, i10, i19);
                int g12 = g10 + g(sArr, i21, sArr, i21, sArr, i22, i19);
                int o12 = (i27 == i29 ? g12 - o1(sArr, i23, sArr, i23, sArr2, i11, i14) : g12 + g(sArr, i23, sArr, i23, sArr2, i11, i14)) + t0(sArr, i21, i19, (short) g11);
                if (o12 == 0) {
                    return;
                }
                t0(sArr, i22, i19, (short) o12);
            } else {
                int i30 = i14 >> 1;
                int i31 = i14 - i30;
                int i32 = i12 + i31;
                int i33 = G(sArr3, i12, sArr3, i32, i31) > 0 ? 0 : i31;
                if (i33 == 0) {
                    p1(sArr, i10, sArr3, i12, sArr3, i32, i31);
                } else {
                    q1(sArr, i10, sArr3, i32, sArr3, i12, i31);
                }
                int i34 = i13 + i31;
                if (G(sArr4, i13, sArr4, i34, i31) <= 0) {
                    i18 = i31;
                }
                if (i18 == 0) {
                    i15 = i34;
                    p1(sArr2, i11, sArr4, i13, sArr4, i34, i31);
                } else {
                    i15 = i34;
                    q1(sArr2, i11, sArr4, i15, sArr4, i13, i31);
                }
                int i35 = i30 << 1;
                int i36 = i31 << 1;
                int i37 = i11 + i35;
                int i38 = i18;
                int i39 = i33;
                X0(sArr2, i37, sArr, i10 + i35, sArr, i10, sArr2, i11, i31);
                short s10 = sArr2[i37];
                int i40 = i37 + 1;
                short s11 = sArr2[i40];
                int i41 = i10 + i36;
                X0(sArr, i41, sArr, i10, sArr3, i32, sArr4, i15, i30);
                X0(sArr, i10, sArr2, i11, sArr3, i12, sArr4, i13, i31);
                sArr2[i37] = s10;
                sArr2[i40] = s11;
                int i42 = i10 + i31;
                int g13 = g(sArr, i41, sArr, i41, sArr, i42, i31);
                int g14 = g13 + g(sArr, i42, sArr, i41, sArr, i10, i31);
                int i43 = i41 + i31;
                int i44 = i31 - 2;
                int h10 = g13 + h(sArr, i41, sArr, i41, i31, sArr, i43, i44);
                int o13 = (i39 == i38 ? h10 - o1(sArr, i42, sArr, i42, sArr2, i37, i36) : h10 + g(sArr, i42, sArr, i42, sArr2, i37, i36)) + t0(sArr, i41, i31, (short) g14);
                if (o13 == 0) {
                    return;
                }
                t0(sArr, i43, i44, (short) o13);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r3[1] == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u7.f Y(int r7) {
        /*
            r0 = -24
            if (r7 < r0) goto Le
            r1 = 128(0x80, float:1.794E-43)
            if (r7 > r1) goto Le
            u7.f[] r1 = u7.f.X3
            int r7 = r7 - r0
            r7 = r1[r7]
            return r7
        Le:
            r0 = 0
            r1 = 1
            if (r7 >= 0) goto L14
            r2 = r1
            goto L15
        L14:
            r2 = r0
        L15:
            int r3 = r7 >> 15
            r4 = 65535(0xffff, float:9.1834E-41)
            r5 = 2
            if (r3 != 0) goto L27
            short[] r3 = new short[r5]
            if (r2 == 0) goto L22
            int r7 = -r7
        L22:
            r7 = r7 & r4
            short r7 = (short) r7
            r3[r0] = r7
            goto L46
        L27:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r3) goto L32
            short[] r3 = new short[r5]
            r3 = {x004c: FILL_ARRAY_DATA  , data: [0, -32768} // fill-array
        L30:
            r1 = r5
            goto L46
        L32:
            short[] r3 = new short[r5]
            if (r2 == 0) goto L37
            int r7 = -r7
        L37:
            r6 = r7 & r4
            short r6 = (short) r6
            r3[r0] = r6
            int r7 = r7 >> 16
            r7 = r7 & r4
            short r7 = (short) r7
            r3[r1] = r7
            short r7 = r3[r1]
            if (r7 != 0) goto L30
        L46:
            u7.f r7 = new u7.f
            r7.<init>(r1, r3, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.f.Y(int):u7.f");
    }

    private static void Y0(short[] sArr, int i10, short[] sArr2, int i11, int i12, short[] sArr3, int i13, int i14) {
        if (i12 < i14) {
            int i15 = sArr2[i11] & 65535;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = ((sArr3[i13 + i17] & 65535) * i15) + i16;
                sArr[i10 + i17] = (short) i18;
                i16 = (i18 >> 16) & 65535;
            }
            sArr[i10 + i14] = (short) i16;
            for (int i19 = 1; i19 < i12; i19++) {
                int i20 = i10 + i19;
                int i21 = sArr2[i11 + i19] & 65535;
                int i22 = 0;
                int i23 = 0;
                int i24 = i20;
                while (i22 < i14) {
                    int i25 = ((sArr3[i13 + i22] & 65535) * i21) + i23 + (sArr[i24] & 65535);
                    sArr[i24] = (short) i25;
                    i23 = (i25 >> 16) & 65535;
                    i22++;
                    i24++;
                }
                sArr[i20 + i14] = (short) i23;
            }
            return;
        }
        int i26 = sArr3[i13] & 65535;
        int i27 = 0;
        for (int i28 = 0; i28 < i12; i28++) {
            int i29 = ((sArr2[i11 + i28] & 65535) * i26) + i27;
            sArr[i10 + i28] = (short) i29;
            i27 = (i29 >> 16) & 65535;
        }
        sArr[i10 + i12] = (short) i27;
        for (int i30 = 1; i30 < i14; i30++) {
            int i31 = i10 + i30;
            int i32 = sArr3[i13 + i30] & 65535;
            int i33 = 0;
            int i34 = 0;
            int i35 = i31;
            while (i33 < i12) {
                int i36 = ((sArr2[i11 + i33] & 65535) * i32) + i34 + (sArr[i35] & 65535);
                sArr[i35] = (short) i36;
                i34 = (i36 >> 16) & 65535;
                i33++;
                i35++;
            }
            sArr[i31 + i12] = (short) i34;
        }
    }

    public static f Z(long j10) {
        short[] sArr;
        long j11;
        if (j10 < -24 || j10 > 128) {
            int i10 = 1;
            boolean z10 = j10 < 0;
            if ((j10 >> 16) == 0) {
                sArr = new short[1];
                int i11 = (int) j10;
                if (z10) {
                    i11 = -i11;
                }
                sArr[0] = (short) (i11 & 65535);
            } else if ((j10 >> 31) == 0) {
                sArr = new short[2];
                int i12 = (int) j10;
                if (z10) {
                    i12 = -i12;
                }
                sArr[0] = (short) (i12 & 65535);
                sArr[1] = (short) ((i12 >> 16) & 65535);
                i10 = 2;
            } else if (j10 == Long.MIN_VALUE) {
                sArr = new short[]{0, 0, 0, Short.MIN_VALUE};
                i10 = 4;
            } else {
                sArr = new short[4];
                if (z10) {
                    j10 = -j10;
                }
                sArr[0] = (short) (j10 & 65535);
                sArr[1] = (short) (j11 & 65535);
                long j12 = (j10 >> 16) >> 16;
                sArr[2] = (short) (j12 & 65535);
                sArr[3] = (short) ((j12 >> 16) & 65535);
                i10 = 4;
                while (i10 != 0 && sArr[i10 - 1] == 0) {
                    i10--;
                }
            }
            return new f(i10, sArr, z10);
        }
        return X3[(int) (j10 - (-24))];
    }

    private static void Z0(short[] sArr, int i10, short[] sArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 + i13;
            int i15 = sArr2[i11 + i13] & 65535;
            short s10 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = ((sArr2[i11 + i16] & 65535) * i15) + (s10 & 65535);
                if (i13 != 0) {
                    i17 += sArr[i14 + i16] & 65535;
                }
                sArr[i14 + i16] = (short) i17;
                s10 = (short) (i17 >> 16);
            }
            sArr[i14 + i12] = s10;
        }
    }

    public static f a0(int[] iArr, int i10) {
        int i11 = i10 << 1;
        short[] sArr = new short[i11];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = iArr[i12];
            sArr[i13] = (short) i14;
            sArr[i13 + 1] = (short) (i14 >> 16);
            i12++;
            i13 += 2;
        }
        while (i11 != 0 && sArr[i11 - 1] == 0) {
            i11--;
        }
        return i11 == 0 ? Y(0) : new f(i11, sArr, false);
    }

    public static f b0(String str, int i10, int i11, int i12) {
        Objects.requireNonNull(str, "str");
        return g.b(str, i10, i11, i12, true);
    }

    public static f c0(String str, int i10, int i11) {
        Objects.requireNonNull(str, "str");
        return b0(str, 10, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return r14 << r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long e0(long r12, long r14) {
        /*
            r0 = 0
            r1 = r0
        L2:
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L42
            int r5 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r5 == 0) goto L42
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 == 0) goto L42
            r6 = 1
            long r8 = r12 & r6
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r8 = 1
            if (r4 != 0) goto L1b
            r4 = r8
            goto L1c
        L1b:
            r4 = r0
        L1c:
            long r6 = r6 & r14
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L23
            r2 = r8
            goto L24
        L23:
            r2 = r0
        L24:
            if (r4 == 0) goto L2d
            if (r2 == 0) goto L2d
            int r1 = r1 + 1
            long r12 = r12 >> r8
        L2b:
            long r14 = r14 >> r8
            goto L2
        L2d:
            if (r4 == 0) goto L33
            if (r2 != 0) goto L33
        L31:
            long r12 = r12 >> r8
            goto L2
        L33:
            if (r4 != 0) goto L38
            if (r2 == 0) goto L38
            goto L2b
        L38:
            if (r5 < 0) goto L3c
            long r12 = r12 - r14
            goto L31
        L3c:
            long r14 = r14 - r12
            long r14 = r14 >> r8
            r10 = r12
            r12 = r14
            r14 = r10
            goto L2
        L42:
            if (r4 != 0) goto L47
            long r12 = r14 << r1
            goto L48
        L47:
            long r12 = r12 << r1
        L48:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.f.e0(long, long):long");
    }

    private static short e1(short[] sArr, int i10, int i11, int i12) {
        int i13 = 0;
        if (i12 != 0) {
            int i14 = 16 - i12;
            int i15 = 0;
            while (i13 < i11) {
                short s10 = sArr[i10];
                sArr[i10] = (short) (i15 | (s10 << i12));
                i15 = (65535 & s10) >> i14;
                i13++;
                i10++;
            }
            i13 = i15;
        }
        return (short) i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
        if (((r16 * r4) & 4294967295L) > r1) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f0(short[] r26, int r27, int r28, short[] r29, int r30, int r31, short[] r32, int r33, short[] r34, int r35) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.f.f0(short[], int, int, short[], int, int, short[], int, short[], int):void");
    }

    private static void f1(short[] sArr, int i10, int i11, int i12) {
        int min = Math.min(i12, i11);
        if (min != 0) {
            for (int i13 = i11 - 1; i13 >= min; i13--) {
                int i14 = i10 + i13;
                sArr[i14] = sArr[i14 - min];
            }
            Arrays.fill(sArr, i10, min + i10, (short) 0);
        }
    }

    private static int g(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12, int i13) {
        int i14 = 0;
        boolean z10 = (i13 & 1) == 0;
        if (!z10) {
            i13--;
        }
        int i15 = 0;
        while (i14 < i13) {
            int i16 = (sArr2[i11 + i14] & 65535) + (sArr3[i12 + i14] & 65535) + (i15 >> 16);
            sArr[i10 + i14] = (short) i16;
            int i17 = i14 + 1;
            i15 = (sArr2[i11 + i17] & 65535) + (65535 & sArr3[i12 + i17]) + (i16 >> 16);
            sArr[i10 + i17] = (short) i15;
            i14 = i17 + 1;
        }
        if (!z10) {
            i15 = (sArr2[i11 + i13] & 65535) + (sArr3[i12 + i13] & 65535) + (i15 >> 16);
            sArr[i10 + i13] = (short) i15;
        }
        return i15 >> 16;
    }

    private static short g1(short[] sArr, int i10, int i11, int i12) {
        short s10 = 0;
        if (i12 != 0) {
            while (i11 > 0) {
                int i13 = (i10 + i11) - 1;
                int i14 = sArr[i13] & 65535;
                sArr[i13] = (short) ((s10 & 65535) | ((i14 >> i12) & 65535));
                s10 = (short) (i14 << (16 - i12));
                i11--;
            }
        }
        return s10;
    }

    private static int h(short[] sArr, int i10, short[] sArr2, int i11, int i12, short[] sArr3, int i13, int i14) {
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            i15 = ((short) (i15 >> 16)) + (sArr2[i11 + i16] & 65535) + (65535 & sArr3[i13 + i16]);
            sArr[i10 + i16] = (short) i15;
        }
        while (i14 < i12) {
            i15 = (sArr2[i11 + i14] & 65535) + ((short) (i15 >> 16));
            sArr[i10 + i14] = (short) i15;
            i14++;
        }
        return (i15 >> 16) & 65535;
    }

    private static short h1(short[] sArr, int i10, int i11, int i12) {
        int i13 = 16 - i12;
        short s10 = (short) (65535 << i13);
        if (i12 != 0) {
            while (i11 > 0) {
                int i14 = (i10 + i11) - 1;
                int i15 = sArr[i14] & 65535;
                sArr[i14] = (short) ((s10 & 65535) | (i15 >> i12));
                s10 = (short) (i15 << i13);
                i11--;
            }
        }
        return s10;
    }

    private static void i1(short[] sArr, int i10, int i11, int i12) {
        int min = Math.min(i12, i11);
        if (min != 0) {
            for (int i13 = 0; i13 + min < i11; i13++) {
                int i14 = i10 + i13;
                sArr[i14] = sArr[i14 + min];
            }
            int i15 = i10 + (i11 - min);
            for (int i16 = 0; i16 < min; i16++) {
                sArr[i15 + i16] = -1;
            }
        }
    }

    private static short[] j1(short[] sArr, int i10) {
        if (sArr.length <= 32 || i10 >= sArr.length || sArr.length - i10 < 16) {
            return sArr;
        }
        short[] sArr2 = new short[i10];
        System.arraycopy(sArr, 0, sArr2, 0, Math.min(i10, sArr.length));
        return sArr2;
    }

    private static f k1(f fVar, f fVar2) {
        f F0 = F0(fVar, fVar2);
        f[] fVarArr = {fVar, fVar2};
        while (F0.C1(48) >= 0) {
            f c12 = F0.c1(1);
            f d12 = fVarArr[0].d1(c12);
            f C0 = fVarArr[0].C0(c12);
            f d13 = fVarArr[1].d1(c12);
            f C02 = fVarArr[1].C0(c12);
            f[] s02 = s0(d12, d13);
            if (s02 == null) {
                break;
            }
            f n12 = C0.K0(s02[5]).n1(C02.K0(s02[3]));
            f n13 = C02.K0(s02[2]).n1(C0.K0(s02[4]));
            f d10 = n12.d(s02[0].b1(c12));
            f d11 = n13.d(s02[1].b1(c12));
            if (d10.I1() < 0 || d11.I1() < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("eia=" + fVarArr[0] + "\n");
                sb2.append("eib=" + fVarArr[1] + "\n");
                for (int i10 = 0; i10 < 6; i10++) {
                    sb2.append("hgcd_" + i10 + "=" + s02[i10].w1(16));
                    sb2.append("\n");
                }
                throw new IllegalStateException("Internal error\n" + ((Object) sb2));
            }
            if (fVarArr[0].equals(d10) && fVarArr[1].equals(d11)) {
                break;
            }
            F0 = F0(d10, d11);
            fVarArr[0] = d10;
            fVarArr[1] = d11;
        }
        return r(fVarArr[0], fVarArr[1]);
    }

    private static void l(short[] sArr, short[] sArr2, short[] sArr3, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sArr[i11] = (short) (sArr2[i11] & sArr3[i11]);
        }
    }

    private static void m(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12, int i13, short[] sArr4, int i14, int i15) {
        int i16;
        int i17;
        short[] sArr5;
        int i18;
        short[] sArr6;
        int i19;
        int i20 = i13;
        if (i20 == i15) {
            if (i12 == i14 && sArr3 == sArr4) {
                R0(sArr, i10, sArr2, i11, sArr3, i12, i13);
                return;
            } else if (i20 == 2) {
                s(sArr, i10, sArr3, i12, sArr4, i14);
                return;
            } else {
                X0(sArr, i10, sArr2, i11, sArr3, i12, sArr4, i14, i13);
                return;
            }
        }
        if (i20 > i15) {
            sArr5 = sArr3;
            i17 = i12;
            sArr6 = sArr4;
            i18 = i14;
            i16 = i20;
            i20 = i15;
        } else {
            i16 = i15;
            sArr6 = sArr3;
            i18 = i12;
            sArr5 = sArr4;
            i17 = i14;
        }
        int i21 = 0;
        if (i20 == 1 || (i20 == 2 && sArr6[i18 + 1] == 0)) {
            short s10 = sArr6[i18];
            if (s10 == 0) {
                Arrays.fill(sArr, i10, i10 + i16 + 2, (short) 0);
            } else if (s10 == 1) {
                System.arraycopy(sArr5, i17, sArr, i10, i16);
                int i22 = i10 + i16;
                sArr[i22] = 0;
                sArr[i22 + 1] = 0;
            } else {
                int i23 = i10 + i16;
                sArr[i23] = y0(sArr, i10, sArr5, i17, sArr6[i18], i16);
                sArr[i23 + 1] = 0;
            }
        } else if (i20 == 2 && (i16 & 1) == 0) {
            int i24 = sArr6[i18] & 65535;
            int i25 = 65535 & sArr6[i18 + 1];
            int i26 = i10 + i16;
            sArr[i26] = 0;
            sArr[i26 + 1] = 0;
            short[] sArr7 = sArr5;
            int i27 = i17;
            int i28 = i16;
            p(sArr, i10, i24, i25, sArr7, i27, 0, i28);
            o(sArr, i10, i24, i25, sArr7, i27, 2, i28);
        } else if (i20 <= 10 && i16 <= 10) {
            Y0(sArr, i10, sArr6, i18, i20, sArr5, i17, i16);
        } else if (i20 >= 400 && i16 >= 400) {
            z1(sArr, i10, sArr6, i18, i20, sArr5, i17, i16);
        } else if (i20 >= 100 && i16 >= 100) {
            y1(sArr, i10, sArr6, i18, i20, sArr5, i17, i16);
        } else {
            int i29 = (i16 / i20) & 1;
            if (i16 % i20 != 0) {
                int i30 = i20 + i16;
                int i31 = i20 << 2;
                if (i30 >= i31) {
                    D(sArr, i10, sArr2, i11, sArr5, i17, i16, sArr6, i18, i20);
                    return;
                }
                int i32 = i20;
                if (i32 + 1 != i16 && (i32 + 2 != i16 || sArr5[(i17 + i16) - 1] != 0)) {
                    D(sArr, i10, new short[i31], 0, sArr5, i17, i16, sArr6, i18, i32);
                    return;
                }
                Arrays.fill(sArr, i10, i30 + i10, (short) 0);
                X0(sArr, i10, sArr2, i11, sArr6, i18, sArr5, i17, i32);
                int i33 = i10 + i32;
                sArr[i33 + i32] = z0(sArr, i33, sArr6, i18, sArr5[i17 + i32], i32);
                return;
            }
            if (i29 == 0) {
                X0(sArr, i10, sArr2, i11, sArr6, i18, sArr5, i17, i20);
                int i34 = i20 << 1;
                System.arraycopy(sArr, i10 + i20, sArr2, i11 + i34, i20);
                for (int i35 = i34; i35 < i16; i35 += i34) {
                    X0(sArr2, i11 + i20 + i35, sArr2, i11, sArr6, i18, sArr5, i17 + i35, i20);
                }
                int i36 = i20;
                while (i20 < i16) {
                    X0(sArr, i10 + i20, sArr2, i11, sArr6, i18, sArr5, i17 + i20, i36);
                    i20 += i34;
                }
                i19 = i36;
            } else {
                int i37 = i20;
                while (true) {
                    int i38 = i21;
                    if (i38 >= i16) {
                        break;
                    }
                    X0(sArr, i10 + i38, sArr2, i11, sArr6, i18, sArr5, i17 + i38, i37);
                    i21 = i38 + (i37 << 1);
                }
                i19 = i37;
                for (int i39 = i19; i39 < i16; i39 += i19 << 1) {
                    X0(sArr2, i11 + i19 + i39, sArr2, i11, sArr6, i18, sArr5, i17 + i39, i19);
                }
            }
            int i40 = i10 + i19;
            if (g(sArr, i40, sArr, i40, sArr2, i11 + (i19 << 1), i16 - i19) == 0) {
                return;
            }
            t0(sArr, i10 + i16, i19, (short) 1);
        }
    }

    private static void o(short[] sArr, int i10, int i11, int i12, short[] sArr2, int i13, int i14, int i15) {
        int i16;
        short s10;
        short s11;
        int i17;
        int i18 = (i12 - i11) & 65535;
        int i19 = i12 & 65535;
        int i20 = i11 & 65535;
        if (i19 < i20) {
            for (int i21 = i14; i21 < i15; i21 += 4) {
                int i22 = i13 + i21;
                int i23 = sArr2[i22] & 65535;
                int i24 = sArr2[i22 + 1] & 65535;
                int i25 = i10 + i21;
                if (i23 > i24) {
                    s10 = (short) ((i23 - i24) & 65535);
                    i16 = (s10 & 65535) * i18;
                } else {
                    i16 = ((i24 - i23) & 65535) * ((i20 - i19) & 65535);
                    s10 = 0;
                }
                int i26 = i23 * i20;
                int i27 = (sArr[i25] & 65535) + i26;
                sArr[i25] = (short) (i27 & 65535);
                int i28 = i24 * i19;
                int i29 = i28 & 65535;
                int i30 = (i28 >> 16) & 65535;
                int i31 = i25 + 1;
                int i32 = ((i27 >> 16) & 65535) + (i26 & 65535) + (i16 & 65535) + i29 + (sArr[i31] & 65535);
                sArr[i31] = (short) (i32 & 65535);
                int i33 = ((((((i32 >> 16) & 65535) + i29) + ((i26 >> 16) & 65535)) + ((i16 >> 16) & 65535)) + i30) - (s10 & 65535);
                int i34 = i25 + 2;
                int i35 = i33 + (sArr[i34] & 65535);
                sArr[i34] = (short) (i35 & 65535);
                int i36 = ((i35 >> 16) & 65535) + i30;
                int i37 = i25 + 3;
                int i38 = i36 + (sArr[i37] & 65535);
                sArr[i37] = (short) (i38 & 65535);
                if ((i38 >> 16) != 0) {
                    int i39 = i25 + 4;
                    sArr[i39] = (short) (sArr[i39] + 1);
                    int i40 = i25 + 5;
                    sArr[i40] = (short) (sArr[i40] + ((short) (sArr[i39] == 0 ? 1 : 0)));
                }
            }
            return;
        }
        for (int i41 = i14; i41 < i15; i41 += 4) {
            int i42 = i13 + i41;
            int i43 = sArr2[i42] & 65535;
            int i44 = sArr2[i42 + 1] & 65535;
            int i45 = i10 + i41;
            if (i43 >= i44) {
                i17 = ((i43 - i44) & 65535) * i18;
                s11 = 0;
            } else {
                short s12 = (short) i18;
                s11 = s12;
                i17 = (s12 & 65535) * ((i43 - i44) & 65535);
            }
            int i46 = i43 * i20;
            int i47 = (sArr[i45] & 65535) + i46;
            sArr[i45] = (short) (i47 & 65535);
            int i48 = i44 * i19;
            int i49 = i48 & 65535;
            int i50 = (i48 >> 16) & 65535;
            int i51 = i45 + 1;
            int i52 = ((i47 >> 16) & 65535) + (i46 & 65535) + (i17 & 65535) + i49 + (sArr[i51] & 65535);
            sArr[i51] = (short) (i52 & 65535);
            int i53 = ((((((i52 >> 16) & 65535) + i49) + ((i46 >> 16) & 65535)) + ((i17 >> 16) & 65535)) + i50) - (s11 & 65535);
            int i54 = i45 + 2;
            int i55 = i53 + (sArr[i54] & 65535);
            sArr[i54] = (short) (i55 & 65535);
            int i56 = ((i55 >> 16) & 65535) + i50;
            int i57 = i45 + 3;
            int i58 = i56 + (sArr[i57] & 65535);
            sArr[i57] = (short) (i58 & 65535);
            if ((i58 >> 16) != 0) {
                int i59 = i45 + 4;
                sArr[i59] = (short) (sArr[i59] + 1);
                int i60 = i45 + 5;
                sArr[i60] = (short) (sArr[i60] + ((short) (sArr[i59] == 0 ? 1 : 0)));
            }
        }
    }

    private static int o1(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12, int i13) {
        int i14 = 0;
        boolean z10 = (i13 & 1) != 0;
        if (z10) {
            i13--;
        }
        int i15 = 0;
        while (i14 < i13) {
            int i16 = sArr2[i11] & 65535;
            int i17 = sArr2[i11 + 1] & 65535;
            int i18 = (i16 - (sArr3[i12] & 65535)) - ((i15 >> 31) & 1);
            int i19 = i10 + 1;
            sArr[i10] = (short) i18;
            int i20 = (i17 - (sArr3[i12 + 1] & 65535)) - ((i18 >> 31) & 1);
            int i21 = i19 + 1;
            sArr[i19] = (short) i20;
            i11 += 2;
            i12 += 2;
            i14 += 2;
            i15 = i20;
            i10 = i21;
        }
        if (z10) {
            i15 = ((sArr2[i11] & 65535) - (sArr3[i12] & 65535)) - ((i15 >> 31) & 1);
            sArr[i10] = (short) i15;
        }
        return (i15 >> 31) & 1;
    }

    private static void p(short[] sArr, int i10, int i11, int i12, short[] sArr2, int i13, int i14, int i15) {
        int i16;
        short s10;
        short s11;
        int i17;
        int i18 = (i12 - i11) & 65535;
        int i19 = i12 & 65535;
        int i20 = i11 & 65535;
        int i21 = i14;
        if (i19 < i20) {
            while (i21 < i15) {
                int i22 = i13 + i21;
                int i23 = sArr2[i22] & 65535;
                int i24 = sArr2[i22 + 1] & 65535;
                int i25 = i10 + i21;
                if (i23 > i24) {
                    s10 = (short) ((i23 - i24) & 65535);
                    i16 = (s10 & 65535) * i18;
                } else {
                    i16 = ((i24 - i23) & 65535) * ((i20 - i19) & 65535);
                    s10 = 0;
                }
                int i26 = i23 * i20;
                int i27 = (i26 >> 16) & 65535;
                int i28 = i26 & 65535;
                sArr[i25] = (short) i28;
                int i29 = i24 * i19;
                int i30 = i28 + i27 + (i16 & 65535) + (i29 & 65535);
                sArr[i25 + 1] = (short) i30;
                int i31 = ((((((i30 >> 16) & 65535) + i29) + i27) + ((i16 >> 16) & 65535)) + ((i29 >> 16) & 65535)) - (s10 & 65535);
                sArr[i25 + 2] = (short) i31;
                sArr[i25 + 3] = (short) (i31 >> 16);
                i21 += 4;
            }
            return;
        }
        while (i21 < i15) {
            int i32 = i13 + i21;
            int i33 = sArr2[i32] & 65535;
            int i34 = sArr2[i32 + 1] & 65535;
            int i35 = i10 + i21;
            if (i33 >= i34) {
                i17 = ((i33 - i34) & 65535) * i18;
                s11 = 0;
            } else {
                short s12 = (short) i18;
                s11 = s12;
                i17 = (s12 & 65535) * ((i33 - i34) & 65535);
            }
            int i36 = i33 * i20;
            int i37 = i36 & 65535;
            sArr[i35] = (short) i37;
            int i38 = (i36 >> 16) & 65535;
            int i39 = i34 * i19;
            int i40 = i37 + i38 + (i17 & 65535) + (i39 & 65535);
            sArr[i35 + 1] = (short) i40;
            int i41 = ((((((i40 >> 16) & 65535) + i39) + i38) + ((i17 >> 16) & 65535)) + ((i39 >> 16) & 65535)) - (s11 & 65535);
            sArr[i35 + 2] = (short) i41;
            sArr[i35 + 3] = (short) (i41 >> 16);
            i21 += 4;
        }
    }

    private static int p1(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12, int i13) {
        int i14 = i13 - 1;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            i16 = ((sArr2[i11] & 65535) - (65535 & sArr3[i12])) - ((i16 >> 31) & 1);
            sArr[i10] = (short) i16;
            i11++;
            i12++;
            i15++;
            i10++;
        }
        int i17 = (sArr2[i11] & 65535) - ((i16 >> 31) & 1);
        sArr[i10] = (short) i17;
        return (i17 >> 31) & 1;
    }

    private static f q(f fVar) {
        return fVar.H1() ? Y(0) : fVar.o0();
    }

    private static int q0(int i10, int i11) {
        if (i11 != 0) {
            int i12 = (i11 - 1) << 4;
            if (i10 == 0) {
                return i12;
            }
            int i13 = i12 + 16;
            if ((i10 >> 8) == 0) {
                i10 <<= 8;
                i13 -= 8;
            }
            if ((i10 >> 12) == 0) {
                i10 <<= 4;
                i13 -= 4;
            }
            if ((i10 >> 14) == 0) {
                i10 <<= 2;
                i13 -= 2;
            }
            return (i10 >> 15) == 0 ? i13 - 1 : i13;
        }
        return 0;
    }

    private static int q1(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12, int i13) {
        int i14 = i13 - 1;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            i16 = ((sArr2[i11] & 65535) - (65535 & sArr3[i12])) - ((i16 >> 31) & 1);
            sArr[i10] = (short) i16;
            i11++;
            i12++;
            i15++;
            i10++;
        }
        int i17 = 0 - ((sArr3[i12] & 65535) - ((i16 >> 31) & 1));
        sArr[i10] = (short) i17;
        return (i17 >> 31) & 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        if (r9.H1() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
        if (r9.H1() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0116, code lost:
        r0 = r0.T0(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
        r0 = r0.K0(r6).d(r3.K0(r7));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static u7.f r(u7.f r18, u7.f r19) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.f.r(u7.f, u7.f):u7.f");
    }

    public static short[] r0(short[] sArr, short s10) {
        int length = sArr.length;
        short[] E = E(sArr, length + 1);
        E[length] = s10;
        return E;
    }

    private static void s(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12) {
        int i13 = sArr2[i11] & 65535;
        int i14 = sArr2[i11 + 1] & 65535;
        int i15 = sArr3[i12] & 65535;
        int i16 = sArr3[i12 + 1] & 65535;
        int i17 = i13 * i15;
        short s10 = (short) i17;
        int i18 = (i17 >> 16) & 65535;
        sArr[i10] = s10;
        int i19 = (i13 * i16) + (((short) i18) & 65535);
        int i20 = (i15 * i14) + (((short) i19) & 65535);
        sArr[i10 + 1] = (short) i20;
        int i21 = (i14 * i16) + ((i18 >> 16) & 65535) + ((i19 >> 16) & 65535) + ((i20 >> 16) & 65535);
        sArr[i10 + 2] = (short) i21;
        sArr[i10 + 3] = (short) (i21 >> 16);
    }

    private static f[] s0(f fVar, f fVar2) {
        f fVar3;
        int i10;
        f fVar4;
        int i11;
        if (fVar.I1() >= 0) {
            if (fVar2.I1() < 0) {
                throw new IllegalStateException("doesn't satisfy !eib.isNegative()");
            }
            if (fVar.H1() || fVar2.H1()) {
                return new f[]{fVar, fVar2, Y(1), Y(0), Y(0), Y(1)};
            }
            f[] fVarArr = new f[6];
            if (fVar.C() && fVar2.C()) {
                long[] w02 = w0(fVar.u1(), fVar2.u1());
                if (w02 == null) {
                    return null;
                }
                for (int i12 = 0; i12 < 6; i12++) {
                    fVarArr[i12] = Z(w02[i12]);
                }
                return fVarArr;
            }
            f F0 = F0(fVar, fVar2);
            f H0 = H0(fVar, fVar2);
            if (F0.C()) {
                F0.u1();
            }
            f b10 = F0.c1(1).b(1);
            if (H0.compareTo(b10) <= 0) {
                return new f[]{fVar, fVar2, Y(1), Y(0), Y(0), Y(1)};
            }
            if (H0.compareTo(F0.J0(3).c1(2).b(2)) > 0) {
                f c12 = F0.c1(1);
                f d12 = fVar.d1(c12);
                f C0 = fVar.C0(c12);
                f d13 = fVar2.d1(c12);
                f C02 = fVar2.C0(c12);
                f[] s02 = s0(d12, d13);
                if (s02 == null) {
                    return null;
                }
                System.arraycopy(s02, 0, fVarArr, 0, 6);
                f n12 = C0.K0(s02[5]).n1(C02.K0(s02[3]));
                f n13 = C02.K0(s02[2]).n1(C0.K0(s02[4]));
                f d10 = n12.d(s02[0].b1(c12));
                f d11 = n13.d(s02[1].b1(c12));
                if (d10.I1() < 0 || d11.I1() < 0) {
                    throw new IllegalStateException("Internal error: oeia=" + fVar + " oeib=" + fVar2 + " eiah=" + d12 + " eibh=" + d13);
                }
                fVar3 = d11;
                i10 = 3;
                fVar4 = d10;
                i11 = 1;
            } else {
                i11 = 1;
                f Y = Y(1);
                fVarArr[5] = Y;
                fVarArr[2] = Y;
                f Y2 = Y(0);
                fVarArr[4] = Y2;
                i10 = 3;
                fVarArr[3] = Y2;
                fVar4 = fVar;
                fVar3 = fVar2;
            }
            fVarArr[0] = fVar4;
            fVarArr[i11] = fVar3;
            while (F0(fVarArr[0], fVarArr[i11]).compareTo(F0.J0(i10).c1(2).b(i11)) > 0 && q(fVarArr[0].n1(fVarArr[i11])).compareTo(b10) > 0) {
                if (fVarArr[0].I1() < 0 || fVarArr[i11].I1() < 0) {
                    throw new IllegalStateException("Internal error: eia=" + fVar + " oeib=" + fVar2);
                }
                W0(fVarArr, b10);
                i11 = 1;
                i10 = 3;
            }
            f fVar5 = fVarArr[0];
            f fVar6 = fVarArr[1];
            if (H0(fVar5, fVar6).compareTo(b10.b(2)) > 0) {
                f b11 = b10.d(b10).n1(F0(fVar5, fVar6)).b(1);
                f d14 = fVar5.d1(b11);
                f C03 = fVar5.C0(b11);
                f d15 = fVar6.d1(b11);
                f C04 = fVar6.C0(b11);
                f[] s03 = s0(d14, d15);
                if (s03 == null) {
                    return null;
                }
                f n14 = C03.K0(s03[5]).n1(C04.K0(s03[3]));
                f n15 = C04.K0(s03[2]).n1(C03.K0(s03[4]));
                f d16 = n14.d(s03[0].b1(b11));
                f d17 = n15.d(s03[1].b1(b11));
                if (d16.I1() < 0 || d17.I1() < 0) {
                    throw new IllegalStateException("Internal error");
                }
                f d18 = fVarArr[2].K0(s03[2]).d(fVarArr[3].K0(s03[4]));
                f d19 = fVarArr[2].K0(s03[3]).d(fVarArr[3].K0(s03[5]));
                f d20 = fVarArr[4].K0(s03[2]).d(fVarArr[5].K0(s03[4]));
                f d21 = fVarArr[4].K0(s03[3]).d(fVarArr[5].K0(s03[5]));
                fVarArr[2] = d18;
                fVarArr[3] = d19;
                fVarArr[4] = d20;
                fVarArr[5] = d21;
                fVar6 = d17;
                fVar5 = d16;
            }
            fVarArr[0] = fVar5;
            fVarArr[1] = fVar6;
            for (char c10 = 1; q(fVarArr[0].n1(fVarArr[c10])).compareTo(b10) > 0; c10 = 1) {
                if (fVarArr[0].I1() < 0 || fVarArr[c10].I1() < 0) {
                    throw new IllegalStateException("Internal error");
                }
                W0(fVarArr, b10);
            }
            return fVarArr;
        }
        throw new IllegalStateException("doesn't satisfy !eia.isNegative()");
    }

    private static void t(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12) {
        long j10 = (sArr2[i11] & 65535) | ((sArr2[i11 + 1] & 65535) << 16);
        long j11 = (sArr2[i11 + 2] & 65535) | ((sArr2[i11 + 3] & 65535) << 16);
        long j12 = (sArr3[i12] & 65535) | ((sArr3[i12 + 1] & 65535) << 16);
        long j13 = ((65535 & sArr3[i12 + 3]) << 16) | (sArr3[i12 + 2] & 65535);
        long j14 = j10 * j12;
        long j15 = (j14 >> 32) & 4294967295L;
        sArr[i10] = (short) j14;
        sArr[i10 + 1] = (short) (j14 >> 16);
        long j16 = (j10 * j13) + (((int) j15) & 4294967295L);
        long j17 = (j12 * j11) + (((int) j16) & 4294967295L);
        sArr[i10 + 2] = (short) j17;
        sArr[i10 + 3] = (short) (j17 >> 16);
        long j18 = (j11 * j13) + ((j15 >> 32) & 4294967295L) + ((j16 >> 32) & 4294967295L) + ((j17 >> 32) & 4294967295L);
        sArr[i10 + 4] = (short) j18;
        sArr[i10 + 5] = (short) (j18 >> 16);
        sArr[i10 + 6] = (short) (j18 >> 32);
        sArr[i10 + 7] = (short) (j18 >> 48);
    }

    public static int t0(short[] sArr, int i10, int i11, short s10) {
        short s11 = sArr[i10];
        sArr[i10] = (short) (s10 + s11);
        if ((sArr[i10] & 65535) >= (s11 & 65535)) {
            return 0;
        }
        for (int i12 = 1; i12 < i11; i12++) {
            int i13 = i10 + i12;
            sArr[i13] = (short) (sArr[i13] + 1);
            if (sArr[i13] != 0) {
                return 0;
            }
        }
        return 1;
    }

    private static f u0(f[] fVarArr, int[] iArr, int i10) {
        f J0;
        f Y = Y(0);
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                if (i12 == 1) {
                    J0 = fVarArr[i11];
                } else if (i12 == -1) {
                    Y = Y.n1(fVarArr[i11]);
                } else {
                    J0 = fVarArr[i11].J0(i12);
                }
                Y = Y.d(J0);
            }
        }
        return Y.L(i10);
    }

    private static void v(short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12) {
        int i13 = sArr2[i11] & 65535;
        int i14 = sArr2[i11 + 1] & 65535;
        int i15 = sArr2[i11 + 2] & 65535;
        int i16 = sArr2[i11 + 3] & 65535;
        int i17 = sArr2[i11 + 4] & 65535;
        int i18 = sArr2[i11 + 5] & 65535;
        int i19 = sArr2[i11 + 6] & 65535;
        int i20 = sArr2[i11 + 7] & 65535;
        int i21 = sArr3[i12] & 65535;
        int i22 = sArr3[i12 + 1] & 65535;
        int i23 = sArr3[i12 + 2] & 65535;
        int i24 = sArr3[i12 + 3] & 65535;
        int i25 = sArr3[i12 + 4] & 65535;
        int i26 = sArr3[i12 + 5] & 65535;
        int i27 = sArr3[i12 + 6] & 65535;
        int i28 = sArr3[i12 + 7] & 65535;
        int i29 = i13 * i21;
        short s10 = (short) i29;
        int i30 = (i29 >> 16) & 65535;
        sArr[i10] = s10;
        int i31 = (i13 * i22) + (((short) i30) & 65535);
        int i32 = ((i30 >> 16) & 65535) + ((i31 >> 16) & 65535);
        int i33 = (i14 * i21) + (((short) i31) & 65535);
        int i34 = i32 + ((i33 >> 16) & 65535);
        sArr[i10 + 1] = (short) i33;
        int i35 = (i13 * i23) + (((short) i34) & 65535);
        int i36 = ((i34 >> 16) & 65535) + ((i35 >> 16) & 65535);
        int i37 = (i14 * i22) + (((short) i35) & 65535);
        int i38 = i36 + ((i37 >> 16) & 65535);
        int i39 = (i15 * i21) + (((short) i37) & 65535);
        int i40 = i38 + ((i39 >> 16) & 65535);
        sArr[i10 + 2] = (short) i39;
        int i41 = (i13 * i24) + (((short) i40) & 65535);
        int i42 = ((i40 >> 16) & 65535) + ((i41 >> 16) & 65535);
        int i43 = (i14 * i23) + (((short) i41) & 65535);
        int i44 = i42 + ((i43 >> 16) & 65535);
        int i45 = (i15 * i22) + (((short) i43) & 65535);
        int i46 = i44 + ((i45 >> 16) & 65535);
        int i47 = (i16 * i21) + (((short) i45) & 65535);
        int i48 = i46 + ((i47 >> 16) & 65535);
        sArr[i10 + 3] = (short) i47;
        int i49 = (i13 * i25) + (((short) i48) & 65535);
        int i50 = ((i48 >> 16) & 65535) + ((i49 >> 16) & 65535);
        int i51 = (i14 * i24) + (((short) i49) & 65535);
        int i52 = (i15 * i23) + (i51 & 65535);
        int i53 = (i16 * i22) + (i52 & 65535);
        int i54 = (i17 * i21) + (i53 & 65535);
        int i55 = i50 + ((i51 >> 16) & 65535) + ((i52 >> 16) & 65535) + ((i53 >> 16) & 65535) + ((i54 >> 16) & 65535);
        sArr[i10 + 4] = (short) i54;
        int i56 = (i13 * i26) + (((short) i55) & 65535);
        int i57 = ((i55 >> 16) & 65535) + ((i56 >> 16) & 65535);
        int i58 = (i14 * i25) + (((short) i56) & 65535);
        int i59 = i57 + ((i58 >> 16) & 65535);
        int i60 = (i15 * i24) + (((short) i58) & 65535);
        int i61 = i59 + ((i60 >> 16) & 65535);
        int i62 = (i16 * i23) + (((short) i60) & 65535);
        int i63 = i61 + ((i62 >> 16) & 65535);
        int i64 = (i17 * i22) + (((short) i62) & 65535);
        int i65 = i63 + ((i64 >> 16) & 65535);
        int i66 = (i18 * i21) + (((short) i64) & 65535);
        int i67 = i65 + ((i66 >> 16) & 65535);
        sArr[i10 + 5] = (short) i66;
        int i68 = (i13 * i27) + (((short) i67) & 65535);
        int i69 = ((i67 >> 16) & 65535) + ((i68 >> 16) & 65535);
        int i70 = (i14 * i26) + (((short) i68) & 65535);
        int i71 = i69 + ((i70 >> 16) & 65535);
        int i72 = (i15 * i25) + (((short) i70) & 65535);
        int i73 = i71 + ((i72 >> 16) & 65535);
        int i74 = (i16 * i24) + (((short) i72) & 65535);
        int i75 = i73 + ((i74 >> 16) & 65535);
        int i76 = (i17 * i23) + (((short) i74) & 65535);
        int i77 = i75 + ((i76 >> 16) & 65535);
        int i78 = (i18 * i22) + (((short) i76) & 65535);
        int i79 = i77 + ((i78 >> 16) & 65535);
        int i80 = (i19 * i21) + (((short) i78) & 65535);
        int i81 = i79 + ((i80 >> 16) & 65535);
        sArr[i10 + 6] = (short) i80;
        int i82 = (i13 * i28) + (((short) i81) & 65535);
        int i83 = ((i81 >> 16) & 65535) + ((i82 >> 16) & 65535);
        int i84 = (i14 * i27) + (((short) i82) & 65535);
        int i85 = i83 + ((i84 >> 16) & 65535);
        int i86 = (i15 * i26) + (((short) i84) & 65535);
        int i87 = i85 + ((i86 >> 16) & 65535);
        int i88 = (i16 * i25) + (((short) i86) & 65535);
        int i89 = i87 + ((i88 >> 16) & 65535);
        int i90 = (i17 * i24) + (((short) i88) & 65535);
        int i91 = i89 + ((i90 >> 16) & 65535);
        int i92 = (i18 * i23) + (((short) i90) & 65535);
        int i93 = i91 + ((i92 >> 16) & 65535);
        int i94 = (i19 * i22) + (((short) i92) & 65535);
        int i95 = (i20 * i21) + (((short) i94) & 65535);
        int i96 = i93 + ((i94 >> 16) & 65535) + ((i95 >> 16) & 65535);
        sArr[i10 + 7] = (short) i95;
        int i97 = (i14 * i28) + (((short) i96) & 65535);
        int i98 = ((i96 >> 16) & 65535) + ((i97 >> 16) & 65535);
        int i99 = (i15 * i27) + (((short) i97) & 65535);
        int i100 = i98 + ((i99 >> 16) & 65535);
        int i101 = (i16 * i26) + (((short) i99) & 65535);
        int i102 = i100 + ((i101 >> 16) & 65535);
        int i103 = (i17 * i25) + (((short) i101) & 65535);
        int i104 = i102 + ((i103 >> 16) & 65535);
        int i105 = (i18 * i24) + (((short) i103) & 65535);
        int i106 = (i19 * i23) + (((short) i105) & 65535);
        int i107 = (i20 * i22) + (((short) i106) & 65535);
        int i108 = i104 + ((i105 >> 16) & 65535) + ((i106 >> 16) & 65535) + ((i107 >> 16) & 65535);
        sArr[i10 + 8] = (short) i107;
        int i109 = (i15 * i28) + (((short) i108) & 65535);
        int i110 = (i16 * i27) + (((short) i109) & 65535);
        int i111 = ((i108 >> 16) & 65535) + ((i109 >> 16) & 65535) + ((i110 >> 16) & 65535);
        int i112 = (i17 * i26) + (((short) i110) & 65535);
        int i113 = i111 + ((i112 >> 16) & 65535);
        int i114 = (i18 * i25) + (((short) i112) & 65535);
        int i115 = (i19 * i24) + (((short) i114) & 65535);
        int i116 = (i20 * i23) + (((short) i115) & 65535);
        int i117 = i113 + ((i114 >> 16) & 65535) + ((i115 >> 16) & 65535) + ((i116 >> 16) & 65535);
        sArr[i10 + 9] = (short) i116;
        int i118 = (i16 * i28) + (((short) i117) & 65535);
        int i119 = (i17 * i27) + (((short) i118) & 65535);
        int i120 = ((i117 >> 16) & 65535) + ((i118 >> 16) & 65535) + ((i119 >> 16) & 65535);
        int i121 = (i18 * i26) + (((short) i119) & 65535);
        int i122 = (i19 * i25) + (((short) i121) & 65535);
        int i123 = (i20 * i24) + (((short) i122) & 65535);
        int i124 = i120 + ((i121 >> 16) & 65535) + ((i122 >> 16) & 65535) + ((i123 >> 16) & 65535);
        sArr[i10 + 10] = (short) i123;
        int i125 = (i17 * i28) + (((short) i124) & 65535);
        int i126 = (i18 * i27) + (((short) i125) & 65535);
        int i127 = (i19 * i26) + (((short) i126) & 65535);
        int i128 = (i20 * i25) + (((short) i127) & 65535);
        int i129 = ((i124 >> 16) & 65535) + ((i125 >> 16) & 65535) + ((i126 >> 16) & 65535) + ((i127 >> 16) & 65535) + ((i128 >> 16) & 65535);
        sArr[i10 + 11] = (short) i128;
        int i130 = (i18 * i28) + (((short) i129) & 65535);
        int i131 = (i19 * i27) + (((short) i130) & 65535);
        int i132 = (i20 * i26) + (((short) i131) & 65535);
        int i133 = ((i129 >> 16) & 65535) + ((i130 >> 16) & 65535) + ((i131 >> 16) & 65535) + ((i132 >> 16) & 65535);
        sArr[i10 + 12] = (short) i132;
        int i134 = (i19 * i28) + (((short) i133) & 65535);
        int i135 = (i20 * i27) + (((short) i134) & 65535);
        sArr[i10 + 13] = (short) i135;
        int i136 = (i20 * i28) + ((i133 >> 16) & 65535) + ((i134 >> 16) & 65535) + ((i135 >> 16) & 65535);
        sArr[i10 + 14] = (short) i136;
        sArr[i10 + 15] = (short) (i136 >> 16);
    }

    private static int v0(long j10) {
        if (j10 == 0) {
            return 0;
        }
        return q.b(Math.abs(j10));
    }

    private static void w(short[] sArr, int i10, short[] sArr2, int i11) {
        int i12 = (sArr2[i11] & 65535) * (sArr2[i11] & 65535);
        sArr[i10] = (short) i12;
        int i13 = i11 + 1;
        int i14 = (sArr2[i11] & 65535) * (sArr2[i13] & 65535);
        short s10 = (short) i14;
        int i15 = ((i12 >> 16) & 65535) + (((short) (s10 << 1)) & 65535);
        sArr[i10 + 1] = (short) i15;
        int i16 = ((sArr2[i13] & 65535) * (sArr2[i13] & 65535)) + (((i14 >> 16) & 65535) << 1) + ((s10 >> 15) & 1) + ((i15 >> 16) & 65535);
        sArr[i10 + 2] = (short) i16;
        sArr[i10 + 3] = (short) (i16 >> 16);
    }

    private static long[] w0(long j10, long j11) {
        long j12;
        int i10;
        long j13;
        char c10;
        if (j10 == 0 || j11 == 0) {
            return new long[]{j10, j11, 1, 0, 0, 1};
        }
        long[] jArr = new long[6];
        int max = Math.max(v0(j10), v0(j11));
        int min = Math.min(v0(j10), v0(j11));
        int i11 = max >> 1;
        int i12 = i11 + 1;
        if (min <= i12) {
            return new long[]{j10, j11, 1, 0, 0, 1};
        }
        int i13 = (max * 3) >> 2;
        if (min > i13 + 2) {
            long j14 = (1 << i11) - 1;
            long j15 = j10 & j14;
            i10 = i13;
            long j16 = j11 & j14;
            long[] w02 = w0(j10 >> i11, j11 >> i11);
            if (w02 == null) {
                return null;
            }
            System.arraycopy(w02, 0, jArr, 0, 6);
            long j17 = (w02[5] * j15) - (w02[3] * j16);
            long j18 = (j16 * w02[2]) - (j15 * w02[4]);
            j13 = j17 + (w02[0] << i11);
            j12 = j18 + (w02[1] << i11);
            if (j13 < 0 || j12 < 0) {
                throw new IllegalStateException("Internal error: longa=" + j10 + " olongb=" + j11);
            }
        } else {
            i10 = i13;
            jArr[2] = 1;
            jArr[3] = 0;
            jArr[4] = 0;
            jArr[5] = 1;
            j13 = j10;
            j12 = j11;
        }
        jArr[0] = j13;
        jArr[1] = j12;
        for (char c11 = 1; Math.max(v0(jArr[0]), v0(jArr[c11])) > i10 + 1 && v0(jArr[0] - jArr[c11]) > i12; c11 = 1) {
            if (jArr[0] < 0 || jArr[c11] < 0) {
                throw new IllegalStateException("Internal error: longa=" + j10 + " olongb=" + j11);
            }
            x0(jArr, i12);
        }
        long j19 = jArr[0];
        long j20 = jArr[1];
        if (Math.min(v0(j19), v0(j20)) > i12 + 2) {
            int max2 = ((i12 * 2) - Math.max(v0(j19), v0(j20))) + 1;
            long j21 = (1 << max2) - 1;
            long j22 = j19 >> max2;
            long j23 = j19 & j21;
            long j24 = j20 & j21;
            long[] w03 = w0(j22, j20 >> max2);
            if (w03 == null) {
                return null;
            }
            long j25 = (w03[5] * j23) - (w03[3] * j24);
            long j26 = (j24 * w03[2]) - (j23 * w03[4]);
            j19 = (w03[0] << max2) + j25;
            long j27 = j26 + (w03[1] << max2);
            if (j19 < 0 || j27 < 0) {
                throw new IllegalStateException("Internal error");
            }
            long j28 = (jArr[2] * w03[2]) + (jArr[3] * w03[4]);
            long j29 = (jArr[2] * w03[3]) + (jArr[3] * w03[5]);
            long j30 = (jArr[4] * w03[2]) + (jArr[5] * w03[4]);
            jArr[2] = j28;
            jArr[3] = j29;
            jArr[4] = j30;
            jArr[5] = (jArr[4] * w03[3]) + (jArr[5] * w03[5]);
            j20 = j27;
            c10 = 0;
        } else {
            c10 = 0;
        }
        jArr[c10] = j19;
        char c12 = 1;
        jArr[1] = j20;
        while (v0(jArr[c10] - jArr[c12]) > i12) {
            if (jArr[c10] < 0 || jArr[c12] < 0) {
                throw new IllegalStateException("Internal error");
            }
            x0(jArr, i12);
            c12 = 1;
            c10 = 0;
        }
        if (jArr[c10] >= 0 && jArr[1] >= 0) {
            return jArr;
        }
        throw new IllegalStateException("Internal error");
    }

    private static void x(short[] sArr, int i10, short[] sArr2, int i11) {
        int i12 = (sArr2[i11] & 65535) * (sArr2[i11] & 65535);
        sArr[i10] = (short) i12;
        int i13 = i11 + 1;
        int i14 = (sArr2[i11] & 65535) * (sArr2[i13] & 65535);
        short s10 = (short) i14;
        int i15 = ((i12 >> 16) & 65535) + (((short) (s10 << 1)) & 65535);
        int i16 = (((i14 >> 16) & 65535) << 1) + ((s10 >> 15) & 1) + ((i15 >> 16) & 65535);
        sArr[i10 + 1] = (short) i15;
        int i17 = i11 + 2;
        int i18 = (sArr2[i11] & 65535) * (sArr2[i17] & 65535);
        short s11 = (short) i18;
        int i19 = (((i18 >> 16) & 65535) << 1) + ((s11 >> 15) & 1);
        int i20 = ((sArr2[i13] & 65535) * (sArr2[i13] & 65535)) + (((short) (s11 << 1)) & 65535);
        int i21 = i16 + (((short) i20) & 65535);
        int i22 = i19 + ((i20 >> 16) & 65535) + ((i21 >> 16) & 65535);
        sArr[i10 + 2] = (short) i21;
        int i23 = i11 + 3;
        int i24 = (sArr2[i11] & 65535) * (sArr2[i23] & 65535);
        int i25 = ((sArr2[i13] & 65535) * (sArr2[i17] & 65535)) + (((short) i24) & 65535);
        short s12 = (short) i25;
        int i26 = i22 + (((short) (s12 << 1)) & 65535);
        int i27 = ((((i24 >> 16) & 65535) + ((i25 >> 16) & 65535)) << 1) + ((s12 >> 15) & 1) + ((i26 >> 16) & 65535);
        sArr[i10 + 3] = (short) i26;
        int i28 = (sArr2[i13] & 65535) * (sArr2[i23] & 65535);
        short s13 = (short) i28;
        int i29 = (((i28 >> 16) & 65535) << 1) + ((s13 >> 15) & 1);
        int i30 = ((sArr2[i17] & 65535) * (sArr2[i17] & 65535)) + (((short) (s13 << 1)) & 65535);
        int i31 = i27 + (((short) i30) & 65535);
        int i32 = i29 + ((i30 >> 16) & 65535) + ((i31 >> 16) & 65535);
        sArr[i10 + 4] = (short) i31;
        int i33 = (sArr2[i17] & 65535) * (sArr2[i23] & 65535);
        short s14 = (short) i33;
        int i34 = i32 + (((short) (s14 << 1)) & 65535);
        sArr[(i10 + 8) - 3] = (short) i34;
        int i35 = ((sArr2[i23] & 65535) * (sArr2[i23] & 65535)) + (((i33 >> 16) & 65535) << 1) + ((s14 >> 15) & 1) + ((i34 >> 16) & 65535);
        sArr[i10 + 6] = (short) i35;
        sArr[i10 + 7] = (short) (i35 >> 16);
    }

    private static void x0(long[] jArr, long j10) {
        if (jArr[0] < 0) {
            throw new IllegalArgumentException("longam[0] (" + jArr[0] + ") is not greater or equal to 0");
        } else if (jArr[1] < 0) {
            throw new IllegalArgumentException("longam[1] (" + jArr[1] + ") is not greater or equal to 0");
        } else if (jArr[0] > jArr[1]) {
            long j11 = jArr[0];
            long j12 = jArr[1];
            long j13 = j11 / j12;
            long[] jArr2 = {j13, j11 - (j13 * j12)};
            if (v0(jArr2[1]) <= j10) {
                jArr2[0] = jArr2[0] - 1;
                if (jArr2[0] < 0) {
                    throw new IllegalStateException();
                }
                jArr2[1] = jArr2[1] + j12;
            }
            jArr[3] = jArr[3] + (jArr[2] * jArr2[0]);
            jArr[5] = jArr[5] + (jArr[4] * jArr2[0]);
            jArr[0] = jArr2[1];
        } else {
            long j14 = jArr[1];
            long j15 = jArr[0];
            long j16 = j14 / j15;
            long[] jArr3 = {j16, j14 - (j16 * j15)};
            if (v0(jArr3[1]) <= j10) {
                jArr3[0] = jArr3[0] - 1;
                if (jArr3[0] < 0) {
                    throw new IllegalStateException();
                }
                jArr3[1] = jArr3[1] + j15;
            }
            jArr[2] = jArr[2] + (jArr[3] * jArr3[0]);
            jArr[4] = jArr[4] + (jArr[5] * jArr3[0]);
            jArr[1] = jArr3[1];
        }
    }

    private void x1(StringBuilder sb2, int i10) {
        int i11 = this.f23226d;
        int i12 = 1;
        if (i11 >= 100) {
            StringBuilder sb3 = new StringBuilder();
            long j10 = (Z3[i10] * this.f23226d) / 16;
            f[] K = K(i10 == 10 ? q.o(j10) : i10 == 5 ? q.m(Z(j10)) : Y(i10).O0(Z(j10)));
            K[0].x1(sb2, i10);
            K[1].x1(sb3, i10);
            for (int length = sb3.length(); length < j10; length++) {
                sb2.append('0');
            }
            sb2.append(sb3.toString());
        } else if (i10 != 10) {
            short[] sArr = new short[i11];
            System.arraycopy(this.f23227q, 0, sArr, 0, i11);
            while (i11 != 0 && sArr[i11 - 1] == 0) {
                i11--;
            }
            char[] cArr = new char[(i11 << 4) + 1];
            int i13 = 0;
            while (true) {
                if (i11 == 0) {
                    break;
                } else if (i11 == i12 && sArr[0] > 0 && sArr[0] <= Short.MAX_VALUE) {
                    short s10 = sArr[0];
                    while (s10 != 0) {
                        int i14 = s10 / i10;
                        cArr[i13] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(s10 - (i14 * i10));
                        s10 = i14;
                        i13++;
                    }
                } else if (i11 != 2 || sArr[i12] <= 0 || sArr[i12] > Short.MAX_VALUE) {
                    int i15 = i11;
                    short s11 = 0;
                    while (true) {
                        int i16 = i15 - 1;
                        if (i15 > 0) {
                            int i17 = (sArr[i16] & 65535) | (s11 << 16);
                            int i18 = i17 / i10;
                            sArr[i16] = (short) i18;
                            s11 = (short) (i17 - (i10 * i18));
                            i15 = i16;
                        }
                    }
                    while (i11 != 0 && sArr[i11 - 1] == 0) {
                        i11--;
                    }
                    cArr[i13] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(s11);
                    i13++;
                    i12 = 1;
                } else {
                    int i19 = (sArr[0] & 65535) | ((sArr[i12] & 65535) << 16);
                    while (i19 != 0) {
                        int i20 = i19 / i10;
                        cArr[i13] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i19 - (i20 * i10));
                        i19 = i20;
                        i13++;
                    }
                }
            }
            V0(cArr, 0, i13);
            sb2.append(cArr, 0, i13);
        } else if (C()) {
            sb2.append(l.w(v1()));
        } else {
            int i21 = this.f23226d;
            short[] sArr2 = new short[i21];
            System.arraycopy(this.f23227q, 0, sArr2, 0, i21);
            while (i21 != 0 && sArr2[i21 - 1] == 0) {
                i21--;
            }
            char[] cArr2 = new char[(i21 << 4) + 1];
            int i22 = 0;
            while (true) {
                if (i21 == 0) {
                    break;
                } else if (i21 == 1 && sArr2[0] > 0 && sArr2[0] <= Short.MAX_VALUE) {
                    short s12 = sArr2[0];
                    while (s12 != 0) {
                        int i23 = (s12 * 26215) >> 18;
                        cArr2[i22] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(s12 - (i23 * 10));
                        s12 = i23;
                        i22++;
                    }
                } else if (i21 != 2 || sArr2[1] <= 0 || sArr2[1] > Short.MAX_VALUE) {
                    int i24 = i21;
                    short s13 = 0;
                    while (true) {
                        int i25 = i24 - 1;
                        if (i24 > 0) {
                            int i26 = (sArr2[i25] & 65535) | (s13 << 16);
                            int i27 = i26 / 10000;
                            sArr2[i25] = (short) i27;
                            s13 = (short) (i26 - (i27 * 10000));
                            i24 = i25;
                        }
                    }
                    while (i21 != 0 && sArr2[i21 - 1] == 0) {
                        i21--;
                    }
                    int i28 = (s13 * 3277) >> 15;
                    int i29 = i22 + 1;
                    cArr2[i22] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(s13 - (i28 * 10));
                    int i30 = (i28 * 3277) >> 15;
                    int i31 = i29 + 1;
                    cArr2[i29] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i28 - (i30 * 10));
                    int i32 = (i30 * 3277) >> 15;
                    int i33 = i31 + 1;
                    cArr2[i31] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i30 - (i32 * 10));
                    i22 = i33 + 1;
                    cArr2[i33] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i32);
                } else {
                    int i34 = (sArr2[0] & 65535) | ((sArr2[1] & 65535) << 16);
                    while (i34 != 0) {
                        int i35 = i34 < 81920 ? ((52429 * i34) >> 19) & 8191 : i34 / 10;
                        cArr2[i22] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i34 - (i35 * 10));
                        i34 = i35;
                        i22++;
                    }
                }
            }
            V0(cArr2, 0, i22);
            sb2.append(cArr2, 0, i22);
        }
    }

    private static void y(short[] sArr, int i10, short[] sArr2, int i11) {
        int i12 = (sArr2[i11] & 65535) * (sArr2[i11] & 65535);
        sArr[i10] = (short) i12;
        int i13 = i11 + 1;
        int i14 = (sArr2[i11] & 65535) * (sArr2[i13] & 65535);
        short s10 = (short) i14;
        int i15 = ((i12 >> 16) & 65535) + (((short) (s10 << 1)) & 65535);
        int i16 = (((i14 >> 16) & 65535) << 1) + ((s10 >> 15) & 1) + ((i15 >> 16) & 65535);
        sArr[i10 + 1] = (short) i15;
        int i17 = i11 + 2;
        int i18 = (sArr2[i11] & 65535) * (sArr2[i17] & 65535);
        short s11 = (short) i18;
        int i19 = (((i18 >> 16) & 65535) << 1) + ((s11 >> 15) & 1);
        int i20 = ((sArr2[i13] & 65535) * (sArr2[i13] & 65535)) + (((short) (s11 << 1)) & 65535);
        int i21 = i16 + (((short) i20) & 65535);
        int i22 = i19 + ((i20 >> 16) & 65535) + ((i21 >> 16) & 65535);
        sArr[i10 + 2] = (short) i21;
        int i23 = i11 + 3;
        int i24 = (sArr2[i11] & 65535) * (sArr2[i23] & 65535);
        int i25 = ((sArr2[i13] & 65535) * (sArr2[i17] & 65535)) + (((short) i24) & 65535);
        short s12 = (short) i25;
        int i26 = i22 + (((short) (s12 << 1)) & 65535);
        int i27 = ((((i24 >> 16) & 65535) + ((i25 >> 16) & 65535)) << 1) + ((s12 >> 15) & 1) + ((i26 >> 16) & 65535);
        sArr[i10 + 3] = (short) i26;
        int i28 = i11 + 4;
        int i29 = (sArr2[i11] & 65535) * (sArr2[i28] & 65535);
        int i30 = ((sArr2[i13] & 65535) * (sArr2[i23] & 65535)) + (((short) i29) & 65535);
        short s13 = (short) i30;
        int i31 = ((((i29 >> 16) & 65535) + ((i30 >> 16) & 65535)) << 1) + ((s13 >> 15) & 1);
        int i32 = ((sArr2[i17] & 65535) * (sArr2[i17] & 65535)) + (((short) (s13 << 1)) & 65535);
        int i33 = i27 + (((short) i32) & 65535);
        int i34 = i31 + ((i32 >> 16) & 65535) + ((i33 >> 16) & 65535);
        sArr[i10 + 4] = (short) i33;
        int i35 = i11 + 5;
        int i36 = (sArr2[i11] & 65535) * (sArr2[i35] & 65535);
        int i37 = ((sArr2[i13] & 65535) * (sArr2[i28] & 65535)) + (((short) i36) & 65535);
        int i38 = ((i36 >> 16) & 65535) + ((i37 >> 16) & 65535);
        int i39 = ((sArr2[i17] & 65535) * (sArr2[i23] & 65535)) + (((short) i37) & 65535);
        short s14 = (short) i39;
        int i40 = i34 + (((short) (s14 << 1)) & 65535);
        int i41 = ((i38 + ((i39 >> 16) & 65535)) << 1) + ((s14 >> 15) & 1) + ((i40 >> 16) & 65535);
        sArr[i10 + 5] = (short) i40;
        int i42 = i11 + 6;
        int i43 = (sArr2[i11] & 65535) * (sArr2[i42] & 65535);
        int i44 = ((sArr2[i13] & 65535) * (sArr2[i35] & 65535)) + (((short) i43) & 65535);
        int i45 = ((i43 >> 16) & 65535) + ((i44 >> 16) & 65535);
        int i46 = ((sArr2[i17] & 65535) * (sArr2[i28] & 65535)) + (((short) i44) & 65535);
        short s15 = (short) i46;
        int i47 = ((i45 + ((i46 >> 16) & 65535)) << 1) + ((s15 >> 15) & 1);
        int i48 = ((sArr2[i23] & 65535) * (sArr2[i23] & 65535)) + (((short) (s15 << 1)) & 65535);
        int i49 = i41 + (((short) i48) & 65535);
        int i50 = i47 + ((i48 >> 16) & 65535) + ((i49 >> 16) & 65535);
        sArr[i10 + 6] = (short) i49;
        int i51 = i11 + 7;
        int i52 = (sArr2[i11] & 65535) * (sArr2[i51] & 65535);
        int i53 = ((sArr2[i13] & 65535) * (sArr2[i42] & 65535)) + (((short) i52) & 65535);
        int i54 = ((i52 >> 16) & 65535) + ((i53 >> 16) & 65535);
        int i55 = ((sArr2[i17] & 65535) * (sArr2[i35] & 65535)) + (((short) i53) & 65535);
        int i56 = i54 + ((i55 >> 16) & 65535);
        int i57 = ((sArr2[i23] & 65535) * (sArr2[i28] & 65535)) + (((short) i55) & 65535);
        short s16 = (short) i57;
        int i58 = i50 + (((short) (s16 << 1)) & 65535);
        int i59 = ((i56 + ((i57 >> 16) & 65535)) << 1) + ((s16 >> 15) & 1) + ((i58 >> 16) & 65535);
        sArr[i10 + 7] = (short) i58;
        int i60 = (sArr2[i13] & 65535) * (sArr2[i51] & 65535);
        int i61 = ((sArr2[i17] & 65535) * (sArr2[i42] & 65535)) + (((short) i60) & 65535);
        int i62 = ((i60 >> 16) & 65535) + ((i61 >> 16) & 65535);
        int i63 = ((sArr2[i23] & 65535) * (sArr2[i35] & 65535)) + (((short) i61) & 65535);
        short s17 = (short) i63;
        int i64 = ((i62 + ((i63 >> 16) & 65535)) << 1) + ((s17 >> 15) & 1);
        int i65 = ((sArr2[i28] & 65535) * (sArr2[i28] & 65535)) + (((short) (s17 << 1)) & 65535);
        int i66 = i59 + (((short) i65) & 65535);
        int i67 = i64 + ((i65 >> 16) & 65535) + ((i66 >> 16) & 65535);
        sArr[i10 + 8] = (short) i66;
        int i68 = (sArr2[i17] & 65535) * (sArr2[i51] & 65535);
        int i69 = ((sArr2[i23] & 65535) * (sArr2[i42] & 65535)) + (((short) i68) & 65535);
        int i70 = ((i68 >> 16) & 65535) + ((i69 >> 16) & 65535);
        int i71 = ((sArr2[i28] & 65535) * (sArr2[i35] & 65535)) + (((short) i69) & 65535);
        short s18 = (short) i71;
        int i72 = i67 + (((short) (s18 << 1)) & 65535);
        int i73 = ((i70 + ((i71 >> 16) & 65535)) << 1) + ((s18 >> 15) & 1) + ((i72 >> 16) & 65535);
        sArr[i10 + 9] = (short) i72;
        int i74 = (sArr2[i23] & 65535) * (sArr2[i51] & 65535);
        int i75 = ((sArr2[i28] & 65535) * (sArr2[i42] & 65535)) + (((short) i74) & 65535);
        short s19 = (short) i75;
        int i76 = ((((i74 >> 16) & 65535) + ((i75 >> 16) & 65535)) << 1) + ((s19 >> 15) & 1);
        int i77 = ((sArr2[i35] & 65535) * (sArr2[i35] & 65535)) + (((short) (s19 << 1)) & 65535);
        int i78 = i73 + (((short) i77) & 65535);
        int i79 = i76 + ((i77 >> 16) & 65535) + ((i78 >> 16) & 65535);
        sArr[i10 + 10] = (short) i78;
        int i80 = (sArr2[i28] & 65535) * (sArr2[i51] & 65535);
        int i81 = ((sArr2[i35] & 65535) * (sArr2[i42] & 65535)) + (((short) i80) & 65535);
        short s20 = (short) i81;
        int i82 = i79 + (((short) (s20 << 1)) & 65535);
        int i83 = ((((i80 >> 16) & 65535) + ((i81 >> 16) & 65535)) << 1) + ((s20 >> 15) & 1) + ((i82 >> 16) & 65535);
        sArr[i10 + 11] = (short) i82;
        int i84 = (sArr2[i35] & 65535) * (sArr2[i51] & 65535);
        short s21 = (short) i84;
        int i85 = (((i84 >> 16) & 65535) << 1) + ((s21 >> 15) & 1);
        int i86 = ((sArr2[i42] & 65535) * (sArr2[i42] & 65535)) + (((short) (s21 << 1)) & 65535);
        int i87 = i83 + (((short) i86) & 65535);
        int i88 = i85 + ((i86 >> 16) & 65535) + ((i87 >> 16) & 65535);
        sArr[i10 + 12] = (short) i87;
        int i89 = (sArr2[i42] & 65535) * (sArr2[i51] & 65535);
        short s22 = (short) i89;
        int i90 = i88 + (((short) (s22 << 1)) & 65535);
        sArr[i10 + 13] = (short) i90;
        int i91 = ((sArr2[i51] & 65535) * (sArr2[i51] & 65535)) + (((i89 >> 16) & 65535) << 1) + ((s22 >> 15) & 1) + ((i90 >> 16) & 65535);
        sArr[i10 + 14] = (short) i91;
        sArr[i10 + 15] = (short) (i91 >> 16);
    }

    private static short y0(short[] sArr, int i10, short[] sArr2, int i11, short s10, int i12) {
        int i13 = s10 & 65535;
        short s11 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = ((sArr2[i11 + i14] & 65535) * i13) + (s11 & 65535);
            sArr[i10 + i14] = (short) i15;
            s11 = (short) (i15 >> 16);
        }
        return s11;
    }

    private static void y1(short[] sArr, int i10, short[] sArr2, int i11, int i12, short[] sArr3, int i13, int i14) {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        f fVar5;
        f fVar6;
        f fVar7;
        int max = Math.max(i12, i14);
        int i15 = (max / 3) + (((max % 3) + 2) / 3);
        f a12 = Y(i15).a1(4);
        int i16 = i11 + i12;
        f D0 = D0(sArr2, i16, i11, i15);
        f D02 = D0(sArr2, i16, i11 + i15, i15);
        int i17 = i15 * 2;
        f D03 = D0(sArr2, i16, i11 + i17, i15);
        int i18 = 1;
        if (sArr2 == sArr3 && i11 == i13 && i12 == i14) {
            fVar5 = D0.K0(D0);
            fVar4 = D03.K0(D03);
            f d10 = D03.d(D0);
            f d11 = d10.d(D02);
            f n12 = d10.n1(D02);
            f d12 = D03.a1(2).d(D02.a1(1)).d(D0);
            fVar2 = d11.K0(d11);
            fVar3 = n12.K0(n12);
            fVar = d12.K0(d12);
        } else {
            int i19 = i13 + i14;
            f D04 = D0(sArr3, i19, i13, i15);
            f D05 = D0(sArr3, i19, i13 + i15, i15);
            f D06 = D0(sArr3, i19, i13 + i17, i15);
            f K0 = D0.K0(D04);
            f K02 = D03.K0(D06);
            f d13 = D03.d(D0);
            f d14 = D06.d(D04);
            fVar2 = d13.d(D02).K0(d14.d(D05));
            fVar3 = d13.n1(D02).K0(d14.n1(D05));
            i18 = 1;
            fVar = D03.a1(2).d(D02.a1(1)).d(D0).K0(D06.a1(2).d(D05.a1(1)).d(D04));
            fVar5 = K0;
            fVar4 = K02;
        }
        f a13 = fVar4.a1(i18);
        f J0 = a13.J0(6);
        f J02 = fVar5.J0(3);
        f L = J02.n1(J0).n1(fVar2.J0(3)).n1(fVar3).d(fVar).L(6);
        f c12 = fVar2.d(fVar3).n1(fVar5.a1(1)).n1(a13).c1(1);
        f L2 = fVar2.J0(6).d(J0).n1(fVar).n1(fVar3).n1(fVar3).n1(J02).L(6);
        if (a12.C1(1879048192) < 0) {
            int i20 = i15 << 4;
            fVar7 = fVar5.d(L2.a1(i20)).d(c12.a1(i20 * 2)).d(L.a1(i20 * 3));
            fVar6 = fVar4.a1(i20 * 4);
        } else {
            fVar7 = fVar5.d(L2.b1(a12)).d(c12.b1(a12.J0(2))).d(L.b1(a12.J0(3)));
            fVar6 = fVar4.b1(a12.J0(4));
        }
        f d15 = fVar7.d(fVar6);
        int i21 = i12 + i14;
        Arrays.fill(sArr, i10, i10 + i21, (short) 0);
        System.arraycopy(d15.f23227q, 0, sArr, i10, Math.min(i21, d15.f23226d));
    }

    private static int z(int i10) {
        int i11 = i10 & 15;
        int i12 = i10 >> 4;
        return i11 == 0 ? i12 : i12 + 1;
    }

    private static short z0(short[] sArr, int i10, short[] sArr2, int i11, short s10, int i12) {
        int i13 = s10 & 65535;
        short s11 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = ((sArr2[i11 + i14] & 65535) * i13) + (s11 & 65535);
            int i16 = i10 + i14;
            int i17 = i15 + (sArr[i16] & 65535);
            sArr[i16] = (short) i17;
            s11 = (short) (i17 >> 16);
        }
        return s11;
    }

    private static void z1(short[] sArr, int i10, short[] sArr2, int i11, int i12, short[] sArr3, int i13, int i14) {
        f fVar;
        f fVar2;
        int i15;
        char c10;
        char c11;
        f fVar3;
        f fVar4;
        f fVar5;
        f fVar6;
        f fVar7;
        f fVar8;
        f fVar9;
        int max = Math.max(i12, i14);
        int i16 = (max / 4) + (((max % 4) + 3) / 4);
        f a12 = Y(i16).a1(4);
        int i17 = i11 + i12;
        f D0 = D0(sArr2, i17, i11, i16);
        f D02 = D0(sArr2, i17, i11 + i16, i16);
        int i18 = i16 * 2;
        f D03 = D0(sArr2, i17, i11 + i18, i16);
        int i19 = i16 * 3;
        f D04 = D0(sArr2, i17, i11 + i19, i16);
        if (sArr2 == sArr3 && i11 == i13 && i12 == i14) {
            f K0 = D0.K0(D0);
            f K02 = D04.K0(D04);
            f a13 = D03.a1(1);
            f a14 = D02.a1(2);
            f a15 = D0.a1(3);
            f d10 = D02.d(D04);
            fVar = K0;
            f d11 = D0.d(D03);
            f d12 = D04.d(a13).d(a14).d(a15);
            f d13 = D04.L0().d(a13).n1(a14).d(a15);
            f d14 = d11.d(d10);
            f n12 = d11.n1(d10);
            f d15 = D0.d(D04.a1(3)).d(D03.a1(2)).d(D02.a1(1));
            f K03 = d12.K0(d12);
            fVar8 = d13.K0(d13);
            fVar4 = d14.K0(d14);
            f K04 = n12.K0(n12);
            fVar3 = d15.K0(d15);
            fVar5 = K02;
            fVar7 = K03;
            fVar2 = a12;
            i15 = i16;
            c11 = 2;
            c10 = 1;
            fVar6 = K04;
        } else {
            int i20 = i13 + i14;
            f D05 = D0(sArr3, i20, i13, i16);
            f D06 = D0(sArr3, i20, i13 + i16, i16);
            f D07 = D0(sArr3, i20, i13 + i18, i16);
            f D08 = D0(sArr3, i20, i13 + i19, i16);
            f K05 = D0.K0(D05);
            f K06 = D04.K0(D08);
            fVar = K05;
            f a16 = D03.a1(1);
            f a17 = D02.a1(2);
            f a18 = D0.a1(3);
            f a19 = D07.a1(1);
            f a110 = D06.a1(2);
            i15 = i16;
            f a111 = D05.a1(3);
            f d16 = D02.d(D04);
            fVar2 = a12;
            f d17 = D0.d(D03);
            f d18 = D06.d(D08);
            f d19 = D05.d(D07);
            f K07 = D04.d(a16).d(a17).d(a18).K0(D08.d(a19).d(a110).d(a111));
            f K08 = D04.L0().d(a16).n1(a17).d(a18).K0(D08.L0().d(a19).n1(a110).d(a111));
            fVar4 = d17.d(d16).K0(d19.d(d18));
            fVar6 = d17.n1(d16).K0(d19.n1(d18));
            c11 = 2;
            c10 = 1;
            fVar3 = D0.d(D04.a1(3)).d(D03.a1(2)).d(D02.a1(1)).K0(D05.d(D08.a1(3)).d(D07.a1(2)).d(D06.a1(1)));
            fVar5 = K06;
            fVar8 = K08;
            fVar7 = K07;
        }
        f fVar10 = fVar;
        f[] fVarArr = new f[7];
        fVarArr[0] = fVar10;
        fVarArr[c10] = fVar7;
        fVarArr[c11] = fVar8;
        fVarArr[3] = fVar4;
        fVarArr[4] = fVar6;
        fVarArr[5] = fVar3;
        fVarArr[6] = fVar5;
        f u02 = u0(fVarArr, new int[]{-90, 5, -3, -60, 20, 2, -90}, 180);
        f u03 = u0(fVarArr, new int[]{-120, 1, 1, -4, -4, 0, 6}, 24);
        f u04 = u0(fVarArr, new int[]{45, -1, 0, 27, -7, -1, 45}, 18);
        f u05 = u0(fVarArr, new int[]{96, -1, -1, 16, 16, 0, -30}, 24);
        f u06 = u0(fVarArr, new int[]{-360, 5, 3, -120, -40, 8, -360}, 180);
        f fVar11 = fVar2;
        if (fVar11.C1(1879048192) < 0) {
            int i21 = i15 << 4;
            fVar9 = fVar10.d(u02.a1(i21)).d(u03.a1(i21 * 2)).d(u04.a1(i21 * 3)).d(u05.a1(i21 * 4)).d(u06.a1(i21 * 5)).d(fVar5.a1(i21 * 6));
        } else {
            fVar9 = fVar10.d(u02.b1(fVar11)).d(u03.b1(fVar11.J0(2))).d(u04.b1(fVar11.J0(3))).d(u05.b1(fVar11.J0(4))).d(u06.b1(fVar11.J0(5))).d(fVar5.b1(fVar11.J0(6)));
        }
        int i22 = i12 + i14;
        Arrays.fill(sArr, i10, i10 + i22, (short) 0);
        System.arraycopy(fVar9.f23227q, 0, sArr, i10, Math.min(i22, fVar9.f23226d));
    }

    public boolean B() {
        int i10 = this.f23226d;
        if (i10 > 2) {
            return false;
        }
        if (i10 == 2) {
            short[] sArr = this.f23227q;
            if ((sArr[1] & 32768) != 0) {
                return this.f23225c && sArr[1] == Short.MIN_VALUE && sArr[0] == 0;
            }
        }
        return true;
    }

    public f B0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("\"bitCount\" (" + i10 + ") is not greater or equal to 0");
        } else if (i10 == 0 || I1() == 0) {
            return Y(0);
        } else {
            if (I1() > 0 && p0() <= i10) {
                return this;
            }
            if (this.f23225c) {
                return j(Y(1).a1(i10).l1(1));
            }
            long z10 = z(i10);
            int i11 = this.f23226d;
            if (i11 < z10) {
                return this;
            }
            if (z10 == 0) {
                return Y(0);
            }
            int i12 = (int) z10;
            int i13 = i10 & 15;
            Math.min(i11, i12);
            short[] sArr = new short[i12];
            if (i13 == 0) {
                System.arraycopy(this.f23227q, 0, sArr, 0, i12);
            } else {
                int i14 = i12 - 1;
                System.arraycopy(this.f23227q, 0, sArr, 0, i14);
                sArr[i14] = (short) (((short) ((1 << i13) - 1)) & this.f23227q[i14]);
            }
            int H = H(sArr);
            return H == 0 ? Y(0) : new f(H, sArr, false);
        }
    }

    public boolean C() {
        int i10 = this.f23226d;
        if (i10 > 4) {
            return false;
        }
        if (i10 == 4) {
            short[] sArr = this.f23227q;
            if ((sArr[3] & 32768) != 0) {
                return this.f23225c && sArr[3] == Short.MIN_VALUE && sArr[2] == 0 && sArr[1] == 0 && sArr[0] == 0;
            }
        }
        return true;
    }

    public f C0(f fVar) {
        Objects.requireNonNull(fVar, "bigBitCount");
        if (fVar.I1() < 0) {
            throw new IllegalArgumentException("\"bigBitCount.signum()\" (" + fVar.I1() + ") is not greater or equal to 0");
        } else if (fVar.I1() == 0 || I1() == 0) {
            return Y(0);
        } else {
            if (I1() > 0) {
                if (o0().compareTo(fVar) <= 0) {
                    return this;
                }
                if (fVar.B()) {
                    return B0(fVar.s1());
                }
            }
            if (this.f23225c) {
                return j(Y(1).b1(fVar).l1(1));
            }
            f L = fVar.b(15).L(16);
            if (Y(this.f23226d).compareTo(L) < 0) {
                return this;
            }
            long s12 = L.s1();
            if (s12 == 0) {
                return Y(0);
            }
            int i10 = (int) s12;
            int s13 = fVar.S0(16).s1();
            Math.min(this.f23226d, i10);
            short[] sArr = new short[i10];
            if (s13 == 0) {
                System.arraycopy(this.f23227q, 0, sArr, 0, i10);
            } else {
                int i11 = i10 - 1;
                System.arraycopy(this.f23227q, 0, sArr, 0, i11);
                sArr[i11] = (short) (((short) ((1 << s13) - 1)) & this.f23227q[i11]);
            }
            int H = H(sArr);
            return H == 0 ? Y(0) : new f(H, sArr, false);
        }
    }

    public int C1(int i10) {
        int i11 = this.f23226d;
        if (i11 > 2) {
            return this.f23225c ? -1 : 1;
        }
        if (i11 == 2) {
            short[] sArr = this.f23227q;
            if ((sArr[1] & 32768) != 0) {
                boolean z10 = this.f23225c;
                return (z10 && sArr[1] == Short.MIN_VALUE && sArr[0] == 0) ? i10 == Integer.MIN_VALUE ? 0 : -1 : z10 ? -1 : 1;
            }
        }
        int t12 = t1();
        if (t12 == i10) {
            return 0;
        }
        return t12 < i10 ? -1 : 1;
    }

    public int D1(long j10) {
        return compareTo(Z(j10));
    }

    /* renamed from: E1 */
    public int compareTo(f fVar) {
        if (fVar == null) {
            return 1;
        }
        boolean z10 = false;
        if (this == fVar) {
            return 0;
        }
        int i10 = this.f23226d;
        int i11 = fVar.f23226d;
        char c10 = i10 == 0 ? (char) 0 : this.f23225c ? (char) 65535 : (char) 1;
        char c11 = i11 == 0 ? (char) 0 : fVar.f23225c ? (char) 65535 : (char) 1;
        if (c10 != c11) {
            return c10 < c11 ? -1 : 1;
        } else if (c10 == 0) {
            return 0;
        } else {
            if (i10 != i11) {
                boolean z11 = i10 > i11;
                if (c10 <= 0) {
                    z10 = true;
                }
                return z11 ^ z10 ? 1 : -1;
            } else if (i10 == 1 && this.f23227q[0] == fVar.f23227q[0]) {
                return 0;
            } else {
                short[] sArr = this.f23227q;
                short[] sArr2 = fVar.f23227q;
                while (true) {
                    int i12 = i10 - 1;
                    if (i10 == 0) {
                        return 0;
                    }
                    int i13 = sArr[i12] & 65535;
                    int i14 = 65535 & sArr2[i12];
                    if (i13 > i14) {
                        return c10 > 0 ? 1 : -1;
                    } else if (i13 < i14) {
                        return c10 > 0 ? -1 : 1;
                    } else {
                        i10 = i12;
                    }
                }
            }
        }
    }

    public final boolean F1() {
        return !n0(0);
    }

    public final boolean G1() {
        int i10 = this.f23226d;
        if (this.f23225c || i10 == 0 || (i10 > 1 && this.f23227q[0] != 0)) {
            return false;
        }
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            if (i11 >= i12) {
                int i13 = this.f23227q[i12] & 65535;
                if (i13 == 0) {
                    throw new IllegalStateException();
                }
                while ((i13 & 1) == 0) {
                    i13 >>= 1;
                }
                return i13 == 1;
            } else if (this.f23227q[i11] != 0) {
                return false;
            } else {
                i11++;
            }
        }
    }

    public final boolean H1() {
        return this.f23226d == 0;
    }

    public f I0(int i10) {
        if (i10 >= 0) {
            f S0 = S0(i10);
            return S0.I1() < 0 ? Y(i10).d(S0) : S0;
        }
        throw new ArithmeticException("Divisor is negative");
    }

    public final int I1() {
        if (this.f23226d == 0) {
            return 0;
        }
        return this.f23225c ? -1 : 1;
    }

    public f[] J(int i10) {
        return K(Y(i10));
    }

    public f J0(int i10) {
        return K0(Y(i10));
    }

    public f[] K(f fVar) {
        Objects.requireNonNull(fVar, "divisor");
        int i10 = this.f23226d;
        int i11 = fVar.f23226d;
        if (i11 != 0) {
            if (i10 < i11) {
                return new f[]{Y(0), this};
            }
            if (i11 == 1) {
                short[] sArr = new short[i10];
                short[] sArr2 = fVar.f23227q;
                short s10 = sArr2[0];
                int S = s10 != 2 ? s10 != 10 ? S(sArr, 0, this.f23227q, 0, i10, sArr2[0]) & 65535 : T(sArr, 0, this.f23227q, 0, i10) : U(sArr, 0, this.f23227q, 0, i10);
                int i12 = this.f23226d;
                while (i12 != 0 && sArr[i12 - 1] == 0) {
                    i12--;
                }
                if (i12 == 0) {
                    return new f[]{Y(0), this};
                }
                f fVar2 = new f(i12, j1(sArr, i12), fVar.f23225c ^ this.f23225c);
                if (this.f23225c) {
                    S = -S;
                }
                return new f[]{fVar2, Z(S)};
            }
            if (B() && fVar.B()) {
                long s12 = s1();
                long s13 = fVar.s1();
                if (s12 != -2147483648L || s13 != -1) {
                    long j10 = s12 / s13;
                    return new f[]{Z(j10), Z(s12 - (s13 * j10))};
                }
            } else if (C() && fVar.C()) {
                long u12 = u1();
                long u13 = fVar.u1();
                if (u12 != Long.MIN_VALUE || u13 != -1) {
                    long j11 = u12 / u13;
                    return new f[]{Z(j11), Z(u12 - (u13 * j11))};
                }
            }
            short[] sArr3 = new short[i11];
            short[] sArr4 = new short[(i10 - i11) + 1];
            f0(this.f23227q, 0, this.f23226d, fVar.f23227q, 0, fVar.f23226d, sArr4, 0, sArr3, 0);
            int H = H(sArr3);
            int H2 = H(sArr4);
            return new f[]{H2 == 0 ? Y(0) : new f(H2, j1(sArr4, H2), fVar.f23225c ^ this.f23225c), H == 0 ? Y(0) : new f(H, j1(sArr3, H), this.f23225c)};
        }
        throw new ArithmeticException();
    }

    public f K0(f fVar) {
        int i10;
        short[] sArr;
        int i11;
        int i12;
        Objects.requireNonNull(fVar, "bigintMult");
        int i13 = this.f23226d;
        boolean z10 = false;
        if (i13 == 0 || (i10 = fVar.f23226d) == 0) {
            return Y(0);
        }
        int i14 = 1;
        if (i13 == 1 && this.f23227q[0] == 1) {
            return this.f23225c ? fVar.L0() : fVar;
        } else if (i10 == 1 && fVar.f23227q[0] == 1) {
            return fVar.f23225c ? L0() : this;
        } else {
            if (i13 == 1) {
                if (i10 == 1) {
                    int i15 = (this.f23227q[0] & 65535) * (fVar.f23227q[0] & 65535);
                    short[] sArr2 = {(short) (i15 & 65535), (short) ((i15 >> 16) & 65535)};
                    if (sArr2[1] != 0) {
                        i14 = 2;
                    }
                    return new f(i14, sArr2, fVar.f23225c ^ this.f23225c);
                }
                i11 = i10 + 1;
                sArr = new short[i11];
                sArr[i10] = y0(sArr, 0, fVar.f23227q, 0, this.f23227q[0], i10);
            } else if (i10 == 1) {
                int i16 = i13 + 1;
                sArr = new short[i16];
                sArr[i13] = y0(sArr, 0, this.f23227q, 0, fVar.f23227q[0], i13);
                i11 = i16;
            } else if (equals(fVar)) {
                int i17 = this.f23226d;
                int i18 = i17 + i17;
                short[] sArr3 = new short[i18];
                R0(sArr3, 0, new short[i18], 0, this.f23227q, 0, i17);
                z10 = true;
                i11 = i18;
                sArr = sArr3;
            } else {
                int i19 = this.f23226d;
                if (i19 > 10 || (i12 = fVar.f23226d) > 10) {
                    int i20 = fVar.f23226d;
                    int i21 = i19 + i20;
                    sArr = new short[i21];
                    m(sArr, 0, new short[i21], 0, this.f23227q, 0, i19, fVar.f23227q, 0, i20);
                    z10 = true;
                    i11 = i21;
                } else {
                    int i22 = i19 + i12;
                    sArr = new short[i22];
                    Y0(sArr, 0, this.f23227q, 0, i19, fVar.f23227q, 0, i12);
                    i11 = i22;
                }
            }
            while (i11 != 0 && sArr[i11 - 1] == 0) {
                i11--;
            }
            if (z10) {
                sArr = j1(sArr, i11);
            }
            return new f(i11, sArr, fVar.f23225c ^ this.f23225c);
        }
    }

    public f L(int i10) {
        return M(Y(i10));
    }

    public f L0() {
        int i10 = this.f23226d;
        return i10 == 0 ? this : new f(i10, this.f23227q, !this.f23225c);
    }

    public f M(f fVar) {
        Objects.requireNonNull(fVar, "bigintDivisor");
        int i10 = this.f23226d;
        int i11 = fVar.f23226d;
        if (i11 != 0) {
            if (i10 < i11) {
                return Y(0);
            }
            if (i10 <= 2 && i11 <= 2 && B() && fVar.B()) {
                int s12 = s1();
                int s13 = fVar.s1();
                if (s12 != Integer.MIN_VALUE || s13 != -1) {
                    return Y(s12 / s13);
                }
            }
            if (i10 <= 4 && i11 <= 4 && C() && fVar.C()) {
                long u12 = u1();
                long u13 = fVar.u1();
                if (u12 != Long.MIN_VALUE || u13 != -1) {
                    return Z(u12 / u13);
                }
            }
            if (i11 != 1) {
                short[] sArr = new short[(i10 - i11) + 1];
                f0(this.f23227q, 0, this.f23226d, fVar.f23227q, 0, fVar.f23226d, sArr, 0, null, 0);
                int H = H(sArr);
                short[] j12 = j1(sArr, H);
                if (H == 0) {
                    return Y(0);
                }
                return new f(H, j12, fVar.f23225c ^ this.f23225c);
            }
            short[] sArr2 = this.f23227q;
            short[] sArr3 = new short[sArr2.length];
            int i12 = this.f23226d;
            R(sArr3, sArr2, i10, fVar.f23227q[0]);
            while (i12 != 0 && sArr3[i12 - 1] == 0) {
                i12--;
            }
            if (i12 == 0) {
                return Y(0);
            }
            return new f(i12, sArr3, fVar.f23225c ^ this.f23225c);
        }
        throw new ArithmeticException();
    }

    public f N0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("powerSmall(" + i10 + ") is less than 0");
        } else if (i10 == 0) {
            return Y(1);
        } else {
            if (i10 == 1 || H1() || C1(1) == 0) {
                return this;
            }
            if (C1(-1) == 0) {
                return (i10 & 1) == 0 ? Y(1) : this;
            } else if (i10 == 2) {
                return K0(this);
            } else {
                if (i10 == 3) {
                    return K0(this).K0(this);
                }
                f Y = Y(1);
                f fVar = this;
                while (i10 != 0) {
                    if ((i10 & 1) != 0) {
                        Y = Y.K0(fVar);
                    }
                    i10 >>= 1;
                    if (i10 != 0) {
                        fVar = fVar.K0(fVar);
                    }
                }
                return Y;
            }
        }
    }

    public f O0(f fVar) {
        Objects.requireNonNull(fVar, "bigPower");
        if (fVar.I1() >= 0) {
            if (fVar.I1() == 0) {
                return Y(1);
            }
            if (fVar.C1(1) == 0 || H1() || C1(1) == 0) {
                return this;
            }
            if (C1(-1) == 0) {
                return fVar.F1() ? Y(1) : this;
            }
            f o02 = o0();
            if (!G1()) {
                o02.l1(1);
            }
            if (fVar.B()) {
                return N0(fVar.s1());
            }
            f Y = Y(1);
            f N0 = N0(Integer.MAX_VALUE);
            while (!fVar.B()) {
                Y = Y.K0(N0);
                fVar = fVar.l1(Integer.MAX_VALUE);
            }
            int s12 = fVar.s1();
            return s12 == Integer.MAX_VALUE ? Y.K0(N0) : Y.K0(N0(s12));
        }
        throw new IllegalArgumentException("bigPower is negative");
    }

    public f S0(int i10) {
        return T0(Y(i10));
    }

    public f T0(f fVar) {
        Objects.requireNonNull(fVar, "divisor");
        int i10 = this.f23226d;
        int i11 = fVar.f23226d;
        if (i11 != 0) {
            if (i10 < i11) {
                return this;
            }
            if (i11 == 1) {
                int V = V(this.f23227q, i10, fVar.f23227q[0]) & 65535;
                if (this.f23225c) {
                    V = -V;
                }
                return Z(V);
            } else if (M0(fVar) < 0) {
                return this;
            } else {
                short[] sArr = new short[i11];
                f0(this.f23227q, 0, this.f23226d, fVar.f23227q, 0, fVar.f23226d, null, 0, sArr, 0);
                int H = H(sArr);
                return H == 0 ? Y(0) : new f(H, j1(sArr, H), this.f23225c);
            }
        }
        throw new ArithmeticException();
    }

    public f a() {
        int i10 = this.f23226d;
        return (i10 == 0 || !this.f23225c) ? this : new f(i10, this.f23227q, false);
    }

    public f a1(int i10) {
        int i11;
        if (i10 == 0 || (i11 = this.f23226d) == 0) {
            return this;
        }
        if (i10 < 0) {
            return i10 == Integer.MIN_VALUE ? c1(1).c1(Integer.MAX_VALUE) : c1(-i10);
        }
        int i12 = i10 >> 4;
        int i13 = i10 & 15;
        if (!this.f23225c) {
            int z10 = q.a(this.f23227q[i11 + (-1)] & 65535) + i13 <= 16 ? i11 + i12 : z(i10) + i11;
            short[] sArr = new short[z10];
            System.arraycopy(this.f23227q, 0, sArr, i12, i11);
            e1(sArr, i12, z10 - i12, i13);
            return new f(z10, sArr, false);
        }
        int z11 = z(i10) + i11;
        short[] sArr2 = new short[z11];
        System.arraycopy(this.f23227q, 0, sArr2, 0, i11);
        A1(sArr2, 0, z11);
        f1(sArr2, 0, i11 + i12, i12);
        e1(sArr2, i12, i11 + z(i13), i13);
        A1(sArr2, 0, z11);
        return new f(H(sArr2), sArr2, true);
    }

    public f b(int i10) {
        if (i10 == 0) {
            return this;
        }
        int i11 = this.f23226d;
        if (i11 == 0) {
            return Y(i10);
        }
        if (i11 != 1 || i10 < -2147352576 || i10 >= 2147352576) {
            return d(Y(i10));
        }
        int i12 = this.f23225c ? i10 - (this.f23227q[0] & 65535) : i10 + (this.f23227q[0] & 65535);
        if (i12 >= -24 && i12 <= 128) {
            return X3[i12 - (-24)];
        }
        int i13 = i12 >> 16;
        if (i13 == 0) {
            return new f(1, new short[]{(short) i12}, false);
        }
        if (i12 > 0) {
            return new f(2, new short[]{(short) i12, (short) i13}, false);
        }
        if (i12 > -65536) {
            return new f(1, new short[]{(short) (-i12)}, true);
        }
        int i14 = -i12;
        return new f(2, new short[]{(short) i14, (short) (i14 >> 16)}, true);
    }

    public f b1(f fVar) {
        Objects.requireNonNull(fVar, "eshift");
        if (fVar.I1() < 0) {
            return d1(fVar.L0());
        }
        f fVar2 = this;
        while (!fVar.B()) {
            fVar = fVar.l1(2147483632);
            fVar2 = fVar2.a1(2147483632);
        }
        return fVar2.a1(fVar.s1());
    }

    public f c1(int i10) {
        int i11;
        short[] sArr;
        int i12;
        if (i10 == 0 || (i11 = this.f23226d) == 0) {
            return this;
        }
        if (i10 < 0) {
            return i10 == Integer.MIN_VALUE ? a1(1).a1(Integer.MAX_VALUE) : a1(-i10);
        }
        int i13 = i10 >> 4;
        int i14 = i10 & 15;
        if (this.f23225c) {
            short[] sArr2 = this.f23227q;
            i12 = sArr2.length;
            sArr = new short[i12];
            System.arraycopy(sArr2, 0, sArr, 0, i11);
            A1(sArr, 0, i12);
            i1(sArr, 0, i11, i13);
            if (i11 > i13) {
                h1(sArr, 0, i11 - i13, i14);
            }
            A1(sArr, 0, i12);
        } else if (i13 >= i11) {
            return Y(0);
        } else {
            short[] sArr3 = this.f23227q;
            sArr = new short[sArr3.length];
            i12 = i11 - i13;
            System.arraycopy(sArr3, i13, sArr, 0, i12);
            if (i14 != 0) {
                g1(sArr, 0, i12, i14);
            }
        }
        while (i12 != 0 && sArr[i12 - 1] == 0) {
            i12--;
        }
        if (i12 == 0) {
            return Y(0);
        }
        if (i13 > 2) {
            sArr = j1(sArr, i12);
        }
        return new f(i12, sArr, this.f23225c);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u7.f d(u7.f r14) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.f.d(u7.f):u7.f");
    }

    public f d0(f fVar) {
        Objects.requireNonNull(fVar, "bigintSecond");
        if (H1()) {
            return fVar.a();
        }
        f a10 = a();
        if (fVar.H1()) {
            return a10;
        }
        f a11 = fVar.a();
        return (a11.equals(Y(1)) || a10.equals(a11)) ? a11 : a10.equals(Y(1)) ? a10 : Math.max(a10.f23226d, a11.f23226d) > 12 ? k1(a10, a11) : r(a10, a11);
    }

    public f d1(f fVar) {
        Objects.requireNonNull(fVar, "eshift");
        if (fVar.I1() < 0) {
            return b1(fVar.L0());
        }
        f fVar2 = this;
        while (!fVar.B()) {
            fVar = fVar.l1(2147483632);
            fVar2 = fVar2.c1(2147483632);
        }
        return fVar2.c1(fVar.s1());
    }

    public boolean equals(Object obj) {
        f fVar = obj instanceof f ? (f) obj : null;
        if (fVar != null && this.f23226d == fVar.f23226d && this.f23225c == fVar.f23225c) {
            for (int i10 = 0; i10 < this.f23226d; i10++) {
                if (this.f23227q[i10] != fVar.f23227q[i10]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public f g0() {
        return Z(h0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d4, code lost:
        if (r1 >= 10) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02b6, code lost:
        if (r1 >= 10) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02b8, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02bb, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0113, code lost:
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0153, code lost:
        if (r0.a().compareTo(u7.q.n(r2)) >= 0) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long h0() {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.f.h0():long");
    }

    public int hashCode() {
        int I1 = (I1() * 1000000007) + 0;
        if (this.f23227q != null) {
            for (int i10 = 0; i10 < this.f23226d; i10++) {
                I1 += this.f23227q[i10] * 1000000013;
            }
        }
        return I1;
    }

    public f i0() {
        return Z(j0());
    }

    public f j(f fVar) {
        Objects.requireNonNull(fVar, "other");
        if (fVar.H1() || H1()) {
            return Y(0);
        }
        if (!this.f23225c && !fVar.f23225c) {
            int min = Math.min(this.f23226d, fVar.f23226d);
            int i10 = this.f23226d;
            short[] sArr = i10 == min ? this.f23227q : fVar.f23227q;
            short[] sArr2 = i10 == min ? fVar.f23227q : this.f23227q;
            short[] sArr3 = new short[min];
            for (int i11 = 0; i11 < min; i11++) {
                sArr3[i11] = (short) (sArr[i11] & sArr2[i11]);
            }
            int H = H(sArr3);
            return H == 0 ? Y(0) : new f(H, sArr3, false);
        }
        int i12 = this.f23226d;
        short[] sArr4 = new short[i12];
        System.arraycopy(this.f23227q, 0, sArr4, 0, i12);
        int i13 = fVar.f23226d;
        short[] sArr5 = new short[i13];
        System.arraycopy(fVar.f23227q, 0, sArr5, 0, i13);
        boolean z10 = this.f23225c;
        boolean z11 = fVar.f23225c;
        short[] E = E(sArr4, Math.max(i12, i13));
        short[] E2 = E(sArr5, Math.max(E.length, i13));
        if (z10) {
            A1(E, 0, E.length);
        }
        if (z11) {
            A1(E2, 0, E2.length);
        }
        boolean z12 = z11 & z10;
        l(E, E, E2, E.length);
        if (z12) {
            A1(E, 0, E.length);
        }
        int H2 = H(E);
        return H2 == 0 ? Y(0) : new f(H2, E, z12);
    }

    public long j0() {
        int i10 = 0;
        long j10 = 0;
        for (int i11 = 0; i11 < this.f23226d; i11++) {
            int i12 = this.f23227q[i11] & 65535;
            if (i12 != 0) {
                if (((i12 << 15) & 65535) == 0) {
                    i10 = ((i12 << 14) & 65535) != 0 ? 1 : ((i12 << 13) & 65535) != 0 ? 2 : ((i12 << 12) & 65535) != 0 ? 3 : ((i12 << 11) & 65535) != 0 ? 4 : ((i12 << 10) & 65535) != 0 ? 5 : ((i12 << 9) & 65535) != 0 ? 6 : ((i12 << 8) & 65535) != 0 ? 7 : ((i12 << 7) & 65535) != 0 ? 8 : ((i12 << 6) & 65535) != 0 ? 9 : ((i12 << 5) & 65535) != 0 ? 10 : ((i12 << 4) & 65535) != 0 ? 11 : ((i12 << 3) & 65535) != 0 ? 12 : ((i12 << 2) & 65535) != 0 ? 13 : ((i12 << 1) & 65535) != 0 ? 14 : 15;
                }
                return j10 + i10;
            }
            j10 += 16;
        }
        return -1L;
    }

    public boolean k0(int i10) {
        if (i10 >= 0) {
            if (this.f23226d == 0) {
                return false;
            }
            if (!this.f23225c) {
                return n0(i10);
            }
            int i11 = i10 / 16;
            if (i11 >= this.f23227q.length) {
                return true;
            }
            int i12 = 0;
            while (i12 < i11 && this.f23227q[i12] == 0) {
                i12++;
            }
            short s10 = this.f23227q[i11];
            if (i12 == i11) {
                s10 = (short) (s10 - 1);
            }
            return ((((short) (~s10)) >> (i10 & 15)) & 1) != 0;
        }
        throw new IllegalArgumentException("index");
    }

    public f l0() {
        return Z(m0());
    }

    public f l1(int i10) {
        return i10 == Integer.MIN_VALUE ? n1(Y(i10)) : i10 == 0 ? this : b(-i10);
    }

    public long m0() {
        int i10 = this.f23226d;
        if (i10 != 0) {
            if (this.f23225c) {
                f a10 = a();
                long m02 = a10.m0();
                return a10.G1() ? m02 - 1 : m02;
            }
            int i11 = this.f23227q[i10 - 1] & 65535;
            int i12 = 0;
            if (i11 != 0) {
                i12 = 16;
                if ((i11 >> 8) == 0) {
                    i11 <<= 8;
                    i12 = 8;
                }
                if ((i11 >> 12) == 0) {
                    i11 <<= 4;
                    i12 -= 4;
                }
                if ((i11 >> 14) == 0) {
                    i11 <<= 2;
                    i12 -= 2;
                }
                if ((i11 >> 15) == 0) {
                    i12--;
                }
            }
            return ((i10 - 1) * 16) + i12;
        }
        return 0L;
    }

    public f m1(long j10) {
        return n1(Z(j10));
    }

    public boolean n0(int i10) {
        if (i10 >= 0) {
            int i11 = i10 >> 4;
            short[] sArr = this.f23227q;
            if (i11 >= sArr.length) {
                return false;
            }
            return ((sArr[i11] >> (i10 & 15)) & 1) != 0;
        }
        throw new IllegalArgumentException("index(" + i10 + ") is less than 0");
    }

    public f n1(f fVar) {
        Objects.requireNonNull(fVar, "subtrahend");
        return this.f23226d == 0 ? fVar.L0() : fVar.f23226d == 0 ? this : d(fVar.L0());
    }

    public f o0() {
        return Z(p0());
    }

    public long p0() {
        int i10 = this.f23226d;
        if (i10 != 0) {
            int i11 = this.f23227q[i10 - 1] & 65535;
            long j10 = (i10 - 1) << 4;
            if (i11 == 0) {
                return j10;
            }
            int i12 = 16;
            if ((i11 >> 8) == 0) {
                i11 <<= 8;
                i12 = 8;
            }
            if ((i11 >> 12) == 0) {
                i11 <<= 4;
                i12 -= 4;
            }
            if ((i11 >> 14) == 0) {
                i11 <<= 2;
                i12 -= 2;
            }
            if ((i11 >> 15) == 0) {
                i12--;
            }
            return j10 + i12;
        }
        return 0L;
    }

    public byte[] r1(boolean z10) {
        int I1 = I1();
        int i10 = 0;
        int i11 = 1;
        if (I1 == 0) {
            return new byte[]{0};
        }
        if (I1 > 0) {
            int A = A();
            int i12 = n0((A * 8) - 1) ? A + 1 : A;
            byte[] bArr = new byte[i12];
            int i13 = 0;
            while (i10 < A) {
                int i14 = z10 ? i10 : (i12 - 1) - i10;
                int i15 = z10 ? i10 + 1 : (i12 - 2) - i10;
                short[] sArr = this.f23227q;
                bArr[i14] = (byte) (sArr[i13] & 255);
                if (i15 >= 0 && i15 < i12) {
                    bArr[i15] = (byte) ((sArr[i13] >> 8) & 255);
                }
                i10 += 2;
                i13++;
            }
            return bArr;
        }
        short[] sArr2 = this.f23227q;
        int length = sArr2.length;
        short[] sArr3 = new short[length];
        System.arraycopy(sArr2, 0, sArr3, 0, sArr2.length);
        A1(sArr3, 0, length);
        int i16 = length * 2;
        int i17 = length - 1;
        int i18 = i16;
        while (true) {
            if (i17 < 0) {
                break;
            } else if (sArr3[i17] == -1) {
                i18 -= 2;
                i17--;
            } else if ((sArr3[i17] & 65408) == 65408) {
                i18--;
            } else if ((sArr3[i17] & 32768) != 32768) {
                i18++;
            }
        }
        if (i18 != 0) {
            i11 = i18;
        }
        byte[] bArr2 = new byte[i11];
        bArr2[z10 ? i11 - 1 : 0] = -1;
        int min = Math.min(i11, i16);
        int i19 = 0;
        while (i10 < min) {
            int i20 = z10 ? i10 : (i11 - 1) - i10;
            int i21 = z10 ? i10 + 1 : (i11 - 2) - i10;
            bArr2[i20] = (byte) (sArr3[i19] & 255);
            if (i21 >= 0 && i21 < min) {
                bArr2[i21] = (byte) ((sArr3[i19] >> 8) & 255);
            }
            i10 += 2;
            i19++;
        }
        return bArr2;
    }

    public int s1() {
        int i10 = this.f23226d;
        if (i10 == 0) {
            return 0;
        }
        if (i10 > 2) {
            throw new ArithmeticException();
        }
        if (i10 == 2) {
            short[] sArr = this.f23227q;
            if ((sArr[1] & 32768) != 0) {
                if (!this.f23225c || sArr[1] != Short.MIN_VALUE || sArr[0] != 0) {
                    throw new ArithmeticException();
                }
                return Integer.MIN_VALUE;
            }
        }
        return t1();
    }

    public int t1() {
        int i10 = this.f23226d;
        if (i10 == 0) {
            return 0;
        }
        short[] sArr = this.f23227q;
        int i11 = sArr[0] & 65535;
        if (i10 > 1) {
            i11 |= (sArr[1] & 65535) << 16;
        }
        return this.f23225c ? ~(i11 - 1) : i11;
    }

    public String toString() {
        return H1() ? "0" : C() ? l.w(v1()) : w1(10);
    }

    public long u1() {
        int i10 = this.f23226d;
        if (i10 == 0) {
            return 0L;
        }
        if (i10 > 4) {
            throw new ArithmeticException();
        }
        if (i10 == 4) {
            short[] sArr = this.f23227q;
            if ((sArr[3] & 32768) != 0) {
                if (!this.f23225c || sArr[3] != Short.MIN_VALUE || sArr[2] != 0 || sArr[1] != 0 || sArr[0] != 0) {
                    throw new ArithmeticException();
                }
                return Long.MIN_VALUE;
            }
        }
        return v1();
    }

    public long v1() {
        int i10;
        int i11 = this.f23226d;
        if (i11 == 0) {
            return 0L;
        }
        short[] sArr = this.f23227q;
        int i12 = sArr[0] & 65535;
        if (i11 > 1) {
            i12 |= (sArr[1] & 65535) << 16;
        }
        if (i11 <= 2) {
            long j10 = i12 & 4294967295L;
            return this.f23225c ? -j10 : j10;
        }
        int i13 = sArr[2] & 65535;
        if (i11 > 3) {
            i13 |= (sArr[3] & 65535) << 16;
        }
        if (this.f23225c) {
            if (i12 == 0) {
                i10 = i12 - 1;
                i13--;
            } else {
                i10 = i12 - 1;
            }
            i12 = ~i10;
            i13 = ~i13;
        }
        return (i12 & 4294967295L) | (i13 << 32);
    }

    public String w1(int i10) {
        if (i10 < 2) {
            throw new IllegalArgumentException("radix(" + i10 + ") is less than 2");
        } else if (i10 > 36) {
            throw new IllegalArgumentException("radix(" + i10 + ") is more than 36");
        } else if (this.f23226d == 0) {
            return "0";
        } else {
            if (i10 == 10) {
                if (C()) {
                    return l.w(v1());
                }
                StringBuilder sb2 = new StringBuilder();
                if (this.f23225c) {
                    sb2.append('-');
                }
                a().x1(sb2, i10);
                return sb2.toString();
            }
            boolean z10 = true;
            if (i10 == 16) {
                StringBuilder sb3 = new StringBuilder();
                if (this.f23225c) {
                    sb3.append('-');
                }
                int i11 = 0;
                int i12 = this.f23227q[this.f23226d - 1];
                while (i11 < 4) {
                    if (!z10 || (61440 & i12) != 0) {
                        sb3.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((i12 >> 12) & 15));
                        z10 = false;
                    }
                    i11++;
                    i12 <<= 4;
                }
                for (int i13 = this.f23226d - 2; i13 >= 0; i13--) {
                    int i14 = 0;
                    int i15 = this.f23227q[i13];
                    while (i14 < 4) {
                        sb3.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((i15 >> 12) & 15));
                        i14++;
                        i15 <<= 4;
                    }
                }
                return sb3.toString();
            } else if (i10 != 2) {
                StringBuilder sb4 = new StringBuilder();
                if (this.f23225c) {
                    sb4.append('-');
                }
                a().x1(sb4, i10);
                return sb4.toString();
            } else {
                StringBuilder sb5 = new StringBuilder();
                if (this.f23225c) {
                    sb5.append('-');
                }
                int i16 = 0;
                int i17 = this.f23227q[this.f23226d - 1];
                while (true) {
                    char c10 = '0';
                    if (i16 >= 16) {
                        break;
                    }
                    if (!z10 || (i17 & 32768) != 0) {
                        if ((i17 & 32768) != 0) {
                            c10 = '1';
                        }
                        sb5.append(c10);
                        z10 = false;
                    }
                    i16++;
                    i17 <<= 1;
                }
                for (int i18 = this.f23226d - 2; i18 >= 0; i18--) {
                    int i19 = 0;
                    int i20 = this.f23227q[i18];
                    while (i19 < 16) {
                        sb5.append((i20 & 32768) == 0 ? '0' : '1');
                        i19++;
                        i20 <<= 1;
                    }
                }
                return sb5.toString();
            }
        }
    }
}
