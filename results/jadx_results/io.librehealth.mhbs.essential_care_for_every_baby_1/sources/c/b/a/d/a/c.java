package c.b.a.d.a;

import c.b.a.a.e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<V> implements Runnable {

        /* renamed from: a */
        final Future<V> f432a;

        /* renamed from: b */
        final b<? super V> f433b;

        a(Future<V> future, b<? super V> bVar) {
            this.f432a = future;
            this.f433b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable e2;
            Throwable a2;
            Future<V> future = this.f432a;
            if ((future instanceof c.b.a.d.a.j.a) && (a2 = c.b.a.d.a.j.b.a((c.b.a.d.a.j.a) future)) != null) {
                this.f433b.a(a2);
                return;
            }
            try {
                this.f433b.b(c.b(this.f432a));
            } catch (Error e3) {
                e2 = e3;
                this.f433b.a(e2);
            } catch (RuntimeException e4) {
                e2 = e4;
                this.f433b.a(e2);
            } catch (ExecutionException e5) {
                this.f433b.a(e5.getCause());
            }
        }

        public String toString() {
            e.b a2 = c.b.a.a.e.a(this);
            a2.c(this.f433b);
            return a2.toString();
        }
    }

    public static <V> void a(e<V> eVar, b<? super V> bVar, Executor executor) {
        c.b.a.a.i.h(bVar);
        eVar.a(new a(eVar, bVar), executor);
    }

    public static <V> V b(Future<V> future) {
        c.b.a.a.i.k(future.isDone(), "Future was expected to be done: %s", future);
        return (V) i.a(future);
    }
}
