package a.n.a.a;

import a.g.e.b;
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
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class i extends a.n.a.a.h {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private h f418c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f423b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f422a = a.g.e.b.a(string2);
            }
            this.f424c = a.g.d.c.g.b(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!a.g.d.c.g.a(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.n.a.a.a.d);
            a(a2, xmlPullParser);
            a2.recycle();
        }

        @Override // a.n.a.a.i.f
        public boolean b() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {
        private int[] e;
        a.g.d.c.b f;
        float g;
        a.g.d.c.b h;
        float i;
        float j;
        float k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        c() {
            this.g = 0.0f;
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
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.f424c = cVar.f424c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        private Paint.Cap a(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join a(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.e = null;
            if (!a.g.d.c.g.a(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f423b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f422a = a.g.e.b.a(string2);
            }
            this.h = a.g.d.c.g.a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.j = a.g.d.c.g.a(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
            this.n = a(a.g.d.c.g.b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
            this.o = a(a.g.d.c.g.b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
            this.p = a.g.d.c.g.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
            this.f = a.g.d.c.g.a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.i = a.g.d.c.g.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
            this.g = a.g.d.c.g.a(typedArray, xmlPullParser, "strokeWidth", 4, this.g);
            this.l = a.g.d.c.g.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
            this.m = a.g.d.c.g.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
            this.k = a.g.d.c.g.a(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
            this.f424c = a.g.d.c.g.b(typedArray, xmlPullParser, "fillType", 13, this.f424c);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.n.a.a.a.f406c);
            a(a2, xmlPullParser, theme);
            a2.recycle();
        }

        @Override // a.n.a.a.i.e
        public boolean a() {
            return this.h.d() || this.f.d();
        }

        @Override // a.n.a.a.i.e
        public boolean a(int[] iArr) {
            return this.f.a(iArr) | this.h.a(iArr);
        }

        float getFillAlpha() {
            return this.j;
        }

        int getFillColor() {
            return this.h.a();
        }

        float getStrokeAlpha() {
            return this.i;
        }

        int getStrokeColor() {
            return this.f.a();
        }

        float getStrokeWidth() {
            return this.g;
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

        void setFillAlpha(float f) {
            this.j = f;
        }

        void setFillColor(int i) {
            this.h.a(i);
        }

        void setStrokeAlpha(float f) {
            this.i = f;
        }

        void setStrokeColor(int i) {
            this.f.a(i);
        }

        void setStrokeWidth(float f) {
            this.g = f;
        }

        void setTrimPathEnd(float f) {
            this.l = f;
        }

        void setTrimPathOffset(float f) {
            this.m = f;
        }

        void setTrimPathStart(float f) {
            this.k = f;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a */
        final Matrix f419a;

        /* renamed from: b */
        final ArrayList<e> f420b;

        /* renamed from: c */
        float f421c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public d() {
            super();
            this.f419a = new Matrix();
            this.f420b = new ArrayList<>();
            this.f421c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public d(d dVar, a.d.a<String, Object> aVar) {
            super();
            f fVar;
            this.f419a = new Matrix();
            this.f420b = new ArrayList<>();
            this.f421c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
            this.f421c = dVar.f421c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.f420b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f420b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (!(eVar instanceof b)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        fVar = new b((b) eVar);
                    }
                    this.f420b.add(fVar);
                    String str2 = fVar.f423b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f421c = a.g.d.c.g.a(typedArray, xmlPullParser, "rotation", 5, this.f421c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = a.g.d.c.g.a(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = a.g.d.c.g.a(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = a.g.d.c.g.a(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = a.g.d.c.g.a(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            b();
        }

        private void b() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.f421c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.n.a.a.a.f405b);
            a(a2, xmlPullParser);
            a2.recycle();
        }

        @Override // a.n.a.a.i.e
        public boolean a() {
            for (int i = 0; i < this.f420b.size(); i++) {
                if (this.f420b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // a.n.a.a.i.e
        public boolean a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f420b.size(); i++) {
                z |= this.f420b.get(i).a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.f421c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f421c) {
                this.f421c = f;
                b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                b();
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

        public boolean a(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a */
        protected b.C0008b[] f422a;

        /* renamed from: b */
        String f423b;

        /* renamed from: c */
        int f424c;
        int d;

        public f() {
            super();
            this.f422a = null;
            this.f424c = 0;
        }

        public f(f fVar) {
            super();
            this.f422a = null;
            this.f424c = 0;
            this.f423b = fVar.f423b;
            this.d = fVar.d;
            this.f422a = a.g.e.b.a(fVar.f422a);
        }

        public void a(Path path) {
            path.reset();
            b.C0008b[] c0008bArr = this.f422a;
            if (c0008bArr != null) {
                b.C0008b.a(c0008bArr, path);
            }
        }

        public boolean b() {
            return false;
        }

        public b.C0008b[] getPathData() {
            return this.f422a;
        }

        public String getPathName() {
            return this.f423b;
        }

        public void setPathData(b.C0008b[] c0008bArr) {
            if (!a.g.e.b.a(this.f422a, c0008bArr)) {
                this.f422a = a.g.e.b.a(c0008bArr);
            } else {
                a.g.e.b.b(this.f422a, c0008bArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        private static final Matrix q = new Matrix();

        /* renamed from: a */
        private final Path f425a;

        /* renamed from: b */
        private final Path f426b;

        /* renamed from: c */
        private final Matrix f427c;
        Paint d;
        Paint e;
        private PathMeasure f;
        private int g;
        final d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final a.d.a<String, Object> p;

        public g() {
            this.f427c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new a.d.a<>();
            this.h = new d();
            this.f425a = new Path();
            this.f426b = new Path();
        }

        public g(g gVar) {
            this.f427c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            a.d.a<String, Object> aVar = new a.d.a<>();
            this.p = aVar;
            this.h = new d(gVar.h, aVar);
            this.f425a = new Path(gVar.f425a);
            this.f426b = new Path(gVar.f426b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private float a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        private void a(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.k;
            float f2 = i2 / this.l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f419a;
            this.f427c.set(matrix);
            this.f427c.postScale(f, f2);
            float a2 = a(matrix);
            if (a2 == 0.0f) {
                return;
            }
            fVar.a(this.f425a);
            Path path = this.f425a;
            this.f426b.reset();
            if (fVar.b()) {
                this.f426b.setFillType(fVar.f424c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f426b.addPath(path, this.f427c);
                canvas.clipPath(this.f426b);
                return;
            }
            c cVar = (c) fVar;
            if (cVar.k != 0.0f || cVar.l != 1.0f) {
                float f3 = cVar.k;
                float f4 = cVar.m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (cVar.l + f4) % 1.0f;
                if (this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.f425a, false);
                float length = this.f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f.getSegment(f7, length, path, true);
                    this.f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f426b.addPath(path, this.f427c);
            if (cVar.h.e()) {
                a.g.d.c.b bVar = cVar.h;
                if (this.e == null) {
                    Paint paint = new Paint(1);
                    this.e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.e;
                if (bVar.c()) {
                    Shader b2 = bVar.b();
                    b2.setLocalMatrix(this.f427c);
                    paint2.setShader(b2);
                    paint2.setAlpha(Math.round(cVar.j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(bVar.a(), cVar.j));
                }
                paint2.setColorFilter(colorFilter);
                this.f426b.setFillType(cVar.f424c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f426b, paint2);
            }
            if (!cVar.f.e()) {
                return;
            }
            a.g.d.c.b bVar2 = cVar.f;
            if (this.d == null) {
                Paint paint3 = new Paint(1);
                this.d = paint3;
                paint3.setStyle(Paint.Style.STROKE);
            }
            Paint paint4 = this.d;
            Paint.Join join = cVar.o;
            if (join != null) {
                paint4.setStrokeJoin(join);
            }
            Paint.Cap cap = cVar.n;
            if (cap != null) {
                paint4.setStrokeCap(cap);
            }
            paint4.setStrokeMiter(cVar.p);
            if (bVar2.c()) {
                Shader b3 = bVar2.b();
                b3.setLocalMatrix(this.f427c);
                paint4.setShader(b3);
                paint4.setAlpha(Math.round(cVar.i * 255.0f));
            } else {
                paint4.setShader(null);
                paint4.setAlpha(255);
                paint4.setColor(i.a(bVar2.a(), cVar.i));
            }
            paint4.setColorFilter(colorFilter);
            paint4.setStrokeWidth(cVar.g * min * a2);
            canvas.drawPath(this.f426b, paint4);
        }

        private void a(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f419a.set(matrix);
            dVar.f419a.preConcat(dVar.j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f420b.size(); i3++) {
                e eVar = dVar.f420b.get(i3);
                if (eVar instanceof d) {
                    a((d) eVar, dVar.f419a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    a(dVar, (f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            a(this.h, q, canvas, i, i2, colorFilter);
        }

        public boolean a() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean a(int[] iArr) {
            return this.h.a(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.m = i;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        int f428a;

        /* renamed from: b */
        g f429b;

        /* renamed from: c */
        ColorStateList f430c;
        PorterDuff.Mode d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public h() {
            this.f430c = null;
            this.d = i.k;
            this.f429b = new g();
        }

        public h(h hVar) {
            this.f430c = null;
            this.d = i.k;
            if (hVar != null) {
                this.f428a = hVar.f428a;
                g gVar = new g(hVar.f429b);
                this.f429b = gVar;
                if (hVar.f429b.e != null) {
                    gVar.e = new Paint(hVar.f429b.e);
                }
                if (hVar.f429b.d != null) {
                    this.f429b.d = new Paint(hVar.f429b.d);
                }
                this.f430c = hVar.f430c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public Paint a(ColorFilter colorFilter) {
            if (b() || colorFilter != null) {
                if (this.l == null) {
                    Paint paint = new Paint();
                    this.l = paint;
                    paint.setFilterBitmap(true);
                }
                this.l.setAlpha(this.f429b.getRootAlpha());
                this.l.setColorFilter(colorFilter);
                return this.l;
            }
            return null;
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, a(colorFilter));
        }

        public boolean a() {
            return !this.k && this.g == this.f430c && this.h == this.d && this.j == this.e && this.i == this.f429b.getRootAlpha();
        }

        public boolean a(int i, int i2) {
            return i == this.f.getWidth() && i2 == this.f.getHeight();
        }

        public boolean a(int[] iArr) {
            boolean a2 = this.f429b.a(iArr);
            this.k |= a2;
            return a2;
        }

        public void b(int i, int i2) {
            if (this.f == null || !a(i, i2)) {
                this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean b() {
            return this.f429b.getRootAlpha() < 255;
        }

        public void c(int i, int i2) {
            this.f.eraseColor(0);
            this.f429b.a(new Canvas(this.f), i, i2, (ColorFilter) null);
        }

        public boolean c() {
            return this.f429b.a();
        }

        public void d() {
            this.g = this.f430c;
            this.h = this.d;
            this.i = this.f429b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f428a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.n.a.a.i$i */
    /* loaded from: classes.dex */
    public static class C0028i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f431a;

        public C0028i(Drawable.ConstantState constantState) {
            this.f431a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f431a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f431a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f417b = (VectorDrawable) this.f431a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f417b = (VectorDrawable) this.f431a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f417b = (VectorDrawable) this.f431a.newDrawable(resources, theme);
            return iVar;
        }
    }

    i() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f418c = new h();
    }

    i(h hVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f418c = hVar;
        this.d = a(this.d, hVar.f430c, hVar.d);
    }

    static int a(int i, float f2) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f2)) << 24);
    }

    public static i a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f417b = a.g.d.c.f.a(resources, i, theme);
            new C0028i(iVar.f417b.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
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
            return createFromXmlInner(resources, (XmlPullParser) xml, asAttributeSet, theme);
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    private static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
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

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        b bVar;
        h hVar = this.f418c;
        g gVar = hVar.f429b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f420b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f420b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f420b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    i = hVar.f428a;
                    i2 = dVar2.k;
                    hVar.f428a = i2 | i;
                }
                i = hVar.f428a;
                i2 = bVar.d;
                hVar.f428a = i2 | i;
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

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f418c;
        g gVar = hVar.f429b;
        hVar.d = a(a.g.d.c.g.b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList a2 = a.g.d.c.g.a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a2 != null) {
            hVar.f430c = a2;
        }
        hVar.e = a.g.d.c.g.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.e);
        gVar.k = a.g.d.c.g.a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float a3 = a.g.d.c.g.a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = a3;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (a3 <= 0.0f) {
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
                gVar.setAlpha(a.g.d.c.g.a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string == null) {
                    return;
                }
                gVar.n = string;
                gVar.p.put(string, gVar);
            }
        }
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    public static i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public Object a(String str) {
        return this.f418c.f429b.p.get(str);
    }

    public void a(boolean z) {
        this.g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.e;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float abs = Math.abs(this.h[0]);
        float abs2 = Math.abs(this.h[4]);
        float abs3 = Math.abs(this.h[1]);
        float abs4 = Math.abs(this.h[3]);
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
        if (a()) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        this.f418c.b(min, min2);
        if (!this.g) {
            this.f418c.c(min, min2);
        } else if (!this.f418c.a()) {
            this.f418c.c(min, min2);
            this.f418c.d();
        }
        this.f418c.a(canvas, colorFilter, this.j);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f417b;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f418c.f429b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f417b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f418c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f417b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f417b == null || Build.VERSION.SDK_INT < 24) {
            this.f418c.f428a = getChangingConfigurations();
            return this.f418c;
        }
        return new C0028i(this.f417b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f417b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f418c.f429b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f417b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f418c.f429b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f418c;
        hVar.f429b = new g();
        TypedArray a2 = a.g.d.c.g.a(resources, theme, attributeSet, a.n.a.a.a.f404a);
        a(a2, xmlPullParser, theme);
        a2.recycle();
        hVar.f428a = getChangingConfigurations();
        hVar.k = true;
        a(resources, xmlPullParser, attributeSet, theme);
        this.d = a(this.d, hVar.f430c, hVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f417b;
        return drawable != null ? androidx.core.graphics.drawable.a.f(drawable) : this.f418c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f417b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f418c) != null && (hVar.c() || ((colorStateList = this.f418c.f430c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.f418c = new h(this.f418c);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f417b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f418c;
        ColorStateList colorStateList = hVar.f430c;
        if (colorStateList != null && (mode = hVar.d) != null) {
            this.d = a(this.d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.c() || !hVar.a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f418c.f429b.getRootAlpha() == i) {
        } else {
            this.f418c.f429b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, z);
        } else {
            this.f418c.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
            return;
        }
        h hVar = this.f418c;
        if (hVar.f430c == colorStateList) {
            return;
        }
        hVar.f430c = colorStateList;
        this.d = a(this.d, colorStateList, hVar.d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
            return;
        }
        h hVar = this.f418c;
        if (hVar.d == mode) {
            return;
        }
        hVar.d = mode;
        this.d = a(this.d, hVar.f430c, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f417b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f417b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
