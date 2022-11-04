package u4;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.introspect.AnnotatedAndMetadata;
import j$.util.function.Predicate;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ a f23130a = new a();

    private /* synthetic */ a() {
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$findStringBasedKeyDeserializer$0;
        lambda$findStringBasedKeyDeserializer$0 = StdKeyDeserializers.lambda$findStringBasedKeyDeserializer$0((AnnotatedAndMetadata) obj);
        return lambda$findStringBasedKeyDeserializer$0;
    }
}
