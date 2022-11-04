package bb;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lbb/l0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "name", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "defaultPort", "I", "d", "()I", "<init>", "(Ljava/lang/String;I)V", "a", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class l0 {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final l0 f5845c;

    /* renamed from: d */
    private static final l0 f5846d;

    /* renamed from: e */
    private static final l0 f5847e;

    /* renamed from: f */
    private static final l0 f5848f;

    /* renamed from: g */
    private static final l0 f5849g;

    /* renamed from: h */
    private static final Map<String, l0> f5850h;

    /* renamed from: a */
    private final String f5851a;

    /* renamed from: b */
    private final int f5852b;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lbb/l0$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", "Lbb/l0;", "a", "HTTP", "Lbb/l0;", "c", "()Lbb/l0;", "HTTPS", "d", BuildConfig.FLAVOR, "byName", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l0 a(String str) {
            hc.t.e(str, "name");
            String c10 = fb.a0.c(str);
            l0 l0Var = l0.Companion.b().get(c10);
            return l0Var == null ? new l0(c10, 0) : l0Var;
        }

        public final Map<String, l0> b() {
            return l0.f5850h;
        }

        public final l0 c() {
            return l0.f5845c;
        }

        public final l0 d() {
            return l0.f5846d;
        }
    }

    static {
        List k10;
        int s10;
        int d10;
        int b10;
        l0 l0Var = new l0("http", 80);
        f5845c = l0Var;
        l0 l0Var2 = new l0("https", 443);
        f5846d = l0Var2;
        l0 l0Var3 = new l0("ws", 80);
        f5847e = l0Var3;
        l0 l0Var4 = new l0("wss", 443);
        f5848f = l0Var4;
        l0 l0Var5 = new l0("socks", 1080);
        f5849g = l0Var5;
        k10 = ub.u.k(l0Var, l0Var2, l0Var3, l0Var4, l0Var5);
        s10 = ub.v.s(k10, 10);
        d10 = ub.p0.d(s10);
        b10 = nc.m.b(d10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
        for (Object obj : k10) {
            linkedHashMap.put(((l0) obj).e(), obj);
        }
        f5850h = linkedHashMap;
    }

    public l0(String str, int i10) {
        hc.t.e(str, "name");
        this.f5851a = str;
        this.f5852b = i10;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= str.length()) {
                z10 = true;
                break;
            }
            char charAt = str.charAt(i11);
            i11++;
            if (!fb.j.a(charAt)) {
                break;
            }
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("All characters should be lower case".toString());
    }

    public final int d() {
        return this.f5852b;
    }

    public final String e() {
        return this.f5851a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return hc.t.a(this.f5851a, l0Var.f5851a) && this.f5852b == l0Var.f5852b;
    }

    public int hashCode() {
        return (this.f5851a.hashCode() * 31) + this.f5852b;
    }

    public String toString() {
        return "URLProtocol(name=" + this.f5851a + ", defaultPort=" + this.f5852b + ')';
    }
}
