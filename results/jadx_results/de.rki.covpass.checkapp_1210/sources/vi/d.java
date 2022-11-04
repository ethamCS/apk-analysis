package vi;

import bj.h;
import bj.n;
import ti.e;
import ti.f;
import ti.i;
/* loaded from: classes3.dex */
public class d extends i.c {
    public d(e eVar, f fVar, f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public d(e eVar, f fVar, f fVar2, f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }

    @Override // ti.i
    public i H() {
        return (u() || this.f22405c.i()) ? this : J().a(this);
    }

    @Override // ti.i
    public i J() {
        if (u()) {
            return this;
        }
        e i10 = i();
        c cVar = (c) this.f22405c;
        if (cVar.i()) {
            return i10.u();
        }
        c cVar2 = (c) this.f22404b;
        c cVar3 = (c) this.f22406d[0];
        int[] i11 = h.i();
        int[] i12 = h.i();
        int[] i13 = h.i();
        b.n(cVar.f24383g, i13);
        int[] i14 = h.i();
        b.n(i13, i14);
        boolean h10 = cVar3.h();
        int[] iArr = cVar3.f24383g;
        if (!h10) {
            b.n(iArr, i12);
            iArr = i12;
        }
        b.q(cVar2.f24383g, iArr, i11);
        b.a(cVar2.f24383g, iArr, i12);
        b.g(i12, i11, i12);
        b.m(h.b(i12, i12, i12), i12);
        b.g(i13, cVar2.f24383g, i13);
        b.m(n.M(8, i13, 2, 0), i13);
        b.m(n.N(8, i14, 3, 0, i11), i11);
        c cVar4 = new c(i14);
        b.n(i12, cVar4.f24383g);
        int[] iArr2 = cVar4.f24383g;
        b.q(iArr2, i13, iArr2);
        int[] iArr3 = cVar4.f24383g;
        b.q(iArr3, i13, iArr3);
        c cVar5 = new c(i13);
        b.q(i13, cVar4.f24383g, cVar5.f24383g);
        int[] iArr4 = cVar5.f24383g;
        b.g(iArr4, i12, iArr4);
        int[] iArr5 = cVar5.f24383g;
        b.q(iArr5, i11, iArr5);
        c cVar6 = new c(i12);
        b.r(cVar.f24383g, cVar6.f24383g);
        if (!h10) {
            int[] iArr6 = cVar6.f24383g;
            b.g(iArr6, cVar3.f24383g, iArr6);
        }
        return new d(i10, cVar4, cVar5, new f[]{cVar6});
    }

    @Override // ti.i
    public i K(i iVar) {
        return this == iVar ? H() : u() ? iVar : iVar.u() ? J() : this.f22405c.i() ? iVar : J().a(iVar);
    }

    @Override // ti.i
    public i a(i iVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (u()) {
            return iVar;
        }
        if (iVar.u()) {
            return this;
        }
        if (this == iVar) {
            return J();
        }
        e i10 = i();
        c cVar = (c) this.f22404b;
        c cVar2 = (c) this.f22405c;
        c cVar3 = (c) iVar.q();
        c cVar4 = (c) iVar.r();
        c cVar5 = (c) this.f22406d[0];
        c cVar6 = (c) iVar.s(0);
        int[] k10 = h.k();
        int[] i11 = h.i();
        int[] i12 = h.i();
        int[] i13 = h.i();
        boolean h10 = cVar5.h();
        if (h10) {
            iArr2 = cVar3.f24383g;
            iArr = cVar4.f24383g;
        } else {
            b.n(cVar5.f24383g, i12);
            b.g(i12, cVar3.f24383g, i11);
            b.g(i12, cVar5.f24383g, i12);
            b.g(i12, cVar4.f24383g, i12);
            iArr2 = i11;
            iArr = i12;
        }
        boolean h11 = cVar6.h();
        if (h11) {
            iArr4 = cVar.f24383g;
            iArr3 = cVar2.f24383g;
        } else {
            b.n(cVar6.f24383g, i13);
            b.g(i13, cVar.f24383g, k10);
            b.g(i13, cVar6.f24383g, i13);
            b.g(i13, cVar2.f24383g, i13);
            iArr4 = k10;
            iArr3 = i13;
        }
        int[] i14 = h.i();
        b.q(iArr4, iArr2, i14);
        b.q(iArr3, iArr, i11);
        if (h.v(i14)) {
            return h.v(i11) ? J() : i10.u();
        }
        b.n(i14, i12);
        int[] i15 = h.i();
        b.g(i12, i14, i15);
        b.g(i12, iArr4, i12);
        b.i(i15, i15);
        h.y(iArr3, i15, k10);
        b.m(h.b(i12, i12, i15), i15);
        c cVar7 = new c(i13);
        b.n(i11, cVar7.f24383g);
        int[] iArr5 = cVar7.f24383g;
        b.q(iArr5, i15, iArr5);
        c cVar8 = new c(i15);
        b.q(i12, cVar7.f24383g, cVar8.f24383g);
        b.h(cVar8.f24383g, i11, k10);
        b.l(k10, cVar8.f24383g);
        c cVar9 = new c(i14);
        if (!h10) {
            int[] iArr6 = cVar9.f24383g;
            b.g(iArr6, cVar5.f24383g, iArr6);
        }
        if (!h11) {
            int[] iArr7 = cVar9.f24383g;
            b.g(iArr7, cVar6.f24383g, iArr7);
        }
        return new d(i10, cVar7, cVar8, new f[]{cVar9});
    }

    @Override // ti.i
    protected i d() {
        return new d(null, f(), g());
    }

    @Override // ti.i
    public i z() {
        return u() ? this : new d(this.f22403a, this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
