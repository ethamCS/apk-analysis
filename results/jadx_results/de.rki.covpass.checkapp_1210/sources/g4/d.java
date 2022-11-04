package g4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import h4.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class d implements e, m, a.b, j4.f {

    /* renamed from: a */
    private final Paint f10402a;

    /* renamed from: b */
    private final RectF f10403b;

    /* renamed from: c */
    private final Matrix f10404c;

    /* renamed from: d */
    private final Path f10405d;

    /* renamed from: e */
    private final RectF f10406e;

    /* renamed from: f */
    private final String f10407f;

    /* renamed from: g */
    private final boolean f10408g;

    /* renamed from: h */
    private final List<c> f10409h;

    /* renamed from: i */
    private final com.airbnb.lottie.n f10410i;

    /* renamed from: j */
    private List<m> f10411j;

    /* renamed from: k */
    private h4.p f10412k;

    public d(com.airbnb.lottie.n nVar, m4.b bVar, String str, boolean z10, List<c> list, k4.l lVar) {
        this.f10402a = new f4.a();
        this.f10403b = new RectF();
        this.f10404c = new Matrix();
        this.f10405d = new Path();
        this.f10406e = new RectF();
        this.f10407f = str;
        this.f10410i = nVar;
        this.f10408g = z10;
        this.f10409h = list;
        if (lVar != null) {
            h4.p b10 = lVar.b();
            this.f10412k = b10;
            b10.a(bVar);
            this.f10412k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).d(list.listIterator(list.size()));
        }
    }

    public d(com.airbnb.lottie.n nVar, m4.b bVar, l4.p pVar) {
        this(nVar, bVar, pVar.c(), pVar.d(), d(nVar, bVar, pVar.b()), i(pVar.b()));
    }

    private static List<c> d(com.airbnb.lottie.n nVar, m4.b bVar, List<l4.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c a10 = list.get(i10).a(nVar, bVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    static k4.l i(List<l4.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            l4.c cVar = list.get(i10);
            if (cVar instanceof k4.l) {
                return (k4.l) cVar;
            }
        }
        return null;
    }

    private boolean m() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f10409h.size(); i11++) {
            if ((this.f10409h.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f10404c.set(matrix);
        h4.p pVar = this.f10412k;
        if (pVar != null) {
            this.f10404c.preConcat(pVar.f());
        }
        this.f10406e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f10409h.size() - 1; size >= 0; size--) {
            c cVar = this.f10409h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).a(this.f10406e, this.f10404c, z10);
                rectF.union(this.f10406e);
            }
        }
    }

    @Override // h4.a.b
    public void b() {
        this.f10410i.invalidateSelf();
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f10409h.size());
        arrayList.addAll(list);
        for (int size = this.f10409h.size() - 1; size >= 0; size--) {
            c cVar = this.f10409h.get(size);
            cVar.c(arrayList, this.f10409h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        h4.p pVar = this.f10412k;
        if (pVar != null) {
            pVar.c(t10, cVar);
        }
    }

    @Override // g4.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f10408g) {
            return;
        }
        this.f10404c.set(matrix);
        h4.p pVar = this.f10412k;
        if (pVar != null) {
            this.f10404c.preConcat(pVar.f());
            i10 = (int) (((((this.f10412k.h() == null ? 100 : this.f10412k.h().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f10410i.Z() && m() && i10 != 255;
        if (z10) {
            this.f10403b.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.f10403b, this.f10404c, true);
            this.f10402a.setAlpha(i10);
            q4.h.m(canvas, this.f10403b, this.f10402a);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f10409h.size() - 1; size >= 0; size--) {
            c cVar = this.f10409h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).g(canvas, this.f10404c, i10);
            }
        }
        if (!z10) {
            return;
        }
        canvas.restore();
    }

    @Override // g4.c
    public String getName() {
        return this.f10407f;
    }

    @Override // j4.f
    public void h(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (!eVar.h(getName(), i10)) {
                return;
            }
            int e10 = i10 + eVar.e(getName(), i10);
            for (int i11 = 0; i11 < this.f10409h.size(); i11++) {
                c cVar = this.f10409h.get(i11);
                if (cVar instanceof j4.f) {
                    ((j4.f) cVar).h(eVar, e10, list, eVar2);
                }
            }
        }
    }

    public List<m> j() {
        if (this.f10411j == null) {
            this.f10411j = new ArrayList();
            for (int i10 = 0; i10 < this.f10409h.size(); i10++) {
                c cVar = this.f10409h.get(i10);
                if (cVar instanceof m) {
                    this.f10411j.add((m) cVar);
                }
            }
        }
        return this.f10411j;
    }

    public Matrix k() {
        h4.p pVar = this.f10412k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f10404c.reset();
        return this.f10404c;
    }

    @Override // g4.m
    public Path l() {
        this.f10404c.reset();
        h4.p pVar = this.f10412k;
        if (pVar != null) {
            this.f10404c.set(pVar.f());
        }
        this.f10405d.reset();
        if (this.f10408g) {
            return this.f10405d;
        }
        for (int size = this.f10409h.size() - 1; size >= 0; size--) {
            c cVar = this.f10409h.get(size);
            if (cVar instanceof m) {
                this.f10405d.addPath(((m) cVar).l(), this.f10404c);
            }
        }
        return this.f10405d;
    }
}
