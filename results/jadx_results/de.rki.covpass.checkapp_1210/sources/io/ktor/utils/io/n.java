package io.ktor.utils.io;

import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/n;", BuildConfig.FLAVOR, "Lio/ktor/utils/io/u;", "Lkotlinx/coroutines/q0;", "Lio/ktor/utils/io/c;", "c", "Lio/ktor/utils/io/c;", "a", "()Lio/ktor/utils/io/c;", "channel", "Lxb/g;", "h", "()Lxb/g;", "coroutineContext", "delegate", "<init>", "(Lkotlinx/coroutines/q0;Lio/ktor/utils/io/c;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class n implements q0, u {

    /* renamed from: c */
    private final c f12948c;

    /* renamed from: d */
    private final /* synthetic */ q0 f12949d;

    public n(q0 q0Var, c cVar) {
        hc.t.e(q0Var, "delegate");
        hc.t.e(cVar, "channel");
        this.f12948c = cVar;
        this.f12949d = q0Var;
    }

    /* renamed from: a */
    public c e() {
        return this.f12948c;
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.f12949d.h();
    }
}
