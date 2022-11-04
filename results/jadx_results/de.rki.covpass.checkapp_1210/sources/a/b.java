package a;

import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ b f1a = new b();

    private /* synthetic */ b() {
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        Integer m10;
        m10 = c.m((byte[]) obj);
        return m10;
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
