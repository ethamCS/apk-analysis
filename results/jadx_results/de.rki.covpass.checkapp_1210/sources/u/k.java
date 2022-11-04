package u;

import android.graphics.PointF;
import androidx.camera.core.w1;
import w.y1;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    private final y1 f22473a;

    public k(y1 y1Var) {
        this.f22473a = y1Var;
    }

    public PointF a(w1 w1Var, int i10) {
        return (i10 != 1 || !this.f22473a.a(t.b.class)) ? new PointF(w1Var.c(), w1Var.d()) : new PointF(1.0f - w1Var.c(), w1Var.d());
    }
}
