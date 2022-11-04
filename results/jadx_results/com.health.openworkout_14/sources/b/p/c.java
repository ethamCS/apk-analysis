package b.p;

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
    private static final Property<k, PointF> P = new C0064c(PointF.class, "topLeft");
    private static final Property<k, PointF> Q = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> R = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> S = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> T = new g(PointF.class, "position");
    private static b.p.k U = new b.p.k();
    private int[] K = new int[2];
    private boolean L = false;
    private boolean M = false;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2680a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f2681b;

        /* renamed from: c */
        final /* synthetic */ View f2682c;

        /* renamed from: d */
        final /* synthetic */ float f2683d;

        a(c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.f2680a = viewGroup;
            this.f2681b = bitmapDrawable;
            this.f2682c = view;
            this.f2683d = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.b(this.f2680a).d(this.f2681b);
            c0.g(this.f2682c, this.f2683d);
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f2684a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f2684a);
            Rect rect = this.f2684a;
            return new PointF(rect.left, rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f2684a);
            this.f2684a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f2684a);
        }
    }

    /* renamed from: b.p.c$c */
    /* loaded from: classes.dex */
    static class C0064c extends Property<k, PointF> {
        C0064c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
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

        /* renamed from: b */
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

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
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

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
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

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            c0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ k f2685a;
        private k mViewBounds;

        h(c cVar, k kVar) {
            this.f2685a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f2686a;

        /* renamed from: b */
        final /* synthetic */ View f2687b;

        /* renamed from: c */
        final /* synthetic */ Rect f2688c;

        /* renamed from: d */
        final /* synthetic */ int f2689d;

        /* renamed from: e */
        final /* synthetic */ int f2690e;

        /* renamed from: f */
        final /* synthetic */ int f2691f;

        /* renamed from: g */
        final /* synthetic */ int f2692g;

        i(c cVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f2687b = view;
            this.f2688c = rect;
            this.f2689d = i;
            this.f2690e = i2;
            this.f2691f = i3;
            this.f2692g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2686a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2686a) {
                b.g.l.t.o0(this.f2687b, this.f2688c);
                c0.f(this.f2687b, this.f2689d, this.f2690e, this.f2691f, this.f2692g);
            }
        }
    }

    /* loaded from: classes.dex */
    class j extends n {

        /* renamed from: a */
        boolean f2693a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f2694b;

        j(c cVar, ViewGroup viewGroup) {
            this.f2694b = viewGroup;
        }

        @Override // b.p.n, b.p.m.f
        public void a(m mVar) {
            x.c(this.f2694b, false);
        }

        @Override // b.p.n, b.p.m.f
        public void b(m mVar) {
            x.c(this.f2694b, true);
        }

        @Override // b.p.n, b.p.m.f
        public void d(m mVar) {
            x.c(this.f2694b, false);
            this.f2693a = true;
        }

        @Override // b.p.m.f
        public void e(m mVar) {
            if (!this.f2693a) {
                x.c(this.f2694b, false);
            }
            mVar.T(this);
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a */
        private int f2695a;

        /* renamed from: b */
        private int f2696b;

        /* renamed from: c */
        private int f2697c;

        /* renamed from: d */
        private int f2698d;

        /* renamed from: e */
        private View f2699e;

        /* renamed from: f */
        private int f2700f;

        /* renamed from: g */
        private int f2701g;

        k(View view) {
            this.f2699e = view;
        }

        private void b() {
            c0.f(this.f2699e, this.f2695a, this.f2696b, this.f2697c, this.f2698d);
            this.f2700f = 0;
            this.f2701g = 0;
        }

        void a(PointF pointF) {
            this.f2697c = Math.round(pointF.x);
            this.f2698d = Math.round(pointF.y);
            int i = this.f2701g + 1;
            this.f2701g = i;
            if (this.f2700f == i) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f2695a = Math.round(pointF.x);
            this.f2696b = Math.round(pointF.y);
            int i = this.f2700f + 1;
            this.f2700f = i;
            if (i == this.f2701g) {
                b();
            }
        }
    }

    private void g0(s sVar) {
        View view = sVar.f2781b;
        if (!b.g.l.t.O(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f2780a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f2780a.put("android:changeBounds:parent", sVar.f2781b.getParent());
        if (this.M) {
            sVar.f2781b.getLocationInWindow(this.K);
            sVar.f2780a.put("android:changeBounds:windowX", Integer.valueOf(this.K[0]));
            sVar.f2780a.put("android:changeBounds:windowY", Integer.valueOf(this.K[1]));
        }
        if (!this.L) {
            return;
        }
        sVar.f2780a.put("android:changeBounds:clip", b.g.l.t.r(view));
    }

    private boolean h0(View view, View view2) {
        if (this.M) {
            s v = v(view, true);
            if (v == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == v.f2781b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // b.p.m
    public String[] F() {
        return N;
    }

    @Override // b.p.m
    public void h(s sVar) {
        g0(sVar);
    }

    @Override // b.p.m
    public void l(s sVar) {
        g0(sVar);
    }

    @Override // b.p.m
    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
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
        Map<String, Object> map = sVar.f2780a;
        Map<String, Object> map2 = sVar2.f2780a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f2781b;
        if (!h0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) sVar.f2780a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) sVar.f2780a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) sVar2.f2780a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) sVar2.f2780a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.K);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c2 = c0.c(view2);
            c0.g(view2, 0.0f);
            c0.b(viewGroup).b(bitmapDrawable);
            b.p.g x = x();
            int[] iArr = this.K;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, b.p.i.a(O, x.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
            ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, c2));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) sVar.f2780a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) sVar2.f2780a.get("android:changeBounds:bounds");
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
        Rect rect4 = (Rect) sVar.f2780a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) sVar2.f2780a.get("android:changeBounds:clip");
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
            c0.f(view, i4, i6, i8, i10);
            if (i2 == 2) {
                if (i12 == i14 && i13 == i15) {
                    path = x().a(i4, i6, i5, i7);
                    property = T;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator a2 = b.p.f.a(kVar, P, x().a(i4, i6, i5, i7));
                    ObjectAnimator a3 = b.p.f.a(kVar, Q, x().a(i8, i10, i9, i11));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a2, a3);
                    animatorSet.addListener(new h(this, kVar));
                    animator = animatorSet;
                }
            } else if (i4 == i5 && i6 == i7) {
                path = x().a(i8, i10, i9, i11);
                property = R;
            } else {
                path = x().a(i4, i6, i5, i7);
                property = S;
            }
            animator = b.p.f.a(view, property, path);
        } else {
            view = view2;
            c0.f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
            ObjectAnimator a4 = (i4 == i5 && i6 == i7) ? null : b.p.f.a(view, T, x().a(i4, i6, i5, i7));
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i12, i13);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
            if (!rect.equals(rect6)) {
                b.g.l.t.o0(view, rect);
                b.p.k kVar2 = U;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                ofObject.addListener(new i(this, view, rect5, i5, i7, i9, i11));
                objectAnimator = ofObject;
            } else {
                objectAnimator = null;
            }
            animator = r.c(a4, objectAnimator);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.c(viewGroup4, true);
            b(new j(this, viewGroup4));
        }
        return animator;
    }
}
