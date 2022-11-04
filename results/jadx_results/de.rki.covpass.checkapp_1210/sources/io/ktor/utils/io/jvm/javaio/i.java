package io.ktor.utils.io.jvm.javaio;

import hc.t;
import kotlin.Metadata;
import kotlinx.coroutines.l0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¨\u0006\r"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/i;", "Lkotlinx/coroutines/l0;", "Lxb/g;", "context", BuildConfig.FLAVOR, "R0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ltb/e0;", "u0", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class i extends l0 {

    /* renamed from: q */
    public static final i f12943q = new i();

    private i() {
    }

    @Override // kotlinx.coroutines.l0
    public boolean R0(xb.g gVar) {
        t.e(gVar, "context");
        return true;
    }

    @Override // kotlinx.coroutines.l0
    public void u0(xb.g gVar, Runnable runnable) {
        t.e(gVar, "context");
        t.e(runnable, "block");
        runnable.run();
    }
}
