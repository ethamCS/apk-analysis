package oe;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public abstract class j1 {
    public static final b Companion = new b(null);

    /* renamed from: a */
    public static final j1 f18005a = new a();

    /* loaded from: classes3.dex */
    public static final class a extends j1 {
        a() {
        }

        @Override // oe.j1
        public /* bridge */ /* synthetic */ g1 e(e0 e0Var) {
            return (g1) i(e0Var);
        }

        @Override // oe.j1
        public boolean f() {
            return true;
        }

        public Void i(e0 e0Var) {
            hc.t.e(e0Var, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends j1 {
        c() {
            j1.this = r1;
        }

        @Override // oe.j1
        public boolean a() {
            return false;
        }

        @Override // oe.j1
        public boolean b() {
            return false;
        }

        @Override // oe.j1
        public yc.g d(yc.g gVar) {
            hc.t.e(gVar, "annotations");
            return j1.this.d(gVar);
        }

        @Override // oe.j1
        public g1 e(e0 e0Var) {
            hc.t.e(e0Var, "key");
            return j1.this.e(e0Var);
        }

        @Override // oe.j1
        public boolean f() {
            return j1.this.f();
        }

        @Override // oe.j1
        public e0 g(e0 e0Var, r1 r1Var) {
            hc.t.e(e0Var, "topLevelType");
            hc.t.e(r1Var, "position");
            return j1.this.g(e0Var, r1Var);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final l1 c() {
        l1 g10 = l1.g(this);
        hc.t.d(g10, "create(this)");
        return g10;
    }

    public yc.g d(yc.g gVar) {
        hc.t.e(gVar, "annotations");
        return gVar;
    }

    public abstract g1 e(e0 e0Var);

    public boolean f() {
        return false;
    }

    public e0 g(e0 e0Var, r1 r1Var) {
        hc.t.e(e0Var, "topLevelType");
        hc.t.e(r1Var, "position");
        return e0Var;
    }

    public final j1 h() {
        return new c();
    }
}
