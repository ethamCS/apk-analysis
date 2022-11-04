package androidx.coordinatorlayout.widget;

import androidx.core.util.e;
import androidx.core.util.f;
import i0.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a */
    private final e<ArrayList<T>> f3338a = new f(10);

    /* renamed from: b */
    private final g<T, ArrayList<T>> f3339b = new g<>();

    /* renamed from: c */
    private final ArrayList<T> f3340c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f3341d = new HashSet<>();

    private void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (hashSet.contains(t10)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t10);
        ArrayList<T> arrayList2 = this.f3339b.get(t10);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t10);
        arrayList.add(t10);
    }

    private ArrayList<T> f() {
        ArrayList<T> b10 = this.f3338a.b();
        return b10 == null ? new ArrayList<>() : b10;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3338a.a(arrayList);
    }

    public void a(T t10, T t11) {
        if (!this.f3339b.containsKey(t10) || !this.f3339b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f3339b.get(t10);
        if (arrayList == null) {
            arrayList = f();
            this.f3339b.put(t10, arrayList);
        }
        arrayList.add(t11);
    }

    public void b(T t10) {
        if (!this.f3339b.containsKey(t10)) {
            this.f3339b.put(t10, null);
        }
    }

    public void c() {
        int size = this.f3339b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> n10 = this.f3339b.n(i10);
            if (n10 != null) {
                k(n10);
            }
        }
        this.f3339b.clear();
    }

    public boolean d(T t10) {
        return this.f3339b.containsKey(t10);
    }

    public List g(T t10) {
        return this.f3339b.get(t10);
    }

    public List<T> h(T t10) {
        int size = this.f3339b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> n10 = this.f3339b.n(i10);
            if (n10 != null && n10.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3339b.j(i10));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f3340c.clear();
        this.f3341d.clear();
        int size = this.f3339b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f3339b.j(i10), this.f3340c, this.f3341d);
        }
        return this.f3340c;
    }

    public boolean j(T t10) {
        int size = this.f3339b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> n10 = this.f3339b.n(i10);
            if (n10 != null && n10.contains(t10)) {
                return true;
            }
        }
        return false;
    }
}
