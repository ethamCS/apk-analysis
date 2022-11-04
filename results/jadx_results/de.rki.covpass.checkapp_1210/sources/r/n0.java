package r;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import r.m0;
/* loaded from: classes.dex */
public final /* synthetic */ class n0 {
    public static m0.b a(Context context, Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new p0(context) : i10 >= 28 ? o0.g(context) : q0.f(context, handler);
    }
}
