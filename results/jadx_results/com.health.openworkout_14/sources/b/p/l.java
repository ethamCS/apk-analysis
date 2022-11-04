package b.p;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private ViewGroup f2750a;

    /* renamed from: b */
    private Runnable f2751b;

    public static l b(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.c_res_0x7f0901e3);
    }

    public static void c(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.c_res_0x7f0901e3, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f2750a) != this || (runnable = this.f2751b) == null) {
            return;
        }
        runnable.run();
    }
}
