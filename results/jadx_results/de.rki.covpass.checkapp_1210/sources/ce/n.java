package ce;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.a1;
import oe.e0;
import oe.e1;
import oe.f0;
import oe.i1;
import oe.k1;
import oe.m0;
import oe.r1;
import ub.c0;
import xc.f1;
import xc.h0;
/* loaded from: classes3.dex */
public final class n implements e1 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final long f6456a;

    /* renamed from: b */
    private final h0 f6457b;

    /* renamed from: c */
    private final Set<e0> f6458c;

    /* renamed from: d */
    private final m0 f6459d;

    /* renamed from: e */
    private final Lazy f6460e;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: ce.n$a$a */
        /* loaded from: classes3.dex */
        public enum EnumC0090a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* loaded from: classes3.dex */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f6464a;

            static {
                int[] iArr = new int[EnumC0090a.values().length];
                iArr[EnumC0090a.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[EnumC0090a.INTERSECTION_TYPE.ordinal()] = 2;
                f6464a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final m0 a(Collection<? extends m0> collection, EnumC0090a enumC0090a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                a aVar = n.Companion;
                next = aVar.e((m0) next, (m0) it.next(), enumC0090a);
            }
            return (m0) next;
        }

        private final m0 c(n nVar, n nVar2, EnumC0090a enumC0090a) {
            Set set;
            int i10 = b.f6464a[enumC0090a.ordinal()];
            if (i10 == 1) {
                set = c0.a0(nVar.h(), nVar2.h());
            } else if (i10 != 2) {
                throw new tb.p();
            } else {
                set = c0.K0(nVar.h(), nVar2.h());
            }
            return f0.e(a1.Companion.h(), new n(nVar.f6456a, nVar.f6457b, set, null), false);
        }

        private final m0 d(n nVar, m0 m0Var) {
            if (nVar.h().contains(m0Var)) {
                return m0Var;
            }
            return null;
        }

        private final m0 e(m0 m0Var, m0 m0Var2, EnumC0090a enumC0090a) {
            if (m0Var == null || m0Var2 == null) {
                return null;
            }
            e1 W0 = m0Var.W0();
            e1 W02 = m0Var2.W0();
            boolean z10 = W0 instanceof n;
            if (z10 && (W02 instanceof n)) {
                return c((n) W0, (n) W02, enumC0090a);
            }
            if (z10) {
                return d((n) W0, m0Var2);
            }
            if (!(W02 instanceof n)) {
                return null;
            }
            return d((n) W02, m0Var);
        }

        public final m0 b(Collection<? extends m0> collection) {
            hc.t.e(collection, "types");
            return a(collection, EnumC0090a.INTERSECTION_TYPE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.a<List<m0>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            n.this = r1;
        }

        @Override // gc.a
        public final List<m0> invoke() {
            List d10;
            List<m0> n10;
            m0 u10 = n.this.x().x().u();
            hc.t.d(u10, "builtIns.comparable.defaultType");
            d10 = ub.t.d(new i1(r1.IN_VARIANCE, n.this.f6459d));
            n10 = ub.u.n(k1.f(u10, d10, null, 2, null));
            if (!n.this.j()) {
                n10.add(n.this.x().L());
            }
            return n10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends hc.v implements gc.l<e0, CharSequence> {

        /* renamed from: c */
        public static final c f6466c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(e0 e0Var) {
            hc.t.e(e0Var, "it");
            return e0Var.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n(long j10, h0 h0Var, Set<? extends e0> set) {
        Lazy a10;
        this.f6459d = f0.e(a1.Companion.h(), this, false);
        a10 = tb.m.a(new b());
        this.f6460e = a10;
        this.f6456a = j10;
        this.f6457b = h0Var;
        this.f6458c = set;
    }

    public /* synthetic */ n(long j10, h0 h0Var, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, h0Var, set);
    }

    private final List<e0> i() {
        return (List) this.f6460e.getValue();
    }

    public final boolean j() {
        Collection<e0> a10 = t.a(this.f6457b);
        if (!(a10 instanceof Collection) || !a10.isEmpty()) {
            for (e0 e0Var : a10) {
                if (!(!this.f6458c.contains(e0Var))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private final String k() {
        String e02;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        e02 = c0.e0(this.f6458c, ",", null, null, 0, null, c.f6466c, 30, null);
        sb2.append(e02);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // oe.e1
    public e1 a(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // oe.e1
    public List<f1> getParameters() {
        List<f1> h10;
        h10 = ub.u.h();
        return h10;
    }

    public final Set<e0> h() {
        return this.f6458c;
    }

    @Override // oe.e1
    public Collection<e0> l() {
        return i();
    }

    public String toString() {
        return "IntegerLiteralType" + k();
    }

    @Override // oe.e1
    public uc.h x() {
        return this.f6457b.x();
    }

    @Override // oe.e1
    public boolean y() {
        return false;
    }

    @Override // oe.e1
    public xc.h z() {
        return null;
    }
}
