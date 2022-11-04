package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.core.x1;
/* loaded from: classes.dex */
public class l extends x1 {

    /* renamed from: d */
    static final PointF f2675d = new PointF(2.0f, 2.0f);

    /* renamed from: b */
    private final f f2676b;

    /* renamed from: c */
    private Matrix f2677c;

    public l(f fVar) {
        this.f2676b = fVar;
    }

    @Override // androidx.camera.core.x1
    protected PointF a(float f10, float f11) {
        float[] fArr = {f10, f11};
        synchronized (this) {
            Matrix matrix = this.f2677c;
            if (matrix == null) {
                return f2675d;
            }
            matrix.mapPoints(fArr);
            return new PointF(fArr[0], fArr[1]);
        }
    }

    public void e(Size size, int i10) {
        androidx.camera.core.impl.utils.l.a();
        synchronized (this) {
            if (size.getWidth() != 0 && size.getHeight() != 0) {
                this.f2677c = this.f2676b.c(size, i10);
                return;
            }
            this.f2677c = null;
        }
    }
}
