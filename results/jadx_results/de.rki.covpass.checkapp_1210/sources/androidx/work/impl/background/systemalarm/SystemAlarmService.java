package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.z;
import androidx.work.impl.background.systemalarm.e;
import d2.j;
import u1.k;
/* loaded from: classes.dex */
public class SystemAlarmService extends z implements e.c {

    /* renamed from: x */
    private static final String f5330x = k.f("SystemAlarmService");

    /* renamed from: d */
    private e f5331d;

    /* renamed from: q */
    private boolean f5332q;

    private void h() {
        e eVar = new e(this);
        this.f5331d = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void a() {
        this.f5332q = true;
        k.c().a(f5330x, "All commands completed in dispatcher", new Throwable[0]);
        j.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onCreate() {
        super.onCreate();
        h();
        this.f5332q = false;
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f5332q = true;
        this.f5331d.j();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f5332q) {
            k.c().d(f5330x, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f5331d.j();
            h();
            this.f5332q = false;
        }
        if (intent != null) {
            this.f5331d.b(intent, i11);
            return 3;
        }
        return 3;
    }
}
