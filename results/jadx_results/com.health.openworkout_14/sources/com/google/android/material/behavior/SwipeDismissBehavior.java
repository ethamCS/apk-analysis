package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.l.c0.c;
import b.g.l.c0.f;
import b.g.l.t;
import b.i.b.d;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    b.i.b.d f2938a;

    /* renamed from: b */
    c f2939b;

    /* renamed from: c */
    private boolean f2940c;

    /* renamed from: e */
    private boolean f2942e;

    /* renamed from: d */
    private float f2941d = 0.0f;

    /* renamed from: f */
    int f2943f = 2;

    /* renamed from: g */
    float f2944g = 0.5f;

    /* renamed from: h */
    float f2945h = 0.0f;
    float i = 0.5f;
    private final d.c j = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends d.c {

        /* renamed from: a */
        private int f2946a;

        /* renamed from: b */
        private int f2947b = -1;

        a() {
            SwipeDismissBehavior.this = r1;
        }

        private boolean n(View view, float f2) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i == 0) {
                return Math.abs(view.getLeft() - this.f2946a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f2944g);
            }
            boolean z = t.y(view) == 1;
            int i2 = SwipeDismissBehavior.this.f2943f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f2 >= 0.0f) {
                        return false;
                    }
                } else if (i <= 0) {
                    return false;
                }
                return true;
            } else if (i2 != 1) {
                return false;
            } else {
                if (z) {
                    if (i <= 0) {
                        return false;
                    }
                } else if (f2 >= 0.0f) {
                    return false;
                }
                return true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            r5 = r2.f2946a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            if (r5 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
            if (r5 != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            r5 = r2.f2946a - r3.getWidth();
            r3 = r2.f2946a;
         */
        @Override // b.i.b.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = b.g.l.t.y(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f2943f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f2946a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f2946a
                goto L37
            L1c:
                int r5 = r2.f2946a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f2946a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f2946a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // b.i.b.d.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // b.i.b.d.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // b.i.b.d.c
        public void i(View view, int i) {
            this.f2947b = i;
            this.f2946a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // b.i.b.d.c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.f2939b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // b.i.b.d.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = this.f2946a + (view.getWidth() * SwipeDismissBehavior.this.f2945h);
            float width2 = this.f2946a + (view.getWidth() * SwipeDismissBehavior.this.i);
            float f2 = i;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f2), 1.0f));
            }
        }

        @Override // b.i.b.d.c
        public void l(View view, float f2, float f3) {
            boolean z;
            int i;
            c cVar;
            this.f2947b = -1;
            int width = view.getWidth();
            if (n(view, f2)) {
                int left = view.getLeft();
                int i2 = this.f2946a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f2946a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f2938a.O(i, view.getTop())) {
                t.a0(view, new d(view, z));
            } else if (!z || (cVar = SwipeDismissBehavior.this.f2939b) == null) {
            } else {
                cVar.a(view);
            }
        }

        @Override // b.i.b.d.c
        public boolean m(View view, int i) {
            int i2 = this.f2947b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.E(view);
        }
    }

    /* loaded from: classes.dex */
    public class b implements f {
        b() {
            SwipeDismissBehavior.this = r1;
        }

        @Override // b.g.l.c0.f
        public boolean a(View view, f.a aVar) {
            boolean z = false;
            if (SwipeDismissBehavior.this.E(view)) {
                boolean z2 = t.y(view) == 1;
                int i = SwipeDismissBehavior.this.f2943f;
                if ((i == 0 && z2) || (i == 1 && !z2)) {
                    z = true;
                }
                int width = view.getWidth();
                if (z) {
                    width = -width;
                }
                t.T(view, width);
                view.setAlpha(0.0f);
                c cVar = SwipeDismissBehavior.this.f2939b;
                if (cVar != null) {
                    cVar.a(view);
                }
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(View view);

        void b(int i);
    }

    /* loaded from: classes.dex */
    private class d implements Runnable {

        /* renamed from: b */
        private final View f2950b;

        /* renamed from: c */
        private final boolean f2951c;

        d(View view, boolean z) {
            SwipeDismissBehavior.this = r1;
            this.f2950b = view;
            this.f2951c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            b.i.b.d dVar = SwipeDismissBehavior.this.f2938a;
            if (dVar != null && dVar.m(true)) {
                t.a0(this.f2950b, this);
            } else if (!this.f2951c || (cVar = SwipeDismissBehavior.this.f2939b) == null) {
            } else {
                cVar.a(this.f2950b);
            }
        }
    }

    static float F(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void H(ViewGroup viewGroup) {
        if (this.f2938a == null) {
            this.f2938a = this.f2942e ? b.i.b.d.n(viewGroup, this.f2941d, this.j) : b.i.b.d.o(viewGroup, this.j);
        }
    }

    static float I(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    private void M(View view) {
        t.c0(view, 1048576);
        if (E(view)) {
            t.e0(view, c.a.l, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        b.i.b.d dVar = this.f2938a;
        if (dVar != null) {
            dVar.F(motionEvent);
            return true;
        }
        return false;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f2) {
        this.i = F(0.0f, f2, 1.0f);
    }

    public void K(float f2) {
        this.f2945h = F(0.0f, f2, 1.0f);
    }

    public void L(int i) {
        this.f2943f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f2940c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2940c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2940c = false;
        }
        if (z) {
            H(coordinatorLayout);
            return this.f2938a.P(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean l = super.l(coordinatorLayout, v, i);
        if (t.w(v) == 0) {
            t.r0(v, 1);
            M(v);
        }
        return l;
    }
}
