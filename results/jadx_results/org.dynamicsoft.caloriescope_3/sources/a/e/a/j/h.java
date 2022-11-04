package a.e.a.j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    public List<f> f141a;

    /* renamed from: b */
    int f142b;

    /* renamed from: c */
    int f143c;
    public boolean d;
    public final int[] e;
    List<f> f;
    List<f> g;
    HashSet<f> h;
    HashSet<f> i;
    List<f> j;
    List<f> k;

    public h(List<f> list) {
        this.f142b = -1;
        this.f143c = -1;
        this.d = false;
        this.e = new int[]{-1, -1};
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f141a = list;
    }

    public h(List<f> list, boolean z) {
        this.f142b = -1;
        this.f143c = -1;
        this.d = false;
        this.e = new int[]{-1, -1};
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f141a = list;
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(a.e.a.j.f r7) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.j.h.a(a.e.a.j.f):void");
    }

    private void a(ArrayList<f> arrayList, f fVar) {
        if (fVar.d0) {
            return;
        }
        arrayList.add(fVar);
        fVar.d0 = true;
        if (fVar.y()) {
            return;
        }
        if (fVar instanceof j) {
            j jVar = (j) fVar;
            int i = jVar.l0;
            for (int i2 = 0; i2 < i; i2++) {
                a(arrayList, jVar.k0[i2]);
            }
        }
        int length = fVar.A.length;
        for (int i3 = 0; i3 < length; i3++) {
            e eVar = fVar.A[i3].d;
            if (eVar != null) {
                f fVar2 = eVar.f125b;
                if (eVar != null && fVar2 != fVar.k()) {
                    a(arrayList, fVar2);
                }
            }
        }
    }

    public List<f> a() {
        if (!this.j.isEmpty()) {
            return this.j;
        }
        int size = this.f141a.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.f141a.get(i);
            if (!fVar.b0) {
                a((ArrayList) this.j, fVar);
            }
        }
        this.k.clear();
        this.k.addAll(this.f141a);
        this.k.removeAll(this.j);
        return this.j;
    }

    public List<f> a(int i) {
        if (i == 0) {
            return this.f;
        }
        if (i != 1) {
            return null;
        }
        return this.g;
    }

    public void a(f fVar, int i) {
        HashSet<f> hashSet;
        if (i == 0) {
            hashSet = this.h;
        } else if (i != 1) {
            return;
        } else {
            hashSet = this.i;
        }
        hashSet.add(fVar);
    }

    public Set<f> b(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i != 1) {
            return null;
        }
        return this.i;
    }

    public void b() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            a(this.k.get(i));
        }
    }
}
