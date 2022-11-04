package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {
    private static e e;

    /* renamed from: a */
    private final Object f1559a = new Object();

    /* renamed from: b */
    private final Handler f1560b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c */
    private c f1561c;
    private c d;

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
            e.this.a((c) message.obj);
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
        final WeakReference<b> f1563a;

        /* renamed from: b */
        int f1564b;

        /* renamed from: c */
        boolean f1565c;

        boolean a(b bVar) {
            return bVar != null && this.f1563a.get() == bVar;
        }
    }

    private e() {
    }

    public static e a() {
        if (e == null) {
            e = new e();
        }
        return e;
    }

    private boolean a(c cVar, int i) {
        b bVar = cVar.f1563a.get();
        if (bVar != null) {
            this.f1560b.removeCallbacksAndMessages(cVar);
            bVar.a(i);
            return true;
        }
        return false;
    }

    private void b(c cVar) {
        int i = cVar.f1564b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f1560b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f1560b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    private boolean c(b bVar) {
        c cVar = this.f1561c;
        return cVar != null && cVar.a(bVar);
    }

    public void a(b bVar) {
        synchronized (this.f1559a) {
            if (c(bVar) && !this.f1561c.f1565c) {
                this.f1561c.f1565c = true;
                this.f1560b.removeCallbacksAndMessages(this.f1561c);
            }
        }
    }

    void a(c cVar) {
        synchronized (this.f1559a) {
            if (this.f1561c == cVar || this.d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void b(b bVar) {
        synchronized (this.f1559a) {
            if (c(bVar) && this.f1561c.f1565c) {
                this.f1561c.f1565c = false;
                b(this.f1561c);
            }
        }
    }
}
