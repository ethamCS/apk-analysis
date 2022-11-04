package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import b.g.l.t;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private final Context f338a;

    /* renamed from: b */
    private final g f339b;

    /* renamed from: c */
    private final boolean f340c;

    /* renamed from: d */
    private final int f341d;

    /* renamed from: e */
    private final int f342e;

    /* renamed from: f */
    private View f343f;

    /* renamed from: g */
    private int f344g;

    /* renamed from: h */
    private boolean f345h;
    private m.a i;
    private k j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        a() {
            l.this = r1;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public l(Context context, g gVar, View view, boolean z, int i, int i2) {
        this.f344g = 8388611;
        this.l = new a();
        this.f338a = context;
        this.f339b = gVar;
        this.f343f = view;
        this.f340c = z;
        this.f341d = i;
        this.f342e = i2;
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.f338a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        k dVar = Math.min(point.x, point.y) >= this.f338a.getResources().getDimensionPixelSize(b.a.d.c_res_0x7f070016) ? new d(this.f338a, this.f343f, this.f341d, this.f342e, this.f340c) : new q(this.f338a, this.f339b, this.f343f, this.f341d, this.f342e, this.f340c);
        dVar.o(this.f339b);
        dVar.x(this.l);
        dVar.s(this.f343f);
        dVar.k(this.i);
        dVar.u(this.f345h);
        dVar.v(this.f344g);
        return dVar;
    }

    private void l(int i, int i2, boolean z, boolean z2) {
        k c2 = c();
        c2.y(z2);
        if (z) {
            if ((b.g.l.e.b(this.f344g, t.y(this.f343f)) & 7) == 5) {
                i -= this.f343f.getWidth();
            }
            c2.w(i);
            c2.z(i2);
            int i3 = (int) ((this.f338a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c2.t(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c2.g();
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public k c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        k kVar = this.j;
        return kVar != null && kVar.b();
    }

    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f343f = view;
    }

    public void g(boolean z) {
        this.f345h = z;
        k kVar = this.j;
        if (kVar != null) {
            kVar.u(z);
        }
    }

    public void h(int i) {
        this.f344g = i;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.i = aVar;
        k kVar = this.j;
        if (kVar != null) {
            kVar.k(aVar);
        }
    }

    public void k() {
        if (m()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f343f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i, int i2) {
        if (d()) {
            return true;
        }
        if (this.f343f == null) {
            return false;
        }
        l(i, i2, true, true);
        return true;
    }
}
