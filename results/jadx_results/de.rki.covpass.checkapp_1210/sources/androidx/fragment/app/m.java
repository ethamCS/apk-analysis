package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    private final o<?> f4145a;

    private m(o<?> oVar) {
        this.f4145a = oVar;
    }

    public static m b(o<?> oVar) {
        return new m((o) androidx.core.util.h.h(oVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        o<?> oVar = this.f4145a;
        oVar.f4180y.n(oVar, oVar, fragment);
    }

    public void c() {
        this.f4145a.f4180y.z();
    }

    public boolean d(MenuItem menuItem) {
        return this.f4145a.f4180y.C(menuItem);
    }

    public void e() {
        this.f4145a.f4180y.D();
    }

    public void f() {
        this.f4145a.f4180y.F();
    }

    public void g() {
        this.f4145a.f4180y.O();
    }

    public void h() {
        this.f4145a.f4180y.S();
    }

    public void i() {
        this.f4145a.f4180y.T();
    }

    public void j() {
        this.f4145a.f4180y.V();
    }

    public boolean k() {
        return this.f4145a.f4180y.c0(true);
    }

    public w l() {
        return this.f4145a.f4180y;
    }

    public void m() {
        this.f4145a.f4180y.Y0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4145a.f4180y.z0().onCreateView(view, str, context, attributeSet);
    }
}
