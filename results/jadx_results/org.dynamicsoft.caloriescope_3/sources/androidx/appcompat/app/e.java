package androidx.appcompat.app;

import a.a.n.b;
import android.app.Activity;
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
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.core.app.g;
/* loaded from: classes.dex */
public class e extends androidx.fragment.app.d implements f, g.a, b.c {
    private g r;
    private Resources s;

    private boolean a(int i, KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.f
    public a.a.n.b a(b.a aVar) {
        return null;
    }

    @Override // androidx.appcompat.app.f
    public void a(a.a.n.b bVar) {
    }

    public void a(Intent intent) {
        androidx.core.app.e.a(this, intent);
    }

    public void a(Toolbar toolbar) {
        k().a(toolbar);
    }

    public void a(androidx.core.app.g gVar) {
        gVar.a((Activity) this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k().a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        k().a(context);
    }

    @Override // androidx.appcompat.app.f
    public void b(a.a.n.b bVar) {
    }

    public void b(androidx.core.app.g gVar) {
    }

    public boolean b(Intent intent) {
        return androidx.core.app.e.b(this, intent);
    }

    public void c(int i) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a l = l();
        if (getWindow().hasFeature(0)) {
            if (l != null && l.e()) {
                return;
            }
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.appcompat.app.b.c
    public b.AbstractC0030b d() {
        return k().a();
    }

    @Override // androidx.core.app.d, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a l = l();
        if (keyCode != 82 || l == null || !l.a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.core.app.g.a
    public Intent f() {
        return androidx.core.app.e.a(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) k().a(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return k().c();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.s == null && b1.b()) {
            this.s = new b1(this, super.getResources());
        }
        Resources resources = this.s;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        k().f();
    }

    @Override // androidx.fragment.app.d
    public void j() {
        k().f();
    }

    public g k() {
        if (this.r == null) {
            this.r = g.a(this, this);
        }
        return this.r;
    }

    public a l() {
        return k().d();
    }

    @Deprecated
    public void m() {
    }

    public boolean n() {
        Intent f = f();
        if (f != null) {
            if (!b(f)) {
                a(f);
                return true;
            }
            androidx.core.app.g a2 = androidx.core.app.g.a((Context) this);
            a(a2);
            b(a2);
            a2.a();
            try {
                androidx.core.app.a.a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.s != null) {
            this.s.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        k().a(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        g k = k();
        k.e();
        k.a(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a l = l();
        if (menuItem.getItemId() == 16908332 && l != null && (l.g() & 4) != 0) {
            return n();
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
        k().b(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        k().h();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k().c(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onStart() {
        super.onStart();
        k().i();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        super.onStop();
        k().j();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        k().a(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a l = l();
        if (getWindow().hasFeature(0)) {
            if (l != null && l.k()) {
                return;
            }
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        k().c(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        k().a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k().b(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        k().d(i);
    }
}
