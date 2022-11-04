package androidx.camera.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b */
    public static final s f2463b = new a().d(0).b();

    /* renamed from: c */
    public static final s f2464c = new a().d(1).b();

    /* renamed from: a */
    private LinkedHashSet<q> f2465a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final LinkedHashSet<q> f2466a;

        public a() {
            this.f2466a = new LinkedHashSet<>();
        }

        private a(LinkedHashSet<q> linkedHashSet) {
            this.f2466a = new LinkedHashSet<>(linkedHashSet);
        }

        public static a c(s sVar) {
            return new a(sVar.c());
        }

        public a a(q qVar) {
            this.f2466a.add(qVar);
            return this;
        }

        public s b() {
            return new s(this.f2466a);
        }

        public a d(int i10) {
            this.f2466a.add(new w.j1(i10));
            return this;
        }
    }

    s(LinkedHashSet<q> linkedHashSet) {
        this.f2465a = linkedHashSet;
    }

    public LinkedHashSet<w.d0> a(LinkedHashSet<w.d0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<w.d0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        List<r> b10 = b(arrayList);
        LinkedHashSet<w.d0> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<w.d0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            w.d0 next = it2.next();
            if (b10.contains(next.a())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public List<r> b(List<r> list) {
        List<r> arrayList = new ArrayList<>(list);
        Iterator<q> it = this.f2465a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<q> c() {
        return this.f2465a;
    }

    public Integer d() {
        Iterator<q> it = this.f2465a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            q next = it.next();
            if (next instanceof w.j1) {
                Integer valueOf = Integer.valueOf(((w.j1) next).c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public w.d0 e(LinkedHashSet<w.d0> linkedHashSet) {
        Iterator<w.d0> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
