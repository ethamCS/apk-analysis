package ti;

import java.math.BigInteger;
import ti.e;
import ti.i;
/* loaded from: classes3.dex */
public class y extends b {

    /* loaded from: classes3.dex */
    public static class a implements p {

        /* renamed from: a */
        final /* synthetic */ i.b f22454a;

        /* renamed from: b */
        final /* synthetic */ byte f22455b;

        a(i.b bVar, byte b10) {
            this.f22454a = bVar;
            this.f22455b = b10;
        }

        @Override // ti.p
        public q a(q qVar) {
            if (qVar instanceof z) {
                return qVar;
            }
            z zVar = new z();
            zVar.b(t.d(this.f22454a, this.f22455b));
            return zVar;
        }
    }

    private static i.b d(i.b bVar, byte[] bArr) {
        e.b bVar2 = (e.b) bVar.i();
        i.b[] a10 = ((z) bVar2.B(bVar, "bc_wtnaf", new a(bVar, bVar2.n().t().byteValue()))).a();
        i.b[] bVarArr = new i.b[a10.length];
        for (int i10 = 0; i10 < a10.length; i10++) {
            bVarArr[i10] = (i.b) a10[i10].z();
        }
        i.b bVar3 = (i.b) bVar.i().u();
        int i11 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i11++;
            byte b10 = bArr[length];
            if (b10 != 0) {
                bVar3 = (i.b) bVar3.L(i11).a(b10 > 0 ? a10[b10 >>> 1] : bVarArr[(-b10) >>> 1]);
                i11 = 0;
            }
        }
        return i11 > 0 ? bVar3.L(i11) : bVar3;
    }

    private i.b e(i.b bVar, a0 a0Var, byte b10, byte b11) {
        a0[] a0VarArr = b10 == 0 ? t.f22429d : t.f22431f;
        return d(bVar, t.l(b11, a0Var, (byte) 4, BigInteger.valueOf(16L), t.g(b11, 4), a0VarArr));
    }

    @Override // ti.b
    protected i c(i iVar, BigInteger bigInteger) {
        if (iVar instanceof i.b) {
            i.b bVar = (i.b) iVar;
            e.b bVar2 = (e.b) bVar.i();
            int t10 = bVar2.t();
            byte byteValue = bVar2.n().t().byteValue();
            byte c10 = t.c(byteValue);
            return e(bVar, t.j(bigInteger, t10, byteValue, bVar2.G(), c10, (byte) 10), byteValue, c10);
        }
        throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
    }
}
