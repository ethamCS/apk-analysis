package u;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import w.h2;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a */
    private final t.o f22476a;

    public n() {
        this((t.o) t.l.a(t.o.class));
    }

    n(t.o oVar) {
        this.f22476a = oVar;
    }

    public List<Size> a(h2.b bVar, List<Size> list) {
        Size a10;
        t.o oVar = this.f22476a;
        if (oVar == null || (a10 = oVar.a(bVar)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a10);
        for (Size size : list) {
            if (!size.equals(a10)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }
}
