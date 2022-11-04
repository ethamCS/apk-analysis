package xi;

import java.math.BigInteger;
import ti.i;
import ti.p;
import ti.q;
/* loaded from: classes3.dex */
public abstract class c {

    /* loaded from: classes3.dex */
    public static class a implements p {

        /* renamed from: a */
        final /* synthetic */ xi.a f25659a;

        /* renamed from: b */
        final /* synthetic */ i f25660b;

        a(xi.a aVar, i iVar) {
            this.f25659a = aVar;
            this.f25660b = iVar;
        }

        private boolean b(b bVar, xi.a aVar) {
            return (bVar == null || bVar.a() != aVar || bVar.b() == null) ? false : true;
        }

        @Override // ti.p
        public q a(q qVar) {
            b bVar = qVar instanceof b ? (b) qVar : null;
            if (b(bVar, this.f25659a)) {
                return bVar;
            }
            i a10 = this.f25659a.a().a(this.f25660b);
            b bVar2 = new b();
            bVar2.c(this.f25659a);
            bVar2.d(a10);
            return bVar2;
        }
    }

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        boolean z10 = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i10 - 1);
        BigInteger shiftRight = multiply.shiftRight(i10);
        if (testBit) {
            shiftRight = shiftRight.add(ti.d.f22360b);
        }
        return z10 ? shiftRight.negate() : shiftRight;
    }

    public static BigInteger[] b(g gVar, BigInteger bigInteger) {
        int b10 = gVar.b();
        BigInteger a10 = a(bigInteger, gVar.c(), b10);
        BigInteger a11 = a(bigInteger, gVar.d(), b10);
        return new BigInteger[]{bigInteger.subtract(a10.multiply(gVar.e()).add(a11.multiply(gVar.g()))), a10.multiply(gVar.f()).add(a11.multiply(gVar.h())).negate()};
    }

    public static i c(xi.a aVar, i iVar) {
        return ((b) iVar.i().B(iVar, "bc_endo", new a(aVar, iVar))).b();
    }
}
