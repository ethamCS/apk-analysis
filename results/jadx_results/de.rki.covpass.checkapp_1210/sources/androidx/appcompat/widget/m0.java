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
public class m0 implements l.e {

    /* renamed from: v4 */
    private static Method f1398v4;

    /* renamed from: w4 */
    private static Method f1399w4;

    /* renamed from: x4 */
    private static Method f1400x4;
    private int U3;
    private int V3;
    private int W3;
    private boolean X3;
    private boolean Y3;
    private boolean Z3;

    /* renamed from: a4 */
    private int f1401a4;

    /* renamed from: b4 */
    private boolean f1402b4;

    /* renamed from: c */
    private Context f1403c;

    /* renamed from: c4 */
    private boolean f1404c4;

    /* renamed from: d */
    private ListAdapter f1405d;

    /* renamed from: d4 */
    int f1406d4;

    /* renamed from: e4 */
    private View f1407e4;

    /* renamed from: f4 */
    private int f1408f4;

    /* renamed from: g4 */
    private DataSetObserver f1409g4;

    /* renamed from: h4 */
    private View f1410h4;

    /* renamed from: i4 */
    private Drawable f1411i4;

    /* renamed from: j4 */
    private AdapterView.OnItemClickListener f1412j4;

    /* renamed from: k4 */
    private AdapterView.OnItemSelectedListener f1413k4;

    /* renamed from: l4 */
    final g f1414l4;

    /* renamed from: m4 */
    private final f f1415m4;

    /* renamed from: n4 */
    private final e f1416n4;

    /* renamed from: o4 */
    private final c f1417o4;

    /* renamed from: p4 */
    private Runnable f1418p4;

    /* renamed from: q */
    i0 f1419q;

    /* renamed from: q4 */
    final Handler f1420q4;

    /* renamed from: r4 */
    private final Rect f1421r4;

    /* renamed from: s4 */
    private Rect f1422s4;

    /* renamed from: t4 */
    private boolean f1423t4;

    /* renamed from: u4 */
    PopupWindow f1424u4;

    /* renamed from: x */
    private int f1425x;

    /* renamed from: y */
    private int f1426y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            m0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            View t10 = m0.this.t();
            if (t10 == null || t10.getWindowToken() == null) {
                return;
            }
            m0.this.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
            m0.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            i0 i0Var;
            if (i10 == -1 || (i0Var = m0.this.f1419q) == null) {
                return;
            }
            i0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
            m0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.r();
        }
    }

    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        d() {
            m0.this = r1;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (m0.this.c()) {
                m0.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            m0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
            m0.this = r1;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || m0.this.A() || m0.this.f1424u4.getContentView() == null) {
                return;
            }
            m0 m0Var = m0.this;
            m0Var.f1420q4.removeCallbacks(m0Var.f1414l4);
            m0.this.f1414l4.run();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        f() {
            m0.this = r1;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = m0.this.f1424u4) != null && popupWindow.isShowing() && x10 >= 0 && x10 < m0.this.f1424u4.getWidth() && y10 >= 0 && y10 < m0.this.f1424u4.getHeight()) {
                m0 m0Var = m0.this;
                m0Var.f1420q4.postDelayed(m0Var.f1414l4, 250L);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                m0 m0Var2 = m0.this;
                m0Var2.f1420q4.removeCallbacks(m0Var2.f1414l4);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
            m0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            i0 i0Var = m0.this.f1419q;
            if (i0Var == null || !androidx.core.view.y.R(i0Var) || m0.this.f1419q.getCount() <= m0.this.f1419q.getChildCount()) {
                return;
            }
            int childCount = m0.this.f1419q.getChildCount();
            m0 m0Var = m0.this;
            if (childCount > m0Var.f1406d4) {
                return;
            }
            m0Var.f1424u4.setInputMethodMode(2);
            m0.this.a();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1398v4 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1400x4 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1399w4 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public m0(Context context) {
        this(context, null, e.a.E_res_0x7f03027c);
    }

    public m0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public m0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1425x = -2;
        this.f1426y = -2;
        this.W3 = 1002;
        this.f1401a4 = 0;
        this.f1402b4 = false;
        this.f1404c4 = false;
        this.f1406d4 = Integer.MAX_VALUE;
        this.f1408f4 = 0;
        this.f1414l4 = new g();
        this.f1415m4 = new f();
        this.f1416n4 = new e();
        this.f1417o4 = new c();
        this.f1421r4 = new Rect();
        this.f1403c = context;
        this.f1420q4 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f9266l1, i10, i11);
        this.U3 = obtainStyledAttributes.getDimensionPixelOffset(e.j.f9271m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(e.j.f9276n1, 0);
        this.V3 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.X3 = true;
        }
        obtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i10, i11);
        this.f1424u4 = sVar;
        sVar.setInputMethodMode(1);
    }

    private void C() {
        View view = this.f1407e4;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) parent).removeView(this.f1407e4);
        }
    }

    private void N(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f1424u4.setIsClippedToScreen(z10);
            return;
        }
        Method method = f1398v4;
        if (method == null) {
            return;
        }
        try {
            method.invoke(this.f1424u4, Boolean.valueOf(z10));
        } catch (Exception unused) {
            Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int q() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.q():int");
    }

    private int u(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f1399w4;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.f1424u4, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.f1424u4.getMaxAvailableHeight(view, i10);
        }
        return this.f1424u4.getMaxAvailableHeight(view, i10, z10);
    }

    public boolean A() {
        return this.f1424u4.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f1423t4;
    }

    public void D(View view) {
        this.f1410h4 = view;
    }

    public void E(int i10) {
        this.f1424u4.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.f1424u4.getBackground();
        if (background == null) {
            Q(i10);
            return;
        }
        background.getPadding(this.f1421r4);
        Rect rect = this.f1421r4;
        this.f1426y = rect.left + rect.right + i10;
    }

    public void G(int i10) {
        this.f1401a4 = i10;
    }

    public void H(Rect rect) {
        this.f1422s4 = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.f1424u4.setInputMethodMode(i10);
    }

    public void J(boolean z10) {
        this.f1423t4 = z10;
        this.f1424u4.setFocusable(z10);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f1424u4.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1412j4 = onItemClickListener;
    }

    public void M(boolean z10) {
        this.Z3 = true;
        this.Y3 = z10;
    }

    public void O(int i10) {
        this.f1408f4 = i10;
    }

    public void P(int i10) {
        i0 i0Var = this.f1419q;
        if (!c() || i0Var == null) {
            return;
        }
        i0Var.setListSelectionHidden(false);
        i0Var.setSelection(i10);
        if (i0Var.getChoiceMode() == 0) {
            return;
        }
        i0Var.setItemChecked(i10, true);
    }

    public void Q(int i10) {
        this.f1426y = i10;
    }

    @Override // l.e
    public void a() {
        int q10 = q();
        boolean A = A();
        androidx.core.widget.i.b(this.f1424u4, this.W3);
        boolean z10 = true;
        if (this.f1424u4.isShowing()) {
            if (!androidx.core.view.y.R(t())) {
                return;
            }
            int i10 = this.f1426y;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = t().getWidth();
            }
            int i11 = this.f1425x;
            if (i11 == -1) {
                if (!A) {
                    q10 = -1;
                }
                if (A) {
                    this.f1424u4.setWidth(this.f1426y == -1 ? -1 : 0);
                    this.f1424u4.setHeight(0);
                } else {
                    this.f1424u4.setWidth(this.f1426y == -1 ? -1 : 0);
                    this.f1424u4.setHeight(-1);
                }
            } else if (i11 != -2) {
                q10 = i11;
            }
            PopupWindow popupWindow = this.f1424u4;
            if (this.f1404c4 || this.f1402b4) {
                z10 = false;
            }
            popupWindow.setOutsideTouchable(z10);
            this.f1424u4.update(t(), this.U3, this.V3, i10 < 0 ? -1 : i10, q10 < 0 ? -1 : q10);
            return;
        }
        int i12 = this.f1426y;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = t().getWidth();
        }
        int i13 = this.f1425x;
        if (i13 == -1) {
            q10 = -1;
        } else if (i13 != -2) {
            q10 = i13;
        }
        this.f1424u4.setWidth(i12);
        this.f1424u4.setHeight(q10);
        N(true);
        this.f1424u4.setOutsideTouchable(!this.f1404c4 && !this.f1402b4);
        this.f1424u4.setTouchInterceptor(this.f1415m4);
        if (this.Z3) {
            androidx.core.widget.i.a(this.f1424u4, this.Y3);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1400x4;
            if (method != null) {
                try {
                    method.invoke(this.f1424u4, this.f1422s4);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            this.f1424u4.setEpicenterBounds(this.f1422s4);
        }
        androidx.core.widget.i.c(this.f1424u4, t(), this.U3, this.V3, this.f1401a4);
        this.f1419q.setSelection(-1);
        if (!this.f1423t4 || this.f1419q.isInTouchMode()) {
            r();
        }
        if (this.f1423t4) {
            return;
        }
        this.f1420q4.post(this.f1417o4);
    }

    public void b(Drawable drawable) {
        this.f1424u4.setBackgroundDrawable(drawable);
    }

    @Override // l.e
    public boolean c() {
        return this.f1424u4.isShowing();
    }

    public int d() {
        return this.U3;
    }

    @Override // l.e
    public void dismiss() {
        this.f1424u4.dismiss();
        C();
        this.f1424u4.setContentView(null);
        this.f1419q = null;
        this.f1420q4.removeCallbacks(this.f1414l4);
    }

    public Drawable g() {
        return this.f1424u4.getBackground();
    }

    @Override // l.e
    public ListView h() {
        return this.f1419q;
    }

    public void j(int i10) {
        this.V3 = i10;
        this.X3 = true;
    }

    public void l(int i10) {
        this.U3 = i10;
    }

    public int n() {
        if (!this.X3) {
            return 0;
        }
        return this.V3;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1409g4;
        if (dataSetObserver == null) {
            this.f1409g4 = new d();
        } else {
            ListAdapter listAdapter2 = this.f1405d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1405d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1409g4);
        }
        i0 i0Var = this.f1419q;
        if (i0Var != null) {
            i0Var.setAdapter(this.f1405d);
        }
    }

    public void r() {
        i0 i0Var = this.f1419q;
        if (i0Var != null) {
            i0Var.setListSelectionHidden(true);
            i0Var.requestLayout();
        }
    }

    i0 s(Context context, boolean z10) {
        return new i0(context, z10);
    }

    public View t() {
        return this.f1410h4;
    }

    public Object v() {
        if (!c()) {
            return null;
        }
        return this.f1419q.getSelectedItem();
    }

    public long w() {
        if (!c()) {
            return Long.MIN_VALUE;
        }
        return this.f1419q.getSelectedItemId();
    }

    public int x() {
        if (!c()) {
            return -1;
        }
        return this.f1419q.getSelectedItemPosition();
    }

    public View y() {
        if (!c()) {
            return null;
        }
        return this.f1419q.getSelectedView();
    }

    public int z() {
        return this.f1426y;
    }
}
