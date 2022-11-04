package v4;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ a f23908a = new a();

    private /* synthetic */ a() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        return ((AnnotatedMethod) obj).getFullName();
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
