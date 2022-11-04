package q1;

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
public class c extends n {
    private static final String[] C4 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> D4 = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> E4 = new C0314c(PointF.class, "topLeft");
    private static final Property<k, PointF> F4 = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> G4 = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> H4 = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> I4 = new g(PointF.class, "position");
    private static q1.j J4 = new q1.j();

    /* renamed from: z4 */
    private int[] f19340z4 = new int[2];
    private boolean A4 = false;
    private boolean B4 = false;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f19341a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f19342b;

        /* renamed from: c */
        final /* synthetic */ View f19343c;

        /* renamed from: d */
        final /* synthetic */ float f19344d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            c.this = r1;
            this.f19341a = viewGroup;
            this.f19342b = bitmapDrawable;
            this.f19343c = view;
            this.f19344d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b0.b(this.f19341a).d(this.f19342b);
            b0.g(this.f19343c, this.f19344d);
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f19346a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f19346a);
            Rect rect = this.f19346a;
            return new PointF(rect.left, rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f19346a);
            this.f19346a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f19346a);
        }
    }

    /* renamed from: q1.c$c */
    /* loaded from: classes.dex */
    static class C0314c extends Property<k, PointF> {
        C0314c(Class cls, String str) {
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
            b0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
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
            b0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
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
            b0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ k f19347a;
        private k mViewBounds;

        h(k kVar) {
            c.this = r1;
            this.f19347a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f19349a;

        /* renamed from: b */
        final /* synthetic */ View f19350b;

        /* renamed from: c */
        final /* synthetic */ Rect f19351c;

        /* renamed from: d */
        final /* synthetic */ int f19352d;

        /* renamed from: e */
        final /* synthetic */ int f19353e;

        /* renamed from: f */
        final /* synthetic */ int f19354f;

        /* renamed from: g */
        final /* synthetic */ int f19355g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            c.this = r1;
            this.f19350b = view;
            this.f19351c = rect;
            this.f19352d = i10;
            this.f19353e = i11;
            this.f19354f = i12;
            this.f19355g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19349a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f19349a) {
                androidx.core.view.y.v0(this.f19350b, this.f19351c);
                b0.f(this.f19350b, this.f19352d, this.f19353e, this.f19354f, this.f19355g);
            }
        }
    }

    /* loaded from: classes.dex */
    class j extends o {

        /* renamed from: a */
        boolean f19357a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f19358b;

        j(ViewGroup viewGroup) {
            c.this = r1;
            this.f19358b = viewGroup;
        }

        @Override // q1.n.f
        public void a(n nVar) {
            if (!this.f19357a) {
                y.c(this.f19358b, false);
            }
            nVar.W(this);
        }

        @Override // q1.o, q1.n.f
        public void c(n nVar) {
            y.c(this.f19358b, false);
            this.f19357a = true;
        }

        @Override // q1.o, q1.n.f
        public void d(n nVar) {
            y.c(this.f19358b, true);
        }

        @Override // q1.o, q1.n.f
        public void e(n nVar) {
            y.c(this.f19358b, false);
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a */
        private int f19360a;

        /* renamed from: b */
        private int f19361b;

        /* renamed from: c */
        private int f19362c;

        /* renamed from: d */
        private int f19363d;

        /* renamed from: e */
        private View f19364e;

        /* renamed from: f */
        private int f19365f;

        /* renamed from: g */
        private int f19366g;

        k(View view) {
            this.f19364e = view;
        }

        private void b() {
            b0.f(this.f19364e, this.f19360a, this.f19361b, this.f19362c, this.f19363d);
            this.f19365f = 0;
            this.f19366g = 0;
        }

        void a(PointF pointF) {
            this.f19362c = Math.round(pointF.x);
            this.f19363d = Math.round(pointF.y);
            int i10 = this.f19366g + 1;
            this.f19366g = i10;
            if (this.f19365f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f19360a = Math.round(pointF.x);
            this.f19361b = Math.round(pointF.y);
            int i10 = this.f19365f + 1;
            this.f19365f = i10;
            if (i10 == this.f19366g) {
                b();
            }
        }
    }

    private void j0(t tVar) {
        View view = tVar.f19469b;
        if (!androidx.core.view.y.S(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        tVar.f19468a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        tVar.f19468a.put("android:changeBounds:parent", tVar.f19469b.getParent());
        if (this.B4) {
            tVar.f19469b.getLocationInWindow(this.f19340z4);
            tVar.f19468a.put("android:changeBounds:windowX", Integer.valueOf(this.f19340z4[0]));
            tVar.f19468a.put("android:changeBounds:windowY", Integer.valueOf(this.f19340z4[1]));
        }
        if (!this.A4) {
            return;
        }
        tVar.f19468a.put("android:changeBounds:clip", androidx.core.view.y.u(view));
    }

    private boolean k0(View view, View view2) {
        if (this.B4) {
            t y10 = y(view, true);
            if (y10 == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == y10.f19469b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // q1.n
    public String[] K() {
        return C4;
    }

    @Override // q1.n
    public void g(t tVar) {
        j0(tVar);
    }

    @Override // q1.n
    public void j(t tVar) {
        j0(tVar);
    }

    @Override // q1.n
    public Animator o(ViewGroup viewGroup, t tVar, t tVar2) {
        int i10;
        View view;
        Animator animator;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        if (tVar == null || tVar2 == null) {
            return null;
        }
        Map<String, Object> map = tVar.f19468a;
        Map<String, Object> map2 = tVar2.f19468a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = tVar2.f19469b;
        if (!k0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) tVar.f19468a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) tVar.f19468a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) tVar2.f19468a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) tVar2.f19468a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f19340z4);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c10 = b0.c(view2);
            b0.g(view2, 0.0f);
            b0.b(viewGroup).b(bitmapDrawable);
            q1.g B = B();
            int[] iArr = this.f19340z4;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, q1.h.a(D4, B.a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c10));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) tVar.f19468a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) tVar2.f19468a.get("android:changeBounds:bounds");
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) tVar.f19468a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) tVar2.f19468a.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        if (!this.A4) {
            view = view2;
            b0.f(view, i12, i14, i16, i18);
            if (i10 == 2) {
                if (i20 == i22 && i21 == i23) {
                    path = B().a(i12, i14, i13, i15);
                    property = I4;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator a10 = q1.f.a(kVar, E4, B().a(i12, i14, i13, i15));
                    ObjectAnimator a11 = q1.f.a(kVar, F4, B().a(i16, i18, i17, i19));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a10, a11);
                    animatorSet.addListener(new h(kVar));
                    animator = animatorSet;
                }
            } else if (i12 == i13 && i14 == i15) {
                path = B().a(i16, i18, i17, i19);
                property = G4;
            } else {
                path = B().a(i12, i14, i13, i15);
                property = H4;
            }
            animator = q1.f.a(view, property, path);
        } else {
            view = view2;
            b0.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
            ObjectAnimator a12 = (i12 == i13 && i14 == i15) ? null : q1.f.a(view, I4, B().a(i12, i14, i13, i15));
            if (rect4 == null) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i11, i11, i22, i23) : rect5;
            if (!rect.equals(rect6)) {
                androidx.core.view.y.v0(view, rect);
                q1.j jVar = J4;
                Object[] objArr = new Object[2];
                objArr[i11] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", jVar, objArr);
                ofObject.addListener(new i(view, rect5, i13, i15, i17, i19));
                objectAnimator = ofObject;
            } else {
                objectAnimator = null;
            }
            animator = s.c(a12, objectAnimator);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            y.c(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return animator;
    }
}
