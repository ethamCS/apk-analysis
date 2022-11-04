package d.a.a.a.a0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class m {
    @Deprecated

    /* renamed from: a */
    public float f3597a;
    @Deprecated

    /* renamed from: b */
    public float f3598b;
    @Deprecated

    /* renamed from: c */
    public float f3599c;
    @Deprecated

    /* renamed from: d */
    public float f3600d;
    @Deprecated

    /* renamed from: e */
    public float f3601e;
    @Deprecated

    /* renamed from: f */
    public float f3602f;

    /* renamed from: g */
    private final List<f> f3603g = new ArrayList();

    /* renamed from: h */
    private final List<g> f3604h = new ArrayList();
    private boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g {

        /* renamed from: b */
        final /* synthetic */ List f3605b;

        /* renamed from: c */
        final /* synthetic */ Matrix f3606c;

        a(m mVar, List list, Matrix matrix) {
            this.f3605b = list;
            this.f3606c = matrix;
        }

        @Override // d.a.a.a.a0.m.g
        public void a(Matrix matrix, d.a.a.a.z.a aVar, int i, Canvas canvas) {
            for (g gVar : this.f3605b) {
                gVar.a(this.f3606c, aVar, i, canvas);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: b */
        private final d f3607b;

        public b(d dVar) {
            this.f3607b = dVar;
        }

        @Override // d.a.a.a.a0.m.g
        public void a(Matrix matrix, d.a.a.a.z.a aVar, int i, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f3607b.k(), this.f3607b.o(), this.f3607b.l(), this.f3607b.j()), i, this.f3607b.m(), this.f3607b.n());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends g {

        /* renamed from: b */
        private final e f3608b;

        /* renamed from: c */
        private final float f3609c;

        /* renamed from: d */
        private final float f3610d;

        public c(e eVar, float f2, float f3) {
            this.f3608b = eVar;
            this.f3609c = f2;
            this.f3610d = f3;
        }

        @Override // d.a.a.a.a0.m.g
        public void a(Matrix matrix, d.a.a.a.z.a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f3608b.f3619c - this.f3610d, this.f3608b.f3618b - this.f3609c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f3609c, this.f3610d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f3608b.f3619c - this.f3610d) / (this.f3608b.f3618b - this.f3609c)));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: h */
        private static final RectF f3611h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f3612b;
        @Deprecated

        /* renamed from: c */
        public float f3613c;
        @Deprecated

        /* renamed from: d */
        public float f3614d;
        @Deprecated

        /* renamed from: e */
        public float f3615e;
        @Deprecated

        /* renamed from: f */
        public float f3616f;
        @Deprecated

        /* renamed from: g */
        public float f3617g;

        public d(float f2, float f3, float f4, float f5) {
            q(f2);
            u(f3);
            r(f4);
            p(f5);
        }

        public float j() {
            return this.f3615e;
        }

        public float k() {
            return this.f3612b;
        }

        public float l() {
            return this.f3614d;
        }

        public float m() {
            return this.f3616f;
        }

        public float n() {
            return this.f3617g;
        }

        public float o() {
            return this.f3613c;
        }

        private void p(float f2) {
            this.f3615e = f2;
        }

        private void q(float f2) {
            this.f3612b = f2;
        }

        private void r(float f2) {
            this.f3614d = f2;
        }

        public void s(float f2) {
            this.f3616f = f2;
        }

        public void t(float f2) {
            this.f3617g = f2;
        }

        private void u(float f2) {
            this.f3613c = f2;
        }

        @Override // d.a.a.a.a0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f3620a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f3611h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: b */
        private float f3618b;

        /* renamed from: c */
        private float f3619c;

        @Override // d.a.a.a.a0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f3620a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f3618b, this.f3619c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a */
        protected final Matrix f3620a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a */
        static final Matrix f3621a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, d.a.a.a.z.a aVar, int i, Canvas canvas);

        public final void b(d.a.a.a.z.a aVar, int i, Canvas canvas) {
            a(f3621a, aVar, i, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f2) {
        if (g() == f2) {
            return;
        }
        float g2 = ((f2 - g()) + 360.0f) % 360.0f;
        if (g2 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g2);
        this.f3604h.add(new b(dVar));
        p(f2);
    }

    private void c(g gVar, float f2, float f3) {
        b(f2);
        this.f3604h.add(gVar);
        p(f3);
    }

    private float g() {
        return this.f3601e;
    }

    private float h() {
        return this.f3602f;
    }

    private void p(float f2) {
        this.f3601e = f2;
    }

    private void q(float f2) {
        this.f3602f = f2;
    }

    private void r(float f2) {
        this.f3599c = f2;
    }

    private void s(float f2) {
        this.f3600d = f2;
    }

    private void t(float f2) {
        this.f3597a = f2;
    }

    private void u(float f2) {
        this.f3598b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.f3603g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f3603g.size();
        for (int i = 0; i < size; i++) {
            this.f3603g.get(i).a(matrix, path);
        }
    }

    public boolean e() {
        return this.i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(this, new ArrayList(this.f3604h), matrix);
    }

    public float i() {
        return this.f3599c;
    }

    public float j() {
        return this.f3600d;
    }

    public float k() {
        return this.f3597a;
    }

    public float l() {
        return this.f3598b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        eVar.f3618b = f2;
        eVar.f3619c = f3;
        this.f3603g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, 0.0f);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.f3603g.clear();
        this.f3604h.clear();
        this.i = false;
    }
}
