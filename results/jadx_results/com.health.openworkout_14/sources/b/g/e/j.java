package b.g.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import b.g.d.c.c;
import b.g.i.b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private ConcurrentHashMap<Long, c.b> f2399a = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public class a implements c<b.f> {
        a(j jVar) {
        }

        /* renamed from: c */
        public int a(b.f fVar) {
            return fVar.d();
        }

        /* renamed from: d */
        public boolean b(b.f fVar) {
            return fVar.e();
        }
    }

    /* loaded from: classes.dex */
    public class b implements c<c.C0042c> {
        b(j jVar) {
        }

        /* renamed from: c */
        public int a(c.C0042c c0042c) {
            return c0042c.e();
        }

        /* renamed from: d */
        public boolean b(c.C0042c c0042c) {
            return c0042c.f();
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    private void a(Typeface typeface, c.b bVar) {
        long j = j(typeface);
        if (j != 0) {
            this.f2399a.put(Long.valueOf(j), bVar);
        }
    }

    private c.C0042c f(c.b bVar, int i) {
        return (c.C0042c) g(bVar.a(), i, new b(this));
    }

    private static <T> T g(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i2) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    private static long j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    public Typeface b(Context context, c.b bVar, Resources resources, int i) {
        c.C0042c f2 = f(bVar, i);
        if (f2 == null) {
            return null;
        }
        Typeface d2 = d.d(context, resources, f2.b(), f2.a(), i);
        a(d2, bVar);
        return d2;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(fVarArr, i).c());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Typeface d2 = d(context, inputStream);
            k.a(inputStream);
            return d2;
        } catch (IOException unused2) {
            k.a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            k.a(inputStream2);
            throw th;
        }
    }

    public Typeface d(Context context, InputStream inputStream) {
        File e2 = k.e(context);
        if (e2 == null) {
            return null;
        }
        try {
            if (k.d(e2, inputStream)) {
                return Typeface.createFromFile(e2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e2.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        File e2 = k.e(context);
        if (e2 == null) {
            return null;
        }
        try {
            if (k.c(e2, resources, i)) {
                return Typeface.createFromFile(e2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e2.delete();
        }
    }

    public b.f h(b.f[] fVarArr, int i) {
        return (b.f) g(fVarArr, i, new a(this));
    }

    public c.b i(Typeface typeface) {
        long j = j(typeface);
        if (j == 0) {
            return null;
        }
        return this.f2399a.get(Long.valueOf(j));
    }
}
