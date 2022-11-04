package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private final ConstraintLayout f2931a;

    /* renamed from: b */
    d f2932b;

    /* renamed from: c */
    int f2933c = -1;

    /* renamed from: d */
    int f2934d = -1;

    /* renamed from: e */
    private SparseArray<a> f2935e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<d> f2936f = new SparseArray<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f2937a;

        /* renamed from: b */
        ArrayList<b> f2938b = new ArrayList<>();

        /* renamed from: c */
        int f2939c;

        /* renamed from: d */
        d f2940d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f2939c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.U6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.V6) {
                    this.f2937a = obtainStyledAttributes.getResourceId(index, this.f2937a);
                } else if (index == i.W6) {
                    this.f2939c = obtainStyledAttributes.getResourceId(index, this.f2939c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2939c);
                    context.getResources().getResourceName(this.f2939c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f2940d = dVar;
                        dVar.f(context, this.f2939c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f2938b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f2938b.size(); i10++) {
                if (this.f2938b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        float f2941a;

        /* renamed from: b */
        float f2942b;

        /* renamed from: c */
        float f2943c;

        /* renamed from: d */
        float f2944d;

        /* renamed from: e */
        int f2945e;

        /* renamed from: f */
        d f2946f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f2941a = Float.NaN;
            this.f2942b = Float.NaN;
            this.f2943c = Float.NaN;
            this.f2944d = Float.NaN;
            this.f2945e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f3231s7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f3240t7) {
                    this.f2945e = obtainStyledAttributes.getResourceId(index, this.f2945e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2945e);
                    context.getResources().getResourceName(this.f2945e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f2946f = dVar;
                        dVar.f(context, this.f2945e);
                    }
                } else if (index == i.f3249u7) {
                    this.f2944d = obtainStyledAttributes.getDimension(index, this.f2944d);
                } else if (index == i.f3258v7) {
                    this.f2942b = obtainStyledAttributes.getDimension(index, this.f2942b);
                } else if (index == i.f3267w7) {
                    this.f2943c = obtainStyledAttributes.getDimension(index, this.f2943c);
                } else if (index == i.f3276x7) {
                    this.f2941a = obtainStyledAttributes.getDimension(index, this.f2941a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (Float.isNaN(this.f2941a) || f10 >= this.f2941a) {
                if (!Float.isNaN(this.f2942b) && f11 < this.f2942b) {
                    return false;
                }
                if (!Float.isNaN(this.f2943c) && f10 > this.f2943c) {
                    return false;
                }
                return Float.isNaN(this.f2944d) || f11 <= this.f2944d;
            }
            return false;
        }
    }

    public c(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f2931a = constraintLayout;
        a(context, i10);
    }

    private void a(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        a aVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                boolean z10 = true;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            z10 = true;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                z10 = false;
                                break;
                            }
                            z10 = true;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            break;
                        default:
                            z10 = true;
                            break;
                    }
                    if (z10) {
                        aVar = new a(context, xml);
                        this.f2935e.put(aVar.f2937a, aVar);
                    } else if (z10) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    } else if (z10) {
                        b(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.n(context, xmlPullParser);
                this.f2936f.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }

    public void d(int i10, float f10, float f11) {
        int b10;
        int i11 = this.f2933c;
        if (i11 == i10) {
            a valueAt = i10 == -1 ? this.f2935e.valueAt(0) : this.f2935e.get(i11);
            int i12 = this.f2934d;
            if ((i12 != -1 && valueAt.f2938b.get(i12).a(f10, f11)) || this.f2934d == (b10 = valueAt.b(f10, f11))) {
                return;
            }
            d dVar = b10 == -1 ? this.f2932b : valueAt.f2938b.get(b10).f2946f;
            if (b10 != -1) {
                int i13 = valueAt.f2938b.get(b10).f2945e;
            }
            if (dVar == null) {
                return;
            }
            this.f2934d = b10;
            dVar.c(this.f2931a);
            return;
        }
        this.f2933c = i10;
        a aVar = this.f2935e.get(i10);
        int b11 = aVar.b(f10, f11);
        d dVar2 = b11 == -1 ? aVar.f2940d : aVar.f2938b.get(b11).f2946f;
        if (b11 != -1) {
            int i14 = aVar.f2938b.get(b11).f2945e;
        }
        if (dVar2 != null) {
            this.f2934d = b11;
            dVar2.c(this.f2931a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }
}
