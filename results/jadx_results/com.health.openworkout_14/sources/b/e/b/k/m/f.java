package b.e.b.k.m;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d */
    p f2298d;

    /* renamed from: f */
    int f2300f;

    /* renamed from: g */
    public int f2301g;

    /* renamed from: a */
    public d f2295a = null;

    /* renamed from: b */
    public boolean f2296b = false;

    /* renamed from: c */
    public boolean f2297c = false;

    /* renamed from: e */
    a f2299e = a.UNKNOWN;

    /* renamed from: h */
    int f2302h = 1;
    g i = null;
    public boolean j = false;
    List<d> k = new ArrayList();
    List<f> l = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f2298d = pVar;
    }

    @Override // b.e.b.k.m.d
    public void a(d dVar) {
        for (f fVar : this.l) {
            if (!fVar.j) {
                return;
            }
        }
        this.f2297c = true;
        d dVar2 = this.f2295a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f2296b) {
            this.f2298d.a(this);
            return;
        }
        f fVar2 = null;
        int i = 0;
        for (f fVar3 : this.l) {
            if (!(fVar3 instanceof g)) {
                i++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.j) {
                    return;
                }
                this.f2300f = this.f2302h * gVar.f2301g;
            }
            d(fVar2.f2301g + this.f2300f);
        }
        d dVar3 = this.f2295a;
        if (dVar3 == null) {
            return;
        }
        dVar3.a(this);
    }

    public void b(d dVar) {
        this.k.add(dVar);
        if (this.j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.f2301g = 0;
        this.f2297c = false;
        this.f2296b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f2301g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2298d.f2324b.r());
        sb.append(":");
        sb.append(this.f2299e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.f2301g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
