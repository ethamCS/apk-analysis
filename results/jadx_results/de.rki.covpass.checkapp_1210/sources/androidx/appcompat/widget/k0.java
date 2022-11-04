package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* loaded from: classes.dex */
public abstract class k0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private Runnable U3;
    private boolean V3;
    private int W3;
    private final int[] X3 = new int[2];

    /* renamed from: c */
    private final float f1378c;

    /* renamed from: d */
    private final int f1379d;

    /* renamed from: q */
    private final int f1380q;

    /* renamed from: x */
    final View f1381x;

    /* renamed from: y */
    private Runnable f1382y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            k0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = k0.this.f1381x.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            k0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.this.e();
        }
    }

    public k0(View view) {
        this.f1381x = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1378c = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1379d = tapTimeout;
        this.f1380q = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.U3;
        if (runnable != null) {
            this.f1381x.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1382y;
        if (runnable2 != null) {
            this.f1381x.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        i0 i0Var;
        View view = this.f1381x;
        l.e b10 = b();
        if (b10 == null || !b10.c() || (i0Var = (i0) b10.h()) == null || !i0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(i0Var, obtainNoHistory);
        boolean e10 = i0Var.e(obtainNoHistory, this.W3);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e10 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1381x
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.W3
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1378c
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.W3 = r6
            java.lang.Runnable r6 = r5.f1382y
            if (r6 != 0) goto L52
            androidx.appcompat.widget.k0$a r6 = new androidx.appcompat.widget.k0$a
            r6.<init>()
            r5.f1382y = r6
        L52:
            java.lang.Runnable r6 = r5.f1382y
            int r1 = r5.f1379d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.U3
            if (r6 != 0) goto L65
            androidx.appcompat.widget.k0$b r6 = new androidx.appcompat.widget.k0$b
            r6.<init>()
            r5.U3 = r6
        L65:
            java.lang.Runnable r6 = r5.U3
            int r1 = r5.f1380q
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.X3;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.X3;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract l.e b();

    protected abstract boolean c();

    protected boolean d() {
        l.e b10 = b();
        if (b10 == null || !b10.c()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1381x;
        if (!view.isEnabled() || view.isLongClickable() || !c()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.V3 = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.V3;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1381x.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.V3 = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.V3 = false;
        this.W3 = -1;
        Runnable runnable = this.f1382y;
        if (runnable != null) {
            this.f1381x.removeCallbacks(runnable);
        }
    }
}
