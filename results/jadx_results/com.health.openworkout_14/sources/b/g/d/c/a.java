package b.g.d.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class a {
    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return d(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static ColorStateList c(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i), theme);
        } catch (Exception e2) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r7.hasValue(r12) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList d(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r19
            int r1 = r18.getDepth()
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            int[][] r4 = new int[r3]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = 0
        L10:
            int r7 = r18.next()
            if (r7 == r2) goto Laa
            int r8 = r18.getDepth()
            if (r8 >= r1) goto L1f
            r9 = 3
            if (r7 == r9) goto Laa
        L1f:
            r9 = 2
            if (r7 != r9) goto La3
            if (r8 > r1) goto La3
            java.lang.String r7 = r18.getName()
            java.lang.String r8 = "item"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L32
            goto La3
        L32:
            int[] r7 = b.g.c.f2345a
            r8 = r17
            r9 = r20
            android.content.res.TypedArray r7 = f(r8, r9, r0, r7)
            int r10 = b.g.c.f2346b
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r7.getColor(r10, r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = b.g.c.f2347c
            boolean r13 = r7.hasValue(r12)
            if (r13 == 0) goto L54
        L4f:
            float r11 = r7.getFloat(r12, r11)
            goto L5d
        L54:
            int r12 = b.g.c.f2348d
            boolean r13 = r7.hasValue(r12)
            if (r13 == 0) goto L5d
            goto L4f
        L5d:
            r7.recycle()
            int r7 = r19.getAttributeCount()
            int[] r12 = new int[r7]
            r13 = 0
            r14 = 0
        L68:
            if (r13 >= r7) goto L8d
            int r15 = r0.getAttributeNameResource(r13)
            r2 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r2) goto L89
            r2 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r2) goto L89
            int r2 = b.g.a.a_res_0x7f04002d
            if (r15 == r2) goto L89
            int r2 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r5)
            if (r16 == 0) goto L85
            goto L86
        L85:
            int r15 = -r15
        L86:
            r12[r14] = r15
            r14 = r2
        L89:
            int r13 = r13 + 1
            r2 = 1
            goto L68
        L8d:
            int[] r2 = android.util.StateSet.trimStateSet(r12, r14)
            int r7 = e(r10, r11)
            int[] r3 = b.g.d.c.e.a(r3, r6, r7)
            java.lang.Object[] r2 = b.g.d.c.e.b(r4, r6, r2)
            r4 = r2
            int[][] r4 = (int[][]) r4
            int r6 = r6 + 1
            goto La7
        La3:
            r8 = r17
            r9 = r20
        La7:
            r2 = 1
            goto L10
        Laa:
            int[] r0 = new int[r6]
            int[][] r1 = new int[r6]
            java.lang.System.arraycopy(r3, r5, r0, r5, r6)
            java.lang.System.arraycopy(r4, r5, r1, r5, r6)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.d.c.a.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static int e(int i, float f2) {
        return (i & 16777215) | (Math.round(Color.alpha(i) * f2) << 24);
    }

    private static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
