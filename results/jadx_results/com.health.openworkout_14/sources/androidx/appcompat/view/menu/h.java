package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.m;
/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: b */
    private g f314b;

    /* renamed from: c */
    private androidx.appcompat.app.c f315c;

    /* renamed from: d */
    e f316d;

    /* renamed from: e */
    private m.a f317e;

    public h(g gVar) {
        this.f314b = gVar;
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void a(g gVar, boolean z) {
        if (z || gVar == this.f314b) {
            c();
        }
        m.a aVar = this.f317e;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean b(g gVar) {
        m.a aVar = this.f317e;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.c cVar = this.f315c;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f314b;
        c.a aVar = new c.a(gVar.w());
        e eVar = new e(aVar.b(), b.a.g.j_res_0x7f0c0010);
        this.f316d = eVar;
        eVar.k(this);
        this.f314b.b(this.f316d);
        aVar.c(this.f316d.b(), this);
        View A = gVar.A();
        if (A != null) {
            aVar.d(A);
        } else {
            aVar.f(gVar.y());
            aVar.q(gVar.z());
        }
        aVar.k(this);
        androidx.appcompat.app.c a2 = aVar.a();
        this.f315c = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f315c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f315c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f314b.N((i) this.f316d.b().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f316d.a(this.f314b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f315c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f315c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f314b.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f314b.performShortcut(i, keyEvent, 0);
    }
}
