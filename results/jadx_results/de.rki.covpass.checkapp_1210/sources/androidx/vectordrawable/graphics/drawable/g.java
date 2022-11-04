package androidx.vectordrawable.graphics.drawable;

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
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.k;
import androidx.core.graphics.d;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class g extends androidx.vectordrawable.graphics.drawable.f {
    static final PorterDuff.Mode Z3 = PorterDuff.Mode.SRC_IN;
    private boolean U3;
    private Drawable.ConstantState V3;
    private final float[] W3;
    private final Matrix X3;
    private final Rect Y3;

    /* renamed from: d */
    private h f5069d;

    /* renamed from: q */
    private PorterDuffColorFilter f5070q;

    /* renamed from: x */
    private ColorFilter f5071x;

    /* renamed from: y */
    private boolean f5072y;

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
                this.f5099b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f5098a = androidx.core.graphics.d.d(string2);
            }
            this.f5100c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!k.j(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f5046d);
            f(k10, xmlPullParser);
            k10.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e */
        private int[] f5073e;

        /* renamed from: f */
        androidx.core.content.res.d f5074f;

        /* renamed from: g */
        float f5075g;

        /* renamed from: h */
        androidx.core.content.res.d f5076h;

        /* renamed from: i */
        float f5077i;

        /* renamed from: j */
        float f5078j;

        /* renamed from: k */
        float f5079k;

        /* renamed from: l */
        float f5080l;

        /* renamed from: m */
        float f5081m;

        /* renamed from: n */
        Paint.Cap f5082n;

        /* renamed from: o */
        Paint.Join f5083o;

        /* renamed from: p */
        float f5084p;

        c() {
            this.f5075g = 0.0f;
            this.f5077i = 1.0f;
            this.f5078j = 1.0f;
            this.f5079k = 0.0f;
            this.f5080l = 1.0f;
            this.f5081m = 0.0f;
            this.f5082n = Paint.Cap.BUTT;
            this.f5083o = Paint.Join.MITER;
            this.f5084p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f5075g = 0.0f;
            this.f5077i = 1.0f;
            this.f5078j = 1.0f;
            this.f5079k = 0.0f;
            this.f5080l = 1.0f;
            this.f5081m = 0.0f;
            this.f5082n = Paint.Cap.BUTT;
            this.f5083o = Paint.Join.MITER;
            this.f5084p = 4.0f;
            this.f5073e = cVar.f5073e;
            this.f5074f = cVar.f5074f;
            this.f5075g = cVar.f5075g;
            this.f5077i = cVar.f5077i;
            this.f5076h = cVar.f5076h;
            this.f5100c = cVar.f5100c;
            this.f5078j = cVar.f5078j;
            this.f5079k = cVar.f5079k;
            this.f5080l = cVar.f5080l;
            this.f5081m = cVar.f5081m;
            this.f5082n = cVar.f5082n;
            this.f5083o = cVar.f5083o;
            this.f5084p = cVar.f5084p;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f5073e = null;
            if (!k.j(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5099b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f5098a = androidx.core.graphics.d.d(string2);
            }
            this.f5076h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.f5078j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f5078j);
            this.f5082n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5082n);
            this.f5083o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5083o);
            this.f5084p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5084p);
            this.f5074f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.f5077i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5077i);
            this.f5075g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f5075g);
            this.f5080l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5080l);
            this.f5081m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5081m);
            this.f5079k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f5079k);
            this.f5100c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f5100c);
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            return this.f5076h.i() || this.f5074f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            return this.f5074f.j(iArr) | this.f5076h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f5045c);
            h(k10, xmlPullParser, theme);
            k10.recycle();
        }

        float getFillAlpha() {
            return this.f5078j;
        }

        int getFillColor() {
            return this.f5076h.e();
        }

        float getStrokeAlpha() {
            return this.f5077i;
        }

        int getStrokeColor() {
            return this.f5074f.e();
        }

        float getStrokeWidth() {
            return this.f5075g;
        }

        float getTrimPathEnd() {
            return this.f5080l;
        }

        float getTrimPathOffset() {
            return this.f5081m;
        }

        float getTrimPathStart() {
            return this.f5079k;
        }

        void setFillAlpha(float f10) {
            this.f5078j = f10;
        }

        void setFillColor(int i10) {
            this.f5076h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f5077i = f10;
        }

        void setStrokeColor(int i10) {
            this.f5074f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f5075g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f5080l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f5081m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f5079k = f10;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a */
        final Matrix f5085a;

        /* renamed from: b */
        final ArrayList<e> f5086b;

        /* renamed from: c */
        float f5087c;

        /* renamed from: d */
        private float f5088d;

        /* renamed from: e */
        private float f5089e;

        /* renamed from: f */
        private float f5090f;

        /* renamed from: g */
        private float f5091g;

        /* renamed from: h */
        private float f5092h;

        /* renamed from: i */
        private float f5093i;

        /* renamed from: j */
        final Matrix f5094j;

        /* renamed from: k */
        int f5095k;

        /* renamed from: l */
        private int[] f5096l;

        /* renamed from: m */
        private String f5097m;

        public d() {
            super();
            this.f5085a = new Matrix();
            this.f5086b = new ArrayList<>();
            this.f5087c = 0.0f;
            this.f5088d = 0.0f;
            this.f5089e = 0.0f;
            this.f5090f = 1.0f;
            this.f5091g = 1.0f;
            this.f5092h = 0.0f;
            this.f5093i = 0.0f;
            this.f5094j = new Matrix();
            this.f5097m = null;
        }

        public d(d dVar, i0.a<String, Object> aVar) {
            super();
            f fVar;
            this.f5085a = new Matrix();
            this.f5086b = new ArrayList<>();
            this.f5087c = 0.0f;
            this.f5088d = 0.0f;
            this.f5089e = 0.0f;
            this.f5090f = 1.0f;
            this.f5091g = 1.0f;
            this.f5092h = 0.0f;
            this.f5093i = 0.0f;
            Matrix matrix = new Matrix();
            this.f5094j = matrix;
            this.f5097m = null;
            this.f5087c = dVar.f5087c;
            this.f5088d = dVar.f5088d;
            this.f5089e = dVar.f5089e;
            this.f5090f = dVar.f5090f;
            this.f5091g = dVar.f5091g;
            this.f5092h = dVar.f5092h;
            this.f5093i = dVar.f5093i;
            this.f5096l = dVar.f5096l;
            String str = dVar.f5097m;
            this.f5097m = str;
            this.f5095k = dVar.f5095k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f5094j);
            ArrayList<e> arrayList = dVar.f5086b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f5086b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (!(eVar instanceof b)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        fVar = new b((b) eVar);
                    }
                    this.f5086b.add(fVar);
                    String str2 = fVar.f5099b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.f5094j.reset();
            this.f5094j.postTranslate(-this.f5088d, -this.f5089e);
            this.f5094j.postScale(this.f5090f, this.f5091g);
            this.f5094j.postRotate(this.f5087c, 0.0f, 0.0f);
            this.f5094j.postTranslate(this.f5092h + this.f5088d, this.f5093i + this.f5089e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5096l = null;
            this.f5087c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f5087c);
            this.f5088d = typedArray.getFloat(1, this.f5088d);
            this.f5089e = typedArray.getFloat(2, this.f5089e);
            this.f5090f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f5090f);
            this.f5091g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f5091g);
            this.f5092h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f5092h);
            this.f5093i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f5093i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5097m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f5086b.size(); i10++) {
                if (this.f5086b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f5086b.size(); i10++) {
                z10 |= this.f5086b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f5044b);
            e(k10, xmlPullParser);
            k10.recycle();
        }

        public String getGroupName() {
            return this.f5097m;
        }

        public Matrix getLocalMatrix() {
            return this.f5094j;
        }

        public float getPivotX() {
            return this.f5088d;
        }

        public float getPivotY() {
            return this.f5089e;
        }

        public float getRotation() {
            return this.f5087c;
        }

        public float getScaleX() {
            return this.f5090f;
        }

        public float getScaleY() {
            return this.f5091g;
        }

        public float getTranslateX() {
            return this.f5092h;
        }

        public float getTranslateY() {
            return this.f5093i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f5088d) {
                this.f5088d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f5089e) {
                this.f5089e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f5087c) {
                this.f5087c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f5090f) {
                this.f5090f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f5091g) {
                this.f5091g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f5092h) {
                this.f5092h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f5093i) {
                this.f5093i = f10;
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
        protected d.b[] f5098a;

        /* renamed from: b */
        String f5099b;

        /* renamed from: c */
        int f5100c;

        /* renamed from: d */
        int f5101d;

        public f() {
            super();
            this.f5098a = null;
            this.f5100c = 0;
        }

        public f(f fVar) {
            super();
            this.f5098a = null;
            this.f5100c = 0;
            this.f5099b = fVar.f5099b;
            this.f5101d = fVar.f5101d;
            this.f5098a = androidx.core.graphics.d.f(fVar.f5098a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f5098a;
            if (bVarArr != null) {
                d.b.e(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f5098a;
        }

        public String getPathName() {
            return this.f5099b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (!androidx.core.graphics.d.b(this.f5098a, bVarArr)) {
                this.f5098a = androidx.core.graphics.d.f(bVarArr);
            } else {
                androidx.core.graphics.d.j(this.f5098a, bVarArr);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.g$g */
    /* loaded from: classes.dex */
    public static class C0065g {

        /* renamed from: q */
        private static final Matrix f5102q = new Matrix();

        /* renamed from: a */
        private final Path f5103a;

        /* renamed from: b */
        private final Path f5104b;

        /* renamed from: c */
        private final Matrix f5105c;

        /* renamed from: d */
        Paint f5106d;

        /* renamed from: e */
        Paint f5107e;

        /* renamed from: f */
        private PathMeasure f5108f;

        /* renamed from: g */
        private int f5109g;

        /* renamed from: h */
        final d f5110h;

        /* renamed from: i */
        float f5111i;

        /* renamed from: j */
        float f5112j;

        /* renamed from: k */
        float f5113k;

        /* renamed from: l */
        float f5114l;

        /* renamed from: m */
        int f5115m;

        /* renamed from: n */
        String f5116n;

        /* renamed from: o */
        Boolean f5117o;

        /* renamed from: p */
        final i0.a<String, Object> f5118p;

        public C0065g() {
            this.f5105c = new Matrix();
            this.f5111i = 0.0f;
            this.f5112j = 0.0f;
            this.f5113k = 0.0f;
            this.f5114l = 0.0f;
            this.f5115m = 255;
            this.f5116n = null;
            this.f5117o = null;
            this.f5118p = new i0.a<>();
            this.f5110h = new d();
            this.f5103a = new Path();
            this.f5104b = new Path();
        }

        public C0065g(C0065g c0065g) {
            this.f5105c = new Matrix();
            this.f5111i = 0.0f;
            this.f5112j = 0.0f;
            this.f5113k = 0.0f;
            this.f5114l = 0.0f;
            this.f5115m = 255;
            this.f5116n = null;
            this.f5117o = null;
            i0.a<String, Object> aVar = new i0.a<>();
            this.f5118p = aVar;
            this.f5110h = new d(c0065g.f5110h, aVar);
            this.f5103a = new Path(c0065g.f5103a);
            this.f5104b = new Path(c0065g.f5104b);
            this.f5111i = c0065g.f5111i;
            this.f5112j = c0065g.f5112j;
            this.f5113k = c0065g.f5113k;
            this.f5114l = c0065g.f5114l;
            this.f5109g = c0065g.f5109g;
            this.f5115m = c0065g.f5115m;
            this.f5116n = c0065g.f5116n;
            String str = c0065g.f5116n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f5117o = c0065g.f5117o;
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f5085a.set(matrix);
            dVar.f5085a.preConcat(dVar.f5094j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f5086b.size(); i12++) {
                e eVar = dVar.f5086b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f5085a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f5113k;
            float f11 = i11 / this.f5114l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f5085a;
            this.f5105c.set(matrix);
            this.f5105c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 == 0.0f) {
                return;
            }
            fVar.d(this.f5103a);
            Path path = this.f5103a;
            this.f5104b.reset();
            if (fVar.c()) {
                this.f5104b.setFillType(fVar.f5100c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f5104b.addPath(path, this.f5105c);
                canvas.clipPath(this.f5104b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f5079k;
            if (f12 != 0.0f || cVar.f5080l != 1.0f) {
                float f13 = cVar.f5081m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f5080l + f13) % 1.0f;
                if (this.f5108f == null) {
                    this.f5108f = new PathMeasure();
                }
                this.f5108f.setPath(this.f5103a, false);
                float length = this.f5108f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f5108f.getSegment(f16, length, path, true);
                    this.f5108f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f5108f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f5104b.addPath(path, this.f5105c);
            if (cVar.f5076h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f5076h;
                if (this.f5107e == null) {
                    Paint paint = new Paint(1);
                    this.f5107e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f5107e;
                if (dVar2.h()) {
                    Shader f18 = dVar2.f();
                    f18.setLocalMatrix(this.f5105c);
                    paint2.setShader(f18);
                    paint2.setAlpha(Math.round(cVar.f5078j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f5078j));
                }
                paint2.setColorFilter(colorFilter);
                this.f5104b.setFillType(cVar.f5100c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f5104b, paint2);
            }
            if (!cVar.f5074f.l()) {
                return;
            }
            androidx.core.content.res.d dVar3 = cVar.f5074f;
            if (this.f5106d == null) {
                Paint paint3 = new Paint(1);
                this.f5106d = paint3;
                paint3.setStyle(Paint.Style.STROKE);
            }
            Paint paint4 = this.f5106d;
            Paint.Join join = cVar.f5083o;
            if (join != null) {
                paint4.setStrokeJoin(join);
            }
            Paint.Cap cap = cVar.f5082n;
            if (cap != null) {
                paint4.setStrokeCap(cap);
            }
            paint4.setStrokeMiter(cVar.f5084p);
            if (dVar3.h()) {
                Shader f19 = dVar3.f();
                f19.setLocalMatrix(this.f5105c);
                paint4.setShader(f19);
                paint4.setAlpha(Math.round(cVar.f5077i * 255.0f));
            } else {
                paint4.setShader(null);
                paint4.setAlpha(255);
                paint4.setColor(g.a(dVar3.e(), cVar.f5077i));
            }
            paint4.setColorFilter(colorFilter);
            paint4.setStrokeWidth(cVar.f5075g * min * e10);
            canvas.drawPath(this.f5104b, paint4);
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f5110h, f5102q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f5117o == null) {
                this.f5117o = Boolean.valueOf(this.f5110h.a());
            }
            return this.f5117o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f5110h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5115m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f5115m = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        int f5119a;

        /* renamed from: b */
        C0065g f5120b;

        /* renamed from: c */
        ColorStateList f5121c;

        /* renamed from: d */
        PorterDuff.Mode f5122d;

        /* renamed from: e */
        boolean f5123e;

        /* renamed from: f */
        Bitmap f5124f;

        /* renamed from: g */
        ColorStateList f5125g;

        /* renamed from: h */
        PorterDuff.Mode f5126h;

        /* renamed from: i */
        int f5127i;

        /* renamed from: j */
        boolean f5128j;

        /* renamed from: k */
        boolean f5129k;

        /* renamed from: l */
        Paint f5130l;

        public h() {
            this.f5121c = null;
            this.f5122d = g.Z3;
            this.f5120b = new C0065g();
        }

        public h(h hVar) {
            this.f5121c = null;
            this.f5122d = g.Z3;
            if (hVar != null) {
                this.f5119a = hVar.f5119a;
                C0065g c0065g = new C0065g(hVar.f5120b);
                this.f5120b = c0065g;
                if (hVar.f5120b.f5107e != null) {
                    c0065g.f5107e = new Paint(hVar.f5120b.f5107e);
                }
                if (hVar.f5120b.f5106d != null) {
                    this.f5120b.f5106d = new Paint(hVar.f5120b.f5106d);
                }
                this.f5121c = hVar.f5121c;
                this.f5122d = hVar.f5122d;
                this.f5123e = hVar.f5123e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f5124f.getWidth() && i11 == this.f5124f.getHeight();
        }

        public boolean b() {
            return !this.f5129k && this.f5125g == this.f5121c && this.f5126h == this.f5122d && this.f5128j == this.f5123e && this.f5127i == this.f5120b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f5124f == null || !a(i10, i11)) {
                this.f5124f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f5129k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5124f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.f5130l == null) {
                    Paint paint = new Paint();
                    this.f5130l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f5130l.setAlpha(this.f5120b.getRootAlpha());
                this.f5130l.setColorFilter(colorFilter);
                return this.f5130l;
            }
            return null;
        }

        public boolean f() {
            return this.f5120b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f5120b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5119a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f5120b.g(iArr);
            this.f5129k |= g10;
            return g10;
        }

        public void i() {
            this.f5125g = this.f5121c;
            this.f5126h = this.f5122d;
            this.f5127i = this.f5120b.getRootAlpha();
            this.f5128j = this.f5123e;
            this.f5129k = false;
        }

        public void j(int i10, int i11) {
            this.f5124f.eraseColor(0);
            this.f5120b.b(new Canvas(this.f5124f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5131a;

        public i(Drawable.ConstantState constantState) {
            this.f5131a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f5131a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5131a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f5068c = (VectorDrawable) this.f5131a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f5068c = (VectorDrawable) this.f5131a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f5068c = (VectorDrawable) this.f5131a.newDrawable(resources, theme);
            return gVar;
        }
    }

    g() {
        this.U3 = true;
        this.W3 = new float[9];
        this.X3 = new Matrix();
        this.Y3 = new Rect();
        this.f5069d = new h();
    }

    g(h hVar) {
        this.U3 = true;
        this.W3 = new float[9];
        this.X3 = new Matrix();
        this.Y3 = new Rect();
        this.f5069d = hVar;
        this.f5070q = j(this.f5070q, hVar.f5121c, hVar.f5122d);
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static g b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            g gVar = new g();
            gVar.f5068c = androidx.core.content.res.h.e(resources, i10, theme);
            gVar.V3 = new i(gVar.f5068c.getConstantState());
            return gVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
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
        } catch (IOException | XmlPullParserException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        }
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        int i11;
        b bVar;
        h hVar = this.f5069d;
        C0065g c0065g = hVar.f5120b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0065g.f5110h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5086b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0065g.f5118p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5086b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        c0065g.f5118p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5086b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        c0065g.f5118p.put(dVar2.getGroupName(), dVar2);
                    }
                    i10 = hVar.f5119a;
                    i11 = dVar2.f5095k;
                    hVar.f5119a = i11 | i10;
                }
                i10 = hVar.f5119a;
                i11 = bVar.f5101d;
                hVar.f5119a = i11 | i10;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z10) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i10 == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i10) {
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
        h hVar = this.f5069d;
        C0065g c0065g = hVar.f5120b;
        hVar.f5122d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            hVar.f5121c = c10;
        }
        hVar.f5123e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f5123e);
        c0065g.f5113k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, c0065g.f5113k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, c0065g.f5114l);
        c0065g.f5114l = f10;
        if (c0065g.f5113k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            c0065g.f5111i = typedArray.getDimension(3, c0065g.f5111i);
            float dimension = typedArray.getDimension(2, c0065g.f5112j);
            c0065g.f5112j = dimension;
            if (c0065g.f5111i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                c0065g.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, c0065g.getAlpha()));
                String string = typedArray.getString(0);
                if (string == null) {
                    return;
                }
                c0065g.f5116n = string;
                c0065g.f5118p.put(string, c0065g);
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public Object d(String str) {
        return this.f5069d.f5120b.f5118p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.Y3);
        if (this.Y3.width() <= 0 || this.Y3.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f5071x;
        if (colorFilter == null) {
            colorFilter = this.f5070q;
        }
        canvas.getMatrix(this.X3);
        this.X3.getValues(this.W3);
        float abs = Math.abs(this.W3[0]);
        float abs2 = Math.abs(this.W3[4]);
        float abs3 = Math.abs(this.W3[1]);
        float abs4 = Math.abs(this.W3[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.Y3.width() * abs));
        int min2 = Math.min(2048, (int) (this.Y3.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.Y3;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.Y3.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.Y3.offsetTo(0, 0);
        this.f5069d.c(min, min2);
        if (!this.U3) {
            this.f5069d.j(min, min2);
        } else if (!this.f5069d.b()) {
            this.f5069d.j(min, min2);
            this.f5069d.i();
        }
        this.f5069d.d(canvas, colorFilter, this.Y3);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f5068c;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f5069d.f5120b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f5068c;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5069d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5068c;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f5071x;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f5068c == null || Build.VERSION.SDK_INT < 24) {
            this.f5069d.f5119a = getChangingConfigurations();
            return this.f5069d;
        }
        return new i(this.f5068c.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f5068c;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f5069d.f5120b.f5112j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5068c;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f5069d.f5120b.f5111i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void h(boolean z10) {
        this.U3 = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f5069d;
        hVar.f5120b = new C0065g();
        TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f5043a);
        i(k10, xmlPullParser, theme);
        k10.recycle();
        hVar.f5119a = getChangingConfigurations();
        hVar.f5129k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f5070q = j(this.f5070q, hVar.f5121c, hVar.f5122d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5068c;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f5069d.f5123e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f5068c;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f5069d) != null && (hVar.g() || ((colorStateList = this.f5069d.f5121c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5072y && super.mutate() == this) {
            this.f5069d = new h(this.f5069d);
            this.f5072y = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f5069d;
        ColorStateList colorStateList = hVar.f5121c;
        if (colorStateList != null && (mode = hVar.f5122d) != null) {
            this.f5070q = j(this.f5070q, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f5069d.f5120b.getRootAlpha() == i10) {
        } else {
            this.f5069d.f5120b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f5069d.f5123e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5071x = colorFilter;
        invalidateSelf();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f5069d;
        if (hVar.f5121c == colorStateList) {
            return;
        }
        hVar.f5121c = colorStateList;
        this.f5070q = j(this.f5070q, colorStateList, hVar.f5122d);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.f5069d;
        if (hVar.f5122d == mode) {
            return;
        }
        hVar.f5122d = mode;
        this.f5070q = j(this.f5070q, hVar.f5121c, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f5068c;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5068c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
