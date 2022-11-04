package w4;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ f f24679a = new f();

    private /* synthetic */ f() {
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        OffsetDateTime lambda$static$4;
        lambda$static$4 = InstantDeserializer.lambda$static$4((OffsetDateTime) obj, (ZoneId) obj2);
        return lambda$static$4;
    }
}
