package a.c.a;

import android.content.res.ColorStateList;
/* loaded from: classes.dex */
public class c implements f {
    private g j(e eVar) {
        return (g) eVar.c();
    }

    @Override // a.c.a.f
    public float a(e eVar) {
        return j(eVar).b();
    }

    @Override // a.c.a.f
    public void a() {
    }

    @Override // a.c.a.f
    public void a(e eVar, float f) {
        eVar.a().setElevation(f);
    }

    @Override // a.c.a.f
    public void a(e eVar, ColorStateList colorStateList) {
        j(eVar).a(colorStateList);
    }

    @Override // a.c.a.f
    public float b(e eVar) {
        return j(eVar).c();
    }

    @Override // a.c.a.f
    public void b(e eVar, float f) {
        j(eVar).a(f, eVar.b(), eVar.d());
        i(eVar);
    }

    @Override // a.c.a.f
    public void c(e eVar) {
        b(eVar, a(eVar));
    }

    @Override // a.c.a.f
    public void c(e eVar, float f) {
        j(eVar).a(f);
    }

    @Override // a.c.a.f
    public float d(e eVar) {
        return b(eVar) * 2.0f;
    }

    @Override // a.c.a.f
    public float e(e eVar) {
        return eVar.a().getElevation();
    }

    @Override // a.c.a.f
    public float f(e eVar) {
        return b(eVar) * 2.0f;
    }

    @Override // a.c.a.f
    public void g(e eVar) {
        b(eVar, a(eVar));
    }

    @Override // a.c.a.f
    public ColorStateList h(e eVar) {
        return j(eVar).a();
    }

    public void i(e eVar) {
        if (!eVar.b()) {
            eVar.a(0, 0, 0, 0);
            return;
        }
        float a2 = a(eVar);
        float b2 = b(eVar);
        int ceil = (int) Math.ceil(h.a(a2, b2, eVar.d()));
        int ceil2 = (int) Math.ceil(h.b(a2, b2, eVar.d()));
        eVar.a(ceil, ceil2, ceil, ceil2);
    }
}
