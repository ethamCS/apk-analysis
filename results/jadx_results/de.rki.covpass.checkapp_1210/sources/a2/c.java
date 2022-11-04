package a2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import u1.k;
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h */
    private static final String f156h = k.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    private final BroadcastReceiver f157g = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        a() {
            c.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, e2.a aVar) {
        super(context, aVar);
    }

    @Override // a2.d
    public void e() {
        k.c().a(f156h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f161b.registerReceiver(this.f157g, g());
    }

    @Override // a2.d
    public void f() {
        k.c().a(f156h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f161b.unregisterReceiver(this.f157g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
