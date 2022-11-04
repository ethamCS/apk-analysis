package z1;

import android.content.Context;
import android.os.Build;
import c2.p;
import u1.k;
import u1.l;
/* loaded from: classes.dex */
public class f extends c<y1.b> {

    /* renamed from: e */
    private static final String f26444e = k.f("NetworkNotRoamingCtrlr");

    public f(Context context, e2.a aVar) {
        super(a2.g.c(context, aVar).d());
    }

    @Override // z1.c
    boolean b(p pVar) {
        return pVar.f6173j.b() == l.NOT_ROAMING;
    }

    /* renamed from: i */
    public boolean c(y1.b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return !bVar.a() || !bVar.c();
        }
        k.c().a(f26444e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
