package b.p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class z implements b0 {

    /* renamed from: a */
    protected a f2794a;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup {

        /* renamed from: b */
        ViewGroup f2795b;

        /* renamed from: c */
        View f2796c;

        /* renamed from: d */
        ArrayList<Drawable> f2797d = null;

        /* renamed from: e */
        z f2798e;

        /* renamed from: f */
        private boolean f2799f;

        static {
            try {
                Class cls = Integer.TYPE;
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, z zVar) {
            super(context);
            this.f2795b = viewGroup;
            this.f2796c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f2798e = zVar;
        }

        private void c() {
            if (!this.f2799f) {
                return;
            }
            throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f2797d;
                if (arrayList != null && arrayList.size() != 0) {
                    return;
                }
                this.f2799f = true;
                this.f2795b.removeView(this);
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f2795b.getLocationOnScreen(iArr2);
            this.f2796c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f2797d == null) {
                this.f2797d = new ArrayList<>();
            }
            if (!this.f2797d.contains(drawable)) {
                this.f2797d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f2795b && viewGroup.getParent() != null && b.g.l.t.N(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f2795b.getLocationOnScreen(iArr2);
                    b.g.l.t.T(view, iArr[0] - iArr2[0]);
                    b.g.l.t.U(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f2795b.getLocationOnScreen(iArr);
            this.f2796c.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f2796c.getWidth(), this.f2796c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f2797d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2797d.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f2797d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void g(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f2795b != null) {
                rect.offset(iArr[0], iArr[1]);
                if (!(this.f2795b instanceof ViewGroup)) {
                    invalidate(rect);
                    return null;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f2797d) != null && arrayList.contains(drawable));
        }
    }

    public z(Context context, ViewGroup viewGroup, View view) {
        this.f2794a = new a(context, viewGroup, view, this);
    }

    public static z e(View view) {
        ViewGroup f2 = f(view);
        if (f2 != null) {
            int childCount = f2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = f2.getChildAt(i);
                if (childAt instanceof a) {
                    return ((a) childAt).f2798e;
                }
            }
            return new u(f2.getContext(), f2, view);
        }
        return null;
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // b.p.b0
    public void b(Drawable drawable) {
        this.f2794a.a(drawable);
    }

    @Override // b.p.b0
    public void d(Drawable drawable) {
        this.f2794a.f(drawable);
    }
}
