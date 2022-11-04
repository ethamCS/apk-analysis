package oa;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0014X\u0094D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Loa/f;", "Loa/b;", "Lio/ktor/utils/io/h;", "i", "(Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "allowDoubleReceive", "Z", "c", "()Z", "Lna/a;", "client", BuildConfig.FLAVOR, "responseBody", "<init>", "(Lna/a;[B)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f extends b {
    private final byte[] W3;
    private final boolean X3 = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(na.a aVar, byte[] bArr) {
        super(aVar);
        t.e(aVar, "client");
        t.e(bArr, "responseBody");
        this.W3 = bArr;
    }

    @Override // oa.b
    protected boolean c() {
        return this.X3;
    }

    @Override // oa.b
    protected Object i(xb.d<? super io.ktor.utils.io.h> dVar) {
        return io.ktor.utils.io.d.a(this.W3);
    }
}
