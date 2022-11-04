package w;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import w.o0;
/* loaded from: classes.dex */
public final class q1 extends u1 implements p1 {
    private static final o0.c C = o0.c.OPTIONAL;

    private q1(TreeMap<o0.a<?>, Map<o0.c, Object>> treeMap) {
        super(treeMap);
    }

    public static q1 L() {
        return new q1(new TreeMap(u1.A));
    }

    public static q1 M(o0 o0Var) {
        TreeMap treeMap = new TreeMap(u1.A);
        for (o0.a<?> aVar : o0Var.c()) {
            Set<o0.c> x10 = o0Var.x(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (o0.c cVar : x10) {
                arrayMap.put(cVar, o0Var.t(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new q1(treeMap);
    }

    @Override // w.p1
    public <ValueT> void G(o0.a<ValueT> aVar, o0.c cVar, ValueT valuet) {
        Map<o0.c, Object> map = this.f24601z.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f24601z.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        o0.c cVar2 = (o0.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !n0.a(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    public <ValueT> ValueT N(o0.a<ValueT> aVar) {
        return (ValueT) this.f24601z.remove(aVar);
    }

    @Override // w.p1
    public <ValueT> void g(o0.a<ValueT> aVar, ValueT valuet) {
        G(aVar, C, valuet);
    }
}
