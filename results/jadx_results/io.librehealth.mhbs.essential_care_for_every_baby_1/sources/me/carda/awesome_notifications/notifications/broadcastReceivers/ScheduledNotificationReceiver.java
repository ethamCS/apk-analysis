package me.carda.awesome_notifications.notifications.broadcastReceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.a.a.e.c;
import e.a.a.e.d;
import e.a.a.e.h.i;
import e.a.a.g.m;
/* loaded from: classes.dex */
public class ScheduledNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("notificationJson");
        if (!m.c(stringExtra).booleanValue()) {
            try {
                i a2 = new i().a(stringExtra);
                if (a2 == null) {
                    return;
                }
                d.i(context, a2);
                if (a2.f832c.f828c.booleanValue()) {
                    c.j(context, a2);
                } else {
                    c.d(context, a2.f831b.f819a);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
