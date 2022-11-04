package b.g.l;

import android.os.Build;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class v {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(b.g.b.g_res_0x7f0901bd);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && t.G(viewGroup) == null) ? false : true;
    }
}
