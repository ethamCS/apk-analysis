package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import i0.g;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    final Context f15629a;

    /* renamed from: b */
    private g<r0.b, MenuItem> f15630b;

    /* renamed from: c */
    private g<r0.c, SubMenu> f15631c;

    public b(Context context) {
        this.f15629a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof r0.b) {
            r0.b bVar = (r0.b) menuItem;
            if (this.f15630b == null) {
                this.f15630b = new g<>();
            }
            MenuItem menuItem2 = this.f15630b.get(menuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            c cVar = new c(this.f15629a, bVar);
            this.f15630b.put(bVar, cVar);
            return cVar;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof r0.c) {
            r0.c cVar = (r0.c) subMenu;
            if (this.f15631c == null) {
                this.f15631c = new g<>();
            }
            SubMenu subMenu2 = this.f15631c.get(cVar);
            if (subMenu2 != null) {
                return subMenu2;
            }
            f fVar = new f(this.f15629a, cVar);
            this.f15631c.put(cVar, fVar);
            return fVar;
        }
        return subMenu;
    }

    public final void e() {
        g<r0.b, MenuItem> gVar = this.f15630b;
        if (gVar != null) {
            gVar.clear();
        }
        g<r0.c, SubMenu> gVar2 = this.f15631c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    public final void f(int i10) {
        if (this.f15630b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f15630b.size()) {
            if (this.f15630b.j(i11).getGroupId() == i10) {
                this.f15630b.l(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void g(int i10) {
        if (this.f15630b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f15630b.size(); i11++) {
            if (this.f15630b.j(i11).getItemId() == i10) {
                this.f15630b.l(i11);
                return;
            }
        }
    }
}
