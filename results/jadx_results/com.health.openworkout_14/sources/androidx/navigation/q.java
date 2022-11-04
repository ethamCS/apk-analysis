package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.e;
import androidx.navigation.i;
import androidx.navigation.r;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c */
    private static final ThreadLocal<TypedValue> f1364c = new ThreadLocal<>();

    /* renamed from: a */
    private Context f1365a;

    /* renamed from: b */
    private v f1366b;

    public q(Context context, v vVar) {
        this.f1365a = context;
        this.f1366b = vVar;
    }

    private static s a(TypedValue typedValue, s sVar, s sVar2, String str, String str2) {
        if (sVar == null || sVar == sVar2) {
            return sVar != null ? sVar : sVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    private l b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        l a2 = this.f1366b.d(xmlResourceParser.getName()).a();
        a2.n(this.f1365a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    g(resources, a2, attributeSet, i);
                } else if ("deepLink".equals(name)) {
                    h(resources, a2, attributeSet);
                } else if ("action".equals(name)) {
                    d(resources, a2, attributeSet, xmlResourceParser, i);
                } else if ("include".equals(name) && (a2 instanceof n)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, x.i);
                    ((n) a2).t(c(obtainAttributes.getResourceId(x.j, 0)));
                    obtainAttributes.recycle();
                } else if (a2 instanceof n) {
                    ((n) a2).t(b(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return a2;
    }

    private void d(Resources resources, l lVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) {
        int depth;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.y.a.f1399a);
        int resourceId = obtainAttributes.getResourceId(androidx.navigation.y.a.f1400b, 0);
        d dVar = new d(obtainAttributes.getResourceId(androidx.navigation.y.a.f1401c, 0));
        r.a aVar = new r.a();
        aVar.d(obtainAttributes.getBoolean(androidx.navigation.y.a.f1404f, false));
        aVar.g(obtainAttributes.getResourceId(androidx.navigation.y.a.i, -1), obtainAttributes.getBoolean(androidx.navigation.y.a.j, false));
        aVar.b(obtainAttributes.getResourceId(androidx.navigation.y.a.f1402d, -1));
        aVar.c(obtainAttributes.getResourceId(androidx.navigation.y.a.f1403e, -1));
        aVar.e(obtainAttributes.getResourceId(androidx.navigation.y.a.f1405g, -1));
        aVar.f(obtainAttributes.getResourceId(androidx.navigation.y.a.f1406h, -1));
        dVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                f(resources, bundle, attributeSet, i);
            }
        }
        if (!bundle.isEmpty()) {
            dVar.d(bundle);
        }
        lVar.o(resourceId, dVar);
        obtainAttributes.recycle();
    }

    private e e(TypedArray typedArray, Resources resources, int i) {
        int dimension;
        e.a aVar = new e.a();
        boolean z = false;
        aVar.c(typedArray.getBoolean(androidx.navigation.y.a.o, false));
        ThreadLocal<TypedValue> threadLocal = f1364c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(androidx.navigation.y.a.n);
        Object obj = null;
        s<Integer> a2 = string != null ? s.a(string, resources.getResourcePackageName(i)) : null;
        int i2 = androidx.navigation.y.a.m;
        if (typedArray.getValue(i2, typedValue)) {
            s<Integer> sVar = s.f1382c;
            if (a2 == sVar) {
                dimension = typedValue.resourceId;
                if (dimension == 0) {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + a2.c() + ". Must be a reference to a resource.");
                    }
                    obj = 0;
                }
                obj = Integer.valueOf(dimension);
            } else {
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    if (a2 != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + a2.c() + ". You must use a \"" + sVar.c() + "\" type to reference other resources.");
                    }
                    a2 = sVar;
                    obj = Integer.valueOf(i3);
                } else if (a2 == s.k) {
                    obj = typedArray.getString(i2);
                } else {
                    int i4 = typedValue.type;
                    if (i4 == 3) {
                        String charSequence = typedValue.string.toString();
                        if (a2 == null) {
                            a2 = s.d(charSequence);
                        }
                        obj = a2.h(charSequence);
                    } else if (i4 != 4) {
                        if (i4 == 5) {
                            a2 = a(typedValue, a2, s.f1381b, string, "dimension");
                            dimension = (int) typedValue.getDimension(resources.getDisplayMetrics());
                        } else if (i4 == 18) {
                            a2 = a(typedValue, a2, s.i, string, "boolean");
                            if (typedValue.data != 0) {
                                z = true;
                            }
                            obj = Boolean.valueOf(z);
                        } else if (i4 < 16 || i4 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        } else {
                            a2 = a(typedValue, a2, s.f1381b, string, "integer");
                            dimension = typedValue.data;
                        }
                        obj = Integer.valueOf(dimension);
                    } else {
                        a2 = a(typedValue, a2, s.f1386g, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    }
                }
            }
        }
        if (obj != null) {
            aVar.b(obj);
        }
        if (a2 != null) {
            aVar.d(a2);
        }
        return aVar.a();
    }

    private void f(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.y.a.k);
        String string = obtainAttributes.getString(androidx.navigation.y.a.l);
        if (string != null) {
            e e2 = e(obtainAttributes, resources, i);
            if (e2.c()) {
                e2.e(string, bundle);
            }
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private void g(Resources resources, l lVar, AttributeSet attributeSet, int i) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.y.a.k);
        String string = obtainAttributes.getString(androidx.navigation.y.a.l);
        if (string != null) {
            lVar.a(string, e(obtainAttributes, resources, i));
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private void h(Resources resources, l lVar, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.y.a.p);
        String string = obtainAttributes.getString(androidx.navigation.y.a.s);
        String string2 = obtainAttributes.getString(androidx.navigation.y.a.q);
        String string3 = obtainAttributes.getString(androidx.navigation.y.a.r);
        if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3)) {
            i.a aVar = new i.a();
            if (string != null) {
                aVar.d(string.replace("${applicationId}", this.f1365a.getPackageName()));
            }
            if (!TextUtils.isEmpty(string2)) {
                aVar.b(string2.replace("${applicationId}", this.f1365a.getPackageName()));
            }
            if (string3 != null) {
                aVar.c(string3.replace("${applicationId}", this.f1365a.getPackageName()));
            }
            lVar.b(aVar.a());
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
    }

    @SuppressLint({"ResourceType"})
    public n c(int i) {
        int next;
        Resources resources = this.f1365a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        while (true) {
            try {
                try {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e2);
                }
            } finally {
                xml.close();
            }
        }
        if (next == 2) {
            String name = xml.getName();
            l b2 = b(resources, xml, asAttributeSet, i);
            if (b2 instanceof n) {
                return (n) b2;
            }
            throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
        }
        throw new XmlPullParserException("No start tag found");
    }
}
