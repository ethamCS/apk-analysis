package wi;

import ti.i;
/* loaded from: classes3.dex */
public class r1 extends i.b {
    public r1(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public r1(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }

    @Override // ti.i
    public ti.i J() {
        if (u()) {
            return this;
        }
        ti.e i10 = i();
        ti.f fVar = this.f22404b;
        if (fVar.i()) {
            return i10.u();
        }
        ti.f fVar2 = this.f22405c;
        ti.f fVar3 = this.f22406d[0];
        boolean h10 = fVar3.h();
        ti.f j10 = h10 ? fVar2 : fVar2.j(fVar3);
        ti.f o10 = h10 ? fVar3 : fVar3.o();
        ti.f n10 = i10.n();
        if (!h10) {
            n10 = n10.j(o10);
        }
        ti.f a10 = fVar2.o().a(j10).a(n10);
        if (a10.i()) {
            return new r1(i10, a10, i10.o().n());
        }
        ti.f o11 = a10.o();
        ti.f j11 = h10 ? a10 : a10.j(o10);
        if (!h10) {
            fVar = fVar.j(fVar3);
        }
        return new r1(i10, o11, fVar.p(a10, j10).a(o11).a(j11), new ti.f[]{j11});
    }

    @Override // ti.i
    public ti.i K(ti.i iVar) {
        if (u()) {
            return iVar;
        }
        if (iVar.u()) {
            return J();
        }
        ti.e i10 = i();
        ti.f fVar = this.f22404b;
        if (fVar.i()) {
            return iVar;
        }
        ti.f n10 = iVar.n();
        ti.f s10 = iVar.s(0);
        if (n10.i() || !s10.h()) {
            return J().a(iVar);
        }
        ti.f fVar2 = this.f22405c;
        ti.f fVar3 = this.f22406d[0];
        ti.f o10 = iVar.o();
        ti.f o11 = fVar.o();
        ti.f o12 = fVar2.o();
        ti.f o13 = fVar3.o();
        ti.f a10 = i10.n().j(o13).a(o12).a(fVar2.j(fVar3));
        ti.f b10 = o10.b();
        ti.f l10 = i10.n().a(b10).j(o13).a(o12).l(a10, o11, o13);
        ti.f j10 = n10.j(o13);
        ti.f o14 = j10.a(a10).o();
        if (o14.i()) {
            return l10.i() ? iVar.J() : i10.u();
        } else if (l10.i()) {
            return new r1(i10, l10, i10.o().n());
        } else {
            ti.f j11 = l10.o().j(j10);
            ti.f j12 = l10.j(o14).j(o13);
            return new r1(i10, j11, l10.a(o14).o().l(a10, b10, j12), new ti.f[]{j12});
        }
    }

    @Override // ti.i
    public ti.i a(ti.i iVar) {
        ti.f fVar;
        ti.f fVar2;
        ti.f fVar3;
        ti.f fVar4;
        ti.f fVar5;
        ti.f fVar6;
        if (u()) {
            return iVar;
        }
        if (iVar.u()) {
            return this;
        }
        ti.e i10 = i();
        ti.f fVar7 = this.f22404b;
        ti.f n10 = iVar.n();
        if (fVar7.i()) {
            return n10.i() ? i10.u() : iVar.a(this);
        }
        ti.f fVar8 = this.f22405c;
        ti.f fVar9 = this.f22406d[0];
        ti.f o10 = iVar.o();
        ti.f s10 = iVar.s(0);
        boolean h10 = fVar9.h();
        if (!h10) {
            fVar2 = n10.j(fVar9);
            fVar = o10.j(fVar9);
        } else {
            fVar2 = n10;
            fVar = o10;
        }
        boolean h11 = s10.h();
        if (!h11) {
            fVar7 = fVar7.j(s10);
            fVar3 = fVar8.j(s10);
        } else {
            fVar3 = fVar8;
        }
        ti.f a10 = fVar3.a(fVar);
        ti.f a11 = fVar7.a(fVar2);
        if (a11.i()) {
            return a10.i() ? J() : i10.u();
        }
        if (n10.i()) {
            ti.i A = A();
            ti.f q10 = A.q();
            ti.f r10 = A.r();
            ti.f d10 = r10.a(o10).d(q10);
            fVar5 = d10.o().a(d10).a(q10).a(i10.n());
            if (fVar5.i()) {
                return new r1(i10, fVar5, i10.o().n());
            }
            fVar4 = d10.j(q10.a(fVar5)).a(fVar5).a(r10).d(fVar5).a(fVar5);
            fVar6 = i10.m(ti.d.f22360b);
        } else {
            ti.f o11 = a11.o();
            ti.f j10 = a10.j(fVar7);
            ti.f j11 = a10.j(fVar2);
            ti.f j12 = j10.j(j11);
            if (j12.i()) {
                return new r1(i10, j12, i10.o().n());
            }
            ti.f j13 = a10.j(o11);
            ti.f j14 = !h11 ? j13.j(s10) : j13;
            ti.f p10 = j11.a(o11).p(j14, fVar8.a(fVar9));
            if (!h10) {
                j14 = j14.j(fVar9);
            }
            fVar5 = j12;
            fVar6 = j14;
            fVar4 = p10;
        }
        return new r1(i10, fVar5, fVar4, new ti.f[]{fVar6});
    }

    @Override // ti.i
    protected ti.i d() {
        return new r1(null, f(), g());
    }

    @Override // ti.i
    protected boolean h() {
        ti.f n10 = n();
        return !n10.i() && o().s() != n10.s();
    }

    @Override // ti.i
    public ti.f r() {
        ti.f fVar = this.f22404b;
        ti.f fVar2 = this.f22405c;
        if (u() || fVar.i()) {
            return fVar2;
        }
        ti.f j10 = fVar2.a(fVar).j(fVar);
        ti.f fVar3 = this.f22406d[0];
        return !fVar3.h() ? j10.d(fVar3) : j10;
    }

    @Override // ti.i
    public ti.i z() {
        if (u()) {
            return this;
        }
        ti.f fVar = this.f22404b;
        if (fVar.i()) {
            return this;
        }
        ti.f fVar2 = this.f22405c;
        ti.f fVar3 = this.f22406d[0];
        return new r1(this.f22403a, fVar, fVar2.a(fVar3), new ti.f[]{fVar3});
    }
}
