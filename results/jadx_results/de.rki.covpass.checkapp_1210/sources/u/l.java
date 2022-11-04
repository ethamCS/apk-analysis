package u;

import w.y1;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private final boolean f22474a;

    /* renamed from: b */
    private boolean f22475b = false;

    public l(y1 y1Var) {
        boolean z10 = false;
        this.f22474a = y1Var.b(t.d.class) != null ? true : z10;
    }

    public void a() {
        this.f22475b = false;
    }

    public void b() {
        this.f22475b = true;
    }

    public boolean c(int i10) {
        return this.f22475b && i10 == 0 && this.f22474a;
    }
}
