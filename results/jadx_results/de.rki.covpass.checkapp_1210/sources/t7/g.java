package t7;

import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: h */
    public static final g f21955h = new g();

    /* renamed from: i */
    public static final g f21956i = new g("ctap2canonical=true");

    /* renamed from: a */
    private final boolean f21957a;

    /* renamed from: b */
    private final boolean f21958b;

    /* renamed from: c */
    private final boolean f21959c;

    /* renamed from: d */
    private final boolean f21960d;

    /* renamed from: e */
    private final boolean f21961e;

    /* renamed from: f */
    private final boolean f21962f;

    /* renamed from: g */
    private final boolean f21963g;

    public g() {
        this(BuildConfig.FLAVOR);
    }

    public g(String str) {
        Objects.requireNonNull(str, "paramString");
        x xVar = new x(str);
        this.f21957a = xVar.a("resolvereferences", false);
        this.f21958b = xVar.a("useindeflengthstrings", false);
        this.f21962f = xVar.a("float64", false);
        this.f21961e = xVar.a("allowduplicatekeys", false);
        this.f21959c = xVar.a("keepkeyorder", false);
        this.f21960d = xVar.a("allowempty", false);
        this.f21963g = xVar.a("ctap2canonical", false);
    }

    public final boolean a() {
        return this.f21961e;
    }

    public final boolean b() {
        return this.f21960d;
    }

    public final boolean c() {
        return this.f21963g;
    }

    public final boolean d() {
        return this.f21962f;
    }

    public final boolean e() {
        return this.f21959c;
    }

    public final boolean f() {
        return this.f21957a;
    }

    public final boolean g() {
        return this.f21958b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("allowduplicatekeys=");
        String str = "true";
        sb2.append(a() ? str : "false");
        sb2.append(";useindeflengthstrings=");
        sb2.append(g() ? str : "false");
        sb2.append(";float64=");
        sb2.append(d() ? str : "false");
        sb2.append(";ctap2canonical=");
        sb2.append(c() ? str : "false");
        sb2.append(";keepkeyorder=");
        sb2.append(e() ? str : "false");
        sb2.append(";resolvereferences=");
        sb2.append(f() ? str : "false");
        sb2.append(";allowempty=");
        if (!b()) {
            str = "false";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
