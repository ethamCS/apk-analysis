package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    private final Context f3645a;

    /* renamed from: b */
    private a f3646b;

    /* renamed from: c */
    private AbstractC0042b f3647c;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0042b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f3645a = context;
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
        this.f3647c = null;
        this.f3646b = null;
    }

    public void i(a aVar) {
        this.f3646b = aVar;
    }

    public void j(AbstractC0042b abstractC0042b) {
        if (this.f3647c != null && abstractC0042b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3647c = abstractC0042b;
    }
}
