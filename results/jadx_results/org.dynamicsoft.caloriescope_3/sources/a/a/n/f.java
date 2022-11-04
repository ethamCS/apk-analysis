package a.a.n;

import a.a.n.b;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a */
    final Context f29a;

    /* renamed from: b */
    final b f30b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a */
        final ActionMode.Callback f31a;

        /* renamed from: b */
        final Context f32b;

        /* renamed from: c */
        final ArrayList<f> f33c = new ArrayList<>();
        final a.d.g<Menu, Menu> d = new a.d.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f32b = context;
            this.f31a = callback;
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 == null) {
                o oVar = new o(this.f32b, (a.g.f.a.a) menu);
                this.d.put(menu, oVar);
                return oVar;
            }
            return menu2;
        }

        @Override // a.a.n.b.a
        public void a(b bVar) {
            this.f31a.onDestroyActionMode(b(bVar));
        }

        @Override // a.a.n.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f31a.onPrepareActionMode(b(bVar), a(menu));
        }

        @Override // a.a.n.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f31a.onActionItemClicked(b(bVar), new j(this.f32b, (a.g.f.a.b) menuItem));
        }

        public ActionMode b(b bVar) {
            int size = this.f33c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f33c.get(i);
                if (fVar != null && fVar.f30b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f32b, bVar);
            this.f33c.add(fVar2);
            return fVar2;
        }

        @Override // a.a.n.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f31a.onCreateActionMode(b(bVar), a(menu));
        }
    }

    public f(Context context, b bVar) {
        this.f29a = context;
        this.f30b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f30b.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f30b.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f29a, (a.g.f.a.a) this.f30b.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f30b.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f30b.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f30b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f30b.g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f30b.h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f30b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f30b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f30b.a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f30b.a(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f30b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f30b.a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f30b.b(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f30b.b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f30b.a(z);
    }
}
