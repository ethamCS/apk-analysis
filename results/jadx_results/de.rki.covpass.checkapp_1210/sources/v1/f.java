package v1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c2.p;
import c2.q;
import java.util.List;
import u1.k;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    private static final String f23850a = k.f("Schedulers");

    public static e a(Context context, i iVar) {
        x1.b bVar = new x1.b(context, iVar);
        d2.d.a(context, SystemJobService.class, true);
        k.c().a(f23850a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return bVar;
    }

    public static void b(u1.b bVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q O = workDatabase.O();
        workDatabase.e();
        try {
            List<p> i10 = O.i(bVar.g());
            List<p> s10 = O.s(200);
            if (i10 != null && i10.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (p pVar : i10) {
                    O.d(pVar.f6164a, currentTimeMillis);
                }
            }
            workDatabase.D();
            if (i10 != null && i10.size() > 0) {
                p[] pVarArr = (p[]) i10.toArray(new p[i10.size()]);
                for (e eVar : list) {
                    if (eVar.f()) {
                        eVar.e(pVarArr);
                    }
                }
            }
            if (s10 == null || s10.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) s10.toArray(new p[s10.size()]);
            for (e eVar2 : list) {
                if (!eVar2.f()) {
                    eVar2.e(pVarArr2);
                }
            }
        } finally {
            workDatabase.i();
        }
    }
}
