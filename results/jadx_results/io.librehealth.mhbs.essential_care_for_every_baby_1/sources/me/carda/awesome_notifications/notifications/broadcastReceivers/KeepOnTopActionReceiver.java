package me.carda.awesome_notifications.notifications.broadcastReceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.a.a.e.b;
import e.a.a.e.h.j.a;
/* loaded from: classes.dex */
public class KeepOnTopActionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a a2 = b.a(context, intent);
        if (a2 != null) {
            try {
                e.a.a.b.a(context, a2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
