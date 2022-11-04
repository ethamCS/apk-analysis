package j$.util.function;

import java.util.Objects;
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f13373a;

    /* renamed from: b */
    public final /* synthetic */ Function f13374b;

    /* renamed from: c */
    public final /* synthetic */ Function f13375c;

    public /* synthetic */ k(Function function, Function function2, int i10) {
        this.f13373a = i10;
        this.f13374b = function;
        this.f13375c = function2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f13373a) {
            case 0:
                return Objects.requireNonNull(function);
            default:
                return Objects.requireNonNull(function);
        }
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f13373a) {
            case 0:
                return this.f13375c.apply(this.f13374b.apply(obj));
            default:
                return this.f13374b.apply(this.f13375c.apply(obj));
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.f13373a) {
            case 0:
                return Objects.requireNonNull(function);
            default:
                return Objects.requireNonNull(function);
        }
    }
}
