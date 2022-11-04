package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    final Context f557a;

    /* renamed from: b */
    private Map<a.g.f.a.b, MenuItem> f558b;

    /* renamed from: c */
    private Map<a.g.f.a.c, SubMenu> f559c;

    public c(Context context) {
        this.f557a = context;
    }

    public final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof a.g.f.a.b) {
            a.g.f.a.b bVar = (a.g.f.a.b) menuItem;
            if (this.f558b == null) {
                this.f558b = new a.d.a();
            }
            MenuItem menuItem2 = this.f558b.get(menuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            j jVar = new j(this.f557a, bVar);
            this.f558b.put(bVar, jVar);
            return jVar;
        }
        return menuItem;
    }

    public final SubMenu a(SubMenu subMenu) {
        if (subMenu instanceof a.g.f.a.c) {
            a.g.f.a.c cVar = (a.g.f.a.c) subMenu;
            if (this.f559c == null) {
                this.f559c = new a.d.a();
            }
            SubMenu subMenu2 = this.f559c.get(cVar);
            if (subMenu2 != null) {
                return subMenu2;
            }
            s sVar = new s(this.f557a, cVar);
            this.f559c.put(cVar, sVar);
            return sVar;
        }
        return subMenu;
    }

    public final void a(int i) {
        Map<a.g.f.a.b, MenuItem> map = this.f558b;
        if (map == null) {
            return;
        }
        Iterator<a.g.f.a.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    public final void b() {
        Map<a.g.f.a.b, MenuItem> map = this.f558b;
        if (map != null) {
            map.clear();
        }
        Map<a.g.f.a.c, SubMenu> map2 = this.f559c;
        if (map2 != null) {
            map2.clear();
        }
    }

    public final void b(int i) {
        Map<a.g.f.a.b, MenuItem> map = this.f558b;
        if (map == null) {
            return;
        }
        Iterator<a.g.f.a.b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
