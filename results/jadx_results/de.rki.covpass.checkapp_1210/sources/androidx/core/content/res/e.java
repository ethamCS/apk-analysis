package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final d[] f3411a;

        public c(d[] dVarArr) {
            this.f3411a = dVarArr;
        }

        public d[] a() {
            return this.f3411a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final String f3412a;

        /* renamed from: b */
        private final int f3413b;

        /* renamed from: c */
        private final boolean f3414c;

        /* renamed from: d */
        private final String f3415d;

        /* renamed from: e */
        private final int f3416e;

        /* renamed from: f */
        private final int f3417f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f3412a = str;
            this.f3413b = i10;
            this.f3414c = z10;
            this.f3415d = str2;
            this.f3416e = i11;
            this.f3417f = i12;
        }

        public String a() {
            return this.f3412a;
        }

        public int b() {
            return this.f3417f;
        }

        public int c() {
            return this.f3416e;
        }

        public String d() {
            return this.f3415d;
        }

        public int e() {
            return this.f3413b;
        }

        public boolean f() {
            return this.f3414c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e */
    /* loaded from: classes.dex */
    public static final class C0030e implements b {

        /* renamed from: a */
        private final androidx.core.provider.e f3418a;

        /* renamed from: b */
        private final int f3419b;

        /* renamed from: c */
        private final int f3420c;

        /* renamed from: d */
        private final String f3421d;

        public C0030e(androidx.core.provider.e eVar, int i10, int i11, String str) {
            this.f3418a = eVar;
            this.f3420c = i10;
            this.f3419b = i11;
            this.f3421d = str;
        }

        public int a() {
            return this.f3420c;
        }

        public androidx.core.provider.e b() {
            return this.f3418a;
        }

        public String c() {
            return this.f3421d;
        }

        public int d() {
            return this.f3419b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
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

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), q0.c.f19318h);
        String string = obtainAttributes.getString(q0.c.f19319i);
        String string2 = obtainAttributes.getString(q0.c.f19323m);
        String string3 = obtainAttributes.getString(q0.c.f19324n);
        int resourceId = obtainAttributes.getResourceId(q0.c.f19320j, 0);
        int integer = obtainAttributes.getInteger(q0.c.f19321k, 1);
        int integer2 = obtainAttributes.getInteger(q0.c.f19322l, 500);
        String string4 = obtainAttributes.getString(q0.c.f19325o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0030e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
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
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        return null;
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), q0.c.f19326p);
        int i10 = q0.c.f19335y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = q0.c.f19328r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = q0.c.f19333w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = q0.c.f19329s;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = q0.c.f19336z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = q0.c.f19330t;
        }
        int i14 = q0.c.f19334x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = q0.c.f19331u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = q0.c.f19332v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = q0.c.f19327q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
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
