package zh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class n0 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private BigInteger f26966c;

    /* renamed from: d */
    private BigInteger f26967d;

    /* renamed from: q */
    private int f26968q;

    public n0(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public n0(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.f26966c = bigInteger2;
        this.f26967d = bigInteger;
        this.f26968q = i10;
    }

    public BigInteger a() {
        return this.f26966c;
    }

    public int b() {
        return this.f26968q;
    }

    public BigInteger c() {
        return this.f26967d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return n0Var.c().equals(this.f26967d) && n0Var.a().equals(this.f26966c) && n0Var.b() == this.f26968q;
    }

    public int hashCode() {
        return (c().hashCode() ^ a().hashCode()) + this.f26968q;
    }
}
