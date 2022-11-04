package w4;

import j$.time.OffsetDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ d f24677a = new d();

    private /* synthetic */ d() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        return OffsetDateTime.from((TemporalAccessor) obj);
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
