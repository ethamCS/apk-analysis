package oe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public abstract class f1 extends j1 {
    public static final a Companion = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: oe.f1$a$a */
        /* loaded from: classes3.dex */
        public static final class C0281a extends f1 {

            /* renamed from: b */
            final /* synthetic */ Map<e1, g1> f17979b;

            /* renamed from: c */
            final /* synthetic */ boolean f17980c;

            /* JADX WARN: Multi-variable type inference failed */
            C0281a(Map<e1, ? extends g1> map, boolean z10) {
                this.f17979b = map;
                this.f17980c = z10;
            }

            @Override // oe.j1
            public boolean a() {
                return this.f17980c;
            }

            @Override // oe.j1
            public boolean f() {
                return this.f17979b.isEmpty();
            }

            @Override // oe.f1
            public g1 k(e1 e1Var) {
                hc.t.e(e1Var, "key");
                return this.f17979b.get(e1Var);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ f1 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        @fc.c
        public final j1 a(e0 e0Var) {
            hc.t.e(e0Var, "kotlinType");
            return b(e0Var.W0(), e0Var.U0());
        }

        @fc.c
        public final j1 b(e1 e1Var, List<? extends g1> list) {
            Object i02;
            int s10;
            List M0;
            Map q10;
            hc.t.e(e1Var, "typeConstructor");
            hc.t.e(list, "arguments");
            List<xc.f1> parameters = e1Var.getParameters();
            hc.t.d(parameters, "typeConstructor.parameters");
            i02 = ub.c0.i0(parameters);
            xc.f1 f1Var = (xc.f1) i02;
            boolean z10 = true;
            if (f1Var == null || !f1Var.Y()) {
                z10 = false;
            }
            if (z10) {
                List<xc.f1> parameters2 = e1Var.getParameters();
                hc.t.d(parameters2, "typeConstructor.parameters");
                s10 = ub.v.s(parameters2, 10);
                ArrayList arrayList = new ArrayList(s10);
                for (xc.f1 f1Var2 : parameters2) {
                    arrayList.add(f1Var2.r());
                }
                M0 = ub.c0.M0(arrayList, list);
                q10 = ub.q0.q(M0);
                return e(this, q10, false, 2, null);
            }
            return new c0(parameters, list);
        }

        @fc.c
        public final f1 c(Map<e1, ? extends g1> map) {
            hc.t.e(map, "map");
            return e(this, map, false, 2, null);
        }

        @fc.c
        public final f1 d(Map<e1, ? extends g1> map, boolean z10) {
            hc.t.e(map, "map");
            return new C0281a(map, z10);
        }
    }

    @fc.c
    public static final j1 i(e1 e1Var, List<? extends g1> list) {
        return Companion.b(e1Var, list);
    }

    @fc.c
    public static final f1 j(Map<e1, ? extends g1> map) {
        return Companion.c(map);
    }

    @Override // oe.j1
    public g1 e(e0 e0Var) {
        hc.t.e(e0Var, "key");
        return k(e0Var.W0());
    }

    public abstract g1 k(e1 e1Var);
}
