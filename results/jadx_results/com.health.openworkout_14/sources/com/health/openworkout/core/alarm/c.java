package com.health.openworkout.core.alarm;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.i;
import com.health.openworkout.MainActivity;
import com.health.openworkout.R;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class c {
    private void b(Context context, a aVar) {
        g(context, aVar.c(), aVar.d());
    }

    private void c(Context context, Set<a> set) {
        for (a aVar : set) {
            b(context, aVar);
        }
    }

    private PendingIntent d(Context context, int i) {
        Intent intent = new Intent(context, ReminderBootReceiver.class);
        intent.putExtra("alarmIntent", true);
        return PendingIntent.getBroadcast(context, i, intent, 134217728);
    }

    private List<PendingIntent> e(Context context) {
        int[] iArr = {2, 3, 4, 5, 6, 7, 1};
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 7; i++) {
            linkedList.add(d(context, iArr[i]));
        }
        return linkedList;
    }

    private void g(Context context, int i, Calendar calendar) {
        h.a.a.a("Set repeating alarm for %s", calendar.getTime());
        ((AlarmManager) context.getSystemService("alarm")).setInexactRepeating(0, calendar.getTimeInMillis(), 604800000L, d(context, i));
    }

    public void a(Context context) {
        h.a.a.a("Disable all alarm handlers", new Object[0]);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        for (PendingIntent pendingIntent : e(context)) {
            alarmManager.cancel(pendingIntent);
        }
    }

    public void f(Context context) {
        Set<a> c2 = b.a(context).c();
        a(context);
        c(context, c2);
    }

    public void h(Context context) {
        String d2 = b.a(context).d();
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 134217728);
        i.c cVar = new i.c(context, "openWorkout_notify");
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel("openWorkout_notify", "openWorkout notification", 3));
        }
        cVar.i(R.drawable.ic_openworkout);
        cVar.g(context.getString(R.string.app_name));
        cVar.f(d2);
        cVar.d(true);
        cVar.e(activity);
        ((NotificationManager) context.getSystemService("notification")).notify(1, cVar.a());
    }
}
