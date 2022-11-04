package me;

import hc.v;
import java.util.ArrayList;
import java.util.List;
import ke.d0;
import oe.e0;
import rd.q;
import rd.s;
import ub.c0;
import ub.t;
/* loaded from: classes3.dex */
public final class m extends ad.b {
    private final ke.m Z3;

    /* renamed from: a4 */
    private final s f16584a4;

    /* renamed from: b4 */
    private final me.a f16585b4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.a<List<? extends yc.c>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            m.this = r1;
        }

        @Override // gc.a
        public final List<? extends yc.c> invoke() {
            List<? extends yc.c> F0;
            F0 = c0.F0(m.this.Z3.c().d().i(m.this.X0(), m.this.Z3.g()));
            return F0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(ke.m r12, rd.s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            hc.t.e(r12, r0)
            java.lang.String r0 = "proto"
            hc.t.e(r13, r0)
            ne.n r2 = r12.h()
            xc.m r3 = r12.e()
            yc.g$a r0 = yc.g.Companion
            yc.g r4 = r0.b()
            td.c r0 = r12.g()
            int r1 = r13.p0()
            wd.f r5 = ke.x.b(r0, r1)
            ke.a0 r0 = ke.a0.f15009a
            rd.s$c r1 = r13.v0()
            java.lang.String r6 = "proto.variance"
            hc.t.d(r1, r6)
            oe.r1 r6 = r0.d(r1)
            boolean r7 = r13.q0()
            xc.a1 r9 = xc.a1.f25519a
            xc.d1$a r10 = xc.d1.a.f25530a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.Z3 = r12
            r11.f16584a4 = r13
            me.a r13 = new me.a
            ne.n r12 = r12.h()
            me.m$a r14 = new me.m$a
            r14.<init>()
            r13.<init>(r12, r14)
            r11.f16585b4 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.m.<init>(ke.m, rd.s, int):void");
    }

    @Override // ad.e
    protected List<e0> U0() {
        int s10;
        List<e0> d10;
        List<q> p10 = td.f.p(this.f16584a4, this.Z3.j());
        if (p10.isEmpty()) {
            d10 = t.d(ee.a.f(this).y());
            return d10;
        }
        d0 i10 = this.Z3.i();
        s10 = ub.v.s(p10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (q qVar : p10) {
            arrayList.add(i10.q(qVar));
        }
        return arrayList;
    }

    /* renamed from: W0 */
    public me.a j() {
        return this.f16585b4;
    }

    public final s X0() {
        return this.f16584a4;
    }

    /* renamed from: Y0 */
    public Void T0(e0 e0Var) {
        hc.t.e(e0Var, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
