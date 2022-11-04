package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
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
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.o0;
import androidx.core.view.y;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: q4 */
    private static final int f891q4 = e.g.e_res_0x7f0c000b;
    private final boolean U3;

    /* renamed from: d */
    private final Context f895d;

    /* renamed from: d4 */
    private View f896d4;

    /* renamed from: e4 */
    View f897e4;

    /* renamed from: g4 */
    private boolean f899g4;

    /* renamed from: h4 */
    private boolean f900h4;

    /* renamed from: i4 */
    private int f901i4;

    /* renamed from: j4 */
    private int f902j4;

    /* renamed from: l4 */
    private boolean f904l4;

    /* renamed from: m4 */
    private j.a f905m4;

    /* renamed from: n4 */
    ViewTreeObserver f906n4;

    /* renamed from: o4 */
    private PopupWindow.OnDismissListener f907o4;

    /* renamed from: p4 */
    boolean f908p4;

    /* renamed from: q */
    private final int f909q;

    /* renamed from: x */
    private final int f910x;

    /* renamed from: y */
    private final int f911y;
    private final List<e> W3 = new ArrayList();
    final List<d> X3 = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener Y3 = new a();
    private final View.OnAttachStateChangeListener Z3 = new View$OnAttachStateChangeListenerC0015b();

    /* renamed from: a4 */
    private final n0 f892a4 = new c();

    /* renamed from: b4 */
    private int f893b4 = 0;

    /* renamed from: c4 */
    private int f894c4 = 0;

    /* renamed from: k4 */
    private boolean f903k4 = false;

    /* renamed from: f4 */
    private int f898f4 = D();
    final Handler V3 = new Handler();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
            b.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.c() || b.this.X3.size() <= 0 || b.this.X3.get(0).f919a.B()) {
                return;
            }
            View view = b.this.f897e4;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            for (d dVar : b.this.X3) {
                dVar.f919a.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0015b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0015b() {
            b.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f906n4;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f906n4 = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f906n4.removeGlobalOnLayoutListener(bVar.Y3);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements n0 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ d f915c;

            /* renamed from: d */
            final /* synthetic */ MenuItem f916d;

            /* renamed from: q */
            final /* synthetic */ e f917q;

            a(d dVar, MenuItem menuItem, e eVar) {
                c.this = r1;
                this.f915c = dVar;
                this.f916d = menuItem;
                this.f917q = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f915c;
                if (dVar != null) {
                    b.this.f908p4 = true;
                    dVar.f920b.e(false);
                    b.this.f908p4 = false;
                }
                if (!this.f916d.isEnabled() || !this.f916d.hasSubMenu()) {
                    return;
                }
                this.f917q.L(this.f916d, 4);
            }
        }

        c() {
            b.this = r1;
        }

        @Override // androidx.appcompat.widget.n0
        public void e(e eVar, MenuItem menuItem) {
            d dVar = null;
            b.this.V3.removeCallbacksAndMessages(null);
            int size = b.this.X3.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.X3.get(i10).f920b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            if (i11 < b.this.X3.size()) {
                dVar = b.this.X3.get(i11);
            }
            b.this.V3.postAtTime(new a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.n0
        public void f(e eVar, MenuItem menuItem) {
            b.this.V3.removeCallbacksAndMessages(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final o0 f919a;

        /* renamed from: b */
        public final e f920b;

        /* renamed from: c */
        public final int f921c;

        public d(o0 o0Var, e eVar, int i10) {
            this.f919a = o0Var;
            this.f920b = eVar;
            this.f921c = i10;
        }

        public ListView a() {
            return this.f919a.h();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f895d = context;
        this.f896d4 = view;
        this.f910x = i10;
        this.f911y = i11;
        this.U3 = z10;
        Resources resources = context.getResources();
        this.f909q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.d.d_res_0x7f060017));
    }

    private int A(e eVar) {
        int size = this.X3.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.X3.get(i10).f920b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        int i10;
        androidx.appcompat.view.menu.d dVar2;
        int firstVisiblePosition;
        MenuItem B = B(dVar.f920b, eVar);
        if (B == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (B == dVar2.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1 || (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= a10.getChildCount()) {
            return null;
        }
        return a10.getChildAt(firstVisiblePosition);
    }

    private int D() {
        return y.B(this.f896d4) == 1 ? 0 : 1;
    }

    private int E(int i10) {
        List<d> list = this.X3;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f897e4.getWindowVisibleDisplayFrame(rect);
        return this.f898f4 == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        View view;
        d dVar;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f895d);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.U3, f891q4);
        if (!c() && this.f903k4) {
            dVar2.d(true);
        } else if (c()) {
            dVar2.d(h.x(eVar));
        }
        int o10 = h.o(dVar2, null, this.f895d, this.f909q);
        o0 z10 = z();
        z10.p(dVar2);
        z10.F(o10);
        z10.G(this.f894c4);
        if (this.X3.size() > 0) {
            List<d> list = this.X3;
            dVar = list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z10.U(false);
            z10.R(null);
            int E = E(o10);
            boolean z11 = E == 1;
            this.f898f4 = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z10.D(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f896d4.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f894c4 & 7) == 5) {
                    iArr[0] = iArr[0] + this.f896d4.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f894c4 & 5) == 5) {
                if (!z11) {
                    o10 = view.getWidth();
                    i12 = i10 - o10;
                }
                i12 = i10 + o10;
            } else {
                if (z11) {
                    o10 = view.getWidth();
                    i12 = i10 + o10;
                }
                i12 = i10 - o10;
            }
            z10.l(i12);
            z10.M(true);
            z10.j(i11);
        } else {
            if (this.f899g4) {
                z10.l(this.f901i4);
            }
            if (this.f900h4) {
                z10.j(this.f902j4);
            }
            z10.H(n());
        }
        this.X3.add(new d(z10, eVar, this.f898f4));
        z10.a();
        ListView h10 = z10.h();
        h10.setOnKeyListener(this);
        if (dVar != null || !this.f904l4 || eVar.x() == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) from.inflate(e.g.l_res_0x7f0c0012, (ViewGroup) h10, false);
        frameLayout.setEnabled(false);
        ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
        h10.addHeaderView(frameLayout, null, false);
        z10.a();
    }

    private o0 z() {
        o0 o0Var = new o0(this.f895d, null, this.f910x, this.f911y);
        o0Var.T(this.f892a4);
        o0Var.L(this);
        o0Var.K(this);
        o0Var.D(this.f896d4);
        o0Var.G(this.f894c4);
        o0Var.J(true);
        o0Var.I(2);
        return o0Var;
    }

    @Override // l.e
    public void a() {
        if (c()) {
            return;
        }
        for (e eVar : this.W3) {
            F(eVar);
        }
        this.W3.clear();
        View view = this.f896d4;
        this.f897e4 = view;
        if (view == null) {
            return;
        }
        boolean z10 = this.f906n4 == null;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.f906n4 = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.Y3);
        }
        this.f897e4.addOnAttachStateChangeListener(this.Z3);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        int A = A(eVar);
        if (A < 0) {
            return;
        }
        int i10 = A + 1;
        if (i10 < this.X3.size()) {
            this.X3.get(i10).f920b.e(false);
        }
        d remove = this.X3.remove(A);
        remove.f920b.O(this);
        if (this.f908p4) {
            remove.f919a.S(null);
            remove.f919a.E(0);
        }
        remove.f919a.dismiss();
        int size = this.X3.size();
        this.f898f4 = size > 0 ? this.X3.get(size - 1).f921c : D();
        if (size != 0) {
            if (!z10) {
                return;
            }
            this.X3.get(0).f920b.e(false);
            return;
        }
        dismiss();
        j.a aVar = this.f905m4;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f906n4;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f906n4.removeGlobalOnLayoutListener(this.Y3);
            }
            this.f906n4 = null;
        }
        this.f897e4.removeOnAttachStateChangeListener(this.Z3);
        this.f907o4.onDismiss();
    }

    @Override // l.e
    public boolean c() {
        return this.X3.size() > 0 && this.X3.get(0).f919a.c();
    }

    @Override // l.e
    public void dismiss() {
        int size = this.X3.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.X3.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f919a.c()) {
                    dVar.f919a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        for (d dVar : this.X3) {
            if (mVar == dVar.f920b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            l(mVar);
            j.a aVar = this.f905m4;
            if (aVar != null) {
                aVar.c(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        for (d dVar : this.X3) {
            h.y(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // l.e
    public ListView h() {
        if (this.X3.isEmpty()) {
            return null;
        }
        List<d> list = this.X3;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.f905m4 = aVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f895d);
        if (c()) {
            F(eVar);
        } else {
            this.W3.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.X3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.X3.get(i10);
            if (!dVar.f919a.c()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f920b.e(false);
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
        if (this.f896d4 != view) {
            this.f896d4 = view;
            this.f894c4 = androidx.core.view.e.b(this.f893b4, y.B(view));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z10) {
        this.f903k4 = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        if (this.f893b4 != i10) {
            this.f893b4 = i10;
            this.f894c4 = androidx.core.view.e.b(i10, y.B(this.f896d4));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f899g4 = true;
        this.f901i4 = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f907o4 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z10) {
        this.f904l4 = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f900h4 = true;
        this.f902j4 = i10;
    }
}
