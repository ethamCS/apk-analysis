package ce;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.a1;
import oe.e0;
import oe.f0;
import oe.g0;
import oe.g1;
import oe.i1;
import oe.m0;
import oe.r1;
import ub.c0;
import uc.k;
import xc.f1;
import xc.h0;
/* loaded from: classes3.dex */
public final class q extends g<b> {
    public static final a Companion = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g<?> a(e0 e0Var) {
            Object s02;
            hc.t.e(e0Var, "argumentType");
            if (g0.a(e0Var)) {
                return null;
            }
            e0 e0Var2 = e0Var;
            int i10 = 0;
            while (uc.h.c0(e0Var2)) {
                s02 = c0.s0(e0Var2.U0());
                e0Var2 = ((g1) s02).getType();
                hc.t.d(e0Var2, "type.arguments.single().type");
                i10++;
            }
            xc.h z10 = e0Var2.W0().z();
            if (z10 instanceof xc.e) {
                wd.b g10 = ee.a.g(z10);
                return g10 == null ? new q(new b.a(e0Var)) : new q(g10, i10);
            } else if (!(z10 instanceof f1)) {
                return null;
            } else {
                wd.b m10 = wd.b.m(k.a.f23467b.l());
                hc.t.d(m10, "topLevel(StandardNames.FqNames.any.toSafe())");
                return new q(m10, 0);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {

        /* loaded from: classes3.dex */
        public static final class a extends b {

            /* renamed from: a */
            private final e0 f6470a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e0 e0Var) {
                super(null);
                hc.t.e(e0Var, "type");
                this.f6470a = e0Var;
            }

            public final e0 a() {
                return this.f6470a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && hc.t.a(this.f6470a, ((a) obj).f6470a);
            }

            public int hashCode() {
                return this.f6470a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f6470a + ')';
            }
        }

        /* renamed from: ce.q$b$b */
        /* loaded from: classes3.dex */
        public static final class C0091b extends b {

            /* renamed from: a */
            private final f f6471a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0091b(f fVar) {
                super(null);
                hc.t.e(fVar, "value");
                this.f6471a = fVar;
            }

            public final int a() {
                return this.f6471a.c();
            }

            public final wd.b b() {
                return this.f6471a.d();
            }

            public final f c() {
                return this.f6471a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0091b) && hc.t.a(this.f6471a, ((C0091b) obj).f6471a);
            }

            public int hashCode() {
                return this.f6471a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f6471a + ')';
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(f fVar) {
        this(new b.C0091b(fVar));
        hc.t.e(fVar, "value");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b bVar) {
        super(bVar);
        hc.t.e(bVar, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(wd.b bVar, int i10) {
        this(new f(bVar, i10));
        hc.t.e(bVar, "classId");
    }

    @Override // ce.g
    public e0 a(h0 h0Var) {
        List d10;
        hc.t.e(h0Var, "module");
        a1 h10 = a1.Companion.h();
        xc.e E = h0Var.x().E();
        hc.t.d(E, "module.builtIns.kClass");
        d10 = ub.t.d(new i1(c(h0Var)));
        return f0.g(h10, E, d10);
    }

    public final e0 c(h0 h0Var) {
        hc.t.e(h0Var, "module");
        b b10 = b();
        if (b10 instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(b10 instanceof b.C0091b)) {
            throw new tb.p();
        }
        f c10 = ((b.C0091b) b()).c();
        wd.b a10 = c10.a();
        int b11 = c10.b();
        xc.e a11 = xc.x.a(h0Var, a10);
        if (a11 == null) {
            qe.j jVar = qe.j.UNRESOLVED_KCLASS_CONSTANT_VALUE;
            String bVar = a10.toString();
            hc.t.d(bVar, "classId.toString()");
            return qe.k.d(jVar, bVar, String.valueOf(b11));
        }
        m0 u10 = a11.u();
        hc.t.d(u10, "descriptor.defaultType");
        e0 w9 = te.a.w(u10);
        for (int i10 = 0; i10 < b11; i10++) {
            w9 = h0Var.x().l(r1.INVARIANT, w9);
            hc.t.d(w9, "module.builtIns.getArray…Variance.INVARIANT, type)");
        }
        return w9;
    }
}
