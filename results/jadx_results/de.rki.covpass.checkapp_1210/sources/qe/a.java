package qe;

import hc.t;
import oe.j1;
import oe.l1;
/* loaded from: classes3.dex */
public final class a extends ad.h {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(wd.f r21) {
        /*
            r20 = this;
            r9 = r20
            java.lang.String r0 = "name"
            r2 = r21
            hc.t.e(r2, r0)
            qe.k r10 = qe.k.f19894a
            xc.h0 r1 = r10.i()
            xc.e0 r3 = xc.e0.OPEN
            xc.f r4 = xc.f.CLASS
            java.util.List r5 = ub.s.h()
            xc.a1 r11 = xc.a1.f25519a
            ne.n r8 = ne.f.f16977e
            r7 = 0
            r0 = r20
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            yc.g$a r0 = yc.g.Companion
            yc.g r0 = r0.b()
            r1 = 1
            ad.f r0 = ad.f.w1(r9, r0, r1, r11)
            java.util.List r2 = ub.s.h()
            xc.u r3 = xc.t.f25580d
            r0.z1(r2, r3)
            java.lang.String r2 = "create(this, Annotations…          )\n            }"
            hc.t.d(r0, r2)
            qe.g r2 = qe.g.SCOPE_FOR_ERROR_CLASS
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            wd.f r4 = r0.getName()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "errorConstructor.name.toString()"
            hc.t.d(r4, r5)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = ""
            r3[r1] = r4
            qe.f r1 = qe.k.b(r2, r3)
            qe.h r2 = new qe.h
            qe.j r14 = qe.j.ERROR_CLASS
            java.lang.String[] r3 = new java.lang.String[r5]
            qe.i r12 = r10.e(r14, r3)
            java.lang.String[] r3 = new java.lang.String[r5]
            r15 = 0
            r16 = 0
            r18 = 24
            r19 = 0
            r11 = r2
            r13 = r1
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.p1(r2)
            java.util.Set r2 = ub.w0.a(r0)
            r9.T0(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.a.<init>(wd.f):void");
    }

    @Override // ad.a
    /* renamed from: M0 */
    public xc.e c(l1 l1Var) {
        t.e(l1Var, "substitutor");
        return this;
    }

    @Override // ad.a, ad.t
    public he.h e0(j1 j1Var, pe.g gVar) {
        t.e(j1Var, "typeSubstitution");
        t.e(gVar, "kotlinTypeRefiner");
        g gVar2 = g.SCOPE_FOR_ERROR_CLASS;
        String fVar = getName().toString();
        t.d(fVar, "name.toString()");
        return k.b(gVar2, fVar, j1Var.toString());
    }

    @Override // ad.h
    public String toString() {
        String b10 = getName().b();
        t.d(b10, "name.asString()");
        return b10;
    }
}
