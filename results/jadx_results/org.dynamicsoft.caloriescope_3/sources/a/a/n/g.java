package a.a.n;

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
    static final Class<?>[] e;
    static final Class<?>[] f;

    /* renamed from: a */
    final Object[] f34a;

    /* renamed from: b */
    final Object[] f35b;

    /* renamed from: c */
    Context f36c;
    private Object d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f37c = {MenuItem.class};

        /* renamed from: a */
        private Object f38a;

        /* renamed from: b */
        private Method f39b;

        public a(Object obj, String str) {
            this.f38a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f39b = cls.getMethod(str, f37c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f39b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f39b.invoke(this.f38a, menuItem)).booleanValue();
                }
                this.f39b.invoke(this.f38a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        a.g.l.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a */
        private Menu f40a;

        /* renamed from: b */
        private int f41b;

        /* renamed from: c */
        private int f42c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
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
            this.f40a = menu;
            d();
        }

        private char a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f36c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        private void a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (g.this.f36c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.a(), this.z));
            }
            boolean z2 = menuItem instanceof androidx.appcompat.view.menu.i;
            if (z2) {
                androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) menuItem;
            }
            if (this.r >= 2) {
                if (z2) {
                    ((androidx.appcompat.view.menu.i) menuItem).c(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).a(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) a(str, g.e, g.this.f34a));
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
            a.g.l.b bVar = this.A;
            if (bVar != null) {
                a.g.l.g.a(menuItem, bVar);
            }
            a.g.l.g.a(menuItem, this.B);
            a.g.l.g.b(menuItem, this.C);
            a.g.l.g.a(menuItem, this.n, this.o);
            a.g.l.g.b(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                a.g.l.g.a(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                a.g.l.g.a(menuItem, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            a(this.f40a.add(this.f41b, this.i, this.j, this.k));
        }

        public void a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f36c.obtainStyledAttributes(attributeSet, a.a.j.MenuGroup);
            this.f41b = obtainStyledAttributes.getResourceId(a.a.j.MenuGroup_android_id, 0);
            this.f42c = obtainStyledAttributes.getInt(a.a.j.MenuGroup_android_menuCategory, 0);
            this.d = obtainStyledAttributes.getInt(a.a.j.MenuGroup_android_orderInCategory, 0);
            this.e = obtainStyledAttributes.getInt(a.a.j.MenuGroup_android_checkableBehavior, 0);
            this.f = obtainStyledAttributes.getBoolean(a.a.j.MenuGroup_android_visible, true);
            this.g = obtainStyledAttributes.getBoolean(a.a.j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public SubMenu b() {
            this.h = true;
            SubMenu addSubMenu = this.f40a.addSubMenu(this.f41b, this.i, this.j, this.k);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b(AttributeSet attributeSet) {
            w0 a2 = w0.a(g.this.f36c, attributeSet, a.a.j.MenuItem);
            this.i = a2.g(a.a.j.MenuItem_android_id, 0);
            this.j = (a2.d(a.a.j.MenuItem_android_menuCategory, this.f42c) & (-65536)) | (a2.d(a.a.j.MenuItem_android_orderInCategory, this.d) & 65535);
            this.k = a2.e(a.a.j.MenuItem_android_title);
            this.l = a2.e(a.a.j.MenuItem_android_titleCondensed);
            this.m = a2.g(a.a.j.MenuItem_android_icon, 0);
            this.n = a(a2.d(a.a.j.MenuItem_android_alphabeticShortcut));
            this.o = a2.d(a.a.j.MenuItem_alphabeticModifiers, 4096);
            this.p = a(a2.d(a.a.j.MenuItem_android_numericShortcut));
            this.q = a2.d(a.a.j.MenuItem_numericModifiers, 4096);
            this.r = a2.g(a.a.j.MenuItem_android_checkable) ? a2.a(a.a.j.MenuItem_android_checkable, false) : this.e;
            this.s = a2.a(a.a.j.MenuItem_android_checked, false);
            this.t = a2.a(a.a.j.MenuItem_android_visible, this.f);
            this.u = a2.a(a.a.j.MenuItem_android_enabled, this.g);
            this.v = a2.d(a.a.j.MenuItem_showAsAction, -1);
            this.z = a2.d(a.a.j.MenuItem_android_onClick);
            this.w = a2.g(a.a.j.MenuItem_actionLayout, 0);
            this.x = a2.d(a.a.j.MenuItem_actionViewClass);
            String d = a2.d(a.a.j.MenuItem_actionProviderClass);
            this.y = d;
            boolean z = d != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (a.g.l.b) a(this.y, g.f, g.this.f35b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = a2.e(a.a.j.MenuItem_contentDescription);
            this.C = a2.e(a.a.j.MenuItem_tooltipText);
            if (a2.g(a.a.j.MenuItem_iconTintMode)) {
                this.E = e0.a(a2.d(a.a.j.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (a2.g(a.a.j.MenuItem_iconTint)) {
                this.D = a2.a(a.a.j.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            a2.a();
            this.h = false;
        }

        public boolean c() {
            return this.h;
        }

        public void d() {
            this.f41b = 0;
            this.f42c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f36c = context;
        Object[] objArr = {context};
        this.f34a = objArr;
        this.f35b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
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
                        bVar.d();
                    } else if (name2.equals("item")) {
                        if (!bVar.c()) {
                            a.g.l.b bVar2 = bVar.A;
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
                    bVar.a(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.b(attributeSet);
                } else if (name3.equals("menu")) {
                    a(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object a() {
        if (this.d == null) {
            this.d = a(this.f36c);
        }
        return this.d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof a.g.f.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f36c.getResources().getLayout(i);
                    a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
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
