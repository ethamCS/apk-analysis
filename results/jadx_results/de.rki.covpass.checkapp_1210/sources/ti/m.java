package ti;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class m {

    /* loaded from: classes3.dex */
    public static class a implements p {

        /* renamed from: a */
        final /* synthetic */ e f22414a;

        /* renamed from: b */
        final /* synthetic */ i f22415b;

        a(e eVar, i iVar) {
            this.f22414a = eVar;
            this.f22415b = iVar;
        }

        private boolean b(l lVar, int i10) {
            return lVar != null && c(lVar.a(), i10);
        }

        private boolean c(g gVar, int i10) {
            return gVar != null && gVar.b() >= i10;
        }

        @Override // ti.p
        public q a(q qVar) {
            l lVar = qVar instanceof l ? (l) qVar : null;
            int a10 = m.a(this.f22414a);
            int i10 = a10 > 250 ? 6 : 5;
            int i11 = 1 << i10;
            if (b(lVar, i11)) {
                return lVar;
            }
            int i12 = ((a10 + i10) - 1) / i10;
            i[] iVarArr = new i[i10 + 1];
            iVarArr[0] = this.f22415b;
            for (int i13 = 1; i13 < i10; i13++) {
                iVarArr[i13] = iVarArr[i13 - 1].I(i12);
            }
            iVarArr[i10] = iVarArr[0].G(iVarArr[1]);
            this.f22414a.z(iVarArr);
            i[] iVarArr2 = new i[i11];
            iVarArr2[0] = iVarArr[0];
            for (int i14 = i10 - 1; i14 >= 0; i14--) {
                i iVar = iVarArr[i14];
                int i15 = 1 << i14;
                for (int i16 = i15; i16 < i11; i16 += i15 << 1) {
                    iVarArr2[i16] = iVarArr2[i16 - i15].a(iVar);
                }
            }
            this.f22414a.z(iVarArr2);
            l lVar2 = new l();
            lVar2.d(this.f22414a.e(iVarArr2, 0, i11));
            lVar2.e(iVarArr[i10]);
            lVar2.f(i10);
            return lVar2;
        }
    }

    public static int a(e eVar) {
        BigInteger w9 = eVar.w();
        return w9 == null ? eVar.t() + 1 : w9.bitLength();
    }

    public static l b(i iVar) {
        e i10 = iVar.i();
        return (l) i10.B(iVar, "bc_fixed_point", new a(i10, iVar));
    }
}
