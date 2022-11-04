package h4;

import android.graphics.Color;
import android.graphics.Paint;
import h4.a;
/* loaded from: classes.dex */
public class c implements a.b {

    /* renamed from: a */
    private final a.b f11262a;

    /* renamed from: b */
    private final h4.a<Integer, Integer> f11263b;

    /* renamed from: c */
    private final h4.a<Float, Float> f11264c;

    /* renamed from: d */
    private final h4.a<Float, Float> f11265d;

    /* renamed from: e */
    private final h4.a<Float, Float> f11266e;

    /* renamed from: f */
    private final h4.a<Float, Float> f11267f;

    /* renamed from: g */
    private boolean f11268g = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends r4.c<Float> {

        /* renamed from: d */
        final /* synthetic */ r4.c f11269d;

        a(r4.c cVar) {
            c.this = r1;
            this.f11269d = cVar;
        }

        /* renamed from: d */
        public Float a(r4.b<Float> bVar) {
            Float f10 = (Float) this.f11269d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, m4.b bVar2, o4.j jVar) {
        this.f11262a = bVar;
        h4.a<Integer, Integer> n10 = jVar.a().n();
        this.f11263b = n10;
        n10.a(this);
        bVar2.i(n10);
        h4.a<Float, Float> n11 = jVar.d().n();
        this.f11264c = n11;
        n11.a(this);
        bVar2.i(n11);
        h4.a<Float, Float> n12 = jVar.b().n();
        this.f11265d = n12;
        n12.a(this);
        bVar2.i(n12);
        h4.a<Float, Float> n13 = jVar.c().n();
        this.f11266e = n13;
        n13.a(this);
        bVar2.i(n13);
        h4.a<Float, Float> n14 = jVar.e().n();
        this.f11267f = n14;
        n14.a(this);
        bVar2.i(n14);
    }

    public void a(Paint paint) {
        if (!this.f11268g) {
            return;
        }
        this.f11268g = false;
        double floatValue = this.f11265d.h().floatValue() * 0.017453292519943295d;
        float floatValue2 = this.f11266e.h().floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = this.f11263b.h().intValue();
        paint.setShadowLayer(this.f11267f.h().floatValue(), sin, cos, Color.argb(Math.round(this.f11264c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    @Override // h4.a.b
    public void b() {
        this.f11268g = true;
        this.f11262a.b();
    }

    public void c(r4.c<Integer> cVar) {
        this.f11263b.n(cVar);
    }

    public void d(r4.c<Float> cVar) {
        this.f11265d.n(cVar);
    }

    public void e(r4.c<Float> cVar) {
        this.f11266e.n(cVar);
    }

    public void f(r4.c<Float> cVar) {
        if (cVar == null) {
            this.f11264c.n(null);
        } else {
            this.f11264c.n(new a(cVar));
        }
    }

    public void g(r4.c<Float> cVar) {
        this.f11267f.n(cVar);
    }
}
