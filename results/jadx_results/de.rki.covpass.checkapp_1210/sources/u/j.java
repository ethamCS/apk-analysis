package u;

import android.util.Size;
import w.h2;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private final t.o f22472a;

    public j() {
        this((t.o) t.l.a(t.o.class));
    }

    j(t.o oVar) {
        this.f22472a = oVar;
    }

    public Size a(Size size) {
        Size a10;
        t.o oVar = this.f22472a;
        if (oVar == null || (a10 = oVar.a(h2.b.PRIV)) == null) {
            return size;
        }
        return a10.getWidth() * a10.getHeight() > size.getWidth() * size.getHeight() ? a10 : size;
    }
}
