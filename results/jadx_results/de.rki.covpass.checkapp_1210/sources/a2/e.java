package a2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import u1.k;
/* loaded from: classes.dex */
public class e extends d<y1.b> {

    /* renamed from: j */
    static final String f167j = k.f("NetworkStateTracker");

    /* renamed from: g */
    private final ConnectivityManager f168g = (ConnectivityManager) this.f161b.getSystemService("connectivity");

    /* renamed from: h */
    private b f169h;

    /* renamed from: i */
    private a f170i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        a() {
            e.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            k.c().a(e.f167j, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        b() {
            e.this = r1;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            k.c().a(e.f167j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            k.c().a(e.f167j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, e2.a aVar) {
        super(context, aVar);
        if (j()) {
            this.f169h = new b();
        } else {
            this.f170i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // a2.d
    public void e() {
        if (!j()) {
            k.c().a(f167j, "Registering broadcast receiver", new Throwable[0]);
            this.f161b.registerReceiver(this.f170i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            k.c().a(f167j, "Registering network callback", new Throwable[0]);
            this.f168g.registerDefaultNetworkCallback(this.f169h);
        } catch (IllegalArgumentException | SecurityException e10) {
            k.c().b(f167j, "Received exception while registering network callback", e10);
        }
    }

    @Override // a2.d
    public void f() {
        if (!j()) {
            k.c().a(f167j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f161b.unregisterReceiver(this.f170i);
            return;
        }
        try {
            k.c().a(f167j, "Unregistering network callback", new Throwable[0]);
            this.f168g.unregisterNetworkCallback(this.f169h);
        } catch (IllegalArgumentException | SecurityException e10) {
            k.c().b(f167j, "Received exception while unregistering network callback", e10);
        }
    }

    y1.b g() {
        NetworkInfo activeNetworkInfo = this.f168g.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i10 = i();
        boolean a10 = androidx.core.net.a.a(this.f168g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z10 = false;
        }
        return new y1.b(z11, i10, a10, z10);
    }

    /* renamed from: h */
    public y1.b b() {
        return g();
    }

    boolean i() {
        try {
            NetworkCapabilities networkCapabilities = this.f168g.getNetworkCapabilities(this.f168g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e10) {
            k.c().b(f167j, "Unable to validate active network", e10);
            return false;
        }
    }
}
