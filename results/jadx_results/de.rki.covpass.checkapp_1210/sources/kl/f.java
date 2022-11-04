package kl;

import rk.b0;
import rk.z;
/* loaded from: classes3.dex */
public class f {
    public static /* synthetic */ void b(z zVar, z zVar2, h hVar, int i10, int i11) {
        z zVar3 = hVar.f15309c;
        int i12 = i11 - i10;
        zVar3.g(zVar.f21325y, i12, i12);
        zVar3.f21324x[0] = 0;
        float[] b10 = pk.d.b(hVar.f15308b, zVar.f21325y);
        b0 b0Var = hVar.f15307a;
        int i13 = zVar.f21325y;
        int[] d10 = pk.d.d(b0Var, i13, i13);
        int i14 = i10;
        while (i14 < i11) {
            int i15 = i14 - i10;
            int[] iArr = zVar2.f21324x;
            int i16 = iArr[i14];
            int i17 = i14 + 1;
            int i18 = iArr[i17];
            int i19 = i15 + 1;
            zVar3.f21324x[i19] = zVar3.f21322d;
            if (i16 != i18) {
                for (int i20 = i16; i20 < i18; i20++) {
                    b.b(zVar, zVar2.f21323q[i20], zVar2.f21321c[i20], zVar3, i19, b10, d10);
                }
                int[] iArr2 = zVar3.f21324x;
                int i21 = iArr2[i19];
                for (int i22 = iArr2[i15]; i22 < i21; i22++) {
                    zVar3.f21321c[i22] = b10[zVar3.f21323q[i22]];
                }
            }
            i14 = i17;
        }
    }

    public static void c(final z zVar, final z zVar2, z zVar3, ll.d<h> dVar) {
        ll.b.d(0, zVar2.U3, dVar, new ll.h() { // from class: kl.e
            @Override // ll.h
            public final void a(Object obj, int i10, int i11) {
                f.b(z.this, zVar2, (h) obj, i10, i11);
            }
        });
        d(zVar3, zVar.f21325y, zVar2.U3, dVar);
    }

    public static void d(z zVar, int i10, int i11, ll.d<h> dVar) {
        z zVar2;
        zVar.U(i10, i11);
        zVar.V3 = false;
        zVar.f21322d = 0;
        for (int i12 = 0; i12 < dVar.h(); i12++) {
            zVar.f21322d += dVar.c(i12).f15309c.f21322d;
        }
        zVar.e(zVar.f21322d, false);
        zVar.f21322d = 0;
        zVar.U3 = 0;
        zVar.f21324x[0] = 0;
        for (int i13 = 0; i13 < dVar.h(); i13++) {
            h c10 = dVar.c(i13);
            z zVar3 = c10.f15309c;
            System.arraycopy(zVar3.f21323q, 0, zVar.f21323q, zVar.f21322d, zVar3.f21322d);
            z zVar4 = c10.f15309c;
            System.arraycopy(zVar4.f21321c, 0, zVar.f21321c, zVar.f21322d, zVar4.f21322d);
            int i14 = 1;
            while (true) {
                zVar2 = c10.f15309c;
                if (i14 <= zVar2.U3) {
                    int[] iArr = zVar.f21324x;
                    int i15 = zVar.U3 + 1;
                    zVar.U3 = i15;
                    iArr[i15] = zVar.f21322d + zVar2.f21324x[i14];
                    i14++;
                }
            }
            zVar.f21322d += zVar2.f21322d;
        }
        pk.d.e(zVar.U3, i11);
        pk.d.e(zVar.f21324x[i11], zVar.f21322d);
    }
}
