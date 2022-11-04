package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.o0;
import androidx.core.view.y;
/* loaded from: classes.dex */
public final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: k4 */
    private static final int f1005k4 = e.g.m_res_0x7f0c0013;
    private final int U3;
    private final int V3;
    private final int W3;
    final o0 X3;

    /* renamed from: a4 */
    private PopupWindow.OnDismissListener f1006a4;

    /* renamed from: b4 */
    private View f1007b4;

    /* renamed from: c4 */
    View f1008c4;

    /* renamed from: d */
    private final Context f1009d;

    /* renamed from: d4 */
    private j.a f1010d4;

    /* renamed from: e4 */
    ViewTreeObserver f1011e4;

    /* renamed from: f4 */
    private boolean f1012f4;

    /* renamed from: g4 */
    private boolean f1013g4;

    /* renamed from: h4 */
    private int f1014h4;

    /* renamed from: j4 */
    private boolean f1016j4;

    /* renamed from: q */
    private final e f1017q;

    /* renamed from: x */
    private final d f1018x;

    /* renamed from: y */
    private final boolean f1019y;
    final ViewTreeObserver.OnGlobalLayoutListener Y3 = new a();
    private final View.OnAttachStateChangeListener Z3 = new b();

    /* renamed from: i4 */
    private int f1015i4 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
            l.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.c() || l.this.X3.B()) {
                return;
            }
            View view = l.this.f1008c4;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.X3.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        b() {
            l.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f1011e4;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f1011e4 = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f1011e4.removeGlobalOnLayoutListener(lVar.Y3);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f1009d = context;
        this.f1017q = eVar;
        this.f1019y = z10;
        this.f1018x = new d(eVar, LayoutInflater.from(context), z10, f1005k4);
        this.V3 = i10;
        this.W3 = i11;
        Resources resources = context.getResources();
        this.U3 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.d.d_res_0x7f060017));
        this.f1007b4 = view;
        this.X3 = new o0(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (c()) {
            return true;
        }
        if (this.f1012f4 || (view = this.f1007b4) == null) {
            return false;
        }
        this.f1008c4 = view;
        this.X3.K(this);
        this.X3.L(this);
        this.X3.J(true);
        View view2 = this.f1008c4;
        boolean z10 = this.f1011e4 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1011e4 = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.Y3);
        }
        view2.addOnAttachStateChangeListener(this.Z3);
        this.X3.D(view2);
        this.X3.G(this.f1015i4);
        if (!this.f1013g4) {
            this.f1014h4 = h.o(this.f1018x, null, this.f1009d, this.U3);
            this.f1013g4 = true;
        }
        this.X3.F(this.f1014h4);
        this.X3.I(2);
        this.X3.H(n());
        this.X3.a();
        ListView h10 = this.X3.h();
        h10.setOnKeyListener(this);
        if (this.f1016j4 && this.f1017q.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1009d).inflate(e.g.l_res_0x7f0c0012, (ViewGroup) h10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1017q.x());
            }
            frameLayout.setEnabled(false);
            h10.addHeaderView(frameLayout, null, false);
        }
        this.X3.p(this.f1018x);
        this.X3.a();
        return true;
    }

    @Override // l.e
    public void a() {
        if (z()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        if (eVar != this.f1017q) {
            return;
        }
        dismiss();
        j.a aVar = this.f1010d4;
        if (aVar == null) {
            return;
        }
        aVar.b(eVar, z10);
    }

    @Override // l.e
    public boolean c() {
        return !this.f1012f4 && this.X3.c();
    }

    @Override // l.e
    public void dismiss() {
        if (c()) {
            this.X3.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f1009d, mVar, this.f1008c4, this.f1019y, this.V3, this.W3);
            iVar.j(this.f1010d4);
            iVar.g(h.x(mVar));
            iVar.i(this.f1006a4);
            this.f1006a4 = null;
            this.f1017q.e(false);
            int d10 = this.X3.d();
            int n10 = this.X3.n();
            if ((Gravity.getAbsoluteGravity(this.f1015i4, y.B(this.f1007b4)) & 7) == 5) {
                d10 += this.f1007b4.getWidth();
            }
            if (iVar.n(d10, n10)) {
                j.a aVar = this.f1010d4;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        this.f1013g4 = false;
        d dVar = this.f1018x;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // l.e
    public ListView h() {
        return this.X3.h();
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.f1010d4 = aVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1012f4 = true;
        this.f1017q.close();
        ViewTreeObserver viewTreeObserver = this.f1011e4;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1011e4 = this.f1008c4.getViewTreeObserver();
            }
            this.f1011e4.removeGlobalOnLayoutListener(this.Y3);
            this.f1011e4 = null;
        }
        this.f1008c4.removeOnAttachStateChangeListener(this.Z3);
        PopupWindow.OnDismissListener onDismissListener = this.f1006a4;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.f1007b4 = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f1018x.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f1015i4 = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.X3.l(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1006a4 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.f1016j4 = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.X3.j(i10);
    }
}
