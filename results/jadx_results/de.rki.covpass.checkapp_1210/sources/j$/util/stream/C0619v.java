package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import java.util.Objects;
/* renamed from: j$.util.stream.v */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0619v implements BinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ int f13805a;

    /* renamed from: b */
    public final /* synthetic */ BiConsumer f13806b;

    public /* synthetic */ C0619v(BiConsumer biConsumer, int i10) {
        this.f13805a = i10;
        this.f13806b = biConsumer;
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f13805a) {
            case 0:
                return Objects.requireNonNull(function);
            case 1:
                return Objects.requireNonNull(function);
            default:
                return Objects.requireNonNull(function);
        }
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f13805a) {
            case 0:
                this.f13806b.w(obj, obj2);
                return obj;
            case 1:
                BiConsumer biConsumer = this.f13806b;
                int i10 = AbstractC0571k0.f13713t;
                biConsumer.w(obj, obj2);
                return obj;
            default:
                BiConsumer biConsumer2 = this.f13806b;
                int i11 = AbstractC0608s0.f13780t;
                biConsumer2.w(obj, obj2);
                return obj;
        }
    }
}
