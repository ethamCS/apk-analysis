package p7;

import android.os.Handler;
import android.os.HandlerThread;
/* loaded from: classes.dex */
public class k {

    /* renamed from: e */
    private static k f18983e;

    /* renamed from: a */
    private Handler f18984a;

    /* renamed from: b */
    private HandlerThread f18985b;

    /* renamed from: c */
    private int f18986c = 0;

    /* renamed from: d */
    private final Object f18987d = new Object();

    private k() {
    }

    private void a() {
        synchronized (this.f18987d) {
            if (this.f18984a == null) {
                if (this.f18986c <= 0) {
                    throw new IllegalStateException("CameraThread is not open");
                }
                HandlerThread handlerThread = new HandlerThread("CameraThread");
                this.f18985b = handlerThread;
                handlerThread.start();
                this.f18984a = new Handler(this.f18985b.getLooper());
            }
        }
    }

    public static k d() {
        if (f18983e == null) {
            f18983e = new k();
        }
        return f18983e;
    }

    private void f() {
        synchronized (this.f18987d) {
            this.f18985b.quit();
            this.f18985b = null;
            this.f18984a = null;
        }
    }

    public void b() {
        synchronized (this.f18987d) {
            int i10 = this.f18986c - 1;
            this.f18986c = i10;
            if (i10 == 0) {
                f();
            }
        }
    }

    public void c(Runnable runnable) {
        synchronized (this.f18987d) {
            a();
            this.f18984a.post(runnable);
        }
    }

    public void e(Runnable runnable) {
        synchronized (this.f18987d) {
            this.f18986c++;
            c(runnable);
        }
    }
}
