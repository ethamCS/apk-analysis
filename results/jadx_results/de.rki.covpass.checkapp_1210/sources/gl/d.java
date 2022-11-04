package gl;

import rk.f0;
import rk.v;
import rk.x;
import rk.y;
import rk.z;
/* loaded from: classes3.dex */
public class d {
    public static y a(x xVar, y yVar) {
        if (yVar != null) {
            yVar.U(xVar.Z(), xVar.w());
        } else {
            yVar = new y(xVar.f21318d, xVar.f21319q);
        }
        int i10 = 0;
        while (true) {
            int i11 = xVar.f21318d;
            if (i10 < i11) {
                int min = Math.min(xVar.f21320x, i11 - i10);
                int i12 = 0;
                while (true) {
                    int i13 = xVar.f21319q;
                    if (i12 < i13) {
                        int min2 = Math.min(xVar.f21320x, i13 - i12);
                        int i14 = (xVar.f21319q * i10) + (min * i12);
                        int i15 = (yVar.f21319q * i10) + i12;
                        for (int i16 = 0; i16 < min; i16++) {
                            System.arraycopy(xVar.f21317c, i14, yVar.f21317c, i15, min2);
                            i14 += min2;
                            i15 += yVar.f21319q;
                        }
                        i12 += xVar.f21320x;
                    }
                }
                i10 += xVar.f21320x;
            } else {
                return yVar;
            }
        }
    }

    public static y b(z zVar, y yVar) {
        if (yVar == null) {
            yVar = new y(zVar.f21325y, zVar.U3);
        } else {
            yVar.U(zVar.f21325y, zVar.U3);
            yVar.i();
        }
        int i10 = zVar.f21324x[0];
        int i11 = 1;
        while (i11 <= zVar.U3) {
            int i12 = zVar.f21324x[i11];
            while (i10 < i12) {
                yVar.K(zVar.f21323q[i10], i11 - 1, zVar.f21321c[i10]);
                i10++;
            }
            i11++;
            i10 = i12;
        }
        return yVar;
    }

    public static void c(v vVar, v vVar2) {
        if (vVar2 instanceof f0) {
            ((f0) vVar2).U(vVar.Z(), vVar.w());
        } else if (vVar.Z() != vVar2.Z()) {
            throw new IllegalArgumentException("Number of rows do not match");
        } else {
            if (vVar.w() != vVar2.w()) {
                throw new IllegalArgumentException("Number of columns do not match");
            }
        }
        for (int i10 = 0; i10 < vVar.Z(); i10++) {
            for (int i11 = 0; i11 < vVar.w(); i11++) {
                vVar2.K(i10, i11, vVar.l(i10, i11));
            }
        }
    }
}
