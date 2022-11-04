package w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class y1 {

    /* renamed from: a */
    private final List<x1> f24616a;

    public y1(List<x1> list) {
        this.f24616a = new ArrayList(list);
    }

    public boolean a(Class<? extends x1> cls) {
        for (x1 x1Var : this.f24616a) {
            if (cls.isAssignableFrom(x1Var.getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends x1> T b(Class<T> cls) {
        Iterator<x1> it = this.f24616a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }
}
