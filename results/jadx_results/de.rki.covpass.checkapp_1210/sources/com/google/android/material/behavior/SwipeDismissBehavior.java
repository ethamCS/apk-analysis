package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.g;
import androidx.core.view.y;
import w0.c;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    w0.c f6871a;

    /* renamed from: b */
    c f6872b;

    /* renamed from: c */
    private boolean f6873c;

    /* renamed from: e */
    private boolean f6875e;

    /* renamed from: d */
    private float f6874d = 0.0f;

    /* renamed from: f */
    int f6876f = 2;

    /* renamed from: g */
    float f6877g = 0.5f;

    /* renamed from: h */
    float f6878h = 0.0f;

    /* renamed from: i */
    float f6879i = 0.5f;

    /* renamed from: j */
    private final c.AbstractC0436c f6880j = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c.AbstractC0436c {

        /* renamed from: a */
        private int f6881a;

        /* renamed from: b */
        private int f6882b = -1;

        a() {
            SwipeDismissBehavior.this = r1;
        }

        private boolean n(View view, float f10) {
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                return Math.abs(view.getLeft() - this.f6881a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f6877g);
            }
            boolean z10 = y.B(view) == 1;
            int i11 = SwipeDismissBehavior.this.f6876f;
            if (i11 == 2) {
                return true;
            }
            if (i11 == 0) {
                if (z10) {
                    if (f10 >= 0.0f) {
                        return false;
                    }
                } else if (i10 <= 0) {
                    return false;
                }
                return true;
            } else if (i11 != 1) {
                return false;
            } else {
                if (z10) {
                    if (i10 <= 0) {
                        return false;
                    }
                } else if (f10 >= 0.0f) {
                    return false;
                }
                return true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            r5 = r2.f6881a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            if (r5 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
            if (r5 != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            r5 = r2.f6881a - r3.getWidth();
            r3 = r2.f6881a;
         */
        @Override // w0.c.AbstractC0436c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = androidx.core.view.y.B(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = r0
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f6876f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f6881a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f6881a
                goto L37
            L1c:
                int r5 = r2.f6881a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f6881a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f6881a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // w0.c.AbstractC0436c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // w0.c.AbstractC0436c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // w0.c.AbstractC0436c
        public void i(View view, int i10) {
            this.f6882b = i10;
            this.f6881a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // w0.c.AbstractC0436c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f6872b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // w0.c.AbstractC0436c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = this.f6881a + (view.getWidth() * SwipeDismissBehavior.this.f6878h);
            float width2 = this.f6881a + (view.getWidth() * SwipeDismissBehavior.this.f6879i);
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f10), 1.0f));
            }
        }

        @Override // w0.c.AbstractC0436c
        public void l(View view, float f10, float f11) {
            boolean z10;
            int i10;
            c cVar;
            this.f6882b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f6881a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.f6881a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f6871a.F(i10, view.getTop())) {
                y.g0(view, new d(view, z10));
            } else if (!z10 || (cVar = SwipeDismissBehavior.this.f6872b) == null) {
            } else {
                cVar.a(view);
            }
        }

        @Override // w0.c.AbstractC0436c
        public boolean m(View view, int i10) {
            int i11 = this.f6882b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.E(view);
        }
    }

    /* loaded from: classes.dex */
    public class b implements g {
        b() {
            SwipeDismissBehavior.this = r1;
        }

        @Override // androidx.core.view.accessibility.g
        public boolean a(View view, g.a aVar) {
            boolean z10 = false;
            if (SwipeDismissBehavior.this.E(view)) {
                boolean z11 = y.B(view) == 1;
                int i10 = SwipeDismissBehavior.this.f6876f;
                if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
                    z10 = true;
                }
                int width = view.getWidth();
                if (z10) {
                    width = -width;
                }
                y.Y(view, width);
                view.setAlpha(0.0f);
                c cVar = SwipeDismissBehavior.this.f6872b;
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

        void b(int i10);
    }

    /* loaded from: classes.dex */
    private class d implements Runnable {

        /* renamed from: c */
        private final View f6885c;

        /* renamed from: d */
        private final boolean f6886d;

        d(View view, boolean z10) {
            SwipeDismissBehavior.this = r1;
            this.f6885c = view;
            this.f6886d = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            w0.c cVar2 = SwipeDismissBehavior.this.f6871a;
            if (cVar2 != null && cVar2.k(true)) {
                y.g0(this.f6885c, this);
            } else if (!this.f6886d || (cVar = SwipeDismissBehavior.this.f6872b) == null) {
            } else {
                cVar.a(this.f6885c);
            }
        }
    }

    static float F(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void H(ViewGroup viewGroup) {
        if (this.f6871a == null) {
            this.f6871a = this.f6875e ? w0.c.l(viewGroup, this.f6874d, this.f6880j) : w0.c.m(viewGroup, this.f6880j);
        }
    }

    static float I(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void N(View view) {
        y.i0(view, 1048576);
        if (E(view)) {
            y.k0(view, d.a.f3634y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        w0.c cVar = this.f6871a;
        if (cVar != null) {
            cVar.z(motionEvent);
            return true;
        }
        return false;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f10) {
        this.f6879i = F(0.0f, f10, 1.0f);
    }

    public void K(c cVar) {
        this.f6872b = cVar;
    }

    public void L(float f10) {
        this.f6878h = F(0.0f, f10, 1.0f);
    }

    public void M(int i10) {
        this.f6876f = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f6873c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.B(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6873c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6873c = false;
        }
        if (z10) {
            H(coordinatorLayout);
            return this.f6871a.G(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean l10 = super.l(coordinatorLayout, v10, i10);
        if (y.z(v10) == 0) {
            y.y0(v10, 1);
            N(v10);
        }
        return l10;
    }
}
