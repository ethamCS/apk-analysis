package androidx.drawerlayout.widget;

import a.g.l.d0.c;
import a.g.l.u;
import a.i.b.c;
import android.annotation.SuppressLint;
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
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final int[] L = {16843828};
    static final int[] M = {16842931};
    static final boolean N;
    private static final boolean O;
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

    /* renamed from: b */
    private final c f874b;

    /* renamed from: c */
    private float f875c;
    private int d;
    private int e;
    private float f;
    private Paint g;
    private final a.i.b.c h;
    private final a.i.b.c i;
    private final g j;
    private final g k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private d t;
    private List<d> u;
    private float v;
    private float w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnApplyWindowInsetsListener {
        a(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends a.g.l.a {
        private final Rect d = new Rect();

        b() {
            DrawerLayout.this = r1;
        }

        private void a(a.g.l.d0.c cVar, a.g.l.d0.c cVar2) {
            Rect rect = this.d;
            cVar2.a(rect);
            cVar.c(rect);
            cVar2.b(rect);
            cVar.d(rect);
            cVar.o(cVar2.u());
            cVar.e(cVar2.f());
            cVar.a(cVar2.c());
            cVar.b(cVar2.d());
            cVar.f(cVar2.m());
            cVar.d(cVar2.l());
            cVar.g(cVar2.n());
            cVar.h(cVar2.o());
            cVar.a(cVar2.i());
            cVar.m(cVar2.s());
            cVar.j(cVar2.p());
            cVar.a(cVar2.a());
        }

        private void a(a.g.l.d0.c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m(childAt)) {
                    cVar.a(childAt);
                }
            }
        }

        @Override // a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            if (DrawerLayout.N) {
                super.a(view, cVar);
            } else {
                a.g.l.d0.c a2 = a.g.l.d0.c.a(cVar);
                super.a(view, a2);
                cVar.c(view);
                ViewParent u = u.u(view);
                if (u instanceof View) {
                    cVar.b((View) u);
                }
                a(cVar, a2);
                a2.v();
                a(cVar, (ViewGroup) view);
            }
            cVar.a((CharSequence) DrawerLayout.class.getName());
            cVar.g(false);
            cVar.h(false);
            cVar.b(c.a.e);
            cVar.b(c.a.f);
        }

        @Override // a.g.l.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View d = DrawerLayout.this.d();
                if (d == null) {
                    return true;
                }
                CharSequence d2 = DrawerLayout.this.d(DrawerLayout.this.e(d));
                if (d2 == null) {
                    return true;
                }
                text.add(d2);
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // a.g.l.a
        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.N || DrawerLayout.m(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        @Override // a.g.l.a
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends a.g.l.a {
        c() {
        }

        @Override // a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            super.a(view, cVar);
            if (!DrawerLayout.m(view)) {
                cVar.b((View) null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i);

        void a(View view);

        void a(View view, float f);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f876a;

        /* renamed from: b */
        float f877b;

        /* renamed from: c */
        boolean f878c;
        int d;

        public e(int i, int i2) {
            super(i, i2);
            this.f876a = 0;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f876a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.M);
            this.f876a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f876a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f876a = 0;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f876a = 0;
            this.f876a = eVar.f876a;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends a.i.a.a {
        public static final Parcelable.Creator<f> CREATOR = new a();
        int d;
        int e;
        int f;
        int g;
        int h;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = 0;
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
        }

        public f(Parcelable parcelable) {
            super(parcelable);
            this.d = 0;
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        }
    }

    /* loaded from: classes.dex */
    public class g extends c.AbstractC0022c {

        /* renamed from: a */
        private final int f879a;

        /* renamed from: b */
        private a.i.b.c f880b;

        /* renamed from: c */
        private final Runnable f881c = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            a() {
                g.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.a();
            }
        }

        g(int i) {
            DrawerLayout.this = r1;
            this.f879a = i;
        }

        private void c() {
            int i = 3;
            if (this.f879a == 3) {
                i = 5;
            }
            View b2 = DrawerLayout.this.b(i);
            if (b2 != null) {
                DrawerLayout.this.a(b2);
            }
        }

        @Override // a.i.b.c.AbstractC0022c
        public int a(View view) {
            if (DrawerLayout.this.i(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // a.i.b.c.AbstractC0022c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        void a() {
            View view;
            int i;
            int c2 = this.f880b.c();
            int i2 = 0;
            boolean z = this.f879a == 3;
            if (z) {
                view = DrawerLayout.this.b(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + c2;
            } else {
                view = DrawerLayout.this.b(5);
                i = DrawerLayout.this.getWidth() - c2;
            }
            if (view != null) {
                if (((!z || view.getLeft() >= i) && (z || view.getLeft() <= i)) || DrawerLayout.this.d(view) != 0) {
                    return;
                }
                this.f880b.b(view, i, view.getTop());
                ((e) view.getLayoutParams()).f878c = true;
                DrawerLayout.this.invalidate();
                c();
                DrawerLayout.this.a();
            }
        }

        @Override // a.i.b.c.AbstractC0022c
        public void a(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View b2 = drawerLayout.b(i3);
            if (b2 == null || DrawerLayout.this.d(b2) != 0) {
                return;
            }
            this.f880b.a(b2, i2);
        }

        public void a(a.i.b.c cVar) {
            this.f880b = cVar;
        }

        @Override // a.i.b.c.AbstractC0022c
        public void a(View view, float f, float f2) {
            int i;
            float f3 = DrawerLayout.this.f(view);
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f880b.d(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // a.i.b.c.AbstractC0022c
        public void a(View view, int i) {
            ((e) view.getLayoutParams()).f878c = false;
            c();
        }

        @Override // a.i.b.c.AbstractC0022c
        public void a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.a(view, 3) ? i + width : DrawerLayout.this.getWidth() - i) / width;
            DrawerLayout.this.c(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // a.i.b.c.AbstractC0022c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        public void b() {
            DrawerLayout.this.removeCallbacks(this.f881c);
        }

        @Override // a.i.b.c.AbstractC0022c
        public void b(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f881c, 160L);
        }

        @Override // a.i.b.c.AbstractC0022c
        public boolean b(int i) {
            return false;
        }

        @Override // a.i.b.c.AbstractC0022c
        public boolean b(View view, int i) {
            return DrawerLayout.this.i(view) && DrawerLayout.this.a(view, this.f879a) && DrawerLayout.this.d(view) == 0;
        }

        @Override // a.i.b.c.AbstractC0022c
        public void c(int i) {
            DrawerLayout.this.a(this.f879a, i, this.f880b.b());
        }
    }

    static {
        boolean z = true;
        N = Build.VERSION.SDK_INT >= 19;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        O = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f874b = new c();
        this.e = -1728053248;
        this.g = new Paint();
        this.n = true;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.r = 3;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.d = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.j = new g(3);
        this.k = new g(5);
        a.i.b.c a2 = a.i.b.c.a(this, 1.0f, this.j);
        this.h = a2;
        a2.d(1);
        this.h.a(f3);
        this.j.a(this.h);
        a.i.b.c a3 = a.i.b.c.a(this, 1.0f, this.k);
        this.i = a3;
        a3.d(2);
        this.i.a(f3);
        this.k.a(this.i);
        setFocusableInTouchMode(true);
        u.h(this, 1);
        u.a(this, new b());
        setMotionEventSplittingEnabled(false);
        if (u.l(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(L);
                try {
                    this.x = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.x = null;
            }
        }
        this.f875c = f2 * 10.0f;
        this.I = new ArrayList<>();
    }

    private boolean a(float f2, float f3, View view) {
        if (this.J == null) {
            this.J = new Rect();
        }
        view.getHitRect(this.J);
        return this.J.contains((int) f2, (int) f3);
    }

    private boolean a(Drawable drawable, int i) {
        if (drawable == null || !androidx.core.graphics.drawable.a.f(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.a(drawable, i);
        return true;
    }

    private boolean a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b2 = b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b2);
            b2.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent b(MotionEvent motionEvent, View view) {
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

    private void c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            u.h(childAt, ((z || i(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    private boolean e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((e) getChildAt(i).getLayoutParams()).f878c) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        return d() != null;
    }

    private Drawable g() {
        int o = u.o(this);
        if (o == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                a(drawable, o);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                a(drawable2, o);
                return this.F;
            }
        }
        return this.G;
    }

    private Drawable h() {
        int o = u.o(this);
        if (o == 0) {
            Drawable drawable = this.F;
            if (drawable != null) {
                a(drawable, o);
                return this.F;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                a(drawable2, o);
                return this.E;
            }
        }
        return this.H;
    }

    static String h(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private void i() {
        if (O) {
            return;
        }
        this.y = g();
        this.z = h();
    }

    private static boolean l(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    static boolean m(View view) {
        return (u.m(view) == 4 || u.m(view) == 2) ? false : true;
    }

    void a() {
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

    public void a(int i) {
        a(i, true);
    }

    public void a(int i, int i2) {
        View b2;
        int a2 = a.g.l.c.a(i2, u.o(this));
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
            (a2 == 3 ? this.h : this.i).a();
        }
        if (i != 1) {
            if (i != 2 || (b2 = b(a2)) == null) {
                return;
            }
            k(b2);
            return;
        }
        View b3 = b(a2);
        if (b3 == null) {
            return;
        }
        a(b3);
    }

    void a(int i, int i2, View view) {
        int e2 = this.h.e();
        int e3 = this.i.e();
        int i3 = 2;
        if (e2 == 1 || e3 == 1) {
            i3 = 1;
        } else if (e2 != 2 && e3 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f2 = ((e) view.getLayoutParams()).f877b;
            if (f2 == 0.0f) {
                b(view);
            } else if (f2 == 1.0f) {
                c(view);
            }
        }
        if (i3 != this.l) {
            this.l = i3;
            List<d> list = this.u;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).a(i3);
            }
        }
    }

    public void a(int i, boolean z) {
        View b2 = b(i);
        if (b2 != null) {
            a(b2, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + h(i));
    }

    public void a(View view) {
        a(view, true);
    }

    void a(View view, float f2) {
        List<d> list = this.u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).a(view, f2);
            }
        }
    }

    public void a(View view, boolean z) {
        a.i.b.c cVar;
        int i;
        if (!i(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.n) {
            eVar.f877b = 0.0f;
            eVar.d = 0;
        } else if (z) {
            eVar.d |= 4;
            if (a(view, 3)) {
                cVar = this.h;
                i = -view.getWidth();
            } else {
                cVar = this.i;
                i = getWidth();
            }
            cVar.b(view, i, view.getTop());
        } else {
            b(view, 0.0f);
            a(eVar.f876a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(dVar);
    }

    public void a(Object obj, boolean z) {
        this.C = obj;
        this.D = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    void a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            if (i(childAt) && (!z || eVar.f878c)) {
                z2 |= a(childAt, 3) ? this.h.b(childAt, -childAt.getWidth(), childAt.getTop()) : this.i.b(childAt, getWidth(), childAt.getTop());
                eVar.f878c = false;
            }
        }
        this.j.b();
        this.k.b();
        if (z2) {
            invalidate();
        }
    }

    boolean a(View view, int i) {
        return (e(view) & i) == i;
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
            if (!i(childAt)) {
                this.I.add(childAt);
            } else if (h(childAt)) {
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
        u.h(view, (c() != null || i(view)) ? 4 : 1);
        if (!N) {
            u.a(view, this.f874b);
        }
    }

    View b(int i) {
        int a2 = a.g.l.c.a(i, u.o(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((e(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    public void b() {
        a(false);
    }

    public void b(int i, boolean z) {
        View b2 = b(i);
        if (b2 != null) {
            b(b2, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + h(i));
    }

    void b(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.d & 1) == 1) {
            eVar.d = 0;
            List<d> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).b(view);
                }
            }
            c(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void b(View view, float f2) {
        float f3 = f(view);
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (f3 * width));
        if (!a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        c(view, f2);
    }

    public void b(View view, boolean z) {
        if (!i(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.n) {
            eVar.f877b = 1.0f;
            eVar.d = 1;
            c(view, true);
        } else if (z) {
            eVar.d |= 2;
            if (a(view, 3)) {
                this.h.b(view, 0, view.getTop());
            } else {
                this.i.b(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            b(view, 1.0f);
            a(eVar.f876a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void b(d dVar) {
        List<d> list;
        if (dVar == null || (list = this.u) == null) {
            return;
        }
        list.remove(dVar);
    }

    public int c(int i) {
        int o = u.o(this);
        if (i == 3) {
            int i2 = this.o;
            if (i2 != 3) {
                return i2;
            }
            int i3 = o == 0 ? this.q : this.r;
            if (i3 == 3) {
                return 0;
            }
            return i3;
        } else if (i == 5) {
            int i4 = this.p;
            if (i4 != 3) {
                return i4;
            }
            int i5 = o == 0 ? this.r : this.q;
            if (i5 == 3) {
                return 0;
            }
            return i5;
        } else if (i == 8388611) {
            int i6 = this.q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = o == 0 ? this.o : this.p;
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
            int i9 = o == 0 ? this.p : this.o;
            if (i9 == 3) {
                return 0;
            }
            return i9;
        }
    }

    View c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((e) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    void c(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.d & 1) == 0) {
            eVar.d = 1;
            List<d> list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.u.get(size).a(view);
                }
            }
            c(view, true);
            if (!hasWindowFocus()) {
                return;
            }
            sendAccessibilityEvent(32);
        }
    }

    void c(View view, float f2) {
        e eVar = (e) view.getLayoutParams();
        if (f2 == eVar.f877b) {
            return;
        }
        eVar.f877b = f2;
        a(view, f2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((e) getChildAt(i).getLayoutParams()).f877b);
        }
        this.f = f2;
        boolean a2 = this.h.a(true);
        boolean a3 = this.i.a(true);
        if (a2 || a3) {
            u.H(this);
        }
    }

    public int d(View view) {
        if (i(view)) {
            return c(((e) view.getLayoutParams()).f876a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    View d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (i(childAt) && j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public CharSequence d(int i) {
        int a2 = a.g.l.c.a(i, u.o(this));
        if (a2 == 3) {
            return this.A;
        }
        if (a2 != 5) {
            return null;
        }
        return this.B;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f <= 0.0f) {
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
            if (a(x, y, childAt) && !g(childAt) && a(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        int height = getHeight();
        boolean g2 = g(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (g2) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && l(childAt) && i(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
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
        float f2 = this.f;
        if (f2 <= 0.0f || !g2) {
            if (this.y != null && a(view, 3)) {
                int intrinsicWidth = this.y.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(right2 / this.h.c(), 1.0f));
                this.y.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.y.setAlpha((int) (max * 255.0f));
                drawable = this.y;
            } else if (this.z != null && a(view, 5)) {
                int intrinsicWidth2 = this.z.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.i.c(), 1.0f));
                this.z.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.z.setAlpha((int) (max2 * 255.0f));
                drawable = this.z;
            }
            drawable.draw(canvas);
        } else {
            int i4 = this.e;
            this.g.setColor((i4 & 16777215) | (((int) ((((-16777216) & i4) >>> 24) * f2)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.g);
        }
        return drawChild;
    }

    int e(View view) {
        return a.g.l.c.a(((e) view.getLayoutParams()).f876a, u.o(this));
    }

    public boolean e(int i) {
        View b2 = b(i);
        if (b2 != null) {
            return h(b2);
        }
        return false;
    }

    float f(View view) {
        return ((e) view.getLayoutParams()).f877b;
    }

    public boolean f(int i) {
        View b2 = b(i);
        if (b2 != null) {
            return j(b2);
        }
        return false;
    }

    public void g(int i) {
        b(i, true);
    }

    boolean g(View view) {
        return ((e) view.getLayoutParams()).f876a == 0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (O) {
            return this.f875c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.x;
    }

    public boolean h(View view) {
        if (i(view)) {
            return (((e) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean i(View view) {
        int a2 = a.g.l.c.a(((e) view.getLayoutParams()).f876a, u.o(view));
        return ((a2 & 3) == 0 && (a2 & 5) == 0) ? false : true;
    }

    public boolean j(View view) {
        if (i(view)) {
            return ((e) view.getLayoutParams()).f877b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void k(View view) {
        b(view, true);
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
            a.i.b.c r1 = r6.h
            boolean r1 = r1.b(r7)
            a.i.b.c r2 = r6.i
            boolean r2 = r2.b(r7)
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
            a.i.b.c r7 = r6.h
            boolean r7 = r7.a(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.j
            r7.b()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.k
            r7.b()
            goto L36
        L31:
            r6.a(r2)
            r6.s = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.v = r0
            r6.w = r7
            float r4 = r6.f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            a.i.b.c r4 = r6.h
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.b(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.g(r7)
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
            boolean r7 = r6.e()
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
        if (i != 4 || !f()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View d2 = d();
            if (d2 != null && d(d2) == 0) {
                b();
            }
            return d2 != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
                e eVar = (e) childAt.getLayoutParams();
                if (g(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (eVar.f877b * f3));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i9 - i8) / f4;
                        i5 = i9 - ((int) (eVar.f877b * f4));
                    }
                    boolean z2 = f2 != eVar.f877b;
                    int i12 = eVar.f876a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i13 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight2 + i15);
                    }
                    if (z2) {
                        c(childAt, f2);
                    }
                    int i19 = eVar.f877b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.m = false;
        this.n = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.C != null && u.l(this);
        int o = u.o(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z) {
                    int a2 = a.g.l.c.a(eVar.f876a, o);
                    boolean l = u.l(childAt);
                    int i5 = Build.VERSION.SDK_INT;
                    if (l) {
                        if (i5 >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.C;
                            if (a2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (i5 >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.C;
                        if (a2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (g(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else if (!i(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    if (O) {
                        float k = u.k(childAt);
                        float f2 = this.f875c;
                        if (k != f2) {
                            u.a(childAt, f2);
                        }
                    }
                    int e2 = e(childAt) & 7;
                    boolean z4 = e2 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + h(e2) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.d + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                    i4++;
                    i3 = 0;
                }
            }
            i4++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View b2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.d());
        int i = fVar.d;
        if (i != 0 && (b2 = b(i)) != null) {
            k(b2);
        }
        int i2 = fVar.e;
        if (i2 != 3) {
            a(i2, 3);
        }
        int i3 = fVar.f;
        if (i3 != 3) {
            a(i3, 5);
        }
        int i4 = fVar.g;
        if (i4 != 3) {
            a(i4, 8388611);
        }
        int i5 = fVar.h;
        if (i5 == 3) {
            return;
        }
        a(i5, 8388613);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        i();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            e eVar = (e) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = eVar.d == 1;
            if (eVar.d != 2) {
                z = false;
            }
            if (z2 || z) {
                fVar.d = eVar.f876a;
                break;
            }
        }
        fVar.e = this.o;
        fVar.f = this.p;
        fVar.g = this.q;
        fVar.h = this.r;
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (d(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            a.i.b.c r0 = r6.h
            r0.a(r7)
            a.i.b.c r0 = r6.i
            r0.a(r7)
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
            r6.a(r2)
            goto L6c
        L1e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            a.i.b.c r3 = r6.h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.b(r4, r5)
            if (r3 == 0) goto L5b
            boolean r3 = r6.g(r3)
            if (r3 == 0) goto L5b
            float r3 = r6.v
            float r0 = r0 - r3
            float r3 = r6.w
            float r7 = r7 - r3
            a.i.b.c r3 = r6.h
            int r3 = r3.d()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5b
            android.view.View r7 = r6.c()
            if (r7 == 0) goto L5b
            int r7 = r6.d(r7)
            r0 = 2
            if (r7 != r0) goto L5c
        L5b:
            r1 = 1
        L5c:
            r6.a(r1)
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

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            a(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.m) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f2) {
        this.f875c = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (i(childAt)) {
                u.a(childAt, this.f875c);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.t;
        if (dVar2 != null) {
            b(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.t = dVar;
    }

    public void setDrawerLockMode(int i) {
        a(i, 3);
        a(i, 5);
    }

    public void setScrimColor(int i) {
        this.e = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.x = i != 0 ? a.g.d.a.c(getContext(), i) : null;
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
}
