package d.a.a.a.l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public static final TimeInterpolator f3640a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f3641b = new b.l.a.a.b();

    /* renamed from: c */
    public static final TimeInterpolator f3642c = new b.l.a.a.a();

    /* renamed from: d */
    public static final TimeInterpolator f3643d = new b.l.a.a.c();

    /* renamed from: e */
    public static final TimeInterpolator f3644e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f4) {
        return f2 + (f4 * (f3 - f2));
    }
}
