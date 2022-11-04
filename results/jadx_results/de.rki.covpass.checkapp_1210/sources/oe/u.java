package oe;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public final class u extends j1 {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private final j1 f18047b;

    /* renamed from: c */
    private final j1 f18048c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final j1 a(j1 j1Var, j1 j1Var2) {
            hc.t.e(j1Var, "first");
            hc.t.e(j1Var2, "second");
            return j1Var.f() ? j1Var2 : j1Var2.f() ? j1Var : new u(j1Var, j1Var2, null);
        }
    }

    private u(j1 j1Var, j1 j1Var2) {
        this.f18047b = j1Var;
        this.f18048c = j1Var2;
    }

    public /* synthetic */ u(j1 j1Var, j1 j1Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j1Var, j1Var2);
    }

    @fc.c
    public static final j1 i(j1 j1Var, j1 j1Var2) {
        return Companion.a(j1Var, j1Var2);
    }

    @Override // oe.j1
    public boolean a() {
        return this.f18047b.a() || this.f18048c.a();
    }

    @Override // oe.j1
    public boolean b() {
        return this.f18047b.b() || this.f18048c.b();
    }

    @Override // oe.j1
    public yc.g d(yc.g gVar) {
        hc.t.e(gVar, "annotations");
        return this.f18048c.d(this.f18047b.d(gVar));
    }

    @Override // oe.j1
    public g1 e(e0 e0Var) {
        hc.t.e(e0Var, "key");
        g1 e10 = this.f18047b.e(e0Var);
        return e10 == null ? this.f18048c.e(e0Var) : e10;
    }

    @Override // oe.j1
    public boolean f() {
        return false;
    }

    @Override // oe.j1
    public e0 g(e0 e0Var, r1 r1Var) {
        hc.t.e(e0Var, "topLevelType");
        hc.t.e(r1Var, "position");
        return this.f18048c.g(this.f18047b.g(e0Var, r1Var), r1Var);
    }
}
