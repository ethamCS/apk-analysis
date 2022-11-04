package w;

import android.util.Size;
import android.view.Surface;
/* loaded from: classes.dex */
public abstract class v1 {
    public static v1 a(Surface surface, Size size, int i10) {
        return new d(surface, size, i10);
    }

    public abstract int b();

    public abstract Size c();

    public abstract Surface d();
}
