package b.a.a.a.n;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import b.a.a.a.n.a;
import com.google.android.material.internal.h;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public static final boolean f1231a;

    static {
        f1231a = Build.VERSION.SDK_INT < 18;
    }

    public static SparseArray<a> a(Context context, h hVar) {
        SparseArray<a> sparseArray = new SparseArray<>(hVar.size());
        for (int i = 0; i < hVar.size(); i++) {
            int keyAt = hVar.keyAt(i);
            a.C0049a c0049a = (a.C0049a) hVar.valueAt(i);
            if (c0049a == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(keyAt, a.a(context, c0049a));
        }
        return sparseArray;
    }

    public static h a(SparseArray<a> sparseArray) {
        h hVar = new h();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            a valueAt = sparseArray.valueAt(i);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            hVar.put(keyAt, valueAt.e());
        }
        return hVar;
    }

    public static void a(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public static void a(a aVar, View view, FrameLayout frameLayout) {
        c(aVar, view, frameLayout);
        if (f1231a) {
            frameLayout.setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
    }

    public static void b(a aVar, View view, FrameLayout frameLayout) {
        if (aVar == null) {
            return;
        }
        if (f1231a) {
            frameLayout.setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void c(a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (f1231a ? frameLayout : view).getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.a(view, frameLayout);
    }
}
