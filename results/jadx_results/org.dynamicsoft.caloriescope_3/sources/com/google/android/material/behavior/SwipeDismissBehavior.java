package com.google.android.material.behavior;

import a.g.l.u;
import a.i.b.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    a.i.b.c f1394a;

    /* renamed from: b */
    b f1395b;

    /* renamed from: c */
    private boolean f1396c;
    private boolean e;
    private float d = 0.0f;
    int f = 2;
    float g = 0.5f;
    float h = 0.0f;
    float i = 0.5f;
    private final c.AbstractC0022c j = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c.AbstractC0022c {

        /* renamed from: a */
        private int f1397a;

        /* renamed from: b */
        private int f1398b = -1;

        a() {
            SwipeDismissBehavior.this = r1;
        }

        private boolean a(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.f1397a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.g);
            }
            boolean z = u.o(view) == 1;
            int i = SwipeDismissBehavior.this.f;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            } else if (i != 1) {
                return false;
            } else {
                if (z) {
                    if (f <= 0.0f) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            }
        }

        @Override // a.i.b.c.AbstractC0022c
        public int a(View view) {
            return view.getWidth();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            r5 = r2.f1397a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            if (r5 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
            if (r5 != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            r5 = r2.f1397a - r3.getWidth();
            r3 = r2.f1397a;
         */
        @Override // a.i.b.c.AbstractC0022c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = a.g.l.u.o(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f1397a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f1397a
                goto L37
            L1c:
                int r5 = r2.f1397a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f1397a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f1397a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.a(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // a.i.b.c.AbstractC0022c
        public void a(View view, float f, float f2) {
            boolean z;
            int i;
            b bVar;
            this.f1398b = -1;
            int width = view.getWidth();
            if (a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f1397a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f1397a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f1394a.d(i, view.getTop())) {
                u.a(view, new c(view, z));
            } else if (!z || (bVar = SwipeDismissBehavior.this.f1395b) == null) {
            } else {
                bVar.a(view);
            }
        }

        @Override // a.i.b.c.AbstractC0022c
        public void a(View view, int i) {
            this.f1398b = i;
            this.f1397a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // a.i.b.c.AbstractC0022c
        public void a(View view, int i, int i2, int i3, int i4) {
            float width = this.f1397a + (view.getWidth() * SwipeDismissBehavior.this.h);
            float width2 = this.f1397a + (view.getWidth() * SwipeDismissBehavior.this.i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - SwipeDismissBehavior.b(width, width2, f), 1.0f));
            }
        }

        @Override // a.i.b.c.AbstractC0022c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // a.i.b.c.AbstractC0022c
        public boolean b(View view, int i) {
            int i2 = this.f1398b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.a(view);
        }

        @Override // a.i.b.c.AbstractC0022c
        public void c(int i) {
            b bVar = SwipeDismissBehavior.this.f1395b;
            if (bVar != null) {
                bVar.a(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i);

        void a(View view);
    }

    /* loaded from: classes.dex */
    private class c implements Runnable {

        /* renamed from: b */
        private final View f1400b;

        /* renamed from: c */
        private final boolean f1401c;

        c(View view, boolean z) {
            SwipeDismissBehavior.this = r1;
            this.f1400b = view;
            this.f1401c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            a.i.b.c cVar = SwipeDismissBehavior.this.f1394a;
            if (cVar != null && cVar.a(true)) {
                u.a(this.f1400b, this);
            } else if (!this.f1401c || (bVar = SwipeDismissBehavior.this.f1395b) == null) {
            } else {
                bVar.a(this.f1400b);
            }
        }
    }

    static float a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void a(ViewGroup viewGroup) {
        if (this.f1394a == null) {
            this.f1394a = this.e ? a.i.b.c.a(viewGroup, this.d, this.j) : a.i.b.c.a(viewGroup, this.j);
        }
    }

    static float b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public void a(float f) {
        this.i = a(0.0f, f, 1.0f);
    }

    public void a(int i) {
        this.f = i;
    }

    public boolean a(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f1396c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1396c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1396c = false;
        }
        if (z) {
            a((ViewGroup) coordinatorLayout);
            return this.f1394a.b(motionEvent);
        }
        return false;
    }

    public void b(float f) {
        this.h = a(0.0f, f, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.i.b.c cVar = this.f1394a;
        if (cVar != null) {
            cVar.a(motionEvent);
            return true;
        }
        return false;
    }
}
