package dl;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* loaded from: classes3.dex */
public class e {
    public static /* synthetic */ void b(rk.i iVar, rk.i iVar2, rk.i iVar3, int i10, int i11) {
        int i12 = iVar.f21298q * i11;
        int i13 = iVar2.f21298q * i11;
        int i14 = 0;
        int i15 = iVar3.f21298q + 0;
        int i16 = i13 + 1;
        double d10 = iVar2.f21296c[i13];
        int i17 = i12;
        while (i14 < i15) {
            iVar.f(i17, iVar3.f21296c[i14] * d10);
            i17++;
            i14++;
        }
        while (i14 != i10) {
            int i18 = iVar3.f21298q + i14;
            int i19 = i16 + 1;
            double d11 = iVar2.f21296c[i16];
            int i20 = i12;
            while (i14 < i18) {
                double[] dArr = iVar.f21296c;
                dArr[i20] = dArr[i20] + (iVar3.f21296c[i14] * d11);
                i20++;
                i14++;
            }
            i16 = i19;
        }
    }

    public static void c(final rk.i iVar, final rk.i iVar2, final rk.i iVar3) {
        int i10;
        pk.d.h((iVar == iVar3 || iVar2 == iVar3) ? false : true, "Neither 'A' or 'B' can be the same matrix as 'C'");
        pk.d.g(iVar.f21298q, iVar2.f21297d, "The 'A' and 'B' matrices do not have compatible dimensions");
        iVar3.U(iVar.f21297d, iVar2.f21298q);
        if (iVar.f21298q == 0 || (i10 = iVar.f21297d) == 0) {
            tk.b.e(iVar3, 0.0d);
            return;
        }
        final int i11 = iVar2.f21297d * iVar2.f21298q;
        ll.b.f(0, i10, new IntConsumer() { // from class: dl.d
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                e.b(rk.i.this, iVar, iVar2, i11, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }
}
