package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.z;
import androidx.work.impl.foreground.a;
import u1.k;
/* loaded from: classes.dex */
public class SystemForegroundService extends z implements a.b {
    private static final String U3 = k.f("SystemFgService");
    private static SystemForegroundService V3 = null;

    /* renamed from: d */
    private Handler f5362d;

    /* renamed from: q */
    private boolean f5363q;

    /* renamed from: x */
    androidx.work.impl.foreground.a f5364x;

    /* renamed from: y */
    NotificationManager f5365y;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f5366c;

        /* renamed from: d */
        final /* synthetic */ Notification f5367d;

        /* renamed from: q */
        final /* synthetic */ int f5368q;

        a(int i10, Notification notification, int i11) {
            SystemForegroundService.this = r1;
            this.f5366c = i10;
            this.f5367d = notification;
            this.f5368q = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f5366c, this.f5367d, this.f5368q);
            } else {
                SystemForegroundService.this.startForeground(this.f5366c, this.f5367d);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f5370c;

        /* renamed from: d */
        final /* synthetic */ Notification f5371d;

        b(int i10, Notification notification) {
            SystemForegroundService.this = r1;
            this.f5370c = i10;
            this.f5371d = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f5365y.notify(this.f5370c, this.f5371d);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f5373c;

        c(int i10) {
            SystemForegroundService.this = r1;
            this.f5373c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f5365y.cancel(this.f5373c);
        }
    }

    private void h() {
        this.f5362d = new Handler(Looper.getMainLooper());
        this.f5365y = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f5364x = aVar;
        aVar.k(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i10) {
        this.f5362d.post(new c(i10));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10, int i11, Notification notification) {
        this.f5362d.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i10, Notification notification) {
        this.f5362d.post(new b(i10, notification));
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onCreate() {
        super.onCreate();
        V3 = this;
        h();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f5364x.i();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f5363q) {
            k.c().d(U3, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f5364x.i();
            h();
            this.f5363q = false;
        }
        if (intent != null) {
            this.f5364x.j(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f5363q = true;
        k.c().a(U3, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        V3 = null;
        stopSelf();
    }
}
