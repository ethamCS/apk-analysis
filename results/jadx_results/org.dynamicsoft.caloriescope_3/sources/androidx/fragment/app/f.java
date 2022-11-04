package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.t;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    private final h<?> f894a;

    private f(h<?> hVar) {
        this.f894a = hVar;
    }

    public static f a(h<?> hVar) {
        a.g.k.h.a(hVar, "callbacks == null");
        return new f(hVar);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f894a.f.onCreateView(view, str, context, attributeSet);
    }

    public Fragment a(String str) {
        return this.f894a.f.b(str);
    }

    public void a() {
        this.f894a.f.e();
    }

    public void a(Configuration configuration) {
        this.f894a.f.a(configuration);
    }

    public void a(Parcelable parcelable) {
        h<?> hVar = this.f894a;
        if (hVar instanceof t) {
            hVar.f.a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public void a(Menu menu) {
        this.f894a.f.a(menu);
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.f894a;
        hVar.f.a(hVar, hVar, fragment);
    }

    public void a(boolean z) {
        this.f894a.f.a(z);
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.f894a.f.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        return this.f894a.f.a(menuItem);
    }

    public void b() {
        this.f894a.f.f();
    }

    public void b(boolean z) {
        this.f894a.f.b(z);
    }

    public boolean b(Menu menu) {
        return this.f894a.f.b(menu);
    }

    public boolean b(MenuItem menuItem) {
        return this.f894a.f.b(menuItem);
    }

    public void c() {
        this.f894a.f.g();
    }

    public void d() {
        this.f894a.f.i();
    }

    public void e() {
        this.f894a.f.j();
    }

    public void f() {
        this.f894a.f.l();
    }

    public void g() {
        this.f894a.f.m();
    }

    public void h() {
        this.f894a.f.n();
    }

    public boolean i() {
        return this.f894a.f.p();
    }

    public i j() {
        return this.f894a.f;
    }

    public void k() {
        this.f894a.f.w();
    }

    public Parcelable l() {
        return this.f894a.f.y();
    }
}
