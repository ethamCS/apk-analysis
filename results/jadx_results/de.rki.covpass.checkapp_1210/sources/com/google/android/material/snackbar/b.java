package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {

    /* renamed from: e */
    private static b f7479e;

    /* renamed from: a */
    private final Object f7480a = new Object();

    /* renamed from: b */
    private final Handler f7481b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c */
    private c f7482c;

    /* renamed from: d */
    private c f7483d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        a() {
            b.this = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0107b {
        void a();

        void b(int i10);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final WeakReference<AbstractC0107b> f7485a;

        /* renamed from: b */
        int f7486b;

        /* renamed from: c */
        boolean f7487c;

        boolean a(AbstractC0107b abstractC0107b) {
            return abstractC0107b != null && this.f7485a.get() == abstractC0107b;
        }
    }

    private b() {
    }

    private boolean a(c cVar, int i10) {
        AbstractC0107b abstractC0107b = cVar.f7485a.get();
        if (abstractC0107b != null) {
            this.f7481b.removeCallbacksAndMessages(cVar);
            abstractC0107b.b(i10);
            return true;
        }
        return false;
    }

    public static b c() {
        if (f7479e == null) {
            f7479e = new b();
        }
        return f7479e;
    }

    private boolean f(AbstractC0107b abstractC0107b) {
        c cVar = this.f7482c;
        return cVar != null && cVar.a(abstractC0107b);
    }

    private boolean g(AbstractC0107b abstractC0107b) {
        c cVar = this.f7483d;
        return cVar != null && cVar.a(abstractC0107b);
    }

    private void l(c cVar) {
        int i10 = cVar.f7486b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f7481b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f7481b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    private void m() {
        c cVar = this.f7483d;
        if (cVar != null) {
            this.f7482c = cVar;
            this.f7483d = null;
            AbstractC0107b abstractC0107b = cVar.f7485a.get();
            if (abstractC0107b != null) {
                abstractC0107b.a();
            } else {
                this.f7482c = null;
            }
        }
    }

    public void b(AbstractC0107b abstractC0107b, int i10) {
        c cVar;
        synchronized (this.f7480a) {
            if (f(abstractC0107b)) {
                cVar = this.f7482c;
            } else if (g(abstractC0107b)) {
                cVar = this.f7483d;
            }
            a(cVar, i10);
        }
    }

    void d(c cVar) {
        synchronized (this.f7480a) {
            if (this.f7482c == cVar || this.f7483d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(AbstractC0107b abstractC0107b) {
        boolean z10;
        synchronized (this.f7480a) {
            if (!f(abstractC0107b) && !g(abstractC0107b)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public void h(AbstractC0107b abstractC0107b) {
        synchronized (this.f7480a) {
            if (f(abstractC0107b)) {
                this.f7482c = null;
                if (this.f7483d != null) {
                    m();
                }
            }
        }
    }

    public void i(AbstractC0107b abstractC0107b) {
        synchronized (this.f7480a) {
            if (f(abstractC0107b)) {
                l(this.f7482c);
            }
        }
    }

    public void j(AbstractC0107b abstractC0107b) {
        synchronized (this.f7480a) {
            if (f(abstractC0107b)) {
                c cVar = this.f7482c;
                if (!cVar.f7487c) {
                    cVar.f7487c = true;
                    this.f7481b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void k(AbstractC0107b abstractC0107b) {
        synchronized (this.f7480a) {
            if (f(abstractC0107b)) {
                c cVar = this.f7482c;
                if (cVar.f7487c) {
                    cVar.f7487c = false;
                    l(cVar);
                }
            }
        }
    }
}
