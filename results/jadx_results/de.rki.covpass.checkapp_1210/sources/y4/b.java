package y4;

import j$.time.Instant;
import j$.util.function.ToLongFunction;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ToLongFunction {

    /* renamed from: a */
    public static final /* synthetic */ b f25797a = new b();

    private /* synthetic */ b() {
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Instant) obj).getEpochSecond();
    }
}
