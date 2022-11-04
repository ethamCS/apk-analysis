package j$.util.function;

import j$.util.function.Predicate;
import java.util.Objects;
/* loaded from: classes2.dex */
public final /* synthetic */ class G implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f13360a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f13361b;

    /* renamed from: c */
    public final /* synthetic */ Predicate f13362c;

    public /* synthetic */ G(Predicate predicate, Predicate predicate2, int i10) {
        this.f13360a = i10;
        this.f13361b = predicate;
        this.f13362c = predicate2;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f13360a) {
            case 0:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f13360a) {
            case 0:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f13360a) {
            case 0:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f13360a) {
            case 0:
                return this.f13361b.test(obj) && this.f13362c.test(obj);
            default:
                return this.f13361b.test(obj) || this.f13362c.test(obj);
        }
    }
}
