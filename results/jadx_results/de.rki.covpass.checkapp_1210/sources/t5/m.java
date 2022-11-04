package t5;

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
    public float f21901a;
    @Deprecated

    /* renamed from: b */
    public float f21902b;
    @Deprecated

    /* renamed from: c */
    public float f21903c;
    @Deprecated

    /* renamed from: d */
    public float f21904d;
    @Deprecated

    /* renamed from: e */
    public float f21905e;
    @Deprecated

    /* renamed from: f */
    public float f21906f;

    /* renamed from: g */
    private final List<f> f21907g = new ArrayList();

    /* renamed from: h */
    private final List<g> f21908h = new ArrayList();

    /* renamed from: i */
    private boolean f21909i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g {

        /* renamed from: b */
        final /* synthetic */ List f21910b;

        /* renamed from: c */
        final /* synthetic */ Matrix f21911c;

        a(List list, Matrix matrix) {
            m.this = r1;
            this.f21910b = list;
            this.f21911c = matrix;
        }

        @Override // t5.m.g
        public void a(Matrix matrix, s5.a aVar, int i10, Canvas canvas) {
            for (g gVar : this.f21910b) {
                gVar.a(this.f21911c, aVar, i10, canvas);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: b */
        private final d f21913b;

        public b(d dVar) {
            this.f21913b = dVar;
        }

        @Override // t5.m.g
        public void a(Matrix matrix, s5.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f21913b.k(), this.f21913b.o(), this.f21913b.l(), this.f21913b.j()), i10, this.f21913b.m(), this.f21913b.n());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends g {

        /* renamed from: b */
        private final e f21914b;

        /* renamed from: c */
        private final float f21915c;

        /* renamed from: d */
        private final float f21916d;

        public c(e eVar, float f10, float f11) {
            this.f21914b = eVar;
            this.f21915c = f10;
            this.f21916d = f11;
        }

        @Override // t5.m.g
        public void a(Matrix matrix, s5.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f21914b.f21925c - this.f21916d, this.f21914b.f21924b - this.f21915c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f21915c, this.f21916d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f21914b.f21925c - this.f21916d) / (this.f21914b.f21924b - this.f21915c)));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: h */
        private static final RectF f21917h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f21918b;
        @Deprecated

        /* renamed from: c */
        public float f21919c;
        @Deprecated

        /* renamed from: d */
        public float f21920d;
        @Deprecated

        /* renamed from: e */
        public float f21921e;
        @Deprecated

        /* renamed from: f */
        public float f21922f;
        @Deprecated

        /* renamed from: g */
        public float f21923g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        public float j() {
            return this.f21921e;
        }

        public float k() {
            return this.f21918b;
        }

        public float l() {
            return this.f21920d;
        }

        public float m() {
            return this.f21922f;
        }

        public float n() {
            return this.f21923g;
        }

        public float o() {
            return this.f21919c;
        }

        private void p(float f10) {
            this.f21921e = f10;
        }

        private void q(float f10) {
            this.f21918b = f10;
        }

        private void r(float f10) {
            this.f21920d = f10;
        }

        public void s(float f10) {
            this.f21922f = f10;
        }

        public void t(float f10) {
            this.f21923g = f10;
        }

        private void u(float f10) {
            this.f21919c = f10;
        }

        @Override // t5.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f21926a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f21917h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: b */
        private float f21924b;

        /* renamed from: c */
        private float f21925c;

        @Override // t5.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f21926a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f21924b, this.f21925c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a */
        protected final Matrix f21926a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a */
        static final Matrix f21927a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, s5.a aVar, int i10, Canvas canvas);

        public final void b(s5.a aVar, int i10, Canvas canvas) {
            a(f21927a, aVar, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float g10 = ((f10 - g()) + 360.0f) % 360.0f;
        if (g10 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g10);
        this.f21908h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f21908h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f21905e;
    }

    private float h() {
        return this.f21906f;
    }

    private void p(float f10) {
        this.f21905e = f10;
    }

    private void q(float f10) {
        this.f21906f = f10;
    }

    private void r(float f10) {
        this.f21903c = f10;
    }

    private void s(float f10) {
        this.f21904d = f10;
    }

    private void t(float f10) {
        this.f21901a = f10;
    }

    private void u(float f10) {
        this.f21902b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f21907g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f21907g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f21907g.get(i10).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f21909i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f21908h), new Matrix(matrix));
    }

    public float i() {
        return this.f21903c;
    }

    public float j() {
        return this.f21904d;
    }

    public float k() {
        return this.f21901a;
    }

    public float l() {
        return this.f21902b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f21924b = f10;
        eVar.f21925c = f11;
        this.f21907g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f21907g.clear();
        this.f21908h.clear();
        this.f21909i = false;
    }
}
