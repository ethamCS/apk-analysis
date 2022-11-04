package w4;

import j$.time.Duration;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ a f24673a = new a();

    private /* synthetic */ a() {
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Duration.ofSeconds(((Long) obj).longValue(), ((Integer) obj2).intValue());
    }
}
