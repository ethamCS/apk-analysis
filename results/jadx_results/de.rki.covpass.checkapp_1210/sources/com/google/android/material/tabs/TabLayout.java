package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d1;
import androidx.core.view.accessibility.d;
import androidx.core.view.w;
import androidx.core.view.y;
import androidx.viewpager.widget.b;
import b5.j;
import b5.k;
import com.google.android.material.internal.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
@b.c
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int E4 = k.f5491j;
    private static final androidx.core.util.e<f> F4 = new androidx.core.util.g(16);
    private g A4;
    private b B4;
    private boolean C4;
    private final androidx.core.util.e<h> D4;
    int U3;
    int V3;
    int W3;
    ColorStateList X3;
    ColorStateList Y3;
    ColorStateList Z3;

    /* renamed from: a4 */
    Drawable f7491a4;

    /* renamed from: b4 */
    private int f7492b4;

    /* renamed from: c */
    private final ArrayList<f> f7493c;

    /* renamed from: c4 */
    PorterDuff.Mode f7494c4;

    /* renamed from: d */
    private f f7495d;

    /* renamed from: d4 */
    float f7496d4;

    /* renamed from: e4 */
    float f7497e4;

    /* renamed from: f4 */
    final int f7498f4;

    /* renamed from: g4 */
    int f7499g4;

    /* renamed from: h4 */
    private final int f7500h4;

    /* renamed from: i4 */
    private final int f7501i4;

    /* renamed from: j4 */
    private final int f7502j4;

    /* renamed from: k4 */
    private int f7503k4;

    /* renamed from: l4 */
    int f7504l4;

    /* renamed from: m4 */
    int f7505m4;

    /* renamed from: n4 */
    int f7506n4;

    /* renamed from: o4 */
    int f7507o4;

    /* renamed from: p4 */
    boolean f7508p4;

    /* renamed from: q */
    final e f7509q;

    /* renamed from: q4 */
    boolean f7510q4;

    /* renamed from: r4 */
    int f7511r4;

    /* renamed from: s4 */
    int f7512s4;

    /* renamed from: t4 */
    boolean f7513t4;

    /* renamed from: u4 */
    private com.google.android.material.tabs.c f7514u4;

    /* renamed from: v4 */
    private c f7515v4;

    /* renamed from: w4 */
    private final ArrayList<c> f7516w4;

    /* renamed from: x */
    int f7517x;

    /* renamed from: x4 */
    private c f7518x4;

    /* renamed from: y */
    int f7519y;

    /* renamed from: y4 */
    private ValueAnimator f7520y4;

    /* renamed from: z4 */
    androidx.viewpager.widget.b f7521z4;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
            TabLayout.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.f {

        /* renamed from: a */
        private boolean f7523a;

        b() {
            TabLayout.this = r1;
        }

        @Override // androidx.viewpager.widget.b.f
        public void a(androidx.viewpager.widget.b bVar, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f7521z4 == bVar) {
                tabLayout.I(aVar2, this.f7523a);
            }
        }

        void b(boolean z10) {
            this.f7523a = z10;
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c<T extends f> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    /* loaded from: classes.dex */
    public interface d extends c<f> {
    }

    /* loaded from: classes.dex */
    public class e extends LinearLayout {

        /* renamed from: c */
        ValueAnimator f7525c;

        /* renamed from: q */
        float f7527q;

        /* renamed from: d */
        int f7526d = -1;

        /* renamed from: x */
        private int f7528x = -1;

        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View f7530a;

            /* renamed from: b */
            final /* synthetic */ View f7531b;

            a(View view, View view2) {
                e.this = r1;
                this.f7530a = view;
                this.f7531b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                e.this.h(this.f7530a, this.f7531b, valueAnimator.getAnimatedFraction());
            }
        }

        /* loaded from: classes.dex */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f7533a;

            b(int i10) {
                e.this = r1;
                this.f7533a = i10;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                e.this.f7526d = this.f7533a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                e.this.f7526d = this.f7533a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(context);
            TabLayout.this = r1;
            setWillNotDraw(false);
        }

        public void e() {
            View childAt = getChildAt(this.f7526d);
            com.google.android.material.tabs.c cVar = TabLayout.this.f7514u4;
            TabLayout tabLayout = TabLayout.this;
            cVar.c(tabLayout, childAt, tabLayout.f7491a4);
        }

        public void h(View view, View view2, float f10) {
            if (view != null && view.getWidth() > 0) {
                com.google.android.material.tabs.c cVar = TabLayout.this.f7514u4;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.f7491a4);
            } else {
                Drawable drawable = TabLayout.this.f7491a4;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f7491a4.getBounds().bottom);
            }
            y.f0(this);
        }

        private void i(boolean z10, int i10, int i11) {
            View childAt = getChildAt(this.f7526d);
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                e();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f7525c.removeAllUpdateListeners();
                this.f7525c.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f7525c = valueAnimator;
            valueAnimator.setInterpolator(c5.a.f6268b);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i10));
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f7525c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f7525c.cancel();
            }
            i(true, i10, i11);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void draw(android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f7491a4
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.height()
                if (r0 >= 0) goto L16
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f7491a4
                int r0 = r0.getIntrinsicHeight()
            L16:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                int r1 = r1.f7506n4
                r2 = 0
                if (r1 == 0) goto L37
                r3 = 1
                r4 = 2
                if (r1 == r3) goto L28
                if (r1 == r4) goto L41
                r0 = 3
                if (r1 == r0) goto L3d
                r0 = r2
                goto L41
            L28:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r2 = r1 / 2
                int r1 = r5.getHeight()
                int r1 = r1 + r0
                int r0 = r1 / 2
                goto L41
            L37:
                int r1 = r5.getHeight()
                int r2 = r1 - r0
            L3d:
                int r0 = r5.getHeight()
            L41:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f7491a4
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.width()
                if (r1 <= 0) goto L81
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f7491a4
                android.graphics.Rect r1 = r1.getBounds()
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r3 = r3.f7491a4
                int r4 = r1.left
                int r1 = r1.right
                r3.setBounds(r4, r2, r1, r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r0.f7491a4
                int r0 = com.google.android.material.tabs.TabLayout.b(r0)
                if (r0 == 0) goto L7a
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.a.r(r1)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = com.google.android.material.tabs.TabLayout.b(r0)
                androidx.core.graphics.drawable.a.n(r1, r0)
                goto L7e
            L7a:
                r0 = 0
                androidx.core.graphics.drawable.a.o(r1, r0)
            L7e:
                r1.draw(r6)
            L81:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e.draw(android.graphics.Canvas):void");
        }

        void f(int i10, float f10) {
            ValueAnimator valueAnimator = this.f7525c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f7525c.cancel();
            }
            this.f7526d = i10;
            this.f7527q = f10;
            h(getChildAt(i10), getChildAt(this.f7526d + 1), this.f7527q);
        }

        void g(int i10) {
            Rect bounds = TabLayout.this.f7491a4.getBounds();
            TabLayout.this.f7491a4.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f7525c;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                i(false, this.f7526d, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.f7504l4 != 1 && tabLayout.f7507o4 != 2) {
                return;
            }
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0) {
                    i12 = Math.max(i12, childAt.getMeasuredWidth());
                }
            }
            if (i12 <= 0) {
                return;
            }
            if (i12 * childCount <= getMeasuredWidth() - (((int) o.b(getContext(), 16)) * 2)) {
                boolean z11 = false;
                for (int i14 = 0; i14 < childCount; i14++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                    if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i12;
                        layoutParams.weight = 0.0f;
                        z11 = true;
                    }
                }
                z10 = z11;
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                tabLayout2.f7504l4 = 0;
                tabLayout2.P(false);
            }
            if (!z10) {
                return;
            }
            super.onMeasure(i10, i11);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private Object f7535a;

        /* renamed from: b */
        private Drawable f7536b;

        /* renamed from: c */
        private CharSequence f7537c;

        /* renamed from: d */
        private CharSequence f7538d;

        /* renamed from: f */
        private View f7540f;

        /* renamed from: h */
        public TabLayout f7542h;

        /* renamed from: i */
        public h f7543i;

        /* renamed from: e */
        private int f7539e = -1;

        /* renamed from: g */
        private int f7541g = 1;

        /* renamed from: j */
        private int f7544j = -1;

        public View e() {
            return this.f7540f;
        }

        public Drawable f() {
            return this.f7536b;
        }

        public int g() {
            return this.f7539e;
        }

        public int h() {
            return this.f7541g;
        }

        public CharSequence i() {
            return this.f7537c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f7542h;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                return selectedTabPosition != -1 && selectedTabPosition == this.f7539e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        void k() {
            this.f7542h = null;
            this.f7543i = null;
            this.f7535a = null;
            this.f7536b = null;
            this.f7544j = -1;
            this.f7537c = null;
            this.f7538d = null;
            this.f7539e = -1;
            this.f7540f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f7542h;
            if (tabLayout != null) {
                tabLayout.G(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public f m(CharSequence charSequence) {
            this.f7538d = charSequence;
            s();
            return this;
        }

        public f n(int i10) {
            return o(LayoutInflater.from(this.f7543i.getContext()).inflate(i10, (ViewGroup) this.f7543i, false));
        }

        public f o(View view) {
            this.f7540f = view;
            s();
            return this;
        }

        public f p(Drawable drawable) {
            this.f7536b = drawable;
            TabLayout tabLayout = this.f7542h;
            if (tabLayout.f7504l4 == 1 || tabLayout.f7507o4 == 2) {
                tabLayout.P(true);
            }
            s();
            if (d5.c.f8366a && this.f7543i.l() && this.f7543i.f7552y.isVisible()) {
                this.f7543i.invalidate();
            }
            return this;
        }

        void q(int i10) {
            this.f7539e = i10;
        }

        public f r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f7538d) && !TextUtils.isEmpty(charSequence)) {
                this.f7543i.setContentDescription(charSequence);
            }
            this.f7537c = charSequence;
            s();
            return this;
        }

        void s() {
            h hVar = this.f7543i;
            if (hVar != null) {
                hVar.t();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g implements b.g {

        /* renamed from: a */
        private final WeakReference<TabLayout> f7545a;

        /* renamed from: b */
        private int f7546b;

        /* renamed from: c */
        private int f7547c;

        public g(TabLayout tabLayout) {
            this.f7545a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.b.g
        public void a(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f7545a.get();
            if (tabLayout != null) {
                int i12 = this.f7547c;
                boolean z10 = false;
                boolean z11 = i12 != 2 || this.f7546b == 1;
                if (i12 != 2 || this.f7546b != 0) {
                    z10 = true;
                }
                tabLayout.K(i10, f10, z11, z10);
            }
        }

        @Override // androidx.viewpager.widget.b.g
        public void b(int i10) {
            this.f7546b = this.f7547c;
            this.f7547c = i10;
        }

        @Override // androidx.viewpager.widget.b.g
        public void c(int i10) {
            TabLayout tabLayout = this.f7545a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f7547c;
            tabLayout.H(tabLayout.x(i10), i11 == 0 || (i11 == 2 && this.f7546b == 0));
        }

        void d() {
            this.f7547c = 0;
            this.f7546b = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class h extends LinearLayout {
        private View U3;
        private TextView V3;
        private ImageView W3;
        private Drawable X3;
        private int Y3 = 2;

        /* renamed from: c */
        private f f7548c;

        /* renamed from: d */
        private TextView f7549d;

        /* renamed from: q */
        private ImageView f7550q;

        /* renamed from: x */
        private View f7551x;

        /* renamed from: y */
        private d5.a f7552y;

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            final /* synthetic */ View f7553a;

            a(View view) {
                h.this = r1;
                this.f7553a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f7553a.getVisibility() == 0) {
                    h.this.s(this.f7553a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(context);
            TabLayout.this = r4;
            u(context);
            y.B0(this, r4.f7517x, r4.f7519y, r4.U3, r4.V3);
            setGravity(17);
            setOrientation(!r4.f7508p4 ? 1 : 0);
            setClickable(true);
            y.C0(this, w.b(getContext(), 1002));
        }

        private void f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float g(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private d5.a getBadge() {
            return this.f7552y;
        }

        private d5.a getOrCreateBadge() {
            if (this.f7552y == null) {
                this.f7552y = d5.a.c(getContext());
            }
            r();
            d5.a aVar = this.f7552y;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void h(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        private FrameLayout i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        public void j(Canvas canvas) {
            Drawable drawable = this.X3;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.X3.draw(canvas);
            }
        }

        private FrameLayout k(View view) {
            if ((view == this.f7550q || view == this.f7549d) && d5.c.f8366a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public boolean l() {
            return this.f7552y != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m() {
            FrameLayout frameLayout;
            if (d5.c.f8366a) {
                frameLayout = i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(b5.h.a_res_0x7f0c002f, (ViewGroup) frameLayout, false);
            this.f7550q = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void n() {
            FrameLayout frameLayout;
            if (d5.c.f8366a) {
                frameLayout = i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(b5.h.b_res_0x7f0c0030, (ViewGroup) frameLayout, false);
            this.f7549d = textView;
            frameLayout.addView(textView);
        }

        private void p(View view) {
            if (l() && view != null) {
                h(false);
                d5.c.a(this.f7552y, view, k(view));
                this.f7551x = view;
            }
        }

        private void q() {
            if (!l()) {
                return;
            }
            h(true);
            View view = this.f7551x;
            if (view == null) {
                return;
            }
            d5.c.b(this.f7552y, view);
            this.f7551x = null;
        }

        private void r() {
            f fVar;
            View view;
            View view2;
            f fVar2;
            if (!l()) {
                return;
            }
            if (this.U3 == null) {
                if (this.f7550q != null && (fVar2 = this.f7548c) != null && fVar2.f() != null) {
                    View view3 = this.f7551x;
                    view = this.f7550q;
                    if (view3 != view) {
                        q();
                        view2 = this.f7550q;
                        p(view2);
                        return;
                    }
                    s(view);
                    return;
                } else if (this.f7549d != null && (fVar = this.f7548c) != null && fVar.h() == 1) {
                    View view4 = this.f7551x;
                    view = this.f7549d;
                    if (view4 != view) {
                        q();
                        view2 = this.f7549d;
                        p(view2);
                        return;
                    }
                    s(view);
                    return;
                }
            }
            q();
        }

        public void s(View view) {
            if (!l() || view != this.f7551x) {
                return;
            }
            d5.c.c(this.f7552y, view, k(view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public void u(Context context) {
            int i10 = TabLayout.this.f7498f4;
            GradientDrawable gradientDrawable = null;
            if (i10 != 0) {
                Drawable b10 = g.a.b(context, i10);
                this.X3 = b10;
                if (b10 != null && b10.isStateful()) {
                    this.X3.setState(getDrawableState());
                }
            } else {
                this.X3 = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.Z3 != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a10 = r5.b.a(TabLayout.this.Z3);
                boolean z10 = TabLayout.this.f7513t4;
                if (z10) {
                    gradientDrawable2 = null;
                }
                if (!z10) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(a10, gradientDrawable2, gradientDrawable);
            }
            y.s0(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        private void w(TextView textView, ImageView imageView) {
            f fVar = this.f7548c;
            CharSequence charSequence = null;
            Drawable mutate = (fVar == null || fVar.f() == null) ? null : androidx.core.graphics.drawable.a.r(this.f7548c.f()).mutate();
            if (mutate != null) {
                androidx.core.graphics.drawable.a.o(mutate, TabLayout.this.Y3);
                PorterDuff.Mode mode = TabLayout.this.f7494c4;
                if (mode != null) {
                    androidx.core.graphics.drawable.a.p(mutate, mode);
                }
            }
            f fVar2 = this.f7548c;
            CharSequence i10 = fVar2 != null ? fVar2.i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(i10);
            if (textView != null) {
                if (z10) {
                    textView.setText(i10);
                    if (this.f7548c.f7541g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int b10 = (!z10 || imageView.getVisibility() != 0) ? 0 : (int) o.b(getContext(), 8);
                if (TabLayout.this.f7508p4) {
                    if (b10 != androidx.core.view.h.a(marginLayoutParams)) {
                        androidx.core.view.h.c(marginLayoutParams, b10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (b10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b10;
                    androidx.core.view.h.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.f7548c;
            if (fVar3 != null) {
                charSequence = fVar3.f7538d;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z10) {
                    i10 = charSequence;
                }
                d1.a(this, i10);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.X3;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.X3.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f7549d, this.f7550q, this.U3};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f7549d, this.f7550q, this.U3};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public f getTab() {
            return this.f7548c;
        }

        void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            d5.a aVar = this.f7552y;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f7552y.f()));
            }
            androidx.core.view.accessibility.d y02 = androidx.core.view.accessibility.d.y0(accessibilityNodeInfo);
            y02.a0(d.c.a(0, 1, this.f7548c.g(), 1, false, isSelected()));
            if (isSelected()) {
                y02.Y(false);
                y02.P(d.a.f3618i);
            }
            y02.o0(getResources().getString(j.h_res_0x7f100126));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f7499g4, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f7549d != null) {
                float f10 = TabLayout.this.f7496d4;
                int i12 = this.Y3;
                ImageView imageView = this.f7550q;
                boolean z10 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f7549d;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f7497e4;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f7549d.getTextSize();
                int lineCount = this.f7549d.getLineCount();
                int d10 = androidx.core.widget.j.d(this.f7549d);
                int i13 = (f10 > textSize ? 1 : (f10 == textSize ? 0 : -1));
                if (i13 == 0 && (d10 < 0 || i12 == d10)) {
                    return;
                }
                if (TabLayout.this.f7507o4 == 1 && i13 > 0 && lineCount == 1 && ((layout = this.f7549d.getLayout()) == null || g(layout, 0, f10) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    z10 = false;
                }
                if (!z10) {
                    return;
                }
                this.f7549d.setTextSize(0, f10);
                this.f7549d.setMaxLines(i12);
                super.onMeasure(i10, i11);
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f7548c != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f7548c.l();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f7549d;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f7550q;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.U3;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(f fVar) {
            if (fVar != this.f7548c) {
                this.f7548c = fVar;
                t();
            }
        }

        final void t() {
            f fVar = this.f7548c;
            ImageView imageView = null;
            View e10 = fVar != null ? fVar.e() : null;
            if (e10 != null) {
                ViewParent parent = e10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(e10);
                    }
                    addView(e10);
                }
                this.U3 = e10;
                TextView textView = this.f7549d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView2 = this.f7550q;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f7550q.setImageDrawable(null);
                }
                TextView textView2 = (TextView) e10.findViewById(16908308);
                this.V3 = textView2;
                if (textView2 != null) {
                    this.Y3 = androidx.core.widget.j.d(textView2);
                }
                imageView = (ImageView) e10.findViewById(16908294);
            } else {
                View view = this.U3;
                if (view != null) {
                    removeView(view);
                    this.U3 = null;
                }
                this.V3 = null;
            }
            this.W3 = imageView;
            if (this.U3 == null) {
                if (this.f7550q == null) {
                    m();
                }
                if (this.f7549d == null) {
                    n();
                    this.Y3 = androidx.core.widget.j.d(this.f7549d);
                }
                androidx.core.widget.j.o(this.f7549d, TabLayout.this.W3);
                ColorStateList colorStateList = TabLayout.this.X3;
                if (colorStateList != null) {
                    this.f7549d.setTextColor(colorStateList);
                }
                w(this.f7549d, this.f7550q);
                r();
                f(this.f7550q);
                f(this.f7549d);
            } else {
                TextView textView3 = this.V3;
                if (textView3 != null || this.W3 != null) {
                    w(textView3, this.W3);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f7538d)) {
                setContentDescription(fVar.f7538d);
            }
            setSelected(fVar != null && fVar.j());
        }

        final void v() {
            ImageView imageView;
            setOrientation(!TabLayout.this.f7508p4 ? 1 : 0);
            TextView textView = this.V3;
            if (textView == null && this.W3 == null) {
                textView = this.f7549d;
                imageView = this.f7550q;
            } else {
                imageView = this.W3;
            }
            w(textView, imageView);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements d {

        /* renamed from: a */
        private final androidx.viewpager.widget.b f7555a;

        public i(androidx.viewpager.widget.b bVar) {
            this.f7555a = bVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(f fVar) {
            this.f7555a.setCurrentItem(fVar.g());
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b5.b.K_res_0x7f0303c0);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void F(int i10) {
        h hVar = (h) this.f7509q.getChildAt(i10);
        this.f7509q.removeViewAt(i10);
        if (hVar != null) {
            hVar.o();
            this.D4.a(hVar);
        }
        requestLayout();
    }

    private void M(androidx.viewpager.widget.b bVar, boolean z10, boolean z11) {
        androidx.viewpager.widget.b bVar2 = this.f7521z4;
        if (bVar2 != null) {
            g gVar = this.A4;
            if (gVar != null) {
                bVar2.C(gVar);
            }
            b bVar3 = this.B4;
            if (bVar3 != null) {
                this.f7521z4.B(bVar3);
            }
        }
        c cVar = this.f7518x4;
        if (cVar != null) {
            E(cVar);
            this.f7518x4 = null;
        }
        if (bVar != null) {
            this.f7521z4 = bVar;
            if (this.A4 == null) {
                this.A4 = new g(this);
            }
            this.A4.d();
            bVar.b(this.A4);
            i iVar = new i(bVar);
            this.f7518x4 = iVar;
            c(iVar);
            bVar.getAdapter();
            if (this.B4 == null) {
                this.B4 = new b();
            }
            this.B4.b(z10);
            bVar.a(this.B4);
            J(bVar.getCurrentItem(), 0.0f, true);
        } else {
            this.f7521z4 = null;
            I(null, false);
        }
        this.C4 = z11;
    }

    private void N() {
        int size = this.f7493c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7493c.get(i10).s();
        }
    }

    private void O(LinearLayout.LayoutParams layoutParams) {
        float f10;
        if (this.f7507o4 == 1 && this.f7504l4 == 0) {
            layoutParams.width = 0;
            f10 = 1.0f;
        } else {
            layoutParams.width = -2;
            f10 = 0.0f;
        }
        layoutParams.weight = f10;
    }

    private int getDefaultHeight() {
        int size = this.f7493c.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                f fVar = this.f7493c.get(i10);
                if (fVar != null && fVar.f() != null && !TextUtils.isEmpty(fVar.i())) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return (!z10 || this.f7508p4) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.f7500h4;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f7507o4;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        return this.f7502j4;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f7509q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h(TabItem tabItem) {
        f A = A();
        CharSequence charSequence = tabItem.f7488c;
        if (charSequence != null) {
            A.r(charSequence);
        }
        Drawable drawable = tabItem.f7489d;
        if (drawable != null) {
            A.p(drawable);
        }
        int i10 = tabItem.f7490q;
        if (i10 != 0) {
            A.n(i10);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            A.m(tabItem.getContentDescription());
        }
        e(A);
    }

    private void i(f fVar) {
        h hVar = fVar.f7543i;
        hVar.setSelected(false);
        hVar.setActivated(false);
        this.f7509q.addView(hVar, fVar.g(), q());
    }

    private void j(View view) {
        if (view instanceof TabItem) {
            h((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void k(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !y.S(this) || this.f7509q.d()) {
            J(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int n10 = n(i10, 0.0f);
        if (scrollX != n10) {
            w();
            this.f7520y4.setIntValues(scrollX, n10);
            this.f7520y4.start();
        }
        this.f7509q.c(i10, this.f7505m4);
    }

    private void l(int i10) {
        e eVar;
        int i11;
        if (i10 != 0) {
            i11 = 1;
            if (i10 == 1) {
                eVar = this.f7509q;
                eVar.setGravity(i11);
            } else if (i10 != 2) {
                return;
            }
        } else {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        eVar = this.f7509q;
        i11 = 8388611;
        eVar.setGravity(i11);
    }

    private void m() {
        int i10 = this.f7507o4;
        y.B0(this.f7509q, (i10 == 0 || i10 == 2) ? Math.max(0, this.f7503k4 - this.f7517x) : 0, 0, 0, 0);
        int i11 = this.f7507o4;
        if (i11 == 0) {
            l(this.f7504l4);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f7504l4 == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f7509q.setGravity(1);
        }
        P(true);
    }

    private int n(int i10, float f10) {
        View childAt;
        int i11 = this.f7507o4;
        int i12 = 0;
        if ((i11 == 0 || i11 == 2) && (childAt = this.f7509q.getChildAt(i10)) != null) {
            int i13 = i10 + 1;
            View childAt2 = i13 < this.f7509q.getChildCount() ? this.f7509q.getChildAt(i13) : null;
            int width = childAt.getWidth();
            if (childAt2 != null) {
                i12 = childAt2.getWidth();
            }
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i14 = (int) ((width + i12) * 0.5f * f10);
            return y.B(this) == 0 ? left + i14 : left - i14;
        }
        return 0;
    }

    private void o(f fVar, int i10) {
        fVar.q(i10);
        this.f7493c.add(i10, fVar);
        int size = this.f7493c.size();
        while (true) {
            i10++;
            if (i10 < size) {
                this.f7493c.get(i10).q(i10);
            } else {
                return;
            }
        }
    }

    private static ColorStateList p(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        O(layoutParams);
        return layoutParams;
    }

    private h s(f fVar) {
        androidx.core.util.e<h> eVar = this.D4;
        h b10 = eVar != null ? eVar.b() : null;
        if (b10 == null) {
            b10 = new h(getContext());
        }
        b10.setTab(fVar);
        b10.setFocusable(true);
        b10.setMinimumWidth(getTabMinWidth());
        b10.setContentDescription(TextUtils.isEmpty(fVar.f7538d) ? fVar.f7537c : fVar.f7538d);
        return b10;
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f7509q.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f7509q.getChildAt(i11);
                boolean z10 = true;
                childAt.setSelected(i11 == i10);
                if (i11 != i10) {
                    z10 = false;
                }
                childAt.setActivated(z10);
                i11++;
            }
        }
    }

    private void t(f fVar) {
        for (int size = this.f7516w4.size() - 1; size >= 0; size--) {
            this.f7516w4.get(size).a(fVar);
        }
    }

    private void u(f fVar) {
        for (int size = this.f7516w4.size() - 1; size >= 0; size--) {
            this.f7516w4.get(size).c(fVar);
        }
    }

    private void v(f fVar) {
        for (int size = this.f7516w4.size() - 1; size >= 0; size--) {
            this.f7516w4.get(size).b(fVar);
        }
    }

    private void w() {
        if (this.f7520y4 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f7520y4 = valueAnimator;
            valueAnimator.setInterpolator(c5.a.f6268b);
            this.f7520y4.setDuration(this.f7505m4);
            this.f7520y4.addUpdateListener(new a());
        }
    }

    private boolean y() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    public f A() {
        f r10 = r();
        r10.f7542h = this;
        r10.f7543i = s(r10);
        if (r10.f7544j != -1) {
            r10.f7543i.setId(r10.f7544j);
        }
        return r10;
    }

    void B() {
        D();
    }

    protected boolean C(f fVar) {
        return F4.a(fVar);
    }

    public void D() {
        for (int childCount = this.f7509q.getChildCount() - 1; childCount >= 0; childCount--) {
            F(childCount);
        }
        Iterator<f> it = this.f7493c.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.k();
            C(next);
        }
        this.f7495d = null;
    }

    @Deprecated
    public void E(c cVar) {
        this.f7516w4.remove(cVar);
    }

    public void G(f fVar) {
        H(fVar, true);
    }

    public void H(f fVar, boolean z10) {
        f fVar2 = this.f7495d;
        if (fVar2 == fVar) {
            if (fVar2 == null) {
                return;
            }
            t(fVar);
            k(fVar.g());
            return;
        }
        int g10 = fVar != null ? fVar.g() : -1;
        if (z10) {
            if ((fVar2 == null || fVar2.g() == -1) && g10 != -1) {
                J(g10, 0.0f, true);
            } else {
                k(g10);
            }
            if (g10 != -1) {
                setSelectedTabView(g10);
            }
        }
        this.f7495d = fVar;
        if (fVar2 != null) {
            v(fVar2);
        }
        if (fVar == null) {
            return;
        }
        u(fVar);
    }

    void I(androidx.viewpager.widget.a aVar, boolean z10) {
        B();
    }

    public void J(int i10, float f10, boolean z10) {
        K(i10, f10, z10, true);
    }

    public void K(int i10, float f10, boolean z10, boolean z11) {
        int round = Math.round(i10 + f10);
        if (round < 0 || round >= this.f7509q.getChildCount()) {
            return;
        }
        if (z11) {
            this.f7509q.f(i10, f10);
        }
        ValueAnimator valueAnimator = this.f7520y4;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7520y4.cancel();
        }
        scrollTo(i10 < 0 ? 0 : n(i10, f10), 0);
        if (!z10) {
            return;
        }
        setSelectedTabView(round);
    }

    public void L(androidx.viewpager.widget.b bVar, boolean z10) {
        M(bVar, z10, false);
    }

    void P(boolean z10) {
        for (int i10 = 0; i10 < this.f7509q.getChildCount(); i10++) {
            View childAt = this.f7509q.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            O((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    @Deprecated
    public void c(c cVar) {
        if (!this.f7516w4.contains(cVar)) {
            this.f7516w4.add(cVar);
        }
    }

    public void d(d dVar) {
        c(dVar);
    }

    public void e(f fVar) {
        g(fVar, this.f7493c.isEmpty());
    }

    public void f(f fVar, int i10, boolean z10) {
        if (fVar.f7542h == this) {
            o(fVar, i10);
            i(fVar);
            if (!z10) {
                return;
            }
            fVar.l();
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void g(f fVar, boolean z10) {
        f(fVar, this.f7493c.size(), z10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        f fVar = this.f7495d;
        if (fVar != null) {
            return fVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f7493c.size();
    }

    public int getTabGravity() {
        return this.f7504l4;
    }

    public ColorStateList getTabIconTint() {
        return this.Y3;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f7512s4;
    }

    public int getTabIndicatorGravity() {
        return this.f7506n4;
    }

    int getTabMaxWidth() {
        return this.f7499g4;
    }

    public int getTabMode() {
        return this.f7507o4;
    }

    public ColorStateList getTabRippleColor() {
        return this.Z3;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f7491a4;
    }

    public ColorStateList getTabTextColors() {
        return this.X3;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        t5.h.e(this);
        if (this.f7521z4 == null) {
            ViewParent parent = getParent();
            if (!(parent instanceof androidx.viewpager.widget.b)) {
                return;
            }
            M((androidx.viewpager.widget.b) parent, true, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.C4) {
            setupWithViewPager(null);
            this.C4 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f7509q.getChildCount(); i10++) {
            View childAt = this.f7509q.getChildAt(i10);
            if (childAt instanceof h) {
                ((h) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.d.y0(accessibilityNodeInfo).Z(d.b.a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return y() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r0 != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L26;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.o.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f7501i4
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.o.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f7499g4 = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f7507o4
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || y()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    protected f r() {
        f b10 = F4.b();
        return b10 == null ? new f() : b10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        t5.h.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f7508p4 != z10) {
            this.f7508p4 = z10;
            for (int i10 = 0; i10 < this.f7509q.getChildCount(); i10++) {
                View childAt = this.f7509q.getChildAt(i10);
                if (childAt instanceof h) {
                    ((h) childAt).v();
                }
            }
            m();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f7515v4;
        if (cVar2 != null) {
            E(cVar2);
        }
        this.f7515v4 = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        w();
        this.f7520y4.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i10) {
        setSelectedTabIndicator(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f7491a4 != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f7491a4 = drawable;
            int i10 = this.f7511r4;
            if (i10 == -1) {
                i10 = drawable.getIntrinsicHeight();
            }
            this.f7509q.g(i10);
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f7492b4 = i10;
        P(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f7506n4 != i10) {
            this.f7506n4 = i10;
            y.f0(this.f7509q);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f7511r4 = i10;
        this.f7509q.g(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f7504l4 != i10) {
            this.f7504l4 = i10;
            m();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.Y3 != colorStateList) {
            this.Y3 = colorStateList;
            N();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(g.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        com.google.android.material.tabs.c cVar;
        this.f7512s4 = i10;
        if (i10 == 0) {
            cVar = new com.google.android.material.tabs.c();
        } else if (i10 == 1) {
            cVar = new com.google.android.material.tabs.a();
        } else if (i10 != 2) {
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        } else {
            cVar = new com.google.android.material.tabs.b();
        }
        this.f7514u4 = cVar;
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f7510q4 = z10;
        this.f7509q.e();
        y.f0(this.f7509q);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f7507o4) {
            this.f7507o4 = i10;
            m();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.Z3 != colorStateList) {
            this.Z3 = colorStateList;
            for (int i10 = 0; i10 < this.f7509q.getChildCount(); i10++) {
                View childAt = this.f7509q.getChildAt(i10);
                if (childAt instanceof h) {
                    ((h) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(g.a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.X3 != colorStateList) {
            this.X3 = colorStateList;
            N();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        I(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f7513t4 != z10) {
            this.f7513t4 = z10;
            for (int i10 = 0; i10 < this.f7509q.getChildCount(); i10++) {
                View childAt = this.f7509q.getChildAt(i10);
                if (childAt instanceof h) {
                    ((h) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(androidx.viewpager.widget.b bVar) {
        L(bVar, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public f x(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f7493c.get(i10);
    }

    public boolean z() {
        return this.f7510q4;
    }
}
