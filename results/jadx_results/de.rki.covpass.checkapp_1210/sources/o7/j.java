package o7;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
/* loaded from: classes.dex */
public class j {

    /* renamed from: k */
    private static final String f17618k = "j";

    /* renamed from: a */
    private p7.g f17619a;

    /* renamed from: b */
    private HandlerThread f17620b;

    /* renamed from: c */
    private Handler f17621c;

    /* renamed from: d */
    private g f17622d;

    /* renamed from: e */
    private Handler f17623e;

    /* renamed from: f */
    private Rect f17624f;

    /* renamed from: g */
    private boolean f17625g = false;

    /* renamed from: h */
    private final Object f17626h = new Object();

    /* renamed from: i */
    private final Handler.Callback f17627i = new a();

    /* renamed from: j */
    private final p7.p f17628j = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        a() {
            j.this = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == m6.k.e_res_0x7f0902cc) {
                j.this.g((r) message.obj);
                return true;
            } else if (i10 != m6.k.i_res_0x7f0902d0) {
                return true;
            } else {
                j.this.h();
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements p7.p {
        b() {
            j.this = r1;
        }

        @Override // p7.p
        public void a(r rVar) {
            synchronized (j.this.f17626h) {
                if (j.this.f17625g) {
                    j.this.f17621c.obtainMessage(m6.k.e_res_0x7f0902cc, rVar).sendToTarget();
                }
            }
        }

        @Override // p7.p
        public void b(Exception exc) {
            synchronized (j.this.f17626h) {
                if (j.this.f17625g) {
                    j.this.f17621c.obtainMessage(m6.k.i_res_0x7f0902d0).sendToTarget();
                }
            }
        }
    }

    public j(p7.g gVar, g gVar2, Handler handler) {
        s.a();
        this.f17619a = gVar;
        this.f17622d = gVar2;
        this.f17623e = handler;
    }

    public void g(r rVar) {
        Message message;
        long currentTimeMillis = System.currentTimeMillis();
        rVar.d(this.f17624f);
        h6.j f10 = f(rVar);
        h6.q c10 = f10 != null ? this.f17622d.c(f10) : null;
        if (c10 != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = f17618k;
            Log.d(str, "Found barcode in " + (currentTimeMillis2 - currentTimeMillis) + " ms");
            if (this.f17623e != null) {
                message = Message.obtain(this.f17623e, m6.k.g_res_0x7f0902ce, new c(c10, rVar));
                message.setData(new Bundle());
                message.sendToTarget();
            }
        } else {
            Handler handler = this.f17623e;
            if (handler != null) {
                message = Message.obtain(handler, m6.k.f_res_0x7f0902cd);
                message.sendToTarget();
            }
        }
        if (this.f17623e != null) {
            Message.obtain(this.f17623e, m6.k.h_res_0x7f0902cf, c.e(this.f17622d.d(), rVar)).sendToTarget();
        }
        h();
    }

    public void h() {
        this.f17619a.v(this.f17628j);
    }

    protected h6.j f(r rVar) {
        if (this.f17624f == null) {
            return null;
        }
        return rVar.a();
    }

    public void i(Rect rect) {
        this.f17624f = rect;
    }

    public void j(g gVar) {
        this.f17622d = gVar;
    }

    public void k() {
        s.a();
        HandlerThread handlerThread = new HandlerThread(f17618k);
        this.f17620b = handlerThread;
        handlerThread.start();
        this.f17621c = new Handler(this.f17620b.getLooper(), this.f17627i);
        this.f17625g = true;
        h();
    }

    public void l() {
        s.a();
        synchronized (this.f17626h) {
            this.f17625g = false;
            this.f17621c.removeCallbacksAndMessages(null);
            this.f17620b.quit();
        }
    }
}
