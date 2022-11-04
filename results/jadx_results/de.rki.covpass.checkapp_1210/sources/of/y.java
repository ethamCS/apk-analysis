package of;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lof/y;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", "protocol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public enum y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final String f18380c;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lof/y$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "protocol", "Lof/y;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final y a(String str) {
            hc.t.e(str, "protocol");
            y yVar = y.HTTP_1_0;
            if (!hc.t.a(str, yVar.f18380c)) {
                yVar = y.HTTP_1_1;
                if (!hc.t.a(str, yVar.f18380c)) {
                    yVar = y.H2_PRIOR_KNOWLEDGE;
                    if (!hc.t.a(str, yVar.f18380c)) {
                        yVar = y.HTTP_2;
                        if (!hc.t.a(str, yVar.f18380c)) {
                            yVar = y.SPDY_3;
                            if (!hc.t.a(str, yVar.f18380c)) {
                                yVar = y.QUIC;
                                if (!hc.t.a(str, yVar.f18380c)) {
                                    throw new IOException(hc.t.l("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return yVar;
        }
    }

    y(String str) {
        this.f18380c = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f18380c;
    }
}
