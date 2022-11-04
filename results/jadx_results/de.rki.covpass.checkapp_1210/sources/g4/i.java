package g4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
/* loaded from: classes.dex */
public class i extends a {
    private final h4.a<PointF, PointF> A;
    private h4.q B;

    /* renamed from: r */
    private final String f10455r;

    /* renamed from: s */
    private final boolean f10456s;

    /* renamed from: t */
    private final i0.d<LinearGradient> f10457t = new i0.d<>();

    /* renamed from: u */
    private final i0.d<RadialGradient> f10458u = new i0.d<>();

    /* renamed from: v */
    private final RectF f10459v = new RectF();

    /* renamed from: w */
    private final l4.g f10460w;

    /* renamed from: x */
    private final int f10461x;

    /* renamed from: y */
    private final h4.a<l4.d, l4.d> f10462y;

    /* renamed from: z */
    private final h4.a<PointF, PointF> f10463z;

    public i(com.airbnb.lottie.n nVar, m4.b bVar, l4.f fVar) {
        super(nVar, bVar, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f10455r = fVar.j();
        this.f10460w = fVar.f();
        this.f10456s = fVar.n();
        this.f10461x = (int) (nVar.E().d() / 32.0f);
        h4.a<l4.d, l4.d> n10 = fVar.e().n();
        this.f10462y = n10;
        n10.a(this);
        bVar.i(n10);
        h4.a<PointF, PointF> n11 = fVar.l().n();
        this.f10463z = n11;
        n11.a(this);
        bVar.i(n11);
        h4.a<PointF, PointF> n12 = fVar.d().n();
        this.A = n12;
        n12.a(this);
        bVar.i(n12);
    }

    private int[] j(int[] iArr) {
        h4.q qVar = this.B;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int k() {
        int round = Math.round(this.f10463z.f() * this.f10461x);
        int round2 = Math.round(this.A.f() * this.f10461x);
        int round3 = Math.round(this.f10462y.f() * this.f10461x);
        int i10 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        return round3 != 0 ? i10 * 31 * round3 : i10;
    }

    private LinearGradient m() {
        long k10 = k();
        LinearGradient g10 = this.f10457t.g(k10);
        if (g10 != null) {
            return g10;
        }
        PointF h10 = this.f10463z.h();
        PointF h11 = this.A.h();
        l4.d h12 = this.f10462y.h();
        LinearGradient linearGradient = new LinearGradient(h10.x, h10.y, h11.x, h11.y, j(h12.a()), h12.b(), Shader.TileMode.CLAMP);
        this.f10457t.l(k10, linearGradient);
        return linearGradient;
    }

    private RadialGradient n() {
        float f10;
        float f11;
        long k10 = k();
        RadialGradient g10 = this.f10458u.g(k10);
        if (g10 != null) {
            return g10;
        }
        PointF h10 = this.f10463z.h();
        PointF h11 = this.A.h();
        l4.d h12 = this.f10462y.h();
        int[] j10 = j(h12.a());
        float[] b10 = h12.b();
        RadialGradient radialGradient = new RadialGradient(h10.x, h10.y, (float) Math.hypot(h11.x - f10, h11.y - f11), j10, b10, Shader.TileMode.CLAMP);
        this.f10458u.l(k10, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g4.a, j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        super.e(t10, cVar);
        if (t10 == e4.u.L) {
            h4.q qVar = this.B;
            if (qVar != null) {
                this.f10387f.H(qVar);
            }
            if (cVar == null) {
                this.B = null;
                return;
            }
            h4.q qVar2 = new h4.q(cVar);
            this.B = qVar2;
            qVar2.a(this);
            this.f10387f.i(this.B);
        }
    }

    @Override // g4.a, g4.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f10456s) {
            return;
        }
        a(this.f10459v, matrix, false);
        Shader m10 = this.f10460w == l4.g.LINEAR ? m() : n();
        m10.setLocalMatrix(matrix);
        this.f10390i.setShader(m10);
        super.g(canvas, matrix, i10);
    }

    @Override // g4.c
    public String getName() {
        return this.f10455r;
    }
}
