package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.b3;
import androidx.camera.core.s1;
import androidx.camera.view.PreviewView;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: g */
    private static final PreviewView.f f2654g = PreviewView.f.FILL_CENTER;

    /* renamed from: a */
    private Size f2655a;

    /* renamed from: b */
    private Rect f2656b;

    /* renamed from: c */
    private int f2657c;

    /* renamed from: d */
    private int f2658d;

    /* renamed from: e */
    private boolean f2659e;

    /* renamed from: f */
    private PreviewView.f f2660f = f2654g;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2661a;

        static {
            int[] iArr = new int[PreviewView.f.values().length];
            f2661a = iArr;
            try {
                iArr[PreviewView.f.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2661a[PreviewView.f.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2661a[PreviewView.f.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2661a[PreviewView.f.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2661a[PreviewView.f.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2661a[PreviewView.f.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static RectF b(RectF rectF, float f10) {
        float f11 = f10 + f10;
        return new RectF(f11 - rectF.right, rectF.top, f11 - rectF.left, rectF.bottom);
    }

    private Size e() {
        return y.d(this.f2657c) ? new Size(this.f2656b.height(), this.f2656b.width()) : new Size(this.f2656b.width(), this.f2656b.height());
    }

    private RectF j(Size size, int i10) {
        androidx.core.util.h.i(k());
        Matrix h10 = h(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, this.f2655a.getWidth(), this.f2655a.getHeight());
        h10.mapRect(rectF);
        return rectF;
    }

    private boolean k() {
        return (this.f2656b == null || this.f2655a == null || this.f2658d == -1) ? false : true;
    }

    private static void n(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.f fVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f2661a[fVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                s1.c("PreviewTransform", "Unexpected crop rect: " + fVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (fVar == PreviewView.f.FIT_CENTER || fVar == PreviewView.f.FIT_START || fVar == PreviewView.f.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            return;
        }
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.invert(matrix);
    }

    public Bitmap a(Bitmap bitmap, Size size, int i10) {
        if (!k()) {
            return bitmap;
        }
        Matrix i11 = i();
        RectF j10 = j(size, i10);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(i11);
        matrix.postScale(j10.width() / this.f2655a.getWidth(), j10.height() / this.f2655a.getHeight());
        matrix.postTranslate(j10.left, j10.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return createBitmap;
    }

    public Matrix c(Size size, int i10) {
        if (!k()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i10).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f2655a.getWidth(), this.f2655a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    RectF d(Size size, int i10) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size e10 = e();
        RectF rectF2 = new RectF(0.0f, 0.0f, e10.getWidth(), e10.getHeight());
        Matrix matrix = new Matrix();
        n(matrix, rectF2, rectF, this.f2660f);
        matrix.mapRect(rectF2);
        return i10 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    public PreviewView.f f() {
        return this.f2660f;
    }

    public Rect g() {
        return this.f2656b;
    }

    public Matrix h(Size size, int i10) {
        androidx.core.util.h.i(k());
        Matrix c10 = y.c(new RectF(this.f2656b), l(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : d(size, i10), this.f2657c);
        if (this.f2659e) {
            if (y.d(this.f2657c)) {
                c10.preScale(1.0f, -1.0f, this.f2656b.centerX(), this.f2656b.centerY());
            } else {
                c10.preScale(-1.0f, 1.0f, this.f2656b.centerX(), this.f2656b.centerY());
            }
        }
        return c10;
    }

    Matrix i() {
        androidx.core.util.h.i(k());
        RectF rectF = new RectF(0.0f, 0.0f, this.f2655a.getWidth(), this.f2655a.getHeight());
        return y.c(rectF, rectF, -y.f(this.f2658d));
    }

    boolean l(Size size) {
        return y.e(size, true, e(), false);
    }

    public void m(int i10, int i11) {
        this.f2657c = i10;
        this.f2658d = i11;
    }

    public void o(PreviewView.f fVar) {
        this.f2660f = fVar;
    }

    public void p(b3.g gVar, Size size, boolean z10) {
        s1.a("PreviewTransform", "Transformation info set: " + gVar + " " + size + " " + z10);
        this.f2656b = gVar.a();
        this.f2657c = gVar.b();
        this.f2658d = gVar.c();
        this.f2655a = size;
        this.f2659e = z10;
    }

    public void q(Size size, int i10, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            s1.k("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
        } else if (!k()) {
        } else {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(i());
            } else {
                Display display = view.getDisplay();
                if (display != null && display.getRotation() != this.f2658d) {
                    s1.c("PreviewTransform", "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                }
            }
            RectF j10 = j(size, i10);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(j10.width() / this.f2655a.getWidth());
            view.setScaleY(j10.height() / this.f2655a.getHeight());
            view.setTranslationX(j10.left - view.getLeft());
            view.setTranslationY(j10.top - view.getTop());
        }
    }
}
