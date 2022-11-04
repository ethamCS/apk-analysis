package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.animation.a$a */
    /* loaded from: classes.dex */
    public static class C0041a {
        static PathInterpolator a(float f10, float f11) {
            return new PathInterpolator(f10, f11);
        }

        static PathInterpolator b(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f10, float f11, float f12, float f13) {
        return C0041a.b(f10, f11, f12, f13);
    }

    public static Interpolator b(Path path) {
        return C0041a.c(path);
    }
}
