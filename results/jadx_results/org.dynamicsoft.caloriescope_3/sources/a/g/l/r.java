package a.g.l;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final View f278b;

    /* renamed from: c */
    private ViewTreeObserver f279c;
    private final Runnable d;

    private r(View view, Runnable runnable) {
        this.f278b = view;
        this.f279c = view.getViewTreeObserver();
        this.d = runnable;
    }

    public static r a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable == null) {
                throw new NullPointerException("runnable == null");
            }
            r rVar = new r(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(rVar);
            view.addOnAttachStateChangeListener(rVar);
            return rVar;
        }
        throw new NullPointerException("view == null");
    }

    public void a() {
        (this.f279c.isAlive() ? this.f279c : this.f278b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f278b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        a();
        this.d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f279c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
