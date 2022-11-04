package w4;

import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ e f24678a = new e();

    private /* synthetic */ e() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        return ZonedDateTime.from((TemporalAccessor) obj);
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
