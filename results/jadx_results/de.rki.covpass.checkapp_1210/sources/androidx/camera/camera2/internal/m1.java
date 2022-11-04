package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
final class m1 {
    public static CameraCaptureSession.CaptureCallback a(w.h hVar) {
        if (hVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(hVar, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : k0.a(arrayList);
    }

    public static void b(w.h hVar, List<CameraCaptureSession.CaptureCallback> list) {
        if (hVar instanceof w.i) {
            for (w.h hVar2 : ((w.i) hVar).d()) {
                b(hVar2, list);
            }
        } else if (hVar instanceof l1) {
            list.add(((l1) hVar).e());
        } else {
            list.add(new k1(hVar));
        }
    }
}
