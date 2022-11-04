package w4;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import j$.time.Instant;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ m f24686a = new m();

    private /* synthetic */ m() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        Instant lambda$static$0;
        lambda$static$0 = InstantDeserializer.lambda$static$0((InstantDeserializer.FromIntegerArguments) obj);
        return lambda$static$0;
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
