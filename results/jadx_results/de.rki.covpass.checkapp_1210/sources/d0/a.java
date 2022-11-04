package d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.n1;
import androidx.camera.core.s1;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class a {
    public static Rect a(Size size, Rational rational) {
        int i10;
        if (!e(rational)) {
            s1.k("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f10 = width;
        float f11 = height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i11 = 0;
        if (rational.floatValue() > f10 / f11) {
            int round = Math.round((f10 / numerator) * denominator);
            i10 = (height - round) / 2;
            height = round;
        } else {
            int round2 = Math.round((f11 / denominator) * numerator);
            int i12 = (width - round2) / 2;
            width = round2;
            i10 = 0;
            i11 = i12;
        }
        return new Rect(i11, i10, width + i11, height + i10);
    }

    public static Rect b(Rect rect, int i10, Size size, int i11) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i11 - i10);
        float[] i12 = i(size);
        matrix.mapPoints(i12);
        matrix.postTranslate(-h(i12[0], i12[2], i12[4], i12[6]), -h(i12[1], i12[3], i12[5], i12[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static Rational c(int i10, Rational rational) {
        return (i10 == 90 || i10 == 270) ? d(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational d(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean e(Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && !rational.isNaN();
    }

    public static boolean f(Size size, Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && g(size, rational) && !rational.isNaN();
    }

    private static boolean g(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    public static float h(float f10, float f11, float f12, float f13) {
        return Math.min(Math.min(f10, f11), Math.min(f12, f13));
    }

    public static float[] i(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static byte[] j(n1 n1Var) {
        n1.a aVar = n1Var.w()[0];
        n1.a aVar2 = n1Var.w()[1];
        n1.a aVar3 = n1Var.w()[2];
        ByteBuffer c10 = aVar.c();
        ByteBuffer c11 = aVar2.c();
        ByteBuffer c12 = aVar3.c();
        c10.rewind();
        c11.rewind();
        c12.rewind();
        int remaining = c10.remaining();
        byte[] bArr = new byte[((n1Var.d() * n1Var.a()) / 2) + remaining];
        int i10 = 0;
        for (int i11 = 0; i11 < n1Var.a(); i11++) {
            c10.get(bArr, i10, n1Var.d());
            i10 += n1Var.d();
            c10.position(Math.min(remaining, (c10.position() - n1Var.d()) + aVar.d()));
        }
        int a10 = n1Var.a() / 2;
        int d10 = n1Var.d() / 2;
        int d11 = aVar3.d();
        int d12 = aVar2.d();
        int e10 = aVar3.e();
        int e11 = aVar2.e();
        byte[] bArr2 = new byte[d11];
        byte[] bArr3 = new byte[d12];
        for (int i12 = 0; i12 < a10; i12++) {
            c12.get(bArr2, 0, Math.min(d11, c12.remaining()));
            c11.get(bArr3, 0, Math.min(d12, c11.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < d10; i15++) {
                int i16 = i10 + 1;
                bArr[i10] = bArr2[i13];
                i10 = i16 + 1;
                bArr[i16] = bArr3[i14];
                i13 += e10;
                i14 += e11;
            }
        }
        return bArr;
    }
}
