package com.fasterxml.jackson.core.io;

import java.math.BigDecimal;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class BigDecimalParser {
    private final char[] chars;

    BigDecimalParser(char[] cArr) {
        this.chars = cArr;
    }

    private int adjustScale(int i10, long j10) {
        long j11 = i10 - j10;
        if (j11 > 2147483647L || j11 < -2147483648L) {
            throw new NumberFormatException("Scale out of range: " + j11 + " while adjusting scale " + i10 + " to exponent " + j10);
        }
        return (int) j11;
    }

    public static BigDecimal parse(String str) {
        return parse(str.toCharArray());
    }

    public static BigDecimal parse(char[] cArr) {
        int length = cArr.length;
        try {
            return length < 500 ? new BigDecimal(cArr) : new BigDecimalParser(cArr).parseBigDecimal(length / 10);
        } catch (NumberFormatException e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            throw new NumberFormatException("Value \"" + new String(cArr) + "\" can not be represented as `java.math.BigDecimal`, reason: " + message);
        }
    }

    public static BigDecimal parse(char[] cArr, int i10, int i11) {
        if (i10 > 0 || i11 != cArr.length) {
            cArr = Arrays.copyOfRange(cArr, i10, i11 + i10);
        }
        return parse(cArr);
    }

    private BigDecimal parseBigDecimal(int i10) {
        int i11;
        int i12;
        BigDecimal bigDecimal;
        int length = this.chars.length;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i16 = 0;
        boolean z12 = false;
        for (int i17 = 0; i17 < length; i17++) {
            char c10 = this.chars[i17];
            if (c10 != '+') {
                if (c10 == 'E' || c10 == 'e') {
                    if (i13 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    i13 = i17;
                } else if (c10 != '-') {
                    if (c10 != '.') {
                        if (i14 >= 0 && i13 == -1) {
                            i15++;
                        }
                    } else if (i14 >= 0) {
                        throw new NumberFormatException("Multiple decimal points");
                    } else {
                        i14 = i17;
                    }
                } else if (i13 >= 0) {
                    if (z11) {
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    z11 = true;
                } else if (z10) {
                    throw new NumberFormatException("Multiple signs in number");
                } else {
                    i16 = i17 + 1;
                    z10 = true;
                    z12 = true;
                }
            } else if (i13 >= 0) {
                if (z11) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z11 = true;
            } else if (z10) {
                throw new NumberFormatException("Multiple signs in number");
            } else {
                i16 = i17 + 1;
                z10 = true;
            }
        }
        if (i13 >= 0) {
            i11 = 1;
            i12 = Integer.parseInt(new String(this.chars, i13 + 1, (length - i13) - 1));
            i15 = adjustScale(i15, i12);
            length = i13;
        } else {
            i11 = 1;
            i12 = 0;
        }
        if (i14 >= 0) {
            int i18 = (length - i14) - i11;
            bigDecimal = toBigDecimalRec(i16, i14 - i16, i12, i10).add(toBigDecimalRec(i14 + i11, i18, i12 - i18, i10));
        } else {
            bigDecimal = toBigDecimalRec(i16, length - i16, i12, i10);
        }
        if (i15 != 0) {
            bigDecimal = bigDecimal.setScale(i15);
        }
        return z12 ? bigDecimal.negate() : bigDecimal;
    }

    private BigDecimal toBigDecimalRec(int i10, int i11, int i12, int i13) {
        if (i11 <= i13) {
            return i11 == 0 ? BigDecimal.ZERO : new BigDecimal(this.chars, i10, i11).movePointRight(i12);
        }
        int i14 = i11 / 2;
        return toBigDecimalRec(i10, i14, (i12 + i11) - i14, i13).add(toBigDecimalRec(i10 + i14, i11 - i14, i12, i13));
    }
}
