package w4;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import j$.time.OffsetDateTime;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ k f24684a = new k();

    private /* synthetic */ k() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        OffsetDateTime lambda$static$3;
        lambda$static$3 = InstantDeserializer.lambda$static$3((InstantDeserializer.FromDecimalArguments) obj);
        return lambda$static$3;
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
