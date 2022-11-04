package n0;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d */
    p f16779d;

    /* renamed from: f */
    int f16781f;

    /* renamed from: g */
    public int f16782g;

    /* renamed from: a */
    public d f16776a = null;

    /* renamed from: b */
    public boolean f16777b = false;

    /* renamed from: c */
    public boolean f16778c = false;

    /* renamed from: e */
    a f16780e = a.UNKNOWN;

    /* renamed from: h */
    int f16783h = 1;

    /* renamed from: i */
    g f16784i = null;

    /* renamed from: j */
    public boolean f16785j = false;

    /* renamed from: k */
    List<d> f16786k = new ArrayList();

    /* renamed from: l */
    List<f> f16787l = new ArrayList();

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
        this.f16779d = pVar;
    }

    @Override // n0.d
    public void a(d dVar) {
        for (f fVar : this.f16787l) {
            if (!fVar.f16785j) {
                return;
            }
        }
        this.f16778c = true;
        d dVar2 = this.f16776a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f16777b) {
            this.f16779d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f fVar3 : this.f16787l) {
            if (!(fVar3 instanceof g)) {
                i10++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f16785j) {
            g gVar = this.f16784i;
            if (gVar != null) {
                if (!gVar.f16785j) {
                    return;
                }
                this.f16781f = this.f16783h * gVar.f16782g;
            }
            d(fVar2.f16782g + this.f16781f);
        }
        d dVar3 = this.f16776a;
        if (dVar3 == null) {
            return;
        }
        dVar3.a(this);
    }

    public void b(d dVar) {
        this.f16786k.add(dVar);
        if (this.f16785j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f16787l.clear();
        this.f16786k.clear();
        this.f16785j = false;
        this.f16782g = 0;
        this.f16778c = false;
        this.f16777b = false;
    }

    public void d(int i10) {
        if (this.f16785j) {
            return;
        }
        this.f16785j = true;
        this.f16782g = i10;
        for (d dVar : this.f16786k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16779d.f16826b.r());
        sb2.append(":");
        sb2.append(this.f16780e);
        sb2.append("(");
        sb2.append(this.f16785j ? Integer.valueOf(this.f16782g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f16787l.size());
        sb2.append(":d=");
        sb2.append(this.f16786k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
