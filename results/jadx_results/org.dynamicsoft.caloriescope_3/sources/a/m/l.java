package a.m;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private ViewGroup f367a;

    /* renamed from: b */
    private Runnable f368b;

    public static l a(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.transition_current_scene);
    }

    public static void a(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.transition_current_scene, lVar);
    }

    public void a() {
        Runnable runnable;
        if (a(this.f367a) != this || (runnable = this.f368b) == null) {
            return;
        }
        runnable.run();
    }
}
