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
    private final View f790b;

    /* renamed from: c */
    private final CharSequence f791c;
    private final int d;
    private final Runnable e = new a();
    private final Runnable f = new b();
    private int g;
    private int h;
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
            z0.this.a(false);
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
            z0.this.a();
        }
    }

    private z0(View view, CharSequence charSequence) {
        this.f790b = view;
        this.f791c = charSequence;
        this.d = a.g.l.v.a(ViewConfiguration.get(view.getContext()));
        c();
        this.f790b.setOnLongClickListener(this);
        this.f790b.setOnHoverListener(this);
    }

    public static void a(View view, CharSequence charSequence) {
        z0 z0Var = k;
        if (z0Var != null && z0Var.f790b == view) {
            a((z0) null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new z0(view, charSequence);
            return;
        }
        z0 z0Var2 = l;
        if (z0Var2 != null && z0Var2.f790b == view) {
            z0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private static void a(z0 z0Var) {
        z0 z0Var2 = k;
        if (z0Var2 != null) {
            z0Var2.b();
        }
        k = z0Var;
        if (z0Var != null) {
            z0Var.d();
        }
    }

    private boolean a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.g) > this.d || Math.abs(y - this.h) > this.d) {
            this.g = x;
            this.h = y;
            return true;
        }
        return false;
    }

    private void b() {
        this.f790b.removeCallbacks(this.e);
    }

    private void c() {
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    private void d() {
        this.f790b.postDelayed(this.e, ViewConfiguration.getLongPressTimeout());
    }

    void a() {
        if (l == this) {
            l = null;
            a1 a1Var = this.i;
            if (a1Var != null) {
                a1Var.a();
                this.i = null;
                c();
                this.f790b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            a((z0) null);
        }
        this.f790b.removeCallbacks(this.f);
    }

    void a(boolean z) {
        long j;
        if (!a.g.l.u.C(this.f790b)) {
            return;
        }
        a((z0) null);
        z0 z0Var = l;
        if (z0Var != null) {
            z0Var.a();
        }
        l = this;
        this.j = z;
        a1 a1Var = new a1(this.f790b.getContext());
        this.i = a1Var;
        a1Var.a(this.f790b, this.g, this.h, this.j, this.f791c);
        this.f790b.addOnAttachStateChangeListener(this);
        if (this.j) {
            j = 2500;
        } else {
            j = ((a.g.l.u.w(this.f790b) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
        }
        this.f790b.removeCallbacks(this.f);
        this.f790b.postDelayed(this.f, j);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i == null || !this.j) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f790b.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    c();
                    a();
                }
            } else if (this.f790b.isEnabled() && this.i == null && a(motionEvent)) {
                a(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.g = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
