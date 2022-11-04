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
public class d {

    /* renamed from: a */
    private SparseArray<a> f779a = new SparseArray<>();

    /* renamed from: b */
    private SparseArray<e> f780b = new SparseArray<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f781a;

        /* renamed from: b */
        ArrayList<b> f782b = new ArrayList<>();

        /* renamed from: c */
        int f783c;

        /* renamed from: d */
        e f784d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f783c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.K3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.L3) {
                    this.f781a = obtainStyledAttributes.getResourceId(index, this.f781a);
                } else if (index == j.M3) {
                    this.f783c = obtainStyledAttributes.getResourceId(index, this.f783c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f783c);
                    context.getResources().getResourceName(this.f783c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f784d = eVar;
                        eVar.e(context, this.f783c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f782b.add(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        float f785a;

        /* renamed from: b */
        float f786b;

        /* renamed from: c */
        float f787c;

        /* renamed from: d */
        float f788d;

        /* renamed from: e */
        int f789e;

        /* renamed from: f */
        e f790f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f785a = Float.NaN;
            this.f786b = Float.NaN;
            this.f787c = Float.NaN;
            this.f788d = Float.NaN;
            this.f789e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.Z3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.a4) {
                    this.f789e = obtainStyledAttributes.getResourceId(index, this.f789e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f789e);
                    context.getResources().getResourceName(this.f789e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f790f = eVar;
                        eVar.e(context, this.f789e);
                    }
                } else if (index == j.b4) {
                    this.f788d = obtainStyledAttributes.getDimension(index, this.f788d);
                } else if (index == j.c4) {
                    this.f786b = obtainStyledAttributes.getDimension(index, this.f786b);
                } else if (index == j.d4) {
                    this.f787c = obtainStyledAttributes.getDimension(index, this.f787c);
                } else if (index == j.e4) {
                    this.f785a = obtainStyledAttributes.getDimension(index, this.f785a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public d(Context context, ConstraintLayout constraintLayout, int i) {
        a(context, i);
    }

    private void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c2 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0 && c2 != 1) {
                        if (c2 == 2) {
                            aVar = new a(context, xml);
                            this.f779a.put(aVar.f781a, aVar);
                        } else if (c2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (c2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue == null || attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    } else {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                eVar.l(context, xmlPullParser);
                this.f780b.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(g gVar) {
    }
}
