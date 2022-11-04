package gd;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public final class v {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final v f10753d = new v(f0.STRICT, null, null, 6, null);

    /* renamed from: a */
    private final f0 f10754a;

    /* renamed from: b */
    private final tb.j f10755b;

    /* renamed from: c */
    private final f0 f10756c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a() {
            return v.f10753d;
        }
    }

    public v(f0 f0Var, tb.j jVar, f0 f0Var2) {
        hc.t.e(f0Var, "reportLevelBefore");
        hc.t.e(f0Var2, "reportLevelAfter");
        this.f10754a = f0Var;
        this.f10755b = jVar;
        this.f10756c = f0Var2;
    }

    public /* synthetic */ v(f0 f0Var, tb.j jVar, f0 f0Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f0Var, (i10 & 2) != 0 ? new tb.j(1, 0) : jVar, (i10 & 4) != 0 ? f0Var : f0Var2);
    }

    public final f0 b() {
        return this.f10756c;
    }

    public final f0 c() {
        return this.f10754a;
    }

    public final tb.j d() {
        return this.f10755b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f10754a == vVar.f10754a && hc.t.a(this.f10755b, vVar.f10755b) && this.f10756c == vVar.f10756c;
    }

    public int hashCode() {
        int hashCode = this.f10754a.hashCode() * 31;
        tb.j jVar = this.f10755b;
        return ((hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + this.f10756c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f10754a + ", sinceVersion=" + this.f10755b + ", reportLevelAfter=" + this.f10756c + ')';
    }
}
