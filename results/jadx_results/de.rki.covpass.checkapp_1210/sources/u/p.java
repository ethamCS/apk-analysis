package u;

import android.util.Size;
import java.util.ArrayList;
import java.util.Comparator;
import t.y;
/* loaded from: classes.dex */
public class p {

    /* renamed from: b */
    private static final Size f22478b = new Size(320, 240);

    /* renamed from: c */
    private static final Comparator<Size> f22479c = new androidx.camera.core.impl.utils.c();

    /* renamed from: a */
    private final y f22480a = (y) t.l.a(y.class);

    public Size[] a(Size[] sizeArr) {
        if (this.f22480a == null || !y.a()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f22479c.compare(size, f22478b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
