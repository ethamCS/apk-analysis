package ke;
/* loaded from: classes3.dex */
public interface l {

    /* loaded from: classes3.dex */
    public static final class a implements l {

        /* renamed from: a */
        public static final a f15081a = new a();

        private a() {
        }

        @Override // ke.l
        public boolean a() {
            return b.b(this);
        }

        @Override // ke.l
        public boolean b() {
            return b.a(this);
        }

        @Override // ke.l
        public boolean c() {
            return b.e(this);
        }

        @Override // ke.l
        public boolean d() {
            return b.f(this);
        }

        @Override // ke.l
        public boolean e() {
            return b.d(this);
        }

        @Override // ke.l
        public boolean f() {
            return b.c(this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public static boolean a(l lVar) {
            return false;
        }

        public static boolean b(l lVar) {
            return false;
        }

        public static boolean c(l lVar) {
            return false;
        }

        public static boolean d(l lVar) {
            return false;
        }

        public static boolean e(l lVar) {
            return false;
        }

        public static boolean f(l lVar) {
            return true;
        }
    }

    boolean a();

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    boolean f();
}
