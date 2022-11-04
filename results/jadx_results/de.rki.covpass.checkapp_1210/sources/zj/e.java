package zj;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a */
    private static final BigInteger f27084a = BigInteger.valueOf(0);

    /* renamed from: b */
    private static final BigInteger f27085b = BigInteger.valueOf(1);

    /* renamed from: c */
    private static final BigInteger f27086c = BigInteger.valueOf(2);

    /* renamed from: d */
    private static final BigInteger f27087d = BigInteger.valueOf(4);

    /* renamed from: e */
    private static final int[] f27088e = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};

    /* renamed from: f */
    private static SecureRandom f27089f = null;

    /* renamed from: g */
    private static final int[] f27090g = {0, 1, 0, -1, 0, -1, 0, 1};

    public static int a(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 < 0) {
            i10 = -i10;
        }
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 8;
        }
        return i11;
    }
}
