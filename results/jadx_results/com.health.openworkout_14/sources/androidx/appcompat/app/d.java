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
import androidx.appcompat.widget.b1;
import androidx.core.app.n;
import b.a.o.b;
/* loaded from: classes.dex */
public class d extends androidx.fragment.app.d implements e, n.a {
    private f r;
    private Resources s;

    private boolean G(KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    public a A() {
        return y().p();
    }

    public void B(androidx.core.app.n nVar) {
        nVar.c(this);
    }

    public void C(int i) {
    }

    public void D(androidx.core.app.n nVar) {
    }

    @Deprecated
    public void E() {
    }

    public boolean F() {
        Intent f2 = f();
        if (f2 != null) {
            if (!J(f2)) {
                I(f2);
                return true;
            }
            androidx.core.app.n e2 = androidx.core.app.n.e(this);
            B(e2);
            D(e2);
            e2.h();
            try {
                androidx.core.app.a.f(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    public void H(Toolbar toolbar) {
        y().H(toolbar);
    }

    public void I(Intent intent) {
        androidx.core.app.g.e(this, intent);
    }

    public boolean J(Intent intent) {
        return androidx.core.app.g.f(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(y().h(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a A = A();
        if (getWindow().hasFeature(0)) {
            if (A != null && A.g()) {
                return;
            }
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a A = A();
        if (keyCode != 82 || A == null || !A.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.core.app.n.a
    public Intent f() {
        return androidx.core.app.g.a(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) y().k(i);
    }

    @Override // androidx.appcompat.app.e
    public void g(b.a.o.b bVar) {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return y().o();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.s == null && b1.b()) {
            this.s = new b1(this, super.getResources());
        }
        Resources resources = this.s;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.e
    public void i(b.a.o.b bVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        y().r();
    }

    @Override // androidx.appcompat.app.e
    public b.a.o.b j(b.a aVar) {
        return null;
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.s != null) {
            this.s.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        y().s(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        E();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        f y = y();
        y.q();
        y.t(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        y().u();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (G(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a A = A();
        if (menuItem.getItemId() == 16908332 && A != null && (A.j() & 4) != 0) {
            return F();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        y().v(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        y().w();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        y().x(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onStart() {
        super.onStart();
        y().y();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        super.onStop();
        y().z();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        y().J(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a A = A();
        if (getWindow().hasFeature(0)) {
            if (A != null && A.q()) {
                return;
            }
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        y().D(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        y().E(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y().F(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        y().I(i);
    }

    @Override // androidx.fragment.app.d
    public void x() {
        y().r();
    }

    public f y() {
        if (this.r == null) {
            this.r = f.i(this, this);
        }
        return this.r;
    }

    public b z() {
        return y().m();
    }
}
