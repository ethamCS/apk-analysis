package ti;

import java.math.BigInteger;
import java.util.Hashtable;
import ti.e;
import ti.f;
/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: f */
    protected static final f[] f22402f = new f[0];

    /* renamed from: a */
    protected ti.e f22403a;

    /* renamed from: b */
    protected f f22404b;

    /* renamed from: c */
    protected f f22405c;

    /* renamed from: d */
    protected f[] f22406d;

    /* renamed from: e */
    protected Hashtable f22407e;

    /* loaded from: classes3.dex */
    public class a implements p {

        /* renamed from: a */
        final /* synthetic */ boolean f22408a;

        /* renamed from: b */
        final /* synthetic */ boolean f22409b;

        a(boolean z10, boolean z11) {
            i.this = r1;
            this.f22408a = z10;
            this.f22409b = z11;
        }

        @Override // ti.p
        public q a(q qVar) {
            u uVar = qVar instanceof u ? (u) qVar : null;
            if (uVar == null) {
                uVar = new u();
            }
            if (uVar.b()) {
                return uVar;
            }
            if (!uVar.a()) {
                if (!this.f22408a && !i.this.C()) {
                    uVar.e();
                    return uVar;
                }
                uVar.d();
            }
            if (this.f22409b && !uVar.c()) {
                if (!i.this.D()) {
                    uVar.e();
                    return uVar;
                }
                uVar.f();
            }
            return uVar;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b extends i {
        public b(ti.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        public b(ti.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }

        @Override // ti.i
        protected boolean C() {
            f fVar;
            f fVar2;
            ti.e i10 = i();
            f fVar3 = this.f22404b;
            f n10 = i10.n();
            f o10 = i10.o();
            int q10 = i10.q();
            if (q10 != 6) {
                f fVar4 = this.f22405c;
                f j10 = fVar4.a(fVar3).j(fVar4);
                if (q10 != 0) {
                    if (q10 != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    f fVar5 = this.f22406d[0];
                    if (!fVar5.h()) {
                        f j11 = fVar5.j(fVar5.o());
                        j10 = j10.j(fVar5);
                        n10 = n10.j(fVar5);
                        o10 = o10.j(j11);
                    }
                }
                return j10.equals(fVar3.a(n10).j(fVar3.o()).a(o10));
            }
            f fVar6 = this.f22406d[0];
            boolean h10 = fVar6.h();
            if (fVar3.i()) {
                f o11 = this.f22405c.o();
                if (!h10) {
                    o10 = o10.j(fVar6.o());
                }
                return o11.equals(o10);
            }
            f fVar7 = this.f22405c;
            f o12 = fVar3.o();
            if (h10) {
                fVar2 = fVar7.o().a(fVar7).a(n10);
                fVar = o12.o().a(o10);
            } else {
                f o13 = fVar6.o();
                f o14 = o13.o();
                fVar2 = fVar7.a(fVar6).l(fVar7, n10, o13);
                fVar = o12.p(o10, o14);
            }
            return fVar2.j(o12).equals(fVar);
        }

        @Override // ti.i
        protected boolean D() {
            BigInteger p10 = this.f22403a.p();
            if (ti.d.f22361c.equals(p10)) {
                return ((f.a) A().f()).w() != 0;
            } else if (!ti.d.f22363e.equals(p10)) {
                return super.D();
            } else {
                i A = A();
                f f10 = A.f();
                ti.e eVar = this.f22403a;
                f J = ((e.b) eVar).J(f10.a(eVar.n()));
                if (J == null) {
                    return false;
                }
                return ((f.a) f10.j(J).a(A.g())).w() == 0;
            }
        }

        @Override // ti.i
        public i E(f fVar) {
            if (u()) {
                return this;
            }
            int j10 = j();
            if (j10 == 5) {
                f n10 = n();
                return i().i(n10, o().a(n10).d(fVar).a(n10.j(fVar)), p());
            } else if (j10 != 6) {
                return super.E(fVar);
            } else {
                f n11 = n();
                f o10 = o();
                f fVar2 = p()[0];
                f j11 = n11.j(fVar.o());
                return i().i(j11, o10.a(n11).a(j11), new f[]{fVar2.j(fVar)});
            }
        }

        @Override // ti.i
        public i F(f fVar) {
            if (u()) {
                return this;
            }
            int j10 = j();
            if (j10 != 5 && j10 != 6) {
                return super.F(fVar);
            }
            f n10 = n();
            return i().i(n10, o().a(n10).j(fVar).a(n10), p());
        }

        @Override // ti.i
        public i G(i iVar) {
            return iVar.u() ? this : a(iVar.z());
        }

        public b L(int i10) {
            i h10;
            if (u()) {
                return this;
            }
            ti.e i11 = i();
            int q10 = i11.q();
            f fVar = this.f22404b;
            if (q10 != 0) {
                if (q10 != 1) {
                    if (q10 != 5) {
                        if (q10 != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                h10 = i11.i(fVar.q(i10), this.f22405c.q(i10), new f[]{this.f22406d[0].q(i10)});
                return (b) h10;
            }
            h10 = i11.h(fVar.q(i10), this.f22405c.q(i10));
            return (b) h10;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c extends i {
        public c(ti.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        public c(ti.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }

        @Override // ti.i
        protected boolean C() {
            f fVar = this.f22404b;
            f fVar2 = this.f22405c;
            f n10 = this.f22403a.n();
            f o10 = this.f22403a.o();
            f o11 = fVar2.o();
            int j10 = j();
            if (j10 != 0) {
                if (j10 == 1) {
                    f fVar3 = this.f22406d[0];
                    if (!fVar3.h()) {
                        f o12 = fVar3.o();
                        f j11 = fVar3.j(o12);
                        o11 = o11.j(fVar3);
                        n10 = n10.j(o12);
                        o10 = o10.j(j11);
                    }
                } else if (j10 != 2 && j10 != 3 && j10 != 4) {
                    throw new IllegalStateException("unsupported coordinate system");
                } else {
                    f fVar4 = this.f22406d[0];
                    if (!fVar4.h()) {
                        f o13 = fVar4.o();
                        f o14 = o13.o();
                        f j12 = o13.j(o14);
                        n10 = n10.j(o14);
                        o10 = o10.j(j12);
                    }
                }
            }
            return o11.equals(fVar.o().a(n10).j(fVar).a(o10));
        }

        @Override // ti.i
        public i G(i iVar) {
            return iVar.u() ? this : a(iVar.z());
        }

        @Override // ti.i
        protected boolean h() {
            return g().s();
        }
    }

    /* loaded from: classes3.dex */
    public static class d extends b {
        public d(ti.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        public d(ti.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }

        @Override // ti.i
        public i J() {
            f fVar;
            if (u()) {
                return this;
            }
            ti.e i10 = i();
            f fVar2 = this.f22404b;
            if (fVar2.i()) {
                return i10.u();
            }
            int q10 = i10.q();
            if (q10 == 0) {
                f a10 = this.f22405c.d(fVar2).a(fVar2);
                f a11 = a10.o().a(a10).a(i10.n());
                return new d(i10, a11, fVar2.p(a11, a10.b()));
            } else if (q10 == 1) {
                f fVar3 = this.f22405c;
                f fVar4 = this.f22406d[0];
                boolean h10 = fVar4.h();
                f j10 = h10 ? fVar2 : fVar2.j(fVar4);
                if (!h10) {
                    fVar3 = fVar3.j(fVar4);
                }
                f o10 = fVar2.o();
                f a12 = o10.a(fVar3);
                f o11 = j10.o();
                f a13 = a12.a(j10);
                f l10 = a13.l(a12, o11, i10.n());
                return new d(i10, j10.j(l10), o10.o().l(j10, l10, a13), new f[]{j10.j(o11)});
            } else if (q10 != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            } else {
                f fVar5 = this.f22405c;
                f fVar6 = this.f22406d[0];
                boolean h11 = fVar6.h();
                f j11 = h11 ? fVar5 : fVar5.j(fVar6);
                f o12 = h11 ? fVar6 : fVar6.o();
                f n10 = i10.n();
                f j12 = h11 ? n10 : n10.j(o12);
                f a14 = fVar5.o().a(j11).a(j12);
                if (a14.i()) {
                    return new d(i10, a14, i10.o().n());
                }
                f o13 = a14.o();
                f j13 = h11 ? a14 : a14.j(o12);
                f o14 = i10.o();
                if (o14.c() < (i10.t() >> 1)) {
                    f o15 = fVar5.a(fVar2).o();
                    fVar = o15.a(a14).a(o12).j(o15).a(o14.h() ? j12.a(o12).o() : j12.p(o14, o12.o())).a(o13);
                    if (!n10.i()) {
                        if (!n10.h()) {
                            fVar = fVar.a(n10.b().j(j13));
                        }
                        return new d(i10, o13, fVar, new f[]{j13});
                    }
                } else {
                    if (!h11) {
                        fVar2 = fVar2.j(fVar6);
                    }
                    fVar = fVar2.p(a14, j11).a(o13);
                }
                fVar = fVar.a(j13);
                return new d(i10, o13, fVar, new f[]{j13});
            }
        }

        @Override // ti.i
        public i K(i iVar) {
            if (u()) {
                return iVar;
            }
            if (iVar.u()) {
                return J();
            }
            ti.e i10 = i();
            f fVar = this.f22404b;
            if (fVar.i()) {
                return iVar;
            }
            if (i10.q() != 6) {
                return J().a(iVar);
            }
            f fVar2 = iVar.f22404b;
            f fVar3 = iVar.f22406d[0];
            if (fVar2.i() || !fVar3.h()) {
                return J().a(iVar);
            }
            f fVar4 = this.f22405c;
            f fVar5 = this.f22406d[0];
            f fVar6 = iVar.f22405c;
            f o10 = fVar.o();
            f o11 = fVar4.o();
            f o12 = fVar5.o();
            f a10 = i10.n().j(o12).a(o11).a(fVar4.j(fVar5));
            f b10 = fVar6.b();
            f l10 = i10.n().a(b10).j(o12).a(o11).l(a10, o10, o12);
            f j10 = fVar2.j(o12);
            f o13 = j10.a(a10).o();
            if (o13.i()) {
                return l10.i() ? iVar.J() : i10.u();
            } else if (l10.i()) {
                return new d(i10, l10, i10.o().n());
            } else {
                f j11 = l10.o().j(j10);
                f j12 = l10.j(o13).j(o12);
                return new d(i10, j11, l10.a(o13).o().l(a10, b10, j12), new f[]{j12});
            }
        }

        @Override // ti.i
        public i a(i iVar) {
            f fVar;
            f fVar2;
            f fVar3;
            f fVar4;
            f fVar5;
            f fVar6;
            if (u()) {
                return iVar;
            }
            if (iVar.u()) {
                return this;
            }
            ti.e i10 = i();
            int q10 = i10.q();
            f fVar7 = this.f22404b;
            f fVar8 = iVar.f22404b;
            if (q10 == 0) {
                f fVar9 = this.f22405c;
                f fVar10 = iVar.f22405c;
                f a10 = fVar7.a(fVar8);
                f a11 = fVar9.a(fVar10);
                if (a10.i()) {
                    return a11.i() ? J() : i10.u();
                }
                f d10 = a11.d(a10);
                f a12 = d10.o().a(d10).a(a10).a(i10.n());
                return new d(i10, a12, d10.j(fVar7.a(a12)).a(a12).a(fVar9));
            } else if (q10 == 1) {
                f fVar11 = this.f22405c;
                f fVar12 = this.f22406d[0];
                f fVar13 = iVar.f22405c;
                f fVar14 = iVar.f22406d[0];
                boolean h10 = fVar14.h();
                f a13 = fVar12.j(fVar13).a(h10 ? fVar11 : fVar11.j(fVar14));
                f a14 = fVar12.j(fVar8).a(h10 ? fVar7 : fVar7.j(fVar14));
                if (a14.i()) {
                    return a13.i() ? J() : i10.u();
                }
                f o10 = a14.o();
                f j10 = o10.j(a14);
                if (!h10) {
                    fVar12 = fVar12.j(fVar14);
                }
                f a15 = a13.a(a14);
                f a16 = a15.l(a13, o10, i10.n()).j(fVar12).a(j10);
                f j11 = a14.j(a16);
                if (!h10) {
                    o10 = o10.j(fVar14);
                }
                return new d(i10, j11, a13.l(fVar7, a14, fVar11).l(o10, a15, a16), new f[]{j10.j(fVar12)});
            } else if (q10 != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            } else {
                if (fVar7.i()) {
                    return fVar8.i() ? i10.u() : iVar.a(this);
                }
                f fVar15 = this.f22405c;
                f fVar16 = this.f22406d[0];
                f fVar17 = iVar.f22405c;
                f fVar18 = iVar.f22406d[0];
                boolean h11 = fVar16.h();
                if (!h11) {
                    fVar2 = fVar8.j(fVar16);
                    fVar = fVar17.j(fVar16);
                } else {
                    fVar2 = fVar8;
                    fVar = fVar17;
                }
                boolean h12 = fVar18.h();
                if (!h12) {
                    fVar7 = fVar7.j(fVar18);
                    fVar3 = fVar15.j(fVar18);
                } else {
                    fVar3 = fVar15;
                }
                f a17 = fVar3.a(fVar);
                f a18 = fVar7.a(fVar2);
                if (a18.i()) {
                    return a17.i() ? J() : i10.u();
                }
                if (fVar8.i()) {
                    i A = A();
                    f q11 = A.q();
                    f r10 = A.r();
                    f d11 = r10.a(fVar17).d(q11);
                    fVar4 = d11.o().a(d11).a(q11).a(i10.n());
                    if (fVar4.i()) {
                        return new d(i10, fVar4, i10.o().n());
                    }
                    fVar6 = d11.j(q11.a(fVar4)).a(fVar4).a(r10).d(fVar4).a(fVar4);
                    fVar5 = i10.m(ti.d.f22360b);
                } else {
                    f o11 = a18.o();
                    f j12 = a17.j(fVar7);
                    f j13 = a17.j(fVar2);
                    f j14 = j12.j(j13);
                    if (j14.i()) {
                        return new d(i10, j14, i10.o().n());
                    }
                    f j15 = a17.j(o11);
                    f j16 = !h12 ? j15.j(fVar18) : j15;
                    f p10 = j13.a(o11).p(j16, fVar15.a(fVar16));
                    if (!h11) {
                        j16 = j16.j(fVar16);
                    }
                    fVar4 = j14;
                    fVar5 = j16;
                    fVar6 = p10;
                }
                return new d(i10, fVar4, fVar6, new f[]{fVar5});
            }
        }

        @Override // ti.i
        protected i d() {
            return new d(null, f(), g());
        }

        @Override // ti.i
        protected boolean h() {
            f n10 = n();
            if (n10.i()) {
                return false;
            }
            f o10 = o();
            int j10 = j();
            return (j10 == 5 || j10 == 6) ? o10.s() != n10.s() : o10.d(n10).s();
        }

        @Override // ti.i
        public f r() {
            int j10 = j();
            if (j10 == 5 || j10 == 6) {
                f fVar = this.f22404b;
                f fVar2 = this.f22405c;
                if (u() || fVar.i()) {
                    return fVar2;
                }
                f j11 = fVar2.a(fVar).j(fVar);
                if (6 != j10) {
                    return j11;
                }
                f fVar3 = this.f22406d[0];
                return !fVar3.h() ? j11.d(fVar3) : j11;
            }
            return this.f22405c;
        }

        @Override // ti.i
        public i z() {
            if (u()) {
                return this;
            }
            f fVar = this.f22404b;
            if (fVar.i()) {
                return this;
            }
            int j10 = j();
            if (j10 == 0) {
                return new d(this.f22403a, fVar, this.f22405c.a(fVar));
            }
            if (j10 == 1) {
                return new d(this.f22403a, fVar, this.f22405c.a(fVar), new f[]{this.f22406d[0]});
            } else if (j10 == 5) {
                return new d(this.f22403a, fVar, this.f22405c.b());
            } else {
                if (j10 != 6) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                f fVar2 = this.f22405c;
                f fVar3 = this.f22406d[0];
                return new d(this.f22403a, fVar, fVar2.a(fVar3), new f[]{fVar3});
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends c {
        public e(ti.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        public e(ti.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }

        @Override // ti.i
        public i H() {
            if (u()) {
                return this;
            }
            f fVar = this.f22405c;
            if (fVar.i()) {
                return this;
            }
            ti.e i10 = i();
            int q10 = i10.q();
            if (q10 != 0) {
                return q10 != 4 ? J().a(this) : Q(false).a(this);
            }
            f fVar2 = this.f22404b;
            f R = R(fVar);
            f o10 = R.o();
            f a10 = P(fVar2.o()).a(i().n());
            f r10 = P(fVar2).j(o10).r(a10.o());
            if (r10.i()) {
                return i().u();
            }
            f g10 = r10.j(R).g();
            f j10 = r10.j(g10).j(a10);
            f r11 = o10.o().j(g10).r(j10);
            f a11 = r11.r(j10).j(j10.a(r11)).a(fVar2);
            return new e(i10, a11, fVar2.r(a11).j(r11).r(fVar));
        }

        @Override // ti.i
        public i I(int i10) {
            f fVar;
            if (i10 >= 0) {
                if (i10 == 0 || u()) {
                    return this;
                }
                if (i10 == 1) {
                    return J();
                }
                ti.e i11 = i();
                f fVar2 = this.f22405c;
                if (fVar2.i()) {
                    return i11.u();
                }
                int q10 = i11.q();
                f n10 = i11.n();
                f fVar3 = this.f22404b;
                f[] fVarArr = this.f22406d;
                f m10 = fVarArr.length < 1 ? i11.m(ti.d.f22360b) : fVarArr[0];
                if (!m10.h() && q10 != 0) {
                    if (q10 == 1) {
                        fVar = m10.o();
                        fVar3 = fVar3.j(m10);
                        fVar2 = fVar2.j(fVar);
                    } else if (q10 == 2) {
                        fVar = null;
                    } else if (q10 != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    } else {
                        n10 = O();
                    }
                    n10 = L(m10, fVar);
                }
                int i12 = 0;
                while (i12 < i10) {
                    if (fVar2.i()) {
                        return i11.u();
                    }
                    f P = P(fVar3.o());
                    f R = R(fVar2);
                    f j10 = R.j(fVar2);
                    f R2 = R(fVar3.j(j10));
                    f R3 = R(j10.o());
                    if (!n10.i()) {
                        P = P.a(n10);
                        n10 = R(R3.j(n10));
                    }
                    f r10 = P.o().r(R(R2));
                    fVar2 = P.j(R2.r(r10)).r(R3);
                    m10 = m10.h() ? R : R.j(m10);
                    i12++;
                    fVar3 = r10;
                }
                if (q10 == 0) {
                    f g10 = m10.g();
                    f o10 = g10.o();
                    return new e(i11, fVar3.j(o10), fVar2.j(o10.j(g10)));
                } else if (q10 == 1) {
                    return new e(i11, fVar3.j(m10), fVar2, new f[]{m10.j(m10.o())});
                } else {
                    if (q10 == 2) {
                        return new e(i11, fVar3, fVar2, new f[]{m10});
                    }
                    if (q10 != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    return new e(i11, fVar3, fVar2, new f[]{m10, n10});
                }
            }
            throw new IllegalArgumentException("'e' cannot be negative");
        }

        @Override // ti.i
        public i J() {
            f fVar;
            f fVar2;
            if (u()) {
                return this;
            }
            ti.e i10 = i();
            f fVar3 = this.f22405c;
            if (fVar3.i()) {
                return i10.u();
            }
            int q10 = i10.q();
            f fVar4 = this.f22404b;
            if (q10 == 0) {
                f d10 = P(fVar4.o()).a(i().n()).d(R(fVar3));
                f r10 = d10.o().r(R(fVar4));
                return new e(i10, r10, d10.j(fVar4.r(r10)).r(fVar3));
            } else if (q10 == 1) {
                f fVar5 = this.f22406d[0];
                boolean h10 = fVar5.h();
                f n10 = i10.n();
                if (!n10.i() && !h10) {
                    n10 = n10.j(fVar5.o());
                }
                f a10 = n10.a(P(fVar4.o()));
                f j10 = h10 ? fVar3 : fVar3.j(fVar5);
                f o10 = h10 ? fVar3.o() : j10.j(fVar3);
                f N = N(fVar4.j(o10));
                f r11 = a10.o().r(R(N));
                f R = R(j10);
                f j11 = r11.j(R);
                f R2 = R(o10);
                return new e(i10, j11, N.r(r11).j(a10).r(R(R2.o())), new f[]{R(h10 ? R(R2) : R.o()).j(j10)});
            } else if (q10 != 2) {
                if (q10 != 4) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                return Q(true);
            } else {
                f fVar6 = this.f22406d[0];
                boolean h11 = fVar6.h();
                f o11 = fVar3.o();
                f o12 = o11.o();
                f n11 = i10.n();
                f m10 = n11.m();
                if (m10.t().equals(BigInteger.valueOf(3L))) {
                    f o13 = h11 ? fVar6 : fVar6.o();
                    fVar = P(fVar4.a(o13).j(fVar4.r(o13)));
                    fVar2 = o11.j(fVar4);
                } else {
                    f P = P(fVar4.o());
                    if (!h11) {
                        if (!n11.i()) {
                            f o14 = fVar6.o().o();
                            if (m10.c() < n11.c()) {
                                fVar = P.r(o14.j(m10));
                            } else {
                                n11 = o14.j(n11);
                            }
                        } else {
                            fVar = P;
                        }
                        fVar2 = fVar4.j(o11);
                    }
                    fVar = P.a(n11);
                    fVar2 = fVar4.j(o11);
                }
                f N2 = N(fVar2);
                f r12 = fVar.o().r(R(N2));
                f r13 = N2.r(r12).j(fVar).r(M(o12));
                f R3 = R(fVar3);
                if (!h11) {
                    R3 = R3.j(fVar6);
                }
                return new e(i10, r12, r13, new f[]{R3});
            }
        }

        @Override // ti.i
        public i K(i iVar) {
            if (this == iVar) {
                return H();
            }
            if (u()) {
                return iVar;
            }
            if (iVar.u()) {
                return J();
            }
            f fVar = this.f22405c;
            if (fVar.i()) {
                return iVar;
            }
            ti.e i10 = i();
            int q10 = i10.q();
            if (q10 != 0) {
                return q10 != 4 ? J().a(iVar) : Q(false).a(iVar);
            }
            f fVar2 = this.f22404b;
            f fVar3 = iVar.f22404b;
            f fVar4 = iVar.f22405c;
            f r10 = fVar3.r(fVar2);
            f r11 = fVar4.r(fVar);
            if (r10.i()) {
                return r11.i() ? H() : this;
            }
            f o10 = r10.o();
            f r12 = o10.j(R(fVar2).a(fVar3)).r(r11.o());
            if (r12.i()) {
                return i10.u();
            }
            f g10 = r12.j(r10).g();
            f j10 = r12.j(g10).j(r11);
            f r13 = R(fVar).j(o10).j(r10).j(g10).r(j10);
            f a10 = r13.r(j10).j(j10.a(r13)).a(fVar3);
            return new e(i10, a10, fVar2.r(a10).j(r13).r(fVar));
        }

        protected f L(f fVar, f fVar2) {
            f n10 = i().n();
            if (n10.i() || fVar.h()) {
                return n10;
            }
            if (fVar2 == null) {
                fVar2 = fVar.o();
            }
            f o10 = fVar2.o();
            f m10 = n10.m();
            return m10.c() < n10.c() ? o10.j(m10).m() : o10.j(n10);
        }

        protected f M(f fVar) {
            return N(R(fVar));
        }

        protected f N(f fVar) {
            return R(R(fVar));
        }

        protected f O() {
            f[] fVarArr = this.f22406d;
            f fVar = fVarArr[1];
            if (fVar == null) {
                f L = L(fVarArr[0], null);
                fVarArr[1] = L;
                return L;
            }
            return fVar;
        }

        protected f P(f fVar) {
            return R(fVar).a(fVar);
        }

        protected e Q(boolean z10) {
            f fVar = this.f22404b;
            f fVar2 = this.f22405c;
            f fVar3 = this.f22406d[0];
            f O = O();
            f a10 = P(fVar.o()).a(O);
            f R = R(fVar2);
            f j10 = R.j(fVar2);
            f R2 = R(fVar.j(j10));
            f r10 = a10.o().r(R(R2));
            f R3 = R(j10.o());
            f r11 = a10.j(R2.r(r10)).r(R3);
            f R4 = z10 ? R(R3.j(O)) : null;
            if (!fVar3.h()) {
                R = R.j(fVar3);
            }
            return new e(i(), r10, r11, new f[]{R, R4});
        }

        protected f R(f fVar) {
            return fVar.a(fVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
        @Override // ti.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ti.i a(ti.i r17) {
            /*
                Method dump skipped, instructions count: 532
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ti.i.e.a(ti.i):ti.i");
        }

        @Override // ti.i
        protected i d() {
            return new e(null, f(), g());
        }

        @Override // ti.i
        public f s(int i10) {
            return (i10 == 1 && 4 == j()) ? O() : super.s(i10);
        }

        @Override // ti.i
        public i z() {
            if (u()) {
                return this;
            }
            ti.e i10 = i();
            return i10.q() != 0 ? new e(i10, this.f22404b, this.f22405c.m(), this.f22406d) : new e(i10, this.f22404b, this.f22405c.m());
        }
    }

    protected i(ti.e eVar, f fVar, f fVar2) {
        this(eVar, fVar, fVar2, m(eVar));
    }

    protected i(ti.e eVar, f fVar, f fVar2, f[] fVarArr) {
        this.f22407e = null;
        this.f22403a = eVar;
        this.f22404b = fVar;
        this.f22405c = fVar2;
        this.f22406d = fVarArr;
    }

    protected static f[] m(ti.e eVar) {
        int q10 = eVar == null ? 0 : eVar.q();
        if (q10 == 0 || q10 == 5) {
            return f22402f;
        }
        f m10 = eVar.m(ti.d.f22360b);
        if (q10 != 1 && q10 != 2) {
            if (q10 == 3) {
                return new f[]{m10, m10, m10};
            }
            if (q10 == 4) {
                return new f[]{m10, eVar.n()};
            }
            if (q10 != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new f[]{m10};
    }

    public i A() {
        int j10;
        if (u() || (j10 = j()) == 0 || j10 == 5) {
            return this;
        }
        f s10 = s(0);
        if (s10.h()) {
            return this;
        }
        if (this.f22403a == null) {
            throw new IllegalStateException("Detached points must be in affine coordinates");
        }
        f C = this.f22403a.C(org.bouncycastle.crypto.l.b());
        return B(s10.j(C).g().j(C));
    }

    public i B(f fVar) {
        int j10 = j();
        if (j10 != 1) {
            if (j10 == 2 || j10 == 3 || j10 == 4) {
                f o10 = fVar.o();
                return c(o10, o10.j(fVar));
            } else if (j10 != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return c(fVar, fVar);
    }

    protected abstract boolean C();

    protected boolean D() {
        BigInteger w9;
        return ti.d.f22360b.equals(this.f22403a.p()) || (w9 = this.f22403a.w()) == null || ti.c.q(this, w9).u();
    }

    public i E(f fVar) {
        return u() ? this : i().i(n().j(fVar), o(), p());
    }

    public i F(f fVar) {
        return u() ? this : i().i(n(), o().j(fVar), p());
    }

    public abstract i G(i iVar);

    public i H() {
        return K(this);
    }

    public i I(int i10) {
        if (i10 >= 0) {
            i iVar = this;
            while (true) {
                i10--;
                if (i10 < 0) {
                    return iVar;
                }
                iVar = iVar.J();
            }
        } else {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
    }

    public abstract i J();

    public i K(i iVar) {
        return J().a(iVar);
    }

    public abstract i a(i iVar);

    protected void b() {
        if (v()) {
            return;
        }
        throw new IllegalStateException("point not in normal form");
    }

    protected i c(f fVar, f fVar2) {
        return i().h(n().j(fVar), o().j(fVar2));
    }

    protected abstract i d();

    public boolean e(i iVar) {
        i iVar2;
        if (iVar == null) {
            return false;
        }
        ti.e i10 = i();
        ti.e i11 = iVar.i();
        boolean z10 = i10 == null;
        boolean z11 = i11 == null;
        boolean u10 = u();
        boolean u11 = iVar.u();
        if (u10 || u11) {
            if (!u10 || !u11) {
                return false;
            }
            return z10 || z11 || i10.l(i11);
        }
        if (!z10 || !z11) {
            if (!z10) {
                if (z11) {
                    iVar2 = A();
                } else if (!i10.l(i11)) {
                    return false;
                } else {
                    i[] iVarArr = {this, i10.x(iVar)};
                    i10.z(iVarArr);
                    iVar2 = iVarArr[0];
                    iVar = iVarArr[1];
                }
                return iVar2.q().equals(iVar.q()) && iVar2.r().equals(iVar.r());
            }
            iVar = iVar.A();
        }
        iVar2 = this;
        if (iVar2.q().equals(iVar.q())) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return e((i) obj);
        }
        return false;
    }

    public f f() {
        b();
        return q();
    }

    public f g() {
        b();
        return r();
    }

    protected abstract boolean h();

    public int hashCode() {
        ti.e i10 = i();
        int i11 = i10 == null ? 0 : ~i10.hashCode();
        if (!u()) {
            i A = A();
            return (i11 ^ (A.q().hashCode() * 17)) ^ (A.r().hashCode() * 257);
        }
        return i11;
    }

    public ti.e i() {
        return this.f22403a;
    }

    protected int j() {
        ti.e eVar = this.f22403a;
        if (eVar == null) {
            return 0;
        }
        return eVar.q();
    }

    public final i k() {
        return A().d();
    }

    public byte[] l(boolean z10) {
        if (u()) {
            return new byte[1];
        }
        i A = A();
        byte[] e10 = A.q().e();
        if (z10) {
            byte[] bArr = new byte[e10.length + 1];
            bArr[0] = (byte) (A.h() ? 3 : 2);
            System.arraycopy(e10, 0, bArr, 1, e10.length);
            return bArr;
        }
        byte[] e11 = A.r().e();
        byte[] bArr2 = new byte[e10.length + e11.length + 1];
        bArr2[0] = 4;
        System.arraycopy(e10, 0, bArr2, 1, e10.length);
        System.arraycopy(e11, 0, bArr2, e10.length + 1, e11.length);
        return bArr2;
    }

    public final f n() {
        return this.f22404b;
    }

    public final f o() {
        return this.f22405c;
    }

    protected final f[] p() {
        return this.f22406d;
    }

    public f q() {
        return this.f22404b;
    }

    public f r() {
        return this.f22405c;
    }

    public f s(int i10) {
        if (i10 >= 0) {
            f[] fVarArr = this.f22406d;
            if (i10 < fVarArr.length) {
                return fVarArr[i10];
            }
        }
        return null;
    }

    public boolean t(boolean z10, boolean z11) {
        if (u()) {
            return true;
        }
        return !((u) i().B(this, "bc_validity", new a(z10, z11))).b();
    }

    public String toString() {
        if (u()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(n());
        stringBuffer.append(',');
        stringBuffer.append(o());
        for (int i10 = 0; i10 < this.f22406d.length; i10++) {
            stringBuffer.append(',');
            stringBuffer.append(this.f22406d[i10]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public boolean u() {
        if (this.f22404b != null && this.f22405c != null) {
            f[] fVarArr = this.f22406d;
            if (fVarArr.length <= 0 || !fVarArr[0].i()) {
                return false;
            }
        }
        return true;
    }

    public boolean v() {
        int j10 = j();
        return j10 == 0 || j10 == 5 || u() || this.f22406d[0].h();
    }

    public boolean w() {
        return t(false, true);
    }

    public boolean x() {
        return t(false, false);
    }

    public i y(BigInteger bigInteger) {
        return i().v().a(this, bigInteger);
    }

    public abstract i z();
}
