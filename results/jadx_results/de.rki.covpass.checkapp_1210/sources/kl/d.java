package kl;

import rk.b0;
import rk.o;
/* loaded from: classes3.dex */
public class d {
    public static /* synthetic */ void b(o oVar, o oVar2, g gVar, int i10, int i11) {
        o oVar3 = gVar.f15306c;
        int i12 = i11 - i10;
        oVar3.g(oVar.f21304y, i12, i12);
        oVar3.f21303x[0] = 0;
        double[] a10 = pk.d.a(gVar.f15305b, oVar.f21304y);
        b0 b0Var = gVar.f15304a;
        int i13 = oVar.f21304y;
        int[] d10 = pk.d.d(b0Var, i13, i13);
        int i14 = i10;
        while (i14 < i11) {
            int i15 = i14 - i10;
            int[] iArr = oVar2.f21303x;
            int i16 = iArr[i14];
            int i17 = i14 + 1;
            int i18 = iArr[i17];
            int i19 = i15 + 1;
            oVar3.f21303x[i19] = oVar3.f21301d;
            if (i16 != i18) {
                int i20 = i16;
                while (i20 < i18) {
                    a.b(oVar, oVar2.f21302q[i20], oVar2.f21300c[i20], oVar3, i19, a10, d10);
                    i20++;
                    i18 = i18;
                }
                int[] iArr2 = oVar3.f21303x;
                int i21 = iArr2[i19];
                for (int i22 = iArr2[i15]; i22 < i21; i22++) {
                    oVar3.f21300c[i22] = a10[oVar3.f21302q[i22]];
                }
            }
            i14 = i17;
        }
    }

    public static void c(final o oVar, final o oVar2, o oVar3, ll.d<g> dVar) {
        ll.b.d(0, oVar2.U3, dVar, new ll.h() { // from class: kl.c
            @Override // ll.h
            public final void a(Object obj, int i10, int i11) {
                d.b(o.this, oVar2, (g) obj, i10, i11);
            }
        });
        d(oVar3, oVar.f21304y, oVar2.U3, dVar);
    }

    public static void d(o oVar, int i10, int i11, ll.d<g> dVar) {
        o oVar2;
        oVar.U(i10, i11);
        oVar.V3 = false;
        oVar.f21301d = 0;
        for (int i12 = 0; i12 < dVar.h(); i12++) {
            oVar.f21301d += dVar.c(i12).f15306c.f21301d;
        }
        oVar.e(oVar.f21301d, false);
        oVar.f21301d = 0;
        oVar.U3 = 0;
        oVar.f21303x[0] = 0;
        for (int i13 = 0; i13 < dVar.h(); i13++) {
            g c10 = dVar.c(i13);
            o oVar3 = c10.f15306c;
            System.arraycopy(oVar3.f21302q, 0, oVar.f21302q, oVar.f21301d, oVar3.f21301d);
            o oVar4 = c10.f15306c;
            System.arraycopy(oVar4.f21300c, 0, oVar.f21300c, oVar.f21301d, oVar4.f21301d);
            int i14 = 1;
            while (true) {
                oVar2 = c10.f15306c;
                if (i14 <= oVar2.U3) {
                    int[] iArr = oVar.f21303x;
                    int i15 = oVar.U3 + 1;
                    oVar.U3 = i15;
                    iArr[i15] = oVar.f21301d + oVar2.f21303x[i14];
                    i14++;
                }
            }
            oVar.f21301d += oVar2.f21301d;
        }
        pk.d.e(oVar.U3, i11);
        pk.d.e(oVar.f21303x[i11], oVar.f21301d);
    }
}
