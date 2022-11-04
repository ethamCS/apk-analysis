package u;

import androidx.camera.camera2.internal.o2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import w.y1;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    private final t.h f22468a;

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface a {
        void a(o2 o2Var);
    }

    public g(y1 y1Var) {
        this.f22468a = (t.h) y1Var.b(t.h.class);
    }

    private void a(Set<o2> set) {
        for (o2 o2Var : set) {
            o2Var.a().p(o2Var);
        }
    }

    private void b(Set<o2> set) {
        for (o2 o2Var : set) {
            o2Var.a().q(o2Var);
        }
    }

    public void c(o2 o2Var, List<o2> list, List<o2> list2, a aVar) {
        o2 next;
        o2 next2;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<o2> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != o2Var) {
                linkedHashSet.add(next2);
            }
            b(linkedHashSet);
        }
        aVar.a(o2Var);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<o2> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != o2Var) {
                linkedHashSet2.add(next);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f22468a != null;
    }
}
