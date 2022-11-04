package y;

import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import y.g;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static final o.a<?, ?> f25705a = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements y.a<I, O> {

        /* renamed from: a */
        final /* synthetic */ o.a f25706a;

        a(o.a aVar) {
            this.f25706a = aVar;
        }

        @Override // y.a
        public x5.a<O> apply(I i10) {
            return f.h(this.f25706a.apply(i10));
        }
    }

    /* loaded from: classes.dex */
    class b implements o.a<Object, Object> {
        b() {
        }

        @Override // o.a
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public class c implements y.c<I> {

        /* renamed from: a */
        final /* synthetic */ c.a f25707a;

        /* renamed from: b */
        final /* synthetic */ o.a f25708b;

        c(c.a aVar, o.a aVar2) {
            this.f25707a = aVar;
            this.f25708b = aVar2;
        }

        @Override // y.c
        public void a(Throwable th2) {
            this.f25707a.f(th2);
        }

        @Override // y.c
        public void b(I i10) {
            try {
                this.f25707a.c(this.f25708b.apply(i10));
            } catch (Throwable th2) {
                this.f25707a.f(th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ x5.a f25709c;

        d(x5.a aVar) {
            this.f25709c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25709c.cancel(true);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<V> implements Runnable {

        /* renamed from: c */
        final Future<V> f25710c;

        /* renamed from: d */
        final y.c<? super V> f25711d;

        e(Future<V> future, y.c<? super V> cVar) {
            this.f25710c = future;
            this.f25711d = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable e10;
            try {
                this.f25711d.b(f.d(this.f25710c));
            } catch (Error e11) {
                e10 = e11;
                this.f25711d.a(e10);
            } catch (RuntimeException e12) {
                e10 = e12;
                this.f25711d.a(e10);
            } catch (ExecutionException e13) {
                this.f25711d.a(e13.getCause());
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f25711d;
        }
    }

    public static <V> void b(x5.a<V> aVar, y.c<? super V> cVar, Executor executor) {
        androidx.core.util.h.g(cVar);
        aVar.b(new e(aVar, cVar), executor);
    }

    public static <V> x5.a<List<V>> c(Collection<? extends x5.a<? extends V>> collection) {
        return new h(new ArrayList(collection), true, x.a.a());
    }

    public static <V> V d(Future<V> future) {
        boolean isDone = future.isDone();
        androidx.core.util.h.j(isDone, "Future was expected to be done, " + future);
        return (V) e(future);
    }

    public static <V> V e(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public static <V> x5.a<V> f(Throwable th2) {
        return new g.a(th2);
    }

    public static <V> ScheduledFuture<V> g(Throwable th2) {
        return new g.b(th2);
    }

    public static <V> x5.a<V> h(V v10) {
        return v10 == null ? g.a() : new g.c(v10);
    }

    public static /* synthetic */ Object i(x5.a aVar, c.a aVar2) {
        m(false, aVar, f25705a, aVar2, x.a.a());
        return "nonCancellationPropagating[" + aVar + "]";
    }

    public static <V> x5.a<V> j(final x5.a<V> aVar) {
        androidx.core.util.h.g(aVar);
        return aVar.isDone() ? aVar : androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: y.e
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar2) {
                Object i10;
                i10 = f.i(x5.a.this, aVar2);
                return i10;
            }
        });
    }

    public static <V> void k(x5.a<V> aVar, c.a<V> aVar2) {
        l(aVar, f25705a, aVar2, x.a.a());
    }

    public static <I, O> void l(x5.a<I> aVar, o.a<? super I, ? extends O> aVar2, c.a<O> aVar3, Executor executor) {
        m(true, aVar, aVar2, aVar3, executor);
    }

    private static <I, O> void m(boolean z10, x5.a<I> aVar, o.a<? super I, ? extends O> aVar2, c.a<O> aVar3, Executor executor) {
        androidx.core.util.h.g(aVar);
        androidx.core.util.h.g(aVar2);
        androidx.core.util.h.g(aVar3);
        androidx.core.util.h.g(executor);
        b(aVar, new c(aVar3, aVar2), executor);
        if (z10) {
            aVar3.a(new d(aVar), x.a.a());
        }
    }

    public static <V> x5.a<List<V>> n(Collection<? extends x5.a<? extends V>> collection) {
        return new h(new ArrayList(collection), false, x.a.a());
    }

    public static <I, O> x5.a<O> o(x5.a<I> aVar, o.a<? super I, ? extends O> aVar2, Executor executor) {
        androidx.core.util.h.g(aVar2);
        return p(aVar, new a(aVar2), executor);
    }

    public static <I, O> x5.a<O> p(x5.a<I> aVar, y.a<? super I, ? extends O> aVar2, Executor executor) {
        y.b bVar = new y.b(aVar2, aVar);
        aVar.b(bVar, executor);
        return bVar;
    }
}
