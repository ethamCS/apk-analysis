package me.carda.awesome_notifications.notifications.broadcastReceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.a.a.e.c;
/* loaded from: classes.dex */
public class RefreshNotificationBootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            if (!action.equals("android.intent.action.BOOT_COMPLETED") && !action.equals("android.intent.action.LOCKED_BOOT_COMPLETED") && !action.equals("android.intent.action.MY_PACKAGE_REPLACED") && !action.equals("android.intent.action.QUICKBOOT_POWERON") && !action.equals("com.htc.intent.action.QUICKBOOT_POWERON")) {
                return;
            }
            c.h(context);
        }
    }
}
