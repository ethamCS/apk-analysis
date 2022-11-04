package w4;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import j$.time.ZonedDateTime;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ n f24687a = new n();

    private /* synthetic */ n() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        ZonedDateTime lambda$static$5;
        lambda$static$5 = InstantDeserializer.lambda$static$5((InstantDeserializer.FromIntegerArguments) obj);
        return lambda$static$5;
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
