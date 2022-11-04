package m4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import e4.u;
import h4.q;
/* loaded from: classes.dex */
public class h extends b {
    private final Paint E;
    private final e H;
    private h4.a<ColorFilter, ColorFilter> I;
    private final RectF D = new RectF();
    private final float[] F = new float[8];
    private final Path G = new Path();

    public h(n nVar, e eVar) {
        super(nVar, eVar);
        f4.a aVar = new f4.a();
        this.E = aVar;
        this.H = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.o());
    }

    @Override // m4.b, g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        this.D.set(0.0f, 0.0f, this.H.q(), this.H.p());
        this.f16285o.mapRect(this.D);
        rectF.set(this.D);
    }

    @Override // m4.b, j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        super.e(t10, cVar);
        if (t10 == u.K) {
            this.I = cVar == null ? null : new q(cVar);
        }
    }

    @Override // m4.b
    public void u(Canvas canvas, Matrix matrix, int i10) {
        int alpha = Color.alpha(this.H.o());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i10 / 255.0f) * (((alpha / 255.0f) * (this.f16294x.h() == null ? 100 : this.f16294x.h().h().intValue())) / 100.0f) * 255.0f);
        this.E.setAlpha(intValue);
        h4.a<ColorFilter, ColorFilter> aVar = this.I;
        if (aVar != null) {
            this.E.setColorFilter(aVar.h());
        }
        if (intValue <= 0) {
            return;
        }
        float[] fArr = this.F;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.H.q();
        float[] fArr2 = this.F;
        fArr2[3] = 0.0f;
        fArr2[4] = this.H.q();
        this.F[5] = this.H.p();
        float[] fArr3 = this.F;
        fArr3[6] = 0.0f;
        fArr3[7] = this.H.p();
        matrix.mapPoints(this.F);
        this.G.reset();
        Path path = this.G;
        float[] fArr4 = this.F;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.G;
        float[] fArr5 = this.F;
        path2.lineTo(fArr5[2], fArr5[3]);
        Path path3 = this.G;
        float[] fArr6 = this.F;
        path3.lineTo(fArr6[4], fArr6[5]);
        Path path4 = this.G;
        float[] fArr7 = this.F;
        path4.lineTo(fArr7[6], fArr7[7]);
        Path path5 = this.G;
        float[] fArr8 = this.F;
        path5.lineTo(fArr8[0], fArr8[1]);
        this.G.close();
        canvas.drawPath(this.G, this.E);
    }
}
