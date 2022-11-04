package dl;

import j$.util.function.IntConsumer;
import java.util.Objects;
import rk.t;
/* loaded from: classes3.dex */
public class g {
    public static /* synthetic */ void b(t tVar, t tVar2, t tVar3, int i10, int i11) {
        int i12 = tVar.f21319q * i11;
        int i13 = i11 * tVar2.f21319q;
        int i14 = 0;
        int i15 = tVar3.f21319q + 0;
        int i16 = i13 + 1;
        float f10 = tVar2.f21317c[i13];
        int i17 = i12;
        while (i14 < i15) {
            tVar.f(i17, tVar3.f21317c[i14] * f10);
            i17++;
            i14++;
        }
        while (i14 != i10) {
            int i18 = tVar3.f21319q + i14;
            int i19 = i16 + 1;
            float f11 = tVar2.f21317c[i16];
            int i20 = i12;
            while (i14 < i18) {
                float[] fArr = tVar.f21317c;
                fArr[i20] = fArr[i20] + (tVar3.f21317c[i14] * f11);
                i20++;
                i14++;
            }
            i16 = i19;
        }
    }

    public static void c(final t tVar, final t tVar2, final t tVar3) {
        int i10;
        pk.d.h((tVar == tVar3 || tVar2 == tVar3) ? false : true, "Neither 'A' or 'B' can be the same matrix as 'C'");
        pk.d.g(tVar.f21319q, tVar2.f21318d, "The 'A' and 'B' matrices do not have compatible dimensions");
        tVar3.U(tVar.f21318d, tVar2.f21319q);
        if (tVar.f21319q == 0 || (i10 = tVar.f21318d) == 0) {
            tk.c.a(tVar3, 0.0f);
            return;
        }
        final int i11 = tVar2.f21318d * tVar2.f21319q;
        ll.b.f(0, i10, new IntConsumer() { // from class: dl.f
            @Override // j$.util.function.IntConsumer
            public final void accept(int i12) {
                g.b(t.this, tVar, tVar2, i11, i12);
            }

            @Override // j$.util.function.IntConsumer
            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return Objects.requireNonNull(intConsumer);
            }
        });
    }
}
