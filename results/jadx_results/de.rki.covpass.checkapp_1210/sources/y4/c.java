package y4;

import j$.time.Instant;
import j$.util.function.ToLongFunction;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ToLongFunction {

    /* renamed from: a */
    public static final /* synthetic */ c f25798a = new c();

    private /* synthetic */ c() {
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Instant) obj).toEpochMilli();
    }
}
