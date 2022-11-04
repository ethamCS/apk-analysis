package b.g.h;

import android.os.Build;
import android.os.CancellationSignal;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private boolean f2400a;

    /* renamed from: b */
    private AbstractC0045a f2401b;

    /* renamed from: c */
    private Object f2402c;

    /* renamed from: d */
    private boolean f2403d;

    /* renamed from: b.g.h.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0045a {
        void a();
    }

    private void d() {
        while (this.f2403d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f2400a) {
                return;
            }
            this.f2400a = true;
            this.f2403d = true;
            AbstractC0045a abstractC0045a = this.f2401b;
            Object obj = this.f2402c;
            if (abstractC0045a != null) {
                try {
                    abstractC0045a.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f2403d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f2403d = false;
                notifyAll();
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this) {
            z = this.f2400a;
        }
        return z;
    }

    public void c(AbstractC0045a abstractC0045a) {
        synchronized (this) {
            d();
            if (this.f2401b == abstractC0045a) {
                return;
            }
            this.f2401b = abstractC0045a;
            if (this.f2400a && abstractC0045a != null) {
                abstractC0045a.a();
            }
        }
    }
}
