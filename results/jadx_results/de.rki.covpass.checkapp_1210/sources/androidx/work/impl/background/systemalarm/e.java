package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import d2.g;
import d2.j;
import d2.m;
import java.util.ArrayList;
import java.util.List;
import u1.k;
import v1.i;
/* loaded from: classes.dex */
public class e implements v1.b {
    static final String Z3 = k.f("SystemAlarmDispatcher");
    final androidx.work.impl.background.systemalarm.b U3;
    private final Handler V3;
    final List<Intent> W3;
    Intent X3;
    private c Y3;

    /* renamed from: c */
    final Context f5348c;

    /* renamed from: d */
    private final e2.a f5349d;

    /* renamed from: q */
    private final m f5350q;

    /* renamed from: x */
    private final v1.d f5351x;

    /* renamed from: y */
    private final i f5352y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            e eVar;
            synchronized (e.this.W3) {
                e eVar2 = e.this;
                eVar2.X3 = eVar2.W3.get(0);
            }
            Intent intent = e.this.X3;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.X3.getIntExtra("KEY_START_ID", 0);
                k c10 = k.c();
                String str = e.Z3;
                c10.a(str, String.format("Processing command %s, %s", e.this.X3, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b10 = j.b(e.this.f5348c, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    k.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b10), new Throwable[0]);
                    b10.acquire();
                    e eVar3 = e.this;
                    eVar3.U3.o(eVar3.X3, intExtra, eVar3);
                    k.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                    b10.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th2) {
                    try {
                        k c11 = k.c();
                        String str2 = e.Z3;
                        c11.b(str2, "Unexpected error in onHandleIntent", th2);
                        k.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                        b10.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th3) {
                        k.c().a(e.Z3, String.format("Releasing operation wake lock (%s) %s", action, b10), new Throwable[0]);
                        b10.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th3;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: c */
        private final e f5354c;

        /* renamed from: d */
        private final Intent f5355d;

        /* renamed from: q */
        private final int f5356q;

        public b(e eVar, Intent intent, int i10) {
            this.f5354c = eVar;
            this.f5355d = intent;
            this.f5356q = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5354c.b(this.f5355d, this.f5356q);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    static class d implements Runnable {

        /* renamed from: c */
        private final e f5357c;

        d(e eVar) {
            this.f5357c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5357c.d();
        }
    }

    public e(Context context) {
        this(context, null, null);
    }

    e(Context context, v1.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5348c = applicationContext;
        this.U3 = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f5350q = new m();
        iVar = iVar == null ? i.k(context) : iVar;
        this.f5352y = iVar;
        dVar = dVar == null ? iVar.m() : dVar;
        this.f5351x = dVar;
        this.f5349d = iVar.q();
        dVar.c(this);
        this.W3 = new ArrayList();
        this.X3 = null;
        this.V3 = new Handler(Looper.getMainLooper());
    }

    private void c() {
        if (this.V3.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    private boolean i(String str) {
        c();
        synchronized (this.W3) {
            for (Intent intent : this.W3) {
                if (str.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        c();
        PowerManager.WakeLock b10 = j.b(this.f5348c, "ProcessCommand");
        try {
            b10.acquire();
            this.f5352y.q().b(new a());
        } finally {
            b10.release();
        }
    }

    @Override // v1.b
    public void a(String str, boolean z10) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.d(this.f5348c, str, z10), 0));
    }

    public boolean b(Intent intent, int i10) {
        k c10 = k.c();
        String str = Z3;
        boolean z10 = false;
        c10.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            k.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.W3) {
                if (!this.W3.isEmpty()) {
                    z10 = true;
                }
                this.W3.add(intent);
                if (!z10) {
                    l();
                }
            }
            return true;
        }
    }

    void d() {
        k c10 = k.c();
        String str = Z3;
        c10.a(str, "Checking if commands are complete.", new Throwable[0]);
        c();
        synchronized (this.W3) {
            if (this.X3 != null) {
                k.c().a(str, String.format("Removing command %s", this.X3), new Throwable[0]);
                if (!this.W3.remove(0).equals(this.X3)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.X3 = null;
            }
            g c11 = this.f5349d.c();
            if (!this.U3.n() && this.W3.isEmpty() && !c11.a()) {
                k.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.Y3;
                if (cVar != null) {
                    cVar.a();
                }
            } else if (!this.W3.isEmpty()) {
                l();
            }
        }
    }

    public v1.d e() {
        return this.f5351x;
    }

    public e2.a f() {
        return this.f5349d;
    }

    public i g() {
        return this.f5352y;
    }

    public m h() {
        return this.f5350q;
    }

    public void j() {
        k.c().a(Z3, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f5351x.h(this);
        this.f5350q.a();
        this.Y3 = null;
    }

    public void k(Runnable runnable) {
        this.V3.post(runnable);
    }

    public void m(c cVar) {
        if (this.Y3 != null) {
            k.c().b(Z3, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.Y3 = cVar;
        }
    }
}
