package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l0;
import b.g.l.t;
/* loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private static final int w = b.a.g.m_res_0x7f0c0013;

    /* renamed from: c */
    private final Context f348c;

    /* renamed from: d */
    private final g f349d;

    /* renamed from: e */
    private final f f350e;

    /* renamed from: f */
    private final boolean f351f;

    /* renamed from: g */
    private final int f352g;

    /* renamed from: h */
    private final int f353h;
    private final int i;
    final l0 j;
    private PopupWindow.OnDismissListener m;
    private View n;
    View o;
    private m.a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean v;
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private int u = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
            q.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.b() || q.this.j.B()) {
                return;
            }
            View view = q.this.o;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.j.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        b() {
            q.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.q = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.q.removeGlobalOnLayoutListener(qVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i, int i2, boolean z) {
        this.f348c = context;
        this.f349d = gVar;
        this.f351f = z;
        this.f350e = new f(gVar, LayoutInflater.from(context), z, w);
        this.f353h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.f352g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b.a.d.d_res_0x7f070017));
        this.n = view;
        this.j = new l0(context, null, i, i2);
        gVar.c(this, context);
    }

    private boolean C() {
        View view;
        if (b()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.j.K(this);
        this.j.L(this);
        this.j.J(true);
        View view2 = this.o;
        boolean z = this.q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        view2.addOnAttachStateChangeListener(this.l);
        this.j.D(view2);
        this.j.G(this.u);
        if (!this.s) {
            this.t = k.r(this.f350e, null, this.f348c, this.f352g);
            this.s = true;
        }
        this.j.F(this.t);
        this.j.I(2);
        this.j.H(q());
        this.j.g();
        ListView l = this.j.l();
        l.setOnKeyListener(this);
        if (this.v && this.f349d.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f348c).inflate(b.a.g.l_res_0x7f0c0012, (ViewGroup) l, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f349d.z());
            }
            frameLayout.setEnabled(false);
            l.addHeaderView(frameLayout, null, false);
        }
        this.j.o(this.f350e);
        this.j.g();
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        if (gVar != this.f349d) {
            return;
        }
        dismiss();
        m.a aVar = this.p;
        if (aVar == null) {
            return;
        }
        aVar.a(gVar, z);
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return !this.r && this.j.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (b()) {
            this.j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable e() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.p
    public void g() {
        if (C()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(m.a aVar) {
        this.p = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView l() {
        return this.j.l();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean m(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f348c, rVar, this.o, this.f351f, this.f353h, this.i);
            lVar.j(this.p);
            lVar.g(k.A(rVar));
            lVar.i(this.m);
            this.m = null;
            this.f349d.e(false);
            int e2 = this.j.e();
            int h2 = this.j.h();
            if ((Gravity.getAbsoluteGravity(this.u, t.y(this.n)) & 7) == 5) {
                e2 += this.n.getWidth();
            }
            if (lVar.n(e2, h2)) {
                m.a aVar = this.p;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void n(boolean z) {
        this.s = false;
        f fVar = this.f350e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void o(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.r = true;
        this.f349d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(View view) {
        this.n = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(boolean z) {
        this.f350e.d(z);
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i) {
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i) {
        this.j.d(i);
    }

    @Override // androidx.appcompat.view.menu.k
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void y(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void z(int i) {
        this.j.n(i);
    }
}
