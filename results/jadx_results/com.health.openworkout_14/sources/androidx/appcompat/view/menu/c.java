package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    final Context f272a;

    /* renamed from: b */
    private b.d.g<b.g.f.a.b, MenuItem> f273b;

    /* renamed from: c */
    private b.d.g<b.g.f.a.c, SubMenu> f274c;

    public c(Context context) {
        this.f272a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof b.g.f.a.b) {
            b.g.f.a.b bVar = (b.g.f.a.b) menuItem;
            if (this.f273b == null) {
                this.f273b = new b.d.g<>();
            }
            MenuItem menuItem2 = this.f273b.get(menuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            j jVar = new j(this.f272a, bVar);
            this.f273b.put(bVar, jVar);
            return jVar;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof b.g.f.a.c) {
            b.g.f.a.c cVar = (b.g.f.a.c) subMenu;
            if (this.f274c == null) {
                this.f274c = new b.d.g<>();
            }
            SubMenu subMenu2 = this.f274c.get(cVar);
            if (subMenu2 != null) {
                return subMenu2;
            }
            s sVar = new s(this.f272a, cVar);
            this.f274c.put(cVar, sVar);
            return sVar;
        }
        return subMenu;
    }

    public final void e() {
        b.d.g<b.g.f.a.b, MenuItem> gVar = this.f273b;
        if (gVar != null) {
            gVar.clear();
        }
        b.d.g<b.g.f.a.c, SubMenu> gVar2 = this.f274c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    public final void f(int i) {
        if (this.f273b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f273b.size()) {
            if (this.f273b.i(i2).getGroupId() == i) {
                this.f273b.k(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void g(int i) {
        if (this.f273b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f273b.size(); i2++) {
            if (this.f273b.i(i2).getItemId() == i) {
                this.f273b.k(i2);
                return;
            }
        }
    }
}
