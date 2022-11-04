package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g1;
import androidx.core.app.o;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import k.b;
import k1.c;
/* loaded from: classes.dex */
public class c extends androidx.fragment.app.j implements f.a, o.a {

    /* renamed from: k4 */
    private d f710k4;

    /* renamed from: l4 */
    private Resources f711l4;

    /* loaded from: classes.dex */
    public class a implements c.AbstractC0210c {
        a() {
            c.this = r1;
        }

        @Override // k1.c.AbstractC0210c
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.w0().u(bundle);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public class b implements c.b {
        b() {
            c.this = r1;
        }

        @Override // c.b
        public void a(Context context) {
            d w02 = c.this.w0();
            w02.n();
            w02.q(c.this.g().b("androidx:appcompat"));
        }
    }

    public c() {
        y0();
    }

    public c(int i10) {
        super(i10);
        y0();
    }

    private boolean E0(KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    private void a0() {
        a1.a(getWindow().getDecorView(), this);
        b1.a(getWindow().getDecorView(), this);
        k1.f.a(getWindow().getDecorView(), this);
    }

    private void y0() {
        g().h("androidx:appcompat", new a());
        X(new b());
    }

    public void A0(int i10) {
    }

    public void B0(o oVar) {
    }

    @Deprecated
    public void C0() {
    }

    public boolean D0() {
        Intent F = F();
        if (F != null) {
            if (!H0(F)) {
                G0(F);
                return true;
            }
            o d10 = o.d(this);
            z0(d10);
            B0(d10);
            d10.e();
            try {
                androidx.core.app.b.k(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.app.o.a
    public Intent F() {
        return androidx.core.app.h.a(this);
    }

    public void F0(Toolbar toolbar) {
        w0().D(toolbar);
    }

    public void G0(Intent intent) {
        androidx.core.app.h.e(this, intent);
    }

    @Override // f.a
    public void H(k.b bVar) {
    }

    public boolean H0(Intent intent) {
        return androidx.core.app.h.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a0();
        w0().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(w0().f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a x02 = x0();
        if (getWindow().hasFeature(0)) {
            if (x02 != null && x02.g()) {
                return;
            }
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a x02 = x0();
        if (keyCode != 82 || x02 == null || !x02.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) w0().i(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return w0().l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f711l4 == null && g1.c()) {
            this.f711l4 = new g1(this, super.getResources());
        }
        Resources resources = this.f711l4;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        w0().o();
    }

    @Override // f.a
    public void k(k.b bVar) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f711l4 != null) {
            this.f711l4.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        w0().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        C0();
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w0().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (E0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.j, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a x02 = x0();
        if (menuItem.getItemId() == 16908332 && x02 != null && (x02.j() & 4) != 0) {
            return D0();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        w0().s(bundle);
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        w0().t();
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    public void onStart() {
        super.onStart();
        w0().v();
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    public void onStop() {
        super.onStop();
        w0().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        w0().F(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a x02 = x0();
        if (getWindow().hasFeature(0)) {
            if (x02 != null && x02.q()) {
                return;
            }
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        a0();
        w0().A(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        a0();
        w0().B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a0();
        w0().C(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        w0().E(i10);
    }

    public d w0() {
        if (this.f710k4 == null) {
            this.f710k4 = d.g(this, this);
        }
        return this.f710k4;
    }

    public androidx.appcompat.app.a x0() {
        return w0().m();
    }

    @Override // f.a
    public k.b z(b.a aVar) {
        return null;
    }

    public void z0(o oVar) {
        oVar.b(this);
    }
}
