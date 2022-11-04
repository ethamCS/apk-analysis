package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import c2.p;
import java.util.ArrayList;
import java.util.List;
import u1.k;
/* loaded from: classes.dex */
public class c {

    /* renamed from: e */
    private static final String f5338e = k.f("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f5339a;

    /* renamed from: b */
    private final int f5340b;

    /* renamed from: c */
    private final e f5341c;

    /* renamed from: d */
    private final y1.d f5342d;

    public c(Context context, int i10, e eVar) {
        this.f5339a = context;
        this.f5340b = i10;
        this.f5341c = eVar;
        this.f5342d = new y1.d(context, eVar.f(), null);
    }

    public void a() {
        List<p> r10 = this.f5341c.g().p().O().r();
        ConstraintProxy.a(this.f5339a, r10);
        this.f5342d.d(r10);
        ArrayList<p> arrayList = new ArrayList(r10.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p pVar : r10) {
            String str = pVar.f6164a;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.f5342d.c(str))) {
                arrayList.add(pVar);
            }
        }
        for (p pVar2 : arrayList) {
            String str2 = pVar2.f6164a;
            Intent c10 = b.c(this.f5339a, str2);
            k.c().a(f5338e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f5341c;
            eVar.k(new e.b(eVar, c10, this.f5340b));
        }
        this.f5342d.e();
    }
}
