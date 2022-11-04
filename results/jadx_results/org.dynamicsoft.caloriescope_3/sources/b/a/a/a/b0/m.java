package b.a.a.a.b0;

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
    public float f1194a;
    @Deprecated

    /* renamed from: b */
    public float f1195b;
    @Deprecated

    /* renamed from: c */
    public float f1196c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    private final List<f> g = new ArrayList();
    private final List<g> h = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g {

        /* renamed from: b */
        final /* synthetic */ List f1197b;

        /* renamed from: c */
        final /* synthetic */ Matrix f1198c;

        a(m mVar, List list, Matrix matrix) {
            this.f1197b = list;
            this.f1198c = matrix;
        }

        @Override // b.a.a.a.b0.m.g
        public void a(Matrix matrix, b.a.a.a.a0.a aVar, int i, Canvas canvas) {
            for (g gVar : this.f1197b) {
                gVar.a(this.f1198c, aVar, i, canvas);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: b */
        private final d f1199b;

        public b(d dVar) {
            this.f1199b = dVar;
        }

        @Override // b.a.a.a.b0.m.g
        public void a(Matrix matrix, b.a.a.a.a0.a aVar, int i, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f1199b.b(), this.f1199b.f(), this.f1199b.c(), this.f1199b.a()), i, this.f1199b.d(), this.f1199b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends g {

        /* renamed from: b */
        private final e f1200b;

        /* renamed from: c */
        private final float f1201c;
        private final float d;

        public c(e eVar, float f, float f2) {
            this.f1200b = eVar;
            this.f1201c = f;
            this.d = f2;
        }

        float a() {
            return (float) Math.toDegrees(Math.atan((this.f1200b.f1205c - this.d) / (this.f1200b.f1204b - this.f1201c)));
        }

        @Override // b.a.a.a.b0.m.g
        public void a(Matrix matrix, b.a.a.a.a0.a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f1200b.f1205c - this.d, this.f1200b.f1204b - this.f1201c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f1201c, this.d);
            matrix2.preRotate(a());
            aVar.a(canvas, matrix2, rectF, i);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {
        private static final RectF h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f1202b;
        @Deprecated

        /* renamed from: c */
        public float f1203c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public d(float f, float f2, float f3, float f4) {
            b(f);
            f(f2);
            c(f3);
            a(f4);
        }

        public float a() {
            return this.e;
        }

        private void a(float f) {
            this.e = f;
        }

        public float b() {
            return this.f1202b;
        }

        private void b(float f) {
            this.f1202b = f;
        }

        public float c() {
            return this.d;
        }

        private void c(float f) {
            this.d = f;
        }

        public float d() {
            return this.f;
        }

        public void d(float f) {
            this.f = f;
        }

        public float e() {
            return this.g;
        }

        public void e(float f) {
            this.g = f;
        }

        public float f() {
            return this.f1203c;
        }

        private void f(float f) {
            this.f1203c = f;
        }

        @Override // b.a.a.a.b0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1206a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            h.set(b(), f(), c(), a());
            path.arcTo(h, d(), e(), false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f {

        /* renamed from: b */
        private float f1204b;

        /* renamed from: c */
        private float f1205c;

        @Override // b.a.a.a.b0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1206a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f1204b, this.f1205c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a */
        protected final Matrix f1206a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a */
        static final Matrix f1207a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, b.a.a.a.a0.a aVar, int i, Canvas canvas);

        public final void a(b.a.a.a.a0.a aVar, int i, Canvas canvas) {
            a(f1207a, aVar, i, canvas);
        }
    }

    public m() {
        b(0.0f, 0.0f);
    }

    private void a(float f2) {
        if (e() == f2) {
            return;
        }
        float e2 = ((f2 - e()) + 360.0f) % 360.0f;
        if (e2 > 180.0f) {
            return;
        }
        d dVar = new d(a(), b(), a(), b());
        dVar.d(e());
        dVar.e(e2);
        this.h.add(new b(dVar));
        b(f2);
    }

    private void a(g gVar, float f2, float f3) {
        a(f2);
        this.h.add(gVar);
        b(f3);
    }

    private void b(float f2) {
        this.e = f2;
    }

    private void c(float f2) {
        this.f = f2;
    }

    private void d(float f2) {
        this.f1196c = f2;
    }

    private float e() {
        return this.e;
    }

    private void e(float f2) {
        this.d = f2;
    }

    private float f() {
        return this.f;
    }

    private void f(float f2) {
        this.f1194a = f2;
    }

    private void g(float f2) {
        this.f1195b = f2;
    }

    public float a() {
        return this.f1196c;
    }

    public g a(Matrix matrix) {
        a(f());
        return new a(this, new ArrayList(this.h), matrix);
    }

    public void a(float f2, float f3) {
        e eVar = new e();
        eVar.f1204b = f2;
        eVar.f1205c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, a(), b());
        a(cVar, cVar.a() + 270.0f, cVar.a() + 270.0f);
        d(f2);
        e(f3);
    }

    public void a(float f2, float f3, float f4, float f5) {
        f(f2);
        g(f3);
        d(f2);
        e(f3);
        b(f4);
        c((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.d(f6);
        dVar.e(f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        a(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        d(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        e(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void a(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    public float b() {
        return this.d;
    }

    public void b(float f2, float f3) {
        a(f2, f3, 270.0f, 0.0f);
    }

    public float c() {
        return this.f1194a;
    }

    public float d() {
        return this.f1195b;
    }
}
