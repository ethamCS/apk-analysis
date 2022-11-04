package gd;

import hc.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public final class w {
    public static final b Companion = new b(null);

    /* renamed from: d */
    private static final w f10757d = new w(u.b(null, 1, null), a.Y3);

    /* renamed from: a */
    private final y f10758a;

    /* renamed from: b */
    private final gc.l<wd.c, f0> f10759b;

    /* renamed from: c */
    private final boolean f10760c;

    /* loaded from: classes.dex */
    /* synthetic */ class a extends hc.p implements gc.l<wd.c, f0> {
        public static final a Y3 = new a();

        a() {
            super(1);
        }

        @Override // hc.h
        public final oc.f e0() {
            return k0.d(u.class, "compiler.common.jvm");
        }

        @Override // hc.h
        public final String g0() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        /* renamed from: i0 */
        public final f0 invoke(wd.c cVar) {
            hc.t.e(cVar, "p0");
            return u.d(cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a() {
            return w.f10757d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(y yVar, gc.l<? super wd.c, ? extends f0> lVar) {
        hc.t.e(yVar, "jsr305");
        hc.t.e(lVar, "getReportLevelForAnnotation");
        this.f10758a = yVar;
        this.f10759b = lVar;
        this.f10760c = yVar.d() || lVar.invoke(u.e()) == f0.IGNORE;
    }

    public final boolean b() {
        return this.f10760c;
    }

    public final gc.l<wd.c, f0> c() {
        return this.f10759b;
    }

    public final y d() {
        return this.f10758a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f10758a + ", getReportLevelForAnnotation=" + this.f10759b + ')';
    }
}
