package r2;

import q2.g;
/* loaded from: classes.dex */
public class a0 extends q2.h<c4.a> {

    /* renamed from: f */
    float f20352f;

    public a0(double d10, boolean z10) {
        super(z10);
        this.f20352f = (float) d10;
    }

    @Override // q2.g.a
    public g.a<c4.a, c4.a> a() {
        return new a0(this.f20352f, f());
    }

    /* renamed from: g */
    public void c(int i10, int i11, int i12, int i13, int i14, c4.a aVar, c4.a aVar2) {
        float f10 = 0.0f;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = aVar.f6218c + ((i11 + i15) * aVar.f6219d) + i10;
            int i17 = 0;
            while (i17 < i12) {
                f10 += aVar.V3[i16];
                i17++;
                i16++;
            }
        }
        aVar2.V3[i14] = (this.f20352f * f10) / (i12 * i13);
    }

    /* renamed from: h */
    public c4.a e() {
        return new c4.a(1, 1);
    }

    /* renamed from: i */
    public void d(int i10, int i11, c4.a aVar, c4.a aVar2, c4.l lVar) {
        int i12;
        int i13;
        int i14 = this.f19522a;
        int i15 = i10 * i14;
        int i16 = this.f19523b;
        int i17 = aVar2.f6220q;
        int i18 = i10 == i17 + (-1) ? aVar.f6220q : i14 * (i10 + 1);
        int i19 = i11 == aVar2.f6221x + (-1) ? aVar.f6221x : i16 * (i11 + 1);
        if (this.f19524c) {
            i13 = Math.min(i17 - 1, i10 + 1);
            i12 = Math.min(aVar2.f6221x - 1, i11 + 1);
            i10 = Math.max(0, i10 - 1);
            i11 = Math.max(0, i11 - 1);
        } else {
            i13 = i10;
            i12 = i11;
        }
        float f10 = 0.0f;
        for (int i20 = i11; i20 <= i12; i20++) {
            for (int i21 = i10; i21 <= i13; i21++) {
                f10 += aVar2.l(i21, i20);
            }
        }
        float f11 = f10 / (((i12 - i11) + 1) * ((i13 - i10) + 1));
        for (int i22 = i11 * i16; i22 < i19; i22++) {
            int i23 = aVar.f6218c + (aVar.f6219d * i22) + i15;
            int i24 = lVar.f6218c + (lVar.f6219d * i22) + i15;
            int i25 = (i18 - i15) + i24;
            while (i24 < i25) {
                lVar.V3[i24] = aVar.V3[i23] <= f11 ? this.f19525d : this.f19526e;
                i24++;
                i23++;
            }
        }
    }
}
