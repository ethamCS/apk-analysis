package y4;

import j$.time.ZonedDateTime;
import j$.util.function.ToLongFunction;
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements ToLongFunction {

    /* renamed from: a */
    public static final /* synthetic */ i f25804a = new i();

    private /* synthetic */ i() {
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((ZonedDateTime) obj).toEpochSecond();
    }
}
