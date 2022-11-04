package xc;

import java.util.List;
import se.k;
/* loaded from: classes.dex */
public final class z<Type extends se.k> extends h1<Type> {

    /* renamed from: a */
    private final wd.f f25604a;

    /* renamed from: b */
    private final Type f25605b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(wd.f fVar, Type type) {
        super(null);
        hc.t.e(fVar, "underlyingPropertyName");
        hc.t.e(type, "underlyingType");
        this.f25604a = fVar;
        this.f25605b = type;
    }

    @Override // xc.h1
    public List<tb.r<wd.f, Type>> a() {
        List<tb.r<wd.f, Type>> d10;
        d10 = ub.t.d(tb.x.a(this.f25604a, this.f25605b));
        return d10;
    }

    public final wd.f c() {
        return this.f25604a;
    }

    public final Type d() {
        return this.f25605b;
    }
}
