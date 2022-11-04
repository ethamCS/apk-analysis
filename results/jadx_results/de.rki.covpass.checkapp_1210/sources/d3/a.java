package d3;

import c4.a0;
import c4.b0;
/* loaded from: classes.dex */
public class a {
    public static void a(int i10, int i11, int i12, int i13, int i14, int i15, c4.e eVar, c4.e eVar2) {
        if (eVar.f6220q < i10 + i14 || eVar.f6221x < i11 + i15) {
            throw new IllegalArgumentException("Copy region must be contained in the input image");
        }
        if (eVar2.f6220q < i12 + i14 || eVar2.f6221x < i13 + i15) {
            throw new IllegalArgumentException("Copy region must be contained in the output image");
        }
        for (int i16 = 0; i16 < i15; i16++) {
            System.arraycopy(eVar.V3, eVar.f6218c + ((i11 + i16) * eVar.f6219d) + i10, eVar2.V3, eVar2.f6218c + ((i13 + i16) * eVar2.f6219d) + i12, i14);
        }
    }

    public static void b(c4.e eVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = eVar.f6218c;
            int i14 = eVar.f6219d;
            int i15 = (i12 * i14) + i13;
            int i16 = i13 + (((eVar.f6221x - i12) - 1) * i14);
            int i17 = 0;
            while (i17 < eVar.f6220q) {
                byte[] bArr = eVar.V3;
                byte b10 = (byte) i10;
                bArr[i15] = b10;
                bArr[i16] = b10;
                i17++;
                i16++;
                i15++;
            }
        }
        int i18 = eVar.f6221x - i11;
        int i19 = eVar.f6218c + (eVar.f6219d * i11);
        for (int i20 = 0; i20 < i11; i20++) {
            int i21 = i19 + i20;
            int i22 = ((eVar.f6220q + i19) - 1) - i20;
            for (int i23 = i11; i23 < i18; i23++) {
                byte[] bArr2 = eVar.V3;
                byte b11 = (byte) i10;
                bArr2[i21] = b11;
                bArr2[i22] = b11;
                int i24 = eVar.f6219d;
                i21 += i24;
                i22 += i24;
            }
        }
    }

    public static void c(c4.a aVar, int i10, c4.u uVar) {
        int i11 = uVar.V3;
        for (int i12 = 0; i12 < aVar.f6221x; i12++) {
            int j10 = aVar.j() + (aVar.k() * i12);
            int j11 = uVar.j() + (uVar.k() * i12) + i10;
            int i13 = ((uVar.f6220q * i11) + j11) - i10;
            while (j11 < i13) {
                uVar.W3[j11] = aVar.V3[j10];
                j11 += i11;
                j10++;
            }
        }
    }

    public static void d(c4.b bVar, int i10, c4.v vVar) {
        int i11 = vVar.V3;
        for (int i12 = 0; i12 < bVar.f6221x; i12++) {
            int j10 = bVar.j() + (bVar.k() * i12);
            int j11 = vVar.j() + (vVar.k() * i12) + i10;
            int i13 = ((vVar.f6220q * i11) + j11) - i10;
            while (j11 < i13) {
                vVar.W3[j11] = bVar.V3[j10];
                j11 += i11;
                j10++;
            }
        }
    }

    public static void e(c4.d dVar, int i10, c4.w wVar) {
        int i11 = wVar.V3;
        for (int i12 = 0; i12 < dVar.f6221x; i12++) {
            int j10 = dVar.j() + (dVar.k() * i12);
            int j11 = wVar.j() + (wVar.k() * i12) + i10;
            int i13 = ((wVar.f6220q * i11) + j11) - i10;
            while (j11 < i13) {
                wVar.W3[j11] = dVar.V3[j10];
                j11 += i11;
                j10++;
            }
        }
    }

    public static void f(c4.e eVar, int i10, c4.x xVar) {
        int i11 = xVar.V3;
        for (int i12 = 0; i12 < eVar.f6221x; i12++) {
            int j10 = eVar.j() + (eVar.k() * i12);
            int j11 = xVar.j() + (xVar.k() * i12) + i10;
            int i13 = ((xVar.f6220q * i11) + j11) - i10;
            while (j11 < i13) {
                xVar.W3[j11] = eVar.V3[j10];
                j11 += i11;
                j10++;
            }
        }
    }

    public static void g(c4.h hVar, int i10, a0 a0Var) {
        int i11 = a0Var.V3;
        for (int i12 = 0; i12 < hVar.f6221x; i12++) {
            int j10 = hVar.j() + (hVar.k() * i12);
            int j11 = a0Var.j() + (a0Var.k() * i12) + i10;
            int i13 = ((a0Var.f6220q * i11) + j11) - i10;
            while (j11 < i13) {
                a0Var.W3[j11] = hVar.V3[j10];
                j11 += i11;
                j10++;
            }
        }
    }

    public static void h(c4.i iVar, int i10, b0 b0Var) {
        int i11 = b0Var.V3;
        for (int i12 = 0; i12 < iVar.f6221x; i12++) {
            int j10 = iVar.j() + (iVar.k() * i12);
            int j11 = b0Var.j() + (b0Var.k() * i12) + i10;
            int i13 = ((b0Var.f6220q * i11) + j11) - i10;
            while (j11 < i13) {
                b0Var.W3[j11] = iVar.V3[j10];
                j11 += i11;
                j10++;
            }
        }
    }
}
