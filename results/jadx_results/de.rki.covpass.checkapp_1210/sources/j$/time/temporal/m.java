package j$.time.temporal;

import j$.time.ZoneId;
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ m f13172a = new m();

    private /* synthetic */ m() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i10 = k.f13171a;
        return (ZoneId) temporalAccessor.k(f13172a);
    }
}
