package cd;

import hc.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.e;
import tb.e0;
import xc.h0;
/* loaded from: classes.dex */
public final class k {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final ke.k f6441a;

    /* renamed from: b */
    private final cd.a f6442b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            t.e(classLoader, "classLoader");
            g gVar = new g(classLoader);
            e.a aVar = pd.e.Companion;
            ClassLoader classLoader2 = e0.class.getClassLoader();
            t.d(classLoader2, "Unit::class.java.classLoader");
            g gVar2 = new g(classLoader2);
            d dVar = new d(classLoader);
            e.a.C0307a a10 = aVar.a(gVar, gVar2, dVar, "runtime module for " + classLoader, j.f6440b, l.f6443a);
            return new k(a10.a().a(), new cd.a(a10.b(), gVar), null);
        }
    }

    private k(ke.k kVar, cd.a aVar) {
        this.f6441a = kVar;
        this.f6442b = aVar;
    }

    public /* synthetic */ k(ke.k kVar, cd.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, aVar);
    }

    public final ke.k a() {
        return this.f6441a;
    }

    public final h0 b() {
        return this.f6441a.p();
    }

    public final cd.a c() {
        return this.f6442b;
    }
}
