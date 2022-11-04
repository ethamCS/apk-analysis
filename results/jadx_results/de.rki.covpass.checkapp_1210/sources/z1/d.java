package z1;

import android.content.Context;
import android.os.Build;
import c2.p;
import u1.l;
/* loaded from: classes.dex */
public class d extends c<y1.b> {
    public d(Context context, e2.a aVar) {
        super(a2.g.c(context, aVar).d());
    }

    @Override // z1.c
    boolean b(p pVar) {
        return pVar.f6173j.b() == l.CONNECTED;
    }

    /* renamed from: i */
    public boolean c(y1.b bVar) {
        return Build.VERSION.SDK_INT >= 26 ? !bVar.a() || !bVar.d() : !bVar.a();
    }
}
