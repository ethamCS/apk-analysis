package androidx.coordinatorlayout.widget;

import a.d.g;
import a.g.k.e;
import a.g.k.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a */
    private final e<ArrayList<T>> f819a = new f(10);

    /* renamed from: b */
    private final g<T, ArrayList<T>> f820b = new g<>();

    /* renamed from: c */
    private final ArrayList<T> f821c = new ArrayList<>();
    private final HashSet<T> d = new HashSet<>();

    private void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f820b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    private void a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f819a.a(arrayList);
    }

    private ArrayList<T> c() {
        ArrayList<T> a2 = this.f819a.a();
        return a2 == null ? new ArrayList<>() : a2;
    }

    public void a() {
        int size = this.f820b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> d = this.f820b.d(i);
            if (d != null) {
                a((ArrayList) d);
            }
        }
        this.f820b.clear();
    }

    public void a(T t) {
        if (!this.f820b.containsKey(t)) {
            this.f820b.put(t, null);
        }
    }

    public void a(T t, T t2) {
        if (!this.f820b.containsKey(t) || !this.f820b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f820b.get(t);
        if (arrayList == null) {
            arrayList = c();
            this.f820b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public ArrayList<T> b() {
        this.f821c.clear();
        this.d.clear();
        int size = this.f820b.size();
        for (int i = 0; i < size; i++) {
            a(this.f820b.b(i), this.f821c, this.d);
        }
        return this.f821c;
    }

    public boolean b(T t) {
        return this.f820b.containsKey(t);
    }

    public List c(T t) {
        return this.f820b.get(t);
    }

    public List<T> d(T t) {
        int size = this.f820b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> d = this.f820b.d(i);
            if (d != null && d.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f820b.b(i));
            }
        }
        return arrayList;
    }

    public boolean e(T t) {
        int size = this.f820b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> d = this.f820b.d(i);
            if (d != null && d.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
