package be;

import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.List;
import ne.f;
import ne.n;
import oe.c0;
import oe.e0;
import oe.g1;
import oe.h0;
import oe.i1;
import oe.j1;
import oe.q;
import oe.r1;
import tb.r;
import ub.m;
import xc.f1;
import xc.h;
/* loaded from: classes3.dex */
public final class d {

    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.a<e0> {

        /* renamed from: c */
        final /* synthetic */ g1 f5982c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g1 g1Var) {
            super(0);
            this.f5982c = g1Var;
        }

        /* renamed from: b */
        public final e0 invoke() {
            e0 type = this.f5982c.getType();
            t.d(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends q {

        /* renamed from: c */
        final /* synthetic */ boolean f5983c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j1 j1Var, boolean z10) {
            super(j1Var);
            this.f5983c = z10;
        }

        @Override // oe.j1
        public boolean b() {
            return this.f5983c;
        }

        @Override // oe.q, oe.j1
        public g1 e(e0 e0Var) {
            t.e(e0Var, "key");
            g1 e10 = super.e(e0Var);
            f1 f1Var = null;
            if (e10 != null) {
                h z10 = e0Var.W0().z();
                if (z10 instanceof f1) {
                    f1Var = (f1) z10;
                }
                return d.b(e10, f1Var);
            }
            return null;
        }
    }

    public static final g1 b(g1 g1Var, f1 f1Var) {
        if (f1Var == null || g1Var.b() == r1.INVARIANT) {
            return g1Var;
        }
        if (f1Var.w() != g1Var.b()) {
            return new i1(c(g1Var));
        }
        if (!g1Var.c()) {
            return new i1(g1Var.getType());
        }
        n nVar = f.f16977e;
        t.d(nVar, "NO_LOCKS");
        return new i1(new h0(nVar, new a(g1Var)));
    }

    public static final e0 c(g1 g1Var) {
        t.e(g1Var, "typeProjection");
        return new be.a(g1Var, null, false, null, 14, null);
    }

    public static final boolean d(e0 e0Var) {
        t.e(e0Var, "<this>");
        return e0Var.W0() instanceof be.b;
    }

    public static final j1 e(j1 j1Var, boolean z10) {
        List<r> w02;
        int s10;
        t.e(j1Var, "<this>");
        if (j1Var instanceof c0) {
            c0 c0Var = (c0) j1Var;
            f1[] j10 = c0Var.j();
            w02 = m.w0(c0Var.i(), c0Var.j());
            s10 = ub.v.s(w02, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (r rVar : w02) {
                arrayList.add(b((g1) rVar.e(), (f1) rVar.f()));
            }
            Object[] array = arrayList.toArray(new g1[0]);
            t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new c0(j10, (g1[]) array, z10);
        }
        return new b(j1Var, z10);
    }

    public static /* synthetic */ j1 f(j1 j1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return e(j1Var, z10);
    }
}
