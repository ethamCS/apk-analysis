package c.a.a.c;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
class g extends a {
    public g(Context context) {
        super(context);
    }

    @Override // c.a.a.c.a
    public void c(int i) {
        Intent intent = new Intent();
        intent.setAction("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", b());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", a());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        this.f373a.sendBroadcast(intent);
    }
}
