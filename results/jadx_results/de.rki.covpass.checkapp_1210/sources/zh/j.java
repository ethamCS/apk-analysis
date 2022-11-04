package zh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class j extends f {

    /* renamed from: q */
    private BigInteger f26944q;

    public j(BigInteger bigInteger, i iVar) {
        super(true, iVar);
        this.f26944q = bigInteger;
    }

    public BigInteger c() {
        return this.f26944q;
    }

    @Override // zh.f
    public boolean equals(Object obj) {
        return (obj instanceof j) && ((j) obj).c().equals(this.f26944q) && super.equals(obj);
    }

    @Override // zh.f
    public int hashCode() {
        return this.f26944q.hashCode() ^ super.hashCode();
    }
}
