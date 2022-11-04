package q2;

import q2.p;
/* loaded from: classes.dex */
public class r extends p {
    public r(boolean z10, x3.b bVar, double d10, double d11, boolean z11) {
        super(z10, bVar, d10, d11, z11);
    }

    public /* synthetic */ void l(c4.l lVar, int i10, c4.l lVar2, int i11, byte b10, byte b11, int i12, int i13, int i14) {
        p.a a10 = this.f19554i.a();
        for (int i15 = i13; i15 < i14; i15++) {
            int i16 = lVar.f6218c + (lVar.f6219d * i15) + i10;
            int i17 = lVar2.f6218c + (lVar2.f6219d * i15) + i10;
            int i18 = i15 - i11;
            a10.c(0, i18, lVar);
            int i19 = i17 + 1;
            int i20 = i16 + 1;
            lVar2.V3[i17] = ((double) (lVar.V3[i16] & 255)) <= a10.f19556b.f19488b ? b10 : b11;
            int i21 = i10 + 1;
            while (i21 < i12) {
                a10.d(i21 - i10, i18, lVar);
                int i22 = i19 + 1;
                int i23 = i20 + 1;
                lVar2.V3[i19] = ((double) (lVar.V3[i20] & 255)) <= a10.f19556b.f19488b ? b10 : b11;
                i21++;
                i19 = i22;
                i20 = i23;
            }
        }
        this.f19554i.b(a10);
    }

    @Override // q2.p
    protected void j(final c4.l lVar, final c4.l lVar2, final int i10, final int i11, final int i12, int i13, final byte b10, final byte b11) {
        ll.b.e(i11, i13, new ll.g() { // from class: q2.q
            @Override // ll.g
            public final void a(int i14, int i15) {
                r.this.l(lVar, i10, lVar2, i11, b10, b11, i12, i14, i15);
            }
        });
        p.a a10 = this.f19554i.a();
        g(lVar, lVar2, i11, i13, i10, i12, a10);
        this.f19554i.b(a10);
    }
}
