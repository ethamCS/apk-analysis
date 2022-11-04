package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: e */
    private static e f3257e;

    /* renamed from: a */
    private final Object f3258a = new Object();

    /* renamed from: b */
    private final Handler f3259b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c */
    private c f3260c;

    /* renamed from: d */
    private c f3261d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        a() {
            e.this = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.c((c) message.obj);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final WeakReference<b> f3263a;

        /* renamed from: b */
        int f3264b;

        /* renamed from: c */
        boolean f3265c;

        boolean a(b bVar) {
            return bVar != null && this.f3263a.get() == bVar;
        }
    }

    private e() {
    }

    private boolean a(c cVar, int i) {
        b bVar = cVar.f3263a.get();
        if (bVar != null) {
            this.f3259b.removeCallbacksAndMessages(cVar);
            bVar.a(i);
            return true;
        }
        return false;
    }

    public static e b() {
        if (f3257e == null) {
            f3257e = new e();
        }
        return f3257e;
    }

    private boolean d(b bVar) {
        c cVar = this.f3260c;
        return cVar != null && cVar.a(bVar);
    }

    private void g(c cVar) {
        int i = cVar.f3264b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f3259b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f3259b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    void c(c cVar) {
        synchronized (this.f3258a) {
            if (this.f3260c == cVar || this.f3261d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.f3258a) {
            if (d(bVar)) {
                c cVar = this.f3260c;
                if (!cVar.f3265c) {
                    cVar.f3265c = true;
                    this.f3259b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f3258a) {
            if (d(bVar)) {
                c cVar = this.f3260c;
                if (cVar.f3265c) {
                    cVar.f3265c = false;
                    g(cVar);
                }
            }
        }
    }
}
