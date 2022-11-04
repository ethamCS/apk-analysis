package a.g.d.c;

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
        final int[] f168a;

        /* renamed from: b */
        final float[] f169b;

        a(int i, int i2) {
            this.f168a = new int[]{i, i2};
            this.f169b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.f168a = new int[]{i, i2, i3};
            this.f169b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f168a = new int[size];
            this.f169b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f168a[i] = list.get(i).intValue();
                this.f169b[i] = list2.get(i).floatValue();
            }
        }
    }

    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new a(i, i3, i2) : new a(i, i2);
    }

    private static Shader.TileMode a(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static Shader a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray a2 = g.a(resources, theme, attributeSet, a.g.c.GradientColor);
        float a3 = g.a(a2, xmlPullParser, "startX", a.g.c.GradientColor_android_startX, 0.0f);
        float a4 = g.a(a2, xmlPullParser, "startY", a.g.c.GradientColor_android_startY, 0.0f);
        float a5 = g.a(a2, xmlPullParser, "endX", a.g.c.GradientColor_android_endX, 0.0f);
        float a6 = g.a(a2, xmlPullParser, "endY", a.g.c.GradientColor_android_endY, 0.0f);
        float a7 = g.a(a2, xmlPullParser, "centerX", a.g.c.GradientColor_android_centerX, 0.0f);
        float a8 = g.a(a2, xmlPullParser, "centerY", a.g.c.GradientColor_android_centerY, 0.0f);
        int b2 = g.b(a2, xmlPullParser, "type", a.g.c.GradientColor_android_type, 0);
        int a9 = g.a(a2, xmlPullParser, "startColor", a.g.c.GradientColor_android_startColor, 0);
        boolean a10 = g.a(xmlPullParser, "centerColor");
        int a11 = g.a(a2, xmlPullParser, "centerColor", a.g.c.GradientColor_android_centerColor, 0);
        int a12 = g.a(a2, xmlPullParser, "endColor", a.g.c.GradientColor_android_endColor, 0);
        int b3 = g.b(a2, xmlPullParser, "tileMode", a.g.c.GradientColor_android_tileMode, 0);
        float a13 = g.a(a2, xmlPullParser, "gradientRadius", a.g.c.GradientColor_android_gradientRadius, 0.0f);
        a2.recycle();
        a a14 = a(b(resources, xmlPullParser, attributeSet, theme), a9, a12, a10, a11);
        if (b2 != 1) {
            return b2 != 2 ? new LinearGradient(a3, a4, a5, a6, a14.f168a, a14.f169b, a(b3)) : new SweepGradient(a7, a8, a14.f168a, a14.f169b);
        } else if (a13 <= 0.0f) {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        } else {
            return new RadialGradient(a7, a8, a13, a14.f168a, a14.f169b, a(b3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static a.g.d.c.d.a b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = a.g.c.GradientColorItem
            android.content.res.TypedArray r3 = a.g.d.c.g.a(r8, r11, r10, r3)
            int r5 = a.g.c.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = a.g.c.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = a.g.c.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = a.g.c.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            a.g.d.c.d$a r8 = new a.g.d.c.d$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.d.c.d.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):a.g.d.c.d$a");
    }
}
