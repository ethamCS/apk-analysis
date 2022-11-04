package bb;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lbb/u;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "value", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "a", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class u {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static final u f5921b;

    /* renamed from: c */
    private static final u f5922c;

    /* renamed from: d */
    private static final u f5923d;

    /* renamed from: e */
    private static final u f5924e;

    /* renamed from: f */
    private static final u f5925f;

    /* renamed from: g */
    private static final u f5926g;

    /* renamed from: h */
    private static final u f5927h;

    /* renamed from: i */
    private static final List<u> f5928i;

    /* renamed from: a */
    private final String f5929a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lbb/u$a;", BuildConfig.FLAVOR, "Lbb/u;", "Get", "Lbb/u;", "a", "()Lbb/u;", "Head", "b", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a() {
            return u.f5921b;
        }

        public final u b() {
            return u.f5926g;
        }
    }

    static {
        List<u> k10;
        u uVar = new u("GET");
        f5921b = uVar;
        u uVar2 = new u("POST");
        f5922c = uVar2;
        u uVar3 = new u("PUT");
        f5923d = uVar3;
        u uVar4 = new u("PATCH");
        f5924e = uVar4;
        u uVar5 = new u("DELETE");
        f5925f = uVar5;
        u uVar6 = new u("HEAD");
        f5926g = uVar6;
        u uVar7 = new u("OPTIONS");
        f5927h = uVar7;
        k10 = ub.u.k(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7);
        f5928i = k10;
    }

    public u(String str) {
        hc.t.e(str, "value");
        this.f5929a = str;
    }

    public final String c() {
        return this.f5929a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && hc.t.a(this.f5929a, ((u) obj).f5929a);
    }

    public int hashCode() {
        return this.f5929a.hashCode();
    }

    public String toString() {
        return "HttpMethod(value=" + this.f5929a + ')';
    }
}
