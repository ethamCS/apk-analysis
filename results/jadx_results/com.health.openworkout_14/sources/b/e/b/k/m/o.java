package b.e.b.k.m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o {

    /* renamed from: f */
    static int f2317f;

    /* renamed from: b */
    int f2319b;

    /* renamed from: c */
    int f2320c;

    /* renamed from: a */
    ArrayList<b.e.b.k.e> f2318a = new ArrayList<>();

    /* renamed from: d */
    ArrayList<a> f2321d = null;

    /* renamed from: e */
    private int f2322e = -1;

    /* loaded from: classes.dex */
    public class a {
        public a(o oVar, b.e.b.k.e eVar, b.e.b.d dVar, int i) {
            new WeakReference(eVar);
            dVar.x(eVar.F);
            dVar.x(eVar.G);
            dVar.x(eVar.H);
            dVar.x(eVar.I);
            dVar.x(eVar.J);
        }
    }

    public o(int i) {
        this.f2319b = -1;
        this.f2320c = 0;
        int i2 = f2317f;
        f2317f = i2 + 1;
        this.f2319b = i2;
        this.f2320c = i;
    }

    private String e() {
        int i = this.f2320c;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    private int j(b.e.b.d dVar, ArrayList<b.e.b.k.e> arrayList, int i) {
        int x;
        b.e.b.k.d dVar2;
        b.e.b.k.f fVar = (b.e.b.k.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).g(dVar, false);
        }
        if (i == 0 && fVar.y0 > 0) {
            b.e.b.k.b.b(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.z0 > 0) {
            b.e.b.k.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f2321d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f2321d.add(new a(this, arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            x = dVar.x(fVar.F);
            dVar2 = fVar.H;
        } else {
            x = dVar.x(fVar.G);
            dVar2 = fVar.I;
        }
        int x2 = dVar.x(dVar2);
        dVar.D();
        return x2 - x;
    }

    public boolean a(b.e.b.k.e eVar) {
        if (this.f2318a.contains(eVar)) {
            return false;
        }
        this.f2318a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f2318a.size();
        if (this.f2322e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o oVar = arrayList.get(i);
                if (this.f2322e == oVar.f2319b) {
                    g(this.f2320c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f2319b;
    }

    public int d() {
        return this.f2320c;
    }

    public int f(b.e.b.d dVar, int i) {
        if (this.f2318a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f2318a, i);
    }

    public void g(int i, o oVar) {
        Iterator<b.e.b.k.e> it = this.f2318a.iterator();
        while (it.hasNext()) {
            b.e.b.k.e next = it.next();
            oVar.a(next);
            int c2 = oVar.c();
            if (i == 0) {
                next.m0 = c2;
            } else {
                next.n0 = c2;
            }
        }
        this.f2322e = oVar.f2319b;
    }

    public void h(boolean z) {
    }

    public void i(int i) {
        this.f2320c = i;
    }

    public String toString() {
        Iterator<b.e.b.k.e> it;
        String str = e() + " [" + this.f2319b + "] <";
        while (this.f2318a.iterator().hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
