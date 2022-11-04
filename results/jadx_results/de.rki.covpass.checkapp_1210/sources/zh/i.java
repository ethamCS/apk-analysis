package zh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class i implements org.bouncycastle.crypto.i {
    private int U3;
    private n V3;

    /* renamed from: c */
    private BigInteger f26937c;

    /* renamed from: d */
    private BigInteger f26938d;

    /* renamed from: q */
    private BigInteger f26939q;

    /* renamed from: x */
    private BigInteger f26940x;

    /* renamed from: y */
    private int f26941y;

    public i(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, a(i10), i10, null, null);
    }

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11, BigInteger bigInteger4, n nVar) {
        if (i11 != 0) {
            if (i11 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i10 <= bigInteger.bitLength() || ak.m.c("org.bouncycastle.dh.allow_unsafe_p_value")) {
            this.f26937c = bigInteger2;
            this.f26938d = bigInteger;
            this.f26939q = bigInteger3;
            this.f26941y = i10;
            this.U3 = i11;
            this.f26940x = bigInteger4;
            this.V3 = nVar;
            return;
        }
        throw new IllegalArgumentException("unsafe p value so small specific l required");
    }

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, n nVar) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, nVar);
    }

    private static int a(int i10) {
        if (i10 != 0 && i10 < 160) {
            return i10;
        }
        return 160;
    }

    public BigInteger b() {
        return this.f26937c;
    }

    public BigInteger c() {
        return this.f26940x;
    }

    public int d() {
        return this.U3;
    }

    public int e() {
        return this.f26941y;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (g() != null) {
            if (!g().equals(iVar.g())) {
                return false;
            }
        } else if (iVar.g() != null) {
            return false;
        }
        return iVar.f().equals(this.f26938d) && iVar.b().equals(this.f26937c);
    }

    public BigInteger f() {
        return this.f26938d;
    }

    public BigInteger g() {
        return this.f26939q;
    }

    public n h() {
        return this.V3;
    }

    public int hashCode() {
        return (f().hashCode() ^ b().hashCode()) ^ (g() != null ? g().hashCode() : 0);
    }
}
