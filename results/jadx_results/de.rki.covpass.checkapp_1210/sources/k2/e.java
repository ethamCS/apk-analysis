package k2;

import h3.f;
import java.util.List;
import ok.g;
@Deprecated
/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: a */
    int f14580a;

    /* renamed from: b */
    int f14581b;

    /* renamed from: c */
    h3.e f14582c;

    /* renamed from: d */
    g3.c f14583d;

    /* renamed from: f */
    private g3.b f14585f;

    /* renamed from: g */
    boolean f14586g;

    /* renamed from: e */
    private final g f14584e = new g();

    /* renamed from: h */
    la.a f14587h = new la.a();

    public e(u3.d dVar) {
        this.f14580a = Integer.MAX_VALUE;
        this.f14581b = 3;
        this.f14586g = true;
        x3.b f10 = dVar.X3.f();
        this.f14582c = dVar.Y3 ? new f(dVar.f23129y, f10, dVar.U3) : new h3.g(dVar.f23129y, f10, dVar.U3);
        int i10 = dVar.V3;
        if (i10 > 0) {
            this.f14583d = new g3.c(dVar.Y3, i10);
        }
        double d10 = dVar.W3;
        if (d10 > 0.0d) {
            this.f14585f = new g3.b(d10);
        }
        this.f14586g = dVar.f14575x;
        this.f14581b = dVar.f14573d;
        this.f14580a = dVar.f14574q;
    }

    @Override // k2.d
    public void a(int i10) {
        this.f14581b = i10;
    }

    @Override // k2.d
    public int b() {
        return this.f14581b;
    }

    @Override // k2.d
    public void c(boolean z10) {
        this.f14586g = z10;
    }

    @Override // k2.d
    public boolean d() {
        return this.f14582c instanceof f;
    }

    @Override // k2.d
    public void e(int i10) {
        this.f14580a = i10;
        this.f14582c.c(i10 * 2);
    }

    @Override // k2.d
    public boolean f(List<ka.c> list, g gVar) {
        if (!this.f14582c.b(list, gVar)) {
            return false;
        }
        g3.c cVar = this.f14583d;
        if (cVar != null && !cVar.e(list, gVar)) {
            return false;
        }
        g3.b bVar = this.f14585f;
        if (bVar != null && bVar.e(list, gVar, this.f14584e)) {
            gVar.k(this.f14584e);
        }
        int i10 = gVar.f18610b;
        if (i10 > this.f14580a || i10 < this.f14581b) {
            return false;
        }
        this.f14587h.f15915c.s(i10);
        for (int i11 = 0; i11 < gVar.f18610b; i11++) {
            ka.c cVar2 = list.get(gVar.d(i11));
            this.f14587h.c(i11, cVar2.f14865c, cVar2.f14866d);
        }
        return !this.f14586g || da.f.a(this.f14587h);
    }
}
