package c.a.a.c;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
class d extends a {
    public d(Context context) {
        super(context);
    }

    @Override // c.a.a.c.a
    public void c(int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count_package_name", b());
        intent.putExtra("badge_count_class_name", a());
        intent.putExtra("badge_count", i);
        this.f373a.sendBroadcast(intent);
    }
}
