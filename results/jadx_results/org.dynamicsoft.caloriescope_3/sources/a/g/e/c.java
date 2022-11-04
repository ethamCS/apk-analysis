package a.g.e;

import a.g.d.c.c;
import a.g.d.c.f;
import a.g.i.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private static final h f178a;

    /* renamed from: b */
    private static final a.d.e<String, Typeface> f179b;

    static {
        int i = Build.VERSION.SDK_INT;
        f178a = i >= 28 ? new g() : i >= 26 ? new f() : (i < 24 || !e.a()) ? Build.VERSION.SDK_INT >= 21 ? new d() : new h() : new e();
        f179b = new a.d.e<>(16);
    }

    public static Typeface a(Context context, c.a aVar, Resources resources, int i, int i2, f.a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typeface = a.g.i.b.a(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            typeface = f178a.a(context, (c.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.a(typeface, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f179b.a(a(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = f178a.a(context, resources, i, str, i2);
        if (a2 != null) {
            f179b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface b2;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (b2 = b(context, typeface, i)) == null) ? Typeface.create(typeface, i) : b2;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        return f178a.a(context, cancellationSignal, fVarArr, i);
    }

    private static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    private static Typeface b(Context context, Typeface typeface, int i) {
        c.b a2 = f178a.a(typeface);
        if (a2 == null) {
            return null;
        }
        return f178a.a(context, a2, context.getResources(), i);
    }

    public static Typeface b(Resources resources, int i, int i2) {
        return f179b.b(a(resources, i, i2));
    }
}
