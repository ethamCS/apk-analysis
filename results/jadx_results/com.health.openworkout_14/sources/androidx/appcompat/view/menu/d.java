package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import b.g.l.t;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = b.a.g.e_res_0x7f0c000b;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c */
    private final Context f275c;

    /* renamed from: d */
    private final int f276d;

    /* renamed from: e */
    private final int f277e;

    /* renamed from: f */
    private final int f278f;

    /* renamed from: g */
    private final boolean f279g;
    private View p;
    View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private m.a y;
    ViewTreeObserver z;
    private final List<g> i = new ArrayList();
    final List<C0008d> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private final k0 m = new c();
    private int n = 0;
    private int o = 0;
    private boolean w = false;
    private int r = G();

    /* renamed from: h */
    final Handler f280h = new Handler();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
            d.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.b() || d.this.j.size() <= 0 || d.this.j.get(0).f288a.B()) {
                return;
            }
            View view = d.this.q;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            for (C0008d c0008d : d.this.j) {
                c0008d.f288a.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        b() {
            d.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements k0 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0008d f284b;

            /* renamed from: c */
            final /* synthetic */ MenuItem f285c;

            /* renamed from: d */
            final /* synthetic */ g f286d;

            a(C0008d c0008d, MenuItem menuItem, g gVar) {
                c.this = r1;
                this.f284b = c0008d;
                this.f285c = menuItem;
                this.f286d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0008d c0008d = this.f284b;
                if (c0008d != null) {
                    d.this.B = true;
                    c0008d.f289b.e(false);
                    d.this.B = false;
                }
                if (!this.f285c.isEnabled() || !this.f285c.hasSubMenu()) {
                    return;
                }
                this.f286d.N(this.f285c, 4);
            }
        }

        c() {
            d.this = r1;
        }

        @Override // androidx.appcompat.widget.k0
        public void a(g gVar, MenuItem menuItem) {
            C0008d c0008d = null;
            d.this.f280h.removeCallbacksAndMessages(null);
            int size = d.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.j.get(i).f289b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            if (i2 < d.this.j.size()) {
                c0008d = d.this.j.get(i2);
            }
            d.this.f280h.postAtTime(new a(c0008d, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.k0
        public void i(g gVar, MenuItem menuItem) {
            d.this.f280h.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* loaded from: classes.dex */
    public static class C0008d {

        /* renamed from: a */
        public final l0 f288a;

        /* renamed from: b */
        public final g f289b;

        /* renamed from: c */
        public final int f290c;

        public C0008d(l0 l0Var, g gVar, int i) {
            this.f288a = l0Var;
            this.f289b = gVar;
            this.f290c = i;
        }

        public ListView a() {
            return this.f288a.l();
        }
    }

    public d(Context context, View view, int i, int i2, boolean z) {
        this.f275c = context;
        this.p = view;
        this.f277e = i;
        this.f278f = i2;
        this.f279g = z;
        Resources resources = context.getResources();
        this.f276d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b.a.d.d_res_0x7f070017));
    }

    private l0 C() {
        l0 l0Var = new l0(this.f275c, null, this.f277e, this.f278f);
        l0Var.T(this.m);
        l0Var.L(this);
        l0Var.K(this);
        l0Var.D(this.p);
        l0Var.G(this.o);
        l0Var.J(true);
        l0Var.I(2);
        return l0Var;
    }

    private int D(g gVar) {
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.j.get(i).f289b) {
                return i;
            }
        }
        return -1;
    }

    private MenuItem E(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View F(C0008d c0008d, g gVar) {
        int i;
        f fVar;
        int firstVisiblePosition;
        MenuItem E = E(c0008d.f289b, gVar);
        if (E == null) {
            return null;
        }
        ListView a2 = c0008d.a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (E == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    private int G() {
        return t.y(this.p) == 1 ? 0 : 1;
    }

    private int H(int i) {
        List<C0008d> list = this.j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    private void I(g gVar) {
        View view;
        C0008d c0008d;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f275c);
        f fVar = new f(gVar, from, this.f279g, C);
        if (!b() && this.w) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.A(gVar));
        }
        int r = k.r(fVar, null, this.f275c, this.f276d);
        l0 C2 = C();
        C2.o(fVar);
        C2.F(r);
        C2.G(this.o);
        if (this.j.size() > 0) {
            List<C0008d> list = this.j;
            c0008d = list.get(list.size() - 1);
            view = F(c0008d, gVar);
        } else {
            c0008d = null;
            view = null;
        }
        if (view != null) {
            C2.U(false);
            C2.R(null);
            int H = H(r);
            boolean z = H == 1;
            this.r = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C2.D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) == 5) {
                if (!z) {
                    r = view.getWidth();
                    i3 = i - r;
                }
                i3 = i + r;
            } else {
                if (z) {
                    r = view.getWidth();
                    i3 = i + r;
                }
                i3 = i - r;
            }
            C2.d(i3);
            C2.M(true);
            C2.n(i2);
        } else {
            if (this.s) {
                C2.d(this.u);
            }
            if (this.t) {
                C2.n(this.v);
            }
            C2.H(q());
        }
        this.j.add(new C0008d(C2, gVar, this.r));
        C2.g();
        ListView l = C2.l();
        l.setOnKeyListener(this);
        if (c0008d != null || !this.x || gVar.z() == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) from.inflate(b.a.g.l_res_0x7f0c0012, (ViewGroup) l, false);
        frameLayout.setEnabled(false);
        ((TextView) frameLayout.findViewById(16908310)).setText(gVar.z());
        l.addHeaderView(frameLayout, null, false);
        C2.g();
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        int D = D(gVar);
        if (D < 0) {
            return;
        }
        int i = D + 1;
        if (i < this.j.size()) {
            this.j.get(i).f289b.e(false);
        }
        C0008d remove = this.j.remove(D);
        remove.f289b.Q(this);
        if (this.B) {
            remove.f288a.S(null);
            remove.f288a.E(0);
        }
        remove.f288a.dismiss();
        int size = this.j.size();
        this.r = size > 0 ? this.j.get(size - 1).f290c : G();
        if (size != 0) {
            if (!z) {
                return;
            }
            this.j.get(0).f289b.e(false);
            return;
        }
        dismiss();
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.j.size() > 0 && this.j.get(0).f288a.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            C0008d[] c0008dArr = (C0008d[]) this.j.toArray(new C0008d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0008d c0008d = c0008dArr[i];
                if (c0008d.f288a.b()) {
                    c0008d.f288a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable e() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.p
    public void g() {
        if (b()) {
            return;
        }
        for (g gVar : this.i) {
            I(gVar);
        }
        this.i.clear();
        View view = this.p;
        this.q = view;
        if (view == null) {
            return;
        }
        boolean z = this.z == null;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.z = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        this.q.addOnAttachStateChangeListener(this.l);
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(m.a aVar) {
        this.y = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView l() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<C0008d> list = this.j;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean m(r rVar) {
        for (C0008d c0008d : this.j) {
            if (rVar == c0008d.f289b) {
                c0008d.a().requestFocus();
                return true;
            }
        }
        if (rVar.hasVisibleItems()) {
            o(rVar);
            m.a aVar = this.y;
            if (aVar != null) {
                aVar.b(rVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void n(boolean z) {
        for (C0008d c0008d : this.j) {
            k.B(c0008d.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void o(g gVar) {
        gVar.c(this, this.f275c);
        if (b()) {
            I(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0008d c0008d;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0008d = null;
                break;
            }
            c0008d = this.j.get(i);
            if (!c0008d.f288a.b()) {
                break;
            }
            i++;
        }
        if (c0008d != null) {
            c0008d.f289b.e(false);
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
    protected boolean p() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = b.g.l.e.b(this.n, t.y(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(boolean z) {
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = b.g.l.e.b(i, t.y(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void y(boolean z) {
        this.x = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void z(int i) {
        this.t = true;
        this.v = i;
    }
}
