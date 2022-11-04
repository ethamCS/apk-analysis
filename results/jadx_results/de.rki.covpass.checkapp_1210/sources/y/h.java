package y;

import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class h<V> implements x5.a<List<V>> {
    c.a<List<V>> U3;

    /* renamed from: c */
    List<? extends x5.a<? extends V>> f25715c;

    /* renamed from: d */
    List<V> f25716d;

    /* renamed from: q */
    private final boolean f25717q;

    /* renamed from: x */
    private final AtomicInteger f25718x;

    /* renamed from: y */
    private final x5.a<List<V>> f25719y = androidx.concurrent.futures.c.a(new a());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.AbstractC0023c<List<V>> {
        a() {
            h.this = r1;
        }

        @Override // androidx.concurrent.futures.c.AbstractC0023c
        public Object a(c.a<List<V>> aVar) {
            androidx.core.util.h.j(h.this.U3 == null, "The result can only set once!");
            h.this.U3 = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            h.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f25716d = null;
            hVar.f25715c = null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f25722c;

        /* renamed from: d */
        final /* synthetic */ x5.a f25723d;

        c(int i10, x5.a aVar) {
            h.this = r1;
            this.f25722c = i10;
            this.f25723d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f(this.f25722c, this.f25723d);
        }
    }

    public h(List<? extends x5.a<? extends V>> list, boolean z10, Executor executor) {
        this.f25715c = (List) androidx.core.util.h.g(list);
        this.f25716d = new ArrayList(list.size());
        this.f25717q = z10;
        this.f25718x = new AtomicInteger(list.size());
        e(executor);
    }

    private void a() {
        List<? extends x5.a<? extends V>> list = this.f25715c;
        if (list == null || isDone()) {
            return;
        }
        for (x5.a<? extends V> aVar : list) {
            while (!aVar.isDone()) {
                try {
                    aVar.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.f25717q) {
                        return;
                    }
                }
            }
        }
    }

    private void e(Executor executor) {
        b(new b(), x.a.a());
        if (this.f25715c.isEmpty()) {
            this.U3.c(new ArrayList(this.f25716d));
            return;
        }
        for (int i10 = 0; i10 < this.f25715c.size(); i10++) {
            this.f25716d.add(null);
        }
        List<? extends x5.a<? extends V>> list = this.f25715c;
        for (int i11 = 0; i11 < list.size(); i11++) {
            x5.a<? extends V> aVar = list.get(i11);
            aVar.b(new c(i11, aVar), executor);
        }
    }

    @Override // x5.a
    public void b(Runnable runnable, Executor executor) {
        this.f25719y.b(runnable, executor);
    }

    /* renamed from: c */
    public List<V> get() {
        a();
        return this.f25719y.get();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends x5.a<? extends V>> list = this.f25715c;
        if (list != null) {
            for (x5.a<? extends V> aVar : list) {
                aVar.cancel(z10);
            }
        }
        return this.f25719y.cancel(z10);
    }

    /* renamed from: d */
    public List<V> get(long j10, TimeUnit timeUnit) {
        return this.f25719y.get(j10, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void f(int i10, Future<? extends V> future) {
        c.a<List<V>> aVar;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.f25716d;
        if (isDone() || list == 0) {
            androidx.core.util.h.j(this.f25717q, "Future was done before all dependencies completed");
            return;
        }
        boolean z10 = true;
        try {
            try {
                try {
                    try {
                        androidx.core.util.h.j(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i10, f.e(future));
                        decrementAndGet = this.f25718x.decrementAndGet();
                        if (decrementAndGet < 0) {
                            z10 = false;
                        }
                        androidx.core.util.h.j(z10, "Less than 0 remaining futures");
                    } catch (ExecutionException e10) {
                        if (this.f25717q) {
                            this.U3.f(e10.getCause());
                        }
                        int decrementAndGet2 = this.f25718x.decrementAndGet();
                        if (decrementAndGet2 < 0) {
                            z10 = false;
                        }
                        androidx.core.util.h.j(z10, "Less than 0 remaining futures");
                        if (decrementAndGet2 != 0) {
                            return;
                        }
                        List<V> list2 = this.f25716d;
                        if (list2 != null) {
                            aVar = this.U3;
                            arrayList = new ArrayList(list2);
                        }
                    }
                } catch (RuntimeException e11) {
                    if (this.f25717q) {
                        this.U3.f(e11);
                    }
                    int decrementAndGet3 = this.f25718x.decrementAndGet();
                    if (decrementAndGet3 < 0) {
                        z10 = false;
                    }
                    androidx.core.util.h.j(z10, "Less than 0 remaining futures");
                    if (decrementAndGet3 != 0) {
                        return;
                    }
                    List<V> list3 = this.f25716d;
                    if (list3 != null) {
                        aVar = this.U3;
                        arrayList = new ArrayList(list3);
                    }
                }
            } catch (Error e12) {
                this.U3.f(e12);
                int decrementAndGet4 = this.f25718x.decrementAndGet();
                if (decrementAndGet4 < 0) {
                    z10 = false;
                }
                androidx.core.util.h.j(z10, "Less than 0 remaining futures");
                if (decrementAndGet4 != 0) {
                    return;
                }
                List<V> list4 = this.f25716d;
                if (list4 != null) {
                    aVar = this.U3;
                    arrayList = new ArrayList(list4);
                }
            } catch (CancellationException unused) {
                if (this.f25717q) {
                    cancel(false);
                }
                int decrementAndGet5 = this.f25718x.decrementAndGet();
                if (decrementAndGet5 < 0) {
                    z10 = false;
                }
                androidx.core.util.h.j(z10, "Less than 0 remaining futures");
                if (decrementAndGet5 != 0) {
                    return;
                }
                List<V> list5 = this.f25716d;
                if (list5 != null) {
                    aVar = this.U3;
                    arrayList = new ArrayList(list5);
                }
            }
            if (decrementAndGet != 0) {
                return;
            }
            List<V> list6 = this.f25716d;
            if (list6 != null) {
                aVar = this.U3;
                arrayList = new ArrayList(list6);
                aVar.c(arrayList);
                return;
            }
            androidx.core.util.h.i(isDone());
        } catch (Throwable th2) {
            int decrementAndGet6 = this.f25718x.decrementAndGet();
            if (decrementAndGet6 < 0) {
                z10 = false;
            }
            androidx.core.util.h.j(z10, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List<V> list7 = this.f25716d;
                if (list7 != null) {
                    this.U3.c(new ArrayList(list7));
                } else {
                    androidx.core.util.h.i(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f25719y.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f25719y.isDone();
    }
}
