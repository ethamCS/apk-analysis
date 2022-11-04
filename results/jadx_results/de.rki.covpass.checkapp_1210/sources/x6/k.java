package x6;
/* loaded from: classes.dex */
public final class k extends y {

    /* renamed from: i */
    private final int[] f25420i = new int[4];

    @Override // x6.y
    public int l(o6.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f25420i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l10 = aVar.l();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < l10; i11++) {
            sb2.append((char) (y.j(aVar, iArr2, i10, y.f25449g) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = y.n(aVar, i10, true, y.f25447e)[1];
        for (int i14 = 0; i14 < 4 && i13 < l10; i14++) {
            sb2.append((char) (y.j(aVar, iArr2, i13, y.f25449g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // x6.y
    h6.a q() {
        return h6.a.EAN_8;
    }
}
