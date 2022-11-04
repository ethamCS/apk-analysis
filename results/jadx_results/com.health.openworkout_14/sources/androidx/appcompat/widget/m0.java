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
public final class m0 {
    private static m0 i;

    /* renamed from: a */
    private WeakHashMap<Context, b.d.h<ColorStateList>> f565a;

    /* renamed from: b */
    private b.d.g<String, d> f566b;

    /* renamed from: c */
    private b.d.h<String> f567c;

    /* renamed from: d */
    private final WeakHashMap<Context, b.d.d<WeakReference<Drawable.ConstantState>>> f568d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f569e;

    /* renamed from: f */
    private boolean f570f;

    /* renamed from: g */
    private e f571g;

    /* renamed from: h */
    private static final PorterDuff.Mode f564h = PorterDuff.Mode.SRC_IN;
    private static final c j = new c(6);

    /* loaded from: classes.dex */
    public static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.a.l.a.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.q.a.a.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b.d.e<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        private static int h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i, PorterDuff.Mode mode) {
            return c(Integer.valueOf(h(i, mode)));
        }

        PorterDuffColorFilter j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(h(i, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface e {
        Drawable a(m0 m0Var, Context context, int i);

        boolean b(Context context, int i, Drawable drawable);

        ColorStateList c(Context context, int i);

        boolean d(Context context, int i, Drawable drawable);

        PorterDuff.Mode e(int i);
    }

    /* loaded from: classes.dex */
    public static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.q.a.a.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.f566b == null) {
            this.f566b = new b.d.g<>();
        }
        this.f566b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            b.d.d<WeakReference<Drawable.ConstantState>> dVar = this.f568d.get(context);
            if (dVar == null) {
                dVar = new b.d.d<>();
                this.f568d.put(context, dVar);
            }
            dVar.l(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.f565a == null) {
            this.f565a = new WeakHashMap<>();
        }
        b.d.h<ColorStateList> hVar = this.f565a.get(context);
        if (hVar == null) {
            hVar = new b.d.h<>();
            this.f565a.put(context, hVar);
        }
        hVar.b(i2, colorStateList);
    }

    private void d(Context context) {
        if (this.f570f) {
            return;
        }
        this.f570f = true;
        Drawable j2 = j(context, b.a.m.a.a_res_0x7f08005b);
        if (j2 != null && q(j2)) {
            return;
        }
        this.f570f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i2) {
        if (this.f569e == null) {
            this.f569e = new TypedValue();
        }
        TypedValue typedValue = this.f569e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        e eVar = this.f571g;
        Drawable a2 = eVar == null ? null : eVar.a(this, context, i2);
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, a2);
        }
        return a2;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized m0 h() {
        m0 m0Var;
        synchronized (m0.class) {
            if (i == null) {
                m0 m0Var2 = new m0();
                i = m0Var2;
                p(m0Var2);
            }
            m0Var = i;
        }
        return m0Var;
    }

    private synchronized Drawable i(Context context, long j2) {
        b.d.d<WeakReference<Drawable.ConstantState>> dVar = this.f568d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> g2 = dVar.g(j2);
        if (g2 != null) {
            Drawable.ConstantState constantState = g2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.m(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter i3;
        synchronized (m0.class) {
            c cVar = j;
            i3 = cVar.i(i2, mode);
            if (i3 == null) {
                i3 = new PorterDuffColorFilter(i2, mode);
                cVar.j(i2, mode, i3);
            }
        }
        return i3;
    }

    private ColorStateList n(Context context, int i2) {
        b.d.h<ColorStateList> hVar;
        WeakHashMap<Context, b.d.h<ColorStateList>> weakHashMap = this.f565a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.g(i2);
    }

    private static void p(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new f());
            m0Var.a("animated-vector", new b());
            m0Var.a("animated-selector", new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof b.q.a.a.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i2) {
        int next;
        b.d.g<String, d> gVar = this.f566b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        b.d.h<String> hVar = this.f567c;
        if (hVar != null) {
            String g2 = hVar.g(i2);
            if ("appcompat_skip_skip".equals(g2) || (g2 != null && this.f566b.get(g2) == null)) {
                return null;
            }
        } else {
            this.f567c = new b.d.h<>();
        }
        if (this.f569e == null) {
            this.f569e = new TypedValue();
        }
        TypedValue typedValue = this.f569e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
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
                this.f567c.b(i2, name);
                d dVar = this.f566b.get(name);
                if (dVar != null) {
                    i3 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i3 != null) {
                    i3.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e2, i3);
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (i3 == null) {
            this.f567c.b(i2, "appcompat_skip_skip");
        }
        return i3;
    }

    private Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList m = m(context, i2);
        if (m == null) {
            e eVar = this.f571g;
            if ((eVar != null && eVar.d(context, i2, drawable)) || x(context, i2, drawable) || !z) {
                return drawable;
            }
            return null;
        }
        if (e0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable r = androidx.core.graphics.drawable.a.r(drawable);
        androidx.core.graphics.drawable.a.o(r, m);
        PorterDuff.Mode o = o(i2);
        if (o == null) {
            return r;
        }
        androidx.core.graphics.drawable.a.p(r, o);
        return r;
    }

    public static void w(Drawable drawable, u0 u0Var, int[] iArr) {
        if (e0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = u0Var.f636d;
        if (z || u0Var.f635c) {
            drawable.setColorFilter(g(z ? u0Var.f633a : null, u0Var.f635c ? u0Var.f634b : f564h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT > 23) {
            return;
        }
        drawable.invalidateSelf();
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable r;
        d(context);
        r = r(context, i2);
        if (r == null) {
            r = f(context, i2);
        }
        if (r == null) {
            r = b.g.d.a.d(context, i2);
        }
        if (r != null) {
            r = v(context, i2, z, r);
        }
        if (r != null) {
            e0.b(r);
        }
        return r;
    }

    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n;
        n = n(context, i2);
        if (n == null) {
            e eVar = this.f571g;
            n = eVar == null ? null : eVar.c(context, i2);
            if (n != null) {
                c(context, i2, n);
            }
        }
        return n;
    }

    PorterDuff.Mode o(int i2) {
        e eVar = this.f571g;
        if (eVar == null) {
            return null;
        }
        return eVar.e(i2);
    }

    public synchronized void s(Context context) {
        b.d.d<WeakReference<Drawable.ConstantState>> dVar = this.f568d.get(context);
        if (dVar != null) {
            dVar.d();
        }
    }

    public synchronized Drawable t(Context context, b1 b1Var, int i2) {
        Drawable r = r(context, i2);
        if (r == null) {
            r = b1Var.c(i2);
        }
        if (r != null) {
            return v(context, i2, false, r);
        }
        return null;
    }

    public synchronized void u(e eVar) {
        this.f571g = eVar;
    }

    public boolean x(Context context, int i2, Drawable drawable) {
        e eVar = this.f571g;
        return eVar != null && eVar.b(context, i2, drawable);
    }
}
