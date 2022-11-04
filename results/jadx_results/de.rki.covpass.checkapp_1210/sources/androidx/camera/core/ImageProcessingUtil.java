package androidx.camera.core;

import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.k0;
import java.nio.ByteBuffer;
import java.util.Locale;
/* loaded from: classes.dex */
final class ImageProcessingUtil {

    /* renamed from: a */
    private static int f2078a;

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static boolean c(n1 n1Var) {
        String str;
        if (!h(n1Var)) {
            str = "Unsupported format for YUV to RGB";
        } else if (d(n1Var) != a.ERROR_CONVERSION) {
            return true;
        } else {
            str = "One pixel shift for YUV failure";
        }
        s1.c("ImageProcessingUtil", str);
        return false;
    }

    private static a d(n1 n1Var) {
        int d10 = n1Var.d();
        int a10 = n1Var.a();
        int d11 = n1Var.w()[0].d();
        int d12 = n1Var.w()[1].d();
        int d13 = n1Var.w()[2].d();
        int e10 = n1Var.w()[0].e();
        int e11 = n1Var.w()[1].e();
        return nativeShiftPixel(n1Var.w()[0].c(), d11, n1Var.w()[1].c(), d12, n1Var.w()[2].c(), d13, e10, e11, d10, a10, e10, e11, e11) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static n1 e(final n1 n1Var, w.h1 h1Var, ByteBuffer byteBuffer, int i10, boolean z10) {
        String str;
        if (!h(n1Var)) {
            str = "Unsupported format for YUV to RGB";
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (!g(i10)) {
                str = "Unsupported rotation degrees for rotate RGB";
            } else if (f(n1Var, h1Var.b(), byteBuffer, i10, z10) == a.ERROR_CONVERSION) {
                str = "YUV to RGB conversion failure";
            } else {
                if (Log.isLoggable("MH", 3)) {
                    s1.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f2078a)));
                    f2078a++;
                }
                final n1 e10 = h1Var.e();
                if (e10 != null) {
                    r2 r2Var = new r2(e10);
                    r2Var.b(new k0.a() { // from class: androidx.camera.core.m1
                        @Override // androidx.camera.core.k0.a
                        public final void c(n1 n1Var2) {
                            ImageProcessingUtil.i(n1.this, n1Var, n1Var2);
                        }
                    });
                    return r2Var;
                }
                str = "YUV to RGB acquireLatestImage failure";
            }
        }
        s1.c("ImageProcessingUtil", str);
        return null;
    }

    private static a f(n1 n1Var, Surface surface, ByteBuffer byteBuffer, int i10, boolean z10) {
        int d10 = n1Var.d();
        int a10 = n1Var.a();
        int d11 = n1Var.w()[0].d();
        int d12 = n1Var.w()[1].d();
        int d13 = n1Var.w()[2].d();
        int e10 = n1Var.w()[0].e();
        int e11 = n1Var.w()[1].e();
        return nativeConvertAndroid420ToABGR(n1Var.w()[0].c(), d11, n1Var.w()[1].c(), d12, n1Var.w()[2].c(), d13, e10, e11, surface, byteBuffer, d10, a10, z10 ? e10 : 0, z10 ? e11 : 0, z10 ? e11 : 0, i10) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    private static boolean g(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }

    private static boolean h(n1 n1Var) {
        return n1Var.getFormat() == 35 && n1Var.w().length == 3;
    }

    public static /* synthetic */ void i(n1 n1Var, n1 n1Var2, n1 n1Var3) {
        if (n1Var == null || n1Var2 == null) {
            return;
        }
        n1Var2.close();
    }

    public static /* synthetic */ void j(n1 n1Var, n1 n1Var2, n1 n1Var3) {
        if (n1Var == null || n1Var2 == null) {
            return;
        }
        n1Var2.close();
    }

    public static n1 k(final n1 n1Var, w.h1 h1Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        String str;
        if (!h(n1Var)) {
            str = "Unsupported format for rotate YUV";
        } else if (!g(i10)) {
            str = "Unsupported rotation degrees for rotate YUV";
        } else {
            a aVar = a.ERROR_CONVERSION;
            if ((i10 > 0 ? l(n1Var, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i10) : aVar) == aVar) {
                str = "rotate YUV failure";
            } else {
                final n1 e10 = h1Var.e();
                if (e10 != null) {
                    r2 r2Var = new r2(e10);
                    r2Var.b(new k0.a() { // from class: androidx.camera.core.l1
                        @Override // androidx.camera.core.k0.a
                        public final void c(n1 n1Var2) {
                            ImageProcessingUtil.j(n1.this, n1Var, n1Var2);
                        }
                    });
                    return r2Var;
                }
                str = "YUV rotation acquireLatestImage failure";
            }
        }
        s1.c("ImageProcessingUtil", str);
        return null;
    }

    private static a l(n1 n1Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        int d10 = n1Var.d();
        int a10 = n1Var.a();
        int d11 = n1Var.w()[0].d();
        int d12 = n1Var.w()[1].d();
        int d13 = n1Var.w()[2].d();
        int e10 = n1Var.w()[1].e();
        Image b10 = a0.a.b(imageWriter);
        if (b10 != null && nativeRotateYUV(n1Var.w()[0].c(), d11, n1Var.w()[1].c(), d12, n1Var.w()[2].c(), d13, e10, b10.getPlanes()[0].getBuffer(), b10.getPlanes()[0].getRowStride(), b10.getPlanes()[0].getPixelStride(), b10.getPlanes()[1].getBuffer(), b10.getPlanes()[1].getRowStride(), b10.getPlanes()[1].getPixelStride(), b10.getPlanes()[2].getBuffer(), b10.getPlanes()[2].getRowStride(), b10.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, d10, a10, i10) == 0) {
            a0.a.e(imageWriter, b10);
            return a.SUCCESS;
        }
        return a.ERROR_CONVERSION;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);
}
