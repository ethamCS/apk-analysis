package a;

import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ a f0a = new a();

    private /* synthetic */ a() {
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Integer.valueOf(((Integer) obj).intValue() + ((Integer) obj2).intValue());
    }
}
