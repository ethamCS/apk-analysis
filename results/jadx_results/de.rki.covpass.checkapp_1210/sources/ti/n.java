package ti;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class n extends b {

    /* renamed from: a */
    protected final e f22416a;

    /* renamed from: b */
    protected final xi.d f22417b;

    public n(e eVar, xi.d dVar) {
        if (eVar == null || eVar.w() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.f22416a = eVar;
        this.f22417b = dVar;
    }

    @Override // ti.b
    protected i c(i iVar, BigInteger bigInteger) {
        if (this.f22416a.l(iVar.i())) {
            BigInteger[] c10 = this.f22417b.c(bigInteger.mod(iVar.i().w()));
            BigInteger bigInteger2 = c10[0];
            BigInteger bigInteger3 = c10[1];
            return this.f22417b.b() ? c.e(this.f22417b, iVar, bigInteger2, bigInteger3) : c.d(iVar, bigInteger2, xi.c.c(this.f22417b, iVar), bigInteger3);
        }
        throw new IllegalStateException();
    }
}
