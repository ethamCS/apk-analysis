package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ i f13138a = new i();

    private /* synthetic */ i() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return LocalDateTime.q(temporalAccessor);
    }
}
