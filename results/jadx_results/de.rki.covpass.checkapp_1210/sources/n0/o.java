package n0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o {

    /* renamed from: g */
    static int f16810g;

    /* renamed from: b */
    int f16812b;

    /* renamed from: d */
    int f16814d;

    /* renamed from: a */
    ArrayList<m0.e> f16811a = new ArrayList<>();

    /* renamed from: c */
    boolean f16813c = false;

    /* renamed from: e */
    ArrayList<a> f16815e = null;

    /* renamed from: f */
    private int f16816f = -1;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        WeakReference<m0.e> f16817a;

        /* renamed from: b */
        int f16818b;

        /* renamed from: c */
        int f16819c;

        /* renamed from: d */
        int f16820d;

        /* renamed from: e */
        int f16821e;

        /* renamed from: f */
        int f16822f;

        /* renamed from: g */
        int f16823g;

        public a(m0.e eVar, j0.d dVar, int i10) {
            o.this = r1;
            this.f16817a = new WeakReference<>(eVar);
            this.f16818b = dVar.x(eVar.O);
            this.f16819c = dVar.x(eVar.P);
            this.f16820d = dVar.x(eVar.Q);
            this.f16821e = dVar.x(eVar.R);
            this.f16822f = dVar.x(eVar.S);
            this.f16823g = i10;
        }
    }

    public o(int i10) {
        int i11 = f16810g;
        f16810g = i11 + 1;
        this.f16812b = i11;
        this.f16814d = i10;
    }

    private String e() {
        int i10 = this.f16814d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(j0.d dVar, ArrayList<m0.e> arrayList, int i10) {
        int x10;
        m0.d dVar2;
        m0.f fVar = (m0.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.W0 > 0) {
            m0.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.X0 > 0) {
            m0.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f16815e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f16815e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            x10 = dVar.x(fVar.O);
            dVar2 = fVar.Q;
        } else {
            x10 = dVar.x(fVar.P);
            dVar2 = fVar.R;
        }
        int x11 = dVar.x(dVar2);
        dVar.D();
        return x11 - x10;
    }

    public boolean a(m0.e eVar) {
        if (this.f16811a.contains(eVar)) {
            return false;
        }
        this.f16811a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f16811a.size();
        if (this.f16816f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f16816f == oVar.f16812b) {
                    g(this.f16814d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f16812b;
    }

    public int d() {
        return this.f16814d;
    }

    public int f(j0.d dVar, int i10) {
        if (this.f16811a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f16811a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<m0.e> it = this.f16811a.iterator();
        while (it.hasNext()) {
            m0.e next = it.next();
            oVar.a(next);
            int c10 = oVar.c();
            if (i10 == 0) {
                next.I0 = c10;
            } else {
                next.J0 = c10;
            }
        }
        this.f16816f = oVar.f16812b;
    }

    public void h(boolean z10) {
        this.f16813c = z10;
    }

    public void i(int i10) {
        this.f16814d = i10;
    }

    public String toString() {
        Iterator<m0.e> it;
        String str = e() + " [" + this.f16812b + "] <";
        while (this.f16811a.iterator().hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
