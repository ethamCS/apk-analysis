package androidx.core.util;

import androidx.core.util.Predicate;
import java.util.Objects;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Predicate$$ExternalSyntheticLambda5 implements Predicate {
    public static final /* synthetic */ Predicate$$ExternalSyntheticLambda5 INSTANCE = new Predicate$$ExternalSyntheticLambda5();

    private /* synthetic */ Predicate$$ExternalSyntheticLambda5() {
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean m;
        m = Predicate$$ExternalSyntheticBackport0.m(obj);
        return m;
    }
}
