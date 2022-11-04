package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ u f13200a = new u();

    private /* synthetic */ u() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Year.o(temporalAccessor);
    }
}
