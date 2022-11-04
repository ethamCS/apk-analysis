package com.fasterxml.jackson.datatype.jsr310;

import j$.time.Instant;
import j$.util.function.BiFunction;
import java.math.BigDecimal;
/* loaded from: classes.dex */
public final class DecimalUtils {
    private static final BigDecimal ONE_BILLION = new BigDecimal(1000000000L);

    public static <T> T extractSecondsAndNanos(BigDecimal bigDecimal, BiFunction<Long, Integer, T> biFunction) {
        long j10;
        BigDecimal scaleByPowerOfTen = bigDecimal.scaleByPowerOfTen(9);
        int i10 = 0;
        if (scaleByPowerOfTen.precision() - scaleByPowerOfTen.scale() > 0 && bigDecimal.scale() >= -63) {
            long longValue = bigDecimal.longValue();
            int intValue = scaleByPowerOfTen.subtract(new BigDecimal(longValue).scaleByPowerOfTen(9)).intValue();
            if (longValue < 0 && longValue > Instant.MIN.getEpochSecond()) {
                intValue = Math.abs(intValue);
            }
            j10 = longValue;
            i10 = intValue;
        } else {
            j10 = 0;
        }
        return biFunction.apply(Long.valueOf(j10), Integer.valueOf(i10));
    }

    public static BigDecimal toBigDecimal(long j10, int i10) {
        BigDecimal valueOf;
        int i11;
        if (i10 == 0) {
            if (j10 == 0) {
                valueOf = BigDecimal.ZERO;
                i11 = 1;
            } else {
                valueOf = BigDecimal.valueOf(j10);
                i11 = 9;
            }
            return valueOf.setScale(i11);
        }
        return new BigDecimal(toDecimal(j10, i10));
    }

    public static String toDecimal(long j10, int i10) {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(j10);
        sb2.append('.');
        if (i10 != 0) {
            StringBuilder sb3 = new StringBuilder(9);
            sb3.append(i10);
            int length = 9 - sb3.length();
            while (length > 0) {
                length--;
                sb2.append('0');
            }
            sb2.append((CharSequence) sb3);
        } else if (j10 == 0) {
            return "0.0";
        } else {
            sb2.append("000000000");
        }
        return sb2.toString();
    }
}
