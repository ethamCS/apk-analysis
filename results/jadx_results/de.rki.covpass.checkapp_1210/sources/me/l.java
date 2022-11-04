package me;

import ad.i0;
import hc.t;
import java.util.Collection;
import java.util.List;
import oe.e0;
import oe.g0;
import oe.k1;
import oe.l1;
import oe.m0;
import oe.r1;
import rd.r;
import xc.e1;
import xc.f1;
import xc.g1;
/* loaded from: classes3.dex */
public final class l extends ad.d implements g {
    private final ne.n W3;
    private final r X3;
    private final td.c Y3;
    private final td.g Z3;

    /* renamed from: a4 */
    private final td.h f16577a4;

    /* renamed from: b4 */
    private final f f16578b4;

    /* renamed from: c4 */
    private Collection<? extends i0> f16579c4;

    /* renamed from: d4 */
    private m0 f16580d4;

    /* renamed from: e4 */
    private m0 f16581e4;

    /* renamed from: f4 */
    private List<? extends f1> f16582f4;

    /* renamed from: g4 */
    private m0 f16583g4;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(ne.n r13, xc.m r14, yc.g r15, wd.f r16, xc.u r17, rd.r r18, td.c r19, td.g r20, td.h r21, me.f r22) {
        /*
            r12 = this;
            r6 = r12
            r7 = r13
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "storageManager"
            hc.t.e(r13, r0)
            java.lang.String r0 = "containingDeclaration"
            r1 = r14
            hc.t.e(r14, r0)
            java.lang.String r0 = "annotations"
            r2 = r15
            hc.t.e(r15, r0)
            java.lang.String r0 = "name"
            r3 = r16
            hc.t.e(r3, r0)
            java.lang.String r0 = "visibility"
            r5 = r17
            hc.t.e(r5, r0)
            java.lang.String r0 = "proto"
            hc.t.e(r8, r0)
            java.lang.String r0 = "nameResolver"
            hc.t.e(r9, r0)
            java.lang.String r0 = "typeTable"
            hc.t.e(r10, r0)
            java.lang.String r0 = "versionRequirementTable"
            hc.t.e(r11, r0)
            xc.a1 r4 = xc.a1.f25519a
            java.lang.String r0 = "NO_SOURCE"
            hc.t.d(r4, r0)
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.W3 = r7
            r6.X3 = r8
            r6.Y3 = r9
            r6.Z3 = r10
            r6.f16577a4 = r11
            r0 = r22
            r6.f16578b4 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.l.<init>(ne.n, xc.m, yc.g, wd.f, xc.u, rd.r, td.c, td.g, td.h, me.f):void");
    }

    @Override // me.g
    public td.g D0() {
        return this.Z3;
    }

    @Override // me.g
    public f E() {
        return this.f16578b4;
    }

    @Override // xc.e1
    public m0 H0() {
        m0 m0Var = this.f16581e4;
        if (m0Var != null) {
            return m0Var;
        }
        t.s("expandedType");
        return null;
    }

    @Override // xc.e1
    public m0 L() {
        m0 m0Var = this.f16580d4;
        if (m0Var != null) {
            return m0Var;
        }
        t.s("underlyingType");
        return null;
    }

    @Override // ad.d
    protected ne.n M() {
        return this.W3;
    }

    @Override // me.g
    public td.c Q0() {
        return this.Y3;
    }

    @Override // ad.d
    protected List<f1> V0() {
        List list = this.f16582f4;
        if (list == null) {
            t.s("typeConstructorParameters");
            return null;
        }
        return list;
    }

    public r X0() {
        return this.X3;
    }

    public td.h Y0() {
        return this.f16577a4;
    }

    public final void Z0(List<? extends f1> list, m0 m0Var, m0 m0Var2) {
        t.e(list, "declaredTypeParameters");
        t.e(m0Var, "underlyingType");
        t.e(m0Var2, "expandedType");
        W0(list);
        this.f16580d4 = m0Var;
        this.f16581e4 = m0Var2;
        this.f16582f4 = g1.d(this);
        this.f16583g4 = M0();
        this.f16579c4 = U0();
    }

    /* renamed from: a1 */
    public e1 c(l1 l1Var) {
        t.e(l1Var, "substitutor");
        if (l1Var.k()) {
            return this;
        }
        ne.n M = M();
        xc.m b10 = b();
        t.d(b10, "containingDeclaration");
        yc.g j10 = j();
        t.d(j10, "annotations");
        wd.f name = getName();
        t.d(name, "name");
        l lVar = new l(M, b10, j10, name, g(), X0(), Q0(), D0(), Y0(), E());
        List<f1> A = A();
        m0 L = L();
        r1 r1Var = r1.INVARIANT;
        e0 n10 = l1Var.n(L, r1Var);
        t.d(n10, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        m0 a10 = k1.a(n10);
        e0 n11 = l1Var.n(H0(), r1Var);
        t.d(n11, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        lVar.Z0(A, a10, k1.a(n11));
        return lVar;
    }

    @Override // xc.e1
    public xc.e q() {
        if (g0.a(H0())) {
            return null;
        }
        xc.h z10 = H0().W0().z();
        if (!(z10 instanceof xc.e)) {
            return null;
        }
        return (xc.e) z10;
    }

    @Override // xc.h
    public m0 u() {
        m0 m0Var = this.f16583g4;
        if (m0Var == null) {
            t.s("defaultTypeImpl");
            return null;
        }
        return m0Var;
    }
}
