package g4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import h4.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {

    /* renamed from: a */
    private final Matrix f10498a = new Matrix();

    /* renamed from: b */
    private final Path f10499b = new Path();

    /* renamed from: c */
    private final com.airbnb.lottie.n f10500c;

    /* renamed from: d */
    private final m4.b f10501d;

    /* renamed from: e */
    private final String f10502e;

    /* renamed from: f */
    private final boolean f10503f;

    /* renamed from: g */
    private final h4.a<Float, Float> f10504g;

    /* renamed from: h */
    private final h4.a<Float, Float> f10505h;

    /* renamed from: i */
    private final h4.p f10506i;

    /* renamed from: j */
    private d f10507j;

    public p(com.airbnb.lottie.n nVar, m4.b bVar, l4.l lVar) {
        this.f10500c = nVar;
        this.f10501d = bVar;
        this.f10502e = lVar.c();
        this.f10503f = lVar.f();
        h4.a<Float, Float> n10 = lVar.b().n();
        this.f10504g = n10;
        bVar.i(n10);
        n10.a(this);
        h4.a<Float, Float> n11 = lVar.d().n();
        this.f10505h = n11;
        bVar.i(n11);
        n11.a(this);
        h4.p b10 = lVar.e().b();
        this.f10506i = b10;
        b10.a(bVar);
        b10.b(this);
    }

    @Override // g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f10507j.a(rectF, matrix, z10);
    }

    @Override // h4.a.b
    public void b() {
        this.f10500c.invalidateSelf();
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
        this.f10507j.c(list, list2);
    }

    @Override // g4.j
    public void d(ListIterator<c> listIterator) {
        if (this.f10507j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f10507j = new d(this.f10500c, this.f10501d, "Repeater", this.f10503f, arrayList, null);
    }

    @Override // j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        h4.a<Float, Float> aVar;
        if (this.f10506i.c(t10, cVar)) {
            return;
        }
        if (t10 == e4.u.f9454u) {
            aVar = this.f10504g;
        } else if (t10 != e4.u.f9455v) {
            return;
        } else {
            aVar = this.f10505h;
        }
        aVar.n(cVar);
    }

    @Override // g4.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = this.f10504g.h().floatValue();
        float floatValue2 = this.f10505h.h().floatValue();
        float floatValue3 = this.f10506i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f10506i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f10498a.set(matrix);
            float f10 = i11;
            this.f10498a.preConcat(this.f10506i.g(f10 + floatValue2));
            this.f10507j.g(canvas, this.f10498a, (int) (i10 * q4.g.i(floatValue3, floatValue4, f10 / floatValue)));
        }
    }

    @Override // g4.c
    public String getName() {
        return this.f10502e;
    }

    @Override // j4.f
    public void h(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        q4.g.k(eVar, i10, list, eVar2, this);
    }

    @Override // g4.m
    public Path l() {
        Path l10 = this.f10507j.l();
        this.f10499b.reset();
        float floatValue = this.f10504g.h().floatValue();
        float floatValue2 = this.f10505h.h().floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            this.f10498a.set(this.f10506i.g(i10 + floatValue2));
            this.f10499b.addPath(l10, this.f10498a);
        }
        return this.f10499b;
    }
}
