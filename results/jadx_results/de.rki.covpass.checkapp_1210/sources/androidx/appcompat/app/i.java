package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.e;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.g0;
import androidx.core.view.y;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class i extends androidx.appcompat.app.a {

    /* renamed from: a */
    final g0 f805a;

    /* renamed from: b */
    final Window.Callback f806b;

    /* renamed from: d */
    boolean f808d;

    /* renamed from: e */
    private boolean f809e;

    /* renamed from: f */
    private boolean f810f;

    /* renamed from: i */
    private final Toolbar.f f813i;

    /* renamed from: g */
    private ArrayList<a.b> f811g = new ArrayList<>();

    /* renamed from: h */
    private final Runnable f812h = new a();

    /* renamed from: c */
    final e.f f807c = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            i.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Toolbar.f {
        b() {
            i.this = r1;
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return i.this.f806b.onMenuItemSelected(0, menuItem);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements j.a {

        /* renamed from: c */
        private boolean f816c;

        c() {
            i.this = r1;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f816c) {
                return;
            }
            this.f816c = true;
            i.this.f805a.i();
            i.this.f806b.onPanelClosed(108, eVar);
            this.f816c = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            i.this.f806b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public final class d implements e.a {
        d() {
            i.this = r1;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (i.this.f805a.c()) {
                i.this.f806b.onPanelClosed(108, eVar);
            } else if (!i.this.f806b.onPreparePanel(0, null, eVar)) {
            } else {
                i.this.f806b.onMenuOpened(108, eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements e.f {
        e() {
            i.this = r1;
        }

        @Override // androidx.appcompat.app.e.f
        public boolean a(int i10) {
            if (i10 == 0) {
                i iVar = i.this;
                if (iVar.f808d) {
                    return false;
                }
                iVar.f805a.d();
                i.this.f808d = true;
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.app.e.f
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(i.this.f805a.b());
            }
            return null;
        }
    }

    public i(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f813i = bVar;
        androidx.core.util.h.g(toolbar);
        c1 c1Var = new c1(toolbar, false);
        this.f805a = c1Var;
        this.f806b = (Window.Callback) androidx.core.util.h.g(callback);
        c1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        c1Var.setWindowTitle(charSequence);
    }

    private Menu z() {
        if (!this.f809e) {
            this.f805a.j(new c(), new d());
            this.f809e = true;
        }
        return this.f805a.r();
    }

    void A() {
        Menu z10 = z();
        androidx.appcompat.view.menu.e eVar = z10 instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) z10 : null;
        if (eVar != null) {
            eVar.d0();
        }
        try {
            z10.clear();
            if (!this.f806b.onCreatePanelMenu(0, z10) || !this.f806b.onPreparePanel(0, null, z10)) {
                z10.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.c0();
            }
        }
    }

    public void B(int i10, int i11) {
        this.f805a.p((i10 & i11) | ((~i11) & this.f805a.q()));
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        return this.f805a.f();
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        if (this.f805a.o()) {
            this.f805a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z10) {
        if (z10 == this.f810f) {
            return;
        }
        this.f810f = z10;
        int size = this.f811g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f811g.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f805a.q();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        return this.f805a.b();
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f805a.m().removeCallbacks(this.f812h);
        y.g0(this.f805a.m(), this.f812h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.a
    public void n() {
        this.f805a.m().removeCallbacks(this.f812h);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu z10 = z();
        if (z10 != null) {
            boolean z11 = true;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                z11 = false;
            }
            z10.setQwertyMode(z11);
            return z10.performShortcut(i10, keyEvent, 0);
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
        return this.f805a.g();
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        B(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        B(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void u(int i10) {
        this.f805a.t(i10);
    }

    @Override // androidx.appcompat.app.a
    public void v(int i10) {
        this.f805a.z(i10);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f805a.setWindowTitle(charSequence);
    }
}
