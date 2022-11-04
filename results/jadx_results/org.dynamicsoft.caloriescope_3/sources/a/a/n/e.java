package a.a.n;

import a.a.n.b;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class e extends b implements g.a {
    private Context d;
    private ActionBarContextView e;
    private b.a f;
    private WeakReference<View> g;
    private boolean h;
    private androidx.appcompat.view.menu.g i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = aVar;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(actionBarContextView.getContext());
        gVar.c(1);
        this.i = gVar;
        gVar.a(this);
    }

    @Override // a.a.n.b
    public void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.sendAccessibilityEvent(32);
        this.f.a(this);
    }

    @Override // a.a.n.b
    public void a(int i) {
        a((CharSequence) this.d.getString(i));
    }

    @Override // a.a.n.b
    public void a(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void a(androidx.appcompat.view.menu.g gVar) {
        i();
        this.e.d();
    }

    @Override // a.a.n.b
    public void a(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // a.a.n.b
    public void a(boolean z) {
        super.a(z);
        this.e.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f.a(this, menuItem);
    }

    @Override // a.a.n.b
    public View b() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // a.a.n.b
    public void b(int i) {
        b(this.d.getString(i));
    }

    @Override // a.a.n.b
    public void b(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // a.a.n.b
    public Menu c() {
        return this.i;
    }

    @Override // a.a.n.b
    public MenuInflater d() {
        return new g(this.e.getContext());
    }

    @Override // a.a.n.b
    public CharSequence e() {
        return this.e.getSubtitle();
    }

    @Override // a.a.n.b
    public CharSequence g() {
        return this.e.getTitle();
    }

    @Override // a.a.n.b
    public void i() {
        this.f.a(this, this.i);
    }

    @Override // a.a.n.b
    public boolean j() {
        return this.e.b();
    }
}
