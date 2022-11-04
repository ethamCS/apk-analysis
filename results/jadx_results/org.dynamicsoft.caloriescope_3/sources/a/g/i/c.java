package a.g.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class c {

    /* renamed from: b */
    private HandlerThread f205b;

    /* renamed from: c */
    private Handler f206c;
    private final int f;
    private final int g;
    private final String h;

    /* renamed from: a */
    private final Object f204a = new Object();
    private Handler.Callback e = new a();
    private int d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        a() {
            c.this = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c.this.a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                c.this.a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Callable f208b;

        /* renamed from: c */
        final /* synthetic */ Handler f209c;
        final /* synthetic */ d d;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Object f210b;

            a(Object obj) {
                b.this = r1;
                this.f210b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.d.a(this.f210b);
            }
        }

        b(c cVar, Callable callable, Handler handler, d dVar) {
            this.f208b = callable;
            this.f209c = handler;
            this.d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f208b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f209c.post(new a(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.i.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0010c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AtomicReference f212b;

        /* renamed from: c */
        final /* synthetic */ Callable f213c;
        final /* synthetic */ ReentrantLock d;
        final /* synthetic */ AtomicBoolean e;
        final /* synthetic */ Condition f;

        RunnableC0010c(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f212b = atomicReference;
            this.f213c = callable;
            this.d = reentrantLock;
            this.e = atomicBoolean;
            this.f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f212b.set(this.f213c.call());
            } catch (Exception unused) {
            }
            this.d.lock();
            try {
                this.e.set(false);
                this.f.signal();
            } finally {
                this.d.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f = i2;
    }

    private void b(Runnable runnable) {
        synchronized (this.f204a) {
            if (this.f205b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.f205b = handlerThread;
                handlerThread.start();
                this.f206c = new Handler(this.f205b.getLooper(), this.e);
                this.d++;
            }
            this.f206c.removeMessages(0);
            this.f206c.sendMessage(this.f206c.obtainMessage(1, runnable));
        }
    }

    public <T> T a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        b(new RunnableC0010c(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    void a() {
        synchronized (this.f204a) {
            if (this.f206c.hasMessages(1)) {
                return;
            }
            this.f205b.quit();
            this.f205b = null;
            this.f206c = null;
        }
    }

    void a(Runnable runnable) {
        runnable.run();
        synchronized (this.f204a) {
            this.f206c.removeMessages(0);
            this.f206c.sendMessageDelayed(this.f206c.obtainMessage(0), this.f);
        }
    }

    public <T> void a(Callable<T> callable, d<T> dVar) {
        b(new b(this, callable, new Handler(), dVar));
    }
}
