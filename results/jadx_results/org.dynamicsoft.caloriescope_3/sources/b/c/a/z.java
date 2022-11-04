package b.c.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public class z {

    /* renamed from: a */
    final HandlerThread f1348a;

    /* renamed from: b */
    final d f1349b;

    /* renamed from: c */
    final Handler f1350c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    long k;
    int l;
    int m;
    int n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends Handler {

        /* renamed from: a */
        private final z f1351a;

        /* renamed from: b.c.a.z$a$a */
        /* loaded from: classes.dex */
        class RunnableC0059a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Message f1352b;

            RunnableC0059a(a aVar, Message message) {
                this.f1352b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f1352b.what);
            }
        }

        public a(Looper looper, z zVar) {
            super(looper);
            this.f1351a = zVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f1351a.d();
            } else if (i == 1) {
                this.f1351a.e();
            } else if (i == 2) {
                this.f1351a.b(message.arg1);
            } else if (i == 3) {
                this.f1351a.c(message.arg1);
            } else if (i != 4) {
                s.p.post(new RunnableC0059a(this, message));
            } else {
                this.f1351a.a((Long) message.obj);
            }
        }
    }

    public z(d dVar) {
        this.f1349b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f1348a = handlerThread;
        handlerThread.start();
        d0.a(this.f1348a.getLooper());
        this.f1350c = new a(this.f1348a.getLooper(), this);
    }

    private static long a(int i, long j) {
        return j / i;
    }

    private void a(Bitmap bitmap, int i) {
        int a2 = d0.a(bitmap);
        Handler handler = this.f1350c;
        handler.sendMessage(handler.obtainMessage(i, a2, 0));
    }

    public a0 a() {
        return new a0(this.f1349b.a(), this.f1349b.size(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, System.currentTimeMillis());
    }

    public void a(long j) {
        Handler handler = this.f1350c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    public void a(Bitmap bitmap) {
        a(bitmap, 2);
    }

    void a(Long l) {
        this.l++;
        long longValue = this.f + l.longValue();
        this.f = longValue;
        this.i = a(this.l, longValue);
    }

    public void b() {
        this.f1350c.sendEmptyMessage(0);
    }

    void b(long j) {
        int i = this.m + 1;
        this.m = i;
        long j2 = this.g + j;
        this.g = j2;
        this.j = a(i, j2);
    }

    public void b(Bitmap bitmap) {
        a(bitmap, 3);
    }

    public void c() {
        this.f1350c.sendEmptyMessage(1);
    }

    void c(long j) {
        this.n++;
        long j2 = this.h + j;
        this.h = j2;
        this.k = a(this.m, j2);
    }

    void d() {
        this.d++;
    }

    void e() {
        this.e++;
    }
}
