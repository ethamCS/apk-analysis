package pd;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public abstract class l {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final d f19118a = new d(fe.e.BOOLEAN);

    /* renamed from: b */
    private static final d f19119b = new d(fe.e.CHAR);

    /* renamed from: c */
    private static final d f19120c = new d(fe.e.BYTE);

    /* renamed from: d */
    private static final d f19121d = new d(fe.e.SHORT);

    /* renamed from: e */
    private static final d f19122e = new d(fe.e.INT);

    /* renamed from: f */
    private static final d f19123f = new d(fe.e.FLOAT);

    /* renamed from: g */
    private static final d f19124g = new d(fe.e.LONG);

    /* renamed from: h */
    private static final d f19125h = new d(fe.e.DOUBLE);

    /* loaded from: classes.dex */
    public static final class a extends l {

        /* renamed from: i */
        private final l f19126i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar) {
            super(null);
            hc.t.e(lVar, "elementType");
            this.f19126i = lVar;
        }

        public final l i() {
            return this.f19126i;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return l.f19118a;
        }

        public final d b() {
            return l.f19120c;
        }

        public final d c() {
            return l.f19119b;
        }

        public final d d() {
            return l.f19125h;
        }

        public final d e() {
            return l.f19123f;
        }

        public final d f() {
            return l.f19122e;
        }

        public final d g() {
            return l.f19124g;
        }

        public final d h() {
            return l.f19121d;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l {

        /* renamed from: i */
        private final String f19127i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            hc.t.e(str, "internalName");
            this.f19127i = str;
        }

        public final String i() {
            return this.f19127i;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l {

        /* renamed from: i */
        private final fe.e f19128i;

        public d(fe.e eVar) {
            super(null);
            this.f19128i = eVar;
        }

        public final fe.e i() {
            return this.f19128i;
        }
    }

    private l() {
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return n.f19129a.c(this);
    }
}
