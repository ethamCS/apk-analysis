package bb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, d2 = {"Lbb/v;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "name", "major", "minor", "<init>", "(Ljava/lang/String;II)V", "a", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class v {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final v f5930d = new v("HTTP", 2, 0);

    /* renamed from: e */
    private static final v f5931e = new v("HTTP", 1, 1);

    /* renamed from: f */
    private static final v f5932f = new v("HTTP", 1, 0);

    /* renamed from: g */
    private static final v f5933g = new v("SPDY", 3, 0);

    /* renamed from: h */
    private static final v f5934h = new v("QUIC", 1, 0);

    /* renamed from: a */
    private final String f5935a;

    /* renamed from: b */
    private final int f5936b;

    /* renamed from: c */
    private final int f5937c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, d2 = {"Lbb/v$a;", BuildConfig.FLAVOR, "Lbb/v;", "HTTP_2_0", "Lbb/v;", "c", "()Lbb/v;", "HTTP_1_1", "b", "HTTP_1_0", "a", "SPDY_3", "e", "QUIC", "d", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a() {
            return v.f5932f;
        }

        public final v b() {
            return v.f5931e;
        }

        public final v c() {
            return v.f5930d;
        }

        public final v d() {
            return v.f5934h;
        }

        public final v e() {
            return v.f5933g;
        }
    }

    public v(String str, int i10, int i11) {
        hc.t.e(str, "name");
        this.f5935a = str;
        this.f5936b = i10;
        this.f5937c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return hc.t.a(this.f5935a, vVar.f5935a) && this.f5936b == vVar.f5936b && this.f5937c == vVar.f5937c;
    }

    public int hashCode() {
        return (((this.f5935a.hashCode() * 31) + this.f5936b) * 31) + this.f5937c;
    }

    public String toString() {
        return this.f5935a + '/' + this.f5936b + '.' + this.f5937c;
    }
}
