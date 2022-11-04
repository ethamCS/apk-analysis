package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.b3;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a */
    Size f2671a;

    /* renamed from: b */
    FrameLayout f2672b;

    /* renamed from: c */
    private final f f2673c;

    /* renamed from: d */
    private boolean f2674d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public k(FrameLayout frameLayout, f fVar) {
        this.f2672b = frameLayout;
        this.f2673c = fVar;
    }

    public Bitmap a() {
        Bitmap c10 = c();
        if (c10 == null) {
            return null;
        }
        return this.f2673c.a(c10, new Size(this.f2672b.getWidth(), this.f2672b.getHeight()), this.f2672b.getLayoutDirection());
    }

    abstract View b();

    abstract Bitmap c();

    public abstract void d();

    public abstract void e();

    public void f() {
        this.f2674d = true;
        h();
    }

    public abstract void g(b3 b3Var, a aVar);

    public void h() {
        View b10 = b();
        if (b10 == null || !this.f2674d) {
            return;
        }
        this.f2673c.q(new Size(this.f2672b.getWidth(), this.f2672b.getHeight()), this.f2672b.getLayoutDirection(), b10);
    }

    public abstract x5.a<Void> i();
}
