package wi;

import ti.i;
/* loaded from: classes3.dex */
public class v2 extends i.b {
    public v2(ti.e eVar, ti.f fVar, ti.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    public v2(ti.e eVar, ti.f fVar, ti.f fVar2, ti.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }

    @Override // ti.i
    public ti.i J() {
        long[] jArr;
        if (u()) {
            return this;
        }
        ti.e i10 = i();
        r2 r2Var = (r2) this.f22404b;
        if (r2Var.i()) {
            return i10.u();
        }
        r2 r2Var2 = (r2) this.f22405c;
        r2 r2Var3 = (r2) this.f22406d[0];
        long[] c10 = bj.m.c();
        long[] c11 = bj.m.c();
        long[] s10 = r2Var3.h() ? null : q2.s(r2Var3.f25253g);
        long[] jArr2 = r2Var2.f25253g;
        if (s10 == null) {
            jArr = r2Var3.f25253g;
        } else {
            q2.q(jArr2, s10, c10);
            q2.w(r2Var3.f25253g, c11);
            jArr2 = c10;
            jArr = c11;
        }
        long[] c12 = bj.m.c();
        q2.w(r2Var2.f25253g, c12);
        q2.d(jArr2, jArr, c12);
        if (bj.m.g(c12)) {
            return new v2(i10, new r2(c12), u2.f25279m);
        }
        long[] d10 = bj.m.d();
        q2.p(c12, jArr2, d10);
        r2 r2Var4 = new r2(c10);
        q2.w(c12, r2Var4.f25253g);
        r2 r2Var5 = new r2(c12);
        if (s10 != null) {
            long[] jArr3 = r2Var5.f25253g;
            q2.o(jArr3, jArr, jArr3);
        }
        long[] jArr4 = r2Var.f25253g;
        if (s10 != null) {
            q2.q(jArr4, s10, c11);
            jArr4 = c11;
        }
        q2.x(jArr4, d10);
        q2.t(d10, c11);
        q2.d(r2Var4.f25253g, r2Var5.f25253g, c11);
        return new v2(i10, r2Var4, new r2(c11), new ti.f[]{r2Var5});
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
        r2 r2Var = (r2) this.f22404b;
        if (r2Var.i()) {
            return iVar;
        }
        r2 r2Var2 = (r2) iVar.n();
        r2 r2Var3 = (r2) iVar.s(0);
        if (r2Var2.i() || !r2Var3.h()) {
            return J().a(iVar);
        }
        r2 r2Var4 = (r2) this.f22405c;
        r2 r2Var5 = (r2) this.f22406d[0];
        r2 r2Var6 = (r2) iVar.o();
        long[] c10 = bj.m.c();
        long[] c11 = bj.m.c();
        long[] c12 = bj.m.c();
        long[] c13 = bj.m.c();
        q2.w(r2Var.f25253g, c10);
        q2.w(r2Var4.f25253g, c11);
        q2.w(r2Var5.f25253g, c12);
        q2.o(r2Var4.f25253g, r2Var5.f25253g, c13);
        q2.d(c12, c11, c13);
        long[] s10 = q2.s(c12);
        q2.q(r2Var6.f25253g, s10, c12);
        q2.b(c12, c11, c12);
        long[] d10 = bj.m.d();
        q2.p(c12, c13, d10);
        q2.r(c10, s10, d10);
        q2.t(d10, c12);
        q2.q(r2Var2.f25253g, s10, c10);
        q2.b(c10, c13, c11);
        q2.w(c11, c11);
        if (bj.m.g(c11)) {
            return bj.m.g(c12) ? iVar.J() : i10.u();
        } else if (bj.m.g(c12)) {
            return new v2(i10, new r2(c12), u2.f25279m);
        } else {
            r2 r2Var7 = new r2();
            q2.w(c12, r2Var7.f25253g);
            long[] jArr = r2Var7.f25253g;
            q2.o(jArr, c10, jArr);
            r2 r2Var8 = new r2(c10);
            q2.o(c12, c11, r2Var8.f25253g);
            long[] jArr2 = r2Var8.f25253g;
            q2.q(jArr2, s10, jArr2);
            r2 r2Var9 = new r2(c11);
            q2.b(c12, c11, r2Var9.f25253g);
            long[] jArr3 = r2Var9.f25253g;
            q2.w(jArr3, jArr3);
            bj.n.X(18, d10);
            q2.p(r2Var9.f25253g, c13, d10);
            q2.f(r2Var6.f25253g, c13);
            q2.p(c13, r2Var8.f25253g, d10);
            q2.t(d10, r2Var9.f25253g);
            return new v2(i10, r2Var7, r2Var9, new ti.f[]{r2Var8});
        }
    }

    @Override // ti.i
    public ti.i a(ti.i iVar) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        r2 r2Var;
        r2 r2Var2;
        r2 r2Var3;
        if (u()) {
            return iVar;
        }
        if (iVar.u()) {
            return this;
        }
        ti.e i10 = i();
        r2 r2Var4 = (r2) this.f22404b;
        r2 r2Var5 = (r2) iVar.n();
        if (r2Var4.i()) {
            return r2Var5.i() ? i10.u() : iVar.a(this);
        }
        r2 r2Var6 = (r2) this.f22405c;
        r2 r2Var7 = (r2) this.f22406d[0];
        r2 r2Var8 = (r2) iVar.o();
        r2 r2Var9 = (r2) iVar.s(0);
        long[] c10 = bj.m.c();
        long[] c11 = bj.m.c();
        long[] c12 = bj.m.c();
        long[] c13 = bj.m.c();
        long[] s10 = r2Var7.h() ? null : q2.s(r2Var7.f25253g);
        if (s10 == null) {
            jArr = r2Var5.f25253g;
            jArr2 = r2Var8.f25253g;
        } else {
            q2.q(r2Var5.f25253g, s10, c11);
            q2.q(r2Var8.f25253g, s10, c13);
            jArr = c11;
            jArr2 = c13;
        }
        long[] s11 = r2Var9.h() ? null : q2.s(r2Var9.f25253g);
        long[] jArr4 = r2Var4.f25253g;
        if (s11 == null) {
            jArr3 = r2Var6.f25253g;
        } else {
            q2.q(jArr4, s11, c10);
            q2.q(r2Var6.f25253g, s11, c12);
            jArr4 = c10;
            jArr3 = c12;
        }
        q2.b(jArr3, jArr2, c12);
        q2.b(jArr4, jArr, c13);
        if (bj.m.g(c13)) {
            return bj.m.g(c12) ? J() : i10.u();
        }
        if (r2Var5.i()) {
            ti.i A = A();
            r2 r2Var10 = (r2) A.q();
            ti.f r10 = A.r();
            ti.f d10 = r10.a(r2Var8).d(r2Var10);
            r2Var = (r2) d10.o().a(d10).a(r2Var10).b();
            if (r2Var.i()) {
                return new v2(i10, r2Var, u2.f25279m);
            }
            r2Var3 = (r2) d10.j(r2Var10.a(r2Var)).a(r2Var).a(r10).d(r2Var).a(r2Var);
            r2Var2 = (r2) i10.m(ti.d.f22360b);
        } else {
            q2.w(c13, c13);
            long[] s12 = q2.s(c12);
            q2.q(jArr4, s12, c10);
            q2.q(jArr, s12, c11);
            r2 r2Var11 = new r2(c10);
            q2.o(c10, c11, r2Var11.f25253g);
            if (r2Var11.i()) {
                return new v2(i10, r2Var11, u2.f25279m);
            }
            r2 r2Var12 = new r2(c12);
            q2.q(c13, s12, r2Var12.f25253g);
            if (s11 != null) {
                long[] jArr5 = r2Var12.f25253g;
                q2.q(jArr5, s11, jArr5);
            }
            long[] d11 = bj.m.d();
            q2.b(c11, c13, c13);
            q2.x(c13, d11);
            q2.b(r2Var6.f25253g, r2Var7.f25253g, c13);
            q2.p(c13, r2Var12.f25253g, d11);
            r2 r2Var13 = new r2(c13);
            q2.t(d11, r2Var13.f25253g);
            if (s10 != null) {
                long[] jArr6 = r2Var12.f25253g;
                q2.q(jArr6, s10, jArr6);
            }
            r2Var = r2Var11;
            r2Var3 = r2Var13;
            r2Var2 = r2Var12;
        }
        return new v2(i10, r2Var, r2Var3, new ti.f[]{r2Var2});
    }

    @Override // ti.i
    protected ti.i d() {
        return new v2(null, f(), g());
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
        return new v2(this.f22403a, fVar, fVar2.a(fVar3), new ti.f[]{fVar3});
    }
}
