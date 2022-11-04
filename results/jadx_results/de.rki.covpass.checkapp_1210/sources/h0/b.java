package h0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
/* loaded from: classes.dex */
public class b implements d {
    private e p(c cVar) {
        return (e) cVar.f();
    }

    @Override // h0.d
    public void a(c cVar, float f10) {
        p(cVar).h(f10);
    }

    @Override // h0.d
    public float b(c cVar) {
        return c(cVar) * 2.0f;
    }

    @Override // h0.d
    public float c(c cVar) {
        return p(cVar).d();
    }

    @Override // h0.d
    public void d(c cVar, float f10) {
        p(cVar).g(f10, cVar.e(), cVar.d());
        k(cVar);
    }

    @Override // h0.d
    public float e(c cVar) {
        return c(cVar) * 2.0f;
    }

    @Override // h0.d
    public void f(c cVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        cVar.c(new e(colorStateList, f10));
        View b10 = cVar.b();
        b10.setClipToOutline(true);
        b10.setElevation(f11);
        d(cVar, f12);
    }

    @Override // h0.d
    public void g(c cVar) {
        d(cVar, j(cVar));
    }

    @Override // h0.d
    public void h(c cVar, float f10) {
        cVar.b().setElevation(f10);
    }

    @Override // h0.d
    public void i() {
    }

    @Override // h0.d
    public float j(c cVar) {
        return p(cVar).c();
    }

    @Override // h0.d
    public void k(c cVar) {
        if (!cVar.e()) {
            cVar.a(0, 0, 0, 0);
            return;
        }
        float j10 = j(cVar);
        float c10 = c(cVar);
        int ceil = (int) Math.ceil(f.a(j10, c10, cVar.d()));
        int ceil2 = (int) Math.ceil(f.b(j10, c10, cVar.d()));
        cVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // h0.d
    public void l(c cVar, ColorStateList colorStateList) {
        p(cVar).f(colorStateList);
    }

    @Override // h0.d
    public void m(c cVar) {
        d(cVar, j(cVar));
    }

    @Override // h0.d
    public ColorStateList n(c cVar) {
        return p(cVar).b();
    }

    @Override // h0.d
    public float o(c cVar) {
        return cVar.b().getElevation();
    }
}
