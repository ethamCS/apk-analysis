package y4;

import j$.time.OffsetDateTime;
import j$.util.function.ToLongFunction;
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements ToLongFunction {

    /* renamed from: a */
    public static final /* synthetic */ e f25800a = new e();

    private /* synthetic */ e() {
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((OffsetDateTime) obj).toEpochSecond();
    }
}
