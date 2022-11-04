package ui;

import bj.h;
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
        return (!u() && !this.f22405c.i()) ? N(false).a(this) : this;
    }

    @Override // ti.i
    public i J() {
        if (u()) {
            return this;
        }
        return this.f22405c.i() ? i().u() : N(true);
    }

    @Override // ti.i
    public i K(i iVar) {
        return this == iVar ? H() : u() ? iVar : iVar.u() ? J() : this.f22405c.i() ? iVar : N(false).a(iVar);
    }

    protected c L(c cVar, int[] iArr) {
        c cVar2 = (c) i().n();
        if (cVar.h()) {
            return cVar2;
        }
        c cVar3 = new c();
        if (iArr == null) {
            iArr = cVar3.f23804g;
            b.n(cVar.f23804g, iArr);
        }
        b.n(iArr, cVar3.f23804g);
        int[] iArr2 = cVar3.f23804g;
        b.g(iArr2, cVar2.f23804g, iArr2);
        return cVar3;
    }

    protected c M() {
        f[] fVarArr = this.f22406d;
        c cVar = (c) fVarArr[1];
        if (cVar == null) {
            c L = L((c) fVarArr[0], null);
            fVarArr[1] = L;
            return L;
        }
        return cVar;
    }

    protected d N(boolean z10) {
        c cVar = (c) this.f22404b;
        c cVar2 = (c) this.f22405c;
        c cVar3 = (c) this.f22406d[0];
        c M = M();
        int[] i10 = h.i();
        b.n(cVar.f23804g, i10);
        b.m(h.b(i10, i10, i10) + h.d(M.f23804g, i10), i10);
        int[] i11 = h.i();
        b.s(cVar2.f23804g, i11);
        int[] i12 = h.i();
        b.g(i11, cVar2.f23804g, i12);
        int[] i13 = h.i();
        b.g(i12, cVar.f23804g, i13);
        b.s(i13, i13);
        int[] i14 = h.i();
        b.n(i12, i14);
        b.s(i14, i14);
        c cVar4 = new c(i12);
        b.n(i10, cVar4.f23804g);
        int[] iArr = cVar4.f23804g;
        b.r(iArr, i13, iArr);
        int[] iArr2 = cVar4.f23804g;
        b.r(iArr2, i13, iArr2);
        c cVar5 = new c(i13);
        b.r(i13, cVar4.f23804g, cVar5.f23804g);
        int[] iArr3 = cVar5.f23804g;
        b.g(iArr3, i10, iArr3);
        int[] iArr4 = cVar5.f23804g;
        b.r(iArr4, i14, iArr4);
        c cVar6 = new c(i11);
        if (!h.t(cVar3.f23804g)) {
            int[] iArr5 = cVar6.f23804g;
            b.g(iArr5, cVar3.f23804g, iArr5);
        }
        c cVar7 = null;
        if (z10) {
            cVar7 = new c(i14);
            int[] iArr6 = cVar7.f23804g;
            b.g(iArr6, M.f23804g, iArr6);
            int[] iArr7 = cVar7.f23804g;
            b.s(iArr7, iArr7);
        }
        return new d(i(), cVar4, cVar5, new f[]{cVar6, cVar7});
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
        c cVar3 = (c) this.f22406d[0];
        c cVar4 = (c) iVar.q();
        c cVar5 = (c) iVar.r();
        c cVar6 = (c) iVar.s(0);
        int[] k10 = h.k();
        int[] i11 = h.i();
        int[] i12 = h.i();
        int[] i13 = h.i();
        boolean h10 = cVar3.h();
        if (h10) {
            iArr2 = cVar4.f23804g;
            iArr = cVar5.f23804g;
        } else {
            b.n(cVar3.f23804g, i12);
            b.g(i12, cVar4.f23804g, i11);
            b.g(i12, cVar3.f23804g, i12);
            b.g(i12, cVar5.f23804g, i12);
            iArr2 = i11;
            iArr = i12;
        }
        boolean h11 = cVar6.h();
        if (h11) {
            iArr4 = cVar.f23804g;
            iArr3 = cVar2.f23804g;
        } else {
            b.n(cVar6.f23804g, i13);
            b.g(i13, cVar.f23804g, k10);
            b.g(i13, cVar6.f23804g, i13);
            b.g(i13, cVar2.f23804g, i13);
            iArr4 = k10;
            iArr3 = i13;
        }
        int[] i14 = h.i();
        b.r(iArr4, iArr2, i14);
        b.r(iArr3, iArr, i11);
        if (h.v(i14)) {
            return h.v(i11) ? J() : i10.u();
        }
        int[] i15 = h.i();
        b.n(i14, i15);
        int[] i16 = h.i();
        b.g(i15, i14, i16);
        b.g(i15, iArr4, i12);
        b.i(i16, i16);
        h.y(iArr3, i16, k10);
        b.m(h.b(i12, i12, i16), i16);
        c cVar7 = new c(i13);
        b.n(i11, cVar7.f23804g);
        int[] iArr5 = cVar7.f23804g;
        b.r(iArr5, i16, iArr5);
        c cVar8 = new c(i16);
        b.r(i12, cVar7.f23804g, cVar8.f23804g);
        b.h(cVar8.f23804g, i11, k10);
        b.l(k10, cVar8.f23804g);
        c cVar9 = new c(i14);
        if (!h10) {
            int[] iArr6 = cVar9.f23804g;
            b.g(iArr6, cVar3.f23804g, iArr6);
        }
        if (!h11) {
            int[] iArr7 = cVar9.f23804g;
            b.g(iArr7, cVar6.f23804g, iArr7);
        }
        if (!h10 || !h11) {
            i15 = null;
        }
        return new d(i10, cVar7, cVar8, new f[]{cVar9, L(cVar9, i15)});
    }

    @Override // ti.i
    protected i d() {
        return new d(null, f(), g());
    }

    @Override // ti.i
    public f s(int i10) {
        return i10 == 1 ? M() : super.s(i10);
    }

    @Override // ti.i
    public i z() {
        return u() ? this : new d(i(), this.f22404b, this.f22405c.m(), this.f22406d);
    }
}
