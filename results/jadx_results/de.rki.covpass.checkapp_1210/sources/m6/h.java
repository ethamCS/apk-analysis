package m6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import m6.h;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    private final Context f16361a;

    /* renamed from: e */
    private Runnable f16365e;

    /* renamed from: f */
    private boolean f16366f;

    /* renamed from: c */
    private boolean f16363c = false;

    /* renamed from: b */
    private final BroadcastReceiver f16362b = new b();

    /* renamed from: d */
    private Handler f16364d = new Handler();

    /* loaded from: classes.dex */
    public final class b extends BroadcastReceiver {
        private b() {
            h.this = r1;
        }

        public /* synthetic */ void b(boolean z10) {
            h.this.f(z10);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z10 = intent.getIntExtra("plugged", -1) <= 0;
                h.this.f16364d.post(new Runnable() { // from class: m6.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b.this.b(z10);
                    }
                });
            }
        }
    }

    public h(Context context, Runnable runnable) {
        this.f16361a = context;
        this.f16365e = runnable;
    }

    private void e() {
        this.f16364d.removeCallbacksAndMessages(null);
    }

    public void f(boolean z10) {
        this.f16366f = z10;
        if (this.f16363c) {
            c();
        }
    }

    private void g() {
        if (!this.f16363c) {
            this.f16361a.registerReceiver(this.f16362b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f16363c = true;
        }
    }

    private void i() {
        if (this.f16363c) {
            this.f16361a.unregisterReceiver(this.f16362b);
            this.f16363c = false;
        }
    }

    public void c() {
        e();
        if (this.f16366f) {
            this.f16364d.postDelayed(this.f16365e, 300000L);
        }
    }

    public void d() {
        e();
        i();
    }

    public void h() {
        g();
        c();
    }
}
