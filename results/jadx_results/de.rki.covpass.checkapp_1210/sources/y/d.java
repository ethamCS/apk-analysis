package y;

import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class d<V> implements x5.a<V> {

    /* renamed from: c */
    private final x5.a<V> f25701c;

    /* renamed from: d */
    c.a<V> f25702d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.AbstractC0023c<V> {
        a() {
            d.this = r1;
        }

        @Override // androidx.concurrent.futures.c.AbstractC0023c
        public Object a(c.a<V> aVar) {
            androidx.core.util.h.j(d.this.f25702d == null, "The result can only set once!");
            d.this.f25702d = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    public d() {
        this.f25701c = androidx.concurrent.futures.c.a(new a());
    }

    d(x5.a<V> aVar) {
        this.f25701c = (x5.a) androidx.core.util.h.g(aVar);
    }

    public static <V> d<V> a(x5.a<V> aVar) {
        return aVar instanceof d ? (d) aVar : new d<>(aVar);
    }

    @Override // x5.a
    public void b(Runnable runnable, Executor executor) {
        this.f25701c.b(runnable, executor);
    }

    public boolean c(V v10) {
        c.a<V> aVar = this.f25702d;
        if (aVar != null) {
            return aVar.c(v10);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f25701c.cancel(z10);
    }

    public boolean d(Throwable th2) {
        c.a<V> aVar = this.f25702d;
        if (aVar != null) {
            return aVar.f(th2);
        }
        return false;
    }

    public final <T> d<T> e(o.a<? super V, T> aVar, Executor executor) {
        return (d) f.o(this, aVar, executor);
    }

    public final <T> d<T> f(y.a<? super V, T> aVar, Executor executor) {
        return (d) f.p(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f25701c.get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f25701c.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f25701c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f25701c.isDone();
    }
}
