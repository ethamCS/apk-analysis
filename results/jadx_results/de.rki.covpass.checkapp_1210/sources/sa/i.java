package sa;

import eg.n;
import hc.t;
import kotlin.Metadata;
import of.a0;
import of.w;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"Lsa/i;", "Lof/a0;", "Lof/w;", "b", "Leg/d;", "sink", "Ltb/e0;", "e", BuildConfig.FLAVOR, "a", "contentLength", "Lkotlin/Function0;", "Lio/ktor/utils/io/h;", "block", "<init>", "(Ljava/lang/Long;Lgc/a;)V", "ktor-client-okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i extends a0 {

    /* renamed from: a */
    private final Long f21608a;

    /* renamed from: b */
    private final gc.a<io.ktor.utils.io.h> f21609b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Long l10, gc.a<? extends io.ktor.utils.io.h> aVar) {
        t.e(aVar, "block");
        this.f21608a = l10;
        this.f21609b = aVar;
    }

    @Override // of.a0
    public long a() {
        Long l10 = this.f21608a;
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // of.a0
    public w b() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Object, kotlinx.coroutines.a2] */
    @Override // of.a0
    public void e(eg.d dVar) {
        t.e(dVar, "sink");
        th = 0;
        try {
            dVar.G0(n.k(io.ktor.utils.io.jvm.javaio.b.d(this.f21609b.invoke(), th, 1, th)));
        } finally {
        }
    }
}
