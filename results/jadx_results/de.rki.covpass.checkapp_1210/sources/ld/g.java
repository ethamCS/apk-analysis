package ld;

import gc.l;
import hc.t;
import hc.v;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.e0;
import oe.f1;
import oe.g1;
import oe.l1;
import oe.m0;
import oe.r1;
import qe.h;
import qe.j;
import qe.k;
import tb.m;
import tb.r;
import tb.x;
import ub.c0;
import ub.p0;
import ub.x0;
import xc.f1;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final ne.f f15949a;

    /* renamed from: b */
    private final Lazy f15950b;

    /* renamed from: c */
    private final e f15951c;

    /* renamed from: d */
    private final ne.g<a, e0> f15952d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final f1 f15953a;

        /* renamed from: b */
        private final boolean f15954b;

        /* renamed from: c */
        private final ld.a f15955c;

        public a(f1 f1Var, boolean z10, ld.a aVar) {
            t.e(f1Var, "typeParameter");
            t.e(aVar, "typeAttr");
            this.f15953a = f1Var;
            this.f15954b = z10;
            this.f15955c = aVar;
        }

        public final ld.a a() {
            return this.f15955c;
        }

        public final f1 b() {
            return this.f15953a;
        }

        public final boolean c() {
            return this.f15954b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.a(aVar.f15953a, this.f15953a) && aVar.f15954b == this.f15954b && aVar.f15955c.d() == this.f15955c.d() && aVar.f15955c.e() == this.f15955c.e() && aVar.f15955c.g() == this.f15955c.g() && t.a(aVar.f15955c.c(), this.f15955c.c());
        }

        public int hashCode() {
            int hashCode = this.f15953a.hashCode();
            int i10 = hashCode + (hashCode * 31) + (this.f15954b ? 1 : 0);
            int hashCode2 = i10 + (i10 * 31) + this.f15955c.d().hashCode();
            int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f15955c.e().hashCode();
            int i11 = hashCode3 + (hashCode3 * 31) + (this.f15955c.g() ? 1 : 0);
            int i12 = i11 * 31;
            m0 c10 = this.f15955c.c();
            return i11 + i12 + (c10 != null ? c10.hashCode() : 0);
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f15953a + ", isRaw=" + this.f15954b + ", typeAttr=" + this.f15955c + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<h> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            g.this = r1;
        }

        /* renamed from: b */
        public final h invoke() {
            return k.d(j.CANNOT_COMPUTE_ERASED_BOUND, g.this.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends v implements l<a, e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            g.this = r1;
        }

        /* renamed from: b */
        public final e0 invoke(a aVar) {
            return g.this.d(aVar.b(), aVar.c(), aVar.a());
        }
    }

    public g(e eVar) {
        Lazy a10;
        ne.f fVar = new ne.f("Type parameter upper bound erasion results");
        this.f15949a = fVar;
        a10 = m.a(new b());
        this.f15950b = a10;
        this.f15951c = eVar == null ? new e(this) : eVar;
        ne.g<a, e0> b10 = fVar.b(new c());
        t.d(b10, "storage.createMemoizedFu… isRaw, typeAttr) }\n    }");
        this.f15952d = b10;
    }

    public /* synthetic */ g(e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : eVar);
    }

    private final e0 b(ld.a aVar) {
        e0 w9;
        m0 c10 = aVar.c();
        return (c10 == null || (w9 = te.a.w(c10)) == null) ? e() : w9;
    }

    public final e0 d(f1 f1Var, boolean z10, ld.a aVar) {
        int s10;
        int d10;
        int b10;
        Object V;
        Object V2;
        String str;
        g1 g1Var;
        Set<f1> f10 = aVar.f();
        if (f10 == null || !f10.contains(f1Var.a())) {
            m0 u10 = f1Var.u();
            t.d(u10, "typeParameter.defaultType");
            Set<f1> f11 = te.a.f(u10, f10);
            s10 = ub.v.s(f11, 10);
            d10 = p0.d(s10);
            b10 = nc.m.b(d10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
            for (f1 f1Var2 : f11) {
                if (f10 == null || !f10.contains(f1Var2)) {
                    e eVar = this.f15951c;
                    ld.a i10 = z10 ? aVar : aVar.i(ld.b.INFLEXIBLE);
                    e0 c10 = c(f1Var2, z10, aVar.j(f1Var));
                    t.d(c10, "getErasedUpperBound(it, …Parameter(typeParameter))");
                    g1Var = eVar.j(f1Var2, i10, c10);
                } else {
                    g1Var = d.b(f1Var2, aVar);
                }
                r a10 = x.a(f1Var2.r(), g1Var);
                linkedHashMap.put(a10.e(), a10.f());
            }
            l1 g10 = l1.g(f1.a.e(oe.f1.Companion, linkedHashMap, false, 2, null));
            t.d(g10, "create(TypeConstructorSu…rsMap(erasedUpperBounds))");
            List<e0> upperBounds = f1Var.getUpperBounds();
            t.d(upperBounds, "typeParameter.upperBounds");
            V = c0.V(upperBounds);
            e0 e0Var = (e0) V;
            if (e0Var.W0().z() instanceof xc.e) {
                str = "firstUpperBound";
            } else {
                Set<xc.f1> f12 = aVar.f();
                if (f12 == null) {
                    f12 = x0.a(this);
                }
                xc.h z11 = e0Var.W0().z();
                while (true) {
                    t.c(z11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                    xc.f1 f1Var3 = (xc.f1) z11;
                    if (f12.contains(f1Var3)) {
                        return b(aVar);
                    }
                    List<e0> upperBounds2 = f1Var3.getUpperBounds();
                    t.d(upperBounds2, "current.upperBounds");
                    V2 = c0.V(upperBounds2);
                    e0Var = (e0) V2;
                    if (e0Var.W0().z() instanceof xc.e) {
                        str = "nextUpperBound";
                        break;
                    }
                    z11 = e0Var.W0().z();
                }
            }
            t.d(e0Var, str);
            return te.a.v(e0Var, g10, linkedHashMap, r1.OUT_VARIANCE, aVar.f());
        }
        return b(aVar);
    }

    private final h e() {
        return (h) this.f15950b.getValue();
    }

    public final e0 c(xc.f1 f1Var, boolean z10, ld.a aVar) {
        t.e(f1Var, "typeParameter");
        t.e(aVar, "typeAttr");
        return this.f15952d.invoke(new a(f1Var, z10, aVar));
    }
}
