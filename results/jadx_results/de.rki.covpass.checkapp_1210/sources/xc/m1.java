package xc;

import java.util.Map;
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a */
    public static final m1 f25556a = new m1();

    /* renamed from: b */
    private static final Map<n1, Integer> f25557b;

    /* renamed from: c */
    private static final h f25558c;

    /* loaded from: classes.dex */
    public static final class a extends n1 {

        /* renamed from: c */
        public static final a f25559c = new a();

        private a() {
            super("inherited", false);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n1 {

        /* renamed from: c */
        public static final b f25560c = new b();

        private b() {
            super("internal", false);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n1 {

        /* renamed from: c */
        public static final c f25561c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n1 {

        /* renamed from: c */
        public static final d f25562c = new d();

        private d() {
            super("local", false);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends n1 {

        /* renamed from: c */
        public static final e f25563c = new e();

        private e() {
            super("private", false);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends n1 {

        /* renamed from: c */
        public static final f f25564c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // xc.n1
        public String b() {
            return "private/*private to this*/";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends n1 {

        /* renamed from: c */
        public static final g f25565c = new g();

        private g() {
            super("protected", true);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends n1 {

        /* renamed from: c */
        public static final h f25566c = new h();

        private h() {
            super("public", true);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends n1 {

        /* renamed from: c */
        public static final i f25567c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map c10;
        Map<n1, Integer> b10;
        c10 = ub.p0.c();
        c10.put(f.f25564c, 0);
        c10.put(e.f25563c, 0);
        c10.put(b.f25560c, 1);
        c10.put(g.f25565c, 1);
        h hVar = h.f25566c;
        c10.put(hVar, 2);
        b10 = ub.p0.b(c10);
        f25557b = b10;
        f25558c = hVar;
    }

    private m1() {
    }

    public final Integer a(n1 n1Var, n1 n1Var2) {
        hc.t.e(n1Var, "first");
        hc.t.e(n1Var2, "second");
        if (n1Var == n1Var2) {
            return 0;
        }
        Map<n1, Integer> map = f25557b;
        Integer num = map.get(n1Var);
        Integer num2 = map.get(n1Var2);
        if (num != null && num2 != null && !hc.t.a(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    public final boolean b(n1 n1Var) {
        hc.t.e(n1Var, "visibility");
        return n1Var == e.f25563c || n1Var == f.f25564c;
    }
}
