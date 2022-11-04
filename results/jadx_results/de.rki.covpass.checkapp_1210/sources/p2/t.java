package p2;
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: b */
    public static final t f18848b = new a();

    /* renamed from: c */
    public static final t f18849c = new b();

    /* renamed from: d */
    public static final t f18850d = new c();

    /* renamed from: e */
    public static final t f18851e = new d();

    /* renamed from: f */
    public static final t f18852f = new e();

    /* renamed from: g */
    public static final t f18853g = new f();

    /* renamed from: h */
    public static final t f18854h = new g();

    /* renamed from: i */
    public static final t f18855i = new h();

    /* renamed from: a */
    int f18856a;

    /* loaded from: classes.dex */
    static class a extends t {
        public a() {
            super(0);
        }

        @Override // p2.t
        public int a(int i10, int i11, int i12) {
            return ((~((i10 + i11) % 2)) & 1) ^ i12;
        }
    }

    /* loaded from: classes.dex */
    static class b extends t {
        public b() {
            super(1);
        }

        @Override // p2.t
        public int a(int i10, int i11, int i12) {
            return ((~(i10 % 2)) & 1) ^ i12;
        }
    }

    /* loaded from: classes.dex */
    static class c extends t {
        public c() {
            super(2);
        }

        @Override // p2.t
        public int a(int i10, int i11, int i12) {
            return (i11 % 3 == 0 ? 1 : 0) ^ i12;
        }
    }

    /* loaded from: classes.dex */
    static class d extends t {
        public d() {
            super(3);
        }

        @Override // p2.t
        public int a(int i10, int i11, int i12) {
            return ((i10 + i11) % 3 == 0 ? 1 : 0) ^ i12;
        }
    }

    /* loaded from: classes.dex */
    static class e extends t {
        public e() {
            super(4);
        }

        @Override // p2.t
        public int a(int i10, int i11, int i12) {
            return ((~(((i10 / 2) + (i11 / 3)) % 2)) & 1) ^ i12;
        }
    }

    /* loaded from: classes.dex */
    static class f extends t {
        public f() {
            super(5);
        }

        @Override // p2.t
        public int a(int i10, int i11, int i12) {
            int i13 = i10 * i11;
            return ((i13 % 2) + (i13 % 3) == 0 ? 1 : 0) ^ i12;
        }
    }

    /* loaded from: classes.dex */
    static class g extends t {
        public g() {
            super(6);
        }

        @Override // p2.t
        public int a(int i10, int i11, int i12) {
            int i13 = i10 * i11;
            return (((i13 % 2) + (i13 % 3)) % 2 == 0 ? 1 : 0) ^ i12;
        }
    }

    /* loaded from: classes.dex */
    static class h extends t {
        public h() {
            super(7);
        }

        @Override // p2.t
        public int a(int i10, int i11, int i12) {
            return ((~((((i10 * i11) % 3) + ((i10 + i11) % 2)) % 2)) & 1) ^ i12;
        }
    }

    protected t(int i10) {
        this.f18856a = i10;
    }

    public static t b(int i10) {
        switch (i10) {
            case 0:
                return f18848b;
            case 1:
                return f18849c;
            case 2:
                return f18850d;
            case 3:
                return f18851e;
            case 4:
                return f18852f;
            case 5:
                return f18853g;
            case 6:
                return f18854h;
            case 7:
                return f18855i;
            default:
                throw new RuntimeException("Unknown mask: " + i10);
        }
    }

    public abstract int a(int i10, int i11, int i12);

    public String toString() {
        return getClass().getSimpleName();
    }
}
