package zh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class o0 extends m0 {

    /* renamed from: q */
    private BigInteger f26974q;

    public o0(BigInteger bigInteger, n0 n0Var) {
        super(true, n0Var);
        this.f26974q = bigInteger;
    }

    public BigInteger c() {
        return this.f26974q;
    }

    @Override // zh.m0
    public boolean equals(Object obj) {
        if ((obj instanceof o0) && ((o0) obj).c().equals(this.f26974q)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // zh.m0
    public int hashCode() {
        return c().hashCode();
    }
}
