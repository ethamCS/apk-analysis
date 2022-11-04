package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import b.g.l.b0;
import b.g.l.c0.c;
import b.g.l.c0.f;
import b.g.l.t;
import b.i.b.d;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements b.i.b.c {
    private static final int[] M = {16843828};
    static final int[] N = {16842931};
    static final boolean O;
    private static final boolean P;
    private static boolean Q;
    private CharSequence A;
    private CharSequence B;
    private Object C;
    private boolean D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private final ArrayList<View> I;
    private Rect J;
    private Matrix K;
    private final b.g.l.c0.f L;

    /* renamed from: b */
    private final d f988b;

    /* renamed from: c */
    private float f989c;

    /* renamed from: d */
    private int f990d;

    /* renamed from: e */
    private int f991e;

    /* renamed from: f */
    private float f992f;

    /* renamed from: g */
    private Paint f993g;

    /* renamed from: h */
    private final b.i.b.d f994h;
    private final b.i.b.d i;
    private final h j;
    private final h k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private e t;
    private List<e> u;
    private float v;
    private float w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.g.l.c0.f {
        a() {
            DrawerLayout.this = r1;
        }

        @Override // b.g.l.c0.f
        public boolean a(View view, f.a aVar) {
            if (!DrawerLayout.this.D(view) || DrawerLayout.this.s(view) == 2) {
                return false;
            }
            DrawerLayout.this.g(view);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnApplyWindowInsetsListener {
        b(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).R(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends b.g.l.a {

        /* renamed from: d */
        private final Rect f996d = new Rect();

        c() {
            DrawerLayout.this = r1;
        }

        private void n(b.g.l.c0.c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.B(childAt)) {
                    cVar.c(childAt);
                }
            }
        }

        private void o(b.g.l.c0.c cVar, b.g.l.c0.c cVar2) {
            Rect rect = this.f996d;
            cVar2.n(rect);
            cVar.Y(rect);
            cVar.y0(cVar2.N());
            cVar.n0(cVar2.v());
            cVar.b0(cVar2.p());
            cVar.f0(cVar2.s());
            cVar.g0(cVar2.F());
            cVar.j0(cVar2.H());
            cVar.V(cVar2.B());
            cVar.t0(cVar2.L());
            cVar.a(cVar2.k());
        }

        @Override // b.g.l.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View q = DrawerLayout.this.q();
                if (q == null) {
                    return true;
                }
                CharSequence t = DrawerLayout.this.t(DrawerLayout.this.u(q));
                if (t == null) {
                    return true;
                }
                text.add(t);
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // b.g.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            if (DrawerLayout.O) {
                super.g(view, cVar);
            } else {
                b.g.l.c0.c Q = b.g.l.c0.c.Q(cVar);
                super.g(view, Q);
                cVar.v0(view);
                ViewParent E = t.E(view);
                if (E instanceof View) {
                    cVar.p0((View) E);
                }
                o(cVar, Q);
                Q.S();
                n(cVar, (ViewGroup) view);
            }
            cVar.b0("androidx.drawerlayout.widget.DrawerLayout");
            cVar.i0(false);
            cVar.j0(false);
            cVar.T(c.a.f2527e);
            cVar.T(c.a.f2528f);
        }

        @Override // b.g.l.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.O || DrawerLayout.B(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends b.g.l.a {
        d() {
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            super.g(view, cVar);
            if (!DrawerLayout.B(view)) {
                cVar.p0(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(int i);

        void b(View view);

        void c(View view, float f2);

        void d(View view);
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f998a;

        /* renamed from: b */
        float f999b;

        /* renamed from: c */
        boolean f1000c;

        /* renamed from: d */
        int f1001d;

        public f(int i, int i2) {
            super(i, i2);
            this.f998a = 0;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f998a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.N);
            this.f998a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f998a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f998a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f998a = 0;
            this.f998a = fVar.f998a;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends b.i.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d */
        int f1002d;

        /* renamed from: e */
        int f1003e;

        /* renamed from: f */
        int f1004f;

        /* renamed from: g */
        int f1005g;

        /* renamed from: h */
        int f1006h;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1002d = 0;
            this.f1002d = parcel.readInt();
            this.f1003e = parcel.readInt();
            this.f1004f = parcel.readInt();
            this.f1005g = parcel.readInt();
            this.f1006h = parcel.readInt();
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.f1002d = 0;
        }

        @Override // b.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1002d);
            parcel.writeInt(this.f1003e);
            parcel.writeInt(this.f1004f);
            parcel.writeInt(this.f1005g);
            parcel.writeInt(this.f1006h);
        }
    }

    /* loaded from: classes.dex */
    public class h extends d.c {

        /* renamed from: a */
        private final int f1007a;

        /* renamed from: b */
        private b.i.b.d f1008b;

        /* renamed from: c */
        private final Runnable f1009c = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            a() {
                h.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        h(int i) {
            DrawerLayout.this = r1;
            this.f1007a = i;
        }

        private void n() {
            int i = 3;
            if (this.f1007a == 3) {
                i = 5;
            }
            View o = DrawerLayout.this.o(i);
            if (o != null) {
                DrawerLayout.this.g(o);
            }
        }

        @Override // b.i.b.d.c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.d(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        @Override // b.i.b.d.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // b.i.b.d.c
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // b.i.b.d.c
        public void f(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View o = drawerLayout.o(i3);
            if (o == null || DrawerLayout.this.s(o) != 0) {
                return;
            }
            this.f1008b.b(o, i2);
        }

        @Override // b.i.b.d.c
        public boolean g(int i) {
            return false;
        }

        @Override // b.i.b.d.c
        public void h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1009c, 160L);
        }

        @Override // b.i.b.d.c
        public void i(View view, int i) {
            ((f) view.getLayoutParams()).f1000c = false;
            n();
        }

        @Override // b.i.b.d.c
        public void j(int i) {
            DrawerLayout.this.W(i, this.f1008b.v());
        }

        @Override // b.i.b.d.c
        public void k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.d(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.T(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // b.i.b.d.c
        public void l(View view, float f2, float f3) {
            int i;
            float v = DrawerLayout.this.v(view);
            int width = view.getWidth();
            if (DrawerLayout.this.d(view, 3)) {
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && v > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && v > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1008b.O(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // b.i.b.d.c
        public boolean m(View view, int i) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.d(view, this.f1007a) && DrawerLayout.this.s(view) == 0;
        }

        void o() {
            View view;
            int i;
            int x = this.f1008b.x();
            int i2 = 0;
            boolean z = this.f1007a == 3;
            if (z) {
                view = DrawerLayout.this.o(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + x;
            } else {
                view = DrawerLayout.this.o(5);
                i = DrawerLayout.this.getWidth() - x;
            }
            if (view != null) {
                if (((!z || view.getLeft() >= i) && (z || view.getLeft() <= i)) || DrawerLayout.this.s(view) != 0) {
                    return;
                }
                this.f1008b.Q(view, i, view.getTop());
                ((f) view.getLayoutParams()).f1000c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.c();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f1009c);
        }

        public void q(b.i.b.d dVar) {
            this.f1008b = dVar;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        O = i >= 19;
        P = i >= 21;
        if (i < 29) {
            z = false;
        }
        Q = z;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.j.a.a_res_0x7f040127);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f988b = new d();
        this.f991e = -1728053248;
        this.f993g = new Paint();
        this.n = true;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.r = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.L = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f990d = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        h hVar = new h(3);
        this.j = hVar;
        h hVar2 = new h(5);
        this.k = hVar2;
        b.i.b.d n = b.i.b.d.n(this, 1.0f, hVar);
        this.f994h = n;
        n.M(1);
        n.N(f3);
        hVar.q(n);
        b.i.b.d n2 = b.i.b.d.n(this, 1.0f, hVar2);
        this.i = n2;
        n2.M(2);
        n2.N(f3);
        hVar2.q(n2);
        setFocusableInTouchMode(true);
        t.r0(this, 1);
        t.i0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (t.v(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new b(this));
                setSystemUiVisibility(1280);
                try {
                    this.x = context.obtainStyledAttributes(M).getDrawable(0);
                } finally {
                }
            } else {
                this.x = null;
            }
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.c.f2625a, i, 0);
        try {
            int i2 = b.j.c.f2626b;
            this.f989c = obtainStyledAttributes.hasValue(i2) ? obtainStyledAttributes.getDimension(i2, 0.0f) : getResources().getDimension(b.j.b.a_res_0x7f07005f);
            obtainStyledAttributes.recycle();
            this.I = new ArrayList<>();
        } finally {
        }
    }

    private boolean A() {
        return q() != null;
    }

    static boolean B(View view) {
        return (t.w(view) == 4 || t.w(view) == 2) ? false : true;
    }

    private boolean G(float f2, float f3, View view) {
        if (this.J == null) {
            this.J = new Rect();
        }
        view.getHitRect(this.J);
        return this.J.contains((int) f2, (int) f3);
    }

    private void H(Drawable drawable, int i) {
        if (drawable == null || !androidx.core.graphics.drawable.a.h(drawable)) {
            return;
        }
        androidx.core.graphics.drawable.a.m(drawable, i);
    }

    private Drawable O() {
        int y = t.y(this);
        if (y == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                H(drawable, y);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                H(drawable2, y);
                return this.F;
            }
        }
        return this.G;
    }

    private Drawable P() {
        int y = t.y(this);
        if (y == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                H(drawable, y);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                H(drawable2, y);
                return this.E;
            }
        }
        return this.H;
    }

    private void Q() {
        if (P) {
            return;
        }
        this.y = O();
        this.z = P();
    }

    private void U(View view) {
        c.a aVar = c.a.l;
        t.c0(view, aVar.b());
        if (!D(view) || s(view) == 2) {
            return;
        }
        t.e0(view, aVar, null, this.L);
    }

    private void V(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            t.r0(childAt, ((z || E(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    private boolean n(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent w = w(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(w);
            w.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent w(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.K == null) {
                this.K = new Matrix();
            }
            matrix.invert(this.K);
            obtain.transform(this.K);
        }
        return obtain;
    }

    static String x(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private static boolean y(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean z() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((f) getChildAt(i).getLayoutParams()).f1000c) {
                return true;
            }
        }
        return false;
    }

    boolean C(View view) {
        return ((f) view.getLayoutParams()).f998a == 0;
    }

    public boolean D(View view) {
        if (E(view)) {
            return (((f) view.getLayoutParams()).f1001d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean E(View view) {
        int b2 = b.g.l.e.b(((f) view.getLayoutParams()).f998a, t.y(view));
        return ((b2 & 3) == 0 && (b2 & 5) == 0) ? false : true;
    }

    public boolean F(View view) {
        if (E(view)) {
            return ((f) view.getLayoutParams()).f999b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void I(View view, float f2) {
        float v = v(view);
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (v * width));
        if (!d(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        T(view, f2);
    }

    public void J(int i) {
        K(i, true);
    }

    public void K(int i, boolean z) {
        View o = o(i);
        if (o != null) {
            M(o, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + x(i));
    }

    public void L(View view) {
        M(view, true);
    }

    public void M(View view, boolean z) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.n) {
            fVar.f999b = 1.0f;
            fVar.f1001d = 1;
            V(view, true);
            U(view);
        } else if (z) {
            fVar.f1001d |= 2;
            if (d(view, 3)) {
                this.f994h.Q(view, 0, view.getTop());
            } else {
                this.i.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            I(view, 1.0f);
            W(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void N(e eVar) {
        List<e> list;
        if (eVar == null || (list = this.u) == null) {
            return;
        }
        list.remove(eVar);
    }

    public void R(Object obj, boolean z) {
        this.C = obj;
        this.D = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void S(int i, int i2) {
        View o;
        int b2 = b.g.l.e.b(i2, t.y(this));
        if (i2 == 3) {
            this.o = i;
        } else if (i2 == 5) {
            this.p = i;
        } else if (i2 == 8388611) {
            this.q = i;
        } else if (i2 == 8388613) {
            this.r = i;
        }
        if (i != 0) {
            (b2 == 3 ? this.f994h : this.i).a();
        }
        if (i != 1) {
            if (i != 2 || (o = o(b2)) == null) {
                return;
            }
            L(o);
            return;
        }
        View o2 = o(b2);
        if (o2 == null) {
            return;
        }
        g(o2);
    }

    void T(View view, float f2) {
        f fVar = (f) view.getLayoutParams();
        if (f2 == fVar.f999b) {
            return;
        }
        fVar.f999b = f2;
        m(view, f2);
    }

    void W(int i, View view) {
        int A = this.f994h.A();
        int A2 = this.i.A();
        int i2 = 2;
        if (A == 1 || A2 == 1) {
            i2 = 1;
        } else if (A != 2 && A2 != 2) {
            i2 = 0;
        }
        if (view != null && i == 0) {
            float f2 = ((f) view.getLayoutParams()).f999b;
            if (f2 == 0.0f) {
                k(view);
            } else if (f2 == 1.0f) {
                l(view);
            }
        }
        if (i2 != this.l) {
            this.l = i2;
            List<e> list = this.u;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).a(i2);
            }
        }
    }

    @Override // b.i.b.c
    public void a() {
        J(8388611);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!E(childAt)) {
                this.I.add(childAt);
            } else if (D(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.I.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.I.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        t.r0(view, (p() != null || E(view)) ? 4 : 1);
        if (!O) {
            t.i0(view, this.f988b);
        }
    }

    public void b(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(eVar);
    }

    void c() {
        if (!this.s) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.s = true;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // b.i.b.c
    public void close() {
        e(8388611);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((f) getChildAt(i).getLayoutParams()).f999b);
        }
        this.f992f = f2;
        boolean m = this.f994h.m(true);
        boolean m2 = this.i.m(true);
        if (m || m2) {
            t.Z(this);
        }
    }

    boolean d(View view, int i) {
        return (u(view) & i) == i;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f992f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (G(x, y, childAt) && !C(childAt) && n(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        int height = getHeight();
        boolean C = C(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (C) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && y(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (d(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.f992f;
        if (f2 <= 0.0f || !C) {
            if (this.y != null && d(view, 3)) {
                int intrinsicWidth = this.y.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(right2 / this.f994h.x(), 1.0f));
                this.y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.y.setAlpha((int) (max * 255.0f));
                drawable = this.y;
            } else if (this.z != null && d(view, 5)) {
                int intrinsicWidth2 = this.z.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.i.x(), 1.0f));
                this.z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.z.setAlpha((int) (max2 * 255.0f));
                drawable = this.z;
            }
            drawable.draw(canvas);
        } else {
            int i4 = this.f991e;
            this.f993g.setColor((i4 & 16777215) | (((int) ((((-16777216) & i4) >>> 24) * f2)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f993g);
        }
        return drawChild;
    }

    public void e(int i) {
        f(i, true);
    }

    public void f(int i, boolean z) {
        View o = o(i);
        if (o != null) {
            h(o, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + x(i));
    }

    public void g(View view) {
        h(view, true);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (P) {
            return this.f989c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.x;
    }

    public void h(View view, boolean z) {
        b.i.b.d dVar;
        int i;
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.n) {
            fVar.f999b = 0.0f;
            fVar.f1001d = 0;
        } else if (z) {
            fVar.f1001d |= 4;
            if (d(view, 3)) {
                dVar = this.f994h;
                i = -view.getWidth();
            } else {
                dVar = this.i;
                i = getWidth();
            }
            dVar.Q(view, i, view.getTop());
        } else {
            I(view, 0.0f);
            W(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void i() {
        j(false);
    }

    void j(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z || fVar.f1000c)) {
                z2 |= d(childAt, 3) ? this.f994h.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.i.Q(childAt, getWidth(), childAt.getTop());
                fVar.f1000c = false;
            }
        }
        this.j.p();
        this.k.p();
        if (z2) {
            invalidate();
        }
    }

    void k(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f1001d & 1) == 1) {
            fVar.f1001d = 0;
            List<e> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).d(view);
                }
            }
            V(view, false);
            U(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void l(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f1001d & 1) == 0) {
            fVar.f1001d = 1;
            List<e> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).b(view);
                }
            }
            V(view, true);
            U(view);
            if (!hasWindowFocus()) {
                return;
            }
            sendAccessibilityEvent(32);
        }
    }

    void m(View view, float f2) {
        List<e> list = this.u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).c(view, f2);
            }
        }
    }

    View o(int i) {
        int b2 = b.g.l.e.b(i, t.y(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((u(childAt) & 7) == b2) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (!this.D || this.x == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.C) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
        if (systemWindowInsetTop <= 0) {
            return;
        }
        this.x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
        this.x.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            b.i.b.d r1 = r6.f994h
            boolean r1 = r1.P(r7)
            b.i.b.d r2 = r6.i
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            b.i.b.d r7 = r6.f994h
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.j
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.k
            r7.p()
            goto L36
        L31:
            r6.j(r2)
            r6.s = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
            float r4 = r6.f992f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            b.i.b.d r4 = r6.f994h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.C(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.s = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.z()
            if (r7 != 0) goto L70
            boolean r7 = r6.s
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            r2 = 0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !A()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View q = q();
            if (q != null && s(q) == 0) {
                i();
            }
            return q != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f2;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        int i8;
        this.m = true;
        int i9 = i3 - i;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (C(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (d(childAt, 3)) {
                        float f3 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (fVar.f999b * f3));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i9 - i8) / f4;
                        i5 = i9 - ((int) (fVar.f999b * f4));
                    }
                    boolean z2 = f2 != fVar.f999b;
                    int i12 = fVar.f998a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i13 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight2 + i15);
                    }
                    if (z2) {
                        T(childAt, f2);
                    }
                    int i19 = fVar.f999b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        if (Q && (rootWindowInsets = getRootWindowInsets()) != null) {
            b.g.e.b e2 = b0.q(rootWindowInsets).e();
            b.i.b.d dVar = this.f994h;
            dVar.L(Math.max(dVar.w(), e2.f2378a));
            b.i.b.d dVar2 = this.i;
            dVar2.L(Math.max(dVar2.w(), e2.f2380c));
        }
        this.m = false;
        this.n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View o;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i = gVar.f1002d;
        if (i != 0 && (o = o(i)) != null) {
            L(o);
        }
        int i2 = gVar.f1003e;
        if (i2 != 3) {
            S(i2, 3);
        }
        int i3 = gVar.f1004f;
        if (i3 != 3) {
            S(i3, 5);
        }
        int i4 = gVar.f1005g;
        if (i4 != 3) {
            S(i4, 8388611);
        }
        int i5 = gVar.f1006h;
        if (i5 == 3) {
            return;
        }
        S(i5, 8388613);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Q();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            f fVar = (f) getChildAt(i).getLayoutParams();
            int i2 = fVar.f1001d;
            boolean z = true;
            boolean z2 = i2 == 1;
            if (i2 != 2) {
                z = false;
            }
            if (z2 || z) {
                gVar.f1002d = fVar.f998a;
                break;
            }
        }
        gVar.f1003e = this.o;
        gVar.f1004f = this.p;
        gVar.f1005g = this.q;
        gVar.f1006h = this.r;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (s(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            b.i.b.d r0 = r6.f994h
            r0.F(r7)
            b.i.b.d r0 = r6.i
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            if (r0 == r2) goto L1e
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6e
        L1a:
            r6.j(r2)
            goto L6c
        L1e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            b.i.b.d r3 = r6.f994h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5b
            boolean r3 = r6.C(r3)
            if (r3 == 0) goto L5b
            float r3 = r6.v
            float r0 = r0 - r3
            float r3 = r6.w
            float r7 = r7 - r3
            b.i.b.d r3 = r6.f994h
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5b
            android.view.View r7 = r6.p()
            if (r7 == 0) goto L5b
            int r7 = r6.s(r7)
            r0 = 2
            if (r7 != r0) goto L5c
        L5b:
            r1 = 1
        L5c:
            r6.j(r1)
            goto L6e
        L60:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
        L6c:
            r6.s = r1
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    View p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((f) childAt.getLayoutParams()).f1001d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    View q() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (E(childAt) && F(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int r(int i) {
        int y = t.y(this);
        if (i == 3) {
            int i2 = this.o;
            if (i2 != 3) {
                return i2;
            }
            int i3 = y == 0 ? this.q : this.r;
            if (i3 == 3) {
                return 0;
            }
            return i3;
        } else if (i == 5) {
            int i4 = this.p;
            if (i4 != 3) {
                return i4;
            }
            int i5 = y == 0 ? this.r : this.q;
            if (i5 == 3) {
                return 0;
            }
            return i5;
        } else if (i == 8388611) {
            int i6 = this.q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = y == 0 ? this.o : this.p;
            if (i7 == 3) {
                return 0;
            }
            return i7;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.r;
            if (i8 != 3) {
                return i8;
            }
            int i9 = y == 0 ? this.p : this.o;
            if (i9 == 3) {
                return 0;
            }
            return i9;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            j(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.m) {
            super.requestLayout();
        }
    }

    public int s(View view) {
        if (E(view)) {
            return r(((f) view.getLayoutParams()).f998a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerElevation(float f2) {
        this.f989c = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (E(childAt)) {
                t.p0(childAt, this.f989c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.t;
        if (eVar2 != null) {
            N(eVar2);
        }
        if (eVar != null) {
            b(eVar);
        }
        this.t = eVar;
    }

    public void setDrawerLockMode(int i) {
        S(i, 3);
        S(i, 5);
    }

    public void setScrimColor(int i) {
        this.f991e = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.x = i != 0 ? b.g.d.a.d(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.x = new ColorDrawable(i);
        invalidate();
    }

    public CharSequence t(int i) {
        int b2 = b.g.l.e.b(i, t.y(this));
        if (b2 == 3) {
            return this.A;
        }
        if (b2 != 5) {
            return null;
        }
        return this.B;
    }

    int u(View view) {
        return b.g.l.e.b(((f) view.getLayoutParams()).f998a, t.y(this));
    }

    float v(View view) {
        return ((f) view.getLayoutParams()).f999b;
    }
}
