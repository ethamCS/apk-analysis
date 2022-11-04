package xc;

import java.util.List;
import java.util.Map;
import se.k;
/* loaded from: classes.dex */
public final class i0<Type extends se.k> extends h1<Type> {

    /* renamed from: a */
    private final List<tb.r<wd.f, Type>> f25545a;

    /* renamed from: b */
    private final Map<wd.f, Type> f25546b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(List<? extends tb.r<wd.f, ? extends Type>> list) {
        super(null);
        Map<wd.f, Type> q10;
        hc.t.e(list, "underlyingPropertyNamesToTypes");
        this.f25545a = list;
        q10 = ub.q0.q(a());
        if (q10.size() == a().size()) {
            this.f25546b = q10;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    @Override // xc.h1
    public List<tb.r<wd.f, Type>> a() {
        return this.f25545a;
    }
}
