package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
/* loaded from: classes.dex */
public final class v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c */
    private final View f3728c;

    /* renamed from: d */
    private ViewTreeObserver f3729d;

    /* renamed from: q */
    private final Runnable f3730q;

    private v(View view, Runnable runnable) {
        this.f3728c = view;
        this.f3729d = view.getViewTreeObserver();
        this.f3730q = runnable;
    }

    public static v a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        v vVar = new v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(vVar);
        view.addOnAttachStateChangeListener(vVar);
        return vVar;
    }

    public void b() {
        (this.f3729d.isAlive() ? this.f3729d : this.f3728c.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f3728c.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f3730q.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3729d = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
