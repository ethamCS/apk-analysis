package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.m;
/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: b */
    private g f578b;

    /* renamed from: c */
    private androidx.appcompat.app.d f579c;
    e d;
    private m.a e;

    public h(g gVar) {
        this.f578b = gVar;
    }

    public void a() {
        androidx.appcompat.app.d dVar = this.f579c;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    public void a(IBinder iBinder) {
        g gVar = this.f578b;
        d.a aVar = new d.a(gVar.e());
        e eVar = new e(aVar.b(), a.a.g.abc_list_menu_item_layout);
        this.d = eVar;
        eVar.a(this);
        this.f578b.a(this.d);
        aVar.a(this.d.a(), this);
        View i = gVar.i();
        if (i != null) {
            aVar.a(i);
        } else {
            aVar.a(gVar.g());
            aVar.b(gVar.h());
        }
        aVar.a(this);
        androidx.appcompat.app.d a2 = aVar.a();
        this.f579c = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f579c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f579c.show();
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void a(g gVar, boolean z) {
        if (z || gVar == this.f578b) {
            a();
        }
        m.a aVar = this.e;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean a(g gVar) {
        m.a aVar = this.e;
        if (aVar != null) {
            return aVar.a(gVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f578b.a((i) this.d.a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.d.a(this.f578b, true);
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
                Window window2 = this.f579c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f579c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f578b.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f578b.performShortcut(i, keyEvent, 0);
    }
}
