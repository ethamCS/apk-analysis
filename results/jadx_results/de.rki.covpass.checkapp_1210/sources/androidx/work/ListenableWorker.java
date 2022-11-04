package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.UUID;
import java.util.concurrent.Executor;
import u1.v;
/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: c */
    private Context f5280c;

    /* renamed from: d */
    private WorkerParameters f5281d;

    /* renamed from: q */
    private volatile boolean f5282q;

    /* renamed from: x */
    private boolean f5283x;

    /* renamed from: y */
    private boolean f5284y;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        /* loaded from: classes.dex */
        public static final class C0068a extends a {

            /* renamed from: a */
            private final androidx.work.a f5285a;

            public C0068a() {
                this(androidx.work.a.f5302c);
            }

            public C0068a(androidx.work.a aVar) {
                this.f5285a = aVar;
            }

            public androidx.work.a e() {
                return this.f5285a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C0068a.class == obj.getClass()) {
                    return this.f5285a.equals(((C0068a) obj).f5285a);
                }
                return false;
            }

            public int hashCode() {
                return (C0068a.class.getName().hashCode() * 31) + this.f5285a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f5285a + '}';
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a */
            private final androidx.work.a f5286a;

            public c() {
                this(androidx.work.a.f5302c);
            }

            public c(androidx.work.a aVar) {
                this.f5286a = aVar;
            }

            public androidx.work.a e() {
                return this.f5286a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && c.class == obj.getClass()) {
                    return this.f5286a.equals(((c) obj).f5286a);
                }
                return false;
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f5286a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f5286a + '}';
            }
        }

        a() {
        }

        public static a a() {
            return new C0068a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(androidx.work.a aVar) {
            return new c(aVar);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters == null) {
                throw new IllegalArgumentException("WorkerParameters is null");
            }
            this.f5280c = context;
            this.f5281d = workerParameters;
            return;
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context a() {
        return this.f5280c;
    }

    public Executor b() {
        return this.f5281d.a();
    }

    public final UUID e() {
        return this.f5281d.b();
    }

    public final androidx.work.a f() {
        return this.f5281d.c();
    }

    public e2.a g() {
        return this.f5281d.d();
    }

    public v h() {
        return this.f5281d.e();
    }

    public boolean i() {
        return this.f5284y;
    }

    public final boolean j() {
        return this.f5282q;
    }

    public final boolean k() {
        return this.f5283x;
    }

    public void l() {
    }

    public final void m() {
        this.f5283x = true;
    }

    public abstract x5.a<a> n();

    public final void o() {
        this.f5282q = true;
        l();
    }
}
