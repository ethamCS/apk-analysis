package m4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import e4.u;
import h4.q;
import java.util.ArrayList;
import java.util.List;
import m4.e;
/* loaded from: classes.dex */
public class c extends b {
    private h4.a<Float, Float> D;
    private final List<b> E = new ArrayList();
    private final RectF F = new RectF();
    private final RectF G = new RectF();
    private final Paint H = new Paint();
    private boolean I = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16299a;

        static {
            int[] iArr = new int[e.b.values().length];
            f16299a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16299a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(n nVar, e eVar, List<e> list, e4.h hVar) {
        super(nVar, eVar);
        int i10;
        b bVar;
        k4.b u10 = eVar.u();
        if (u10 != null) {
            h4.a<Float, Float> n10 = u10.n();
            this.D = n10;
            i(n10);
            this.D.a(this);
        } else {
            this.D = null;
        }
        i0.d dVar = new i0.d(hVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size >= 0) {
                e eVar2 = list.get(size);
                b v10 = b.v(this, eVar2, nVar, hVar);
                if (v10 != null) {
                    dVar.l(v10.z().d(), v10);
                    if (bVar2 != null) {
                        bVar2.J(v10);
                        bVar2 = null;
                    } else {
                        this.E.add(0, v10);
                        int i11 = a.f16299a[eVar2.h().ordinal()];
                        if (i11 == 1 || i11 == 2) {
                            bVar2 = v10;
                        }
                    }
                }
                size--;
            }
        }
        for (i10 = 0; i10 < dVar.p(); i10++) {
            b bVar3 = (b) dVar.g(dVar.k(i10));
            if (bVar3 != null && (bVar = (b) dVar.g(bVar3.z().j())) != null) {
                bVar3.L(bVar);
            }
        }
    }

    @Override // m4.b
    protected void I(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            this.E.get(i11).h(eVar, i10, list, eVar2);
        }
    }

    @Override // m4.b
    public void K(boolean z10) {
        super.K(z10);
        for (b bVar : this.E) {
            bVar.K(z10);
        }
    }

    @Override // m4.b
    public void M(float f10) {
        super.M(f10);
        if (this.D != null) {
            f10 = ((this.D.h().floatValue() * this.f16287q.b().i()) - this.f16287q.b().p()) / (this.f16286p.E().e() + 0.01f);
        }
        if (this.D == null) {
            f10 -= this.f16287q.r();
        }
        if (this.f16287q.v() != 0.0f && !"__container".equals(this.f16287q.i())) {
            f10 /= this.f16287q.v();
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size).M(f10);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
    }

    @Override // m4.b, g4.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.E.get(size).a(this.F, this.f16285o, true);
            rectF.union(this.F);
        }
    }

    @Override // m4.b, j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        super.e(t10, cVar);
        if (t10 == u.E) {
            if (cVar == null) {
                h4.a<Float, Float> aVar = this.D;
                if (aVar == null) {
                    return;
                }
                aVar.n(null);
                return;
            }
            q qVar = new q(cVar);
            this.D = qVar;
            qVar.a(this);
            i(this.D);
        }
    }

    @Override // m4.b
    void u(Canvas canvas, Matrix matrix, int i10) {
        e4.c.a("CompositionLayer#draw");
        this.G.set(0.0f, 0.0f, this.f16287q.l(), this.f16287q.k());
        matrix.mapRect(this.G);
        boolean z10 = this.f16286p.Z() && this.E.size() > 1 && i10 != 255;
        if (z10) {
            this.H.setAlpha(i10);
            q4.h.m(canvas, this.G, this.H);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            if (((!this.I && "__container".equals(this.f16287q.i())) || this.G.isEmpty()) ? true : canvas.clipRect(this.G)) {
                this.E.get(size).g(canvas, matrix, i10);
            }
        }
        canvas.restore();
        e4.c.b("CompositionLayer#draw");
    }
}
