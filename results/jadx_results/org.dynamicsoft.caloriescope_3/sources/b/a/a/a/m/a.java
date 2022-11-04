package b.a.a.a.m;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public static final TimeInterpolator f1208a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f1209b = new a.j.a.a.b();

    /* renamed from: c */
    public static final TimeInterpolator f1210c = new a.j.a.a.a();
    public static final TimeInterpolator d = new a.j.a.a.c();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
