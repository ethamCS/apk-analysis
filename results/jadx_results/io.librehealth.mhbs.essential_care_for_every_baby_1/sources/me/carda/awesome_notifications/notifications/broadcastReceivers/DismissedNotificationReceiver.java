package me.carda.awesome_notifications.notifications.broadcastReceivers;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.a.a.e.b;
import e.a.a.e.d;
@TargetApi(3)
/* loaded from: classes.dex */
public class DismissedNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("DISMISSED_NOTIFICATION")) {
            return;
        }
        d.j(context, b.a(context, intent));
    }
}
