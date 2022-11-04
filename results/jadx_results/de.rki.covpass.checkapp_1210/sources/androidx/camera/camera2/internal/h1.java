package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h1 {
    private static String a(r.m0 m0Var, Integer num, List<String> list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) m0Var.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
                    return null;
                }
                return "1";
            } else if (num.intValue() != 0 || ((Integer) m0Var.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() != 0) {
                return null;
            } else {
                return "0";
            }
        }
        return null;
    }

    public static List<String> b(v vVar, androidx.camera.core.s sVar) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(vVar.b().d());
            if (sVar == null) {
                for (String str2 : asList) {
                    arrayList.add(str2);
                }
                return arrayList;
            }
            try {
                str = a(vVar.b(), sVar.d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : asList) {
                if (!str3.equals(str)) {
                    arrayList2.add(vVar.e(str3));
                }
            }
            Iterator<androidx.camera.core.r> it = sVar.b(arrayList2).iterator();
            while (it.hasNext()) {
                arrayList.add(((w.b0) it.next()).c());
            }
            return arrayList;
        } catch (androidx.camera.core.u e10) {
            throw new androidx.camera.core.r1(e10);
        } catch (r.f e11) {
            throw new androidx.camera.core.r1(j1.a(e11));
        }
    }
}
