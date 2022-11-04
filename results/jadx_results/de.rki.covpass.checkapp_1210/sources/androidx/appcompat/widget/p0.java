package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: i */
    private static p0 f1449i;

    /* renamed from: a */
    private WeakHashMap<Context, i0.h<ColorStateList>> f1451a;

    /* renamed from: b */
    private i0.g<String, e> f1452b;

    /* renamed from: c */
    private i0.h<String> f1453c;

    /* renamed from: d */
    private final WeakHashMap<Context, i0.d<WeakReference<Drawable.ConstantState>>> f1454d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1455e;

    /* renamed from: f */
    private boolean f1456f;

    /* renamed from: g */
    private f f1457g;

    /* renamed from: h */
    private static final PorterDuff.Mode f1448h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final c f1450j = new c(6);

    /* loaded from: classes.dex */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends i0.e<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int h(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i10, PorterDuff.Mode mode) {
            return c(Integer.valueOf(h(i10, mode)));
        }

        PorterDuffColorFilter j(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(h(i10, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    i.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(p0 p0Var, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    /* loaded from: classes.dex */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.g.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f1452b == null) {
            this.f1452b = new i0.g<>();
        }
        this.f1452b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        boolean z10;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            i0.d<WeakReference<Drawable.ConstantState>> dVar = this.f1454d.get(context);
            if (dVar == null) {
                dVar = new i0.d<>();
                this.f1454d.put(context, dVar);
            }
            dVar.l(j10, new WeakReference<>(constantState));
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1451a == null) {
            this.f1451a = new WeakHashMap<>();
        }
        i0.h<ColorStateList> hVar = this.f1451a.get(context);
        if (hVar == null) {
            hVar = new i0.h<>();
            this.f1451a.put(context, hVar);
        }
        hVar.a(i10, colorStateList);
    }

    private void d(Context context) {
        if (this.f1456f) {
            return;
        }
        this.f1456f = true;
        Drawable j10 = j(context, i.d.a_res_0x7f070055);
        if (j10 != null && q(j10)) {
            return;
        }
        this.f1456f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i10) {
        if (this.f1455e == null) {
            this.f1455e = new TypedValue();
        }
        TypedValue typedValue = this.f1455e;
        context.getResources().getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        f fVar = this.f1457g;
        Drawable c10 = fVar == null ? null : fVar.c(this, context, i10);
        if (c10 != null) {
            c10.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e10, c10);
        }
        return c10;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized p0 h() {
        p0 p0Var;
        synchronized (p0.class) {
            if (f1449i == null) {
                p0 p0Var2 = new p0();
                f1449i = p0Var2;
                p(p0Var2);
            }
            p0Var = f1449i;
        }
        return p0Var;
    }

    private synchronized Drawable i(Context context, long j10) {
        i0.d<WeakReference<Drawable.ConstantState>> dVar = this.f1454d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> g10 = dVar.g(j10);
        if (g10 != null) {
            Drawable.ConstantState constantState = g10.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.m(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter i11;
        synchronized (p0.class) {
            c cVar = f1450j;
            i11 = cVar.i(i10, mode);
            if (i11 == null) {
                i11 = new PorterDuffColorFilter(i10, mode);
                cVar.j(i10, mode, i11);
            }
        }
        return i11;
    }

    private ColorStateList n(Context context, int i10) {
        i0.h<ColorStateList> hVar;
        WeakHashMap<Context, i0.h<ColorStateList>> weakHashMap = this.f1451a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.f(i10);
    }

    private static void p(p0 p0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            p0Var.a("vector", new g());
            p0Var.a("animated-vector", new b());
            p0Var.a("animated-selector", new a());
            p0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i10) {
        int next;
        i0.g<String, e> gVar = this.f1452b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        i0.h<String> hVar = this.f1453c;
        if (hVar != null) {
            String f10 = hVar.f(i10);
            if ("appcompat_skip_skip".equals(f10) || (f10 != null && this.f1452b.get(f10) == null)) {
                return null;
            }
        } else {
            this.f1453c = new i0.h<>();
        }
        if (this.f1455e == null) {
            this.f1455e = new TypedValue();
        }
        TypedValue typedValue = this.f1455e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1453c.a(i10, name);
                e eVar = this.f1452b.get(name);
                if (eVar != null) {
                    i11 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i11 != null) {
                    i11.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e10, i11);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (i11 == null) {
            this.f1453c.a(i10, "appcompat_skip_skip");
        }
        return i11;
    }

    private Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m10 = m(context, i10);
        if (m10 == null) {
            f fVar = this.f1457g;
            if ((fVar != null && fVar.e(context, i10, drawable)) || x(context, i10, drawable) || !z10) {
                return drawable;
            }
            return null;
        }
        if (h0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
        androidx.core.graphics.drawable.a.o(r10, m10);
        PorterDuff.Mode o10 = o(i10);
        if (o10 == null) {
            return r10;
        }
        androidx.core.graphics.drawable.a.p(r10, o10);
        return r10;
    }

    public static void w(Drawable drawable, y0 y0Var, int[] iArr) {
        if (h0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = y0Var.f1573d;
        if (z10 || y0Var.f1572c) {
            drawable.setColorFilter(g(z10 ? y0Var.f1570a : null, y0Var.f1572c ? y0Var.f1571b : f1448h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT > 23) {
            return;
        }
        drawable.invalidateSelf();
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    public synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable r10;
        d(context);
        r10 = r(context, i10);
        if (r10 == null) {
            r10 = f(context, i10);
        }
        if (r10 == null) {
            r10 = androidx.core.content.a.d(context, i10);
        }
        if (r10 != null) {
            r10 = v(context, i10, z10, r10);
        }
        if (r10 != null) {
            h0.b(r10);
        }
        return r10;
    }

    public synchronized ColorStateList m(Context context, int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            f fVar = this.f1457g;
            n10 = fVar == null ? null : fVar.d(context, i10);
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    PorterDuff.Mode o(int i10) {
        f fVar = this.f1457g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i10);
    }

    public synchronized void s(Context context) {
        i0.d<WeakReference<Drawable.ConstantState>> dVar = this.f1454d.get(context);
        if (dVar != null) {
            dVar.c();
        }
    }

    public synchronized Drawable t(Context context, g1 g1Var, int i10) {
        Drawable r10 = r(context, i10);
        if (r10 == null) {
            r10 = g1Var.a(i10);
        }
        if (r10 != null) {
            return v(context, i10, false, r10);
        }
        return null;
    }

    public synchronized void u(f fVar) {
        this.f1457g = fVar;
    }

    public boolean x(Context context, int i10, Drawable drawable) {
        f fVar = this.f1457g;
        return fVar != null && fVar.a(context, i10, drawable);
    }
}
