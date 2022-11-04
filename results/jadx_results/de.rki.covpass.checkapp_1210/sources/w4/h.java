package w4;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ h f24681a = new h();

    private /* synthetic */ h() {
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Temporal lambda$new$7;
        lambda$new$7 = InstantDeserializer.lambda$new$7((Temporal) obj, (ZoneId) obj2);
        return lambda$new$7;
    }
}
