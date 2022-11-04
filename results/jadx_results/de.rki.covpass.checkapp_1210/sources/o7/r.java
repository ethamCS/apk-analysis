package o7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
/* loaded from: classes.dex */
public class r {

    /* renamed from: a */
    private n f17646a;

    /* renamed from: b */
    private int f17647b;

    /* renamed from: c */
    private int f17648c;

    /* renamed from: d */
    private Rect f17649d;

    /* renamed from: e */
    private int f17650e = 1;

    /* renamed from: f */
    private boolean f17651f;

    public r(byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f17646a = new n(bArr, i10, i11);
        this.f17648c = i13;
        this.f17647b = i12;
        if (i10 * i11 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i10 + "x" + i11 + " > " + bArr.length);
    }

    public h6.n a() {
        n a10 = this.f17646a.h(this.f17648c).a(this.f17649d, this.f17650e);
        return new h6.n(a10.b(), a10.d(), a10.c(), 0, 0, a10.d(), a10.c(), false);
    }

    public Bitmap b(Rect rect, int i10) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f17646a.d(), this.f17646a.c());
        } else if (c()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f17646a.b(), this.f17647b, this.f17646a.d(), this.f17646a.c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f17648c != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(this.f17648c);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        }
        return decodeByteArray;
    }

    public boolean c() {
        return this.f17648c % 180 != 0;
    }

    public void d(Rect rect) {
        this.f17649d = rect;
    }

    public void e(boolean z10) {
        this.f17651f = z10;
    }

    public h6.s f(h6.s sVar) {
        float c10 = (sVar.c() * this.f17650e) + this.f17649d.left;
        float d10 = (sVar.d() * this.f17650e) + this.f17649d.top;
        if (this.f17651f) {
            c10 = this.f17646a.d() - c10;
        }
        return new h6.s(c10, d10);
    }
}
