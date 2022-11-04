package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
/* loaded from: classes.dex */
public class b implements e {
    private f o(d dVar) {
        return (f) dVar.d();
    }

    @Override // androidx.cardview.widget.e
    public float a(d dVar) {
        return o(dVar).c();
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return o(dVar).d();
    }

    @Override // androidx.cardview.widget.e
    public float c(d dVar) {
        return b(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return b(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void e(d dVar) {
        m(dVar, a(dVar));
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList f(d dVar) {
        return o(dVar).b();
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar, float f2) {
        dVar.b().setElevation(f2);
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        dVar.f(new f(colorStateList, f2));
        View b2 = dVar.b();
        b2.setClipToOutline(true);
        b2.setElevation(f3);
        m(dVar, f4);
    }

    @Override // androidx.cardview.widget.e
    public void i(d dVar, float f2) {
        o(dVar).h(f2);
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar) {
        m(dVar, a(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar, ColorStateList colorStateList) {
        o(dVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public float l(d dVar) {
        return dVar.b().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar, float f2) {
        o(dVar).g(f2, dVar.c(), dVar.g());
        p(dVar);
    }

    @Override // androidx.cardview.widget.e
    public void n() {
    }

    public void p(d dVar) {
        if (!dVar.c()) {
            dVar.a(0, 0, 0, 0);
            return;
        }
        float a2 = a(dVar);
        float b2 = b(dVar);
        int ceil = (int) Math.ceil(g.c(a2, b2, dVar.g()));
        int ceil2 = (int) Math.ceil(g.d(a2, b2, dVar.g()));
        dVar.a(ceil, ceil2, ceil, ceil2);
    }
}
