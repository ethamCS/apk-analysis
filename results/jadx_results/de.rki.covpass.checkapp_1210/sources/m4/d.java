package m4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import e4.q;
import e4.u;
/* loaded from: classes.dex */
public class d extends b {
    private final Paint D = new f4.a(3);
    private final Rect E = new Rect();
    private final Rect F = new Rect();
    private final q G;
    private h4.a<ColorFilter, ColorFilter> H;
    private h4.a<Bitmap, Bitmap> I;

    public d(n nVar, e eVar) {
        super(nVar, eVar);
        this.G = nVar.K(eVar.m());
    }

    private Bitmap P() {
        Bitmap h10;
        h4.a<Bitmap, Bitmap> aVar = this.I;
        if (aVar == null || (h10 = aVar.h()) == null) {
            Bitmap C = this.f16286p.C(this.f16287q.m());
            if (C != null) {
                return C;
            }
            q qVar = this.G;
            if (qVar == null) {
                return null;
            }
            return qVar.a();
        }
        return h10;
    }

    @Override // m4.b, g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        if (this.G != null) {
            float e10 = q4.h.e();
            rectF.set(0.0f, 0.0f, this.G.e() * e10, this.G.c() * e10);
            this.f16285o.mapRect(rectF);
        }
    }

    @Override // m4.b, j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        super.e(t10, cVar);
        if (t10 == u.K) {
            if (cVar == null) {
                this.H = null;
            } else {
                this.H = new h4.q(cVar);
            }
        } else if (t10 != u.N) {
        } else {
            if (cVar == null) {
                this.I = null;
            } else {
                this.I = new h4.q(cVar);
            }
        }
    }

    @Override // m4.b
    public void u(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        Rect rect;
        int i12;
        Bitmap P = P();
        if (P == null || P.isRecycled() || this.G == null) {
            return;
        }
        float e10 = q4.h.e();
        this.D.setAlpha(i10);
        h4.a<ColorFilter, ColorFilter> aVar = this.H;
        if (aVar != null) {
            this.D.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.E.set(0, 0, P.getWidth(), P.getHeight());
        if (this.f16286p.L()) {
            rect = this.F;
            i11 = (int) (this.G.e() * e10);
            i12 = this.G.c();
        } else {
            rect = this.F;
            i11 = (int) (P.getWidth() * e10);
            i12 = P.getHeight();
        }
        rect.set(0, 0, i11, (int) (i12 * e10));
        canvas.drawBitmap(P, this.E, this.F, this.D);
        canvas.restore();
    }
}
