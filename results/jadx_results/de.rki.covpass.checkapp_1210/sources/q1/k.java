package q1;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    private ViewGroup f19411a;

    /* renamed from: b */
    private Runnable f19412b;

    public static k b(ViewGroup viewGroup) {
        return (k) viewGroup.getTag(i.b_res_0x7f090287);
    }

    public static void c(ViewGroup viewGroup, k kVar) {
        viewGroup.setTag(i.b_res_0x7f090287, kVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f19411a) != this || (runnable = this.f19412b) == null) {
            return;
        }
        runnable.run();
    }
}
