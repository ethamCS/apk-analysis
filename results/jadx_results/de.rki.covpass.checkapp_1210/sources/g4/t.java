package g4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
/* loaded from: classes.dex */
public class t extends a {

    /* renamed from: r */
    private final m4.b f10519r;

    /* renamed from: s */
    private final String f10520s;

    /* renamed from: t */
    private final boolean f10521t;

    /* renamed from: u */
    private final h4.a<Integer, Integer> f10522u;

    /* renamed from: v */
    private h4.a<ColorFilter, ColorFilter> f10523v;

    public t(com.airbnb.lottie.n nVar, m4.b bVar, l4.r rVar) {
        super(nVar, bVar, rVar.b().b(), rVar.e().b(), rVar.g(), rVar.i(), rVar.j(), rVar.f(), rVar.d());
        this.f10519r = bVar;
        this.f10520s = rVar.h();
        this.f10521t = rVar.k();
        h4.a<Integer, Integer> n10 = rVar.c().n();
        this.f10522u = n10;
        n10.a(this);
        bVar.i(n10);
    }

    @Override // g4.a, j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        super.e(t10, cVar);
        if (t10 == e4.u.f9435b) {
            this.f10522u.n(cVar);
        } else if (t10 != e4.u.K) {
        } else {
            h4.a<ColorFilter, ColorFilter> aVar = this.f10523v;
            if (aVar != null) {
                this.f10519r.H(aVar);
            }
            if (cVar == null) {
                this.f10523v = null;
                return;
            }
            h4.q qVar = new h4.q(cVar);
            this.f10523v = qVar;
            qVar.a(this);
            this.f10519r.i(this.f10522u);
        }
    }

    @Override // g4.a, g4.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f10521t) {
            return;
        }
        this.f10390i.setColor(((h4.b) this.f10522u).p());
        h4.a<ColorFilter, ColorFilter> aVar = this.f10523v;
        if (aVar != null) {
            this.f10390i.setColorFilter(aVar.h());
        }
        super.g(canvas, matrix, i10);
    }

    @Override // g4.c
    public String getName() {
        return this.f10520s;
    }
}
