package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import u1.k;
import u1.m;
import u1.t;
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f5361a = k.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        k.c().a(f5361a, "Requesting diagnostics", new Throwable[0]);
        try {
            t.d(context).c(m.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            k.c().b(f5361a, "WorkManager is not initialized", e10);
        }
    }
}
