package w4;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import j$.time.ZonedDateTime;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ j f24683a = new j();

    private /* synthetic */ j() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        ZonedDateTime lambda$static$6;
        lambda$static$6 = InstantDeserializer.lambda$static$6((InstantDeserializer.FromDecimalArguments) obj);
        return lambda$static$6;
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
