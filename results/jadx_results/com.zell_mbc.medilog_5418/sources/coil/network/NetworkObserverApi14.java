package coil.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import coil.network.NetworkObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NetworkObserver.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\n\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcoil/network/NetworkObserverApi14;", "Lcoil/network/NetworkObserver;", "context", "Landroid/content/Context;", "connectivityManager", "Landroid/net/ConnectivityManager;", "listener", "Lcoil/network/NetworkObserver$Listener;", "(Landroid/content/Context;Landroid/net/ConnectivityManager;Lcoil/network/NetworkObserver$Listener;)V", "connectionReceiver", "coil/network/NetworkObserverApi14$connectionReceiver$1", "Lcoil/network/NetworkObserverApi14$connectionReceiver$1;", "isOnline", "", "()Z", "shutdown", "", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class NetworkObserverApi14 implements NetworkObserver {
    private final NetworkObserverApi14$connectionReceiver$1 connectionReceiver;
    private final ConnectivityManager connectivityManager;
    private final Context context;

    /* JADX WARN: Type inference failed for: r3v1, types: [coil.network.NetworkObserverApi14$connectionReceiver$1] */
    public NetworkObserverApi14(Context context, ConnectivityManager connectivityManager, final NetworkObserver.Listener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.connectivityManager = connectivityManager;
        ?? r3 = new BroadcastReceiver() { // from class: coil.network.NetworkObserverApi14$connectionReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Intrinsics.checkNotNullParameter(context2, "context");
                if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.net.conn.CONNECTIVITY_CHANGE")) {
                    listener.onConnectivityChange(NetworkObserverApi14.this.isOnline());
                }
            }
        };
        this.connectionReceiver = r3;
        context.registerReceiver((BroadcastReceiver) r3, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // coil.network.NetworkObserver
    public boolean isOnline() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    @Override // coil.network.NetworkObserver
    public void shutdown() {
        this.context.unregisterReceiver(this.connectionReceiver);
    }
}
