package com.fasterxml.jackson.module.kotlin;

import a5.e;
import hc.t;
import java.math.BigInteger;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.a0;
import tb.c0;
import tb.y;
import tb.z;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000ø\u0001\u0000\u001a\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003ø\u0001\u0000\u001a\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006ø\u0001\u0000\u001a\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\tø\u0001\u0000\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {BuildConfig.FLAVOR, "Ltb/y;", "asUByte", BuildConfig.FLAVOR, "Ltb/c0;", "asUShort", BuildConfig.FLAVOR, "Ltb/z;", "asUInt", "Ljava/math/BigInteger;", "Ltb/a0;", "asULong", "uLongMaxValue", "Ljava/math/BigInteger;", "jackson-module-kotlin"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class UnsignedNumbersKt {
    private static final BigInteger uLongMaxValue;

    static {
        String a10;
        a10 = e.a(-1L, 10);
        uLongMaxValue = new BigInteger(a10);
    }

    public static final y asUByte(short s10) {
        if (s10 < 0 || s10 > ((short) (((short) (-1)) & 255))) {
            return null;
        }
        return y.a(y.b((byte) s10));
    }

    public static final z asUInt(long j10) {
        if (j10 < 0 || j10 > ((-1) & 4294967295L)) {
            return null;
        }
        return z.a(z.b((int) j10));
    }

    public static final a0 asULong(BigInteger bigInteger) {
        t.e(bigInteger, "<this>");
        if (bigInteger.compareTo(BigInteger.ZERO) < 0 || bigInteger.compareTo(uLongMaxValue) > 0) {
            return null;
        }
        return a0.a(a0.b(bigInteger.longValue()));
    }

    public static final c0 asUShort(int i10) {
        if (i10 < 0 || i10 > 65535) {
            return null;
        }
        return c0.a(c0.b((short) i10));
    }
}
