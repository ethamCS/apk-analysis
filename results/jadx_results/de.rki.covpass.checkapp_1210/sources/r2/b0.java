package r2;

import q2.g;
/* loaded from: classes.dex */
public class b0 extends q2.h<c4.l> {

    /* renamed from: f */
    double f20356f;

    public b0(double d10, boolean z10) {
        super(z10);
        this.f20356f = d10;
    }

    @Override // q2.g.a
    public g.a<c4.l, c4.l> a() {
        return new b0(this.f20356f, f());
    }

    /* renamed from: g */
    public void c(int i10, int i11, int i12, int i13, int i14, c4.l lVar, c4.l lVar2) {
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = lVar.f6218c + ((i11 + i16) * lVar.f6219d) + i10;
            int i18 = 0;
            while (i18 < i12) {
                i15 += lVar.V3[i17] & 255;
                i18++;
                i17++;
            }
        }
        lVar2.V3[i14] = (byte) (((this.f20356f * i15) / (i12 * i13)) + 0.5d);
    }

    /* renamed from: h */
    public c4.l e() {
        return new c4.l(1, 1);
    }

    /* renamed from: i */
    public void d(int i10, int i11, c4.l lVar, c4.l lVar2, c4.l lVar3) {
        int i12;
        int i13;
        int i14 = this.f19522a;
        int i15 = i10 * i14;
        int i16 = this.f19523b;
        int i17 = lVar2.f6220q;
        int i18 = i10 == i17 + (-1) ? lVar.f6220q : i14 * (i10 + 1);
        int i19 = i11 == lVar2.f6221x + (-1) ? lVar.f6221x : i16 * (i11 + 1);
        int i20 = 0;
        if (this.f19524c) {
            i13 = Math.min(i17 - 1, i10 + 1);
            i12 = Math.min(lVar2.f6221x - 1, i11 + 1);
            i10 = Math.max(0, i10 - 1);
            i11 = Math.max(0, i11 - 1);
        } else {
            i13 = i10;
            i12 = i11;
        }
        for (int i21 = i11; i21 <= i12; i21++) {
            for (int i22 = i10; i22 <= i13; i22++) {
                i20 += lVar2.d0(i22, i21);
            }
        }
        int i23 = i20 / (((i12 - i11) + 1) * ((i13 - i10) + 1));
        for (int i24 = i11 * i16; i24 < i19; i24++) {
            int i25 = lVar.f6218c + (lVar.f6219d * i24) + i15;
            int i26 = lVar3.f6218c + (lVar3.f6219d * i24) + i15;
            int i27 = (i18 - i15) + i26;
            while (i26 < i27) {
                lVar3.V3[i26] = (lVar.V3[i25] & 255) <= i23 ? this.f19525d : this.f19526e;
                i26++;
                i25++;
            }
        }
    }
}
