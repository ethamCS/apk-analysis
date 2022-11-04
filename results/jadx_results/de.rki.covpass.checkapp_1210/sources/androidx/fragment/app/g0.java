package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a */
    static final i0 f4100a = new h0();

    /* renamed from: b */
    static final i0 f4101b = b();

    public static void a(Fragment fragment, Fragment fragment2, boolean z10, i0.a<String, View> aVar, boolean z11) {
        if (z10) {
            fragment2.X();
        } else {
            fragment.X();
        }
    }

    private static i0 b() {
        try {
            return (i0) q1.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void c(i0.a<String, String> aVar, i0.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.n(size))) {
                aVar.l(size);
            }
        }
    }

    public static void d(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }
}
