package a.g.l;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    private AbstractC0015b f254a;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: a.g.l.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0015b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
    }

    public View a(MenuItem menuItem) {
        return c();
    }

    public void a(a aVar) {
    }

    public void a(AbstractC0015b abstractC0015b) {
        if (this.f254a != null && abstractC0015b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f254a = abstractC0015b;
    }

    public void a(SubMenu subMenu) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public void f() {
        this.f254a = null;
    }
}
