package bf;

import java.nio.charset.Charset;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbf/d;", BuildConfig.FLAVOR, "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    public static final d f5985a = new d();

    /* renamed from: b */
    public static final Charset f5986b;

    /* renamed from: c */
    public static final Charset f5987c;

    /* renamed from: d */
    public static final Charset f5988d;

    /* renamed from: e */
    public static final Charset f5989e;

    /* renamed from: f */
    public static final Charset f5990f;

    /* renamed from: g */
    public static final Charset f5991g;

    static {
        Charset forName = Charset.forName("UTF-8");
        hc.t.d(forName, "forName(\"UTF-8\")");
        f5986b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        hc.t.d(forName2, "forName(\"UTF-16\")");
        f5987c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        hc.t.d(forName3, "forName(\"UTF-16BE\")");
        f5988d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        hc.t.d(forName4, "forName(\"UTF-16LE\")");
        f5989e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        hc.t.d(forName5, "forName(\"US-ASCII\")");
        f5990f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        hc.t.d(forName6, "forName(\"ISO-8859-1\")");
        f5991g = forName6;
    }

    private d() {
    }
}
