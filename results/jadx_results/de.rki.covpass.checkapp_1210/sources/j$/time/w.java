package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements TemporalQuery {

    /* renamed from: a */
    public static final /* synthetic */ w f13203a = new w();

    private /* synthetic */ w() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return YearMonth.o(temporalAccessor);
    }
}
