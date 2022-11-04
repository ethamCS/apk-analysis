package androidx.core.net;

import android.net.ConnectivityManager;
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.net.a$a */
    /* loaded from: classes.dex */
    public static class C0032a {
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return C0032a.a(connectivityManager);
    }
}
