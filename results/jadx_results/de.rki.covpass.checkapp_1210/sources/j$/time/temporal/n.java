package j$.time.temporal;
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ n f13173a = new n();

    private /* synthetic */ n() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i10 = k.f13171a;
        return (j$.time.chrono.e) temporalAccessor.k(f13173a);
    }
}
