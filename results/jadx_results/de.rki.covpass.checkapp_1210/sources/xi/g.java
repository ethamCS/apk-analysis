package xi;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a */
    protected final BigInteger f25666a;

    /* renamed from: b */
    protected final BigInteger f25667b;

    /* renamed from: c */
    protected final BigInteger f25668c;

    /* renamed from: d */
    protected final BigInteger f25669d;

    /* renamed from: e */
    protected final BigInteger f25670e;

    /* renamed from: f */
    protected final BigInteger f25671f;

    /* renamed from: g */
    protected final int f25672g;

    public g(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.f25666a = bigIntegerArr[0];
        this.f25667b = bigIntegerArr[1];
        this.f25668c = bigIntegerArr2[0];
        this.f25669d = bigIntegerArr2[1];
        this.f25670e = bigInteger;
        this.f25671f = bigInteger2;
        this.f25672g = i10;
    }

    private static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
        }
    }

    public int b() {
        return this.f25672g;
    }

    public BigInteger c() {
        return this.f25670e;
    }

    public BigInteger d() {
        return this.f25671f;
    }

    public BigInteger e() {
        return this.f25666a;
    }

    public BigInteger f() {
        return this.f25667b;
    }

    public BigInteger g() {
        return this.f25668c;
    }

    public BigInteger h() {
        return this.f25669d;
    }
}
