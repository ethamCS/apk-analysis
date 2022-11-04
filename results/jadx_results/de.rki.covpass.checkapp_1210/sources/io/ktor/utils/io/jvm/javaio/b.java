package io.ktor.utils.io.jvm.javaio;

import hc.t;
import java.io.InputStream;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\b\u0010\u0006\u001a\u00020\u0005H\u0002\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lio/ktor/utils/io/h;", "Lkotlinx/coroutines/a2;", "parent", "Ljava/io/InputStream;", "c", "Ltb/e0;", "b", BuildConfig.FLAVOR, "a", "Ljava/lang/Object;", "CloseToken", "FlushToken", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private static final Object f12929a = new Object();

    /* renamed from: b */
    private static final Object f12930b = new Object();

    public static final void b() {
        if (f.b()) {
            return;
        }
        throw new IllegalStateException("Using blocking primitives on this dispatcher is not allowed. Consider using async channel instead or use blocking primitives in withContext(Dispatchers.IO) instead.".toString());
    }

    public static final InputStream c(io.ktor.utils.io.h hVar, a2 a2Var) {
        t.e(hVar, "<this>");
        return new d(a2Var, hVar);
    }

    public static /* synthetic */ InputStream d(io.ktor.utils.io.h hVar, a2 a2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a2Var = null;
        }
        return c(hVar, a2Var);
    }
}
