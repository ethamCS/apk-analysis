package a.g.d.c;

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
        private final C0006c[] f161a;

        public b(C0006c[] c0006cArr) {
            this.f161a = c0006cArr;
        }

        public C0006c[] a() {
            return this.f161a;
        }
    }

    /* renamed from: a.g.d.c.c$c */
    /* loaded from: classes.dex */
    public static final class C0006c {

        /* renamed from: a */
        private final String f162a;

        /* renamed from: b */
        private int f163b;

        /* renamed from: c */
        private boolean f164c;
        private String d;
        private int e;
        private int f;

        public C0006c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f162a = str;
            this.f163b = i;
            this.f164c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        public String a() {
            return this.f162a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.f163b;
        }

        public boolean f() {
            return this.f164c;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements a {

        /* renamed from: a */
        private final a.g.i.a f165a;

        /* renamed from: b */
        private final int f166b;

        /* renamed from: c */
        private final int f167c;

        public d(a.g.i.a aVar, int i, int i2) {
            this.f165a = aVar;
            this.f167c = i;
            this.f166b = i2;
        }

        public int a() {
            return this.f167c;
        }

        public a.g.i.a b() {
            return this.f165a;
        }

        public int c() {
            return this.f166b;
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

    public static a a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> a(Resources resources, int i) {
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
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static void a(XmlPullParser xmlPullParser) {
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

    private static a b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return c(xmlPullParser, resources);
        }
        a(xmlPullParser);
        return null;
    }

    private static a c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.g.c.FontFamily);
        String string = obtainAttributes.getString(a.g.c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(a.g.c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(a.g.c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(a.g.c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(a.g.c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(a.g.c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                a(xmlPullParser);
            }
            return new d(new a.g.i.a(string, string2, string3, a(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(d(xmlPullParser, resources));
                } else {
                    a(xmlPullParser);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return new b((C0006c[]) arrayList.toArray(new C0006c[arrayList.size()]));
        }
        return null;
    }

    private static C0006c d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.g.c.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(a.g.c.FontFamilyFont_fontWeight) ? a.g.c.FontFamilyFont_fontWeight : a.g.c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(a.g.c.FontFamilyFont_fontStyle) ? a.g.c.FontFamilyFont_fontStyle : a.g.c.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(a.g.c.FontFamilyFont_ttcIndex) ? a.g.c.FontFamilyFont_ttcIndex : a.g.c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(a.g.c.FontFamilyFont_fontVariationSettings) ? a.g.c.FontFamilyFont_fontVariationSettings : a.g.c.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(a.g.c.FontFamilyFont_font) ? a.g.c.FontFamilyFont_font : a.g.c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new C0006c(string2, i, z, string, i3, resourceId);
    }
}
