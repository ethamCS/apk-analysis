package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: c */
    private e f960c;

    /* renamed from: d */
    private androidx.appcompat.app.b f961d;

    /* renamed from: q */
    c f962q;

    /* renamed from: x */
    private j.a f963x;

    public f(e eVar) {
        this.f960c = eVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f961d;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z10) {
        if (z10 || eVar == this.f960c) {
            a();
        }
        j.a aVar = this.f963x;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f963x;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f960c;
        b.a aVar = new b.a(eVar.u());
        c cVar = new c(aVar.b(), e.g.j_res_0x7f0c0010);
        this.f962q = cVar;
        cVar.k(this);
        this.f960c.b(this.f962q);
        aVar.c(this.f962q.a(), this);
        View y10 = eVar.y();
        if (y10 != null) {
            aVar.e(y10);
        } else {
            aVar.f(eVar.w()).m(eVar.x());
        }
        aVar.j(this);
        androidx.appcompat.app.b a10 = aVar.a();
        this.f961d = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f961d.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f961d.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f960c.L((g) this.f962q.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f962q.b(this.f960c, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f961d.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f961d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f960c.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f960c.performShortcut(i10, keyEvent, 0);
    }
}
