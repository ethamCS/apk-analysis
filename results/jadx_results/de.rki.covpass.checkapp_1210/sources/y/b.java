package y;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class b<I, O> extends d<O> implements Runnable {
    private x5.a<? extends I> U3;
    volatile x5.a<? extends O> V3;

    /* renamed from: q */
    private y.a<? super I, ? extends O> f25696q;

    /* renamed from: x */
    private final BlockingQueue<Boolean> f25697x = new LinkedBlockingQueue(1);

    /* renamed from: y */
    private final CountDownLatch f25698y = new CountDownLatch(1);

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ x5.a f25699c;

        a(x5.a aVar) {
            b.this = r1;
            this.f25699c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    b.this.c(f.e(this.f25699c));
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                    b.this.V3 = null;
                    return;
                } catch (ExecutionException e10) {
                    b.this.d(e10.getCause());
                }
                b.this.V3 = null;
            } catch (Throwable th2) {
                b.this.V3 = null;
                throw th2;
            }
        }
    }

    public b(y.a<? super I, ? extends O> aVar, x5.a<? extends I> aVar2) {
        this.f25696q = (y.a) androidx.core.util.h.g(aVar);
        this.U3 = (x5.a) androidx.core.util.h.g(aVar2);
    }

    private void g(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    private <E> void h(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
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
    }

    private <E> E i(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z10 = false;
        while (true) {
            try {
                take = blockingQueue.take();
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
        return take;
    }

    @Override // y.d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (super.cancel(z10)) {
            h(this.f25697x, Boolean.valueOf(z10));
            g(this.U3, z10);
            g(this.V3, z10);
            return true;
        }
        return false;
    }

    @Override // y.d, java.util.concurrent.Future
    public O get() {
        if (!isDone()) {
            x5.a<? extends I> aVar = this.U3;
            if (aVar != null) {
                aVar.get();
            }
            this.f25698y.await();
            x5.a<? extends O> aVar2 = this.V3;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return (O) super.get();
    }

    @Override // y.d, java.util.concurrent.Future
    public O get(long j10, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            x5.a<? extends I> aVar = this.U3;
            if (aVar != null) {
                long nanoTime = System.nanoTime();
                aVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (!this.f25698y.await(j10, timeUnit)) {
                throw new TimeoutException();
            }
            j10 -= Math.max(0L, System.nanoTime() - nanoTime2);
            x5.a<? extends O> aVar2 = this.V3;
            if (aVar2 != null) {
                aVar2.get(j10, timeUnit);
            }
        }
        return (O) super.get(j10, timeUnit);
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable e10;
        x5.a<? extends O> apply;
        try {
            try {
                try {
                    apply = this.f25696q.apply(f.e(this.U3));
                    this.V3 = apply;
                } catch (Throwable th2) {
                    this.f25696q = null;
                    this.U3 = null;
                    this.f25698y.countDown();
                    throw th2;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e11) {
                d(e11.getCause());
            }
        } catch (Error e12) {
            e10 = e12;
            d(e10);
            this.f25696q = null;
            this.U3 = null;
            this.f25698y.countDown();
            return;
        } catch (UndeclaredThrowableException e13) {
            e10 = e13.getCause();
            d(e10);
            this.f25696q = null;
            this.U3 = null;
            this.f25698y.countDown();
            return;
        } catch (Exception e14) {
            e10 = e14;
            d(e10);
            this.f25696q = null;
            this.U3 = null;
            this.f25698y.countDown();
            return;
        }
        if (!isCancelled()) {
            apply.b(new a(apply), x.a.a());
            this.f25696q = null;
            this.U3 = null;
            this.f25698y.countDown();
            return;
        }
        apply.cancel(((Boolean) i(this.f25697x)).booleanValue());
        this.V3 = null;
        this.f25696q = null;
        this.U3 = null;
        this.f25698y.countDown();
    }
}
