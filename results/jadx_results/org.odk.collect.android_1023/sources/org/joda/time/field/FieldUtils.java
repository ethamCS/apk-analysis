package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
/* loaded from: classes.dex */
public class FieldUtils {
    private FieldUtils() {
    }

    public static int safeNegate(int i) {
        if (i == Integer.MIN_VALUE) {
            throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
        }
        return -i;
    }

    public static int safeAdd(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) < 0 && (i ^ i2) >= 0) {
            throw new ArithmeticException("The calculation caused an overflow: " + i + " + " + i2);
        }
        return i3;
    }

    public static long safeAdd(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) < 0 && (j ^ j2) >= 0) {
            throw new ArithmeticException("The calculation caused an overflow: " + j + " + " + j2);
        }
        return j3;
    }

    public static long safeSubtract(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) < 0 && (j ^ j2) < 0) {
            throw new ArithmeticException("The calculation caused an overflow: " + j + " - " + j2);
        }
        return j3;
    }

    public static int safeMultiply(int i, int i2) {
        long j = i * i2;
        if (j < -2147483648L || j > 2147483647L) {
            throw new ArithmeticException("The calculation caused an overflow: " + i + " * " + i2);
        }
        return (int) j;
    }

    public static long safeMultiply(long j, int i) {
        switch (i) {
            case -1:
                return -j;
            case 0:
                return 0L;
            case 1:
                return j;
            default:
                long j2 = i * j;
                if (j2 / i == j) {
                    return j2;
                }
                throw new ArithmeticException("The calculation caused an overflow: " + j + " * " + i);
        }
    }

    public static long safeMultiply(long j, long j2) {
        if (j2 != 1) {
            if (j2 == 0) {
                return 0L;
            }
            long j3 = j * j2;
            if (j3 / j2 == j) {
                return j3;
            }
            throw new ArithmeticException("The calculation caused an overflow: " + j + " * " + j2);
        }
        return j;
    }

    public static int safeToInt(long j) {
        if (-2147483648L <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("Value cannot fit in an int: " + j);
    }

    public static int safeMultiplyToInt(long j, long j2) {
        return safeToInt(safeMultiply(j, j2));
    }

    public static void verifyValueBounds(DateTimeField dateTimeField, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeField.getType(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static void verifyValueBounds(DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static void verifyValueBounds(String str, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static int getWrappedValue(int i, int i2, int i3, int i4) {
        return getWrappedValue(i + i2, i3, i4);
    }

    public static int getWrappedValue(int i, int i2, int i3) {
        if (i2 >= i3) {
            throw new IllegalArgumentException("MIN > MAX");
        }
        int i4 = (i3 - i2) + 1;
        int i5 = i - i2;
        if (i5 >= 0) {
            return (i5 % i4) + i2;
        }
        int i6 = (-i5) % i4;
        if (i6 == 0) {
            return i2 + 0;
        }
        return (i4 - i6) + i2;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }
}
