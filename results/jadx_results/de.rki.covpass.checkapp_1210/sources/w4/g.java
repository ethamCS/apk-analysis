package w4;

import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ g f24680a = new g();

    private /* synthetic */ g() {
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((ZonedDateTime) obj).withZoneSameInstant((ZoneId) obj2);
    }
}
