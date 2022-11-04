package w;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import w.n1;
import w.s1;
/* loaded from: classes.dex */
public final class n1<T> implements s1<T> {

    /* renamed from: a */
    final androidx.lifecycle.d0<b<T>> f24537a = new androidx.lifecycle.d0<>();

    /* renamed from: b */
    private final Map<s1.a<? super T>, a<T>> f24538b = new HashMap();

    /* loaded from: classes.dex */
    public static final class a<T> implements androidx.lifecycle.e0<b<T>> {

        /* renamed from: a */
        final AtomicBoolean f24539a = new AtomicBoolean(true);

        /* renamed from: b */
        final s1.a<? super T> f24540b;

        /* renamed from: c */
        final Executor f24541c;

        a(Executor executor, s1.a<? super T> aVar) {
            this.f24541c = executor;
            this.f24540b = aVar;
        }

        public /* synthetic */ void d(b bVar) {
            if (!this.f24539a.get()) {
                return;
            }
            if (bVar.a()) {
                this.f24540b.b((Object) bVar.d());
                return;
            }
            androidx.core.util.h.g(bVar.c());
            this.f24540b.a(bVar.c());
        }

        void c() {
            this.f24539a.set(false);
        }

        /* renamed from: e */
        public void a(final b<T> bVar) {
            this.f24541c.execute(new Runnable() { // from class: w.m1
                @Override // java.lang.Runnable
                public final void run() {
                    n1.a.this.d(bVar);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a */
        private final T f24542a;

        /* renamed from: b */
        private final Throwable f24543b;

        private b(T t10, Throwable th2) {
            this.f24542a = t10;
            this.f24543b = th2;
        }

        static <T> b<T> b(T t10) {
            return new b<>(t10, null);
        }

        public boolean a() {
            return this.f24543b == null;
        }

        public Throwable c() {
            return this.f24543b;
        }

        public T d() {
            if (a()) {
                return this.f24542a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            Object obj;
            StringBuilder sb2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[Result: <");
            if (a()) {
                sb2 = new StringBuilder();
                sb2.append("Value: ");
                obj = this.f24542a;
            } else {
                sb2 = new StringBuilder();
                sb2.append("Error: ");
                obj = this.f24543b;
            }
            sb2.append(obj);
            sb3.append(sb2.toString());
            sb3.append(">]");
            return sb3.toString();
        }
    }

    public /* synthetic */ void e(a aVar, a aVar2) {
        if (aVar != null) {
            this.f24537a.l(aVar);
        }
        this.f24537a.h(aVar2);
    }

    public /* synthetic */ void f(a aVar) {
        this.f24537a.l(aVar);
    }

    @Override // w.s1
    public void a(Executor executor, s1.a<? super T> aVar) {
        synchronized (this.f24538b) {
            final a<T> aVar2 = this.f24538b.get(aVar);
            if (aVar2 != null) {
                aVar2.c();
            }
            final a<T> aVar3 = new a<>(executor, aVar);
            this.f24538b.put(aVar, aVar3);
            x.a.d().execute(new Runnable() { // from class: w.l1
                @Override // java.lang.Runnable
                public final void run() {
                    n1.this.e(aVar2, aVar3);
                }
            });
        }
    }

    @Override // w.s1
    public void b(s1.a<? super T> aVar) {
        synchronized (this.f24538b) {
            final a<T> remove = this.f24538b.remove(aVar);
            if (remove != null) {
                remove.c();
                x.a.d().execute(new Runnable() { // from class: w.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        n1.this.f(remove);
                    }
                });
            }
        }
    }

    public void g(T t10) {
        this.f24537a.k(b.b(t10));
    }
}
