package b.a.o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import b.a.o.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a */
    final Context f2058a;

    /* renamed from: b */
    final b f2059b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a */
        final ActionMode.Callback f2060a;

        /* renamed from: b */
        final Context f2061b;

        /* renamed from: c */
        final ArrayList<f> f2062c = new ArrayList<>();

        /* renamed from: d */
        final b.d.g<Menu, Menu> f2063d = new b.d.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f2061b = context;
            this.f2060a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f2063d.get(menu);
            if (menu2 == null) {
                o oVar = new o(this.f2061b, (b.g.f.a.a) menu);
                this.f2063d.put(menu, oVar);
                return oVar;
            }
            return menu2;
        }

        @Override // b.a.o.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f2060a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // b.a.o.b.a
        public boolean b(b bVar, MenuItem menuItem) {
            return this.f2060a.onActionItemClicked(e(bVar), new j(this.f2061b, (b.g.f.a.b) menuItem));
        }

        @Override // b.a.o.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f2060a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // b.a.o.b.a
        public void d(b bVar) {
            this.f2060a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f2062c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f2062c.get(i);
                if (fVar != null && fVar.f2059b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f2061b, bVar);
            this.f2062c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f2058a = context;
        this.f2059b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f2059b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f2059b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f2058a, (b.g.f.a.a) this.f2059b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f2059b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f2059b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f2059b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f2059b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f2059b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f2059b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f2059b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f2059b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f2059b.n(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f2059b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f2059b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f2059b.q(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f2059b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f2059b.s(z);
    }
}
