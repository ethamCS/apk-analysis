package io.ktor.utils.io.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/internal/d;", BuildConfig.FLAVOR, "Ltb/e0;", "a", "()V", "Lio/ktor/utils/io/a;", "Lio/ktor/utils/io/a;", "c", "()Lio/ktor/utils/io/a;", "delegatedTo", BuildConfig.FLAVOR, "b", "Z", "()Z", "delegateClose", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12878c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_closeWaitJob");
    private volatile /* synthetic */ Object _closeWaitJob;

    /* renamed from: a */
    private final io.ktor.utils.io.a f12879a;

    /* renamed from: b */
    private final boolean f12880b;
    private volatile /* synthetic */ int closed;

    public final void a() {
        this.closed = 1;
        a2 a2Var = (a2) f12878c.getAndSet(this, null);
        if (a2Var == null) {
            return;
        }
        a2.a.a(a2Var, null, 1, null);
    }

    public final boolean b() {
        return this.f12880b;
    }

    public final io.ktor.utils.io.a c() {
        return this.f12879a;
    }
}
