package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import u1.k;
import v1.i;
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f5324a = k.f("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Intent f5325c;

        /* renamed from: d */
        final /* synthetic */ Context f5326d;

        /* renamed from: q */
        final /* synthetic */ BroadcastReceiver.PendingResult f5327q;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            ConstraintProxyUpdateReceiver.this = r1;
            this.f5325c = intent;
            this.f5326d = context;
            this.f5327q = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f5325c.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f5325c.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f5325c.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f5325c.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                k.c().a(ConstraintProxyUpdateReceiver.f5324a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                d2.d.a(this.f5326d, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                d2.d.a(this.f5326d, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                d2.d.a(this.f5326d, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                d2.d.a(this.f5326d, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f5327q.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            k.c().a(f5324a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        } else {
            i.k(context).q().b(new a(intent, context, goAsync()));
        }
    }
}
