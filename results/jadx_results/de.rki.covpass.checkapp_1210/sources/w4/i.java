package w4;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import j$.time.Instant;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ i f24682a = new i();

    private /* synthetic */ i() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        Instant lambda$static$1;
        lambda$static$1 = InstantDeserializer.lambda$static$1((InstantDeserializer.FromDecimalArguments) obj);
        return lambda$static$1;
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
