package e4;

import android.content.Context;
import java.io.File;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    public static boolean f9377a = false;

    /* renamed from: b */
    private static boolean f9378b = false;

    /* renamed from: c */
    private static String[] f9379c;

    /* renamed from: d */
    private static long[] f9380d;

    /* renamed from: e */
    private static int f9381e;

    /* renamed from: f */
    private static int f9382f;

    /* renamed from: g */
    private static n4.f f9383g;

    /* renamed from: h */
    private static n4.e f9384h;

    /* renamed from: i */
    private static volatile n4.h f9385i;

    /* renamed from: j */
    private static volatile n4.g f9386j;

    /* loaded from: classes.dex */
    public class a implements n4.e {

        /* renamed from: a */
        final /* synthetic */ Context f9387a;

        a(Context context) {
            this.f9387a = context;
        }

        @Override // n4.e
        public File a() {
            return new File(this.f9387a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void a(String str) {
        if (!f9378b) {
            return;
        }
        int i10 = f9381e;
        if (i10 == 20) {
            f9382f++;
            return;
        }
        f9379c[i10] = str;
        f9380d[i10] = System.nanoTime();
        androidx.core.os.i.a(str);
        f9381e++;
    }

    public static float b(String str) {
        int i10 = f9382f;
        if (i10 > 0) {
            f9382f = i10 - 1;
            return 0.0f;
        } else if (!f9378b) {
            return 0.0f;
        } else {
            int i11 = f9381e - 1;
            f9381e = i11;
            if (i11 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            }
            if (str.equals(f9379c[i11])) {
                androidx.core.os.i.b();
                return ((float) (System.nanoTime() - f9380d[f9381e])) / 1000000.0f;
            }
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f9379c[f9381e] + ".");
        }
    }

    public static n4.g c(Context context) {
        Context applicationContext = context.getApplicationContext();
        n4.g gVar = f9386j;
        if (gVar == null) {
            synchronized (n4.g.class) {
                gVar = f9386j;
                if (gVar == null) {
                    n4.e eVar = f9384h;
                    if (eVar == null) {
                        eVar = new a(applicationContext);
                    }
                    gVar = new n4.g(eVar);
                    f9386j = gVar;
                }
            }
        }
        return gVar;
    }

    public static n4.h d(Context context) {
        n4.h hVar = f9385i;
        if (hVar == null) {
            synchronized (n4.h.class) {
                hVar = f9385i;
                if (hVar == null) {
                    n4.g c10 = c(context);
                    n4.f fVar = f9383g;
                    if (fVar == null) {
                        fVar = new n4.b();
                    }
                    hVar = new n4.h(c10, fVar);
                    f9385i = hVar;
                }
            }
        }
        return hVar;
    }
}
