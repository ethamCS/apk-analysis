package w;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import w.o0;
/* loaded from: classes.dex */
public class u1 implements o0 {
    protected static final Comparator<o0.a<?>> A;
    private static final u1 B;

    /* renamed from: z */
    protected final TreeMap<o0.a<?>, Map<o0.c, Object>> f24601z;

    static {
        t1 t1Var = t1.f24598c;
        A = t1Var;
        B = new u1(new TreeMap(t1Var));
    }

    public u1(TreeMap<o0.a<?>, Map<o0.c, Object>> treeMap) {
        this.f24601z = treeMap;
    }

    public static u1 I() {
        return B;
    }

    public static u1 J(o0 o0Var) {
        if (u1.class.equals(o0Var.getClass())) {
            return (u1) o0Var;
        }
        TreeMap treeMap = new TreeMap(A);
        for (o0.a<?> aVar : o0Var.c()) {
            Set<o0.c> x10 = o0Var.x(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (o0.c cVar : x10) {
                arrayMap.put(cVar, o0Var.t(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new u1(treeMap);
    }

    public static /* synthetic */ int K(o0.a aVar, o0.a aVar2) {
        return aVar.c().compareTo(aVar2.c());
    }

    @Override // w.o0
    public <ValueT> ValueT a(o0.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) b(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // w.o0
    public <ValueT> ValueT b(o0.a<ValueT> aVar) {
        Map<o0.c, Object> map = this.f24601z.get(aVar);
        if (map != null) {
            return (ValueT) map.get((o0.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // w.o0
    public Set<o0.a<?>> c() {
        return Collections.unmodifiableSet(this.f24601z.keySet());
    }

    @Override // w.o0
    public o0.c d(o0.a<?> aVar) {
        Map<o0.c, Object> map = this.f24601z.get(aVar);
        if (map != null) {
            return (o0.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // w.o0
    public boolean e(o0.a<?> aVar) {
        return this.f24601z.containsKey(aVar);
    }

    @Override // w.o0
    public <ValueT> ValueT t(o0.a<ValueT> aVar, o0.c cVar) {
        Map<o0.c, Object> map = this.f24601z.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        } else if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    @Override // w.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(java.lang.String r4, w.o0.b r5) {
        /*
            r3 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            w.o0$a r0 = w.o0.a.a(r4, r0)
            java.util.TreeMap<w.o0$a<?>, java.util.Map<w.o0$c, java.lang.Object>> r1 = r3.f24601z
            java.util.SortedMap r0 = r1.tailMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            w.o0$a r2 = (w.o0.a) r2
            java.lang.String r2 = r2.c()
            boolean r2 = r2.startsWith(r4)
            if (r2 != 0) goto L31
            goto L3d
        L31:
            java.lang.Object r1 = r1.getKey()
            w.o0$a r1 = (w.o0.a) r1
            boolean r1 = r5.a(r1)
            if (r1 != 0) goto L14
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.u1.v(java.lang.String, w.o0$b):void");
    }

    @Override // w.o0
    public Set<o0.c> x(o0.a<?> aVar) {
        Map<o0.c, Object> map = this.f24601z.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }
}
