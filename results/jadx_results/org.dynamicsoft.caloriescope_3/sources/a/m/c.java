package a.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends m {
    private static final String[] N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> O = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> P = new C0025c(PointF.class, "topLeft");
    private static final Property<k, PointF> Q = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> R = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> S = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> T = new g(PointF.class, "position");
    private static a.m.k U = new a.m.k();
    private int[] K = new int[2];
    private boolean L = false;
    private boolean M = false;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f327a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f328b;

        /* renamed from: c */
        final /* synthetic */ View f329c;
        final /* synthetic */ float d;

        a(c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f327a = viewGroup;
            this.f328b = bitmapDrawable;
            this.f329c = view;
            this.d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.b(this.f327a).a(this.f328b);
            c0.a(this.f329c, this.d);
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f330a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f330a);
            Rect rect = this.f330a;
            return new PointF(rect.left, rect.top);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f330a);
            this.f330a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f330a);
        }
    }

    /* renamed from: a.m.c$c */
    /* loaded from: classes.dex */
    static class C0025c extends Property<k, PointF> {
        C0025c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(k kVar, PointF pointF) {
            kVar.b(pointF);
        }
    }

    /* loaded from: classes.dex */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* loaded from: classes.dex */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            c0.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* loaded from: classes.dex */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            c0.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* loaded from: classes.dex */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            c0.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ k f331a;
        private k mViewBounds;

        h(c cVar, k kVar) {
            this.f331a = kVar;
            this.mViewBounds = this.f331a;
        }
    }

    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f332a;

        /* renamed from: b */
        final /* synthetic */ View f333b;

        /* renamed from: c */
        final /* synthetic */ Rect f334c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ int f;
        final /* synthetic */ int g;

        i(c cVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f333b = view;
            this.f334c = rect;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f332a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f332a) {
                a.g.l.u.a(this.f333b, this.f334c);
                c0.a(this.f333b, this.d, this.e, this.f, this.g);
            }
        }
    }

    /* loaded from: classes.dex */
    class j extends n {

        /* renamed from: a */
        boolean f335a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f336b;

        j(c cVar, ViewGroup viewGroup) {
            this.f336b = viewGroup;
        }

        @Override // a.m.n, a.m.m.f
        public void b(m mVar) {
            x.b(this.f336b, false);
            this.f335a = true;
        }

        @Override // a.m.m.f
        public void c(m mVar) {
            if (!this.f335a) {
                x.b(this.f336b, false);
            }
            mVar.b(this);
        }

        @Override // a.m.n, a.m.m.f
        public void d(m mVar) {
            x.b(this.f336b, false);
        }

        @Override // a.m.n, a.m.m.f
        public void e(m mVar) {
            x.b(this.f336b, true);
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a */
        private int f337a;

        /* renamed from: b */
        private int f338b;

        /* renamed from: c */
        private int f339c;
        private int d;
        private View e;
        private int f;
        private int g;

        k(View view) {
            this.e = view;
        }

        private void a() {
            c0.a(this.e, this.f337a, this.f338b, this.f339c, this.d);
            this.f = 0;
            this.g = 0;
        }

        void a(PointF pointF) {
            this.f339c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                a();
            }
        }

        void b(PointF pointF) {
            this.f337a = Math.round(pointF.x);
            this.f338b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                a();
            }
        }
    }

    private boolean a(View view, View view2) {
        if (this.M) {
            s a2 = a(view, true);
            if (a2 == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == a2.f391b) {
                return true;
            }
            return false;
        }
        return true;
    }

    private void d(s sVar) {
        View view = sVar.f391b;
        if (!a.g.l.u.D(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f390a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f390a.put("android:changeBounds:parent", sVar.f391b.getParent());
        if (this.M) {
            sVar.f391b.getLocationInWindow(this.K);
            sVar.f390a.put("android:changeBounds:windowX", Integer.valueOf(this.K[0]));
            sVar.f390a.put("android:changeBounds:windowY", Integer.valueOf(this.K[1]));
        }
        if (!this.L) {
            return;
        }
        sVar.f390a.put("android:changeBounds:clip", a.g.l.u.i(view));
    }

    @Override // a.m.m
    public Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        int i2;
        View view;
        Animator animator;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.f390a;
        Map<String, Object> map2 = sVar2.f390a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f391b;
        if (!a(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) sVar.f390a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) sVar.f390a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) sVar2.f390a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) sVar2.f390a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.K);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c2 = c0.c(view2);
            c0.a(view2, 0.0f);
            c0.b(viewGroup).b(bitmapDrawable);
            a.m.g g2 = g();
            int[] iArr = this.K;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, a.m.i.a(O, g2.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
            ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, c2));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) sVar.f390a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) sVar2.f390a.get("android:changeBounds:bounds");
        int i4 = rect2.left;
        int i5 = rect3.left;
        int i6 = rect2.top;
        int i7 = rect3.top;
        int i8 = rect2.right;
        int i9 = rect3.right;
        int i10 = rect2.bottom;
        int i11 = rect3.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect4 = (Rect) sVar.f390a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) sVar2.f390a.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i2 = 0;
        } else {
            i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (!this.L) {
            view = view2;
            c0.a(view, i4, i6, i8, i10);
            if (i2 == 2) {
                if (i12 == i14 && i13 == i15) {
                    path = g().a(i4, i6, i5, i7);
                    property = T;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator a2 = a.m.f.a(kVar, P, g().a(i4, i6, i5, i7));
                    ObjectAnimator a3 = a.m.f.a(kVar, Q, g().a(i8, i10, i9, i11));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a2, a3);
                    animatorSet.addListener(new h(this, kVar));
                    animator = animatorSet;
                }
            } else if (i4 == i5 && i6 == i7) {
                path = g().a(i8, i10, i9, i11);
                property = R;
            } else {
                path = g().a(i4, i6, i5, i7);
                property = S;
            }
            animator = a.m.f.a(view, property, path);
        } else {
            view = view2;
            c0.a(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
            ObjectAnimator a4 = (i4 == i5 && i6 == i7) ? null : a.m.f.a(view, T, g().a(i4, i6, i5, i7));
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i12, i13);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
            if (!rect.equals(rect6)) {
                a.g.l.u.a(view, rect);
                a.m.k kVar2 = U;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                ofObject.addListener(new i(this, view, rect5, i5, i7, i9, i11));
                objectAnimator = ofObject;
            } else {
                objectAnimator = null;
            }
            animator = r.a(a4, objectAnimator);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.b(viewGroup4, true);
            a(new j(this, viewGroup4));
        }
        return animator;
    }

    @Override // a.m.m
    public void a(s sVar) {
        d(sVar);
    }

    @Override // a.m.m
    public void c(s sVar) {
        d(sVar);
    }

    @Override // a.m.m
    public String[] n() {
        return N;
    }
}
