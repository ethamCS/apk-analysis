package b.g.d.c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b implements a {

        /* renamed from: a */
        private final C0042c[] f2358a;

        public b(C0042c[] c0042cArr) {
            this.f2358a = c0042cArr;
        }

        public C0042c[] a() {
            return this.f2358a;
        }
    }

    /* renamed from: b.g.d.c.c$c */
    /* loaded from: classes.dex */
    public static final class C0042c {

        /* renamed from: a */
        private final String f2359a;

        /* renamed from: b */
        private int f2360b;

        /* renamed from: c */
        private boolean f2361c;

        /* renamed from: d */
        private String f2362d;

        /* renamed from: e */
        private int f2363e;

        /* renamed from: f */
        private int f2364f;

        public C0042c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2359a = str;
            this.f2360b = i;
            this.f2361c = z;
            this.f2362d = str2;
            this.f2363e = i2;
            this.f2364f = i3;
        }

        public String a() {
            return this.f2359a;
        }

        public int b() {
            return this.f2364f;
        }

        public int c() {
            return this.f2363e;
        }

        public String d() {
            return this.f2362d;
        }

        public int e() {
            return this.f2360b;
        }

        public boolean f() {
            return this.f2361c;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements a {

        /* renamed from: a */
        private final b.g.i.a f2365a;

        /* renamed from: b */
        private final int f2366b;

        /* renamed from: c */
        private final int f2367c;

        public d(b.g.i.a aVar, int i, int i2) {
            this.f2365a = aVar;
            this.f2367c = i;
            this.f2366b = i2;
        }

        public int a() {
            return this.f2367c;
        }

        public b.g.i.a b() {
            return this.f2365a;
        }

        public int c() {
            return this.f2366b;
        }
    }

    private static int a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.g.c.f2349e);
        String string = obtainAttributes.getString(b.g.c.f2350f);
        String string2 = obtainAttributes.getString(b.g.c.j);
        String string3 = obtainAttributes.getString(b.g.c.k);
        int resourceId = obtainAttributes.getResourceId(b.g.c.f2351g, 0);
        int integer = obtainAttributes.getInteger(b.g.c.f2352h, 1);
        int integer2 = obtainAttributes.getInteger(b.g.c.i, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new b.g.i.a(string, string2, string3, c(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return new b((C0042c[]) arrayList.toArray(new C0042c[arrayList.size()]));
        }
        return null;
    }

    private static C0042c f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.g.c.l);
        int i = b.g.c.u;
        if (!obtainAttributes.hasValue(i)) {
            i = b.g.c.n;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = b.g.c.s;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = b.g.c.o;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = b.g.c.v;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = b.g.c.p;
        }
        int i5 = b.g.c.t;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = b.g.c.q;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = b.g.c.r;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = b.g.c.m;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0042c(string2, i2, z, string, i6, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
