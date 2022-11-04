package androidx.appcompat.view.menu;

import a.g.l.u;
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
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = a.a.g.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c */
    private final Context f560c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
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
    final List<C0032d> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private final k0 m = new c();
    private int n = 0;
    private int o = 0;
    private boolean w = false;
    private int r = j();
    final Handler h = new Handler();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
            d.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.a() || d.this.j.size() <= 0 || d.this.j.get(0).f566a.l()) {
                return;
            }
            View view = d.this.q;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            for (C0032d c0032d : d.this.j) {
                c0032d.f566a.e();
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
            final /* synthetic */ C0032d f564b;

            /* renamed from: c */
            final /* synthetic */ MenuItem f565c;
            final /* synthetic */ g d;

            a(C0032d c0032d, MenuItem menuItem, g gVar) {
                c.this = r1;
                this.f564b = c0032d;
                this.f565c = menuItem;
                this.d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0032d c0032d = this.f564b;
                if (c0032d != null) {
                    d.this.B = true;
                    c0032d.f567b.a(false);
                    d.this.B = false;
                }
                if (!this.f565c.isEnabled() || !this.f565c.hasSubMenu()) {
                    return;
                }
                this.d.a(this.f565c, 4);
            }
        }

        c() {
            d.this = r1;
        }

        @Override // androidx.appcompat.widget.k0
        public void a(g gVar, MenuItem menuItem) {
            C0032d c0032d = null;
            d.this.h.removeCallbacksAndMessages(null);
            int size = d.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.j.get(i).f567b) {
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
                c0032d = d.this.j.get(i2);
            }
            d.this.h.postAtTime(new a(c0032d, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.k0
        public void b(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* loaded from: classes.dex */
    public static class C0032d {

        /* renamed from: a */
        public final l0 f566a;

        /* renamed from: b */
        public final g f567b;

        /* renamed from: c */
        public final int f568c;

        public C0032d(l0 l0Var, g gVar, int i) {
            this.f566a = l0Var;
            this.f567b = gVar;
            this.f568c = i;
        }

        public ListView a() {
            return this.f566a.d();
        }
    }

    public d(Context context, View view, int i, int i2, boolean z) {
        this.f560c = context;
        this.p = view;
        this.e = i;
        this.f = i2;
        this.g = z;
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.a.d.abc_config_prefDialogWidth));
    }

    private MenuItem a(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(C0032d c0032d, g gVar) {
        int i;
        f fVar;
        int firstVisiblePosition;
        MenuItem a2 = a(c0032d.f567b, gVar);
        if (a2 == null) {
            return null;
        }
        ListView a3 = c0032d.a();
        ListAdapter adapter = a3.getAdapter();
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
            } else if (a2 == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || (firstVisiblePosition = (i2 + i) - a3.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= a3.getChildCount()) {
            return null;
        }
        return a3.getChildAt(firstVisiblePosition);
    }

    private int c(g gVar) {
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.j.get(i).f567b) {
                return i;
            }
        }
        return -1;
    }

    private int d(int i) {
        List<C0032d> list = this.j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    private void d(g gVar) {
        View view;
        C0032d c0032d;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f560c);
        f fVar = new f(gVar, from, this.g, C);
        if (!a() && this.w) {
            fVar.a(true);
        } else if (a()) {
            fVar.a(k.b(gVar));
        }
        int a2 = k.a(fVar, null, this.f560c, this.d);
        l0 i4 = i();
        i4.a((ListAdapter) fVar);
        i4.e(a2);
        i4.f(this.o);
        if (this.j.size() > 0) {
            List<C0032d> list = this.j;
            c0032d = list.get(list.size() - 1);
            view = a(c0032d, gVar);
        } else {
            c0032d = null;
            view = null;
        }
        if (view != null) {
            i4.c(false);
            i4.a((Object) null);
            int d = d(a2);
            boolean z = d == 1;
            this.r = d;
            if (Build.VERSION.SDK_INT >= 26) {
                i4.a(view);
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
                    a2 = view.getWidth();
                    i3 = i - a2;
                }
                i3 = i + a2;
            } else {
                if (z) {
                    a2 = view.getWidth();
                    i3 = i + a2;
                }
                i3 = i - a2;
            }
            i4.a(i3);
            i4.b(true);
            i4.b(i2);
        } else {
            if (this.s) {
                i4.a(this.u);
            }
            if (this.t) {
                i4.b(this.v);
            }
            i4.a(h());
        }
        this.j.add(new C0032d(i4, gVar, this.r));
        i4.e();
        ListView d2 = i4.d();
        d2.setOnKeyListener(this);
        if (c0032d != null || !this.x || gVar.h() == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) from.inflate(a.a.g.abc_popup_menu_header_item_layout, (ViewGroup) d2, false);
        frameLayout.setEnabled(false);
        ((TextView) frameLayout.findViewById(16908310)).setText(gVar.h());
        d2.addHeaderView(frameLayout, null, false);
        i4.e();
    }

    private l0 i() {
        l0 l0Var = new l0(this.f560c, null, this.e, this.f);
        l0Var.a(this.m);
        l0Var.a((AdapterView.OnItemClickListener) this);
        l0Var.a((PopupWindow.OnDismissListener) this);
        l0Var.a(this.p);
        l0Var.f(this.o);
        l0Var.a(true);
        l0Var.g(2);
        return l0Var;
    }

    private int j() {
        return u.o(this.p) == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = a.g.l.c.a(i, u.o(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = a.g.l.c.a(this.n, u.o(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(g gVar) {
        gVar.a(this, this.f560c);
        if (a()) {
            d(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        int c2 = c(gVar);
        if (c2 < 0) {
            return;
        }
        int i = c2 + 1;
        if (i < this.j.size()) {
            this.j.get(i).f567b.a(false);
        }
        C0032d remove = this.j.remove(c2);
        remove.f567b.b(this);
        if (this.B) {
            remove.f566a.b((Object) null);
            remove.f566a.d(0);
        }
        remove.f566a.dismiss();
        int size = this.j.size();
        this.r = size > 0 ? this.j.get(size - 1).f568c : j();
        if (size != 0) {
            if (!z) {
                return;
            }
            this.j.get(0).f567b.a(false);
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

    @Override // androidx.appcompat.view.menu.m
    public void a(m.a aVar) {
        this.y = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(boolean z) {
        for (C0032d c0032d : this.j) {
            k.a(c0032d.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return this.j.size() > 0 && this.j.get(0).f566a.a();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean a(r rVar) {
        for (C0032d c0032d : this.j) {
            if (rVar == c0032d.f567b) {
                c0032d.a().requestFocus();
                return true;
            }
        }
        if (rVar.hasVisibleItems()) {
            a((g) rVar);
            m.a aVar = this.y;
            if (aVar != null) {
                aVar.a(rVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(boolean z) {
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(boolean z) {
        this.x = z;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView d() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<C0032d> list = this.j;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            C0032d[] c0032dArr = (C0032d[]) this.j.toArray(new C0032d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0032d c0032d = c0032dArr[i];
                if (c0032d.f566a.a()) {
                    c0032d.f566a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void e() {
        if (a()) {
            return;
        }
        for (g gVar : this.i) {
            d(gVar);
        }
        this.i.clear();
        View view = this.p;
        this.q = view;
        if (view == null) {
            return;
        }
        boolean z = this.z == null;
        ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
        this.z = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        this.q.addOnAttachStateChangeListener(this.l);
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable f() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean g() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0032d c0032d;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0032d = null;
                break;
            }
            c0032d = this.j.get(i);
            if (!c0032d.f566a.a()) {
                break;
            }
            i++;
        }
        if (c0032d != null) {
            c0032d.f567b.a(false);
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
}
