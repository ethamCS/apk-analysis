package i3;

import android.media.Image;
import c4.n;
import ll.d;
import ok.i;
/* loaded from: classes.dex */
public class b {
    public static void a(Image image, m2.a aVar, n nVar, d<i> dVar) {
        if (a.a(image, aVar, nVar)) {
            return;
        }
        if (35 != image.getFormat()) {
            throw new RuntimeException("Unexpected format");
        }
        Image.Plane[] planes = image.getPlanes();
        k3.b.a(planes[0].getBuffer(), planes[2].getBuffer(), planes[1].getBuffer(), image.getWidth(), image.getHeight(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride(), aVar, nVar, dVar);
    }
}
