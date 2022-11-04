package zh;

import java.math.BigInteger;
import java.util.Objects;
/* loaded from: classes3.dex */
public class y implements ti.d {

    /* renamed from: g */
    private final ti.e f27029g;

    /* renamed from: h */
    private final byte[] f27030h;

    /* renamed from: i */
    private final ti.i f27031i;

    /* renamed from: j */
    private final BigInteger f27032j;

    /* renamed from: k */
    private final BigInteger f27033k;

    /* renamed from: l */
    private BigInteger f27034l;

    public y(ih.i iVar) {
        this(iVar.l(), iVar.m(), iVar.q(), iVar.n(), iVar.r());
    }

    public y(ti.e eVar, ti.i iVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eVar, iVar, bigInteger, bigInteger2, null);
    }

    public y(ti.e eVar, ti.i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f27034l = null;
        Objects.requireNonNull(eVar, "curve");
        Objects.requireNonNull(bigInteger, "n");
        this.f27029g = eVar;
        this.f27031i = h(eVar, iVar);
        this.f27032j = bigInteger;
        this.f27033k = bigInteger2;
        this.f27030h = ak.a.h(bArr);
    }

    static ti.i h(ti.e eVar, ti.i iVar) {
        Objects.requireNonNull(iVar, "Point cannot be null");
        ti.i A = ti.c.k(eVar, iVar).A();
        if (!A.u()) {
            if (!A.w()) {
                throw new IllegalArgumentException("Point not on curve");
            }
            return A;
        }
        throw new IllegalArgumentException("Point at infinity");
    }

    public ti.e a() {
        return this.f27029g;
    }

    public ti.i b() {
        return this.f27031i;
    }

    public BigInteger c() {
        return this.f27033k;
    }

    public synchronized BigInteger d() {
        if (this.f27034l == null) {
            this.f27034l = ak.b.k(this.f27032j, this.f27033k);
        }
        return this.f27034l;
    }

    public BigInteger e() {
        return this.f27032j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f27029g.l(yVar.f27029g) && this.f27031i.e(yVar.f27031i) && this.f27032j.equals(yVar.f27032j);
    }

    public byte[] f() {
        return ak.a.h(this.f27030h);
    }

    public BigInteger g(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "Scalar cannot be null");
        if (bigInteger.compareTo(ti.d.f22360b) < 0 || bigInteger.compareTo(e()) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        return bigInteger;
    }

    public int hashCode() {
        return ((((this.f27029g.hashCode() ^ 1028) * 257) ^ this.f27031i.hashCode()) * 257) ^ this.f27032j.hashCode();
    }

    public ti.i i(ti.i iVar) {
        return h(a(), iVar);
    }
}
