package gd;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a */
    public static final z f10768a = new z();

    /* renamed from: b */
    public static final wd.c f10769b;

    /* renamed from: c */
    public static final wd.b f10770c;

    /* renamed from: d */
    private static final wd.b f10771d;

    /* renamed from: e */
    private static final wd.b f10772e;

    static {
        wd.c cVar = new wd.c("kotlin.jvm.JvmField");
        f10769b = cVar;
        wd.b m10 = wd.b.m(cVar);
        hc.t.d(m10, "topLevel(JVM_FIELD_ANNOTATION_FQ_NAME)");
        f10770c = m10;
        wd.b m11 = wd.b.m(new wd.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        hc.t.d(m11, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        f10771d = m11;
        wd.b e10 = wd.b.e("kotlin/jvm/internal/RepeatableContainer");
        hc.t.d(e10, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        f10772e = e10;
    }

    private z() {
    }

    @fc.c
    public static final String b(String str) {
        hc.t.e(str, "propertyName");
        if (f(str)) {
            return str;
        }
        return "get" + we.a.a(str);
    }

    @fc.c
    public static final boolean c(String str) {
        boolean I;
        boolean I2;
        hc.t.e(str, "name");
        I = bf.x.I(str, "get", false, 2, null);
        if (!I) {
            I2 = bf.x.I(str, "is", false, 2, null);
            if (!I2) {
                return false;
            }
        }
        return true;
    }

    @fc.c
    public static final boolean d(String str) {
        boolean I;
        hc.t.e(str, "name");
        I = bf.x.I(str, "set", false, 2, null);
        return I;
    }

    @fc.c
    public static final String e(String str) {
        String str2;
        hc.t.e(str, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(str)) {
            str2 = str.substring(2);
            hc.t.d(str2, "this as java.lang.String).substring(startIndex)");
        } else {
            str2 = we.a.a(str);
        }
        sb2.append(str2);
        return sb2.toString();
    }

    @fc.c
    public static final boolean f(String str) {
        boolean I;
        hc.t.e(str, "name");
        I = bf.x.I(str, "is", false, 2, null);
        if (I && str.length() != 2) {
            char charAt = str.charAt(2);
            return hc.t.f(97, charAt) > 0 || hc.t.f(charAt, 122) > 0;
        }
        return false;
    }

    public final wd.b a() {
        return f10772e;
    }
}
