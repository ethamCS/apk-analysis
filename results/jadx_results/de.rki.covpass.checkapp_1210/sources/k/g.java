package k;

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
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.h0;
import androidx.core.view.k;
import e.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f14491e;

    /* renamed from: f */
    static final Class<?>[] f14492f;

    /* renamed from: a */
    final Object[] f14493a;

    /* renamed from: b */
    final Object[] f14494b;

    /* renamed from: c */
    Context f14495c;

    /* renamed from: d */
    private Object f14496d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f14497c = {MenuItem.class};

        /* renamed from: a */
        private Object f14498a;

        /* renamed from: b */
        private Method f14499b;

        public a(Object obj, String str) {
            this.f14498a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f14499b = cls.getMethod(str, f14497c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f14499b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f14499b.invoke(this.f14498a, menuItem)).booleanValue();
                }
                this.f14499b.invoke(this.f14498a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a */
        private Menu f14500a;

        /* renamed from: b */
        private int f14501b;

        /* renamed from: c */
        private int f14502c;

        /* renamed from: d */
        private int f14503d;

        /* renamed from: e */
        private int f14504e;

        /* renamed from: f */
        private boolean f14505f;

        /* renamed from: g */
        private boolean f14506g;

        /* renamed from: h */
        private boolean f14507h;

        /* renamed from: i */
        private int f14508i;

        /* renamed from: j */
        private int f14509j;

        /* renamed from: k */
        private CharSequence f14510k;

        /* renamed from: l */
        private CharSequence f14511l;

        /* renamed from: m */
        private int f14512m;

        /* renamed from: n */
        private char f14513n;

        /* renamed from: o */
        private int f14514o;

        /* renamed from: p */
        private char f14515p;

        /* renamed from: q */
        private int f14516q;

        /* renamed from: r */
        private int f14517r;

        /* renamed from: s */
        private boolean f14518s;

        /* renamed from: t */
        private boolean f14519t;

        /* renamed from: u */
        private boolean f14520u;

        /* renamed from: v */
        private int f14521v;

        /* renamed from: w */
        private int f14522w;

        /* renamed from: x */
        private String f14523x;

        /* renamed from: y */
        private String f14524y;

        /* renamed from: z */
        private String f14525z;

        public b(Menu menu) {
            g.this = r1;
            this.f14500a = menu;
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
                Constructor<?> constructor = Class.forName(str, false, g.this.f14495c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f14518s).setVisible(this.f14519t).setEnabled(this.f14520u).setCheckable(this.f14517r >= 1).setTitleCondensed(this.f14511l).setIcon(this.f14512m);
            int i10 = this.f14521v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f14525z != null) {
                if (g.this.f14495c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f14525z));
            }
            if (this.f14517r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof l.c) {
                    ((l.c) menuItem).h(true);
                }
            }
            String str = this.f14523x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f14491e, g.this.f14493a));
                z10 = true;
            }
            int i11 = this.f14522w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                k.a(menuItem, bVar);
            }
            k.c(menuItem, this.B);
            k.g(menuItem, this.C);
            k.b(menuItem, this.f14513n, this.f14514o);
            k.f(menuItem, this.f14515p, this.f14516q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                k.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                k.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f14507h = true;
            i(this.f14500a.add(this.f14501b, this.f14508i, this.f14509j, this.f14510k));
        }

        public SubMenu b() {
            this.f14507h = true;
            SubMenu addSubMenu = this.f14500a.addSubMenu(this.f14501b, this.f14508i, this.f14509j, this.f14510k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f14507h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f14495c.obtainStyledAttributes(attributeSet, j.f9281o1);
            this.f14501b = obtainStyledAttributes.getResourceId(j.f9291q1, 0);
            this.f14502c = obtainStyledAttributes.getInt(j.f9301s1, 0);
            this.f14503d = obtainStyledAttributes.getInt(j.f9306t1, 0);
            this.f14504e = obtainStyledAttributes.getInt(j.f9311u1, 0);
            this.f14505f = obtainStyledAttributes.getBoolean(j.f9296r1, true);
            this.f14506g = obtainStyledAttributes.getBoolean(j.f9286p1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            a1 u10 = a1.u(g.this.f14495c, attributeSet, j.f9316v1);
            this.f14508i = u10.n(j.f9331y1, 0);
            this.f14509j = (u10.k(j.B1, this.f14502c) & (-65536)) | (u10.k(j.C1, this.f14503d) & 65535);
            this.f14510k = u10.p(j.D1);
            this.f14511l = u10.p(j.E1);
            this.f14512m = u10.n(j.f9321w1, 0);
            this.f14513n = c(u10.o(j.F1));
            this.f14514o = u10.k(j.M1, 4096);
            this.f14515p = c(u10.o(j.G1));
            this.f14516q = u10.k(j.Q1, 4096);
            int i10 = j.H1;
            this.f14517r = u10.s(i10) ? u10.a(i10, false) : this.f14504e;
            this.f14518s = u10.a(j.f9336z1, false);
            this.f14519t = u10.a(j.A1, this.f14505f);
            this.f14520u = u10.a(j.f9326x1, this.f14506g);
            this.f14521v = u10.k(j.R1, -1);
            this.f14525z = u10.o(j.I1);
            this.f14522w = u10.n(j.J1, 0);
            this.f14523x = u10.o(j.L1);
            String o10 = u10.o(j.K1);
            this.f14524y = o10;
            boolean z10 = o10 != null;
            if (z10 && this.f14522w == 0 && this.f14523x == null) {
                this.A = (androidx.core.view.b) e(o10, g.f14492f, g.this.f14494b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u10.p(j.N1);
            this.C = u10.p(j.S1);
            int i11 = j.P1;
            if (u10.s(i11)) {
                this.E = h0.e(u10.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.O1;
            if (u10.s(i12)) {
                this.D = u10.c(i12);
            } else {
                this.D = null;
            }
            u10.w();
            this.f14507h = false;
        }

        public void h() {
            this.f14501b = 0;
            this.f14502c = 0;
            this.f14503d = 0;
            this.f14504e = 0;
            this.f14505f = true;
            this.f14506g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f14491e = clsArr;
        f14492f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f14495c = context;
        Object[] objArr = {context};
        this.f14493a = objArr;
        this.f14494b = objArr;
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
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        str = null;
                        z11 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            androidx.core.view.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f14496d == null) {
            this.f14496d = a(this.f14495c);
        }
        return this.f14496d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof r0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f14495c.getResources().getLayout(i10);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
