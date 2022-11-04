package zh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class r implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private BigInteger f26990c;

    /* renamed from: d */
    private BigInteger f26991d;

    /* renamed from: q */
    private BigInteger f26992q;

    /* renamed from: x */
    private u f26993x;

    public r(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f26990c = bigInteger3;
        this.f26992q = bigInteger;
        this.f26991d = bigInteger2;
    }

    public r(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, u uVar) {
        this.f26990c = bigInteger3;
        this.f26992q = bigInteger;
        this.f26991d = bigInteger2;
        this.f26993x = uVar;
    }

    public BigInteger a() {
        return this.f26990c;
    }

    public BigInteger b() {
        return this.f26992q;
    }

    public BigInteger c() {
        return this.f26991d;
    }

    public u d() {
        return this.f26993x;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.b().equals(this.f26992q) && rVar.c().equals(this.f26991d) && rVar.a().equals(this.f26990c);
    }

    public int hashCode() {
        return (b().hashCode() ^ c().hashCode()) ^ a().hashCode();
    }
}
