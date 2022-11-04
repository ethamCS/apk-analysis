package zh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class p0 extends m0 {

    /* renamed from: q */
    private BigInteger f26976q;

    public p0(BigInteger bigInteger, n0 n0Var) {
        super(false, n0Var);
        this.f26976q = bigInteger;
    }

    public BigInteger c() {
        return this.f26976q;
    }

    @Override // zh.m0
    public boolean equals(Object obj) {
        return (obj instanceof p0) && ((p0) obj).c().equals(this.f26976q) && super.equals(obj);
    }

    @Override // zh.m0
    public int hashCode() {
        return this.f26976q.hashCode() ^ super.hashCode();
    }
}
