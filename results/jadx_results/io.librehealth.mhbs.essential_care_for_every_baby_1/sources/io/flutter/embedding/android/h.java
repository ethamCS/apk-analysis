package io.flutter.embedding.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
@TargetApi(19)
/* loaded from: classes.dex */
public class h extends View implements io.flutter.embedding.engine.renderer.c {

    /* renamed from: a */
    private ImageReader f877a;

    /* renamed from: b */
    private Image f878b;

    /* renamed from: c */
    private Bitmap f879c;

    /* renamed from: d */
    private io.flutter.embedding.engine.renderer.a f880d;

    /* renamed from: e */
    private b f881e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f882a;

        static {
            int[] iArr = new int[b.values().length];
            f882a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f882a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        background,
        overlay
    }

    public h(Context context, int i, int i2, b bVar) {
        this(context, f(i, i2), bVar);
    }

    h(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f = false;
        this.f877a = imageReader;
        this.f881e = bVar;
        g();
    }

    private void e() {
        Image image = this.f878b;
        if (image != null) {
            image.close();
            this.f878b = null;
        }
    }

    @TargetApi(19)
    private static ImageReader f(int i, int i2) {
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i, i2, 1, 3, 768L) : ImageReader.newInstance(i, i2, 1, 3);
    }

    private void g() {
        setAlpha(0.0f);
    }

    @TargetApi(29)
    private void i() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f878b.getHardwareBuffer();
            this.f879c = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f878b.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f878b.getHeight();
        Bitmap bitmap = this.f879c;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f879c.getHeight() != height) {
            this.f879c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f879c.copyPixelsFromBuffer(buffer);
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void a(io.flutter.embedding.engine.renderer.a aVar) {
        if (a.f882a[this.f881e.ordinal()] == 1) {
            aVar.r(this.f877a.getSurface());
        }
        setAlpha(1.0f);
        this.f880d = aVar;
        this.f = true;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void b() {
        if (!this.f) {
            return;
        }
        setAlpha(0.0f);
        d();
        this.f879c = null;
        e();
        invalidate();
        this.f = false;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void c() {
    }

    @TargetApi(19)
    public boolean d() {
        if (!this.f) {
            return false;
        }
        Image acquireLatestImage = this.f877a.acquireLatestImage();
        if (acquireLatestImage != null) {
            e();
            this.f878b = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public io.flutter.embedding.engine.renderer.a getAttachedRenderer() {
        return this.f880d;
    }

    public Surface getSurface() {
        return this.f877a.getSurface();
    }

    public void h(int i, int i2) {
        if (this.f880d == null) {
            return;
        }
        if (i == this.f877a.getWidth() && i2 == this.f877a.getHeight()) {
            return;
        }
        e();
        this.f877a.close();
        this.f877a = f(i, i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f878b != null) {
            i();
        }
        Bitmap bitmap = this.f879c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == this.f877a.getWidth() && i2 == this.f877a.getHeight()) && this.f881e == b.background && this.f) {
            h(i, i2);
            this.f880d.r(this.f877a.getSurface());
        }
    }
}
