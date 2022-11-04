package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import c2.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import u1.f;
import u1.k;
import v1.i;
import y1.c;
import y1.d;
/* loaded from: classes.dex */
public class a implements c, v1.b {
    static final String Z3 = k.f("SystemFgDispatcher");
    final d X3;
    private b Y3;

    /* renamed from: c */
    private Context f5375c;

    /* renamed from: d */
    private i f5376d;

    /* renamed from: q */
    private final e2.a f5377q;

    /* renamed from: x */
    final Object f5378x = new Object();

    /* renamed from: y */
    String f5379y = null;
    final Map<String, f> U3 = new LinkedHashMap();
    final Set<p> W3 = new HashSet();
    final Map<String, p> V3 = new HashMap();

    /* renamed from: androidx.work.impl.foreground.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0071a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ WorkDatabase f5380c;

        /* renamed from: d */
        final /* synthetic */ String f5381d;

        RunnableC0071a(WorkDatabase workDatabase, String str) {
            a.this = r1;
            this.f5380c = workDatabase;
            this.f5381d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p j10 = this.f5380c.O().j(this.f5381d);
            if (j10 == null || !j10.b()) {
                return;
            }
            synchronized (a.this.f5378x) {
                a.this.V3.put(this.f5381d, j10);
                a.this.W3.add(j10);
                a aVar = a.this;
                aVar.X3.d(aVar.W3);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void b(int i10);

        void d(int i10, int i11, Notification notification);

        void e(int i10, Notification notification);

        void stop();
    }

    public a(Context context) {
        this.f5375c = context;
        i k10 = i.k(context);
        this.f5376d = k10;
        e2.a q10 = k10.q();
        this.f5377q = q10;
        this.X3 = new d(this.f5375c, q10, this);
        this.f5376d.m().c(this);
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void e(Intent intent) {
        k.c().d(Z3, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f5376d.f(UUID.fromString(stringExtra));
    }

    private void f(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        k.c().a(Z3, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.Y3 == null) {
            return;
        }
        this.U3.put(stringExtra, new f(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f5379y)) {
            this.f5379y = stringExtra;
            this.Y3.d(intExtra, intExtra2, notification);
            return;
        }
        this.Y3.e(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, f> entry : this.U3.entrySet()) {
            i10 |= entry.getValue().a();
        }
        f fVar = this.U3.get(this.f5379y);
        if (fVar == null) {
            return;
        }
        this.Y3.d(fVar.c(), i10, fVar.b());
    }

    private void g(Intent intent) {
        k.c().d(Z3, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f5377q.b(new RunnableC0071a(this.f5376d.p(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // v1.b
    public void a(String str, boolean z10) {
        Map.Entry<String, f> next;
        synchronized (this.f5378x) {
            p remove = this.V3.remove(str);
            if (remove != null ? this.W3.remove(remove) : false) {
                this.X3.d(this.W3);
            }
        }
        f remove2 = this.U3.remove(str);
        if (str.equals(this.f5379y) && this.U3.size() > 0) {
            Iterator<Map.Entry<String, f>> it = this.U3.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f5379y = next.getKey();
            if (this.Y3 != null) {
                f value = next.getValue();
                this.Y3.d(value.c(), value.a(), value.b());
                this.Y3.b(value.c());
            }
        }
        b bVar = this.Y3;
        if (remove2 == null || bVar == null) {
            return;
        }
        k.c().a(Z3, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())), new Throwable[0]);
        bVar.b(remove2.c());
    }

    @Override // y1.c
    public void c(List<String> list) {
        if (!list.isEmpty()) {
            for (String str : list) {
                k.c().a(Z3, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                this.f5376d.x(str);
            }
        }
    }

    @Override // y1.c
    public void d(List<String> list) {
    }

    void h(Intent intent) {
        k.c().d(Z3, "Stopping foreground service", new Throwable[0]);
        b bVar = this.Y3;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void i() {
        this.Y3 = null;
        synchronized (this.f5378x) {
            this.X3.e();
        }
        this.f5376d.m().h(this);
    }

    public void j(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            g(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                e(intent);
                return;
            } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return;
            } else {
                h(intent);
                return;
            }
        }
        f(intent);
    }

    public void k(b bVar) {
        if (this.Y3 != null) {
            k.c().b(Z3, "A callback already exists.", new Throwable[0]);
        } else {
            this.Y3 = bVar;
        }
    }
}
