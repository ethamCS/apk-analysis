package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a */
    static final i0.e<String, Typeface> f3521a = new i0.e<>(16);

    /* renamed from: b */
    private static final ExecutorService f3522b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f3523c = new Object();

    /* renamed from: d */
    static final i0.g<String, ArrayList<androidx.core.util.a<e>>> f3524d = new i0.g<>();

    /* loaded from: classes.dex */
    public class a implements Callable<e> {

        /* renamed from: a */
        final /* synthetic */ String f3525a;

        /* renamed from: b */
        final /* synthetic */ Context f3526b;

        /* renamed from: c */
        final /* synthetic */ androidx.core.provider.e f3527c;

        /* renamed from: d */
        final /* synthetic */ int f3528d;

        a(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f3525a = str;
            this.f3526b = context;
            this.f3527c = eVar;
            this.f3528d = i10;
        }

        /* renamed from: a */
        public e call() {
            return f.c(this.f3525a, this.f3526b, this.f3527c, this.f3528d);
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.core.util.a<e> {

        /* renamed from: a */
        final /* synthetic */ androidx.core.provider.a f3529a;

        b(androidx.core.provider.a aVar) {
            this.f3529a = aVar;
        }

        /* renamed from: b */
        public void a(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f3529a.b(eVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Callable<e> {

        /* renamed from: a */
        final /* synthetic */ String f3530a;

        /* renamed from: b */
        final /* synthetic */ Context f3531b;

        /* renamed from: c */
        final /* synthetic */ androidx.core.provider.e f3532c;

        /* renamed from: d */
        final /* synthetic */ int f3533d;

        c(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f3530a = str;
            this.f3531b = context;
            this.f3532c = eVar;
            this.f3533d = i10;
        }

        /* renamed from: a */
        public e call() {
            try {
                return f.c(this.f3530a, this.f3531b, this.f3532c, this.f3533d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.core.util.a<e> {

        /* renamed from: a */
        final /* synthetic */ String f3534a;

        d(String str) {
            this.f3534a = str;
        }

        /* renamed from: b */
        public void a(e eVar) {
            synchronized (f.f3523c) {
                i0.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f.f3524d;
                ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(this.f3534a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f3534a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).a(eVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        final Typeface f3535a;

        /* renamed from: b */
        final int f3536b;

        e(int i10) {
            this.f3535a = null;
            this.f3536b = i10;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f3535a = typeface;
            this.f3536b = 0;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f3536b == 0;
        }
    }

    private static String a(androidx.core.provider.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b10 = aVar.b();
        if (b10 != null && b10.length != 0) {
            i10 = 0;
            for (g.b bVar : b10) {
                int b11 = bVar.b();
                if (b11 != 0) {
                    if (b11 >= 0) {
                        return b11;
                    }
                    return -3;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i10) {
        i0.e<String, Typeface> eVar2 = f3521a;
        Typeface c10 = eVar2.c(str);
        if (c10 != null) {
            return new e(c10);
        }
        try {
            g.a e10 = androidx.core.provider.d.e(context, eVar, null);
            int b10 = b(e10);
            if (b10 != 0) {
                return new e(b10);
            }
            Typeface b11 = androidx.core.graphics.e.b(context, null, e10.b(), i10);
            if (b11 == null) {
                return new e(-3);
            }
            eVar2.d(str, b11);
            return new e(b11);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, androidx.core.provider.e eVar, int i10, Executor executor, androidx.core.provider.a aVar) {
        String a10 = a(eVar, i10);
        Typeface c10 = f3521a.c(a10);
        if (c10 != null) {
            aVar.b(new e(c10));
            return c10;
        }
        b bVar = new b(aVar);
        synchronized (f3523c) {
            i0.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f3524d;
            ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(a10);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a10, arrayList2);
            c cVar = new c(a10, context, eVar, i10);
            if (executor == null) {
                executor = f3522b;
            }
            h.b(executor, cVar, new d(a10));
            return null;
        }
    }

    public static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i10, int i11) {
        String a10 = a(eVar, i10);
        Typeface c10 = f3521a.c(a10);
        if (c10 != null) {
            aVar.b(new e(c10));
            return c10;
        } else if (i11 == -1) {
            e c11 = c(a10, context, eVar, i10);
            aVar.b(c11);
            return c11.f3535a;
        } else {
            try {
                e eVar2 = (e) h.c(f3522b, new a(a10, context, eVar, i10), i11);
                aVar.b(eVar2);
                return eVar2.f3535a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }
}
