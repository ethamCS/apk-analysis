package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import androidx.work.impl.WorkDatabase;
import c2.n;
import c2.p;
import c2.q;
import java.util.List;
import java.util.concurrent.TimeUnit;
import u1.k;
import u1.s;
import v1.f;
import v1.h;
import v1.i;
import x1.b;
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: x */
    private static final String f5383x = k.f("ForceStopRunnable");

    /* renamed from: y */
    private static final long f5384y = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: c */
    private final Context f5385c;

    /* renamed from: d */
    private final i f5386d;

    /* renamed from: q */
    private int f5387q = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f5388a = k.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            k.c().g(f5388a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.f5385c = context.getApplicationContext();
        this.f5386d = iVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d10 = d(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f5384y;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean i10 = b.i(this.f5385c, this.f5386d);
        WorkDatabase p10 = this.f5386d.p();
        q O = p10.O();
        n N = p10.N();
        p10.e();
        try {
            List<p> b10 = O.b();
            boolean z10 = b10 != null && !b10.isEmpty();
            if (z10) {
                for (p pVar : b10) {
                    O.l(s.a.ENQUEUED, pVar.f6164a);
                    O.d(pVar.f6164a, -1L);
                }
            }
            N.b();
            p10.D();
            return z10 || i10;
        } finally {
            p10.i();
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            k.c().a(f5383x, "Rescheduling Workers.", new Throwable[0]);
            this.f5386d.t();
            this.f5386d.l().c(false);
        } else if (e()) {
            k.c().a(f5383x, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f5386d.t();
        } else if (a10) {
            k.c().a(f5383x, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f5386d.i(), this.f5386d.p(), this.f5386d.o());
        }
        this.f5386d.s();
    }

    public boolean e() {
        if (d(this.f5385c, 536870912) == null) {
            g(this.f5385c);
            return true;
        }
        return false;
    }

    public boolean f() {
        if (this.f5386d.n() == null) {
            return true;
        }
        k c10 = k.c();
        String str = f5383x;
        c10.a(str, "Found a remote implementation for WorkManager", new Throwable[0]);
        boolean b10 = d2.f.b(this.f5385c, this.f5386d.i());
        k.c().a(str, String.format("Is default app process = %s", Boolean.valueOf(b10)), new Throwable[0]);
        return b10;
    }

    boolean h() {
        return this.f5386d.l().a();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        if (!f()) {
            return;
        }
        while (true) {
            h.e(this.f5385c);
            k.c().a(f5383x, "Performing cleanup operations.", new Throwable[0]);
            try {
                b();
                return;
            } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                i10 = this.f5387q + 1;
                this.f5387q = i10;
                if (i10 >= 3) {
                    k c10 = k.c();
                    String str = f5383x;
                    c10.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                    IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                    u1.h c11 = this.f5386d.i().c();
                    if (c11 == null) {
                        throw illegalStateException;
                    }
                    k.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                    c11.a(illegalStateException);
                    return;
                }
                k.c().a(f5383x, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                i(this.f5387q * 300);
            }
            k.c().a(f5383x, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
            i(this.f5387q * 300);
        }
    }
}
