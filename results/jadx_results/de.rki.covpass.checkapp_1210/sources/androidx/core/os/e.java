package androidx.core.os;

import android.os.CancellationSignal;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private boolean f3495a;

    /* renamed from: b */
    private b f3496b;

    /* renamed from: c */
    private Object f3497c;

    /* renamed from: d */
    private boolean f3498d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    private void c() {
        while (this.f3498d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f3495a) {
                return;
            }
            this.f3495a = true;
            this.f3498d = true;
            b bVar = this.f3496b;
            Object obj = this.f3497c;
            if (bVar != null) {
                try {
                    bVar.a();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f3498d = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.f3498d = false;
                notifyAll();
            }
        }
    }

    public void b(b bVar) {
        synchronized (this) {
            c();
            if (this.f3496b == bVar) {
                return;
            }
            this.f3496b = bVar;
            if (this.f3495a && bVar != null) {
                bVar.a();
            }
        }
    }
}
