package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: g */
    protected final Class<?> f3484g;

    /* renamed from: h */
    protected final Constructor<?> f3485h;

    /* renamed from: i */
    protected final Method f3486i;

    /* renamed from: j */
    protected final Method f3487j;

    /* renamed from: k */
    protected final Method f3488k;

    /* renamed from: l */
    protected final Method f3489l;

    /* renamed from: m */
    protected final Method f3490m;

    public h() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> u10 = u();
            constructor = v(u10);
            method4 = r(u10);
            method3 = s(u10);
            method2 = w(u10);
            method = q(u10);
            method5 = t(u10);
            cls = u10;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f3484g = cls;
        this.f3485h = constructor;
        this.f3486i = method4;
        this.f3487j = method3;
        this.f3488k = method2;
        this.f3489l = method;
        this.f3490m = method5;
    }

    private Object k() {
        try {
            return this.f3485h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void l(Object obj) {
        try {
            this.f3489l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean m(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3486i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean n(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f3487j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj) {
        try {
            return ((Boolean) this.f3488k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p() {
        if (this.f3486i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f3486i != null;
    }

    @Override // androidx.core.graphics.f, androidx.core.graphics.k
    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        e.d[] a10;
        if (!p()) {
            return super.a(context, cVar, resources, i10);
        }
        Object k10 = k();
        if (k10 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!m(context, k10, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                l(k10);
                return null;
            }
        }
        if (o(k10)) {
            return h(k10);
        }
        return null;
    }

    @Override // androidx.core.graphics.f, androidx.core.graphics.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        Typeface h10;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!p()) {
            g.b f10 = f(bVarArr, i10);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f10.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f10.e()).setItalic(f10.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h11 = l.h(context, bVarArr, cancellationSignal);
        Object k10 = k();
        if (k10 == null) {
            return null;
        }
        boolean z10 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = h11.get(bVar.d());
            if (byteBuffer != null) {
                if (!n(k10, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    l(k10);
                    return null;
                }
                z10 = true;
            }
        }
        if (!z10) {
            l(k10);
            return null;
        } else if (o(k10) && (h10 = h(k10)) != null) {
            return Typeface.create(h10, i10);
        } else {
            return null;
        }
    }

    @Override // androidx.core.graphics.k
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!p()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object k10 = k();
        if (k10 == null) {
            return null;
        }
        if (!m(context, k10, str, 0, -1, -1, null)) {
            l(k10);
            return null;
        } else if (o(k10)) {
            return h(k10);
        } else {
            return null;
        }
    }

    protected Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3484g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3490m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method q(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method r(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method s(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method t(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> u() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> v(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method w(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
