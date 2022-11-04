package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class j0 implements androidx.appcompat.view.menu.p {
    private static Method G;
    private static Method H;
    private static Method I;
    private final b A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* renamed from: b */
    private Context f546b;

    /* renamed from: c */
    private ListAdapter f547c;

    /* renamed from: d */
    f0 f548d;

    /* renamed from: e */
    private int f549e;

    /* renamed from: f */
    private int f550f;

    /* renamed from: g */
    private int f551g;

    /* renamed from: h */
    private int f552h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    int p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    final f x;
    private final e y;
    private final d z;

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        a() {
            j0.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            f0 f0Var;
            if (i == -1 || (f0Var = j0.this.f548d) == null) {
                return;
            }
            f0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            j0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.r();
        }
    }

    /* loaded from: classes.dex */
    public class c extends DataSetObserver {
        c() {
            j0.this = r1;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (j0.this.b()) {
                j0.this.g();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {
        d() {
            j0.this = r1;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || j0.this.A() || j0.this.F.getContentView() == null) {
                return;
            }
            j0 j0Var = j0.this;
            j0Var.B.removeCallbacks(j0Var.x);
            j0.this.x.run();
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnTouchListener {
        e() {
            j0.this = r1;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.F) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.F.getWidth() && y >= 0 && y < j0.this.F.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.B.postDelayed(j0Var.x, 250L);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                j0 j0Var2 = j0.this;
                j0Var2.B.removeCallbacks(j0Var2.x);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
            j0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = j0.this.f548d;
            if (f0Var == null || !b.g.l.t.N(f0Var) || j0.this.f548d.getCount() <= j0.this.f548d.getChildCount()) {
                return;
            }
            int childCount = j0.this.f548d.getChildCount();
            j0 j0Var = j0.this;
            if (childCount > j0Var.p) {
                return;
            }
            j0Var.F.setInputMethodMode(2);
            j0.this.g();
        }
    }

    static {
        Class cls = Boolean.TYPE;
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (i <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context) {
        this(context, null, b.a.a.F);
    }

    public j0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f549e = -2;
        this.f550f = -2;
        this.i = 1002;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.r = 0;
        this.x = new f();
        this.y = new e();
        this.z = new d();
        this.A = new b();
        this.C = new Rect();
        this.f546b = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.j.m1, i, i2);
        this.f551g = obtainStyledAttributes.getDimensionPixelOffset(b.a.j.n1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(b.a.j.o1, 0);
        this.f552h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i, i2);
        this.F = qVar;
        qVar.setInputMethodMode(1);
    }

    private void C() {
        View view = this.q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) parent).removeView(this.q);
        }
    }

    private void N(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            this.F.setIsClippedToScreen(z);
            return;
        }
        Method method = G;
        if (method == null) {
            return;
        }
        try {
            method.invoke(this.F, Boolean.valueOf(z));
        } catch (Exception unused) {
            Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int q() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.q():int");
    }

    private int u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = H;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.F, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.F.getMaxAvailableHeight(view, i);
        }
        return this.F.getMaxAvailableHeight(view, i, z);
    }

    public boolean A() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.E;
    }

    public void D(View view) {
        this.t = view;
    }

    public void E(int i) {
        this.F.setAnimationStyle(i);
    }

    public void F(int i) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            Q(i);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f550f = rect.left + rect.right + i;
    }

    public void G(int i) {
        this.m = i;
    }

    public void H(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void I(int i) {
        this.F.setInputMethodMode(i);
    }

    public void J(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void M(boolean z) {
        this.l = true;
        this.k = z;
    }

    public void O(int i) {
        this.r = i;
    }

    public void P(int i) {
        f0 f0Var = this.f548d;
        if (!b() || f0Var == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
        f0Var.setSelection(i);
        if (f0Var.getChoiceMode() == 0) {
            return;
        }
        f0Var.setItemChecked(i, true);
    }

    public void Q(int i) {
        this.f550f = i;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.F.isShowing();
    }

    public void c(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void d(int i) {
        this.f551g = i;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.F.dismiss();
        C();
        this.F.setContentView(null);
        this.f548d = null;
        this.B.removeCallbacks(this.x);
    }

    public int e() {
        return this.f551g;
    }

    @Override // androidx.appcompat.view.menu.p
    public void g() {
        int q = q();
        boolean A = A();
        androidx.core.widget.h.b(this.F, this.i);
        boolean z = true;
        if (this.F.isShowing()) {
            if (!b.g.l.t.N(t())) {
                return;
            }
            int i = this.f550f;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = t().getWidth();
            }
            int i2 = this.f549e;
            if (i2 == -1) {
                if (!A) {
                    q = -1;
                }
                if (A) {
                    this.F.setWidth(this.f550f == -1 ? -1 : 0);
                    this.F.setHeight(0);
                } else {
                    this.F.setWidth(this.f550f == -1 ? -1 : 0);
                    this.F.setHeight(-1);
                }
            } else if (i2 != -2) {
                q = i2;
            }
            PopupWindow popupWindow = this.F;
            if (this.o || this.n) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.F.update(t(), this.f551g, this.f552h, i < 0 ? -1 : i, q < 0 ? -1 : q);
            return;
        }
        int i3 = this.f550f;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = t().getWidth();
        }
        int i4 = this.f549e;
        if (i4 == -1) {
            q = -1;
        } else if (i4 != -2) {
            q = i4;
        }
        this.F.setWidth(i3);
        this.F.setHeight(q);
        N(true);
        this.F.setOutsideTouchable(!this.o && !this.n);
        this.F.setTouchInterceptor(this.y);
        if (this.l) {
            androidx.core.widget.h.a(this.F, this.k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.F.setEpicenterBounds(this.D);
        }
        androidx.core.widget.h.c(this.F, t(), this.f551g, this.f552h, this.m);
        this.f548d.setSelection(-1);
        if (!this.E || this.f548d.isInTouchMode()) {
            r();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.A);
    }

    public int h() {
        if (!this.j) {
            return 0;
        }
        return this.f552h;
    }

    public Drawable j() {
        return this.F.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView l() {
        return this.f548d;
    }

    public void n(int i) {
        this.f552h = i;
        this.j = true;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new c();
        } else {
            ListAdapter listAdapter2 = this.f547c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f547c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        f0 f0Var = this.f548d;
        if (f0Var != null) {
            f0Var.setAdapter(this.f547c);
        }
    }

    public void r() {
        f0 f0Var = this.f548d;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    f0 s(Context context, boolean z) {
        return new f0(context, z);
    }

    public View t() {
        return this.t;
    }

    public Object v() {
        if (!b()) {
            return null;
        }
        return this.f548d.getSelectedItem();
    }

    public long w() {
        if (!b()) {
            return Long.MIN_VALUE;
        }
        return this.f548d.getSelectedItemId();
    }

    public int x() {
        if (!b()) {
            return -1;
        }
        return this.f548d.getSelectedItemPosition();
    }

    public View y() {
        if (!b()) {
            return null;
        }
        return this.f548d.getSelectedView();
    }

    public int z() {
        return this.f550f;
    }
}
