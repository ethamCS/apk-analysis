package dd;
/* loaded from: classes.dex */
public final class s extends f implements nd.o {

    /* renamed from: c */
    private final Object f8514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(wd.f fVar, Object obj) {
        super(fVar, null);
        hc.t.e(obj, "value");
        this.f8514c = obj;
    }

    @Override // nd.o
    public Object getValue() {
        return this.f8514c;
    }
}
