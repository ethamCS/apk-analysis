package t7;

import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: h */
    public static final w f22006h = new w();

    /* renamed from: a */
    private final boolean f22007a;

    /* renamed from: b */
    private final boolean f22008b;

    /* renamed from: c */
    private final a f22009c;

    /* renamed from: d */
    private final boolean f22010d;

    /* renamed from: e */
    private final boolean f22011e;

    /* renamed from: f */
    private final boolean f22012f;

    /* renamed from: g */
    private final boolean f22013g;

    /* loaded from: classes.dex */
    public enum a {
        Full,
        Double,
        IntOrFloat,
        IntOrFloatFromDouble,
        Decimal128
    }

    public w() {
        this(BuildConfig.FLAVOR);
    }

    public w(String str) {
        Objects.requireNonNull(str, "paramString");
        x xVar = new x(str);
        this.f22008b = xVar.a("preservenegativezero", true);
        this.f22012f = xVar.a("allowduplicatekeys", false);
        this.f22011e = xVar.a("keepkeyorder", false);
        this.f22007a = xVar.a("base64padding", true);
        this.f22013g = xVar.a("replacesurrogates", false);
        this.f22009c = b(xVar.b("numberconversion", null));
        this.f22010d = xVar.a("writebasic", false);
    }

    private String a() {
        a f10 = f();
        return f10 == a.Full ? "full" : f10 == a.Double ? "double" : f10 == a.Decimal128 ? "decimal128" : f10 == a.IntOrFloat ? "intorfloat" : f10 == a.IntOrFloatFromDouble ? "intorfloatfromdouble" : "full";
    }

    private static a b(String str) {
        if (str != null && !str.equals("full")) {
            if (str.equals("double")) {
                return a.Double;
            }
            if (str.equals("decimal128")) {
                return a.Decimal128;
            }
            if (str.equals("intorfloat")) {
                return a.IntOrFloat;
            }
            if (!str.equals("intorfloatfromdouble")) {
                throw new IllegalArgumentException("Unrecognized conversion mode");
            }
            return a.IntOrFloatFromDouble;
        }
        return a.Full;
    }

    public final boolean c() {
        return this.f22012f;
    }

    @Deprecated
    public final boolean d() {
        return this.f22007a;
    }

    public final boolean e() {
        return this.f22011e;
    }

    public final a f() {
        return this.f22009c;
    }

    public final boolean g() {
        return this.f22008b;
    }

    public final boolean h() {
        return this.f22013g;
    }

    public final boolean i() {
        return this.f22010d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("base64padding=");
        String str = "true";
        sb2.append(d() ? str : "false");
        sb2.append(";replacesurrogates=");
        sb2.append(h() ? str : "false");
        sb2.append(";preservenegativezero=");
        sb2.append(g() ? str : "false");
        sb2.append(";keepkeyorder=");
        sb2.append(e() ? str : "false");
        sb2.append(";numberconversion=");
        sb2.append(a());
        sb2.append(";allowduplicatekeys=");
        sb2.append(c() ? str : "false");
        sb2.append(";writebasic=");
        if (!i()) {
            str = "false";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
