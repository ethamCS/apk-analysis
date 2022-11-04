package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* loaded from: classes.dex */
public class z extends Service implements v {

    /* renamed from: c */
    private final r0 f4408c = new r0(this);

    @Override // androidx.lifecycle.v
    public m c() {
        return this.f4408c.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f4408c.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f4408c.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f4408c.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f4408c.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
