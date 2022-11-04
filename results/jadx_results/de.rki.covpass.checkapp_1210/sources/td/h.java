package td;

import hc.t;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rd.v;
import rd.w;
import ub.u;
/* loaded from: classes.dex */
public final class h {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static final h f22225b;

    /* renamed from: a */
    private final List<v> f22226a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(w wVar) {
            t.e(wVar, "table");
            if (wVar.M() == 0) {
                return b();
            }
            List<v> N = wVar.N();
            t.d(N, "table.requirementList");
            return new h(N, null);
        }

        public final h b() {
            return h.f22225b;
        }
    }

    static {
        List h10;
        h10 = u.h();
        f22225b = new h(h10);
    }

    private h(List<v> list) {
        this.f22226a = list;
    }

    public /* synthetic */ h(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
