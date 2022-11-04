package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import k.b;
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a */
    final Context f14485a;

    /* renamed from: b */
    final b f14486b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a */
        final ActionMode.Callback f14487a;

        /* renamed from: b */
        final Context f14488b;

        /* renamed from: c */
        final ArrayList<f> f14489c = new ArrayList<>();

        /* renamed from: d */
        final i0.g<Menu, Menu> f14490d = new i0.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f14488b = context;
            this.f14487a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f14490d.get(menu);
            if (menu2 == null) {
                l.d dVar = new l.d(this.f14488b, (r0.a) menu);
                this.f14490d.put(menu, dVar);
                return dVar;
            }
            return menu2;
        }

        @Override // k.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f14487a.onActionItemClicked(e(bVar), new l.c(this.f14488b, (r0.b) menuItem));
        }

        @Override // k.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f14487a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // k.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f14487a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // k.b.a
        public void d(b bVar) {
            this.f14487a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f14489c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f14489c.get(i10);
                if (fVar != null && fVar.f14486b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f14488b, bVar);
            this.f14489c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f14485a = context;
        this.f14486b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f14486b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f14486b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new l.d(this.f14485a, (r0.a) this.f14486b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f14486b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f14486b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f14486b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f14486b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f14486b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f14486b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f14486b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f14486b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f14486b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f14486b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f14486b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f14486b.q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f14486b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f14486b.s(z10);
    }
}
