package b.c.a;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b */
    final w f1290b;

    /* renamed from: c */
    final WeakReference<ImageView> f1291c;
    e d;

    public h(w wVar, ImageView imageView, e eVar) {
        this.f1290b = wVar;
        this.f1291c = new WeakReference<>(imageView);
        this.d = eVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void a() {
        this.d = null;
        ImageView imageView = this.f1291c.get();
        if (imageView == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f1291c.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            w wVar = this.f1290b;
            wVar.a();
            wVar.a(width, height);
            wVar.a(imageView, this.d);
        }
        return true;
    }
}
