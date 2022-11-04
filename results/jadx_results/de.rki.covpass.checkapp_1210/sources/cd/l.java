package cd;

import dd.p;
import hc.t;
import xc.b1;
/* loaded from: classes.dex */
public final class l implements md.b {

    /* renamed from: a */
    public static final l f6443a = new l();

    /* loaded from: classes.dex */
    public static final class a implements md.a {

        /* renamed from: b */
        private final p f6444b;

        public a(p pVar) {
            t.e(pVar, "javaElement");
            this.f6444b = pVar;
        }

        @Override // xc.a1
        public b1 a() {
            b1 b1Var = b1.f25526a;
            t.d(b1Var, "NO_SOURCE_FILE");
            return b1Var;
        }

        /* renamed from: d */
        public p b() {
            return this.f6444b;
        }

        public String toString() {
            return a.class.getName() + ": " + b();
        }
    }

    private l() {
    }

    @Override // md.b
    public md.a a(nd.l lVar) {
        t.e(lVar, "javaElement");
        return new a((p) lVar);
    }
}
