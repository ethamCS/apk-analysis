package zh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class t0 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private BigInteger f27001c;

    /* renamed from: d */
    private BigInteger f27002d;

    /* renamed from: q */
    private BigInteger f27003q;

    /* renamed from: x */
    private w0 f27004x;

    public t0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f27001c = bigInteger;
        this.f27002d = bigInteger2;
        this.f27003q = bigInteger3;
    }

    public t0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, w0 w0Var) {
        this.f27003q = bigInteger3;
        this.f27001c = bigInteger;
        this.f27002d = bigInteger2;
        this.f27004x = w0Var;
    }

    public BigInteger a() {
        return this.f27003q;
    }

    public BigInteger b() {
        return this.f27001c;
    }

    public BigInteger c() {
        return this.f27002d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return t0Var.b().equals(this.f27001c) && t0Var.c().equals(this.f27002d) && t0Var.a().equals(this.f27003q);
    }

    public int hashCode() {
        return (this.f27001c.hashCode() ^ this.f27002d.hashCode()) ^ this.f27003q.hashCode();
    }
}
