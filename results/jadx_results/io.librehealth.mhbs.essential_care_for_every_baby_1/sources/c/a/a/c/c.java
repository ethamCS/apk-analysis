package c.a.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
class c extends a {
    public c(Context context) {
        super(context);
    }

    @Override // c.a.a.c.a
    public void c(int i) {
        Intent intent = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent.putExtra("packagename", b());
        intent.putExtra("count", i);
        this.f373a.sendBroadcast(intent);
        Intent intent2 = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent2.putExtra("com.htc.launcher.extra.COMPONENT", new ComponentName(b(), a()).flattenToShortString());
        intent2.putExtra("com.htc.launcher.extra.COUNT", i);
        this.f373a.sendBroadcast(intent2);
    }
}
