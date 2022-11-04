package r2;

import q2.g;
/* loaded from: classes.dex */
public class c0 extends q2.i<c4.a, c4.u> {

    /* renamed from: f */
    float f20360f;

    public c0(float f10, float f11, boolean z10) {
        super(f10, z10);
        this.f20360f = f11;
    }

    @Override // q2.g.a
    public g.a<c4.a, c4.u> a() {
        return new c0((float) this.f19530d, this.f20360f, this.f19531e);
    }

    /* renamed from: f */
    public void c(int i10, int i11, int i12, int i13, int i14, c4.a aVar, c4.u uVar) {
        float l10 = aVar.l(i10, i11);
        float f10 = l10;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = aVar.f6218c + ((i11 + i15) * aVar.f6219d) + i10;
            int i17 = 0;
            while (i17 < i12) {
                int i18 = i16 + 1;
                float f11 = aVar.V3[i16];
                if (f11 < l10) {
                    l10 = f11;
                } else if (f11 > f10) {
                    f10 = f11;
                }
                i17++;
                i16 = i18;
            }
        }
        float[] fArr = uVar.W3;
        fArr[i14] = l10;
        fArr[i14 + 1] = f10;
    }

    /* renamed from: g */
    public c4.u e() {
        return new c4.u(1, 1, 2);
    }

    /* renamed from: h */
    public void d(int i10, int i11, c4.a aVar, c4.u uVar, c4.l lVar) {
        int i12;
        int i13;
        int i14 = i10;
        int i15 = i11;
        int i16 = this.f19527a;
        int i17 = i14 * i16;
        int i18 = this.f19528b;
        int i19 = i15 * i18;
        int i20 = uVar.f6220q;
        int i21 = i14 == i20 + (-1) ? aVar.f6220q : i16 * (i14 + 1);
        int i22 = i15 == uVar.f6221x - 1 ? aVar.f6221x : i18 * (i15 + 1);
        int i23 = 0;
        if (this.f19529c) {
            i13 = Math.min(i20 - 1, i14 + 1);
            i12 = Math.min(uVar.f6221x - 1, i15 + 1);
            i14 = Math.max(0, i14 - 1);
            i15 = Math.max(0, i15 - 1);
        } else {
            i13 = i14;
            i12 = i15;
        }
        float f10 = Float.MAX_VALUE;
        float f11 = -3.4028235E38f;
        while (i15 <= i12) {
            int i24 = i14;
            while (i24 <= i13) {
                float f02 = uVar.f0(i24, i15, i23);
                float f03 = uVar.f0(i24, i15, 1);
                if (f02 < f10) {
                    f10 = f02;
                }
                if (f03 > f11) {
                    f11 = f03;
                }
                i24++;
                i23 = 0;
            }
            i15++;
            i23 = 0;
        }
        float f12 = (float) this.f19530d;
        float f13 = 2.0f;
        if (!this.f19531e) {
            while (i19 < i22) {
                int i25 = aVar.f6218c + (aVar.f6219d * i19) + i17;
                int i26 = lVar.f6218c + (lVar.f6219d * i19) + i17;
                int i27 = i17;
                while (i27 < i21) {
                    if (f11 - f10 <= f12) {
                        lVar.V3[i26] = 1;
                    } else {
                        lVar.V3[i26] = aVar.V3[i25] > (this.f20360f * (f11 + f10)) / 2.0f ? (byte) 1 : (byte) 0;
                    }
                    i27++;
                    i26++;
                    i25++;
                }
                i19++;
            }
            return;
        }
        while (i19 < i22) {
            int i28 = aVar.f6218c + (aVar.f6219d * i19) + i17;
            int i29 = lVar.f6218c + (lVar.f6219d * i19) + i17;
            int i30 = i17;
            while (i30 < i21) {
                if (f11 - f10 <= f12) {
                    lVar.V3[i29] = 1;
                } else {
                    lVar.V3[i29] = aVar.V3[i28] <= (this.f20360f * (f11 + f10)) / f13 ? (byte) 1 : (byte) 0;
                }
                i30++;
                i29++;
                i28++;
                f13 = 2.0f;
            }
            i19++;
            f13 = 2.0f;
        }
    }
}
