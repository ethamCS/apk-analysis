package z4;

import com.fasterxml.jackson.datatype.jsr310.util.DurationUnitConverter;
import j$.time.Duration;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ a f26455a = new a();

    private /* synthetic */ a() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        Long lambda$static$1;
        lambda$static$1 = DurationUnitConverter.lambda$static$1((Duration) obj);
        return lambda$static$1;
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
