package gd;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.q0;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a */
    private final f0 f10762a;

    /* renamed from: b */
    private final f0 f10763b;

    /* renamed from: c */
    private final Map<wd.c, f0> f10764c;

    /* renamed from: d */
    private final Lazy f10765d;

    /* renamed from: e */
    private final boolean f10766e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<String[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            y.this = r1;
        }

        /* renamed from: b */
        public final String[] invoke() {
            List c10;
            List a10;
            y yVar = y.this;
            c10 = ub.t.c();
            c10.add(yVar.a().g());
            f0 b10 = yVar.b();
            if (b10 != null) {
                c10.add("under-migration:" + b10.g());
            }
            for (Map.Entry<wd.c, f0> entry : yVar.c().entrySet()) {
                c10.add('@' + entry.getKey() + ':' + entry.getValue().g());
            }
            a10 = ub.t.a(c10);
            Object[] array = a10.toArray(new String[0]);
            hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(f0 f0Var, f0 f0Var2, Map<wd.c, ? extends f0> map) {
        Lazy a10;
        hc.t.e(f0Var, "globalLevel");
        hc.t.e(map, "userDefinedLevelForSpecificAnnotation");
        this.f10762a = f0Var;
        this.f10763b = f0Var2;
        this.f10764c = map;
        a10 = tb.m.a(new a());
        this.f10765d = a10;
        f0 f0Var3 = f0.IGNORE;
        this.f10766e = f0Var == f0Var3 && f0Var2 == f0Var3 && map.isEmpty();
    }

    public /* synthetic */ y(f0 f0Var, f0 f0Var2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f0Var, (i10 & 2) != 0 ? null : f0Var2, (i10 & 4) != 0 ? q0.h() : map);
    }

    public final f0 a() {
        return this.f10762a;
    }

    public final f0 b() {
        return this.f10763b;
    }

    public final Map<wd.c, f0> c() {
        return this.f10764c;
    }

    public final boolean d() {
        return this.f10766e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f10762a == yVar.f10762a && this.f10763b == yVar.f10763b && hc.t.a(this.f10764c, yVar.f10764c);
    }

    public int hashCode() {
        int hashCode = this.f10762a.hashCode() * 31;
        f0 f0Var = this.f10763b;
        return ((hashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31) + this.f10764c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f10762a + ", migrationLevel=" + this.f10763b + ", userDefinedLevelForSpecificAnnotation=" + this.f10764c + ')';
    }
}
