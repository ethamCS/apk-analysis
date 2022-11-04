package m4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import java.util.Collections;
import java.util.List;
import l4.p;
import o4.j;
/* loaded from: classes.dex */
public class g extends b {
    private final g4.d D;
    private final c E;

    public g(n nVar, e eVar, c cVar) {
        super(nVar, eVar);
        this.E = cVar;
        g4.d dVar = new g4.d(nVar, this, new p("__container", eVar.n(), false));
        this.D = dVar;
        dVar.c(Collections.emptyList(), Collections.emptyList());
    }

    @Override // m4.b
    protected void I(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        this.D.h(eVar, i10, list, eVar2);
    }

    @Override // m4.b, g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        this.D.a(rectF, this.f16285o, z10);
    }

    @Override // m4.b
    void u(Canvas canvas, Matrix matrix, int i10) {
        this.D.g(canvas, matrix, i10);
    }

    @Override // m4.b
    public l4.a w() {
        l4.a w9 = super.w();
        return w9 != null ? w9 : this.E.w();
    }

    @Override // m4.b
    public j y() {
        j y10 = super.y();
        return y10 != null ? y10 : this.E.y();
    }
}
