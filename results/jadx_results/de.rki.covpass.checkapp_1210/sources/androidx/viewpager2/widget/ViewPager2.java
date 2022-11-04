package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.g;
import androidx.core.view.y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: j4 */
    static boolean f5218j4 = true;
    private LinearLayoutManager V3;
    private Parcelable X3;
    RecyclerView Y3;
    private androidx.recyclerview.widget.j Z3;

    /* renamed from: a4 */
    androidx.viewpager2.widget.e f5219a4;

    /* renamed from: b4 */
    private androidx.viewpager2.widget.b f5220b4;

    /* renamed from: c4 */
    private androidx.viewpager2.widget.c f5222c4;

    /* renamed from: d4 */
    private androidx.viewpager2.widget.d f5224d4;

    /* renamed from: i4 */
    e f5229i4;

    /* renamed from: x */
    int f5231x;

    /* renamed from: c */
    private final Rect f5221c = new Rect();

    /* renamed from: d */
    private final Rect f5223d = new Rect();

    /* renamed from: q */
    private androidx.viewpager2.widget.b f5230q = new androidx.viewpager2.widget.b(3);

    /* renamed from: y */
    boolean f5232y = false;
    private RecyclerView.i U3 = new a();
    private int W3 = -1;

    /* renamed from: e4 */
    private RecyclerView.l f5225e4 = null;

    /* renamed from: f4 */
    private boolean f5226f4 = false;

    /* renamed from: g4 */
    private boolean f5227g4 = true;

    /* renamed from: h4 */
    private int f5228h4 = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(null);
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f5232y = true;
            viewPager2.f5219a4.l();
        }
    }

    /* loaded from: classes.dex */
    public class b extends i {
        b() {
            ViewPager2.this = r1;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f5231x != i10) {
                viewPager2.f5231x = i10;
                viewPager2.f5229i4.q();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends i {
        c() {
            ViewPager2.this = r1;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.Y3.requestFocus(2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements RecyclerView.q {
        d() {
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) pVar).width == -1 && ((ViewGroup.MarginLayoutParams) pVar).height == -1) {
                return;
            }
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void b(View view) {
        }
    }

    /* loaded from: classes.dex */
    public abstract class e {
        private e() {
            ViewPager2.this = r1;
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        boolean a() {
            return false;
        }

        boolean b(int i10) {
            return false;
        }

        boolean c(int i10, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(RecyclerView.g<?> gVar) {
        }

        void f(RecyclerView.g<?> gVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(androidx.core.view.accessibility.d dVar) {
        }

        boolean k(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void m() {
        }

        CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        void o(AccessibilityEvent accessibilityEvent) {
        }

        void p() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }
    }

    /* loaded from: classes.dex */
    public class f extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(r2, null);
            ViewPager2.this = r2;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(androidx.core.view.accessibility.d dVar) {
            if (!ViewPager2.this.e()) {
                dVar.P(d.a.f3627r);
                dVar.P(d.a.f3626q);
                dVar.q0(false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean k(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class g extends RecyclerView.i {
        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class h extends LinearLayoutManager {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context) {
            super(context);
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void M1(RecyclerView.a0 a0Var, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.M1(a0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void N0(RecyclerView.v vVar, RecyclerView.a0 a0Var, androidx.core.view.accessibility.d dVar) {
            super.N0(vVar, a0Var, dVar);
            ViewPager2.this.f5229i4.j(dVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean h1(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, Bundle bundle) {
            return ViewPager2.this.f5229i4.b(i10) ? ViewPager2.this.f5229i4.k(i10) : super.h1(vVar, a0Var, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void a(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }

        public void c(int i10) {
        }
    }

    /* loaded from: classes.dex */
    public class j extends e {

        /* renamed from: b */
        private final androidx.core.view.accessibility.g f5239b = new a();

        /* renamed from: c */
        private final androidx.core.view.accessibility.g f5240c = new b();

        /* renamed from: d */
        private RecyclerView.i f5241d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements androidx.core.view.accessibility.g {
            a() {
                j.this = r1;
            }

            @Override // androidx.core.view.accessibility.g
            public boolean a(View view, g.a aVar) {
                j.this.v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements androidx.core.view.accessibility.g {
            b() {
                j.this = r1;
            }

            @Override // androidx.core.view.accessibility.g
            public boolean a(View view, g.a aVar) {
                j.this.v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c() {
                super(null);
                j.this = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void a() {
                j.this.w();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j() {
            super(r2, null);
            ViewPager2.this = r2;
        }

        private void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i10;
            int i11;
            if (ViewPager2.this.getAdapter() == null) {
                i11 = 0;
                i10 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i11 = ViewPager2.this.getAdapter().e();
                i10 = 0;
            } else {
                i10 = ViewPager2.this.getAdapter().e();
                i11 = 0;
            }
            androidx.core.view.accessibility.d.y0(accessibilityNodeInfo).Z(d.b.a(i11, i10, false, 0));
        }

        private void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int e10;
            RecyclerView.g adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (e10 = adapter.e()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f5231x > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (ViewPager2.this.f5231x < e10 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.g<?> gVar) {
            w();
            if (gVar != null) {
                gVar.t(this.f5241d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.g<?> gVar) {
            if (gVar != null) {
                gVar.v(this.f5241d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            y.y0(recyclerView, 2);
            this.f5241d = new c();
            if (y.z(ViewPager2.this) == 0) {
                y.y0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10, Bundle bundle) {
            if (c(i10, bundle)) {
                v(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void m() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            w();
        }

        void v(int i10) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i10, true);
            }
        }

        void w() {
            int e10;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = 16908360;
            y.i0(viewPager2, 16908360);
            y.i0(viewPager2, 16908361);
            y.i0(viewPager2, 16908358);
            y.i0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() == null || (e10 = ViewPager2.this.getAdapter().e()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f5231x < e10 - 1) {
                    y.k0(viewPager2, new d.a(16908359, null), null, this.f5239b);
                }
                if (ViewPager2.this.f5231x <= 0) {
                    return;
                }
                y.k0(viewPager2, new d.a(16908358, null), null, this.f5240c);
                return;
            }
            boolean d10 = ViewPager2.this.d();
            int i11 = d10 ? 16908360 : 16908361;
            if (d10) {
                i10 = 16908361;
            }
            if (ViewPager2.this.f5231x < e10 - 1) {
                y.k0(viewPager2, new d.a(i11, null), null, this.f5239b);
            }
            if (ViewPager2.this.f5231x <= 0) {
                return;
            }
            y.k0(viewPager2, new d.a(i10, null), null, this.f5240c);
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(View view, float f10);
    }

    /* loaded from: classes.dex */
    public class l extends androidx.recyclerview.widget.j {
        l() {
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.n
        public View g(RecyclerView.o oVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.g(oVar);
        }
    }

    /* loaded from: classes.dex */
    public class m extends RecyclerView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context) {
            super(context);
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f5229i4.d() ? ViewPager2.this.f5229i4.n() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f5231x);
            accessibilityEvent.setToIndex(ViewPager2.this.f5231x);
            ViewPager2.this.f5229i4.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: c */
        int f5248c;

        /* renamed from: d */
        int f5249d;

        /* renamed from: q */
        Parcelable f5250q;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<n> {
            a() {
            }

            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            /* renamed from: b */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new n(parcel, classLoader) : new n(parcel);
            }

            /* renamed from: c */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        n(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f5248c = parcel.readInt();
            this.f5249d = parcel.readInt();
            this.f5250q = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5248c);
            parcel.writeInt(this.f5249d);
            parcel.writeParcelable(this.f5250q, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class o implements Runnable {

        /* renamed from: c */
        private final int f5251c;

        /* renamed from: d */
        private final RecyclerView f5252d;

        o(int i10, RecyclerView recyclerView) {
            this.f5251c = i10;
            this.f5252d = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5252d.p1(this.f5251c);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    private RecyclerView.q a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f5229i4 = f5218j4 ? new j() : new f();
        m mVar = new m(context);
        this.Y3 = mVar;
        mVar.setId(y.k());
        this.Y3.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.V3 = hVar;
        this.Y3.setLayoutManager(hVar);
        this.Y3.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.Y3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.Y3.j(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f5219a4 = eVar;
        this.f5222c4 = new androidx.viewpager2.widget.c(this, eVar, this.Y3);
        l lVar = new l();
        this.Z3 = lVar;
        lVar.b(this.Y3);
        this.Y3.l(this.f5219a4);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f5220b4 = bVar;
        this.f5219a4.o(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f5220b4.d(bVar2);
        this.f5220b4.d(cVar);
        this.f5229i4.h(this.f5220b4, this.Y3);
        this.f5220b4.d(this.f5230q);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.V3);
        this.f5224d4 = dVar;
        this.f5220b4.d(dVar);
        RecyclerView recyclerView = this.Y3;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.t(this.U3);
        }
    }

    private void i() {
        RecyclerView.g adapter;
        if (this.W3 == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.X3;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                ((androidx.viewpager2.adapter.b) adapter).b(parcelable);
            }
            this.X3 = null;
        }
        int max = Math.max(0, Math.min(this.W3, adapter.e() - 1));
        this.f5231x = max;
        this.W3 = -1;
        this.Y3.h1(max);
        this.f5229i4.m();
    }

    private void l(Context context, AttributeSet attributeSet) {
        int[] iArr = t1.a.f21802g;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(t1.a.f21803h, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.v(this.U3);
        }
    }

    public boolean c() {
        return this.f5222c4.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.Y3.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.Y3.canScrollVertically(i10);
    }

    public boolean d() {
        return this.V3.Z() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i10 = ((n) parcelable).f5248c;
            sparseArray.put(this.Y3.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f5227g4;
    }

    public void g(i iVar) {
        this.f5230q.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f5229i4.a() ? this.f5229i4.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.g getAdapter() {
        return this.Y3.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5231x;
    }

    public int getItemDecorationCount() {
        return this.Y3.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f5228h4;
    }

    public int getOrientation() {
        return this.V3.p2();
    }

    int getPageSize() {
        int i10;
        int i11;
        RecyclerView recyclerView = this.Y3;
        if (getOrientation() == 0) {
            i10 = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i11 = recyclerView.getPaddingRight();
        } else {
            i10 = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i11 = recyclerView.getPaddingBottom();
        }
        return i10 - i11;
    }

    public int getScrollState() {
        return this.f5219a4.h();
    }

    public void h() {
        if (this.f5224d4.d() == null) {
            return;
        }
        double g10 = this.f5219a4.g();
        int i10 = (int) g10;
        float f10 = (float) (g10 - i10);
        this.f5224d4.b(i10, f10, Math.round(getPageSize() * f10));
    }

    public void j(int i10, boolean z10) {
        if (!c()) {
            k(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    void k(int i10, boolean z10) {
        RecyclerView.g adapter = getAdapter();
        if (adapter == null) {
            if (this.W3 == -1) {
                return;
            }
            this.W3 = Math.max(i10, 0);
        } else if (adapter.e() <= 0) {
        } else {
            int min = Math.min(Math.max(i10, 0), adapter.e() - 1);
            if (min == this.f5231x && this.f5219a4.j()) {
                return;
            }
            int i11 = this.f5231x;
            if (min == i11 && z10) {
                return;
            }
            double d10 = i11;
            this.f5231x = min;
            this.f5229i4.q();
            if (!this.f5219a4.j()) {
                d10 = this.f5219a4.g();
            }
            this.f5219a4.m(min, z10);
            if (!z10) {
                this.Y3.h1(min);
                return;
            }
            double d11 = min;
            if (Math.abs(d11 - d10) <= 3.0d) {
                this.Y3.p1(min);
                return;
            }
            this.Y3.h1(d11 > d10 ? min - 3 : min + 3);
            RecyclerView recyclerView = this.Y3;
            recyclerView.post(new o(min, recyclerView));
        }
    }

    public void n(i iVar) {
        this.f5230q.e(iVar);
    }

    void o() {
        androidx.recyclerview.widget.j jVar = this.Z3;
        if (jVar != null) {
            View g10 = jVar.g(this.V3);
            if (g10 == null) {
                return;
            }
            int h02 = this.V3.h0(g10);
            if (h02 != this.f5231x && getScrollState() == 0) {
                this.f5220b4.c(h02);
            }
            this.f5232y = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f5229i4.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.Y3.getMeasuredWidth();
        int measuredHeight = this.Y3.getMeasuredHeight();
        this.f5221c.left = getPaddingLeft();
        this.f5221c.right = (i12 - i10) - getPaddingRight();
        this.f5221c.top = getPaddingTop();
        this.f5221c.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f5221c, this.f5223d);
        RecyclerView recyclerView = this.Y3;
        Rect rect = this.f5223d;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f5232y) {
            o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChild(this.Y3, i10, i11);
        int measuredWidth = this.Y3.getMeasuredWidth();
        int measuredHeight = this.Y3.getMeasuredHeight();
        int measuredState = this.Y3.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.W3 = nVar.f5249d;
        this.X3 = nVar.f5250q;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f5248c = this.Y3.getId();
        int i10 = this.W3;
        if (i10 == -1) {
            i10 = this.f5231x;
        }
        nVar.f5249d = i10;
        Parcelable parcelable = this.X3;
        if (parcelable == null) {
            RecyclerView.g adapter = this.Y3.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                parcelable = ((androidx.viewpager2.adapter.b) adapter).a();
            }
            return nVar;
        }
        nVar.f5250q = parcelable;
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f5229i4.c(i10, bundle) ? this.f5229i4.l(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.g gVar) {
        RecyclerView.g adapter = this.Y3.getAdapter();
        this.f5229i4.f(adapter);
        m(adapter);
        this.Y3.setAdapter(gVar);
        this.f5231x = 0;
        i();
        this.f5229i4.e(gVar);
        f(gVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f5229i4.p();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 >= 1 || i10 == -1) {
            this.f5228h4 = i10;
            this.Y3.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i10) {
        this.V3.C2(i10);
        this.f5229i4.r();
    }

    public void setPageTransformer(k kVar) {
        boolean z10 = this.f5226f4;
        if (kVar != null) {
            if (!z10) {
                this.f5225e4 = this.Y3.getItemAnimator();
                this.f5226f4 = true;
            }
            this.Y3.setItemAnimator(null);
        } else if (z10) {
            this.Y3.setItemAnimator(this.f5225e4);
            this.f5225e4 = null;
            this.f5226f4 = false;
        }
        if (kVar == this.f5224d4.d()) {
            return;
        }
        this.f5224d4.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f5227g4 = z10;
        this.f5229i4.s();
    }
}
