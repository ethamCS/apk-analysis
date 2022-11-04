package dd;
/* loaded from: classes.dex */
public final class q extends f implements nd.m {

    /* renamed from: c */
    private final Enum<?> f8512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(wd.f fVar, Enum<?> r32) {
        super(fVar, null);
        hc.t.e(r32, "value");
        this.f8512c = r32;
    }

    @Override // nd.m
    public wd.f a() {
        return wd.f.j(this.f8512c.name());
    }

    @Override // nd.m
    public wd.b d() {
        Class<?> cls = this.f8512c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        hc.t.d(cls, "enumClass");
        return d.a(cls);
    }
}
