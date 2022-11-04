package tc;

import gd.a0;
import gd.z;
import hc.g0;
import hc.t;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pd.q;
import ub.u;
import wd.b;
import wd.c;
import xc.a1;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f22183a = new a();

    /* renamed from: b */
    private static final Set<b> f22184b;

    /* renamed from: c */
    private static final b f22185c;

    /* renamed from: tc.a$a */
    /* loaded from: classes.dex */
    public static final class C0390a implements q.c {

        /* renamed from: a */
        final /* synthetic */ g0 f22186a;

        C0390a(g0 g0Var) {
            this.f22186a = g0Var;
        }

        @Override // pd.q.c
        public void a() {
        }

        @Override // pd.q.c
        public q.a c(b bVar, a1 a1Var) {
            t.e(bVar, "classId");
            t.e(a1Var, "source");
            if (t.a(bVar, z.f10768a.a())) {
                this.f22186a.f11754c = true;
                return null;
            }
            return null;
        }
    }

    static {
        List<c> k10;
        k10 = u.k(a0.f10632a, a0.f10642k, a0.f10643l, a0.f10635d, a0.f10637f, a0.f10640i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c cVar : k10) {
            linkedHashSet.add(b.m(cVar));
        }
        f22184b = linkedHashSet;
        b m10 = b.m(a0.f10641j);
        t.d(m10, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        f22185c = m10;
    }

    private a() {
    }

    public final b a() {
        return f22185c;
    }

    public final Set<b> b() {
        return f22184b;
    }

    public final boolean c(q qVar) {
        t.e(qVar, "klass");
        g0 g0Var = new g0();
        qVar.d(new C0390a(g0Var), null);
        return g0Var.f11754c;
    }
}
