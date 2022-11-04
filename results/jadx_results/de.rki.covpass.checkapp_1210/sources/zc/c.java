package zc;

import hc.t;
import xc.z0;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a */
        public static final a f26603a = new a();

        private a() {
        }

        @Override // zc.c
        public boolean d(xc.e eVar, z0 z0Var) {
            t.e(eVar, "classDescriptor");
            t.e(z0Var, "functionDescriptor");
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a */
        public static final b f26604a = new b();

        private b() {
        }

        @Override // zc.c
        public boolean d(xc.e eVar, z0 z0Var) {
            t.e(eVar, "classDescriptor");
            t.e(z0Var, "functionDescriptor");
            return !z0Var.j().B(d.a());
        }
    }

    boolean d(xc.e eVar, z0 z0Var);
}
