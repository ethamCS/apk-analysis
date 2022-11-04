package b.g.l;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    private AbstractC0052b f2502a;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: b.g.l.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0052b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f2502a = null;
    }

    public void i(a aVar) {
    }

    public void j(AbstractC0052b abstractC0052b) {
        if (this.f2502a != null && abstractC0052b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2502a = abstractC0052b;
    }
}
