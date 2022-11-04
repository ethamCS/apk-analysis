package e4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private static final Map<String, com.airbnb.lottie.o<h>> f9426a = new HashMap();

    /* renamed from: b */
    private static final byte[] f9427b = {80, 75, 3, 4};

    private static boolean A(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean B(eg.e eVar) {
        try {
            eg.e J0 = eVar.J0();
            for (byte b10 : f9427b) {
                if (J0.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            J0.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            q4.d.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ void C(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        f9426a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ v D(h hVar) {
        return new v(hVar);
    }

    public static /* synthetic */ void E(String str, AtomicBoolean atomicBoolean, h hVar) {
        f9426a.remove(str);
        atomicBoolean.set(true);
    }

    public static /* synthetic */ v H(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return v(context, i10, str);
    }

    public static /* synthetic */ v I(Context context, String str, String str2) {
        v<h> c10 = c.d(context).c(str, str2);
        if (str2 != null && c10.b() != null) {
            j4.g.b().c(str2, c10.b());
        }
        return c10;
    }

    private static String J(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(A(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    private static com.airbnb.lottie.o<h> h(final String str, Callable<v<h>> callable) {
        final h a10 = str == null ? null : j4.g.b().a(str);
        if (a10 != null) {
            return new com.airbnb.lottie.o<>(new Callable() { // from class: e4.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    v D;
                    D = p.D(h.this);
                    return D;
                }
            });
        }
        if (str != null) {
            Map<String, com.airbnb.lottie.o<h>> map = f9426a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.airbnb.lottie.o<h> oVar = new com.airbnb.lottie.o<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            oVar.d(new r() { // from class: e4.i
                @Override // e4.r
                public final void a(Object obj) {
                    p.E(str, atomicBoolean, (h) obj);
                }
            });
            oVar.c(new r() { // from class: e4.j
                @Override // e4.r
                public final void a(Object obj) {
                    p.C(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                f9426a.put(str, oVar);
            }
        }
        return oVar;
    }

    private static q i(h hVar, String str) {
        for (q qVar : hVar.j().values()) {
            if (qVar.b().equals(str)) {
                return qVar;
            }
        }
        return null;
    }

    public static com.airbnb.lottie.o<h> j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static com.airbnb.lottie.o<h> k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: e4.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v m10;
                m10 = p.m(applicationContext, str, str2);
                return m10;
            }
        });
    }

    public static v<h> l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static v<h> m(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return o(context.getAssets().open(str), str2);
            }
            return y(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new v<>(e10);
        }
    }

    public static com.airbnb.lottie.o<h> n(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: e4.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v o10;
                o10 = p.o(inputStream, str);
                return o10;
            }
        });
    }

    public static v<h> o(InputStream inputStream, String str) {
        return p(inputStream, str, true);
    }

    private static v<h> p(InputStream inputStream, String str, boolean z10) {
        try {
            return q(p4.c.z(eg.n.d(eg.n.k(inputStream))), str);
        } finally {
            if (z10) {
                q4.h.c(inputStream);
            }
        }
    }

    public static v<h> q(p4.c cVar, String str) {
        return r(cVar, str, true);
    }

    private static v<h> r(p4.c cVar, String str, boolean z10) {
        try {
            try {
                h a10 = o4.w.a(cVar);
                if (str != null) {
                    j4.g.b().c(str, a10);
                }
                v<h> vVar = new v<>(a10);
                if (z10) {
                    q4.h.c(cVar);
                }
                return vVar;
            } catch (Exception e10) {
                v<h> vVar2 = new v<>(e10);
                if (z10) {
                    q4.h.c(cVar);
                }
                return vVar2;
            }
        } catch (Throwable th2) {
            if (z10) {
                q4.h.c(cVar);
            }
            throw th2;
        }
    }

    public static com.airbnb.lottie.o<h> s(Context context, int i10) {
        return t(context, i10, J(context, i10));
    }

    public static com.airbnb.lottie.o<h> t(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: e4.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v H;
                H = p.H(weakReference, applicationContext, i10, str);
                return H;
            }
        });
    }

    public static v<h> u(Context context, int i10) {
        return v(context, i10, J(context, i10));
    }

    public static v<h> v(Context context, int i10, String str) {
        try {
            eg.e d10 = eg.n.d(eg.n.k(context.getResources().openRawResource(i10)));
            return B(d10).booleanValue() ? y(new ZipInputStream(d10.d1()), str) : o(d10.d1(), str);
        } catch (Resources.NotFoundException e10) {
            return new v<>(e10);
        }
    }

    public static com.airbnb.lottie.o<h> w(Context context, String str) {
        return x(context, str, "url_" + str);
    }

    public static com.airbnb.lottie.o<h> x(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: e4.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v I;
                I = p.I(context, str, str2);
                return I;
            }
        });
    }

    public static v<h> y(ZipInputStream zipInputStream, String str) {
        try {
            return z(zipInputStream, str);
        } finally {
            q4.h.c(zipInputStream);
        }
    }

    private static v<h> z(ZipInputStream zipInputStream, String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            h hVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX") && !nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    if (nextEntry.getName().contains(".json")) {
                        hVar = r(p4.c.z(eg.n.d(eg.n.k(zipInputStream))), null, false).b();
                    } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                        hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (hVar == null) {
                return new v<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                q i10 = i(hVar, (String) entry.getKey());
                if (i10 != null) {
                    i10.f(q4.h.l((Bitmap) entry.getValue(), i10.e(), i10.c()));
                }
            }
            for (Map.Entry<String, q> entry2 : hVar.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new v<>(new IllegalStateException("There is no image for " + entry2.getValue().b()));
                }
            }
            if (str != null) {
                j4.g.b().c(str, hVar);
            }
            return new v<>(hVar);
        } catch (IOException e10) {
            return new v<>(e10);
        }
    }
}
