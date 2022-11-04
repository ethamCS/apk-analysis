package k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.b;
/* loaded from: classes.dex */
public class e extends b implements e.a {
    private WeakReference<View> U3;
    private boolean V3;
    private boolean W3;
    private androidx.appcompat.view.menu.e X3;

    /* renamed from: q */
    private Context f14482q;

    /* renamed from: x */
    private ActionBarContextView f14483x;

    /* renamed from: y */
    private b.a f14484y;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f14482q = context;
        this.f14483x = actionBarContextView;
        this.f14484y = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.X3 = S;
        S.R(this);
        this.W3 = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f14484y.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f14483x.l();
    }

    @Override // k.b
    public void c() {
        if (this.V3) {
            return;
        }
        this.V3 = true;
        this.f14484y.d(this);
    }

    @Override // k.b
    public View d() {
        WeakReference<View> weakReference = this.U3;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // k.b
    public Menu e() {
        return this.X3;
    }

    @Override // k.b
    public MenuInflater f() {
        return new g(this.f14483x.getContext());
    }

    @Override // k.b
    public CharSequence g() {
        return this.f14483x.getSubtitle();
    }

    @Override // k.b
    public CharSequence i() {
        return this.f14483x.getTitle();
    }

    @Override // k.b
    public void k() {
        this.f14484y.c(this, this.X3);
    }

    @Override // k.b
    public boolean l() {
        return this.f14483x.j();
    }

    @Override // k.b
    public void m(View view) {
        this.f14483x.setCustomView(view);
        this.U3 = view != null ? new WeakReference<>(view) : null;
    }

    @Override // k.b
    public void n(int i10) {
        o(this.f14482q.getString(i10));
    }

    @Override // k.b
    public void o(CharSequence charSequence) {
        this.f14483x.setSubtitle(charSequence);
    }

    @Override // k.b
    public void q(int i10) {
        r(this.f14482q.getString(i10));
    }

    @Override // k.b
    public void r(CharSequence charSequence) {
        this.f14483x.setTitle(charSequence);
    }

    @Override // k.b
    public void s(boolean z10) {
        super.s(z10);
        this.f14483x.setTitleOptional(z10);
    }
}
