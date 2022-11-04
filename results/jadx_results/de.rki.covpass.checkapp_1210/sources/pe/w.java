package pe;

import hc.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.a1;
import oe.b0;
import oe.d0;
import oe.e0;
import oe.m0;
import oe.q0;
import oe.q1;
import oe.u0;
import ub.c0;
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a */
    public static final w f19176a = new w();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a extends Enum<a> {

        /* renamed from: c */
        public static final a f19177c = new c("START", 0);

        /* renamed from: d */
        public static final a f19178d = new C0310a("ACCEPT_NULL", 1);

        /* renamed from: q */
        public static final a f19179q = new d("UNKNOWN", 2);

        /* renamed from: x */
        public static final a f19180x = new b("NOT_NULL", 3);

        /* renamed from: y */
        private static final /* synthetic */ a[] f19181y = b();

        /* renamed from: pe.w$a$a */
        /* loaded from: classes3.dex */
        static final class C0310a extends a {
            C0310a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // pe.w.a
            public a g(q1 q1Var) {
                hc.t.e(q1Var, "nextType");
                return h(q1Var);
            }
        }

        /* loaded from: classes3.dex */
        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            /* renamed from: j */
            public b g(q1 q1Var) {
                hc.t.e(q1Var, "nextType");
                return this;
            }
        }

        /* loaded from: classes3.dex */
        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // pe.w.a
            public a g(q1 q1Var) {
                hc.t.e(q1Var, "nextType");
                return h(q1Var);
            }
        }

        /* loaded from: classes3.dex */
        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // pe.w.a
            public a g(q1 q1Var) {
                hc.t.e(q1Var, "nextType");
                a h10 = h(q1Var);
                return h10 == a.f19178d ? this : h10;
            }
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ a[] b() {
            return new a[]{f19177c, f19178d, f19179q, f19180x};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f19181y.clone();
        }

        public abstract a g(q1 q1Var);

        protected final a h(q1 q1Var) {
            hc.t.e(q1Var, "<this>");
            return q1Var.X0() ? f19178d : ((!(q1Var instanceof oe.p) || !(((oe.p) q1Var).i1() instanceof u0)) && ((q1Var instanceof u0) || !o.f19170a.a(q1Var))) ? f19179q : f19180x;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.a<String> {

        /* renamed from: c */
        final /* synthetic */ Set<m0> f19182c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Set<? extends m0> set) {
            super(0);
            this.f19182c = set;
        }

        /* renamed from: b */
        public final String invoke() {
            String e02;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("This collections cannot be empty! input types: ");
            e02 = c0.e0(this.f19182c, null, null, null, 0, null, null, 63, null);
            sb2.append(e02);
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class c extends hc.p implements gc.p<e0, e0, Boolean> {
        c(Object obj) {
            super(2, obj);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(w.class);
        }

        @Override // hc.h
        public final String g0() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "isStrictSupertype";
        }

        /* renamed from: i0 */
        public final Boolean u(e0 e0Var, e0 e0Var2) {
            hc.t.e(e0Var, "p0");
            hc.t.e(e0Var2, "p1");
            return Boolean.valueOf(((w) this.f11756d).e(e0Var, e0Var2));
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class d extends hc.p implements gc.p<e0, e0, Boolean> {
        d(Object obj) {
            super(2, obj);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.b(m.class);
        }

        @Override // hc.h
        public final String g0() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "equalTypes";
        }

        /* renamed from: i0 */
        public final Boolean u(e0 e0Var, e0 e0Var2) {
            hc.t.e(e0Var, "p0");
            hc.t.e(e0Var2, "p1");
            return Boolean.valueOf(((m) this.f11756d).b(e0Var, e0Var2));
        }
    }

    private w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051 A[EDGE_INSN: B:27:0x0051->B:18:0x0051 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Collection<oe.m0> b(java.util.Collection<? extends oe.m0> r8, gc.p<? super oe.m0, ? super oe.m0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            hc.t.d(r8, r1)
        Le:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r8.next()
            oe.m0 r1 = (oe.m0) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L24
        L22:
            r3 = r4
            goto L51
        L24:
            java.util.Iterator r2 = r0.iterator()
        L28:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L22
            java.lang.Object r5 = r2.next()
            oe.m0 r5 = (oe.m0) r5
            if (r5 == r1) goto L4e
            java.lang.String r6 = "lower"
            hc.t.d(r5, r6)
            java.lang.String r6 = "upper"
            hc.t.d(r1, r6)
            java.lang.Object r5 = r9.u(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            r5 = r3
            goto L4f
        L4e:
            r5 = r4
        L4f:
            if (r5 == 0) goto L28
        L51:
            if (r3 == 0) goto Le
            r8.remove()
            goto Le
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.w.b(java.util.Collection, gc.p):java.util.Collection");
    }

    private final m0 d(Set<? extends m0> set) {
        Object r02;
        Object r03;
        if (set.size() == 1) {
            r03 = c0.r0(set);
            return (m0) r03;
        }
        new b(set);
        Collection<m0> b10 = b(set, new c(this));
        b10.isEmpty();
        m0 b11 = ce.n.Companion.b(b10);
        if (b11 != null) {
            return b11;
        }
        Collection<m0> b12 = b(b10, new d(l.Companion.a()));
        b12.isEmpty();
        if (b12.size() >= 2) {
            return new d0(set).e();
        }
        r02 = c0.r0(b12);
        return (m0) r02;
    }

    public final boolean e(e0 e0Var, e0 e0Var2) {
        m a10 = l.Companion.a();
        return a10.d(e0Var, e0Var2) && !a10.d(e0Var2, e0Var);
    }

    public final m0 c(List<? extends m0> list) {
        int s10;
        int s11;
        hc.t.e(list, "types");
        list.size();
        ArrayList<q1> arrayList = new ArrayList();
        for (m0 m0Var : list) {
            if (m0Var.W0() instanceof d0) {
                Collection<e0> l10 = m0Var.W0().l();
                hc.t.d(l10, "type.constructor.supertypes");
                s11 = ub.v.s(l10, 10);
                ArrayList arrayList2 = new ArrayList(s11);
                for (e0 e0Var : l10) {
                    hc.t.d(e0Var, "it");
                    m0 d10 = b0.d(e0Var);
                    if (m0Var.X0()) {
                        d10 = d10.d1(true);
                    }
                    arrayList2.add(d10);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(m0Var);
            }
        }
        a aVar = a.f19177c;
        for (q1 q1Var : arrayList) {
            aVar = aVar.g(q1Var);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m0 m0Var2 = (m0) it.next();
            if (aVar == a.f19180x) {
                if (m0Var2 instanceof i) {
                    m0Var2 = q0.k((i) m0Var2);
                }
                m0Var2 = q0.i(m0Var2, false, 1, null);
            }
            linkedHashSet.add(m0Var2);
        }
        s10 = ub.v.s(list, 10);
        ArrayList arrayList3 = new ArrayList(s10);
        for (m0 m0Var3 : list) {
            arrayList3.add(m0Var3.V0());
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = ((a1) next).k((a1) it2.next());
            }
            return d(linkedHashSet).e1((a1) next);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
