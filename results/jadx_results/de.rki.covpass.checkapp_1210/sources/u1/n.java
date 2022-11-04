package u1;

import android.annotation.SuppressLint;
/* loaded from: classes.dex */
public interface n {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final b.c f22565a = new b.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final b.C0399b f22566b = new b.C0399b();

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a */
            private final Throwable f22567a;

            public a(Throwable th2) {
                this.f22567a = th2;
            }

            public Throwable a() {
                return this.f22567a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f22567a.getMessage());
            }
        }

        /* renamed from: u1.n$b$b */
        /* loaded from: classes.dex */
        public static final class C0399b extends b {
            private C0399b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }
}
