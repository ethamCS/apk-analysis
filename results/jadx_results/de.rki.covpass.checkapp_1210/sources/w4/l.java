package w4;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import j$.time.OffsetDateTime;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ l f24685a = new l();

    private /* synthetic */ l() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        OffsetDateTime lambda$static$2;
        lambda$static$2 = InstantDeserializer.lambda$static$2((InstantDeserializer.FromIntegerArguments) obj);
        return lambda$static$2;
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
