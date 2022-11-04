package io.ktor.utils.io.jvm.javaio;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0001\"\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {BuildConfig.FLAVOR, "b", "Ljava/lang/ThreadLocal;", "Lio/ktor/utils/io/jvm/javaio/e;", "Ljava/lang/Thread;", "a", "Ljava/lang/ThreadLocal;", "parkingImplLocal", "()Lio/ktor/utils/io/jvm/javaio/e;", "parkingImpl", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static final ThreadLocal<e<Thread>> f12940a = new ThreadLocal<>();

    public static final e<Thread> a() {
        e<Thread> eVar = f12940a.get();
        return eVar == null ? c.f12931a : eVar;
    }

    public static final boolean b() {
        return a() != g.f12941a;
    }
}
