package eb;

import hc.t;
import java.net.ConnectException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Leb/a;", "Ljava/net/ConnectException;", BuildConfig.FLAVOR, "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", BuildConfig.FLAVOR, "message", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a extends ConnectException {

    /* renamed from: c */
    private final Throwable f9545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable th2) {
        super(str);
        t.e(str, "message");
        this.f9545c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f9545c;
    }
}
