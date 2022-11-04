package u;

import androidx.camera.core.s1;
import java.util.List;
import t.a0;
import t.w;
import w.r0;
import w.y1;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final boolean f22469a;

    /* renamed from: b */
    private final boolean f22470b;

    /* renamed from: c */
    private final boolean f22471c;

    public h(y1 y1Var, y1 y1Var2) {
        this.f22469a = y1Var2.a(a0.class);
        this.f22470b = y1Var.a(w.class);
        this.f22471c = y1Var.a(t.j.class);
    }

    public void a(List<r0> list) {
        if (!b() || list == null) {
            return;
        }
        for (r0 r0Var : list) {
            r0Var.c();
        }
        s1.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f22469a || this.f22470b || this.f22471c;
    }
}
