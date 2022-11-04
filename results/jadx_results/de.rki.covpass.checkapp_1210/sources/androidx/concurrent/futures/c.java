package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        Object f2741a;

        /* renamed from: b */
        d<T> f2742b;

        /* renamed from: c */
        private androidx.concurrent.futures.d<Void> f2743c = androidx.concurrent.futures.d.s();

        /* renamed from: d */
        private boolean f2744d;

        a() {
        }

        private void e() {
            this.f2741a = null;
            this.f2742b = null;
            this.f2743c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            androidx.concurrent.futures.d<Void> dVar = this.f2743c;
            if (dVar != null) {
                dVar.b(runnable, executor);
            }
        }

        void b() {
            this.f2741a = null;
            this.f2742b = null;
            this.f2743c.p(null);
        }

        public boolean c(T t10) {
            boolean z10 = true;
            this.f2744d = true;
            d<T> dVar = this.f2742b;
            if (dVar == null || !dVar.c(t10)) {
                z10 = false;
            }
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            boolean z10 = true;
            this.f2744d = true;
            d<T> dVar = this.f2742b;
            if (dVar == null || !dVar.a(true)) {
                z10 = false;
            }
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean f(Throwable th2) {
            boolean z10 = true;
            this.f2744d = true;
            d<T> dVar = this.f2742b;
            if (dVar == null || !dVar.d(th2)) {
                z10 = false;
            }
            if (z10) {
                e();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d<Void> dVar;
            d<T> dVar2 = this.f2742b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2741a));
            }
            if (this.f2744d || (dVar = this.f2743c) == null) {
                return;
            }
            dVar.p(null);
        }
    }

    /* loaded from: classes.dex */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC0023c<T> {
        Object a(a<T> aVar);
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements x5.a<T> {

        /* renamed from: c */
        final WeakReference<a<T>> f2745c;

        /* renamed from: d */
        private final androidx.concurrent.futures.a<T> f2746d = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends androidx.concurrent.futures.a<T> {
            a() {
                d.this = r1;
            }

            @Override // androidx.concurrent.futures.a
            protected String m() {
                a<T> aVar = d.this.f2745c.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f2741a + "]";
            }
        }

        d(a<T> aVar) {
            this.f2745c = new WeakReference<>(aVar);
        }

        boolean a(boolean z10) {
            return this.f2746d.cancel(z10);
        }

        @Override // x5.a
        public void b(Runnable runnable, Executor executor) {
            this.f2746d.b(runnable, executor);
        }

        boolean c(T t10) {
            return this.f2746d.p(t10);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f2745c.get();
            boolean cancel = this.f2746d.cancel(z10);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        boolean d(Throwable th2) {
            return this.f2746d.q(th2);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f2746d.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            return this.f2746d.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f2746d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f2746d.isDone();
        }

        public String toString() {
            return this.f2746d.toString();
        }
    }

    public static <T> x5.a<T> a(AbstractC0023c<T> abstractC0023c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f2742b = dVar;
        aVar.f2741a = abstractC0023c.getClass();
        try {
            Object a10 = abstractC0023c.a(aVar);
            if (a10 != null) {
                aVar.f2741a = a10;
            }
        } catch (Exception e10) {
            dVar.d(e10);
        }
        return dVar;
    }
}
