package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ s f13150a = new s();

    private /* synthetic */ s() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return OffsetTime.o(temporalAccessor);
    }
}
