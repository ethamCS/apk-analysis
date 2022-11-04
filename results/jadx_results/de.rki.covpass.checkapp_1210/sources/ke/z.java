package ke;

import kotlin.jvm.internal.DefaultConstructorMarker;
import rd.c;
import xc.a1;
/* loaded from: classes3.dex */
public abstract class z {

    /* renamed from: a */
    private final td.c f15137a;

    /* renamed from: b */
    private final td.g f15138b;

    /* renamed from: c */
    private final a1 f15139c;

    /* loaded from: classes3.dex */
    public static final class a extends z {

        /* renamed from: d */
        private final rd.c f15140d;

        /* renamed from: e */
        private final a f15141e;

        /* renamed from: f */
        private final wd.b f15142f;

        /* renamed from: g */
        private final c.EnumC0343c f15143g;

        /* renamed from: h */
        private final boolean f15144h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rd.c cVar, td.c cVar2, td.g gVar, a1 a1Var, a aVar) {
            super(cVar2, gVar, a1Var, null);
            hc.t.e(cVar, "classProto");
            hc.t.e(cVar2, "nameResolver");
            hc.t.e(gVar, "typeTable");
            this.f15140d = cVar;
            this.f15141e = aVar;
            this.f15142f = x.a(cVar2, cVar.g1());
            c.EnumC0343c d10 = td.b.f22197f.d(cVar.f1());
            this.f15143g = d10 == null ? c.EnumC0343c.CLASS : d10;
            Boolean d11 = td.b.f22198g.d(cVar.f1());
            hc.t.d(d11, "IS_INNER.get(classProto.flags)");
            this.f15144h = d11.booleanValue();
        }

        @Override // ke.z
        public wd.c a() {
            wd.c b10 = this.f15142f.b();
            hc.t.d(b10, "classId.asSingleFqName()");
            return b10;
        }

        public final wd.b e() {
            return this.f15142f;
        }

        public final rd.c f() {
            return this.f15140d;
        }

        public final c.EnumC0343c g() {
            return this.f15143g;
        }

        public final a h() {
            return this.f15141e;
        }

        public final boolean i() {
            return this.f15144h;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends z {

        /* renamed from: d */
        private final wd.c f15145d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wd.c cVar, td.c cVar2, td.g gVar, a1 a1Var) {
            super(cVar2, gVar, a1Var, null);
            hc.t.e(cVar, "fqName");
            hc.t.e(cVar2, "nameResolver");
            hc.t.e(gVar, "typeTable");
            this.f15145d = cVar;
        }

        @Override // ke.z
        public wd.c a() {
            return this.f15145d;
        }
    }

    private z(td.c cVar, td.g gVar, a1 a1Var) {
        this.f15137a = cVar;
        this.f15138b = gVar;
        this.f15139c = a1Var;
    }

    public /* synthetic */ z(td.c cVar, td.g gVar, a1 a1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, gVar, a1Var);
    }

    public abstract wd.c a();

    public final td.c b() {
        return this.f15137a;
    }

    public final a1 c() {
        return this.f15139c;
    }

    public final td.g d() {
        return this.f15138b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
