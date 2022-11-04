package a.g.l;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    private Object f280a;

    private s(Object obj) {
        this.f280a = obj;
    }

    public static s a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new s(PointerIcon.getSystemIcon(context, i)) : new s(null);
    }

    public Object a() {
        return this.f280a;
    }
}
