package b.g.d.c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final int[] f2368a;

        /* renamed from: b */
        final float[] f2369b;

        a(int i, int i2) {
            this.f2368a = new int[]{i, i2};
            this.f2369b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.f2368a = new int[]{i, i2, i3};
            this.f2369b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2368a = new int[size];
            this.f2369b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f2368a[i] = list.get(i).intValue();
                this.f2369b[i] = list2.get(i).floatValue();
            }
        }
    }

    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new a(i, i3, i2) : new a(i, i2);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray s = g.s(resources, theme, attributeSet, b.g.c.w);
        float j = g.j(s, xmlPullParser, "startX", b.g.c.F, 0.0f);
        float j2 = g.j(s, xmlPullParser, "startY", b.g.c.G, 0.0f);
        float j3 = g.j(s, xmlPullParser, "endX", b.g.c.H, 0.0f);
        float j4 = g.j(s, xmlPullParser, "endY", b.g.c.I, 0.0f);
        float j5 = g.j(s, xmlPullParser, "centerX", b.g.c.A, 0.0f);
        float j6 = g.j(s, xmlPullParser, "centerY", b.g.c.B, 0.0f);
        int k = g.k(s, xmlPullParser, "type", b.g.c.z, 0);
        int f2 = g.f(s, xmlPullParser, "startColor", b.g.c.x, 0);
        boolean r = g.r(xmlPullParser, "centerColor");
        int f3 = g.f(s, xmlPullParser, "centerColor", b.g.c.E, 0);
        int f4 = g.f(s, xmlPullParser, "endColor", b.g.c.y, 0);
        int k2 = g.k(s, xmlPullParser, "tileMode", b.g.c.D, 0);
        float j7 = g.j(s, xmlPullParser, "gradientRadius", b.g.c.C, 0.0f);
        s.recycle();
        a a2 = a(c(resources, xmlPullParser, attributeSet, theme), f2, f4, r, f3);
        if (k != 1) {
            return k != 2 ? new LinearGradient(j, j2, j3, j4, a2.f2368a, a2.f2369b, d(k2)) : new SweepGradient(j5, j6, a2.f2368a, a2.f2369b);
        } else if (j7 <= 0.0f) {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        } else {
            return new RadialGradient(j5, j6, j7, a2.f2368a, a2.f2369b, d(k2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static b.g.d.c.d.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = b.g.c.J
            android.content.res.TypedArray r3 = b.g.d.c.g.s(r9, r12, r11, r3)
            int r5 = b.g.c.K
            boolean r6 = r3.hasValue(r5)
            int r7 = b.g.c.L
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            b.g.d.c.d$a r9 = new b.g.d.c.d$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.d.c.d.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):b.g.d.c.d$a");
    }

    private static Shader.TileMode d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
