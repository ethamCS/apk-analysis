package a9;

import hc.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc.g;
import of.b0;
import of.v;
import of.z;
import org.conscrypt.BuildConfig;
import ub.u;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0014"}, d2 = {"La9/a;", "Lof/v;", BuildConfig.FLAVOR, "httpMethod", BuildConfig.FLAVOR, "statusCode", "retries", BuildConfig.FLAVOR, "retryEnabled", "c", "(Ljava/lang/String;Ljava/lang/Integer;IZ)Z", "Lof/z;", "request", "b", "Lof/v$a;", "chain", "Lof/b0;", "a", "<init>", "()V", "covpass-http_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a implements v {
    public static final C0001a Companion = new C0001a(null);

    /* renamed from: a */
    private final List<String> f220a;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"La9/a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "MAX_ATTEMPTS", "I", BuildConfig.FLAVOR, "RETRY_ALLOWED_HEADER", "Ljava/lang/String;", "RETRY_ALLOWED_VALUE", "RETRY_DISABLED_VALUE", "<init>", "()V", "covpass-http_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: a9.a$a */
    /* loaded from: classes.dex */
    public static final class C0001a {
        private C0001a() {
        }

        public /* synthetic */ C0001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a() {
        List<String> k10;
        k10 = u.k("GET", "HEAD", "OPTIONS");
        this.f220a = k10;
    }

    private final boolean b(z zVar) {
        String a10 = zVar.f().a("X-Retry-Allowed-6jNGI0d8vBVJg6X9YwUG");
        return a10 == null || t.a(a10, "allowed");
    }

    private final boolean c(String str, Integer num, int i10, boolean z10) {
        return i10 < 7 && z10 && this.f220a.contains(str) && (num == null || new g(500, 599).i(num.intValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r12v0, types: [a9.a] */
    @Override // of.v
    public b0 a(v.a aVar) {
        b0 a10;
        t.e(aVar, "chain");
        z b10 = aVar.b();
        String h10 = b10.h();
        boolean b11 = b(b10);
        int i10 = 0;
        long j10 = 250;
        if (b10.d("X-Retry-Allowed-6jNGI0d8vBVJg6X9YwUG") != null) {
            b10 = b10.i().g("X-Retry-Allowed-6jNGI0d8vBVJg6X9YwUG").b();
        }
        while (true) {
            i10++;
            try {
                a10 = aVar.a(b10);
            } finally {
            }
            if (c(h10, Integer.valueOf(a10.i()), i10, b11)) {
                a10.close();
                Thread.sleep(j10);
                j10 = Math.min(2 * j10, 5000L);
            } else {
                return a10;
            }
        }
    }
}
