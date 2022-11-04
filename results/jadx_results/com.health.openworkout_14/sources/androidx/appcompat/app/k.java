package androidx.appcompat.app;

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
import b.g.l.t;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class k extends androidx.appcompat.app.a {

    /* renamed from: a */
    d0 f200a;

    /* renamed from: b */
    boolean f201b;

    /* renamed from: c */
    Window.Callback f202c;

    /* renamed from: d */
    private boolean f203d;

    /* renamed from: e */
    private boolean f204e;

    /* renamed from: f */
    private ArrayList<a.b> f205f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f206g = new a();

    /* renamed from: h */
    private final Toolbar.f f207h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            k.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.B();
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
            return k.this.f202c.onMenuItemSelected(0, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements m.a {

        /* renamed from: b */
        private boolean f210b;

        c() {
            k.this = r1;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (this.f210b) {
                return;
            }
            this.f210b = true;
            k.this.f200a.h();
            Window.Callback callback = k.this.f202c;
            if (callback != null) {
                callback.onPanelClosed(androidx.constraintlayout.widget.j.H0, gVar);
            }
            this.f210b = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callback = k.this.f202c;
            if (callback != null) {
                callback.onMenuOpened(androidx.constraintlayout.widget.j.H0, gVar);
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
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            k kVar = k.this;
            if (kVar.f202c != null) {
                if (kVar.f200a.c()) {
                    k.this.f202c.onPanelClosed(androidx.constraintlayout.widget.j.H0, gVar);
                } else if (!k.this.f202c.onPreparePanel(0, null, gVar)) {
                } else {
                    k.this.f202c.onMenuOpened(androidx.constraintlayout.widget.j.H0, gVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends b.a.o.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Window.Callback callback) {
            super(callback);
            k.this = r1;
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(k.this.f200a.r()) : super.onCreatePanelView(i);
        }

        @Override // b.a.o.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                k kVar = k.this;
                if (!kVar.f201b) {
                    kVar.f200a.f();
                    k.this.f201b = true;
                }
            }
            return onPreparePanel;
        }
    }

    public k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f207h = bVar;
        this.f200a = new x0(toolbar, false);
        e eVar = new e(callback);
        this.f202c = eVar;
        this.f200a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f200a.setWindowTitle(charSequence);
    }

    private Menu z() {
        if (!this.f203d) {
            this.f200a.i(new c(), new d());
            this.f203d = true;
        }
        return this.f200a.l();
    }

    public Window.Callback A() {
        return this.f202c;
    }

    void B() {
        Menu z = z();
        androidx.appcompat.view.menu.g gVar = z instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) z : null;
        if (gVar != null) {
            gVar.h0();
        }
        try {
            z.clear();
            if (!this.f202c.onCreatePanelMenu(0, z) || !this.f202c.onPreparePanel(0, null, z)) {
                z.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.g0();
            }
        }
    }

    public void C(int i, int i2) {
        this.f200a.z((i & i2) | ((~i2) & this.f200a.j()));
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        return this.f200a.d();
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        if (this.f200a.v()) {
            this.f200a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z == this.f204e) {
            return;
        }
        this.f204e = z;
        int size = this.f205f.size();
        for (int i = 0; i < size; i++) {
            this.f205f.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f200a.j();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        return this.f200a.r();
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f200a.o().removeCallbacks(this.f206g);
        t.a0(this.f200a.o(), this.f206g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.a
    public void n() {
        this.f200a.o().removeCallbacks(this.f206g);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i, KeyEvent keyEvent) {
        Menu z = z();
        if (z != null) {
            boolean z2 = true;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                z2 = false;
            }
            z.setQwertyMode(z2);
            return z.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean q() {
        return this.f200a.e();
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        C(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(int i) {
        this.f200a.p(i);
    }

    @Override // androidx.appcompat.app.a
    public void u(Drawable drawable) {
        this.f200a.x(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f200a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f200a.setWindowTitle(charSequence);
    }
}
