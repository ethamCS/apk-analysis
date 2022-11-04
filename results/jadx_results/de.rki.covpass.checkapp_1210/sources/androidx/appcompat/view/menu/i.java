package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.y;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    private final Context f992a;

    /* renamed from: b */
    private final e f993b;

    /* renamed from: c */
    private final boolean f994c;

    /* renamed from: d */
    private final int f995d;

    /* renamed from: e */
    private final int f996e;

    /* renamed from: f */
    private View f997f;

    /* renamed from: g */
    private int f998g;

    /* renamed from: h */
    private boolean f999h;

    /* renamed from: i */
    private j.a f1000i;

    /* renamed from: j */
    private h f1001j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1002k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1003l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        a() {
            i.this = r1;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f998g = 8388611;
        this.f1003l = new a();
        this.f992a = context;
        this.f993b = eVar;
        this.f997f = view;
        this.f994c = z10;
        this.f995d = i10;
        this.f996e = i11;
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f992a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f992a.getResources().getDimensionPixelSize(e.d.c_res_0x7f060016) ? new b(this.f992a, this.f997f, this.f995d, this.f996e, this.f994c) : new l(this.f992a, this.f993b, this.f997f, this.f995d, this.f996e, this.f994c);
        bVar.l(this.f993b);
        bVar.u(this.f1003l);
        bVar.p(this.f997f);
        bVar.k(this.f1000i);
        bVar.r(this.f999h);
        bVar.s(this.f998g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h c10 = c();
        c10.v(z11);
        if (z10) {
            if ((androidx.core.view.e.b(this.f998g, y.B(this.f997f)) & 7) == 5) {
                i10 -= this.f997f.getWidth();
            }
            c10.t(i10);
            c10.w(i11);
            int i12 = (int) ((this.f992a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.a();
    }

    public void b() {
        if (d()) {
            this.f1001j.dismiss();
        }
    }

    public h c() {
        if (this.f1001j == null) {
            this.f1001j = a();
        }
        return this.f1001j;
    }

    public boolean d() {
        h hVar = this.f1001j;
        return hVar != null && hVar.c();
    }

    public void e() {
        this.f1001j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1002k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f997f = view;
    }

    public void g(boolean z10) {
        this.f999h = z10;
        h hVar = this.f1001j;
        if (hVar != null) {
            hVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f998g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1002k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f1000i = aVar;
        h hVar = this.f1001j;
        if (hVar != null) {
            hVar.k(aVar);
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
        if (this.f997f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f997f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }
}
