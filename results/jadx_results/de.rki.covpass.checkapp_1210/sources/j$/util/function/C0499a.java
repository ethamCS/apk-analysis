package j$.util.function;

import j$.util.function.Predicate;
import java.util.Comparator;
import java.util.Objects;
/* renamed from: j$.util.function.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0499a implements BinaryOperator, Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f13369a;

    /* renamed from: b */
    public final /* synthetic */ Object f13370b;

    public /* synthetic */ C0499a(Object obj, int i10) {
        this.f13369a = i10;
        this.f13370b = obj;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f13369a) {
            case 0:
                return Objects.requireNonNull(function);
            default:
                return Objects.requireNonNull(function);
        }
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f13369a) {
            case 0:
                return ((Comparator) this.f13370b).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((Comparator) this.f13370b).compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        return !((Predicate) this.f13370b).test(obj);
    }
}
