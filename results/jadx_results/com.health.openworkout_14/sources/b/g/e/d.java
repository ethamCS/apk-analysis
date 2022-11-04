package b.g.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import b.g.d.c.c;
import b.g.d.c.f;
import b.g.i.b;
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private static final j f2386a;

    /* renamed from: b */
    private static final b.d.e<String, Typeface> f2387b;

    static {
        int i = Build.VERSION.SDK_INT;
        f2386a = i >= 29 ? new i() : i >= 28 ? new h() : i >= 26 ? new g() : (i < 24 || !f.m()) ? i >= 21 ? new e() : new j() : new f();
        f2387b = new b.d.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface g2;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g2 = g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : g2;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        return f2386a.c(context, cancellationSignal, fVarArr, i);
    }

    public static Typeface c(Context context, c.a aVar, Resources resources, int i, int i2, f.a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typeface = b.g.i.b.g(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            typeface = f2386a.b(context, (c.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.b(typeface, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f2387b.d(e(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e2 = f2386a.e(context, resources, i, str, i2);
        if (e2 != null) {
            f2387b.d(e(resources, i, i2), e2);
        }
        return e2;
    }

    private static String e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface f(Resources resources, int i, int i2) {
        return f2387b.c(e(resources, i, i2));
    }

    private static Typeface g(Context context, Typeface typeface, int i) {
        j jVar = f2386a;
        c.b i2 = jVar.i(typeface);
        if (i2 == null) {
            return null;
        }
        return jVar.b(context, i2, context.getResources(), i);
    }
}
