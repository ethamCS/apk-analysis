package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ k f13140a = new k();

    private /* synthetic */ k() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return LocalTime.q(temporalAccessor);
    }
}
