package androidx.coordinatorlayout.widget;

import b.d.g;
import b.g.k.e;
import b.g.k.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a */
    private final e<ArrayList<T>> f862a = new f(10);

    /* renamed from: b */
    private final g<T, ArrayList<T>> f863b = new g<>();

    /* renamed from: c */
    private final ArrayList<T> f864c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f865d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f863b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    private ArrayList<T> f() {
        ArrayList<T> b2 = this.f862a.b();
        return b2 == null ? new ArrayList<>() : b2;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f862a.a(arrayList);
    }

    public void a(T t, T t2) {
        if (!this.f863b.containsKey(t) || !this.f863b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f863b.get(t);
        if (arrayList == null) {
            arrayList = f();
            this.f863b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public void b(T t) {
        if (!this.f863b.containsKey(t)) {
            this.f863b.put(t, null);
        }
    }

    public void c() {
        int size = this.f863b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.f863b.m(i);
            if (m != null) {
                k(m);
            }
        }
        this.f863b.clear();
    }

    public boolean d(T t) {
        return this.f863b.containsKey(t);
    }

    public List g(T t) {
        return this.f863b.get(t);
    }

    public List<T> h(T t) {
        int size = this.f863b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.f863b.m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f863b.i(i));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f864c.clear();
        this.f865d.clear();
        int size = this.f863b.size();
        for (int i = 0; i < size; i++) {
            e(this.f863b.i(i), this.f864c, this.f865d);
        }
        return this.f864c;
    }

    public boolean j(T t) {
        int size = this.f863b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m = this.f863b.m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
