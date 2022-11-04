package j$.time.temporal;

import j$.time.ZoneId;
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ q f13176a = new q();

    private /* synthetic */ q() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i10 = k.f13171a;
        ZoneId zoneId = (ZoneId) temporalAccessor.k(m.f13172a);
        return zoneId != null ? zoneId : (ZoneId) temporalAccessor.k(p.f13175a);
    }
}
