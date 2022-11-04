package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a */
    private final PointerIcon f3731a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static PointerIcon a(Bitmap bitmap, float f10, float f11) {
            return PointerIcon.create(bitmap, f10, f11);
        }

        static PointerIcon b(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }

        static PointerIcon c(Resources resources, int i10) {
            return PointerIcon.load(resources, i10);
        }
    }

    private w(PointerIcon pointerIcon) {
        this.f3731a = pointerIcon;
    }

    public static w b(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new w(a.b(context, i10)) : new w(null);
    }

    public Object a() {
        return this.f3731a;
    }
}
