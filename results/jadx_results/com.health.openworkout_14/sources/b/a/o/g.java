package b.a.o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f2064e;

    /* renamed from: f */
    static final Class<?>[] f2065f;

    /* renamed from: a */
    final Object[] f2066a;

    /* renamed from: b */
    final Object[] f2067b;

    /* renamed from: c */
    Context f2068c;

    /* renamed from: d */
    private Object f2069d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        private static final Class<?>[] f2070d = {MenuItem.class};

        /* renamed from: b */
        private Object f2071b;

        /* renamed from: c */
        private Method f2072c;

        public a(Object obj, String str) {
            this.f2071b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2072c = cls.getMethod(str, f2070d);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2072c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2072c.invoke(this.f2071b, menuItem)).booleanValue();
                }
                this.f2072c.invoke(this.f2071b, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        b.g.l.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a */
        private Menu f2073a;

        /* renamed from: b */
        private int f2074b;

        /* renamed from: c */
        private int f2075c;

        /* renamed from: d */
        private int f2076d;

        /* renamed from: e */
        private int f2077e;

        /* renamed from: f */
        private boolean f2078f;

        /* renamed from: g */
        private boolean f2079g;

        /* renamed from: h */
        private boolean f2080h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            g.this = r1;
            this.f2073a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f2068c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (g.this.f2068c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f2064e, g.this.f2066a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            b.g.l.b bVar = this.A;
            if (bVar != null) {
                b.g.l.i.a(menuItem, bVar);
            }
            b.g.l.i.c(menuItem, this.B);
            b.g.l.i.g(menuItem, this.C);
            b.g.l.i.b(menuItem, this.n, this.o);
            b.g.l.i.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                b.g.l.i.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                b.g.l.i.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f2080h = true;
            i(this.f2073a.add(this.f2074b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.f2080h = true;
            SubMenu addSubMenu = this.f2073a.addSubMenu(this.f2074b, this.i, this.j, this.k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f2080h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f2068c.obtainStyledAttributes(attributeSet, b.a.j.p1);
            this.f2074b = obtainStyledAttributes.getResourceId(b.a.j.r1, 0);
            this.f2075c = obtainStyledAttributes.getInt(b.a.j.t1, 0);
            this.f2076d = obtainStyledAttributes.getInt(b.a.j.u1, 0);
            this.f2077e = obtainStyledAttributes.getInt(b.a.j.v1, 0);
            this.f2078f = obtainStyledAttributes.getBoolean(b.a.j.s1, true);
            this.f2079g = obtainStyledAttributes.getBoolean(b.a.j.q1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            w0 u = w0.u(g.this.f2068c, attributeSet, b.a.j.w1);
            this.i = u.n(b.a.j.z1, 0);
            this.j = (u.k(b.a.j.C1, this.f2075c) & (-65536)) | (u.k(b.a.j.D1, this.f2076d) & 65535);
            this.k = u.p(b.a.j.E1);
            this.l = u.p(b.a.j.F1);
            this.m = u.n(b.a.j.x1, 0);
            this.n = c(u.o(b.a.j.G1));
            this.o = u.k(b.a.j.N1, 4096);
            this.p = c(u.o(b.a.j.H1));
            this.q = u.k(b.a.j.R1, 4096);
            int i = b.a.j.I1;
            this.r = u.s(i) ? u.a(i, false) : this.f2077e;
            this.s = u.a(b.a.j.A1, false);
            this.t = u.a(b.a.j.B1, this.f2078f);
            this.u = u.a(b.a.j.y1, this.f2079g);
            this.v = u.k(b.a.j.S1, -1);
            this.z = u.o(b.a.j.J1);
            this.w = u.n(b.a.j.K1, 0);
            this.x = u.o(b.a.j.M1);
            String o = u.o(b.a.j.L1);
            this.y = o;
            boolean z = o != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (b.g.l.b) e(o, g.f2065f, g.this.f2067b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u.p(b.a.j.O1);
            this.C = u.p(b.a.j.T1);
            int i2 = b.a.j.Q1;
            if (u.s(i2)) {
                this.E = e0.e(u.k(i2, -1), this.E);
            } else {
                this.E = null;
            }
            int i3 = b.a.j.P1;
            if (u.s(i3)) {
                this.D = u.c(i3);
            } else {
                this.D = null;
            }
            u.w();
            this.f2080h = false;
        }

        public void h() {
            this.f2074b = 0;
            this.f2075c = 0;
            this.f2076d = 0;
            this.f2077e = 0;
            this.f2078f = true;
            this.f2079g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f2064e = clsArr;
        f2065f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f2068c = context;
        Object[] objArr = {context};
        this.f2066a = objArr;
        this.f2067b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            b.g.l.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f2069d == null) {
            this.f2069d = a(this.f2068c);
        }
        return this.f2069d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof b.g.f.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f2068c.getResources().getLayout(i);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
