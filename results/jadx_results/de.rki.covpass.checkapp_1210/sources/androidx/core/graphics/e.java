package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private static final k f3472a;

    /* renamed from: b */
    private static final i0.e<String, Typeface> f3473b;

    /* loaded from: classes.dex */
    public static class a extends g.c {

        /* renamed from: a */
        private h.e f3474a;

        public a(h.e eVar) {
            this.f3474a = eVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i10) {
            h.e eVar = this.f3474a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            h.e eVar = this.f3474a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f3472a = i10 >= 29 ? new j() : i10 >= 28 ? new i() : i10 >= 26 ? new h() : (i10 < 24 || !g.i()) ? new f() : new g();
        f3473b = new i0.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f3472a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z10) {
        Typeface typeface;
        if (bVar instanceof e.C0030e) {
            e.C0030e c0030e = (e.C0030e) bVar;
            Typeface g10 = g(c0030e.c());
            if (g10 != null) {
                if (eVar != null) {
                    eVar.d(g10, handler);
                }
                return g10;
            }
            boolean z11 = !z10 ? eVar == null : c0030e.a() == 0;
            int d10 = z10 ? c0030e.d() : -1;
            typeface = androidx.core.provider.g.c(context, c0030e.b(), i12, z11, d10, h.e.e(handler), new a(eVar));
        } else {
            typeface = f3472a.a(context, (e.c) bVar, resources, i12);
            if (eVar != null) {
                if (typeface != null) {
                    eVar.d(typeface, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f3473b.d(e(resources, i10, str, i11, i12), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface d10 = f3472a.d(context, resources, i10, str, i12);
        if (d10 != null) {
            f3473b.d(e(resources, i10, str, i11, i12), d10);
        }
        return d10;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f3473b.c(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create != null && !create.equals(create2)) {
            return create;
        }
        return null;
    }
}
