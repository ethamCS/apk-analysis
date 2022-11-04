package w4;

import j$.time.Instant;
import j$.time.temporal.TemporalAccessor;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ c f24676a = new c();

    private /* synthetic */ c() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        return Instant.from((TemporalAccessor) obj);
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
