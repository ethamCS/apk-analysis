package b.q.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import b.g.e.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class h extends b.q.a.a.g {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private C0068h f2824c;

    /* renamed from: d */
    private PorterDuffColorFilter f2825d;

    /* renamed from: e */
    private ColorFilter f2826e;

    /* renamed from: f */
    private boolean f2827f;

    /* renamed from: g */
    private boolean f2828g;

    /* renamed from: h */
    private final float[] f2829h;
    private final Matrix i;
    private final Rect j;

    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2843b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f2842a = b.g.e.c.d(string2);
            }
            this.f2844c = b.g.d.c.g.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // b.q.a.a.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!b.g.d.c.g.r(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray s = b.g.d.c.g.s(resources, theme, attributeSet, b.q.a.a.a.f2803d);
            f(s, xmlPullParser);
            s.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e */
        private int[] f2830e;

        /* renamed from: f */
        b.g.d.c.b f2831f;

        /* renamed from: g */
        float f2832g;

        /* renamed from: h */
        b.g.d.c.b f2833h;
        float i;
        float j;
        float k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        c() {
            this.f2832g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f2832g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.f2830e = cVar.f2830e;
            this.f2831f = cVar.f2831f;
            this.f2832g = cVar.f2832g;
            this.i = cVar.i;
            this.f2833h = cVar.f2833h;
            this.f2844c = cVar.f2844c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        private Paint.Cap e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f2830e = null;
            if (!b.g.d.c.g.r(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2843b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f2842a = b.g.e.c.d(string2);
            }
            this.f2833h = b.g.d.c.g.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.j = b.g.d.c.g.j(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
            this.n = e(b.g.d.c.g.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
            this.o = f(b.g.d.c.g.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
            this.p = b.g.d.c.g.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
            this.f2831f = b.g.d.c.g.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.i = b.g.d.c.g.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
            this.f2832g = b.g.d.c.g.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f2832g);
            this.l = b.g.d.c.g.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
            this.m = b.g.d.c.g.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
            this.k = b.g.d.c.g.j(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
            this.f2844c = b.g.d.c.g.k(typedArray, xmlPullParser, "fillType", 13, this.f2844c);
        }

        @Override // b.q.a.a.h.e
        public boolean a() {
            return this.f2833h.i() || this.f2831f.i();
        }

        @Override // b.q.a.a.h.e
        public boolean b(int[] iArr) {
            return this.f2831f.j(iArr) | this.f2833h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = b.g.d.c.g.s(resources, theme, attributeSet, b.q.a.a.a.f2802c);
            h(s, xmlPullParser, theme);
            s.recycle();
        }

        float getFillAlpha() {
            return this.j;
        }

        int getFillColor() {
            return this.f2833h.e();
        }

        float getStrokeAlpha() {
            return this.i;
        }

        int getStrokeColor() {
            return this.f2831f.e();
        }

        float getStrokeWidth() {
            return this.f2832g;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.k;
        }

        void setFillAlpha(float f2) {
            this.j = f2;
        }

        void setFillColor(int i) {
            this.f2833h.k(i);
        }

        void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        void setStrokeColor(int i) {
            this.f2831f.k(i);
        }

        void setStrokeWidth(float f2) {
            this.f2832g = f2;
        }

        void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        void setTrimPathStart(float f2) {
            this.k = f2;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a */
        final Matrix f2834a;

        /* renamed from: b */
        final ArrayList<e> f2835b;

        /* renamed from: c */
        float f2836c;

        /* renamed from: d */
        private float f2837d;

        /* renamed from: e */
        private float f2838e;

        /* renamed from: f */
        private float f2839f;

        /* renamed from: g */
        private float f2840g;

        /* renamed from: h */
        private float f2841h;
        private float i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public d() {
            super();
            this.f2834a = new Matrix();
            this.f2835b = new ArrayList<>();
            this.f2836c = 0.0f;
            this.f2837d = 0.0f;
            this.f2838e = 0.0f;
            this.f2839f = 1.0f;
            this.f2840g = 1.0f;
            this.f2841h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public d(d dVar, b.d.a<String, Object> aVar) {
            super();
            f fVar;
            this.f2834a = new Matrix();
            this.f2835b = new ArrayList<>();
            this.f2836c = 0.0f;
            this.f2837d = 0.0f;
            this.f2838e = 0.0f;
            this.f2839f = 1.0f;
            this.f2840g = 1.0f;
            this.f2841h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.m = null;
            this.f2836c = dVar.f2836c;
            this.f2837d = dVar.f2837d;
            this.f2838e = dVar.f2838e;
            this.f2839f = dVar.f2839f;
            this.f2840g = dVar.f2840g;
            this.f2841h = dVar.f2841h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.j);
            ArrayList<e> arrayList = dVar.f2835b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f2835b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (!(eVar instanceof b)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        fVar = new b((b) eVar);
                    }
                    this.f2835b.add(fVar);
                    String str2 = fVar.f2843b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.f2837d, -this.f2838e);
            this.j.postScale(this.f2839f, this.f2840g);
            this.j.postRotate(this.f2836c, 0.0f, 0.0f);
            this.j.postTranslate(this.f2841h + this.f2837d, this.i + this.f2838e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f2836c = b.g.d.c.g.j(typedArray, xmlPullParser, "rotation", 5, this.f2836c);
            this.f2837d = typedArray.getFloat(1, this.f2837d);
            this.f2838e = typedArray.getFloat(2, this.f2838e);
            this.f2839f = b.g.d.c.g.j(typedArray, xmlPullParser, "scaleX", 3, this.f2839f);
            this.f2840g = b.g.d.c.g.j(typedArray, xmlPullParser, "scaleY", 4, this.f2840g);
            this.f2841h = b.g.d.c.g.j(typedArray, xmlPullParser, "translateX", 6, this.f2841h);
            this.i = b.g.d.c.g.j(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        @Override // b.q.a.a.h.e
        public boolean a() {
            for (int i = 0; i < this.f2835b.size(); i++) {
                if (this.f2835b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // b.q.a.a.h.e
        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f2835b.size(); i++) {
                z |= this.f2835b.get(i).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = b.g.d.c.g.s(resources, theme, attributeSet, b.q.a.a.a.f2801b);
            e(s, xmlPullParser);
            s.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.f2837d;
        }

        public float getPivotY() {
            return this.f2838e;
        }

        public float getRotation() {
            return this.f2836c;
        }

        public float getScaleX() {
            return this.f2839f;
        }

        public float getScaleY() {
            return this.f2840g;
        }

        public float getTranslateX() {
            return this.f2841h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f2837d) {
                this.f2837d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f2838e) {
                this.f2838e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f2836c) {
                this.f2836c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f2839f) {
                this.f2839f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f2840g) {
                this.f2840g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f2841h) {
                this.f2841h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                d();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a */
        protected c.b[] f2842a;

        /* renamed from: b */
        String f2843b;

        /* renamed from: c */
        int f2844c;

        /* renamed from: d */
        int f2845d;

        public f() {
            super();
            this.f2842a = null;
            this.f2844c = 0;
        }

        public f(f fVar) {
            super();
            this.f2842a = null;
            this.f2844c = 0;
            this.f2843b = fVar.f2843b;
            this.f2845d = fVar.f2845d;
            this.f2842a = b.g.e.c.f(fVar.f2842a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f2842a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f2842a;
        }

        public String getPathName() {
            return this.f2843b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (!b.g.e.c.b(this.f2842a, bVarArr)) {
                this.f2842a = b.g.e.c.f(bVarArr);
            } else {
                b.g.e.c.j(this.f2842a, bVarArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        private static final Matrix q = new Matrix();

        /* renamed from: a */
        private final Path f2846a;

        /* renamed from: b */
        private final Path f2847b;

        /* renamed from: c */
        private final Matrix f2848c;

        /* renamed from: d */
        Paint f2849d;

        /* renamed from: e */
        Paint f2850e;

        /* renamed from: f */
        private PathMeasure f2851f;

        /* renamed from: g */
        private int f2852g;

        /* renamed from: h */
        final d f2853h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final b.d.a<String, Object> p;

        public g() {
            this.f2848c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new b.d.a<>();
            this.f2853h = new d();
            this.f2846a = new Path();
            this.f2847b = new Path();
        }

        public g(g gVar) {
            this.f2848c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            b.d.a<String, Object> aVar = new b.d.a<>();
            this.p = aVar;
            this.f2853h = new d(gVar.f2853h, aVar);
            this.f2846a = new Path(gVar.f2846a);
            this.f2847b = new Path(gVar.f2847b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.f2852g = gVar.f2852g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f2834a.set(matrix);
            dVar.f2834a.preConcat(dVar.j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f2835b.size(); i3++) {
                e eVar = dVar.f2835b.get(i3);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f2834a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f2 = i / this.k;
            float f3 = i2 / this.l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.f2834a;
            this.f2848c.set(matrix);
            this.f2848c.postScale(f2, f3);
            float e2 = e(matrix);
            if (e2 == 0.0f) {
                return;
            }
            fVar.d(this.f2846a);
            Path path = this.f2846a;
            this.f2847b.reset();
            if (fVar.c()) {
                this.f2847b.setFillType(fVar.f2844c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f2847b.addPath(path, this.f2848c);
                canvas.clipPath(this.f2847b);
                return;
            }
            c cVar = (c) fVar;
            float f4 = cVar.k;
            if (f4 != 0.0f || cVar.l != 1.0f) {
                float f5 = cVar.m;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (cVar.l + f5) % 1.0f;
                if (this.f2851f == null) {
                    this.f2851f = new PathMeasure();
                }
                this.f2851f.setPath(this.f2846a, false);
                float length = this.f2851f.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f2851f.getSegment(f8, length, path, true);
                    this.f2851f.getSegment(0.0f, f9, path, true);
                } else {
                    this.f2851f.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f2847b.addPath(path, this.f2848c);
            if (cVar.f2833h.l()) {
                b.g.d.c.b bVar = cVar.f2833h;
                if (this.f2850e == null) {
                    Paint paint = new Paint(1);
                    this.f2850e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f2850e;
                if (bVar.h()) {
                    Shader f10 = bVar.f();
                    f10.setLocalMatrix(this.f2848c);
                    paint2.setShader(f10);
                    paint2.setAlpha(Math.round(cVar.j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(bVar.e(), cVar.j));
                }
                paint2.setColorFilter(colorFilter);
                this.f2847b.setFillType(cVar.f2844c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f2847b, paint2);
            }
            if (!cVar.f2831f.l()) {
                return;
            }
            b.g.d.c.b bVar2 = cVar.f2831f;
            if (this.f2849d == null) {
                Paint paint3 = new Paint(1);
                this.f2849d = paint3;
                paint3.setStyle(Paint.Style.STROKE);
            }
            Paint paint4 = this.f2849d;
            Paint.Join join = cVar.o;
            if (join != null) {
                paint4.setStrokeJoin(join);
            }
            Paint.Cap cap = cVar.n;
            if (cap != null) {
                paint4.setStrokeCap(cap);
            }
            paint4.setStrokeMiter(cVar.p);
            if (bVar2.h()) {
                Shader f11 = bVar2.f();
                f11.setLocalMatrix(this.f2848c);
                paint4.setShader(f11);
                paint4.setAlpha(Math.round(cVar.i * 255.0f));
            } else {
                paint4.setShader(null);
                paint4.setAlpha(255);
                paint4.setColor(h.a(bVar2.e(), cVar.i));
            }
            paint4.setColorFilter(colorFilter);
            paint4.setStrokeWidth(cVar.f2832g * min * e2);
            canvas.drawPath(this.f2847b, paint4);
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c(this.f2853h, q, canvas, i, i2, colorFilter);
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.f2853h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f2853h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.m = i;
        }
    }

    /* renamed from: b.q.a.a.h$h */
    /* loaded from: classes.dex */
    public static class C0068h extends Drawable.ConstantState {

        /* renamed from: a */
        int f2854a;

        /* renamed from: b */
        g f2855b;

        /* renamed from: c */
        ColorStateList f2856c;

        /* renamed from: d */
        PorterDuff.Mode f2857d;

        /* renamed from: e */
        boolean f2858e;

        /* renamed from: f */
        Bitmap f2859f;

        /* renamed from: g */
        ColorStateList f2860g;

        /* renamed from: h */
        PorterDuff.Mode f2861h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public C0068h() {
            this.f2856c = null;
            this.f2857d = h.k;
            this.f2855b = new g();
        }

        public C0068h(C0068h c0068h) {
            this.f2856c = null;
            this.f2857d = h.k;
            if (c0068h != null) {
                this.f2854a = c0068h.f2854a;
                g gVar = new g(c0068h.f2855b);
                this.f2855b = gVar;
                if (c0068h.f2855b.f2850e != null) {
                    gVar.f2850e = new Paint(c0068h.f2855b.f2850e);
                }
                if (c0068h.f2855b.f2849d != null) {
                    this.f2855b.f2849d = new Paint(c0068h.f2855b.f2849d);
                }
                this.f2856c = c0068h.f2856c;
                this.f2857d = c0068h.f2857d;
                this.f2858e = c0068h.f2858e;
            }
        }

        public boolean a(int i, int i2) {
            return i == this.f2859f.getWidth() && i2 == this.f2859f.getHeight();
        }

        public boolean b() {
            return !this.k && this.f2860g == this.f2856c && this.f2861h == this.f2857d && this.j == this.f2858e && this.i == this.f2855b.getRootAlpha();
        }

        public void c(int i, int i2) {
            if (this.f2859f == null || !a(i, i2)) {
                this.f2859f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f2859f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.l == null) {
                    Paint paint = new Paint();
                    this.l = paint;
                    paint.setFilterBitmap(true);
                }
                this.l.setAlpha(this.f2855b.getRootAlpha());
                this.l.setColorFilter(colorFilter);
                return this.l;
            }
            return null;
        }

        public boolean f() {
            return this.f2855b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f2855b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2854a;
        }

        public boolean h(int[] iArr) {
            boolean g2 = this.f2855b.g(iArr);
            this.k |= g2;
            return g2;
        }

        public void i() {
            this.f2860g = this.f2856c;
            this.f2861h = this.f2857d;
            this.i = this.f2855b.getRootAlpha();
            this.j = this.f2858e;
            this.k = false;
        }

        public void j(int i, int i2) {
            this.f2859f.eraseColor(0);
            this.f2855b.b(new Canvas(this.f2859f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f2862a;

        public i(Drawable.ConstantState constantState) {
            this.f2862a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2862a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2862a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f2823b = (VectorDrawable) this.f2862a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f2823b = (VectorDrawable) this.f2862a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f2823b = (VectorDrawable) this.f2862a.newDrawable(resources, theme);
            return hVar;
        }
    }

    h() {
        this.f2828g = true;
        this.f2829h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f2824c = new C0068h();
    }

    h(C0068h c0068h) {
        this.f2828g = true;
        this.f2829h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f2824c = c0068h;
        this.f2825d = j(this.f2825d, c0068h.f2856c, c0068h.f2857d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static h b(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f2823b = b.g.d.c.f.a(resources, i2, theme);
            new i(hVar.f2823b.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return c(resources, xml, asAttributeSet, theme);
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i3;
        b bVar;
        C0068h c0068h = this.f2824c;
        g gVar = c0068h.f2855b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f2853h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2835b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2835b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2835b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = c0068h.f2854a;
                    i3 = dVar2.k;
                    c0068h.f2854a = i3 | i2;
                }
                i2 = c0068h.f2854a;
                i3 = bVar.f2845d;
                c0068h.f2854a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 != 3) {
            if (i2 == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i2 == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i2) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C0068h c0068h = this.f2824c;
        g gVar = c0068h.f2855b;
        c0068h.f2857d = g(b.g.d.c.g.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g2 = b.g.d.c.g.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g2 != null) {
            c0068h.f2856c = g2;
        }
        c0068h.f2858e = b.g.d.c.g.e(typedArray, xmlPullParser, "autoMirrored", 5, c0068h.f2858e);
        gVar.k = b.g.d.c.g.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float j = b.g.d.c.g.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = j;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            gVar.i = typedArray.getDimension(3, gVar.i);
            float dimension = typedArray.getDimension(2, gVar.j);
            gVar.j = dimension;
            if (gVar.i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                gVar.setAlpha(b.g.d.c.g.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string == null) {
                    return;
                }
                gVar.n = string;
                gVar.p.put(string, gVar);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable);
            return false;
        }
        return false;
    }

    public Object d(String str) {
        return this.f2824c.f2855b.p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2826e;
        if (colorFilter == null) {
            colorFilter = this.f2825d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.f2829h);
        float abs = Math.abs(this.f2829h[0]);
        float abs2 = Math.abs(this.f2829h[4]);
        float abs3 = Math.abs(this.f2829h[1]);
        float abs4 = Math.abs(this.f2829h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.j.width() * abs));
        int min2 = Math.min(2048, (int) (this.j.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.j;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        this.f2824c.c(min, min2);
        if (!this.f2828g) {
            this.f2824c.j(min, min2);
        } else if (!this.f2824c.b()) {
            this.f2824c.j(min, min2);
            this.f2824c.i();
        }
        this.f2824c.d(canvas, colorFilter, this.j);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2823b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2824c.f2855b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2824c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2823b;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f2826e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2823b == null || Build.VERSION.SDK_INT < 24) {
            this.f2824c.f2854a = getChangingConfigurations();
            return this.f2824c;
        }
        return new i(this.f2823b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2824c.f2855b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2824c.f2855b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void h(boolean z) {
        this.f2828g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0068h c0068h = this.f2824c;
        c0068h.f2855b = new g();
        TypedArray s = b.g.d.c.g.s(resources, theme, attributeSet, b.q.a.a.a.f2800a);
        i(s, xmlPullParser, theme);
        s.recycle();
        c0068h.f2854a = getChangingConfigurations();
        c0068h.k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f2825d = j(this.f2825d, c0068h.f2856c, c0068h.f2857d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2823b;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f2824c.f2858e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0068h c0068h;
        ColorStateList colorStateList;
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c0068h = this.f2824c) != null && (c0068h.g() || ((colorStateList = this.f2824c.f2856c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2827f && super.mutate() == this) {
            this.f2824c = new C0068h(this.f2824c);
            this.f2827f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0068h c0068h = this.f2824c;
        ColorStateList colorStateList = c0068h.f2856c;
        if (colorStateList != null && (mode = c0068h.f2857d) != null) {
            this.f2825d = j(this.f2825d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!c0068h.g() || !c0068h.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f2824c.f2855b.getRootAlpha() == i2) {
        } else {
            this.f2824c.f2855b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f2824c.f2858e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f2826e = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        C0068h c0068h = this.f2824c;
        if (c0068h.f2856c == colorStateList) {
            return;
        }
        c0068h.f2856c = colorStateList;
        this.f2825d = j(this.f2825d, colorStateList, c0068h.f2857d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        C0068h c0068h = this.f2824c;
        if (c0068h.f2857d == mode) {
            return;
        }
        c0068h.f2857d = mode;
        this.f2825d = j(this.f2825d, c0068h.f2856c, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2823b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2823b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
