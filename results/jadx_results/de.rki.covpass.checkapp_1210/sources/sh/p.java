package sh;

import java.math.BigInteger;
import java.security.SecureRandom;
import zh.n0;
/* loaded from: classes3.dex */
public class p {

    /* renamed from: a */
    private int f21744a;

    /* renamed from: b */
    private int f21745b;

    /* renamed from: c */
    private SecureRandom f21746c;

    public n0 a() {
        BigInteger[] a10 = h.a(this.f21744a, this.f21745b, this.f21746c);
        BigInteger bigInteger = a10[0];
        return new n0(bigInteger, h.b(bigInteger, a10[1], this.f21746c));
    }

    public void b(int i10, int i11, SecureRandom secureRandom) {
        this.f21744a = i10;
        this.f21745b = i11;
        this.f21746c = secureRandom;
    }
}
