package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.y;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class b extends ViewGroup {
    static final int[] N4 = {16842931};
    private static final Comparator<d> O4 = new a();
    private static final Interpolator P4 = new animation.InterpolatorC0066b();
    private static final j Q4 = new j();
    private boolean A4;
    private boolean B4;
    private int C4;
    private List<g> D4;
    private g E4;
    private g F4;
    private List<f> G4;
    private h H4;
    private int I4;
    private int J4;
    private ArrayList<View> K4;
    private final Runnable L4;
    private int M4;
    private int U3;
    private Parcelable V3;
    private ClassLoader W3;
    private Scroller X3;
    private boolean Y3;
    private int Z3;

    /* renamed from: a4 */
    private Drawable f5144a4;

    /* renamed from: b4 */
    private int f5145b4;

    /* renamed from: c */
    private int f5146c;

    /* renamed from: c4 */
    private int f5147c4;

    /* renamed from: d */
    private final ArrayList<d> f5148d;

    /* renamed from: d4 */
    private float f5149d4;

    /* renamed from: e4 */
    private float f5150e4;

    /* renamed from: f4 */
    private int f5151f4;

    /* renamed from: g4 */
    private int f5152g4;

    /* renamed from: h4 */
    private boolean f5153h4;

    /* renamed from: i4 */
    private boolean f5154i4;

    /* renamed from: j4 */
    private boolean f5155j4;

    /* renamed from: k4 */
    private int f5156k4;

    /* renamed from: l4 */
    private boolean f5157l4;

    /* renamed from: m4 */
    private boolean f5158m4;

    /* renamed from: n4 */
    private int f5159n4;

    /* renamed from: o4 */
    private int f5160o4;

    /* renamed from: p4 */
    private int f5161p4;

    /* renamed from: q */
    private final d f5162q;

    /* renamed from: q4 */
    private float f5163q4;

    /* renamed from: r4 */
    private float f5164r4;

    /* renamed from: s4 */
    private float f5165s4;

    /* renamed from: t4 */
    private float f5166t4;

    /* renamed from: u4 */
    private int f5167u4;

    /* renamed from: v4 */
    private VelocityTracker f5168v4;

    /* renamed from: w4 */
    private int f5169w4;

    /* renamed from: x */
    private final Rect f5170x;

    /* renamed from: x4 */
    private boolean f5171x4;

    /* renamed from: y */
    int f5172y;

    /* renamed from: y4 */
    private EdgeEffect f5173y4;

    /* renamed from: z4 */
    private EdgeEffect f5174z4;

    /* loaded from: classes.dex */
    static class a implements Comparator<d> {
        a() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return dVar.f5176b - dVar2.f5176b;
        }
    }

    /* renamed from: androidx.viewpager.widget.b$b */
    /* loaded from: classes.dex */
    static class animation.InterpolatorC0066b implements Interpolator {
        animation.InterpolatorC0066b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        Object f5175a;

        /* renamed from: b */
        int f5176b;

        /* renamed from: c */
        boolean f5177c;

        /* renamed from: d */
        float f5178d;

        /* renamed from: e */
        float f5179e;

        d() {
        }
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f5180a;

        /* renamed from: b */
        public int f5181b;

        /* renamed from: c */
        float f5182c = 0.0f;

        /* renamed from: d */
        boolean f5183d;

        /* renamed from: e */
        int f5184e;

        /* renamed from: f */
        int f5185f;

        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.N4);
            this.f5181b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(b bVar, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(int i10, float f10, int i11);

        void b(int i10);

        void c(int i10);
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(View view, float f10);
    }

    /* loaded from: classes.dex */
    public static class i extends v0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: q */
        int f5186q;

        /* renamed from: x */
        Parcelable f5187x;

        /* renamed from: y */
        ClassLoader f5188y;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            /* renamed from: b */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            /* renamed from: c */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f5186q = parcel.readInt();
            this.f5187x = parcel.readParcelable(classLoader);
            this.f5188y = classLoader;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f5186q + "}";
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5186q);
            parcel.writeParcelable(this.f5187x, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class j implements Comparator<View> {
        j() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            e eVar = (e) view.getLayoutParams();
            e eVar2 = (e) view2.getLayoutParams();
            boolean z10 = eVar.f5180a;
            return z10 != eVar2.f5180a ? z10 ? 1 : -1 : eVar.f5184e - eVar2.f5184e;
        }
    }

    private void A(int i10, int i11, int i12, int i13) {
        int min;
        if (i11 <= 0 || this.f5148d.isEmpty()) {
            d p10 = p(this.f5172y);
            min = (int) ((p10 != null ? Math.min(p10.f5179e, this.f5150e4) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            }
            e(false);
        } else if (!this.X3.isFinished()) {
            this.X3.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12));
        }
        scrollTo(min, getScrollY());
    }

    private void D(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean E() {
        this.f5167u4 = -1;
        k();
        this.f5173y4.onRelease();
        this.f5174z4.onRelease();
        return this.f5173y4.isFinished() || this.f5174z4.isFinished();
    }

    private void F(int i10, boolean z10, int i11, boolean z11) {
        d p10 = p(i10);
        int clientWidth = p10 != null ? (int) (getClientWidth() * Math.max(this.f5149d4, Math.min(p10.f5179e, this.f5150e4))) : 0;
        if (z10) {
            J(clientWidth, 0, i11);
            if (!z11) {
                return;
            }
            g(i10);
            return;
        }
        if (z11) {
            g(i10);
        }
        e(false);
        scrollTo(clientWidth, 0);
        w(clientWidth);
    }

    private void K() {
        if (this.J4 != 0) {
            ArrayList<View> arrayList = this.K4;
            if (arrayList == null) {
                this.K4 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.K4.add(getChildAt(i10));
            }
            Collections.sort(this.K4, Q4);
        }
    }

    private void e(boolean z10) {
        boolean z11 = this.M4 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.X3.isFinished()) {
                this.X3.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.X3.getCurrX();
                int currY = this.X3.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        w(currX);
                    }
                }
            }
        }
        this.f5155j4 = false;
        for (int i10 = 0; i10 < this.f5148d.size(); i10++) {
            d dVar = this.f5148d.get(i10);
            if (dVar.f5177c) {
                dVar.f5177c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                y.g0(this, this.L4);
            } else {
                this.L4.run();
            }
        }
    }

    private void f(int i10, float f10, int i11) {
        g gVar = this.E4;
        if (gVar != null) {
            gVar.a(i10, f10, i11);
        }
        List<g> list = this.D4;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar2 = this.D4.get(i12);
                if (gVar2 != null) {
                    gVar2.a(i10, f10, i11);
                }
            }
        }
        g gVar3 = this.F4;
        if (gVar3 != null) {
            gVar3.a(i10, f10, i11);
        }
    }

    private void g(int i10) {
        g gVar = this.E4;
        if (gVar != null) {
            gVar.c(i10);
        }
        List<g> list = this.D4;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar2 = this.D4.get(i11);
                if (gVar2 != null) {
                    gVar2.c(i10);
                }
            }
        }
        g gVar3 = this.F4;
        if (gVar3 != null) {
            gVar3.c(i10);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(int i10) {
        g gVar = this.E4;
        if (gVar != null) {
            gVar.b(i10);
        }
        List<g> list = this.D4;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar2 = this.D4.get(i11);
                if (gVar2 != null) {
                    gVar2.b(i10);
                }
            }
        }
        g gVar3 = this.F4;
        if (gVar3 != null) {
            gVar3.b(i10);
        }
    }

    private void j(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.I4 : 0, null);
        }
    }

    private void k() {
        this.f5157l4 = false;
        this.f5158m4 = false;
        VelocityTracker velocityTracker = this.f5168v4;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5168v4 = null;
        }
    }

    private Rect m(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private d o() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.Z3 / clientWidth : 0.0f;
        int i11 = -1;
        float f12 = 0.0f;
        int i12 = 0;
        d dVar = null;
        boolean z10 = true;
        while (i12 < this.f5148d.size()) {
            d dVar2 = this.f5148d.get(i12);
            if (!z10 && dVar2.f5176b != (i10 = i11 + 1)) {
                d dVar3 = this.f5162q;
                dVar3.f5179e = f10 + f12 + f11;
                dVar3.f5176b = i10;
                throw null;
            }
            f10 = dVar2.f5179e;
            float f13 = dVar2.f5178d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return dVar;
            }
            if (scrollX < f13 || i12 == this.f5148d.size() - 1) {
                return dVar2;
            }
            i11 = dVar2.f5176b;
            f12 = dVar2.f5178d;
            i12++;
            z10 = false;
            dVar = dVar2;
        }
        return dVar;
    }

    private static boolean q(View view) {
        return view.getClass().getAnnotation(c.class) != null;
    }

    private boolean r(float f10, float f11) {
        return (f10 < ((float) this.f5160o4) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.f5160o4)) && f11 < 0.0f);
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f5154i4 != z10) {
            this.f5154i4 = z10;
        }
    }

    private void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5167u4) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f5163q4 = motionEvent.getX(i10);
            this.f5167u4 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f5168v4;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.clear();
        }
    }

    private boolean w(int i10) {
        if (this.f5148d.size() == 0) {
            if (this.A4) {
                return false;
            }
            this.B4 = false;
            s(0, 0.0f, 0);
            if (!this.B4) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            return false;
        }
        d o10 = o();
        int clientWidth = getClientWidth();
        int i11 = this.Z3;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = o10.f5176b;
        float f11 = ((i10 / f10) - o10.f5179e) / (o10.f5178d + (i11 / f10));
        this.B4 = false;
        s(i13, f11, (int) (i12 * f11));
        if (!this.B4) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    private boolean x(float f10) {
        this.f5163q4 = f10;
        getScrollX();
        getClientWidth();
        ArrayList<d> arrayList = this.f5148d;
        int i10 = this.f5148d.get(0).f5176b;
        int i11 = arrayList.get(arrayList.size() - 1).f5176b;
        throw null;
    }

    public void B(f fVar) {
        List<f> list = this.G4;
        if (list != null) {
            list.remove(fVar);
        }
    }

    public void C(g gVar) {
        List<g> list = this.D4;
        if (list != null) {
            list.remove(gVar);
        }
    }

    public void G(int i10, boolean z10) {
        this.f5155j4 = false;
        H(i10, z10, false);
    }

    void H(int i10, boolean z10, boolean z11) {
        I(i10, z10, z11, 0);
    }

    void I(int i10, boolean z10, boolean z11, int i11) {
        setScrollingCacheEnabled(false);
    }

    void J(int i10, int i11, int i12) {
        int i13;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.X3;
        if (scroller != null && !scroller.isFinished()) {
            i13 = this.Y3 ? this.X3.getCurrX() : this.X3.getStartX();
            this.X3.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i13 = getScrollX();
        }
        int i14 = i13;
        int scrollY = getScrollY();
        int i15 = i10 - i14;
        int i16 = i11 - scrollY;
        if (i15 == 0 && i16 == 0) {
            e(false);
            y();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        float f10 = clientWidth / 2;
        float i17 = f10 + (i(Math.min(1.0f, (Math.abs(i15) * 1.0f) / clientWidth)) * f10);
        int abs = Math.abs(i12);
        if (abs <= 0) {
            throw null;
        }
        int min = Math.min(Math.round(Math.abs(i17 / abs) * 1000.0f) * 4, 600);
        this.Y3 = false;
        this.X3.startScroll(i14, scrollY, i15, i16, min);
        y.f0(this);
    }

    public void a(f fVar) {
        if (this.G4 == null) {
            this.G4 = new ArrayList();
        }
        this.G4.add(fVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        d n10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (n10 = n(childAt)) != null && n10.f5176b == this.f5172y) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        d n10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (n10 = n(childAt)) != null && n10.f5176b == this.f5172y) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        e eVar = (e) layoutParams;
        boolean q10 = eVar.f5180a | q(view);
        eVar.f5180a = q10;
        if (!this.f5153h4) {
            super.addView(view, i10, layoutParams);
        } else if (q10) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            eVar.f5183d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public void b(g gVar) {
        if (this.D4 == null) {
            this.D4 = new ArrayList();
        }
        this.D4.add(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L69
        Lb:
            if (r0 == 0) goto L69
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L69:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb5
            if (r3 == r0) goto Lb5
            if (r7 != r5) goto L9a
            android.graphics.Rect r1 = r6.f5170x
            android.graphics.Rect r1 = r6.m(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f5170x
            android.graphics.Rect r2 = r6.m(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 < r2) goto L94
            boolean r0 = r6.u()
            goto L98
        L94:
            boolean r0 = r3.requestFocus()
        L98:
            r2 = r0
            goto Lc8
        L9a:
            if (r7 != r4) goto Lc8
            android.graphics.Rect r1 = r6.f5170x
            android.graphics.Rect r1 = r6.m(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f5170x
            android.graphics.Rect r2 = r6.m(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 > r2) goto L94
            boolean r0 = r6.v()
            goto L98
        Lb5:
            if (r7 == r5) goto Lc4
            if (r7 != r1) goto Lba
            goto Lc4
        Lba:
            if (r7 == r4) goto Lbf
            r0 = 2
            if (r7 != r0) goto Lc8
        Lbf:
            boolean r2 = r6.v()
            goto Lc8
        Lc4:
            boolean r2 = r6.u()
        Lc8:
            if (r2 == 0) goto Ld1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.b.c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.Y3 = true;
        if (this.X3.isFinished() || !this.X3.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.X3.getCurrX();
        int currY = this.X3.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!w(currX)) {
                this.X3.abortAnimation();
                scrollTo(0, currY);
            }
        }
        y.f0(this);
    }

    protected boolean d(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || l(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d n10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (n10 = n(childAt)) != null && n10.f5176b == this.f5172y && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z10 = false;
        if (getOverScrollMode() != 0) {
            this.f5173y4.finish();
            this.f5174z4.finish();
        } else {
            if (!this.f5173y4.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f5149d4 * width);
                this.f5173y4.setSize(height, width);
                z10 = false | this.f5173y4.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f5174z4.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f5150e4 + 1.0f)) * width2);
                this.f5174z4.setSize(height2, width2);
                z10 |= this.f5174z4.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            y.f0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5144a4;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.J4 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((e) this.K4.get(i11).getLayoutParams()).f5185f;
    }

    public int getCurrentItem() {
        return this.f5172y;
    }

    public int getOffscreenPageLimit() {
        return this.f5156k4;
    }

    public int getPageMargin() {
        return this.Z3;
    }

    float i(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public boolean l(KeyEvent keyEvent) {
        int i10;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return c(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return c(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return v();
                } else {
                    i10 = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return u();
            } else {
                i10 = 17;
            }
            return c(i10);
        }
        return false;
    }

    d n(View view) {
        if (this.f5148d.size() <= 0) {
            return null;
        }
        Object obj = this.f5148d.get(0).f5175a;
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A4 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.L4);
        Scroller scroller = this.X3;
        if (scroller != null && !scroller.isFinished()) {
            this.X3.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.Z3 <= 0 || this.f5144a4 == null) {
            return;
        }
        this.f5148d.size();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            E();
            return false;
        }
        if (action != 0) {
            if (this.f5157l4) {
                return true;
            }
            if (this.f5158m4) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f5165s4 = x10;
            this.f5163q4 = x10;
            float y10 = motionEvent.getY();
            this.f5166t4 = y10;
            this.f5164r4 = y10;
            this.f5167u4 = motionEvent.getPointerId(0);
            this.f5158m4 = false;
            this.Y3 = true;
            this.X3.computeScrollOffset();
            if (this.M4 != 2 || Math.abs(this.X3.getFinalX() - this.X3.getCurrX()) <= this.f5169w4) {
                e(false);
                this.f5157l4 = false;
            } else {
                this.X3.abortAnimation();
                this.f5155j4 = false;
                y();
                this.f5157l4 = true;
                D(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f5167u4;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.f5163q4;
                float abs = Math.abs(f10);
                float y11 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.f5166t4);
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 != 0 && !r(this.f5163q4, f10) && d(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.f5163q4 = x11;
                    this.f5164r4 = y11;
                    this.f5158m4 = true;
                    return false;
                }
                int i12 = this.f5161p4;
                if (abs > i12 && abs * 0.5f > abs2) {
                    this.f5157l4 = true;
                    D(true);
                    setScrollState(1);
                    float f11 = this.f5165s4;
                    float f12 = this.f5161p4;
                    this.f5163q4 = i11 > 0 ? f11 + f12 : f11 - f12;
                    this.f5164r4 = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i12) {
                    this.f5158m4 = true;
                }
                if (this.f5157l4 && x(x11)) {
                    y.f0(this);
                }
            }
        } else if (action == 6) {
            t(motionEvent);
        }
        if (this.f5168v4 == null) {
            this.f5168v4 = VelocityTracker.obtain();
        }
        this.f5168v4.addMovement(motionEvent);
        return this.f5157l4;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.b.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        e eVar;
        e eVar2;
        int i12;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i10), ViewGroup.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f5160o4 = Math.min(measuredWidth / 10, this.f5159n4);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (eVar2 = (e) childAt.getLayoutParams()) != null && eVar2.f5180a) {
                int i15 = eVar2.f5181b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) eVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) eVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f5151f4 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f5152g4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f5153h4 = true;
        y();
        this.f5153h4 = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((eVar = (e) childAt2.getLayoutParams()) == null || !eVar.f5180a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * eVar.f5182c), 1073741824), this.f5152g4);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        d n10;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i11 = 1;
        } else {
            i12 = childCount - 1;
            i11 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (n10 = n(childAt)) != null && n10.f5176b == this.f5172y && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i12 += i11;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        this.U3 = iVar.f5186q;
        this.V3 = iVar.f5187x;
        this.W3 = iVar.f5188y;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f5186q = this.f5172y;
        return iVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.Z3;
            A(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5171x4) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    d p(int i10) {
        for (int i11 = 0; i11 < this.f5148d.size(); i11++) {
            d dVar = this.f5148d.get(i11);
            if (dVar.f5176b == i10) {
                return dVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f5153h4) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void s(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.C4
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.b$e r9 = (androidx.viewpager.widget.b.e) r9
            boolean r10 = r9.f5180a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f5181b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.f(r13, r14, r15)
            androidx.viewpager.widget.b$h r13 = r12.H4
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.b$e r0 = (androidx.viewpager.widget.b.e) r0
            boolean r0 = r0.f5180a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.b$h r3 = r12.H4
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.B4 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.b.s(int, float, int):void");
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        this.f5146c = 0;
        List<f> list = this.G4;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.G4.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.G4.get(i10).a(this, null, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.f5155j4 = false;
        H(i10, !this.A4, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f5156k4) {
            this.f5156k4 = i10;
            y();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(g gVar) {
        this.E4 = gVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.Z3;
        this.Z3 = i10;
        int width = getWidth();
        A(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(androidx.core.content.a.d(getContext(), i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f5144a4 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.M4 == i10) {
            return;
        }
        this.M4 = i10;
        if (this.H4 != null) {
            j(i10 != 0);
        }
        h(i10);
    }

    boolean u() {
        int i10 = this.f5172y;
        if (i10 > 0) {
            G(i10 - 1, true);
            return true;
        }
        return false;
    }

    boolean v() {
        return false;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5144a4;
    }

    void y() {
        z(this.f5172y);
    }

    void z(int i10) {
        int i11 = this.f5172y;
        if (i11 != i10) {
            p(i11);
            this.f5172y = i10;
        }
        K();
    }
}
