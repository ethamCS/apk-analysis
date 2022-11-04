package oa;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Loa/a;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", BuildConfig.FLAVOR, "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Loa/b;", "call", "<init>", "(Loa/b;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a extends IllegalStateException {

    /* renamed from: c */
    private final String f17715c;

    public a(b bVar) {
        t.e(bVar, "call");
        this.f17715c = t.l("Response already received: ", bVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f17715c;
    }
}
