package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.y;
/* loaded from: classes.dex */
public abstract class a<V extends View> extends c<V> {

    /* renamed from: d */
    private Runnable f6841d;

    /* renamed from: e */
    OverScroller f6842e;

    /* renamed from: f */
    private boolean f6843f;

    /* renamed from: h */
    private int f6845h;

    /* renamed from: j */
    private VelocityTracker f6847j;

    /* renamed from: g */
    private int f6844g = -1;

    /* renamed from: i */
    private int f6846i = -1;

    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0100a implements Runnable {

        /* renamed from: c */
        private final CoordinatorLayout f6848c;

        /* renamed from: d */
        private final V f6849d;

        RunnableC0100a(CoordinatorLayout coordinatorLayout, V v10) {
            a.this = r1;
            this.f6848c = coordinatorLayout;
            this.f6849d = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f6849d == null || (overScroller = a.this.f6842e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.N(this.f6848c, this.f6849d);
                return;
            }
            a aVar = a.this;
            aVar.P(this.f6848c, this.f6849d, aVar.f6842e.getCurrY());
            y.g0(this.f6849d, this);
        }
    }

    public a() {
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void I() {
        if (this.f6847j == null) {
            this.f6847j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f6844g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f6845h = r12
            goto L4c
        L2d:
            int r0 = r11.f6844g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f6845h
            int r7 = r1 - r0
            r11.f6845h = r0
            int r8 = r11.K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.O(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f6847j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f6847j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f6847j
            int r4 = r11.f6844g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f6843f = r3
            r11.f6844g = r1
            android.view.VelocityTracker r13 = r11.f6847j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f6847j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f6847j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f6843f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    boolean H(V v10) {
        return false;
    }

    final boolean J(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f6841d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f6841d = null;
        }
        if (this.f6842e == null) {
            this.f6842e = new OverScroller(v10.getContext());
        }
        this.f6842e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f6842e.computeScrollOffset()) {
            N(coordinatorLayout, v10);
            return false;
        }
        RunnableC0100a runnableC0100a = new RunnableC0100a(coordinatorLayout, v10);
        this.f6841d = runnableC0100a;
        y.g0(v10, runnableC0100a);
        return true;
    }

    int K(V v10) {
        return -v10.getHeight();
    }

    int L(V v10) {
        return v10.getHeight();
    }

    int M() {
        return E();
    }

    void N(CoordinatorLayout coordinatorLayout, V v10) {
    }

    public final int O(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return Q(coordinatorLayout, v10, M() - i10, i11, i12);
    }

    public int P(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return Q(coordinatorLayout, v10, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int Q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int b10;
        int E = E();
        if (i11 == 0 || E < i11 || E > i12 || E == (b10 = s0.a.b(i10, i11, i12))) {
            return 0;
        }
        G(b10);
        return E - b10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f6846i < 0) {
            this.f6846i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f6843f) {
            int i10 = this.f6844g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f6845h) > this.f6846i) {
                this.f6845h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f6844g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = H(v10) && coordinatorLayout.B(v10, x10, y11);
            this.f6843f = z10;
            if (z10) {
                this.f6845h = y11;
                this.f6844g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f6842e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f6842e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f6847j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
