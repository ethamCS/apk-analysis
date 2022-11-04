package a.g.d.c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final Shader f158a;

    /* renamed from: b */
    private final ColorStateList f159b;

    /* renamed from: c */
    private int f160c;

    private b(Shader shader, ColorStateList colorStateList, int i) {
        this.f158a = shader;
        this.f159b = colorStateList;
        this.f160c = i;
    }

    static b a(ColorStateList colorStateList) {
        return new b(null, colorStateList, colorStateList.getDefaultColor());
    }

    private static b a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c2 = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c2 = 0;
                }
            } else if (name.equals("gradient")) {
                c2 = 1;
            }
            if (c2 == 0) {
                return a(a.a(resources, xml, asAttributeSet, theme));
            }
            if (c2 == 1) {
                return a(d.a(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    static b a(Shader shader) {
        return new b(shader, null, 0);
    }

    public static b b(int i) {
        return new b(null, null, i);
    }

    public static b b(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    public int a() {
        return this.f160c;
    }

    public void a(int i) {
        this.f160c = i;
    }

    public boolean a(int[] iArr) {
        if (d()) {
            ColorStateList colorStateList = this.f159b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f160c) {
                this.f160c = colorForState;
                return true;
            }
        }
        return false;
    }

    public Shader b() {
        return this.f158a;
    }

    public boolean c() {
        return this.f158a != null;
    }

    public boolean d() {
        ColorStateList colorStateList;
        return this.f158a == null && (colorStateList = this.f159b) != null && colorStateList.isStateful();
    }

    public boolean e() {
        return c() || this.f160c != 0;
    }
}
