package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static z0 k;
    private static z0 l;

    /* renamed from: b */
    private final View f696b;

    /* renamed from: c */
    private final CharSequence f697c;

    /* renamed from: d */
    private final int f698d;

    /* renamed from: e */
    private final Runnable f699e = new a();

    /* renamed from: f */
    private final Runnable f700f = new b();

    /* renamed from: g */
    private int f701g;

    /* renamed from: h */
    private int f702h;
    private a1 i;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            z0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0.this.g(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            z0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0.this.c();
        }
    }

    private z0(View view, CharSequence charSequence) {
        this.f696b = view;
        this.f697c = charSequence;
        this.f698d = b.g.l.u.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f696b.removeCallbacks(this.f699e);
    }

    private void b() {
        this.f701g = Integer.MAX_VALUE;
        this.f702h = Integer.MAX_VALUE;
    }

    private void d() {
        this.f696b.postDelayed(this.f699e, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(z0 z0Var) {
        z0 z0Var2 = k;
        if (z0Var2 != null) {
            z0Var2.a();
        }
        k = z0Var;
        if (z0Var != null) {
            z0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        z0 z0Var = k;
        if (z0Var != null && z0Var.f696b == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new z0(view, charSequence);
            return;
        }
        z0 z0Var2 = l;
        if (z0Var2 != null && z0Var2.f696b == view) {
            z0Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f701g) > this.f698d || Math.abs(y - this.f702h) > this.f698d) {
            this.f701g = x;
            this.f702h = y;
            return true;
        }
        return false;
    }

    void c() {
        if (l == this) {
            l = null;
            a1 a1Var = this.i;
            if (a1Var != null) {
                a1Var.c();
                this.i = null;
                b();
                this.f696b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            e(null);
        }
        this.f696b.removeCallbacks(this.f700f);
    }

    void g(boolean z) {
        long j;
        if (!b.g.l.t.N(this.f696b)) {
            return;
        }
        e(null);
        z0 z0Var = l;
        if (z0Var != null) {
            z0Var.c();
        }
        l = this;
        this.j = z;
        a1 a1Var = new a1(this.f696b.getContext());
        this.i = a1Var;
        a1Var.e(this.f696b, this.f701g, this.f702h, this.j, this.f697c);
        this.f696b.addOnAttachStateChangeListener(this);
        if (this.j) {
            j = 2500;
        } else {
            j = ((b.g.l.t.H(this.f696b) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
        }
        this.f696b.removeCallbacks(this.f700f);
        this.f696b.postDelayed(this.f700f, j);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i == null || !this.j) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f696b.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    b();
                    c();
                }
            } else if (this.f696b.isEnabled() && this.i == null && h(motionEvent)) {
                e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f701g = view.getWidth() / 2;
        this.f702h = view.getHeight() / 2;
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
