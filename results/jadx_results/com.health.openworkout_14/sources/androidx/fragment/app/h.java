package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final j<?> f1063a;

    private h(j<?> jVar) {
        this.f1063a = jVar;
    }

    public static h b(j<?> jVar) {
        b.g.k.h.d(jVar, "callbacks == null");
        return new h(jVar);
    }

    public void a(Fragment fragment) {
        j<?> jVar = this.f1063a;
        jVar.f1068e.g(jVar, jVar, fragment);
    }

    public void c() {
        this.f1063a.f1068e.r();
    }

    public void d(Configuration configuration) {
        this.f1063a.f1068e.s(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f1063a.f1068e.t(menuItem);
    }

    public void f() {
        this.f1063a.f1068e.u();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f1063a.f1068e.v(menu, menuInflater);
    }

    public void h() {
        this.f1063a.f1068e.w();
    }

    public void i() {
        this.f1063a.f1068e.y();
    }

    public void j(boolean z) {
        this.f1063a.f1068e.z(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.f1063a.f1068e.A(menuItem);
    }

    public void l(Menu menu) {
        this.f1063a.f1068e.B(menu);
    }

    public void m() {
        this.f1063a.f1068e.D();
    }

    public void n(boolean z) {
        this.f1063a.f1068e.E(z);
    }

    public boolean o(Menu menu) {
        return this.f1063a.f1068e.F(menu);
    }

    public void p() {
        this.f1063a.f1068e.H();
    }

    public void q() {
        this.f1063a.f1068e.I();
    }

    public void r() {
        this.f1063a.f1068e.K();
    }

    public boolean s() {
        return this.f1063a.f1068e.Q(true);
    }

    public Fragment t(String str) {
        return this.f1063a.f1068e.Y(str);
    }

    public m u() {
        return this.f1063a.f1068e;
    }

    public void v() {
        this.f1063a.f1068e.B0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1063a.f1068e.g0().onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        j<?> jVar = this.f1063a;
        if (jVar instanceof androidx.lifecycle.w) {
            jVar.f1068e.O0(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable y() {
        return this.f1063a.f1068e.Q0();
    }
}
