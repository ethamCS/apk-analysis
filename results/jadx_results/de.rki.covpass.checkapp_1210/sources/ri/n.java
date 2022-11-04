package ri;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a */
    private BigInteger f21240a;

    /* renamed from: b */
    private BigInteger f21241b;

    /* renamed from: c */
    private BigInteger f21242c;

    public n(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f21240a = bigInteger;
        this.f21241b = bigInteger2;
        this.f21242c = bigInteger3;
    }

    public BigInteger a() {
        return this.f21242c;
    }

    public BigInteger b() {
        return this.f21240a;
    }

    public BigInteger c() {
        return this.f21241b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f21242c.equals(nVar.f21242c) && this.f21240a.equals(nVar.f21240a) && this.f21241b.equals(nVar.f21241b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f21242c.hashCode() ^ this.f21240a.hashCode()) ^ this.f21241b.hashCode();
    }
}
