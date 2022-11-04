package androidx.appcompat.app;

import a.g.l.u;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.x0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class k extends androidx.appcompat.app.a {

    /* renamed from: a */
    d0 f524a;

    /* renamed from: b */
    boolean f525b;

    /* renamed from: c */
    Window.Callback f526c;
    private boolean d;
    private boolean e;
    private ArrayList<a.b> f = new ArrayList<>();
    private final Runnable g = new a();
    private final Toolbar.f h = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            k.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Toolbar.f {
        b() {
            k.this = r1;
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return k.this.f526c.onMenuItemSelected(0, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements m.a {

        /* renamed from: b */
        private boolean f529b;

        c() {
            k.this = r1;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (this.f529b) {
                return;
            }
            this.f529b = true;
            k.this.f524a.g();
            Window.Callback callback = k.this.f526c;
            if (callback != null) {
                callback.onPanelClosed(108, gVar);
            }
            this.f529b = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callback = k.this.f526c;
            if (callback != null) {
                callback.onMenuOpened(108, gVar);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public final class d implements g.a {
        d() {
            k.this = r1;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(androidx.appcompat.view.menu.g gVar) {
            k kVar = k.this;
            if (kVar.f526c != null) {
                if (kVar.f524a.d()) {
                    k.this.f526c.onPanelClosed(108, gVar);
                } else if (!k.this.f526c.onPreparePanel(0, null, gVar)) {
                } else {
                    k.this.f526c.onMenuOpened(108, gVar);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends a.a.n.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Window.Callback callback) {
            super(callback);
            k.this = r1;
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(k.this.f524a.n()) : super.onCreatePanelView(i);
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                k kVar = k.this;
                if (!kVar.f525b) {
                    kVar.f524a.c();
                    k.this.f525b = true;
                }
            }
            return onPreparePanel;
        }
    }

    public k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f524a = new x0(toolbar, false);
        e eVar = new e(callback);
        this.f526c = eVar;
        this.f524a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(this.h);
        this.f524a.setWindowTitle(charSequence);
    }

    private Menu n() {
        if (!this.d) {
            this.f524a.a(new c(), new d());
            this.d = true;
        }
        return this.f524a.j();
    }

    @Override // androidx.appcompat.app.a
    public void a(Configuration configuration) {
        super.a(configuration);
    }

    @Override // androidx.appcompat.app.a
    public void a(Drawable drawable) {
        this.f524a.a(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void a(CharSequence charSequence) {
        this.f524a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public boolean a(int i, KeyEvent keyEvent) {
        Menu n = n();
        if (n != null) {
            boolean z = true;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                z = false;
            }
            n.setQwertyMode(z);
            return n.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void b(int i) {
        this.f524a.c(i);
    }

    @Override // androidx.appcompat.app.a
    public void b(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            this.f.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void d(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public boolean e() {
        return this.f524a.f();
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        if (this.f524a.k()) {
            this.f524a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public int g() {
        return this.f524a.h();
    }

    @Override // androidx.appcompat.app.a
    public Context h() {
        return this.f524a.n();
    }

    @Override // androidx.appcompat.app.a
    public boolean i() {
        this.f524a.l().removeCallbacks(this.g);
        u.a(this.f524a.l(), this.g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void j() {
        this.f524a.l().removeCallbacks(this.g);
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        return this.f524a.a();
    }

    public Window.Callback l() {
        return this.f526c;
    }

    void m() {
        Menu n = n();
        androidx.appcompat.view.menu.g gVar = n instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) n : null;
        if (gVar != null) {
            gVar.s();
        }
        try {
            n.clear();
            if (!this.f526c.onCreatePanelMenu(0, n) || !this.f526c.onPreparePanel(0, null, n)) {
                n.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.r();
            }
        }
    }
}
