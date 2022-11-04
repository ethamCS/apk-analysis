package com.health.openworkout.core.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public class ReminderBootReceiver extends BroadcastReceiver {
    private void a(Context context) {
        new c().h(context);
    }

    private void b(Context context) {
        new c().f(context);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("alarmIntent")) {
            a(context);
        }
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            b(context);
        }
    }
}
