package b.a.o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import b.a.o.b;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: d */
    private Context f2053d;

    /* renamed from: e */
    private ActionBarContextView f2054e;

    /* renamed from: f */
    private b.a f2055f;

    /* renamed from: g */
    private WeakReference<View> f2056g;

    /* renamed from: h */
    private boolean f2057h;
    private androidx.appcompat.view.menu.g i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f2053d = context;
        this.f2054e = actionBarContextView;
        this.f2055f = aVar;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(actionBarContextView.getContext());
        gVar.W(1);
        this.i = gVar;
        gVar.V(this);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f2055f.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f2054e.l();
    }

    @Override // b.a.o.b
    public void c() {
        if (this.f2057h) {
            return;
        }
        this.f2057h = true;
        this.f2054e.sendAccessibilityEvent(32);
        this.f2055f.d(this);
    }

    @Override // b.a.o.b
    public View d() {
        WeakReference<View> weakReference = this.f2056g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // b.a.o.b
    public Menu e() {
        return this.i;
    }

    @Override // b.a.o.b
    public MenuInflater f() {
        return new g(this.f2054e.getContext());
    }

    @Override // b.a.o.b
    public CharSequence g() {
        return this.f2054e.getSubtitle();
    }

    @Override // b.a.o.b
    public CharSequence i() {
        return this.f2054e.getTitle();
    }

    @Override // b.a.o.b
    public void k() {
        this.f2055f.a(this, this.i);
    }

    @Override // b.a.o.b
    public boolean l() {
        return this.f2054e.j();
    }

    @Override // b.a.o.b
    public void m(View view) {
        this.f2054e.setCustomView(view);
        this.f2056g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // b.a.o.b
    public void n(int i) {
        o(this.f2053d.getString(i));
    }

    @Override // b.a.o.b
    public void o(CharSequence charSequence) {
        this.f2054e.setSubtitle(charSequence);
    }

    @Override // b.a.o.b
    public void q(int i) {
        r(this.f2053d.getString(i));
    }

    @Override // b.a.o.b
    public void r(CharSequence charSequence) {
        this.f2054e.setTitle(charSequence);
    }

    @Override // b.a.o.b
    public void s(boolean z) {
        super.s(z);
        this.f2054e.setTitleOptional(z);
    }
}
