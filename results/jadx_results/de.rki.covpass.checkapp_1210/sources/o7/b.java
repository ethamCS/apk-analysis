package o7;

import android.graphics.Bitmap;
import h6.v;
import java.util.Map;
/* loaded from: classes.dex */
public class b {
    public Bitmap a(o6.b bVar) {
        int l10 = bVar.l();
        int i10 = bVar.i();
        int[] iArr = new int[l10 * i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * l10;
            for (int i13 = 0; i13 < l10; i13++) {
                iArr[i12 + i13] = bVar.f(i13, i11) ? -16777216 : -1;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(l10, i10, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, l10, 0, 0, l10, i10);
        return createBitmap;
    }

    public o6.b b(String str, h6.a aVar, int i10, int i11, Map<h6.g, ?> map) {
        try {
            return new h6.l().a(str, aVar, i10, i11, map);
        } catch (v e10) {
            throw e10;
        } catch (Exception e11) {
            throw new v(e11);
        }
    }

    public Bitmap c(String str, h6.a aVar, int i10, int i11, Map<h6.g, ?> map) {
        return a(b(str, aVar, i10, i11, map));
    }
}
