package androidx.core.content.res;

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
public final class f {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final int[] f3422a;

        /* renamed from: b */
        final float[] f3423b;

        a(int i10, int i11) {
            this.f3422a = new int[]{i10, i11};
            this.f3423b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f3422a = new int[]{i10, i11, i12};
            this.f3423b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f3422a = new int[size];
            this.f3423b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f3422a[i10] = list.get(i10).intValue();
                this.f3423b[i10] = list2.get(i10).floatValue();
            }
        }
    }

    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray k10 = k.k(resources, theme, attributeSet, q0.c.A);
        float f10 = k.f(k10, xmlPullParser, "startX", q0.c.J, 0.0f);
        float f11 = k.f(k10, xmlPullParser, "startY", q0.c.K, 0.0f);
        float f12 = k.f(k10, xmlPullParser, "endX", q0.c.L, 0.0f);
        float f13 = k.f(k10, xmlPullParser, "endY", q0.c.M, 0.0f);
        float f14 = k.f(k10, xmlPullParser, "centerX", q0.c.E, 0.0f);
        float f15 = k.f(k10, xmlPullParser, "centerY", q0.c.F, 0.0f);
        int g10 = k.g(k10, xmlPullParser, "type", q0.c.D, 0);
        int b10 = k.b(k10, xmlPullParser, "startColor", q0.c.B, 0);
        boolean j10 = k.j(xmlPullParser, "centerColor");
        int b11 = k.b(k10, xmlPullParser, "centerColor", q0.c.I, 0);
        int b12 = k.b(k10, xmlPullParser, "endColor", q0.c.C, 0);
        int g11 = k.g(k10, xmlPullParser, "tileMode", q0.c.H, 0);
        float f16 = k.f(k10, xmlPullParser, "gradientRadius", q0.c.G, 0.0f);
        k10.recycle();
        a a10 = a(c(resources, xmlPullParser, attributeSet, theme), b10, b12, j10, b11);
        if (g10 != 1) {
            return g10 != 2 ? new LinearGradient(f10, f11, f12, f13, a10.f3422a, a10.f3423b, d(g11)) : new SweepGradient(f14, f15, a10.f3422a, a10.f3423b);
        } else if (f16 <= 0.0f) {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        } else {
            return new RadialGradient(f14, f15, f16, a10.f3422a, a10.f3423b, d(g11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
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
            int[] r3 = q0.c.N
            android.content.res.TypedArray r3 = androidx.core.content.res.k.k(r9, r12, r11, r3)
            int r5 = q0.c.O
            boolean r6 = r3.hasValue(r5)
            int r7 = q0.c.P
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
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
