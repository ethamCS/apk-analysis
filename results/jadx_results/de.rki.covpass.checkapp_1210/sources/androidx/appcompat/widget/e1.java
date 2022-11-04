package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static e1 Y3;
    private static e1 Z3;
    private int U3;
    private int V3;
    private f1 W3;
    private boolean X3;

    /* renamed from: c */
    private final View f1309c;

    /* renamed from: d */
    private final CharSequence f1310d;

    /* renamed from: q */
    private final int f1311q;

    /* renamed from: x */
    private final Runnable f1312x = new a();

    /* renamed from: y */
    private final Runnable f1313y = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            e1.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.g(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            e1.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.c();
        }
    }

    private e1(View view, CharSequence charSequence) {
        this.f1309c = view;
        this.f1310d = charSequence;
        this.f1311q = androidx.core.view.a0.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1309c.removeCallbacks(this.f1312x);
    }

    private void b() {
        this.U3 = Integer.MAX_VALUE;
        this.V3 = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1309c.postDelayed(this.f1312x, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(e1 e1Var) {
        e1 e1Var2 = Y3;
        if (e1Var2 != null) {
            e1Var2.a();
        }
        Y3 = e1Var;
        if (e1Var != null) {
            e1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        e1 e1Var = Y3;
        if (e1Var != null && e1Var.f1309c == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new e1(view, charSequence);
            return;
        }
        e1 e1Var2 = Z3;
        if (e1Var2 != null && e1Var2.f1309c == view) {
            e1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.U3) > this.f1311q || Math.abs(y10 - this.V3) > this.f1311q) {
            this.U3 = x10;
            this.V3 = y10;
            return true;
        }
        return false;
    }

    void c() {
        if (Z3 == this) {
            Z3 = null;
            f1 f1Var = this.W3;
            if (f1Var != null) {
                f1Var.c();
                this.W3 = null;
                b();
                this.f1309c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (Y3 == this) {
            e(null);
        }
        this.f1309c.removeCallbacks(this.f1313y);
    }

    void g(boolean z10) {
        long j10;
        if (!androidx.core.view.y.R(this.f1309c)) {
            return;
        }
        e(null);
        e1 e1Var = Z3;
        if (e1Var != null) {
            e1Var.c();
        }
        Z3 = this;
        this.X3 = z10;
        f1 f1Var = new f1(this.f1309c.getContext());
        this.W3 = f1Var;
        f1Var.e(this.f1309c, this.U3, this.V3, this.X3, this.f1310d);
        this.f1309c.addOnAttachStateChangeListener(this);
        if (this.X3) {
            j10 = 2500;
        } else {
            j10 = ((androidx.core.view.y.K(this.f1309c) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
        }
        this.f1309c.removeCallbacks(this.f1313y);
        this.f1309c.postDelayed(this.f1313y, j10);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.W3 == null || !this.X3) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1309c.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    b();
                    c();
                }
            } else if (this.f1309c.isEnabled() && this.W3 == null && h(motionEvent)) {
                e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.U3 = view.getWidth() / 2;
        this.V3 = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
