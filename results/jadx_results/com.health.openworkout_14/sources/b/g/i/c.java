package b.g.i;

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
    private HandlerThread f2432b;

    /* renamed from: c */
    private Handler f2433c;

    /* renamed from: f */
    private final int f2436f;

    /* renamed from: g */
    private final int f2437g;

    /* renamed from: h */
    private final String f2438h;

    /* renamed from: a */
    private final Object f2431a = new Object();

    /* renamed from: e */
    private Handler.Callback f2435e = new a();

    /* renamed from: d */
    private int f2434d = 0;

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
                c.this.b((Runnable) message.obj);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Callable f2440b;

        /* renamed from: c */
        final /* synthetic */ Handler f2441c;

        /* renamed from: d */
        final /* synthetic */ d f2442d;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Object f2443b;

            a(Object obj) {
                b.this = r1;
                this.f2443b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2442d.a(this.f2443b);
            }
        }

        b(c cVar, Callable callable, Handler handler, d dVar) {
            this.f2440b = callable;
            this.f2441c = handler;
            this.f2442d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f2440b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f2441c.post(new a(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.g.i.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0047c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AtomicReference f2445b;

        /* renamed from: c */
        final /* synthetic */ Callable f2446c;

        /* renamed from: d */
        final /* synthetic */ ReentrantLock f2447d;

        /* renamed from: e */
        final /* synthetic */ AtomicBoolean f2448e;

        /* renamed from: f */
        final /* synthetic */ Condition f2449f;

        RunnableC0047c(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f2445b = atomicReference;
            this.f2446c = callable;
            this.f2447d = reentrantLock;
            this.f2448e = atomicBoolean;
            this.f2449f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2445b.set(this.f2446c.call());
            } catch (Exception unused) {
            }
            this.f2447d.lock();
            try {
                this.f2448e.set(false);
                this.f2449f.signal();
            } finally {
                this.f2447d.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.f2438h = str;
        this.f2437g = i;
        this.f2436f = i2;
    }

    private void c(Runnable runnable) {
        synchronized (this.f2431a) {
            if (this.f2432b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f2438h, this.f2437g);
                this.f2432b = handlerThread;
                handlerThread.start();
                this.f2433c = new Handler(this.f2432b.getLooper(), this.f2435e);
                this.f2434d++;
            }
            this.f2433c.removeMessages(0);
            Handler handler = this.f2433c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    void a() {
        synchronized (this.f2431a) {
            if (this.f2433c.hasMessages(1)) {
                return;
            }
            this.f2432b.quit();
            this.f2432b = null;
            this.f2433c = null;
        }
    }

    void b(Runnable runnable) {
        runnable.run();
        synchronized (this.f2431a) {
            this.f2433c.removeMessages(0);
            Handler handler = this.f2433c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f2436f);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(this, callable, new Handler(), dVar));
    }

    public <T> T e(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        c(new RunnableC0047c(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
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
}
