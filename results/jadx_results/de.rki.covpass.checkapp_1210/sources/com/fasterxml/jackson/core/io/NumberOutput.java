package com.fasterxml.jackson.core.io;
/* loaded from: classes.dex */
public final class NumberOutput {
    private static int BILLION = 1000000000;
    private static long BILLION_L = 1000000000;
    private static long MAX_INT_AS_LONG = 2147483647L;
    private static int MILLION = 1000000;
    private static long MIN_INT_AS_LONG = -2147483648L;
    static final String SMALLEST_INT = String.valueOf(Integer.MIN_VALUE);
    static final String SMALLEST_LONG = String.valueOf(Long.MIN_VALUE);
    private static final int[] TRIPLET_TO_CHARS = new int[1000];
    private static final String[] sSmallIntStrs;
    private static final String[] sSmallIntStrs2;

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                int i13 = 0;
                while (i13 < 10) {
                    TRIPLET_TO_CHARS[i10] = ((i11 + 48) << 16) | ((i12 + 48) << 8) | (i13 + 48);
                    i13++;
                    i10++;
                }
            }
        }
        sSmallIntStrs = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        sSmallIntStrs2 = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int _full3(int i10, char[] cArr, int i11) {
        int i12 = TRIPLET_TO_CHARS[i10];
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 >> 16);
        int i14 = i13 + 1;
        cArr[i13] = (char) ((i12 >> 8) & 127);
        int i15 = i14 + 1;
        cArr[i14] = (char) (i12 & 127);
        return i15;
    }

    private static int _leading3(int i10, char[] cArr, int i11) {
        int i12 = TRIPLET_TO_CHARS[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                cArr[i11] = (char) (i12 >> 16);
                i11++;
            }
            cArr[i11] = (char) ((i12 >> 8) & 127);
            i11++;
        }
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 & 127);
        return i13;
    }

    private static int _outputFullBillion(int i10, char[] cArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int[] iArr = TRIPLET_TO_CHARS;
        int i15 = iArr[i14];
        int i16 = i11 + 1;
        cArr[i11] = (char) (i15 >> 16);
        int i17 = i16 + 1;
        cArr[i16] = (char) ((i15 >> 8) & 127);
        int i18 = i17 + 1;
        cArr[i17] = (char) (i15 & 127);
        int i19 = iArr[i12 - (i14 * 1000)];
        int i20 = i18 + 1;
        cArr[i18] = (char) (i19 >> 16);
        int i21 = i20 + 1;
        cArr[i20] = (char) ((i19 >> 8) & 127);
        int i22 = i21 + 1;
        cArr[i21] = (char) (i19 & 127);
        int i23 = iArr[i13];
        int i24 = i22 + 1;
        cArr[i22] = (char) (i23 >> 16);
        int i25 = i24 + 1;
        cArr[i24] = (char) ((i23 >> 8) & 127);
        int i26 = i25 + 1;
        cArr[i25] = (char) (i23 & 127);
        return i26;
    }

    private static int _outputSmallestI(char[] cArr, int i10) {
        String str = SMALLEST_INT;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int _outputSmallestL(char[] cArr, int i10) {
        String str = SMALLEST_LONG;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int _outputUptoBillion(int i10, char[] cArr, int i11) {
        if (i10 < MILLION) {
            if (i10 < 1000) {
                return _leading3(i10, cArr, i11);
            }
            int i12 = i10 / 1000;
            return _outputUptoMillion(cArr, i11, i12, i10 - (i12 * 1000));
        }
        int i13 = i10 / 1000;
        int i14 = i10 - (i13 * 1000);
        int i15 = i13 / 1000;
        int _leading3 = _leading3(i15, cArr, i11);
        int[] iArr = TRIPLET_TO_CHARS;
        int i16 = iArr[i13 - (i15 * 1000)];
        int i17 = _leading3 + 1;
        cArr[_leading3] = (char) (i16 >> 16);
        int i18 = i17 + 1;
        cArr[i17] = (char) ((i16 >> 8) & 127);
        int i19 = i18 + 1;
        cArr[i18] = (char) (i16 & 127);
        int i20 = iArr[i14];
        int i21 = i19 + 1;
        cArr[i19] = (char) (i20 >> 16);
        int i22 = i21 + 1;
        cArr[i21] = (char) ((i20 >> 8) & 127);
        int i23 = i22 + 1;
        cArr[i22] = (char) (i20 & 127);
        return i23;
    }

    private static int _outputUptoMillion(char[] cArr, int i10, int i11, int i12) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                cArr[i10] = (char) (i13 >> 16);
                i10++;
            }
            cArr[i10] = (char) ((i13 >> 8) & 127);
            i10++;
        }
        int i14 = i10 + 1;
        cArr[i10] = (char) (i13 & 127);
        int i15 = iArr[i12];
        int i16 = i14 + 1;
        cArr[i14] = (char) (i15 >> 16);
        int i17 = i16 + 1;
        cArr[i16] = (char) ((i15 >> 8) & 127);
        int i18 = i17 + 1;
        cArr[i17] = (char) (i15 & 127);
        return i18;
    }

    public static boolean notFinite(double d10) {
        return Double.isNaN(d10) || Double.isInfinite(d10);
    }

    public static boolean notFinite(float f10) {
        return Float.isNaN(f10) || Float.isInfinite(f10);
    }

    public static int outputInt(int i10, char[] cArr, int i11) {
        int i12;
        int _full3;
        int i13;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return _outputSmallestI(cArr, i11);
            }
            cArr[i11] = '-';
            i10 = -i10;
            i11++;
        }
        if (i10 >= MILLION) {
            int i14 = BILLION;
            if (i10 >= i14) {
                int i15 = i10 - i14;
                if (i15 >= i14) {
                    i15 -= i14;
                    i13 = i11 + 1;
                    cArr[i11] = '2';
                } else {
                    i13 = i11 + 1;
                    cArr[i11] = '1';
                }
                return _outputFullBillion(i15, cArr, i13);
            }
            int i16 = i10 / 1000;
            i12 = i10 - (i16 * 1000);
            int i17 = i16 / 1000;
            _full3 = _full3(i16 - (i17 * 1000), cArr, _leading3(i17, cArr, i11));
        } else if (i10 < 1000) {
            if (i10 >= 10) {
                return _leading3(i10, cArr, i11);
            }
            cArr[i11] = (char) (i10 + 48);
            return i11 + 1;
        } else {
            int i18 = i10 / 1000;
            i12 = i10 - (i18 * 1000);
            _full3 = _leading3(i18, cArr, i11);
        }
        return _full3(i12, cArr, _full3);
    }

    public static int outputLong(long j10, char[] cArr, int i10) {
        int i11;
        if (j10 < 0) {
            if (j10 > MIN_INT_AS_LONG) {
                return outputInt((int) j10, cArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return _outputSmallestL(cArr, i10);
            }
            cArr[i10] = '-';
            j10 = -j10;
            i10++;
        } else if (j10 <= MAX_INT_AS_LONG) {
            return outputInt((int) j10, cArr, i10);
        }
        long j11 = BILLION_L;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            i11 = _outputUptoBillion((int) j12, cArr, i10);
        } else {
            long j14 = j12 / j11;
            int _leading3 = _leading3((int) j14, cArr, i10);
            i11 = _outputFullBillion((int) (j12 - (j11 * j14)), cArr, _leading3);
        }
        return _outputFullBillion((int) j13, cArr, i11);
    }

    public static String toString(double d10) {
        return Double.toString(d10);
    }

    public static String toString(float f10) {
        return Float.toString(f10);
    }

    public static String toString(int i10) {
        String[] strArr = sSmallIntStrs;
        if (i10 < strArr.length) {
            if (i10 >= 0) {
                return strArr[i10];
            }
            int i11 = (-i10) - 1;
            String[] strArr2 = sSmallIntStrs2;
            if (i11 < strArr2.length) {
                return strArr2[i11];
            }
        }
        return Integer.toString(i10);
    }

    public static String toString(long j10) {
        return (j10 > 2147483647L || j10 < -2147483648L) ? Long.toString(j10) : toString((int) j10);
    }
}
