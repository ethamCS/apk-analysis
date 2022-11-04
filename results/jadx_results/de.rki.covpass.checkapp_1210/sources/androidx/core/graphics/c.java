package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private static final ThreadLocal<androidx.core.util.d<Rect, Rect>> f3456a = new ThreadLocal<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
