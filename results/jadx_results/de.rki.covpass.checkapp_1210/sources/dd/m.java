package dd;
/* loaded from: classes.dex */
public final class m extends f implements nd.h {

    /* renamed from: c */
    private final Class<?> f8508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wd.f fVar, Class<?> cls) {
        super(fVar, null);
        hc.t.e(cls, "klass");
        this.f8508c = cls;
    }

    @Override // nd.h
    public nd.x e() {
        return z.f8521a.a(this.f8508c);
    }
}
