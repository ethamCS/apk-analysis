package z4;

import com.fasterxml.jackson.datatype.jsr310.util.DurationUnitConverter;
import j$.time.Duration;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ b f26456a = new b();

    private /* synthetic */ b() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        Long lambda$static$0;
        lambda$static$0 = DurationUnitConverter.lambda$static$0((Duration) obj);
        return lambda$static$0;
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
