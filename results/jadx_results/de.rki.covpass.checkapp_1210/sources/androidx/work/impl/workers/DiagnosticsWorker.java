package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import c2.g;
import c2.h;
import c2.p;
import c2.q;
import c2.t;
import java.util.List;
import java.util.concurrent.TimeUnit;
import u1.k;
import v1.i;
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    private static final String V3 = k.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String q(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f6164a, pVar.f6166c, num, pVar.f6165b.name(), str, str2);
    }

    private static String r(c2.k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        for (p pVar : list) {
            Integer num = null;
            g c10 = hVar.c(pVar.f6164a);
            if (c10 != null) {
                num = Integer.valueOf(c10.f6142b);
            }
            sb2.append(q(pVar, TextUtils.join(",", kVar.b(pVar.f6164a)), num, TextUtils.join(",", tVar.b(pVar.f6164a))));
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a p() {
        WorkDatabase p10 = i.k(a()).p();
        q O = p10.O();
        c2.k M = p10.M();
        t P = p10.P();
        h L = p10.L();
        List<p> g10 = O.g(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<p> b10 = O.b();
        List<p> s10 = O.s(200);
        if (g10 != null && !g10.isEmpty()) {
            k c10 = k.c();
            String str = V3;
            c10.d(str, "Recently completed work:\n\n", new Throwable[0]);
            k.c().d(str, r(M, P, L, g10), new Throwable[0]);
        }
        if (b10 != null && !b10.isEmpty()) {
            k c11 = k.c();
            String str2 = V3;
            c11.d(str2, "Running work:\n\n", new Throwable[0]);
            k.c().d(str2, r(M, P, L, b10), new Throwable[0]);
        }
        if (s10 != null && !s10.isEmpty()) {
            k c12 = k.c();
            String str3 = V3;
            c12.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            k.c().d(str3, r(M, P, L, s10), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
