package aj;

import java.math.BigInteger;
/* loaded from: classes3.dex */
class g implements a {

    /* renamed from: a */
    protected final BigInteger f547a;

    public g(BigInteger bigInteger) {
        this.f547a = bigInteger;
    }

    @Override // aj.a
    public int b() {
        return 1;
    }

    @Override // aj.a
    public BigInteger c() {
        return this.f547a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f547a.equals(((g) obj).f547a);
        }
        return false;
    }

    public int hashCode() {
        return this.f547a.hashCode();
    }
}
