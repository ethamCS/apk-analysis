package r2;

import c4.e0;
import q2.g;
/* loaded from: classes.dex */
public class d0 extends q2.i<c4.l, e0> {

    /* renamed from: f */
    double f20364f;

    public d0(double d10, double d11, boolean z10) {
        super(d10, z10);
        this.f20364f = d11;
    }

    @Override // q2.g.a
    public g.a<c4.l, e0> a() {
        return new d0((float) this.f19530d, this.f20364f, this.f19531e);
    }

    /* renamed from: f */
    public void c(int i10, int i11, int i12, int i13, int i14, c4.l lVar, e0 e0Var) {
        int d02 = lVar.d0(i10, i11);
        int i15 = d02;
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = lVar.f6218c + ((i11 + i16) * lVar.f6219d) + i10;
            int i18 = 0;
            while (i18 < i12) {
                int i19 = i17 + 1;
                int i20 = lVar.V3[i17] & 255;
                if (i20 < d02) {
                    d02 = i20;
                } else if (i20 > i15) {
                    i15 = i20;
                }
                i18++;
                i17 = i19;
            }
        }
        byte[] bArr = e0Var.W3;
        bArr[i14] = (byte) d02;
        bArr[i14 + 1] = (byte) i15;
    }

    /* renamed from: g */
    public e0 e() {
        return new e0(1, 1, 2);
    }

    /* renamed from: h */
    public void d(int i10, int i11, c4.l lVar, e0 e0Var, c4.l lVar2) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        d0 d0Var = this;
        int i17 = i10;
        int i18 = i11;
        int i19 = d0Var.f19527a;
        int i20 = i17 * i19;
        int i21 = d0Var.f19528b;
        int i22 = i18 * i21;
        int i23 = e0Var.f6220q;
        int i24 = i17 == i23 + (-1) ? lVar.f6220q : i19 * (i17 + 1);
        int i25 = i18 == e0Var.f6221x - 1 ? lVar.f6221x : i21 * (i18 + 1);
        int i26 = 0;
        if (d0Var.f19529c) {
            i13 = Math.min(i23 - 1, i17 + 1);
            i12 = Math.min(e0Var.f6221x - 1, i18 + 1);
            i17 = Math.max(0, i17 - 1);
            i18 = Math.max(0, i18 - 1);
        } else {
            i13 = i17;
            i12 = i18;
        }
        int i27 = Integer.MAX_VALUE;
        int i28 = -2147483647;
        while (i18 <= i12) {
            int i29 = i17;
            while (true) {
                int i30 = i17;
                if (i29 <= i13) {
                    int f02 = e0Var.f0(i29, i18, i26);
                    int i31 = i22;
                    int f03 = e0Var.f0(i29, i18, 1);
                    if (f02 < i27) {
                        i27 = f02;
                    }
                    if (f03 > i28) {
                        i28 = f03;
                    }
                    i29++;
                    i17 = i30;
                    i22 = i31;
                    i26 = 0;
                }
            }
            i18++;
            i26 = 0;
        }
        int i32 = i22;
        int i33 = (int) d0Var.f19530d;
        if (d0Var.f19531e) {
            int i34 = i32;
            while (i34 < i25) {
                int i35 = lVar.f6218c + (lVar.f6219d * i34) + i20;
                int i36 = lVar2.f6218c + (lVar2.f6219d * i34) + i20;
                int i37 = i20;
                while (i37 < i24) {
                    if (i28 - i27 <= i33) {
                        lVar2.V3[i36] = 1;
                        i16 = i33;
                    } else {
                        i16 = i33;
                        lVar2.V3[i36] = (lVar.V3[i35] & 255) <= ((int) (d0Var.f20364f * ((double) ((i28 + i27) / 2)))) ? (byte) 1 : (byte) 0;
                    }
                    i37++;
                    i36++;
                    i35++;
                    d0Var = this;
                    i33 = i16;
                }
                i34++;
                d0Var = this;
            }
        } else {
            int i38 = i33;
            for (int i39 = i32; i39 < i25; i39++) {
                int i40 = lVar.f6218c + (lVar.f6219d * i39) + i20;
                int i41 = lVar2.f6218c + (lVar2.f6219d * i39) + i20;
                int i42 = i20;
                while (i42 < i24) {
                    int i43 = i38;
                    if (i28 - i27 <= i43) {
                        lVar2.V3[i41] = 1;
                        i14 = i24;
                        i15 = i20;
                    } else {
                        i14 = i24;
                        i15 = i20;
                        lVar2.V3[i41] = (lVar.V3[i40] & 255) > ((int) (this.f20364f * ((double) ((i28 + i27) / 2)))) ? (byte) 1 : (byte) 0;
                    }
                    i42++;
                    i41++;
                    i40++;
                    i38 = i43;
                    i20 = i15;
                    i24 = i14;
                }
            }
        }
    }
}
