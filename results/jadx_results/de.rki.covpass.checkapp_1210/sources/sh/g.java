package sh;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class g {

    /* renamed from: d */
    private static final BigInteger f21720d = BigInteger.valueOf(2);

    /* renamed from: a */
    private int f21721a;

    /* renamed from: b */
    private int f21722b;

    /* renamed from: c */
    private SecureRandom f21723c;

    public zh.i a() {
        BigInteger[] a10 = h.a(this.f21721a, this.f21722b, this.f21723c);
        BigInteger bigInteger = a10[0];
        BigInteger bigInteger2 = a10[1];
        return new zh.i(bigInteger, h.b(bigInteger, bigInteger2, this.f21723c), bigInteger2, f21720d, null);
    }

    public void b(int i10, int i11, SecureRandom secureRandom) {
        this.f21721a = i10;
        this.f21722b = i11;
        this.f21723c = secureRandom;
    }
}
