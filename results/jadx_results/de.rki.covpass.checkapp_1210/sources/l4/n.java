package l4;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a */
    private final List<j4.a> f15778a;

    /* renamed from: b */
    private PointF f15779b;

    /* renamed from: c */
    private boolean f15780c;

    public n() {
        this.f15778a = new ArrayList();
    }

    public n(PointF pointF, boolean z10, List<j4.a> list) {
        this.f15779b = pointF;
        this.f15780c = z10;
        this.f15778a = new ArrayList(list);
    }

    public List<j4.a> a() {
        return this.f15778a;
    }

    public PointF b() {
        return this.f15779b;
    }

    public void c(n nVar, n nVar2, float f10) {
        if (this.f15779b == null) {
            this.f15779b = new PointF();
        }
        this.f15780c = nVar.d() || nVar2.d();
        if (nVar.a().size() != nVar2.a().size()) {
            q4.d.c("Curves must have the same number of control points. Shape 1: " + nVar.a().size() + "\tShape 2: " + nVar2.a().size());
        }
        int min = Math.min(nVar.a().size(), nVar2.a().size());
        if (this.f15778a.size() < min) {
            for (int size = this.f15778a.size(); size < min; size++) {
                this.f15778a.add(new j4.a());
            }
        } else if (this.f15778a.size() > min) {
            for (int size2 = this.f15778a.size() - 1; size2 >= min; size2--) {
                List<j4.a> list = this.f15778a;
                list.remove(list.size() - 1);
            }
        }
        PointF b10 = nVar.b();
        PointF b11 = nVar2.b();
        f(q4.g.i(b10.x, b11.x, f10), q4.g.i(b10.y, b11.y, f10));
        for (int size3 = this.f15778a.size() - 1; size3 >= 0; size3--) {
            j4.a aVar = nVar.a().get(size3);
            j4.a aVar2 = nVar2.a().get(size3);
            PointF a10 = aVar.a();
            PointF b12 = aVar.b();
            PointF c10 = aVar.c();
            PointF a11 = aVar2.a();
            PointF b13 = aVar2.b();
            PointF c11 = aVar2.c();
            this.f15778a.get(size3).d(q4.g.i(a10.x, a11.x, f10), q4.g.i(a10.y, a11.y, f10));
            this.f15778a.get(size3).e(q4.g.i(b12.x, b13.x, f10), q4.g.i(b12.y, b13.y, f10));
            this.f15778a.get(size3).f(q4.g.i(c10.x, c11.x, f10), q4.g.i(c10.y, c11.y, f10));
        }
    }

    public boolean d() {
        return this.f15780c;
    }

    public void e(boolean z10) {
        this.f15780c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f15779b == null) {
            this.f15779b = new PointF();
        }
        this.f15779b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f15778a.size() + "closed=" + this.f15780c + '}';
    }
}
