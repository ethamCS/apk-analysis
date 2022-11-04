package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.y;
import b5.k;
import b5.l;
import c5.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: v4 */
    private static final int f7217v4 = k.f5503v;

    /* renamed from: w4 */
    static final Property<View, Float> f7218w4 = new b(Float.class, "width");

    /* renamed from: x4 */
    static final Property<View, Float> f7219x4 = new c(Float.class, "height");

    /* renamed from: y4 */
    static final Property<View, Float> f7220y4 = new d(Float.class, "paddingStart");

    /* renamed from: z4 */
    static final Property<View, Float> f7221z4 = new e(Float.class, "paddingEnd");

    /* renamed from: i4 */
    private int f7222i4;

    /* renamed from: j4 */
    private final com.google.android.material.floatingactionbutton.c f7223j4;

    /* renamed from: k4 */
    private final com.google.android.material.floatingactionbutton.c f7224k4;

    /* renamed from: l4 */
    private final com.google.android.material.floatingactionbutton.c f7225l4;

    /* renamed from: m4 */
    private final com.google.android.material.floatingactionbutton.c f7226m4;

    /* renamed from: n4 */
    private final int f7227n4;

    /* renamed from: o4 */
    private int f7228o4;

    /* renamed from: p4 */
    private int f7229p4;

    /* renamed from: q4 */
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f7230q4;

    /* renamed from: r4 */
    private boolean f7231r4;

    /* renamed from: s4 */
    private boolean f7232s4;

    /* renamed from: t4 */
    private boolean f7233t4;

    /* renamed from: u4 */
    protected ColorStateList f7234u4;

    /* loaded from: classes.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a */
        private Rect f7235a;

        /* renamed from: b */
        private boolean f7236b;

        /* renamed from: c */
        private boolean f7237c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f7236b = false;
            this.f7237c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.D1);
            this.f7236b = obtainStyledAttributes.getBoolean(l.E1, false);
            this.f7237c = obtainStyledAttributes.getBoolean(l.F1, true);
            obtainStyledAttributes.recycle();
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f7236b || this.f7237c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f7235a == null) {
                this.f7235a = new Rect();
            }
            Rect rect = this.f7235a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.p(this.f7237c ? extendedFloatingActionButton.f7224k4 : extendedFloatingActionButton.f7225l4, null);
        }

        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!G(view)) {
                return false;
            } else {
                M(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> r10 = coordinatorLayout.r(extendedFloatingActionButton);
            int size = r10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = r10.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i10);
            return true;
        }

        protected void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.p(this.f7237c ? extendedFloatingActionButton.f7223j4 : extendedFloatingActionButton.f7226m4, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f3325h == 0) {
                fVar.f3325h = 80;
            }
        }
    }

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f7238a;

        /* renamed from: b */
        final /* synthetic */ com.google.android.material.floatingactionbutton.c f7239b;

        a(com.google.android.material.floatingactionbutton.c cVar, f fVar) {
            ExtendedFloatingActionButton.this = r1;
            this.f7239b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7238a = true;
            this.f7239b.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7239b.a();
            if (!this.f7238a) {
                this.f7239b.g(null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f7239b.onAnimationStart(animator);
            this.f7238a = false;
        }
    }

    /* loaded from: classes.dex */
    class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(y.G(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            y.B0(view, f10.intValue(), view.getPaddingTop(), y.F(view), view.getPaddingBottom());
        }
    }

    /* loaded from: classes.dex */
    class e extends Property<View, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(y.F(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            y.B0(view, y.G(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
    }

    private boolean o() {
        return getVisibility() != 0 ? this.f7222i4 == 2 : this.f7222i4 != 1;
    }

    public void p(com.google.android.material.floatingactionbutton.c cVar, f fVar) {
        if (cVar.i()) {
            return;
        }
        if (!r()) {
            cVar.c();
            cVar.g(fVar);
            return;
        }
        measure(0, 0);
        AnimatorSet e10 = cVar.e();
        e10.addListener(new a(cVar, fVar));
        for (Animator.AnimatorListener animatorListener : cVar.f()) {
            e10.addListener(animatorListener);
        }
        e10.start();
    }

    private void q() {
        this.f7234u4 = getTextColors();
    }

    private boolean r() {
        return (y.S(this) || (!o() && this.f7233t4)) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f7230q4;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i10 = this.f7227n4;
        return i10 < 0 ? (Math.min(y.G(this), y.F(this)) * 2) + getIconSize() : i10;
    }

    public h getExtendMotionSpec() {
        return this.f7224k4.d();
    }

    public h getHideMotionSpec() {
        return this.f7226m4.d();
    }

    public h getShowMotionSpec() {
        return this.f7225l4.d();
    }

    public h getShrinkMotionSpec() {
        return this.f7223j4.d();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f7231r4 || !TextUtils.isEmpty(getText()) || getIcon() == null) {
            return;
        }
        this.f7231r4 = false;
        this.f7223j4.c();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f7233t4 = z10;
    }

    public void setExtendMotionSpec(h hVar) {
        this.f7224k4.h(hVar);
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(h.c(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.f7231r4 == z10) {
            return;
        }
        com.google.android.material.floatingactionbutton.c cVar = z10 ? this.f7224k4 : this.f7223j4;
        if (cVar.i()) {
            return;
        }
        cVar.c();
    }

    public void setHideMotionSpec(h hVar) {
        this.f7226m4.h(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.f7231r4 || this.f7232s4) {
            return;
        }
        this.f7228o4 = y.G(this);
        this.f7229p4 = y.F(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.f7231r4 || this.f7232s4) {
            return;
        }
        this.f7228o4 = i10;
        this.f7229p4 = i12;
    }

    public void setShowMotionSpec(h hVar) {
        this.f7225l4.h(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.f7223j4.h(hVar);
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        q();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        q();
    }
}
